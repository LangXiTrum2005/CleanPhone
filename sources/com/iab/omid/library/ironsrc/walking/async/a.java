package com.iab.omid.library.ironsrc.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f25322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f25323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f25324e;

    public a(b.InterfaceC0029b interfaceC0029b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0029b);
        this.f25322c = new HashSet<>(hashSet);
        this.f25323d = jSONObject;
        this.f25324e = j10;
    }
}
