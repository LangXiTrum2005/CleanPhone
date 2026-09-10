package com.iab.omid.library.mmadbridge.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f25456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f25457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f25458e;

    public a(b.InterfaceC0033b interfaceC0033b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0033b);
        this.f25456c = new HashSet<>(hashSet);
        this.f25457d = jSONObject;
        this.f25458e = j10;
    }
}
