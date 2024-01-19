import java.util.Scanner;

abstract class Character
{
  public String classType;
  private String name;
  private int age;
  private String gender;
  private String race;
  private String faceShape;
  private String hairStyle;
  private String hairColor;
  private String eyeShape;
  private String eyeBrow;
  private String eyeColor;
  private String noseModification;
  private String skinType;
  private String clothes;
  private String bodyBuild;
  private String facialFeatures;
  private String emote;
  private String headWear;
  private String accessories;
  private String familiar;
  private String quirks;

  public void setClasstype (String classType)
  {
    this.classType = classType;
  }

  public Character (Scanner scanner)
  {
    System.out.println ("Enter your character's name:");
    name = scanner.nextLine ();
    System.out.println ("Enter your character's age:");
    age = scanner.nextInt ();
    scanner.nextLine ();

    boolean menu = false;
    while (!menu)
      {
	System.out.println ("------MENU------");
	System.out.println
	  ("1.Gender\n2.Race\n3.Face Shape\n4.Hair Style\n5.Hair Color\n6.Eye shape\n7.Eye brow\n8.Eye color\n9.Nose Modifiction\n10.Skin type\n11.Clothes\n12.Body build\n13.Facial Feature\n14.Emote\n15.Head wear\n16.Accessories\n17.Familiar\n18.quirks\n19.Exit\nEnter your choice: ");
	int choice = scanner.nextInt ();
	scanner.nextLine ();

	if (choice == 1)
	  {

	    int cgender;
	    do
	      {
		System.out.println
		  ("Enter your character's gender (1.Male/2.female/3.Other): ");
		cgender = Integer.parseInt (scanner.nextLine ());

		if (cgender == 1)
		  {
		    gender = "Male";
		  }
		else if (cgender == 2)
		  {
		    gender = "Female";
		  }
		else if (cgender == 3)
		  {
		    gender = "Other";
		  }
		else
		  {
		    System.out.println ("Invalid Input");
		  }
	      }
	    while (cgender < 1 || cgender > 3);

	  }
	else if (choice == 2)
	  {

	    int crace;
	    do
	      {
		System.out.println
		  ("Enter your character's race (1.human/2.demon/3.giant/4.elve/5.Angel): ");
		crace = Integer.parseInt (scanner.nextLine ());

		if (crace == 1)
		  {
		    race = "Human";
		  }
		else if (crace == 2)
		  {
		    race = "Demon";
		  }
		else if (crace == 3)
		  {
		    race = "Giant";
		  }
		else if (crace == 4)
		  {
		    race = "Elve";
		  }
		else if (crace == 5)
		  {
		    race = "Angel";
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }
	      }
	    while (crace < 1 || crace > 5);

	  }
	else if (choice == 3)
	  {

	    int cFaceshape;
	    do
	      {
		System.out.println
		  ("Enter your character's face shape (1.oval/2.diamond/3.round/4.square/5.oblong): ");
		cFaceshape = Integer.parseInt (scanner.nextLine ());

		if (cFaceshape == 1)
		  {
		    faceShape = "Oval";
		  }
		else if (cFaceshape == 2)
		  {
		    faceShape = "Diamon";
		  }
		else if (cFaceshape == 3)
		  {
		    faceShape = "Round";
		  }
		else if (cFaceshape == 4)
		  {
		    faceShape = "Square";
		  }
		else if (cFaceshape == 5)
		  {
		    faceShape = "Oblong";
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }
	      }
	    while (cFaceshape < 1 || cFaceshape > 5);

	  }
	else if (choice == 4)
	  {

	    int cHairStyle;
	    do
	      {
		System.out.println
		  ("Enter your character's hair style (1.mohawk/2.fade/3.ponytail/4.pixie/5.clean head): ");
		cHairStyle = Integer.parseInt (scanner.nextLine ());

		if (cHairStyle == 1)
		  {
		    hairStyle = "Mohawk";
		  }
		else if (cHairStyle == 2)
		  {
		    hairStyle = "Fade";
		  }
		else if (cHairStyle == 3)
		  {
		    hairStyle = "Ponytail";
		  }
		else if (cHairStyle == 4)
		  {
		    hairStyle = "Pixie";
		  }
		else if (cHairStyle == 5)
		  {
		    hairStyle = "Clean head";
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    while (cHairStyle < 1 || cHairStyle > 5);

	  }
	else if (choice == 5)
	  {

	    int cHairCol;
	    do
	      {
		System.out.println
		  ("Enter your character's hair color (1.black/2.brown/3.blonde/4.grey/5.pink): ");
		cHairCol = Integer.parseInt (scanner.nextLine ());

		if (cHairCol == 1)
		  {
		    hairColor = "Black";
		  }
		else if (cHairCol == 2)
		  {
		    hairColor = "Brown";
		  }
		else if (cHairCol == 3)
		  {
		    hairColor = "Blode";
		  }
		else if (cHairCol == 4)
		  {
		    hairColor = "Grey";
		  }
		else if (cHairCol == 5)
		  {
		    hairColor = "Pink";
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    while (cHairCol < 1 || cHairCol > 5);

	  }
	else if (choice == 6)
	  {

	    int cEyeShape;
	    do
	      {
		System.out.println
		  ("Enter your character's eye shape (1.round/2.droopy/3.almond/4.hooded/5.wide set): ");
		cEyeShape = Integer.parseInt (scanner.nextLine ());

		if (cEyeShape == 1)
		  {
		    eyeShape = "Round";
		  }
		else if (cEyeShape == 2)
		  {
		    eyeShape = "Droopy";
		  }
		else if (cEyeShape == 3)
		  {
		    eyeShape = "Almond";
		  }
		else if (cEyeShape == 4)
		  {
		    eyeShape = "Hooded";
		  }
		else if (cEyeShape == 5)
		  {
		    eyeShape = "Wide set";
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    while (cEyeShape < 1 || cEyeShape > 5);

	  }
	else if (choice == 7)
	  {

	    int cEyeBrow;
	    do
	      {
		System.out.println
		  ("Enter your character's eye brow (1.thin/2.flat/3.short/4.straight/5.rounded): ");
		cEyeBrow = Integer.parseInt (scanner.nextLine ());

		if (cEyeBrow == 1)
		  {
		    eyeBrow = "Thin";
		  }
		else if (cEyeBrow == 2)
		  {
		    eyeBrow = "Flat";
		  }
		else if (cEyeBrow == 3)
		  {
		    eyeBrow = "Short";
		  }
		else if (cEyeBrow == 4)
		  {
		    eyeBrow = "Straight";
		  }
		else if (cEyeBrow == 5)
		  {
		    eyeBrow = "Rounded";
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    while (cEyeBrow < 1 || cEyeBrow > 5);

	  }
	else if (choice == 8)
	  {

	    int cEyeCol;
	    do
	      {
		System.out.println
		  ("Enter your character's eye color (1.black/2.brown/3.blonde/4.grey/5.blue): ");
		cEyeCol = Integer.parseInt (scanner.nextLine ());

		if (cEyeCol == 1)
		  {
		    eyeColor = "Black";
		  }
		else if (cEyeCol == 2)
		  {
		    eyeColor = "Brown";
		  }
		else if (cEyeCol == 3)
		  {
		    eyeColor = "Blonde";
		  }
		else if (cEyeCol == 4)
		  {
		    eyeColor = "Grey";
		  }
		else if (cEyeCol == 5)
		  {
		    eyeColor = "Blue";
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    while (cEyeCol < 1 || cEyeCol > 5);

	  }
	else if (choice == 9)
	  {

	    int cNoseModi;
	    do
	      {
		System.out.println
		  ("Enter your character's nose modification (1.straight/2.curve/3.raised/4.convex/5.lowered):");
		cNoseModi = Integer.parseInt (scanner.nextLine ());

		if (cNoseModi == 1)
		  {
		    noseModification = "Straight";
		  }
		else if (cNoseModi == 2)
		  {
		    noseModification = "Curve";
		  }
		else if (cNoseModi == 3)
		  {
		    noseModification = "Raised";
		  }
		else if (cNoseModi == 4)
		  {
		    noseModification = "Convex";
		  }
		else if (cNoseModi == 5)
		  {
		    noseModification = "Lowered";
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    while (cNoseModi < 1 || cNoseModi > 5);

	  }
	else if (choice == 10)
	  {

	    int cSkinT;
	    do
	      {
		System.out.println
		  ("Enter your character's skin type (1.black/2.white/3.brown): ");
		cSkinT = Integer.parseInt (scanner.nextLine ());

		if (cSkinT == 1)
		  {
		    skinType = "Black";
		  }
		else if (cSkinT == 2)
		  {
		    skinType = "White";
		  }
		else if (cSkinT == 3)
		  {
		    skinType = "Brown";
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    while (cSkinT < 1 || cSkinT > 3);

	  }
	else if (choice == 11)
	  {

	    int cClothes;
	    do
	      {
		System.out.println
		  ("Enter your character's clothes (1.Robe/2.Armor/3.Leather/4.Cloth/5.Fur): ");
		cClothes = Integer.parseInt (scanner.nextLine ());

		if (cClothes == 1)
		  {
		    clothes = "Robe";
		  }
		else if (cClothes == 2)
		  {
		    clothes = "Armor";
		  }
		else if (cClothes == 3)
		  {
		    clothes = "Leather";
		  }
		else if (cClothes == 4)
		  {
		    clothes = "Cloth";
		  }
		else if (cClothes == 5)
		  {
		    clothes = "Fur";
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    while (cClothes < 1 || cClothes > 5);

	  }
	else if (choice == 12)
	  {

	    int cBodyBuild;
	    do
	      {
		System.out.println
		  ("Enter your character's body build (1.slim/2.skinny/3.muscular): ");
		cBodyBuild = Integer.parseInt (scanner.nextLine ());

		if (cBodyBuild == 1)
		  {
		    bodyBuild = "Slim";
		  }
		else if (cBodyBuild == 2)
		  {
		    bodyBuild = "Skinny";
		  }
		else if (cBodyBuild == 3)
		  {
		    bodyBuild = "Muscular";
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    while (cBodyBuild < 1 || cBodyBuild > 5);

	  }
	else if (choice == 13)
	  {

	    int cFF;
	    do
	      {
		System.out.println
		  ("Enter your character's facial features (1.scars/2.moles): ");
		cFF = Integer.parseInt (scanner.nextLine ());

		if (cFF == 1)
		  {
		    facialFeatures = "Scars";
		  }
		else if (cFF == 2)
		  {
		    facialFeatures = "Moles";
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    while (cFF < 1 || cFF > 2);

	  }
	else if (choice == 14)
	  {

	    int cEmote;
	    do
	      {
		System.out.println
		  ("Enter your character's emote (1.sad/2.happy/3.confused/4.angry/5.bored): ");
		cEmote = Integer.parseInt (scanner.nextLine ());

		if (cEmote == 1)
		  {
		    emote = "Sad";
		  }
		else if (cEmote == 2)
		  {
		    emote = "Happy";
		  }
		else if (cEmote == 3)
		  {
		    emote = "Confused";
		  }
		else if (cEmote == 4)
		  {
		    emote = "Angry";
		  }
		else if (cEmote == 5)
		  {
		    emote = "Bored";
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    while (cEmote < 1 || cEmote > 5);

	  }
	else if (choice == 15)
	  {

	    int cHeadwear;
	    do
	      {
		System.out.println
		  ("Enter your character's head wear (1.straw hat/2.helmet/3.mask/4.hood): ");
		cHeadwear = Integer.parseInt (scanner.nextLine ());

		if (cHeadwear == 1)
		  {
		    headWear = "Straw hat";
		  }
		else if (cHeadwear == 2)
		  {
		    headWear = "Helmet";
		  }
		else if (cHeadwear == 3)
		  {
		    headWear = "Mask";
		  }
		else if (cHeadwear == 4)
		  {
		    headWear = "Hood";
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    while (cHeadwear < 1 || cHeadwear > 4);

	  }
	else if (choice == 16)
	  {

	    int cAccesso;
	    do
	      {
		System.out.println
		  ("Enter your character's accessories (1.rings/2.pendant/3.bracelet): ");
		cAccesso = Integer.parseInt (scanner.nextLine ());

		if (cAccesso == 1)
		  {
		    accessories = "Rings";
		  }
		else if (cAccesso == 2)
		  {
		    accessories = "Pendant";
		  }
		else if (cAccesso == 3)
		  {
		    accessories = "Bracelet";
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    while (cAccesso < 1 || cAccesso > 3);

	  }
	else if (choice == 17)
	  {

	    int cFam;
	    do
	      {
		System.out.println
		  ("Enter your character's familiar/pet (1.pegasus/2.phoenix/3.dragon/4.tiger/5.griffith): ");
		cFam = Integer.parseInt (scanner.nextLine ());

		if (cFam == 1)
		  {
		    familiar = "Pegasus";
		  }
		else if (cFam == 2)
		  {
		    familiar = "Phoenix";
		  }
		else if (cFam == 3)
		  {
		    familiar = "Dragon";
		  }
		else if (cFam == 4)
		  {
		    familiar = "Tiger";
		  }
		else if (cFam == 5)
		  {
		    familiar = "Griffith";
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    while (cFam < 1 || cFam > 5);

	  }
	else if (choice == 18)
	  {

	    int cQuirks;
	    do
	      {
		System.out.println
		  ("Enter your character's quirks (1.freckles/2.tattoos/3.different eye colors): ");
		cQuirks = Integer.parseInt (scanner.nextLine ());

		if (cQuirks == 1)
		  {
		    quirks = "freckles";
		  }
		else if (cQuirks == 2)
		  {
		    quirks = "Tattoos";
		  }
		else if (cQuirks == 3)
		  {
		    int lEye;
		    do
		      {
			System.out.println
			  ("Enter left eye color(1.black/2.brown/3.blonde/4.grey/5.blue): ");
			lEye = Integer.parseInt (scanner.nextLine ());

			if (lEye == 1)
			  {
			    String eye1 = "Different eye color (Black and";
			    int rEye;
			    do
			      {
				System.out.println
				  ("Enter Right eye color(1.brown/2.blonde/3.grey/4.blue): ");
				rEye = Integer.parseInt (scanner.nextLine ());

				if (rEye == 1)
				  {
				    quirks = eye1 + " Brown)";
				  }
				else if (rEye == 2)
				  {
				    quirks = eye1 + " Blonde)";
				  }
				else if (rEye == 3)
				  {
				    quirks = eye1 + " Grey)";
				  }
				else if (rEye == 4)
				  {
				    quirks = eye1 + " Blue)";
				  }
				else
				  {
				    System.out.println ("Invalid input");
				  }
			      }
			    while (rEye < 1 || rEye > 4);

			  }
			else if (lEye == 2)
			  {
			    String eye1 = "Different eye color (Brown and";
			    int rEye;
			    do{
			        System.out.println("Enter Right eye color (1.black/2.blonde/3.grey/4.blue)");
			        rEye = Integer.parseInt(scanner.nextLine());
			        
			        if(rEye == 1){
			            quirks = eye1 + " Black)";
			        }else if(rEye == 2){
			            quirks = eye1 + " Blonde)";
			        }else if(rEye == 3){
			            quirks = eye1 + " Grey)";
			        }else if(rEye == 4){
			            quirks = eye1 = " Blue)";
			        }else {
			            System.out.println("Invalid input");
			        }
			    }while (rEye < 1 || rEye > 4);
			  }
			else if (lEye == 3)
			  {
			    String eye1 = "Different eye color (Blonde and";
			    int rEye;
			    do{
			        System.out.println("Enter Right eye color (1.black/2.brown/3.grey/4.blue)");
			        rEye = Integer.parseInt(scanner.nextLine());
			        
			        if (rEye == 1){
			            quirks = eye1 + " Black)";
			        }else if(rEye == 2){
			            quirks = eye1 + " Brown)";
			        }else if (rEye == 3){
			            quirks = eye1 + " Grey)";
			        }else if(rEye == 4){
			            quirks = eye1 + " Blue)";
			        }else {
			            System.out.println("Invalid input");
			        }
			        
			    }while (rEye < 1 || rEye > 4);
			    
			  }
			else if (lEye == 4)
			  {
			    String eye1 = "Different eye color (Grey and";
			    int rEye;
			    do{
			        System.out.println("Enter Right eye color (1.black/2.brown/3.Blonde/4.blue)");
			        rEye = Integer.parseInt(scanner.nextLine());
			        
			        if (rEye == 1){
			            quirks = eye1 + " Black)";
			        }else if(rEye == 2){
			            quirks = eye1 + " Brown)";
			        }else if (rEye == 3){
			            quirks = eye1 + " Blonde)";
			        }else if(rEye == 4){
			            quirks = eye1 + " Blue)";
			        }else {
			            System.out.println("Invalid input");
			        }
			        
			    }while (rEye < 1 || rEye > 4);
			  }
			else if (lEye == 5)
			  {
			    String eye1 = "Different eye color (Blue and";
			    int rEye;
			    do{
			        System.out.println("Enter Right eye color (1.black/2.brown/3.Blonde/4.Grey");
			        rEye = Integer.parseInt(scanner.nextLine());
			        
			        if (rEye == 1){
			            quirks = eye1 + " Black)";
			        }else if(rEye == 2){
			            quirks = eye1 + " Brown)";
			        }else if (rEye == 3){
			            quirks = eye1 + " Blonde)";
			        }else if(rEye == 4){
			            quirks = eye1 + " Grey)";
			        }else {
			            System.out.println("Invalid input");
			        }
			        
			    }while (rEye < 1 || rEye > 4);
			  }
			else
			  {
			    System.out.println ("Invalid input");
			  }
		      }
		    while (lEye < 1 || lEye > 5);
		  }
		else
		  {
		    System.out.println ("Invalid Input");
		  }

	      }
	    while (cQuirks < 1 || cQuirks > 3);

	  } else if (choice == 19){
	      menu = true;
	  } else {
	      System.out.println("Invalid input");
	  }

      }
  }


  public String getName ()
  {
    return name;
  }

  public int getAge ()
  {
    return age;
  }

  public String getGender ()
  {
    return gender;
  }

  public String getFaceShape ()
  {
    return faceShape;
  }

  public String getHairStyle ()
  {
    return hairStyle;
  }

  public String getHairColor ()
  {
    return hairColor;
  }

  public String getEyeColor ()
  {
    return eyeColor;
  }

  public String getSkinType ()
  {
    return skinType;
  }

  public String getClothes ()
  {
    return clothes;
  }

  public String getClassType ()
  {
    return classType;
  }

  public String getBodyBuild ()
  {
    return bodyBuild;
  }

  public String getRace ()
  {
    return race;
  }

  public String getEyeBrow ()
  {
    return eyeBrow;
  }

  public String getEyeShape ()
  {
    return eyeShape;
  }

  public String getFacialFeatures ()
  {
    return facialFeatures;
  }

  public String getNoseModification ()
  {
    return noseModification;
  }

  public String getFamiliar ()
  {
    return familiar;
  }

  public String getEmote ()
  {
    return emote;
  }

  public String getHeadWear ()
  {
    return headWear;
  }

  public String getAccessories ()
  {
    return accessories;
  }

  public String getQuirks ()
  {
    return quirks;
  }

  public abstract void display ();

  public abstract void specialAbility ();


}


class Mage extends Character
{
  private int magicPower;

  public Mage (Scanner scanner)
  {
    super (scanner);
    setClasstype ("Mage");
    System.out.println ("Enter your mage's magic power (1-100):");
    magicPower = scanner.nextInt ();
    scanner.nextLine ();
  }

   @Override public void display ()
  {
    System.out.println
      ("You have created a mage character with the following attributes:");
    System.out.println ("Class type: " + getClassType ());
    System.out.println ("Name: " + getName ());
    System.out.println ("Age: " + getAge ());
    System.out.println ("Gender: " + getGender ());
    System.out.println ("Race: " + getRace ());
    System.out.println ("Face shape: " + getFaceShape ());
    System.out.println ("Hair style: " + getHairStyle ());
    System.out.println ("Hair color: " + getHairColor ());
    System.out.println ("Eye shape: " + getEyeShape ());
    System.out.println ("Eye brow: " + getEyeBrow ());
    System.out.println ("Eye color: " + getEyeColor ());
    System.out.println ("Nose modification: " + getNoseModification ());
    System.out.println ("Skin type: " + getSkinType ());
    System.out.println ("Clothes: " + getClothes ());
    System.out.println ("Body build: " + getBodyBuild ());
    System.out.println ("Facial features: " + getFacialFeatures ());
    System.out.println ("Emote: " + getEmote ());
    System.out.println ("Head wear: " + getHeadWear ());
    System.out.println ("Accessories: " + getAccessories ());
    System.out.println ("Familiar: " + getFamiliar ());
    System.out.println ("Quirks: " + getQuirks ());
    System.out.println ("Magic power: " + magicPower);

  }

  @Override public void specialAbility ()
  {
    System.out.println
      ("Your Mage can cast powerful spells using their magic power.");
  }
}

class Assassin extends Character
{
  private int stealthSkill;
  private String weapon;
  private String enchantment;

  void setWeapon(String enchant){
	enchant = "No enchantment";
	enchantment = enchant;
  }

  void setWeapon(String enchant, Scanner scanner){
	while (true){
				System.out.println("Choose an enchantment for your bow \n1.Flame \n2.Frostbite \n3.Stun \nEnter a number of your choice: ");
				int eBow = scanner.nextInt();
				scanner.nextLine();

				if(eBow == 1){
					enchant = " Flame enchantment";
					System.out.println("You have chosen " + enchant);
					enchantment = enchant;
					break;
				}else if(eBow == 2){
					enchant = "Frostbite enchantment";
					System.out.println("You have chosen " + enchant);
					enchantment = enchant;
					break;
				}else if(eBow == 3){
					enchant = "Stun enchantment";
					System.out.println("You have chosen " + enchant);
					enchantment = enchant;			
					break;
				}else {
					System.out.println("Invalid input");
				}
			}
  }

  public Assassin (Scanner scanner)
  {
    super (scanner);
    setClasstype ("Assassin");
    System.out.println ("Enter your assassin's stealth skill (1-100):");
    stealthSkill = scanner.nextInt ();
    scanner.nextLine ();

	boolean e = false;
	while(!e){
		System.out.println("Enter your weapon \n1.Dagger \n2.Short Sword \nEnter: ");
		int choice = scanner.nextInt();
		if(choice == 1){
			weapon = "Dagger";
			boolean dag = true;
			while(dag){
				
				System.out.println("Do you want a enchantment for your weapon?(Y/N): ");
				char input = scanner.next().charAt(0);

				if(input == 'Y' || input == 'y'){
					setWeapon(enchantment, scanner);
					dag = false;
				}else if(input == 'N' || input == 'n'){
					setWeapon("plain");
					dag = false;
				}else {
					System.out.println("Invalid input. Please enter Y for yes or N for no.");
				}
			}
			e = true;
		}else if(choice == 2){
			weapon = "Short Sword";
			boolean ss = true;
			while(ss){
				
				System.out.println("Do you want a enchantment for your weapon?(Y/N): ");
				char input = scanner.next().charAt(0);

				if(input == 'Y' || input == 'y'){
					setWeapon(enchantment, scanner);
					ss = false;
				}else if(input == 'N' || input == 'n'){
					setWeapon(enchantment);
					ss = false;
				}else {
					System.out.println("Invalid input. Please enter Y for yes or N for no.");
				}
			}
			e = true;
		}else{
			System.out.println("Invalid input");
		}
		
	}

  }

   @Override public void display ()
  {
    System.out.println
      ("You have created an assassin character with the following attributes:");
    System.out.println ("Class type: " + getClassType ());
    System.out.println ("Name: " + getName ());
    System.out.println ("Age: " + getAge ());
    System.out.println ("Gender: " + getGender ());
    System.out.println ("Race: " + getRace ());
    System.out.println ("Face shape: " + getFaceShape ());
    System.out.println ("Hair style: " + getHairStyle ());
    System.out.println ("Hair color: " + getHairColor ());
    System.out.println ("Eye shape: " + getEyeShape ());
    System.out.println ("Eye brow: " + getEyeBrow ());
    System.out.println ("Eye color: " + getEyeColor ());
    System.out.println ("Nose modification: " + getNoseModification ());
    System.out.println ("Skin type: " + getSkinType ());
    System.out.println ("Clothes: " + getClothes ());
    System.out.println ("Body build: " + getBodyBuild ());
    System.out.println ("Facial features: " + getFacialFeatures ());
    System.out.println ("Emote: " + getEmote ());
    System.out.println ("Head wear: " + getHeadWear ());
    System.out.println ("Accessories: " + getAccessories ());
    System.out.println ("Familiar: " + getFamiliar ());
    System.out.println ("Quirks: " + getQuirks ());
    System.out.println ("stealthSkill: " + stealthSkill);
	System.out.println ("Weapon: " + weapon + "with a " + enchantment);
  }

  @Override public void specialAbility ()
  {
    System.out.println
      ("Your Asssassin can cast heavy damage with stealth skill.");
  }
}

class Tank extends Character
{
  private int defensePower;

  public Tank (Scanner scanner)
  {
    super (scanner);
    setClasstype ("Tank");
    System.out.println ("Enter your tank's defense power (1-100):");
    defensePower = scanner.nextInt ();
    scanner.nextLine ();
  }

   @Override public void display ()
  {
    System.out.println
      ("You have created a tank character with the following attributes:");
    System.out.println ("Class type: " + getClassType ());
    System.out.println ("Name: " + getName ());
    System.out.println ("Age: " + getAge ());
    System.out.println ("Gender: " + getGender ());
    System.out.println ("Race: " + getRace ());
    System.out.println ("Face shape: " + getFaceShape ());
    System.out.println ("Hair style: " + getHairStyle ());
    System.out.println ("Hair color: " + getHairColor ());
    System.out.println ("Eye shape: " + getEyeShape ());
    System.out.println ("Eye brow: " + getEyeBrow ());
    System.out.println ("Eye color: " + getEyeColor ());
    System.out.println ("Nose modification: " + getNoseModification ());
    System.out.println ("Skin type: " + getSkinType ());
    System.out.println ("Clothes: " + getClothes ());
    System.out.println ("Body build: " + getBodyBuild ());
    System.out.println ("Facial features: " + getFacialFeatures ());
    System.out.println ("Emote: " + getEmote ());
    System.out.println ("Head wear: " + getHeadWear ());
    System.out.println ("Accessories: " + getAccessories ());
    System.out.println ("Familiar: " + getFamiliar ());
    System.out.println ("Quirks: " + getQuirks ());
    System.out.println ("Defense power: " + defensePower);
  }

  @Override public void specialAbility ()
  {
    System.out.println
      ("Your tank can withstand heavy damage and protect your allies with their defense power.");
  }
}

class Fighter extends Character
{
  private int attackPower;
  private String weapon;
  private String enchantment;

  void setWeapon(String enchant){
	enchant = " No enchantment ";
	enchantment = enchant;
  }

  void setWeapon(String enchant, Scanner scanner){
	while (true){
				System.out.println("Choose an enchantment for your bow \n1.Flame \n2.Frostbite \n3.Stun \nEnter a number of your choice: ");
				int eBow = scanner.nextInt();
				scanner.nextLine();

				if(eBow == 1){
					enchant = " Flame enchantment";
					System.out.println("You have chosen " + enchant);
					enchantment = enchant;
					break;
				}else if(eBow == 2){
					enchant = "Frostbite enchantment";
					System.out.println("You have chosen " + enchant);
					enchantment = enchant;
					break;
				}else if(eBow == 3){
					enchant = "Stun enchantment";
					System.out.println("You have chosen " + enchant);
					enchantment = enchant;			
					break;
				}else {
					System.out.println("Invalid input");
				}
			}
  }


  public Fighter (Scanner scanner)
  {
    super (scanner);
    setClasstype ("Fighter");
    System.out.println ("Enter your fighter's attack power (1-100):");
    attackPower = scanner.nextInt ();
    scanner.nextLine ();

	boolean e = false;
	while(!e){
		System.out.println("Enter your weapon \n1.Greatsword \n2.Battle Axe \nEnter: ");
		int choice = scanner.nextInt();
		if(choice == 1){
			weapon = "Greatsword";
			boolean eGS = true;
			while(eGS){
				
				System.out.println("Do you want a enchantment for your weapon?(Y/N): ");
				char input = scanner.next().charAt(0);

				if(input == 'Y' || input == 'y'){
					setWeapon(enchantment, scanner);
					eGS = false;
				}else if(input == 'N' || input == 'n'){
					setWeapon("plain");
					eGS = false;
				}else {
					System.out.println("Invalid input. Please enter Y for yes or N for no.");
				}
			}
			e = true;
		}else if(choice == 2){
			weapon = "Battle Axe";
			boolean eBA = true;
			while(eBA){
				
				System.out.println("Do you want a enchantment for your weapon?(Y/N): ");
				char input = scanner.next().charAt(0);

				if(input == 'Y' || input == 'y'){
					setWeapon(enchantment, scanner);
					eBA = false;
				}else if(input == 'N' || input == 'n'){
					setWeapon(enchantment);
					eBA = false;
				}else {
					System.out.println("Invalid input. Please enter Y for yes or N for no.");
				}
			}
			e = true;
		}else{
			System.out.println("Invalid input");
		}
		
	}
	
  }

   @Override public void display ()
  {
    System.out.println
      ("You have created a fighter character with the following attributes:");
    System.out.println ("Class type: " + getClassType ());
    System.out.println ("Name: " + getName ());
    System.out.println ("Age: " + getAge ());
    System.out.println ("Gender: " + getGender ());
    System.out.println ("Race: " + getRace ());
    System.out.println ("Face shape: " + getFaceShape ());
    System.out.println ("Hair style: " + getHairStyle ());
    System.out.println ("Hair color: " + getHairColor ());
    System.out.println ("Eye shape: " + getEyeShape ());
    System.out.println ("Eye brow: " + getEyeBrow ());
    System.out.println ("Eye color: " + getEyeColor ());
    System.out.println ("Nose modification: " + getNoseModification ());
    System.out.println ("Skin type: " + getSkinType ());
    System.out.println ("Clothes: " + getClothes ());
    System.out.println ("Body build: " + getBodyBuild ());
    System.out.println ("Facial features: " + getFacialFeatures ());
    System.out.println ("Emote: " + getEmote ());
    System.out.println ("Head wear: " + getHeadWear ());
    System.out.println ("Accessories: " + getAccessories ());
    System.out.println ("Familiar: " + getFamiliar ());
    System.out.println ("Quirks: " + getQuirks ());
    System.out.println ("Attack power: " + attackPower);
	System.out.println ("Weapon: " + weapon + " with a " + enchantment);
  }

  @Override public void specialAbility ()
  {
    System.out.println
      ("Your fighter can unleash powerful combos and deal massive damage with their attack power.");
  }
}

class Archer extends Character
{
  private int accuracySkill;
  private String bow;

  void setWeapon(String enchanted){
	enchanted = "Plain bow";
	bow = enchanted;
  }

    void setWeapon(String enchanted, Scanner scanner){
      while (true){
				System.out.println("Choose an enchantment for your bow \n1.Flaming Arrow \n2.Frostbite \n3.Seeker \nEnter: ");
				int eBow = scanner.nextInt();
				scanner.nextLine();

				if(eBow == 1){
					enchanted = "Flaming Arrow bow";
					System.out.println("You have chosen " + enchanted);
					bow = enchanted;
					break;
				}else if(eBow == 2){
					enchanted = "Frostbite bow";
					System.out.println("You have chosen " + enchanted);
					bow = enchanted;
					break;
				}else if(eBow == 3){
					enchanted = "Seeker bow";
					System.out.println("You have chosen " + enchanted);
					bow = enchanted;
					break;
				}else {
					System.out.println("Invalid input");
				}
			}
	
  }

  public Archer (Scanner scanner)
{
    super (scanner);
    setClasstype ("Archer");
    System.out.println ("Enter your archer's accuracy skill (1-100):");
    accuracySkill = scanner.nextInt ();
    scanner.nextLine ();  

	boolean e = false;
    while (!e) {
        System.out.println("Do want to add an enchantment to the bow? (Y/N)");
        char choice = scanner.next().charAt(0);
        scanner.nextLine();  

        if(choice == 'Y' || choice == 'y'){
            setWeapon("enchanted", scanner);
            e = true;
        } else if(choice == 'N' || choice == 'n'){
            setWeapon("Plain");
            e = true;
        } else {
            System.out.println("Invalid input. Please enter Y for yes or N for no.");
        }
    }
}


   @Override public void display ()
  {
    System.out.println
      ("You have created an archer character with the following attributes:");
    System.out.println ("Class type: " + getClassType ());
    System.out.println ("Name: " + getName ());
    System.out.println ("Age: " + getAge ());
    System.out.println ("Gender: " + getGender ());
    System.out.println ("Race: " + getRace ());
    System.out.println ("Face shape: " + getFaceShape ());
    System.out.println ("Hair style: " + getHairStyle ());
    System.out.println ("Hair color: " + getHairColor ());
    System.out.println ("Eye shape: " + getEyeShape ());
    System.out.println ("Eye brow: " + getEyeBrow ());
    System.out.println ("Eye color: " + getEyeColor ());
    System.out.println ("Nose modification: " + getNoseModification ());
    System.out.println ("Skin type: " + getSkinType ());
    System.out.println ("Clothes: " + getClothes ());
    System.out.println ("Body build: " + getBodyBuild ());
    System.out.println ("Facial features: " + getFacialFeatures ());
    System.out.println ("Emote: " + getEmote ());
    System.out.println ("Head wear: " + getHeadWear ());
    System.out.println ("Accessories: " + getAccessories ());
    System.out.println ("Familiar: " + getFamiliar ());
    System.out.println ("Quirks: " + getQuirks ());
    System.out.println ("Accuracy skill: " + accuracySkill);
	System.out.println("Bow: " + bow);
  }

  @Override public void specialAbility ()
  {
    System.out.println
      ("Your archer can shoot arrows with pinpoint accuracy and hit enemies from a long distance with their accuracy skill.");
  }
}

interface CharacterCreationSystem
{
  public Character chooseClass (Scanner scanner);
  public void displayCharacter (Character character);
  public void showSpecialAbility (Character character);
}

class Game implements CharacterCreationSystem
{
  @Override 
  public Character chooseClass (Scanner scanner) {
    Character character = null;
    int choice = 0;
    while (true) {
        System.out.println ("Choose your class:");
        System.out.println ("1. Mage");
        System.out.println ("2. Assassin");
        System.out.println ("3. Tank");
        System.out.println ("4. Fighter");
        System.out.println ("5. Archer");
		System.out.println ("6. Exit");

        choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            character = new Mage(scanner);
        } else if (choice == 2) {
            character = new Assassin(scanner);
        } else if (choice == 3) {
            character = new Tank(scanner);
        } else if (choice == 4) {
            character = new Fighter(scanner);
        } else if (choice == 5) {
            character = new Archer(scanner);
        } else if(choice == 6) {
            System.out.println("Exiting...");
			return null;
        } else {
			System.out.println("Invalid choice. Please try again. ");
		}

		if (character != null) {
			break;
		}
    }
    return character;
}


  @Override 
  public void displayCharacter (Character character)
  {
    if (character != null)
      {
	character.display ();
      }
    else
      {
	System.out.println ("No character created.");
      }
  }

  @Override public void showSpecialAbility (Character character)
  {
    if (character != null)
      {
	character.specialAbility ();
      }
    else
      {
	System.out.println ("No character created. therefore no special ability");
      }
  }
}

public class Custom {
    public static void main(String[] args) {
        try {
            String[] messages = {"In the realm of Eldoria", "\nwhere magic intertwines with reality, and mythical creatures roam the lands, a prophecy was foretold", "\nThe ancient scrolls spoke of a time when the world would be shrouded in darkness", "\nbrought upon by the malevolent sorcerer", "\nMorgath", "\nThe kingdom's only hope lies within you", "\nGoodluck Adventurer may the goddess guide you"};

            for (String message : messages) {
                printWithTypewriterEffect(message);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        Scanner scanner = new Scanner(System.in);
        boolean start = false;
        
        while (!start){
            System.out.println("\nPress 1 to Start or 2 to Exit: ");
            int intro = scanner.nextInt();

            if (intro == 1){
                boolean custom = false;
                while(!custom){
                    Game game = new Game ();
                    Character character = game.chooseClass (scanner);
                    if (character == null) {
                        System.out.println("Press 1 to restart or 2 to quit the game");
                        int choice = scanner.nextInt();
                        if (choice == 1) {
                            continue;
                        } else if (choice == 2) {
                            System.out.println("Quitting game");
                            System.exit(0);
                        }
                    }
                    game.displayCharacter (character);
                    game.showSpecialAbility (character);
                    boolean con = false;
                    while (!con){
                        System.out.println("Do you confirm these attributes? (1.YES/2.NO): ");
                        int conf = scanner.nextInt();
                        if(conf == 1){
                            System.out.println("------Entering the world------");
                            custom = true;
                            con = true;
                        } else if (conf == 2){
                            custom = false;
                            con = true;
                        } else {
                            System.out.println("Invalid output");
                        }
                    }
                }
                start = true;
                
            } else if(intro == 2) {
                System.out.println("Quitting game");
                start = true;
            } else {
                System.out.println("Invalid input");
            }
        }
    }

    public static void printWithTypewriterEffect(String message) throws InterruptedException {
        for (char c : message.toCharArray()) {
            System.out.print(c);
            Thread.sleep(100); 
        }
        System.out.println();
    }
}
