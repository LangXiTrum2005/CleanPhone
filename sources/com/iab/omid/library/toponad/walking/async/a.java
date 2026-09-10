package com.iab.omid.library.toponad.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f22407c;
    protected final JSONObject d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f22408e;

    public a(b.InterfaceC0249b interfaceC0249b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0249b);
        this.f22407c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.f22408e = j;
    }
}
