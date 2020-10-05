

FirebaseUser firebaseUser;
FirebaseAuth firebaseAuth;
firebaseAuth = FirebaseAuth.getInstance();
firebaseUser = firebaseAuth.getCurrentUser();

 if(firebaseUser!=null)
  {
      System.out.println("Not Null ");
  }
  else
  {
      System.out.println("Null ");
  }


