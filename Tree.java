class Tree {
  private String treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor;

  Tree() {
    treeName = "";
    treeType = "";
    leafColor = "";
    leavesFall = false;

  }

  Tree(String atreeName, String atreeType, String aleafColor, boolean aleavesFall) {
    treeName = atreeName;
    treeType = atreeType;
    leafColor = aleafColor;
    leavesFall = aleavesFall;

  }

  String gettreeName() {
    return treeName;
  }

  String gettreeType() {
    return treeType;
  }

  String getleafColor() {
    return leafColor;
  }

  boolean getleavesFall() {
    return leavesFall;

  }

  void settreeName(String thetreeName) {
    treeName = thetreeName;
  }

  void settreeType(String thetreeType) {
    treeType = thetreeType;
  }

  void setleafColor(String theleafColor) {
    leafColor = theleafColor;
  }

  void setleavesFall(boolean theleavesFall) {
    leavesFall = theleavesFall ;
  }

  void print() {


    System.out.println();
    System.out.print("This is a " + treeName + "tree." + "it is a " + treeType + " type. "
        + "and its leaves are currently  " + leafColor + "."   );
      if (leavesFall == true )
      { System.out.println(" It does lose its leaves for the winter.");
      }
      
      else
    
    {System.out.println("It does not lose its leaves for the winter.");}

     

     
     
     
    }}

  

