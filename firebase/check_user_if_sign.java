

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


