package com.iab.omid.library.unity3d.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final HashSet<String> f25582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final JSONObject f25583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final long f25584e;

    public a(b.InterfaceC0037b interfaceC0037b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0037b);
        this.f25582c = new HashSet<>(hashSet);
        this.f25583d = jSONObject;
        this.f25584e = j10;
    }
}
