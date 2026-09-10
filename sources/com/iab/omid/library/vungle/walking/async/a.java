package com.iab.omid.library.vungle.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f22606c;
    protected final JSONObject d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f22607e;

    public a(b.InterfaceC0258b interfaceC0258b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0258b);
        this.f22606c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.f22607e = j;
    }
}
