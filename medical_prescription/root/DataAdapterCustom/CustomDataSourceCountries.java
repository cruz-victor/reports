public class CustomDataSourceCountries implements JRDataSource{
	
	private Object[][] countriesList;
	private int index;
	
	public CustomDataSourceCountries() {
		this.index=-1;
				
		countriesList=new Object[][] {
			{1,"Bolivia","Sucre",130000},
			{1,"Argentina","Buenos Aires",45000},
			{1,"Chile","Santiago",12000},
			{1,"Ecuador","Quito",9000},
			{1,"Peru","Lima",512000}
		};
	}
	
	
	@Override
	public boolean next() throws JRException{
		index++;
		return (index<countriesList.length);
	}
	

	@Override
	public Object getFieldValue(JRField arg0)throws JRException{		
		return null;
	}
	
	public static CustomDataSourceCountries getDataSource() {
		return new CustomDataSourceCountries();
	}
	
}