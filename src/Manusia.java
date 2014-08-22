
public class Manusia {

	String nama;
	int umur;
	String gender;

	public Manusia() {
		this.nama = "Bokir";
		this.gender = "Laki";
		this.umur = 0;
	}

	public Manusia(int umur) {
		this.nama = "Bokir";
		this.gender = "Laki";
		this.umur = umur;
	}

	public Manusia(String nama) {
		this.nama = nama;
		this.gender = "Laki";
		this.umur = 0;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getUmur() {
		return umur;
	}

	public void setUmur(int umur) {
		this.umur = umur;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
