package io.commercelayer.api.test.integration;

import org.junit.Assert;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Application;
import io.commercelayer.api.operation.DeleteAccountApplicationsId;
import io.commercelayer.api.operation.GetAccountApplicationsId;
import io.commercelayer.api.operation.PostAccountApplications;
import io.commercelayer.api.operation.PutAccountApplicationsId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;

/**
 * ApplicationTest
 */
public class ApplicationTest extends IntegrationTest<Application> {

	@Override
	public ApiResponse<Application> crudCreateTest(ApiCaller caller) {

		// POST

		PostAccountApplications postOp = ApiOperations.PostAccountApplications();

		Application a = new Application();

		a.setName(randomField("Application"));

		postOp.setPayload(a);

		ApiRequest<PostAccountApplications> postReq = new ApiRequest<>(postOp);
		
		ApiResponse<Application> postRes = test(postReq, caller);

		Assert.assertNotNull(postRes.getResource().getId());

		return postRes;

	}


	@Override
	public ApiResponse<Application> crudReadTest(Application res, ApiCaller caller) {

		// GET

		GetAccountApplicationsId getOp = ApiOperations.GetAccountApplicationsId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountApplicationsId> getReq = new ApiRequest<>(getOp);
		
		ApiResponse<Application> getRes = test(getReq, caller);

		Assert.assertNotNull(getRes.getResource().getName());

		return getRes;

	}


	@Override
	public ApiResponse<Application> crudUpdateTest(Application oldRes, ApiCaller caller) {

		// PUT

		PutAccountApplicationsId putOp = ApiOperations.PutAccountApplicationsId();
		putOp.setId(oldRes.getId());

		Application a = new Application();

		a.setName(randomField(oldRes.getName()));

		putOp.setPayload(a);

		ApiRequest<PutAccountApplicationsId> putReq = new ApiRequest<>(putOp);
		
		ApiResponse<Application> putRes = test(putReq, caller);

		Assert.assertNotEquals(oldRes.getName(), putRes.getResource().getName());

		return putRes;

	}


	@Override
	public ApiResponse<Application> crudDeleteTest(Application res, ApiCaller caller) {

		// DELETE

		DeleteAccountApplicationsId delOp = ApiOperations.DeleteAccountApplicationsId();
		delOp.setId(res.getId());

		ApiRequest<DeleteAccountApplicationsId> delReq = new ApiRequest<>(delOp);
		
		ApiResponse<Application> delRes = test(delReq, caller);

		// GET

		GetAccountApplicationsId getOp = ApiOperations.GetAccountApplicationsId();
		getOp.setId(res.getId());

		ApiRequest<GetAccountApplicationsId> getReq = new ApiRequest<>(getOp);
		
		ApiResponse<Application> getRes = test(getReq, caller, false);

		Assert.assertNull(getRes.getResource());

		return delRes;

	}


	public static void main(String[] args) {

		ApplicationTest test = new ApplicationTest();

		test.runTest();

		// testCreate();
		// testRead();
		// testUpdate();
		// testDelete();

	}

}
