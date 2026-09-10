package com.iab.omid.library.bigosg.walking.a;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final HashSet<String> f21710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JSONObject f21711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final long f21712c;

    public a(b.InterfaceC0220b interfaceC0220b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0220b);
        this.f21710a = new HashSet<>(hashSet);
        this.f21711b = jSONObject;
        this.f21712c = j;
    }
}
