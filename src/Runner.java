
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manusia arsyah = new Manusia(10);

		System.out.println("======== Umur Arsya Pada Saat Initiate " + arsyah.getUmur());
		System.out.println("======== Name Arsya Pada Saat Initiate " + arsyah.getNama());
		System.out.println("======== Gender Arsya Pada Saat Initiate " + arsyah.getGender());

		System.out.println("");
		System.out.println("");

		arsyah.setUmur(13);
		arsyah.setNama("Jelaosy");
		arsyah.setGender("Perempuan");
		System.out.println("======== Ini Setelah Set New Value Umur " + arsyah.getUmur());
		System.out.println("======== Ini Setelah Set New Value Name " + arsyah.getNama());
		System.out.println("======== Ini Setelah Set New Value Gender " + arsyah.getGender());


	}

}
