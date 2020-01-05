package week3.assignments;

public class mycomputer {
	public static void main(String[] args) {
		hardware hw=new desktop();
		software sw=new desktop();
		desktop dk=new desktop();
		hw.hardwareresources();
		sw.softwareresources();
		dk.desktopmodel();
	}

}
