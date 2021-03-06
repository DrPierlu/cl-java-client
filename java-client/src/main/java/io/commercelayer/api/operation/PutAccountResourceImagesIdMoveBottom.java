package io.commercelayer.api.operation;

import io.commercelayer.api.model.ResourceImage;
import io.commercelayer.api.operation.common.MoveOperation;


/**
 * PutAccountResourceImagesIdMoveBottom
 */
public class PutAccountResourceImagesIdMoveBottom extends MoveOperation<ResourceImage> {

	public static final String OPERATION_PATH = "/account/resource_images/{id}/move_bottom";


	public PutAccountResourceImagesIdMoveBottom() {
		super(OPERATION_PATH);
	}
	

	public PutAccountResourceImagesIdMoveBottom(Long id) {
		super(OPERATION_PATH, id);
	}
	

	public Class<ResourceImage> getResourceType() {
		return ResourceImage.class;
	}
	
}
