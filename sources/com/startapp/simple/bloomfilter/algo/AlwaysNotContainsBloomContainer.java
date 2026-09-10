package com.startapp.simple.bloomfilter.algo;

import com.startapp.simple.bloomfilter.version.BloomVersion;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class AlwaysNotContainsBloomContainer implements BloomContainer {
    private final BloomVersion bloomVersion;

    public AlwaysNotContainsBloomContainer(BloomVersion bloomVersion) {
        this.bloomVersion = bloomVersion;
    }

    @Override // com.startapp.simple.bloomfilter.algo.BloomContainer
    public void addNewKeys(List<String> list) {
    }

    @Override // com.startapp.simple.bloomfilter.algo.BloomContainer
    public boolean contains(String str) {
        return false;
    }

    @Override // com.startapp.simple.bloomfilter.algo.BloomContainer
    public OpenBitSet getBitSet() {
        return new OpenBitSet(0L);
    }

    @Override // com.startapp.simple.bloomfilter.algo.BloomContainer
    public BloomVersion getBloomVersion() {
        return this.bloomVersion;
    }

    @Override // com.startapp.simple.bloomfilter.algo.BloomContainer
    public boolean isValid() {
        return false;
    }

    @Override // com.startapp.simple.bloomfilter.algo.BloomContainer
    public boolean contains(long[] jArr) {
        return false;
    }
}
