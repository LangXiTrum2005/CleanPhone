package com.iab.omid.library.startio.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f22307c;
    protected final JSONObject d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f22308e;

    public a(b.InterfaceC0245b interfaceC0245b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0245b);
        this.f22307c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.f22308e = j;
    }
}
