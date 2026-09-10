package com.startapp.simple.bloomfilter.version;

import com.startapp.simple.bloomfilter.algo.BitSetHandling;
import com.startapp.simple.bloomfilter.compression.NoCompression;
import com.startapp.simple.bloomfilter.creation.TokenToBitSetVersionsOneAndThree;

/* JADX INFO: loaded from: classes6.dex */
class VersionZeroFactory extends VersionFactory {
    /* JADX WARN: Illegal instructions before constructor call */
    public VersionZeroFactory() {
        BloomVersion bloomVersion = BloomVersion.ZERO;
        super(bloomVersion, new NoCompression(), new TokenToBitSetVersionsOneAndThree(), new BitSetHandling(bloomVersion.getNumberOfHashes(), bloomVersion.getSizeOfBucket()));
    }
}
