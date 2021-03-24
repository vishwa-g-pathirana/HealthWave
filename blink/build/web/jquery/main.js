$(document).ready(function(){
    $('.fa-bars').click(function(){
       $(this).toggleClass('fa-times'); 
       $('.nav').toggleClass('nav-toggle');
        
    });
    
    $(window).on('load scroll',function(){
       $('.fa-bars').removeClass('fa-times'); 
       $('.nav').removeClass('nav-toggle');
        
    });
    
});

function openLoginForm(){
  document.body.classList.add("showLoginForm");
}
function closeLoginForm(){
  document.body.classList.remove("showLoginForm");
}



