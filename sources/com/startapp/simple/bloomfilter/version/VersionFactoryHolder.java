package com.startapp.simple.bloomfilter.version;

import com.startapp.simple.bloomfilter.algo.BitSetHandling;
import com.startapp.simple.bloomfilter.compression.TokenCompression;
import com.startapp.simple.bloomfilter.creation.TokenToBitSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class VersionFactoryHolder {
    private final Map<BloomVersion, VersionFactory> factories;

    public VersionFactoryHolder() {
        HashMap map = new HashMap();
        this.factories = map;
        map.put(BloomVersion.ZERO, new VersionZeroFactory());
        map.put(BloomVersion.THREE, new VersionThreeFactory());
        map.put(BloomVersion.FOUR, new VersionFourFactory());
        map.put(BloomVersion.FIVE, new VersionFiveFactory());
    }

    public BitSetHandling getBitSetHandling(BloomVersion bloomVersion) {
        return this.factories.get(bloomVersion).getBitSetHandling();
    }

    public BloomVersion getBloomVersion(BloomVersion bloomVersion) {
        return this.factories.get(bloomVersion).getBloomVersion();
    }

    public TokenCompression getTokenCompression(BloomVersion bloomVersion) {
        return this.factories.get(bloomVersion).getTokenCompression();
    }

    public TokenToBitSet getTokenToBitSet(BloomVersion bloomVersion) {
        return this.factories.get(bloomVersion).getTokenToBitSet();
    }
}
