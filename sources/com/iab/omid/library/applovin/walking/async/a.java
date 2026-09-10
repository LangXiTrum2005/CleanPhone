package com.iab.omid.library.applovin.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f25188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f25189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f25190e;

    public a(b.InterfaceC0025b interfaceC0025b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0025b);
        this.f25188c = new HashSet<>(hashSet);
        this.f25189d = jSONObject;
        this.f25190e = j10;
    }
}
