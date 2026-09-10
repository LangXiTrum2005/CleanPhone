package com.iab.omid.library.chartboost.walking;

import com.iab.omid.library.chartboost.walking.async.d;
import com.iab.omid.library.chartboost.walking.async.e;
import com.iab.omid.library.chartboost.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b implements com.iab.omid.library.chartboost.walking.async.b.InterfaceC0229b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f21917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.chartboost.walking.async.c f21918b;

    public b(com.iab.omid.library.chartboost.walking.async.c cVar) {
        this.f21918b = cVar;
    }

    @Override // com.iab.omid.library.chartboost.walking.async.b.InterfaceC0229b
    public JSONObject a() {
        return this.f21917a;
    }

    public void b() {
        this.f21918b.b(new d(this));
    }

    @Override // com.iab.omid.library.chartboost.walking.async.b.InterfaceC0229b
    public void a(JSONObject jSONObject) {
        this.f21917a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f21918b.b(new f(this, hashSet, jSONObject, j));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f21918b.b(new e(this, hashSet, jSONObject, j));
    }
}
