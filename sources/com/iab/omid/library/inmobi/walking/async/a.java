package com.iab.omid.library.inmobi.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f22011c;
    protected final JSONObject d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f22012e;

    public a(b.InterfaceC0233b interfaceC0233b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0233b);
        this.f22011c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.f22012e = j;
    }
}
