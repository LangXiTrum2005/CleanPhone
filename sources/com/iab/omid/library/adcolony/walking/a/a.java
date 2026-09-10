package com.iab.omid.library.adcolony.walking.a;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final HashSet<String> f21519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JSONObject f21520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final long f21521c;

    public a(b.InterfaceC0213b interfaceC0213b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0213b);
        this.f21519a = new HashSet<>(hashSet);
        this.f21520b = jSONObject;
        this.f21521c = j;
    }
}
