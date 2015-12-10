package demo;

public class Test6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String contract = "IF1603|";
		String[] contracts = contract.split("[|]");
		String ableContracts = "IF1603|";
		for(String contractSingle : contracts){
			boolean exist = ableContracts.contains(contractSingle);
			if(exist){
				ableContracts = ableContracts.replace(contractSingle+"|", "");
			}
			else{
//				LOGGER.info(contractSingle+"可交易类从未绑定");
			}
//			System.out.println(contractName);
		}
		System.out.println(ableContracts);
		System.out.println(ableContracts.equals(""));
//		String[] ableContractList = new String[]{};
		String[] ableContractList = ableContracts.split("[|]");
		System.out.println(ableContractList[0].length());
		System.out.println(ableContractList[0].equals(""));
		boolean exist = (ableContractList.length==0);
		System.out.println(exist);
	}

}
