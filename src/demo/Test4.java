package demo;

public class Test4 {
	public static void main(String[] args){
//		String contract = "ag1510|ag1512|ag1602|ag1604|ag1606|ag1608|ag1607|ag1605|ag1603|ag1601|ag1511|ag1509|al1602|al1512|al1510|al1604|al1606|al1608|al1607|al1605|al1603|al1601|al1511|al1509|au1510|au1512|au1604|au1608|au1606|au1602|au1511|au1509|auefp|alefp|agefp|a1511|a1603|a1607|a1611|a1701|a1609|a1605|a1601|a1509|";
		String contract = "IF1603|";
		String[] contracts = contract.split("[|]");
		System.out.println(contracts.length);
		for(String contractSingle : contracts){
			System.out.println(contractSingle);
		}
//		contract = contract.replace("IF1512"+"|", "");
//		System.out.println(contract);
	}
}
