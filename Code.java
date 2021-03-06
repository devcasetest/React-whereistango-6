package de.sulzer.review


public class ReviewClass {

	private String passwordString;
	private String keyStoreString;


	public void setPasswordString(LinkedHashMap<String, String[]> informationHashMap, Environment currentEnvironment, final TestStep testStep,
								  final List<TestStep> testStepList, String brokerName) {


		this.keyStoreString = informationHashMap.get(brokerName)[0];


		if (informationHashMap.get(brokerName)[1].contains("Variable")) {
			this.passwordString = informationHashMap.get(brokerName)[2];


		} else if (informationHashMap.get(brokerName)[1].contains("TestStep")) {

			final HTTPResponse httpResponseObject = getHttpResponse(testStep, testStepList);
			String payload = "";


			if (httpResponseObject != null) {
				payload = httpResponseObject.getPayload();
			}
			this.passwordString = getTokenFromPayload(payload);
		} else if (informationHashMap.get(brokerName)[1].contains("Settings")) {


			Set<EnvironmentTable> set = currentEnvironment.getBrokers();

			for (EnvironmentTable element : set) {
				this.passwordString = element.getPassword();
			}
		}
	}
}