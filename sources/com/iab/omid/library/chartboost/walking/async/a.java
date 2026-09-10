package com.iab.omid.library.chartboost.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f21910c;
    protected final JSONObject d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f21911e;

    public a(b.InterfaceC0229b interfaceC0229b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0229b);
        this.f21910c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.f21911e = j;
    }
}
