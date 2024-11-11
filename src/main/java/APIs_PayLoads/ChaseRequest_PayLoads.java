package APIs_PayLoads;

public class ChaseRequest_PayLoads {
	
	public static  String payLoad_With_Single_Matching_RG(String intendedUse, String accountID, String subAccountID, String cotivitClaimNumber) {		
		String payLoadWithSingleMatchingRG = 
				"{\r\n"
				+ "  \"ChaseRequest\": {\r\n"
				+ "    \"ChaseRequestHeader\": {\r\n"
				+ "      \"IntendedUse\": \""+intendedUse+"\",\r\n"
				+ "      \"AuditType\": \"OBV\",\r\n"
				+ "      \"ChartType\": \"Medical\",\r\n"
				+ "      \"RelatedChaseID\": \"123456789012345\",\r\n"
				+ "      \"ExternalChaseNumber\": \"12345678901234512345678901234512\",\r\n"
				+ "      \"GlobalWorkforceApproved\": true,\r\n"
				+ "      \"ExpirationDate\": \"2024-12-30\",\r\n"
				+ "      \"MRAvailableInClientSystem\": false,\r\n"
				+ "      \"MRClientSystemDCN\": null,\r\n"
				+ "      \"ProspectiveClaimFlag\": false,\r\n"
				+ "      \"ClientID\": 10,\r\n"
				+ "      \"AccountID\": \""+accountID+"\",\r\n"
				+ "      \"SubAccountId\": \""+subAccountID+"\",\r\n"
				+ "      \"PortalRequestCode\": \"123456789012345123456789012345\",\r\n"
				+ "      \"PlanName\": \"12345678901234512345674567890123451231\",\r\n"
				+ "      \"PrimaryChaseRequestProviderRole\": \"RenderingProvider\",\r\n"
				+ "      \"ExplicitRequestGroupId\": \"\"\r\n"
				+ "    },\r\n"
				+ "    \"ClaimDetails\": {\r\n"
				+ "      \"ClaimType\": \"H\",\r\n"
				+ "      \"InNetwork\": true,\r\n"
				+ "      \"ClientClaimNumber\": \""+cotivitClaimNumber+"\",\r\n"
				+ "      \"CotivitiClaimNumber\": \"-1119041082\",\r\n"
				+ "      \"DateOfServiceStart\": \"2023-02-01\",\r\n"
				+ "      \"DateOfServiceEnd\": \"2024-02-15\",\r\n"
				+ "      \"TotalClaimAmt\": 1500.14,\r\n"
				+ "      \"ProviderSpecialty\": \"1234567890678901211\",\r\n"
				+ "      \"PatientMemberIdx\": 2,\r\n"
				+ "      \"SubscriberMemberIdx\": 1,\r\n"
				+ "      \"BillingProviderIdx\": 1,\r\n"
				+ "      \"RenderingProviderIdx\": 2\r\n"
				+ "    },\r\n"
				+ "    \"ChaseDetails\": {\r\n"
				+ "      \"DOSChartRangeStart1\": \"2023-06-29\",\r\n"
				+ "      \"DOSChartRangeEnd1\": \"2023-06-29\",\r\n"
				+ "      \"DOSChartRangeStart2\": \"2023-06-29\",\r\n"
				+ "      \"DOSChartRangeEnd2\": \"2023-06-29\",\r\n"
				+ "      \"DOSChartRangeStart3\": \"2023-06-29\",\r\n"
				+ "      \"DOSChartRangeEnd3\": \"2023-06-29\",\r\n"
				+ "      \"DOSChartRangeStart4\": \"2023-06-29\",\r\n"
				+ "      \"DOSChartRangeEnd4\": \"2023-06-29\",\r\n"
				+ "      \"DeliveryDate\": \"2023-06-29\",\r\n"
				+ "      \"RetrievalRank\": 10,\r\n"
				+ "      \"HedisMeasureID\": \"HEDIS72\",\r\n"
				+ "      \"MeasurementGap\": \"123456789012345123123456789012345123123456\",\r\n"
				+ "      \"SubMeasurementGap\": \"SubMeasure2\",\r\n"
				+ "      \"IsOversampleFlag\": true,\r\n"
				+ "      \"ChasePriority\": \"1234567890\",\r\n"
				+ "      \"RADVEnrolleeID\": \"RADV9203\",\r\n"
				+ "      \"MedicareAdvantagecontractNumber\": \"MA104\"\r\n"
				+ "    },\r\n"
				+ "    \"Members\": [\r\n"
				+ "      {\r\n"
				+ "        \"Member\": {\r\n"
				+ "          \"LastName\": \"Duncan\",\r\n"
				+ "          \"FirstName\": \"Tracey\",\r\n"
				+ "          \"Address1\": \"317EvelynCrestApt.969\",\r\n"
				+ "          \"Address2\": \"Suite136\",\r\n"
				+ "          \"City\": \"NewKristinton\",\r\n"
				+ "          \"State\": \"PA\",\r\n"
				+ "          \"Zip\": \"52013\",\r\n"
				+ "          \"DOB\": \"1953-12-22\",\r\n"
				+ "          \"Gender\": \"F\",\r\n"
				+ "          \"SSN\": \"345909427\",\r\n"
				+ "          \"PatientId\": \"9127\",\r\n"
				+ "          \"HICN\": \"205756132\",\r\n"
				+ "          \"ControlNumber\": \"6451\",\r\n"
				+ "          \"MBI\": \"84429\",\r\n"
				+ "          \"RecordNumber\": \"44578\",\r\n"
				+ "          \"ClientMemberID\": \"55213\"\r\n"
				+ "        }\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"Member\": {\r\n"
				+ "          \"LastName\": \"Duncan\",\r\n"
				+ "          \"FirstName\": \"Tracey\",\r\n"
				+ "          \"Address1\": \"317EvelynCrestApt.969\",\r\n"
				+ "          \"Address2\": \"Suite136\",\r\n"
				+ "          \"City\": \"NewKristinton\",\r\n"
				+ "          \"State\": \"PA\",\r\n"
				+ "          \"Zip\": \"52013\",\r\n"
				+ "          \"DOB\": \"1953-12-22\",\r\n"
				+ "          \"Gender\": \"F\",\r\n"
				+ "          \"SSN\": \"345909427\",\r\n"
				+ "          \"PatientId\": \"9127\",\r\n"
				+ "          \"HICN\": \"205756132\",\r\n"
				+ "          \"ControlNumber\": \"6451\",\r\n"
				+ "          \"MBI\": \"84429\",\r\n"
				+ "          \"RecordNumber\": \"44578\",\r\n"
				+ "          \"ClientMemberID\": \"55213\"\r\n"
				+ "        }\r\n"
				+ "      }\r\n"
				+ "    ],\r\n"
				+ "    \"Providers\": [\r\n"
				+ "      {\r\n"
				+ "        \"Provider\": {\r\n"
				+ "          \"Name\": \"Phi Dev Team\",\r\n"
				+ "          \"LastName\": \"\",\r\n"
				+ "          \"FirstName\": \"\",\r\n"
				+ "          \"Address1\": \"4057CherylAlleyApt.580\",\r\n"
				+ "          \"Address2\": \"Suite525\",\r\n"
				+ "          \"City\": \"Glenview\",\r\n"
				+ "          \"State\": \"SD\",\r\n"
				+ "          \"Zip\": \"90069\",\r\n"
				+ "          \"NPI\": \"1194014597\",\r\n"
				+ "          \"TIN\": \"922083658\",\r\n"
				+ "          \"Phone1\": \"722-495-6965\",\r\n"
				+ "          \"Phone2\": \"080-739-3528\",\r\n"
				+ "          \"Phone3\": \"810-993-3037\",\r\n"
				+ "          \"Fax\": \"425-611-6685\",\r\n"
				+ "          \"ClientProviderId\": \"4398\"\r\n"
				+ "        }\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"Provider\": {\r\n"
				+ "          \"Name\": \"Phi QA Team\",\r\n"
				+ "          \"LastName\": \"Schackmann\",\r\n"
				+ "          \"FirstName\": \"Kathy\",\r\n"
				+ "          \"Address1\": \"25672JesusLocks\",\r\n"
				+ "          \"Address2\": \"Apt.477\",\r\n"
				+ "          \"City\": \"Racheltown\",\r\n"
				+ "          \"State\": \"CO\",\r\n"
				+ "          \"Zip\": \"67397\",\r\n"
				+ "          \"NPI\": \"1568863264\",\r\n"
				+ "          \"TIN\": \"922083658\",\r\n"
				+ "          \"Phone1\": \"497-325-3898\",\r\n"
				+ "          \"Phone2\": \"068-091-2823\",\r\n"
				+ "          \"Phone3\": \"445-437-8054\",\r\n"
				+ "          \"Fax\": \"967-671-5938\",\r\n"
				+ "          \"ClientProviderId\": \"5243\"\r\n"
				+ "        }\r\n"
				+ "      }\r\n"
				+ "    ]\r\n"
				+ "  }\r\n"
				+ "}";
		return payLoadWithSingleMatchingRG;
	}
	public static  String payLoad_With_No_Matching_RG(String intendedUse, String accountID, String subAccountID, String cotivitClaimNumber) {		
		String payLoadWithNoMatchingRG = "{\r\n"
				+ "  \"ChaseRequest\": {\r\n"
				+ "    \"ChaseRequestHeader\": {\r\n"
				+ "      \"IntendedUse\": \""+intendedUse+"\",\r\n"
				+ "      \"AuditType\": \"SS\",\r\n"
				+ "      \"ChartType\": \"Medical\",\r\n"
				+ "      \"RelatedChaseID\": \"911\",\r\n"
				+ "      \"ExternalChaseNumber\": \"894986377\",\r\n"
				+ "      \"GlobalWorkforceApproved\": false,\r\n"
				+ "      \"ExpirationDate\": \"2024-12-06\",\r\n"
				+ "      \"MRAvailableInClientSystem\": false,\r\n"
				+ "      \"MRClientSystemDCN\": \"8478579337\",\r\n"
				+ "      \"ProspectiveClaimFlag\": false,\r\n"
				+ "      \"ClientID\": 13,\r\n"
				+ "      \"AccountID\": \""+accountID+"\",\r\n"
				+ "      \"SubAccountId\": \""+subAccountID+"\",\r\n"
				+ "      \"PortalRequestCode\": \"46378\",\r\n"
				+ "      \"PlanName\": \"6\",\r\n"
				+ "      \"PrimaryChaseRequestProviderRole\": \"RenderingProvider\",\r\n"
				+ "      \"ExplicitRequestGroupId\": null\r\n"
				+ "    },\r\n"
				+ "    \"ClaimDetails\": {\r\n"
				+ "      \"CotivitiClaimNumber\": \""+cotivitClaimNumber+"\",\r\n"
				+ "      \"ClaimType\": \"S\",\r\n"
				+ "      \"InNetwork\": true,\r\n"
				+ "      \"ClientClaimNumber\": \"5106326342\",\r\n"
				+ "      \"DateOfServiceStart\": \"2022-09-26\",\r\n"
				+ "      \"DateOfServiceEnd\": \"2022-09-26\",\r\n"
				+ "      \"TotalClaimAmt\": 1666.09,\r\n"
				+ "      \"ProviderSpecialty\": \"test\",\r\n"
				+ "      \"PatientMemberIdx\": 2,\r\n"
				+ "      \"SubscriberMemberIdx\": 1,\r\n"
				+ "      \"BillingProviderIdx\": 1,\r\n"
				+ "      \"RenderingProviderIdx\": 2\r\n"
				+ "    },\r\n"
				+ "    \"ChaseDetails\": {\r\n"
				+ "      \"DOSChartRangeStart1\": \"2022-09-26\",\r\n"
				+ "      \"DOSChartRangeEnd1\": \"2022-09-26\",\r\n"
				+ "      \"DOSChartRangeStart2\": \"2022-09-26\",\r\n"
				+ "      \"DOSChartRangeEnd2\": \"2022-09-26\",\r\n"
				+ "      \"DOSChartRangeStart3\": \"2022-09-26\",\r\n"
				+ "      \"DOSChartRangeEnd3\": \"2022-09-26\",\r\n"
				+ "      \"DOSChartRangeStart4\": \"2022-09-26\",\r\n"
				+ "      \"DOSChartRangeEnd4\": \"2022-09-26\",\r\n"
				+ "      \"DeliveryDate\": \"2022-09-26\",\r\n"
				+ "      \"RetrievalRank\": 8,\r\n"
				+ "      \"HedisMeasureID\": \"HEDIS26\",\r\n"
				+ "      \"MeasurementGap\": \"Measure2\",\r\n"
				+ "      \"SubMeasurementGap\": \"SubMeasure5\",\r\n"
				+ "      \"IsOversampleFlag\": true,\r\n"
				+ "      \"ChasePriority\": \"High\",\r\n"
				+ "      \"RADVEnrolleeID\": \"RADV3354\",\r\n"
				+ "      \"MedicareAdvantagecontractNumber\": \"MA353\"\r\n"
				+ "    },\r\n"
				+ "    \"Members\": [\r\n"
				+ "      {\r\n"
				+ "        \"Member\": {\r\n"
				+ "          \"LastName\": \"Richards\",\r\n"
				+ "          \"FirstName\": \"Elizabeth\",\r\n"
				+ "          \"Address1\": \"048 Hinton Loop Apt. 872\",\r\n"
				+ "          \"Address2\": \"Apt. 736\",\r\n"
				+ "          \"City\": \"Kathleenside\",\r\n"
				+ "          \"State\": \"KY\",\r\n"
				+ "          \"Zip\": \"62417\",\r\n"
				+ "          \"DOB\": \"1983-04-18\",\r\n"
				+ "          \"Gender\": \"M\",\r\n"
				+ "          \"SSN\": \"495-92-8935\",\r\n"
				+ "          \"PatientId\": \"4145\",\r\n"
				+ "          \"HICN\": \"716351468\",\r\n"
				+ "          \"ControlNumber\": \"9679\",\r\n"
				+ "          \"MBI\": \"98716\",\r\n"
				+ "          \"RecordNumber\": \"87618\",\r\n"
				+ "          \"ClientMemberID\": \"89225\"\r\n"
				+ "        }\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"Member\": {\r\n"
				+ "          \"LastName\": \"Evans\",\r\n"
				+ "          \"FirstName\": \"Theresa\",\r\n"
				+ "          \"Address1\": \"644 Rachel Ridge Apt. 945\",\r\n"
				+ "          \"Address2\": \"Suite 660\",\r\n"
				+ "          \"City\": \"East Victoriaborough\",\r\n"
				+ "          \"State\": \"MS\",\r\n"
				+ "          \"Zip\": \"14075\",\r\n"
				+ "          \"DOB\": \"2008-02-27\",\r\n"
				+ "          \"Gender\": \"F\",\r\n"
				+ "          \"SSN\": \"790-57-4891\",\r\n"
				+ "          \"PatientId\": \"4906\",\r\n"
				+ "          \"HICN\": \"949290986\",\r\n"
				+ "          \"ControlNumber\": \"1092\",\r\n"
				+ "          \"MBI\": \"77340\",\r\n"
				+ "          \"RecordNumber\": \"26970\",\r\n"
				+ "          \"ClientMemberID\": \"57303\"\r\n"
				+ "        }\r\n"
				+ "      }\r\n"
				+ "    ],\r\n"
				+ "    \"Providers\": [\r\n"
				+ "      {\r\n"
				+ "        \"Provider\": {\r\n"
				+ "          \"Name\": \"Leblanc Chiropractic, Pc\",\r\n"
				+ "          \"LastName\": \"\",\r\n"
				+ "          \"FirstName\": \"\",\r\n"
				+ "          \"Address1\": \"33259 Anthony Streets Suite 145\",\r\n"
				+ "          \"Address2\": \"Suite 358\",\r\n"
				+ "          \"City\": \"West Jenna\",\r\n"
				+ "          \"State\": \"LA\",\r\n"
				+ "          \"Zip\": \"60923\",\r\n"
				+ "          \"NPI\": \"1407032956\",\r\n"
				+ "          \"TIN\": \"628766168\",\r\n"
				+ "          \"Phone1\": \"147-764-4955\",\r\n"
				+ "          \"Phone2\": \"746-655-2864\",\r\n"
				+ "          \"Phone3\": \"586-128-4316\",\r\n"
				+ "          \"Fax\": \"498-946-3184\",\r\n"
				+ "          \"ClientProviderId\": \"3435\"\r\n"
				+ "        }\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"Provider\": {\r\n"
				+ "          \"Name\": \"\",\r\n"
				+ "          \"LastName\": \"Messer\",\r\n"
				+ "          \"FirstName\": \"Michelle\",\r\n"
				+ "          \"Address1\": \"94966 Glass Roads Suite 263\",\r\n"
				+ "          \"Address2\": \"Suite 669\",\r\n"
				+ "          \"City\": \"Davidfurt\",\r\n"
				+ "          \"State\": \"MT\",\r\n"
				+ "          \"Zip\": \"43489\",\r\n"
				+ "          \"NPI\": \"1093156861\",\r\n"
				+ "          \"TIN\": \"967050750\",\r\n"
				+ "          \"Phone1\": \"672-418-1811\",\r\n"
				+ "          \"Phone2\": \"242-244-8446\",\r\n"
				+ "          \"Phone3\": \"366-449-9188\",\r\n"
				+ "          \"Fax\": \"168-994-3569\",\r\n"
				+ "          \"ClientProviderId\": \"619\"\r\n"
				+ "        }\r\n"
				+ "      }\r\n"
				+ "    ]\r\n"
				+ "  }\r\n"
				+ "}";
		return payLoadWithNoMatchingRG;
	}
	
	
	public static  String Old_payLoad_With_Single_Matching_RG(String intendedUse, String accountID, String subAccountID, String cotivitClaimNumber) {		
		String payLoadWithSingleMatchingRG = 
				"{\r\n"
				+ "\"ChaseRequest\": {\r\n"
				+ "\"ChaseRequestHeader\": {\r\n"
				+ "\"IntendedUse\": \""+intendedUse+"\",\r\n"
				+ "\"AuditType\": \"OBV\",\r\n"
				+ "\"ChartType\": \"Medical\",\r\n"
				+ "\"RelatedChaseID\": \"123456789012345\",\r\n"
				+ "\"ExternalChaseNumber\": \"12345678901234512345678901234512\",\r\n"
				+ "\"GlobalWorkforceApproved\": true,\r\n"
				+ "\"ExpirationDate\": \"2024-10-30\",\r\n"
				+ "\"MRAvailableInClientSystem\": false,\r\n"
				+ "\"MRClientSystemDCN\": null,\r\n"
				+ "\"ProspectiveClaimFlag\": false,\r\n"
				+ "\"ClientID\": 12,\r\n"
				+ "\"AccountID\": \""+accountID+"\",\r\n"
				+ "\"SubAccountId\": \""+subAccountID+"\",\r\n"
				+ "\"PortalRequestCode\": \"123456789012345123456789012345\",\r\n"
				+ "\"PlanName\": \"12345678901234512345674567890123451231\",\r\n"
				+ "\"PrimaryChaseRequestProviderRole\": \"RenderingProvider\",\r\n"
				+ "\"ExplicitRequestGroupId\": \"\"\r\n"
				+ "},\r\n"
				
				+ "\"ClaimDetails\": {\r\n"
				+ "\"ClaimType\": \"H\",\r\n"
				+ "\"InNetwork\": true,\r\n"
				+ "\"ClientClaimNumber\": \"4345678451234561\",\r\n"
				+ "\"CotivitiClaimNumber\":\""+cotivitClaimNumber+"\",\r\n"
				+ "\"DateOfServiceStart\": \"2023-02-01\",\r\n"
				+ "\"DateOfServiceEnd\": \"2024-02-15\",\r\n"
				+ "\"TotalClaimAmt\": 1500.14,\r\n"
				+ "\"ProviderSpecialty\": \"1234567890678901211\",\r\n"
				+ "\"PatientMemberIdx\": 2,\r\n"
				+ "\"SubscriberMemberIdx\": 1,\r\n"
				+ "\"BillingProviderIdx\": 1,\r\n"
				+ "\"RenderingProviderIdx\": 2\r\n"
				+ "},\r\n"
				
				+ "\"ChaseDetails\": {\r\n"
				+ "\"DOSChartRangeStart1\": \"2023-06-29\",\r\n"
				+ "\"DOSChartRangeEnd1\": \"2023-06-29\",\r\n"
				+ "\"DOSChartRangeStart2\": \"2023-06-29\",\r\n"
				+ "\"DOSChartRangeEnd2\": \"2023-06-29\",\r\n"
				+ "\"DOSChartRangeStart3\": \"2023-06-29\",\r\n"
				+ "\"DOSChartRangeEnd3\": \"2023-06-29\",\r\n"
				+ "\"DOSChartRangeStart4\": \"2023-06-29\",\r\n"
				+ "\"DOSChartRangeEnd4\": \"2023-06-29\",\r\n"
				+ "\"DeliveryDate\": \"2023-06-29\",\r\n"
				+ "\"RetrievalRank\": 10,\r\n"
				+ "\"HedisMeasureID\": \"HEDIS72\",\r\n"
				+ "\"MeasurementGap\": \"123456789012345123123456789012345123123456\",\r\n"
				+ "\"SubMeasurementGap\": \"SubMeasure2\",\r\n"
				+ "\"IsOversampleFlag\": true,\r\n"
				+ "\"ChasePriority\": \"1234567890\",\r\n"
				+ "\"RADVEnrolleeID\": \"RADV9203\",\r\n"
				+ "\"MedicareAdvantagecontractNumber\": \"MA104\"\r\n"
				+ "},\r\n"
				
				+ "\"Members\": [\r\n"
				+ "{\r\n"
				+ "\"Member\": {\r\n"
				+ "\"LastName\": \"Duncan\",\r\n"
				+ "\"FirstName\": \"Tracey\",\r\n"
				+ "\"Address1\": \"317EvelynCrestApt.969\",\r\n"
				+ "\"Address2\": \"Suite136\",\r\n"
				+ "\"City\": \"NewKristinton\",\r\n"
				+ "\"State\": \"PA\",\r\n"
				+ "\"Zip\": \"52013\",\r\n"
				+ "\"DOB\": \"1953-12-22\",\r\n"
				+ "\"Gender\": \"F\",\r\n"
				+ "\"SSN\": \"345909427\",\r\n"
				+ "\"PatientId\": \"9127\",\r\n"
				+ "\"HICN\": \"205756132\",\r\n"
				+ "\"ControlNumber\": \"6451\",\r\n"
				+ "\"MBI\": \"84429\",\r\n"
				+ "\"RecordNumber\": \"44578\",\r\n"
				+ "\"ClientMemberID\": \"55213\"\r\n"
				+ "}\r\n"
				+ "},\r\n"
				+ "{\r\n"
				
				+ "\"Member\": {\r\n"
				+ "\"LastName\": \"Duncan\",\r\n"
				+ "\"FirstName\": \"Tracey\",\r\n"
				+ "\"Address1\": \"317EvelynCrestApt.969\",\r\n"
				+ "\"Address2\": \"Suite136\",\r\n"
				+ "\"City\": \"NewKristinton\",\r\n"
				+ "\"State\": \"PA\",\r\n"
				+ "\"Zip\": \"52013\",\r\n"
				+ "\"DOB\": \"1953-12-22\",\r\n"
				+ "\"Gender\": \"F\",\r\n"
				+ "\"SSN\": \"345909427\",\r\n"
				+ "\"PatientId\": \"9127\",\r\n"
				+ "\"HICN\": \"205756132\",\r\n"
				+ "\"ControlNumber\": \"6451\",\r\n"
				+ "\"MBI\": \"84429\",\r\n"
				+ "\"RecordNumber\": \"44578\",\r\n"
				+ "\"ClientMemberID\": \"55213\"\r\n"
				+ "}\r\n"
				+ "}\r\n"
				+ "],\r\n"
				
				+ "\"Providers\": [\r\n"
				+ "{\r\n"
				+ "\"Provider\": {\r\n"
				+ "\"Name\": \"Phi Dev Team\",\r\n"
				+ "\"LastName\": \"\",\r\n"
				+ "\"FirstName\": \"\",\r\n"
				+ "\"Address1\": \"4057CherylAlleyApt.580\",\r\n"
				+ "\"Address2\": \"Suite525\",\r\n"
				+ "\"City\": \"Glenview\",\r\n"
				+ "\"State\": \"SD\",\r\n"
				+ "\"Zip\": \"90069\",\r\n"
				+ "\"NPI\": \"1194014597\",\r\n"
				+ "\"TIN\": \"922083658\",\r\n"
				+ "\"Phone1\": \"722-495-6965\",\r\n"
				+ "\"Phone2\": \"080-739-3528\",\r\n"
				+ "\"Phone3\": \"810-993-3037\",\r\n"
				+ "\"Fax\": \"425-611-6685\",\r\n"
				+ "\"ClientProviderId\": \"4398\"\r\n"
				+ "}\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"Provider\": {\r\n"
				+ "\"Name\": \"Phi QA Automation Team\",\r\n"
				+ "\"LastName\": \"Schackmann\",\r\n"
				+ "\"FirstName\": \"Kathy\",\r\n"
				+ "\"Address1\": \"25672JesusLocks\",\r\n"
				+ "\"Address2\": \"Apt.477\",\r\n"
				+ "\"City\": \"Racheltown\",\r\n"
				+ "\"State\": \"CO\",\r\n"
				+ "\"Zip\": \"67397\",\r\n"
				+ "\"NPI\": \"1568863264\",\r\n"
				+ "\"TIN\": \"922083658\",\r\n"
				+ "\"Phone1\": \"497-325-3898\",\r\n"
				+ "\"Phone2\": \"068-091-2823\",\r\n"
				+ "\"Phone3\": \"445-437-8054\",\r\n"
				+ "\"Fax\": \"967-671-5938\",\r\n"
				+ "\"ClientProviderId\": \"5243\"\r\n"
				+ "}\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}\r\n"
				+ "}";
		return payLoadWithSingleMatchingRG;
	}
	public static  String Old_payLoad_With_No_Matching_RG(String intendedUse, String accountID, String subAccountID, String cotivitClaimNumber) {		
		String payLoadWithNoMatchingRG = 
				"{\r\n"
				+ "\"ChaseRequest\": {\r\n"
				+ "\"ChaseRequestHeader\": {\r\n"
				+ "\"IntendedUse\": \""+intendedUse+"\",\r\n"
				+ "\"AuditType\": \"OBV\",\r\n"
				+ "\"ChartType\": \"Medical\",\r\n"
				+ "\"RelatedChaseID\": \"123456789012345\",\r\n"
				+ "\"ExternalChaseNumber\": \"12345678901234512345678901234512\",\r\n"
				+ "\"GlobalWorkforceApproved\": true,\r\n"
				+ "\"ExpirationDate\": \"2024-10-30\",\r\n"
				+ "\"MRAvailableInClientSystem\": false,\r\n"
				+ "\"MRClientSystemDCN\": null,\r\n"
				+ "\"ProspectiveClaimFlag\": false,\r\n"
				+ "\"ClientID\": 10,\r\n"
				+ "\"AccountID\": \""+accountID+"\",\r\n"
				+ "\"SubAccountId\": \""+subAccountID+"\",\r\n"
				+ "\"PortalRequestCode\": \"123456789012345123456789012345\",\r\n"
				+ "\"PlanName\": \"12345678901234512345674567890123451231\",\r\n"
				+ "\"PrimaryChaseRequestProviderRole\": \"RenderingProvider\",\r\n"
				+ "\"ExplicitRequestGroupId\": \"\"\r\n"
				+ "},\r\n"
				
				+ "\"ClaimDetails\": {\r\n"
				+ "\"ClaimType\": \"H\",\r\n"
				+ "\"InNetwork\": true,\r\n"
				+ "\"ClientClaimNumber\": \"4345678451234561\",\r\n"
				+ "\"CotivitiClaimNumber\":\""+cotivitClaimNumber+"\",\r\n"
				+ "\"DateOfServiceStart\": \"2023-02-01\",\r\n"
				+ "\"DateOfServiceEnd\": \"2024-02-15\",\r\n"
				+ "\"TotalClaimAmt\": 1500.14,\r\n"
				+ "\"ProviderSpecialty\": \"1234567890678901211\",\r\n"
				+ "\"PatientMemberIdx\": 2,\r\n"
				+ "\"SubscriberMemberIdx\": 1,\r\n"
				+ "\"BillingProviderIdx\": 1,\r\n"
				+ "\"RenderingProviderIdx\": 2\r\n"
				+ "},\r\n"
				
				+ "\"ChaseDetails\": {\r\n"
				+ "\"DOSChartRangeStart1\": \"2023-06-29\",\r\n"
				+ "\"DOSChartRangeEnd1\": \"2023-06-29\",\r\n"
				+ "\"DOSChartRangeStart2\": \"2023-06-29\",\r\n"
				+ "\"DOSChartRangeEnd2\": \"2023-06-29\",\r\n"
				+ "\"DOSChartRangeStart3\": \"2023-06-29\",\r\n"
				+ "\"DOSChartRangeEnd3\": \"2023-06-29\",\r\n"
				+ "\"DOSChartRangeStart4\": \"2023-06-29\",\r\n"
				+ "\"DOSChartRangeEnd4\": \"2023-06-29\",\r\n"
				+ "\"DeliveryDate\": \"2023-06-29\",\r\n"
				+ "\"RetrievalRank\": 10,\r\n"
				+ "\"HedisMeasureID\": \"HEDIS72\",\r\n"
				+ "\"MeasurementGap\": \"123456789012345123123456789012345123123456\",\r\n"
				+ "\"SubMeasurementGap\": \"SubMeasure2\",\r\n"
				+ "\"IsOversampleFlag\": true,\r\n"
				+ "\"ChasePriority\": \"1234567890\",\r\n"
				+ "\"RADVEnrolleeID\": \"RADV9203\",\r\n"
				+ "\"MedicareAdvantagecontractNumber\": \"MA104\"\r\n"
				+ "},\r\n"
				
				+ "\"Members\": [\r\n"
				+ "{\r\n"
				+ "\"Member\": {\r\n"
				+ "\"LastName\": \"Duncan\",\r\n"
				+ "\"FirstName\": \"Tracey\",\r\n"
				+ "\"Address1\": \"317EvelynCrestApt.969\",\r\n"
				+ "\"Address2\": \"Suite136\",\r\n"
				+ "\"City\": \"NewKristinton\",\r\n"
				+ "\"State\": \"PA\",\r\n"
				+ "\"Zip\": \"52013\",\r\n"
				+ "\"DOB\": \"1953-12-22\",\r\n"
				+ "\"Gender\": \"F\",\r\n"
				+ "\"SSN\": \"345909427\",\r\n"
				+ "\"PatientId\": \"9127\",\r\n"
				+ "\"HICN\": \"205756132\",\r\n"
				+ "\"ControlNumber\": \"6451\",\r\n"
				+ "\"MBI\": \"84429\",\r\n"
				+ "\"RecordNumber\": \"44578\",\r\n"
				+ "\"ClientMemberID\": \"55213\"\r\n"
				+ "}\r\n"
				+ "},\r\n"
				+ "{\r\n"
				
				+ "\"Member\": {\r\n"
				+ "\"LastName\": \"Duncan\",\r\n"
				+ "\"FirstName\": \"Tracey\",\r\n"
				+ "\"Address1\": \"317EvelynCrestApt.969\",\r\n"
				+ "\"Address2\": \"Suite136\",\r\n"
				+ "\"City\": \"NewKristinton\",\r\n"
				+ "\"State\": \"PA\",\r\n"
				+ "\"Zip\": \"52013\",\r\n"
				+ "\"DOB\": \"1953-12-22\",\r\n"
				+ "\"Gender\": \"F\",\r\n"
				+ "\"SSN\": \"345909427\",\r\n"
				+ "\"PatientId\": \"9127\",\r\n"
				+ "\"HICN\": \"205756132\",\r\n"
				+ "\"ControlNumber\": \"6451\",\r\n"
				+ "\"MBI\": \"84429\",\r\n"
				+ "\"RecordNumber\": \"44578\",\r\n"
				+ "\"ClientMemberID\": \"55213\"\r\n"
				+ "}\r\n"
				+ "}\r\n"
				+ "],\r\n"
				
				+ "\"Providers\": [\r\n"
				+ "{\r\n"
				+ "\"Provider\": {\r\n"
				+ "\"Name\": \"Phi Dev Team\",\r\n"
				+ "\"LastName\": \"\",\r\n"
				+ "\"FirstName\": \"\",\r\n"
				+ "\"Address1\": \"4057CherylAlleyApt.580\",\r\n"
				+ "\"Address2\": \"Suite525\",\r\n"
				+ "\"City\": \"Glenview\",\r\n"
				+ "\"State\": \"SD\",\r\n"
				+ "\"Zip\": \"90069\",\r\n"
				+ "\"NPI\": \"1194014597\",\r\n"
				+ "\"TIN\": \"922083658\",\r\n"
				+ "\"Phone1\": \"722-495-6965\",\r\n"
				+ "\"Phone2\": \"080-739-3528\",\r\n"
				+ "\"Phone3\": \"810-993-3037\",\r\n"
				+ "\"Fax\": \"425-611-6685\",\r\n"
				+ "\"ClientProviderId\": \"4398\"\r\n"
				+ "}\r\n"
				+ "},\r\n"
				+ "{\r\n"
				+ "\"Provider\": {\r\n"
				+ "\"Name\": \"Phi QA Team\",\r\n"
				+ "\"LastName\": \"Schackmann\",\r\n"
				+ "\"FirstName\": \"Kathy\",\r\n"
				+ "\"Address1\": \"25672JesusLocks\",\r\n"
				+ "\"Address2\": \"Apt.477\",\r\n"
				+ "\"City\": \"Racheltown\",\r\n"
				+ "\"State\": \"CO\",\r\n"
				+ "\"Zip\": \"67397\",\r\n"
				+ "\"NPI\": \"1568863264\",\r\n"
				+ "\"TIN\": \"922083658\",\r\n"
				+ "\"Phone1\": \"497-325-3898\",\r\n"
				+ "\"Phone2\": \"068-091-2823\",\r\n"
				+ "\"Phone3\": \"445-437-8054\",\r\n"
				+ "\"Fax\": \"967-671-5938\",\r\n"
				+ "\"ClientProviderId\": \"5243\"\r\n"
				+ "}\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}\r\n"
				+ "}";
		return payLoadWithNoMatchingRG;
	}
	
	
	

	

}


