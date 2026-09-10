package com.startapp.simple.bloomfilter.algo;

import com.startapp.simple.bloomfilter.version.BloomVersion;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface BloomContainer {
    void addNewKeys(List<String> list);

    boolean contains(String str);

    boolean contains(long[] jArr);

    OpenBitSet getBitSet();

    BloomVersion getBloomVersion();

    boolean isValid();
}
