package com.startapp.simple.bloomfilter.algo;

import com.startapp.simple.bloomfilter.codec.StringUtils;
import com.startapp.simple.bloomfilter.version.BloomVersion;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class BloomContainerWithValidBitSet implements BloomContainer {
    private final OpenBitSet bitSet;
    private final BitSetHandling bitSetHandling;
    private final BloomVersion bloomVersion;

    public BloomContainerWithValidBitSet(BitSetHandling bitSetHandling, OpenBitSet openBitSet, BloomVersion bloomVersion) {
        this.bitSetHandling = bitSetHandling;
        this.bitSet = openBitSet;
        this.bloomVersion = bloomVersion;
    }

    @Override // com.startapp.simple.bloomfilter.algo.BloomContainer
    public void addNewKeys(List<String> list) {
        this.bitSetHandling.fillBitSetWithKeys(list, this.bitSet);
    }

    @Override // com.startapp.simple.bloomfilter.algo.BloomContainer
    public boolean contains(String str) {
        if (StringUtils.isBlank(str)) {
            return false;
        }
        return this.bitSetHandling.isPresent(str, this.bitSet);
    }

    @Override // com.startapp.simple.bloomfilter.algo.BloomContainer
    public OpenBitSet getBitSet() {
        return this.bitSet;
    }

    @Override // com.startapp.simple.bloomfilter.algo.BloomContainer
    public BloomVersion getBloomVersion() {
        return this.bloomVersion;
    }

    @Override // com.startapp.simple.bloomfilter.algo.BloomContainer
    public boolean isValid() {
        return true;
    }

    @Override // com.startapp.simple.bloomfilter.algo.BloomContainer
    public boolean contains(long[] jArr) {
        if (jArr == null) {
            return false;
        }
        return this.bitSetHandling.isPresent(jArr, this.bitSet);
    }
}
