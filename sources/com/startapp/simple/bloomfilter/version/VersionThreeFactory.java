package com.startapp.simple.bloomfilter.version;

import com.startapp.simple.bloomfilter.algo.BitSetHandling;
import com.startapp.simple.bloomfilter.compression.NoCompression;
import com.startapp.simple.bloomfilter.creation.TokenToBitSetVersionsOneAndThree;

/* JADX INFO: loaded from: classes6.dex */
class VersionThreeFactory extends VersionFactory {
    /* JADX WARN: Illegal instructions before constructor call */
    public VersionThreeFactory() {
        BloomVersion bloomVersion = BloomVersion.THREE;
        super(bloomVersion, new NoCompression(), new TokenToBitSetVersionsOneAndThree(), new BitSetHandling(bloomVersion.getNumberOfHashes(), bloomVersion.getSizeOfBucket()));
    }
}
