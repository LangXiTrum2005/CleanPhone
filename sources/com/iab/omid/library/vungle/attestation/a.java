package com.iab.omid.library.vungle.attestation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    private final Map<String, String> a;

    public a(Map<String, String> map) {
        this.a = map == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(map));
    }

    public Map<String, String> a() {
        return this.a;
    }
}
