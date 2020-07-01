package com.ygs.ukraniansignrecog.layouts.model.network;

import com.ygs.ukraniansignrecog.annotation.DatasetType;
import com.ygs.ukraniansignrecog.annotation.DecoderType;
import com.ygs.ukraniansignrecog.annotation.LocalType;
import com.ygs.ukraniansignrecog.annotation.SkeletonType;

import java.util.List;

public class UpdateSignDataSetRequest {
    private UpdateSignDataSetRequest() {
    }

    @LocalType
    private int localType;
    @DecoderType
    private int methodType;
    @DatasetType
    private int datasetType;
    @SkeletonType
    private List<Integer> skeletonType;

    public static class Builder {
        private int localType;
        private int methodType;
        private int datasetType;
        private List<Integer> skeletonType;

        public Builder setDatasetType(@DatasetType int datasetType) {
            this.datasetType = datasetType;
            return this;
        }

        public Builder setSkeletonTypes(@SkeletonType List<Integer> skeletonType) {
            this.skeletonType = skeletonType;
            return this;
        }

        public Builder setMethodType(@DecoderType int methodType) {
            this.methodType = methodType;
            return this;
        }

        public Builder setLocalType(@LocalType int localType){
            this.localType = localType;
            return this;
        }

        public UpdateSignDataSetRequest build() {
            UpdateSignDataSetRequest instance = new UpdateSignDataSetRequest();
            instance.datasetType = datasetType;
            instance.methodType = methodType;
            instance.localType = localType;
            instance.skeletonType = skeletonType;
            return instance;
        }
    }
}
