package io.commercelayer.api.test.generated;

import io.commercelayer.api.ApiCaller;
import io.commercelayer.api.ApiRequest;
import io.commercelayer.api.ApiResponse;
import io.commercelayer.api.model.Order;
import io.commercelayer.api.operation.DeleteAccountOrdersId;
import io.commercelayer.api.operation.GetCustomerOrdersId;
import io.commercelayer.api.operation.PostChannelOrders;
import io.commercelayer.api.operation.PutCustomerOrdersId;
import io.commercelayer.api.operation.common.util.ApiOperations;
import io.commercelayer.api.test.common.IntegrationTest;
import io.commercelayer.api.test.common.TestException;
import org.junit.Assert;


/**
 * OrderTest
 */
public class OrderTest extends IntegrationTest<Order> {

	@Override
	public ApiResponse<Order> crudCreateTest(ApiCaller caller) {
	
		// POST
	
		PostChannelOrders postOp = ApiOperations.PostChannelOrders();
	
		Order res = new Order();
	
		// FIELD NOT FOUND -> res.setCustomerAttributes("customerAttributes");
		// FIELD NOT FOUND -> res.setLineItemAttributes("lineItemAttributes");
		// FIELD NOT FOUND -> res.setCustomerId("customerId");
	
		postOp.setPayload(res);
	
	
		ApiRequest<PostChannelOrders> postReq = new ApiRequest<>(postOp);
	
		ApiResponse<Order> postRes = test(postReq, caller);
	
	
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getCustomerAttributes());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getLineItemAttributes());
		// FIELD NOT FOUND -> Assert.assertNotNull(postRes.getResource().getCustomerId());
	
	
		return postRes;
	
	}
	

	@Override
	public ApiResponse<Order> crudReadTest(Order res, ApiCaller caller) {
	
		// GET
	
		GetCustomerOrdersId getOp = ApiOperations.GetCustomerOrdersId();
		getOp.setId(res.getId());
	
	
		ApiRequest<GetCustomerOrdersId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Order> getRes = test(getReq, caller);
	
	
		/* No test assertions */
	
	
		return getRes;
	
	}
	

	@Override
	public ApiResponse<Order> crudUpdateTest(Order oldRes, ApiCaller caller) {
	
		// PUT
	
		PutCustomerOrdersId putOp = ApiOperations.PutCustomerOrdersId();
		putOp.setId(oldRes.getId());
	
		Order res = new Order();
	
	
	
		putOp.setPayload(res);
	
	
		ApiRequest<PutCustomerOrdersId> putReq = new ApiRequest<>(putOp);
	
		ApiResponse<Order> putRes = test(putReq, caller);
	
	
	
	
	
		return putRes;
	
	}
	

	@Override
	public ApiResponse<Order> crudDeleteTest(Order res, ApiCaller caller) {
	
		// DELETE
	
		DeleteAccountOrdersId delOp = ApiOperations.DeleteAccountOrdersId();
		delOp.setId(res.getId());
	
		ApiRequest<DeleteAccountOrdersId> delReq = new ApiRequest<>(delOp);
	
		ApiResponse<Order> delRes = test(delReq, caller);
	
		// GET
	
		GetCustomerOrdersId getOp = ApiOperations.GetCustomerOrdersId();
		getOp.setId(res.getId());
	
		ApiRequest<GetCustomerOrdersId> getReq = new ApiRequest<>(getOp);
	
		ApiResponse<Order> getRes = null;
	
		try {
			getRes = test(getReq, caller, false);
		}
		catch (TestException te) {
			if (te.causedByApiError()) {
				Assert.assertTrue(te.getError().getHttpErrorCode() == 404);
				Assert.assertNull(getRes);
			}
			else throw te;
		}
	
	
		return delRes;
	
	}
	

	public static void main(String[] args) {
	
		OrderTest test = new OrderTest();
	
		test.runTest();
	
		// crudCreateTest();
		// crudReadTest();
		// crudUpdateTest();
		// crudDeleteTest();
	
	}
	
}
