package demo;

public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String contract = "IF1509";
		String contractName = "a1611|a1603|a1607|a1511|a1701|a1609|a1605|a1601|a1509|agefp|alefp|auefp|au1608|au1604|au1512|au1510|au1606|au1602|au1511|au1509|al1608|al1606|al1604|al1602|al1512|al1510|al1607|al1605|al1603|al1601|al1511|al1509|ag1510|ag1512|ag1602|ag1604|ag1606|ag1608|ag1607|ag1605|ag1603|ag1601|ag1511|ag1509|";
		contract = contractName.replace(contract+"|", "");
		System.out.println(contract);
	}

}
