package com.startapp.simple.bloomfilter.version;

import com.startapp.simple.bloomfilter.algo.BitSetHandling;
import com.startapp.simple.bloomfilter.compression.GZipBase64TokenCompression;
import com.startapp.simple.bloomfilter.compression.ToUrlStringReplacer;
import com.startapp.simple.bloomfilter.creation.DeserializerTokenToBitSet;

/* JADX INFO: loaded from: classes6.dex */
class VersionFourFactory extends VersionFactory {
    /* JADX WARN: Illegal instructions before constructor call */
    public VersionFourFactory() {
        BloomVersion bloomVersion = BloomVersion.FOUR;
        super(bloomVersion, new GZipBase64TokenCompression(new ToUrlStringReplacer()), new DeserializerTokenToBitSet(bloomVersion.getNumberOfHashes(), bloomVersion.getSizeOfBucket()), new BitSetHandling(bloomVersion.getNumberOfHashes(), bloomVersion.getSizeOfBucket()));
    }
}
