package com.iab.omid.library.bytedance2.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f21806c;
    protected final JSONObject d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f21807e;

    public a(b.InterfaceC0224b interfaceC0224b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0224b);
        this.f21806c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.f21807e = j;
    }
}
