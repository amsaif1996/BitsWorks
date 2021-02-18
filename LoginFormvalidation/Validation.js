function Valid() { 
    
    var name = document.forms["RegForm"]["Name"]; 

    var email = document.forms["RegForm"]["EMail"]; 

    var phone = document.forms["RegForm"]["Telephone"]; 

    var address = document.forms["RegForm"]["Address"]; 

   



    if (!/^[a-zA-Z]*$/.test(document.RegForm.Name.value)|| name.value == "" ) {
        alert("Invalid characters Name");
        document.RegForm.Name.focus();
        return false;
    }



   
    if (address.value == "") { 

        window.alert("Please enter your address."); 

        return false; 

    } 



    

 
    if (!/^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/.test(document.RegForm.EMail.value)|| email.value == "" ) {
        alert("Invalid characters Email");
        document.RegForm.EMail.focus();
        return false;
    }



    

    if (!/^\d{11}$/.test(document.RegForm.Telephone.value) || phone.value == "" ) {
        alert("Invalide phone no");
      
        document.RegForm.Telephone.focus();
        return false;
    }






   return true;
}

