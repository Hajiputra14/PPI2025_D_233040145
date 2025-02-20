package pertemuan2;

public class ListMain {

		public static void main(String[] args) {
			StrukturList list = new StrukturList();
			list.addTail(3);
			list.addTail(2);
			list.addTail(1);
			
			System.out.print("Elemen: ");
			list.displayElement();

		}
}