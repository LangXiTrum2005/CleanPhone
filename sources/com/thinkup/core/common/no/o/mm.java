package com.thinkup.core.common.no.o;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class mm<K, V> extends LinkedHashMap<K, V> {
    private int o;

    public mm() {
        this((byte) 0);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
        return size() > this.o;
    }

    private mm(byte b2) {
        super(256, 1.0f, true);
        this.o = 256;
    }
}
