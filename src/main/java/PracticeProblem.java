public class PracticeProblem {

// Feb 12 2026, Benson Zheng
// Coding shapes using new lines
	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
	}

	public static void q1() {
		System.out.println(
						" * * * * * *\n" + 
						"* * * * * *\n" + 
						" * * * * * *\n" + 
						"* * * * * *\n" + 
						" * * * * * *\n" + 
						"* * * * * *\n");
		
		System.out.println(		
						"* * * * *\n" + 
						"*       *\n" + 
						"*       *\n" + 
						"*       *\n" + 
						"* * * * *\n");

		System.out.println(
						"* * * * * *\n" + 
						" *       *\n" + 
						"  *     *\n" + 
						"   *   *\n" + 
						"    * *\n" + 
						"     *");
	}

	public static void q2() {
	String frivolousWildAnimal = "          '__'\n          (oo)\n  /========//\n / || XX ||\n*  ||----||\n   VV    VV\n   ''    ''";
	System.out.println(frivolousWildAnimal);
	}

	public static void q3() {
		String orphanBoyWithHiddenPowersAttendsSecretMagicSchoolThenDefeatsAncientDarkEvilSorcererToUltimatelySaveTheHiddenWizardingWorldAndRestorePeaceToTheMysticalReal = "Fortnite ";
		String bad = "is awful";
		System.out.println(orphanBoyWithHiddenPowersAttendsSecretMagicSchoolThenDefeatsAncientDarkEvilSorcererToUltimatelySaveTheHiddenWizardingWorldAndRestorePeaceToTheMysticalReal + bad);

	}

	public static void q4() {
		String str1 = "Don't ";
		String str2 = "@ me";
		String str3 = str1 + str2;
		System.out.println(str3);
	}


}
