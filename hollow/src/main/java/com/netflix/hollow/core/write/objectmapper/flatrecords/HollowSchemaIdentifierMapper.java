package com.netflix.hollow.core.write.objectmapper.flatrecords;

import com.netflix.hollow.core.schema.HollowObjectSchema.FieldType;
import com.netflix.hollow.core.schema.HollowSchema;

/**
 * Warning: Experimental.  the FlatRecord feature is subject to breaking changes.
 */
public interface HollowSchemaIdentifierMapper {
	
	public HollowSchema getSchema(int identifier);
	
	public FieldType[] getPrimaryKeyFieldTypes(int identifier);
	
	public int getSchemaId(HollowSchema schema);
	
}
