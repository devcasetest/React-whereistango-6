package de.sulzer.review;

import java.util.List;

/**
 * only for demonstration.
 */
public class HTTPResponse {
	public static HTTPResponse getHttpResponse(TestStep testStep, List<TestStep> testStepList) {
		if (testStepList.contains(testStep)) {
			return  testStep.getHttpResponse();
		} else {
			return null;
		}
	}

	public static String getTokenFromPayload(String payload) {
		if (payload.length() > 6) {
			return payload.substring(2, 6);
		} else {
			return null;
		}

	}

	public String getPayload() {
		return null;
	}
}
