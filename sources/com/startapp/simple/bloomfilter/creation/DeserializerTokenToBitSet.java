package com.startapp.simple.bloomfilter.creation;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import java.io.DataInput;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class DeserializerTokenToBitSet extends TokenToBitSet {
    private final int numberOfHashes;
    private final int sizeOfBucket;

    public DeserializerTokenToBitSet(int i2, int i3) {
        this.numberOfHashes = i2;
        this.sizeOfBucket = i3;
    }

    @Override // com.startapp.simple.bloomfilter.creation.TokenToBitSet
    public OpenBitSet createOpenBitSet(DataInput dataInput) throws IOException {
        OpenBitSet openBitSet = new OpenBitSet(this.numberOfHashes * this.sizeOfBucket);
        fillBitSet(dataInput, openBitSet, openBitSet.getNumWords());
        return openBitSet;
    }
}
