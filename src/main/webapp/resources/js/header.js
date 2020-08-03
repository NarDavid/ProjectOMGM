$(document).ready(function(){
    $(".sub_menu").hide();
    $(".sidebar_content li").click(function(){
        $("ul",this).slideToggle("fast");
    });
});
$(".dropmenu ol li").hover(function () {
    $(this).find("ul").stop().fadeToggle(300);
});

$(".txt input, .txtboxID input, .txtboxTEL1 input, .txtbox input, .txt_zipCode input").on("focus",function(){
    $(this).addClass("focus");
});

$(".txt input, .txtboxID input, .txtboxTEL1 input, .txtbox input, .txt_zipCode input").on("blur",function(){
    if($(this).val() === "") {
        $(this).removeClass("focus");
    }
});

// 회원가입 버튼
function signUp(event) {
    event.preventDefault();
    document.querySelector('#popup').checked = true;
    document.querySelectorAll('.signup-form div input')
        .forEach((sign) => {
            sign.value = '';
            sign.blur();
            sign.classList.remove('focus');
        });
}

// 로그인 버튼
function login(event) {
    event.preventDefault();
    document.querySelector('#login_popup').checked = true;
}


// 회원가입시 체크 사항
// 아이디 체크
function idCheck(check) {
    const input = document.querySelector('.txtboxID input');
    if(input.value === '') {
        alert('아이디를 입력해주세요!');
        return true;
    }
    const xhr = new XMLHttpRequest();

    xhr.onload = function() {
        if (xhr.status === 200) {
            const object = JSON.parse(xhr.responseText);
            if(0 !== object.point) {
                alert('이미 사용하고 있는 아이디입니다!');
                return true;
            }
            else if(!check) {
                alert('사용할 수 있는 아이디입니다.');
                return false;
            }
        }
    }

    xhr.open('POST', 'idCheck.lo',true);
    xhr.setRequestHeader('Content-type', 'application/json');
    const data = { id: input.value };
    xhr.send(JSON.stringify(data));
}

// 비밀번호 체크
function pwdCheck() {
    const pwd = document.querySelector('#pwd').value;
    const copwd = document.querySelector('#copwd').value;

    if(pwd === copwd) return false;
    else {
        alert('비밀번호가 일치하지 않습니다');
        return true;
    };
}

// 회원가입 체크
function joinCheck(event) {
    if(idCheck(true)) return false;
    else if(pwdCheck()) return false;

    event.preventDefault();

    const form = document.querySelector('.signup-form');
    const phone = form.tel1.value + '-' + form.tel2.value + '-' +  form.tel3.value;
    const data = {
        id: form.id.value,
        pwd: form.pwd.value,
        name: form.name.value,
        phone: phone,
        email: form.email.value,
        zipcode: form.zipCode.value,
        address: form.address.value
    };

    const xhr = new XMLHttpRequest();

    xhr.onload = function() {
        if (xhr.status === 200) {
            const object = JSON.parse(xhr.responseText);
            console.log(object.id);
            document.querySelector('signUp div div').innerHTML =
                `<label for="popup"></label>
            <div style="background-color: #F28888; height: 300px; color: white; text-align: center;">
                <img style="width:300px; margin: 30px auto;" src="resources/img/자산%208.png" alt="">
                <h1 style="margin: 30px;">저희 오묘가묘의 가족이 되신 것을 진심으로 환영합니다!</h1>
                <h1 style="margin: 30px;">로그인 하셔서 반려동물을 위한 다양한 서비스를 경험하세요!</h1>
            </div>
        `;
        }
    }

    xhr.open('POST', 'addMember.lo',true);
    xhr.setRequestHeader('Content-type', 'application/json');
    xhr.send(JSON.stringify(data));
}

// 우편번호 체크
function zipCheck() {
    const width = 380;
    const height = 480;
    return new daum.Postcode({
        width: width,
        height: height,
        oncomplete: function(data) {
            const zipcode = document.querySelector('#sign_zipCode');
            const address = document.querySelector('#sign_address');
            zipcode.classList.add('focus');
            address.classList.add('focus');
            zipcode.value = data.zonecode;
            address.value = data.address;
        },
        theme: {
            bgColor: '#F28888'
        }
    }).open({
        popupName: '우편번호 검색',
        left: (window.screen.width / 2) - (width / 2),
        top: (window.screen.height / 2) - (height / 2)
    });
}

// sns 회원가입 구글로 넘김
function signGoogle() {
    const xhr = new XMLHttpRequest();

    xhr.onload = function() {
        if (xhr.status === 200) {
            const object = JSON.parse(xhr.responseText);
            window.location.href = object.url;
        }
    }

        xhr.open('GET', 'google.lo',true);
        xhr.setRequestHeader('Content-type', 'application/json');
        xhr.send(null);
};

let oauthData;

// sns 아이디로 회원가입 진행
function snsSign(result) {
    oauthData = result;
    document.querySelector('signUp div div').innerHTML =
        `<label for="sns_popup"></label>
                <form action="#" class="sns_signup-form" onsubmit="return snsSignCheck(event, oauthData)">
                    <h1 style="font-weight: 700;">Google 회원가입</h1>
                    <div class="txtboxID">
                       <input name="id" type="text" required autocomplete=off>
                       <span data-placeholder="ID"></span>
                   </div>
                   <input type="button" class="checkbtn" value="check" onclick="idCheck(false)">
                    <div class="txtboxTEL1">
                        <input name="tel1"  type="tel" pattern="0[0-9]{2}" required autocomplete=off>
                        <span data-placeholder="Tel"></span><a>ㅡ</a>
                    </div>
                    <div class="txtboxTEL2">
                        <input name="tel2"  type="tel" pattern="[0-9]{4}" required autocomplete=off><a>ㅡ</a>
                        <span data-placeholder="Tel2"></span>
                    </div>
                    <div class="txtboxTEL3">
                        <input name="tel3"  type="tel" pattern="[0-9]{4}" required autocomplete=off>
                        <span data-placeholder="Tel3"></span>
                    </div>
                    <div class="txt_zipCode">
                        <input id="sign_zipCode" name="zipCode"  type="number" required autocomplete=off>
                        <span data-placeholder="ZipCode"></span>
                    </div>
                    <input type="button" class="searchbtn" value="search" onclick="zipCheck()">
                    <div class="txt">
                        <input id="sign_address"  name="address"  type="text" required autocomplete=off>
                        <span data-placeholder="Address"></span>
                    </div>
                    <input type="submit" class="signup" value="Sign UP">
               </form>
                `;
    document.querySelector('#popup').checked = true;
    $(".txt input, .txtboxID input, .txtboxTEL1 input, .txtbox input, .txt_zipCode input").on("focus",function(){
        $(this).addClass("focus");
    });

    $(".txt input, .txtboxID input, .txtboxTEL1 input, .txtbox input, .txt_zipCode input").on("blur",function(){
        if($(this).val() === "") {
            $(this).removeClass("focus");
        }
    });
};

// sns 아이디로 가입
function snsSignCheck(event, result) {
    if(idCheck(true)) return false;

    event.preventDefault();

    const form = document.querySelector('.sns_signup-form');
    const phone = form.tel1.value + '-' + form.tel2.value + '-' +  form.tel3.value;
    const data = {
        id: form.id.value,
        pwd: '#$%&*%#@',
        name: result.name,
        phone: phone,
        email: result.email,
        zipcode: form.zipCode.value,
        address: form.address.value,
        code: result.code,
        type: '구글'
    };

    const xhr = new XMLHttpRequest();

    xhr.onload = function() {
        if (xhr.status === 200) {
            const object = JSON.parse(xhr.responseText);
            console.log(object.id);
            document.querySelector('signUp div div').innerHTML =
                `<label for="popup"></label>
            <div style="background-color: #F28888; height: 300px; color: white; text-align: center;">
                <img style="width:300px; margin: 30px auto;" src="resources/img/자산%208.png" alt="">
                <h1 style="margin: 30px;">저희 오묘가묘의 가족이 되신 것을 진심으로 환영합니다!</h1>
                <h1 style="margin: 30px;">로그인 하셔서 반려동물을 위한 다양한 서비스를 경험하세요!</h1>
            </div>
        `;
        }
    }

    xhr.open('POST', 'addMember.lo',true);
    xhr.setRequestHeader('Content-type', 'application/json');
    xhr.send(JSON.stringify(data));
};

// sns 아이디 가입 여부 검사
function snsSignDuple(result) {
    const xhr = new XMLHttpRequest();

    xhr.onload = function() {
        if (xhr.status === 200) {
            const object = JSON.parse(xhr.responseText);
            if(object.id === '유') {
                alert('이미 가입된 계정입니다. 이용하시려면 로그인해주세요!');
                return;
            }
            return snsSign(result);
        }
    }

    const data = result;

    xhr.open('POST', 'snsSignDuple.lo',true);
    xhr.setRequestHeader('Content-type', 'application/json');
    xhr.send(JSON.stringify(data));
};

