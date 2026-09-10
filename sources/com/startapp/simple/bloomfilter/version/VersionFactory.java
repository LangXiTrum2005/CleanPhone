package com.startapp.simple.bloomfilter.version;

import com.startapp.simple.bloomfilter.algo.BitSetHandling;
import com.startapp.simple.bloomfilter.compression.TokenCompression;
import com.startapp.simple.bloomfilter.creation.TokenToBitSet;

/* JADX INFO: loaded from: classes6.dex */
abstract class VersionFactory {
    private final BitSetHandling bitSetHandling;
    private final BloomVersion bloomVersion;
    private final TokenCompression tokenCompression;
    private final TokenToBitSet tokenToBitSet;

    public VersionFactory(BloomVersion bloomVersion, TokenCompression tokenCompression, TokenToBitSet tokenToBitSet, BitSetHandling bitSetHandling) {
        this.bloomVersion = bloomVersion;
        this.tokenCompression = tokenCompression;
        this.tokenToBitSet = tokenToBitSet;
        this.bitSetHandling = bitSetHandling;
    }

    public final BitSetHandling getBitSetHandling() {
        return this.bitSetHandling;
    }

    public final BloomVersion getBloomVersion() {
        return this.bloomVersion;
    }

    public final TokenCompression getTokenCompression() {
        return this.tokenCompression;
    }

    public final TokenToBitSet getTokenToBitSet() {
        return this.tokenToBitSet;
    }
}
