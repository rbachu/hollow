package com.netflix.vms.transformer.input.api.gen.oscar;

import com.netflix.hollow.api.objects.delegate.HollowObjectAbstractDelegate;
import com.netflix.hollow.core.read.dataaccess.HollowObjectTypeDataAccess;
import com.netflix.hollow.core.schema.HollowObjectSchema;

@SuppressWarnings("all")
public class MovieReleaseTypeDelegateLookupImpl extends HollowObjectAbstractDelegate implements MovieReleaseTypeDelegate {

    private final MovieReleaseTypeTypeAPI typeAPI;

    public MovieReleaseTypeDelegateLookupImpl(MovieReleaseTypeTypeAPI typeAPI) {
        this.typeAPI = typeAPI;
    }

    public String get_name(int ordinal) {
        return typeAPI.get_name(ordinal);
    }

    public boolean is_nameEqual(int ordinal, String testValue) {
        return typeAPI.is_nameEqual(ordinal, testValue);
    }

    public MovieReleaseTypeTypeAPI getTypeAPI() {
        return typeAPI;
    }

    @Override
    public HollowObjectSchema getSchema() {
        return typeAPI.getTypeDataAccess().getSchema();
    }

    @Override
    public HollowObjectTypeDataAccess getTypeDataAccess() {
        return typeAPI.getTypeDataAccess();
    }

}