package com.iab.omid.library.applovin.walking;

import com.iab.omid.library.applovin.walking.async.d;
import com.iab.omid.library.applovin.walking.async.e;
import com.iab.omid.library.applovin.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b implements com.iab.omid.library.applovin.walking.async.b.InterfaceC0025b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f25197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.walking.async.c f25198b;

    public b(com.iab.omid.library.applovin.walking.async.c cVar) {
        this.f25198b = cVar;
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0025b
    public JSONObject a() {
        return this.f25197a;
    }

    public void b() {
        this.f25198b.b(new d(this));
    }

    @Override // com.iab.omid.library.applovin.walking.async.b.InterfaceC0025b
    public void a(JSONObject jSONObject) {
        this.f25197a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f25198b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f25198b.b(new e(this, hashSet, jSONObject, j10));
    }
}
