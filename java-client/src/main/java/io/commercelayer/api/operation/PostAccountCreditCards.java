package io.commercelayer.api.operation;

import io.commercelayer.api.operation.common.PostOperation;

/**
 * PostAccountCreditCards
 */
public class PostAccountCreditCards extends PostOperation {

	public static final String OPERATION_PATH = "/account/credit_cards";


	{
		addRequiredField("firstName");
		addRequiredField("lastName");
		addRequiredField("number");
		addRequiredField("month");
		addRequiredField("year");
	}


	public PostAccountCreditCards() {
		super(OPERATION_PATH);
	}
	
}
