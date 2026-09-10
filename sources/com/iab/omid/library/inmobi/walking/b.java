package com.iab.omid.library.inmobi.walking;

import com.iab.omid.library.inmobi.walking.async.d;
import com.iab.omid.library.inmobi.walking.async.e;
import com.iab.omid.library.inmobi.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b implements com.iab.omid.library.inmobi.walking.async.b.InterfaceC0233b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f22018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.walking.async.c f22019b;

    public b(com.iab.omid.library.inmobi.walking.async.c cVar) {
        this.f22019b = cVar;
    }

    @Override // com.iab.omid.library.inmobi.walking.async.b.InterfaceC0233b
    public JSONObject a() {
        return this.f22018a;
    }

    public void b() {
        this.f22019b.b(new d(this));
    }

    @Override // com.iab.omid.library.inmobi.walking.async.b.InterfaceC0233b
    public void a(JSONObject jSONObject) {
        this.f22018a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f22019b.b(new f(this, hashSet, jSONObject, j));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f22019b.b(new e(this, hashSet, jSONObject, j));
    }
}
