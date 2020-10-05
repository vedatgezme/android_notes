
<h1>Block the Screenshot</h1> 
getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,WindowManager.LayoutParams.FLAG_SECURE);

<br>
<hr/>
<br>


<h1>Check Firebaseuser user </h1> 
FirebaseUser firebaseUser;
FirebaseAuth firebaseAuth;
firebaseAuth = FirebaseAuth.getInstance();
firebaseUser = firebaseAuth.getCurrentUser();

 if(firebaseUser!=null)
  {
      System.out.println("NULL ");
  }
  else
  {
         System.out.println("Not Null ");
  }

<br>
<hr/>
<br>

