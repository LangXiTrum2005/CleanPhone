package com.appsflyer.adrevenue.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class AFChainMap<K, V> extends HashMap<K, V> {
    public AFChainMap<K, V> place(K k, V v) {
        put(k, v);
        return this;
    }
}
