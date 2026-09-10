package com.iab.omid.library.vungle.walking;

import com.iab.omid.library.vungle.walking.async.d;
import com.iab.omid.library.vungle.walking.async.e;
import com.iab.omid.library.vungle.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b implements com.iab.omid.library.vungle.walking.async.b.InterfaceC0258b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f22613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.vungle.walking.async.c f22614b;

    public b(com.iab.omid.library.vungle.walking.async.c cVar) {
        this.f22614b = cVar;
    }

    @Override // com.iab.omid.library.vungle.walking.async.b.InterfaceC0258b
    public JSONObject a() {
        return this.f22613a;
    }

    public void b() {
        this.f22614b.b(new d(this));
    }

    @Override // com.iab.omid.library.vungle.walking.async.b.InterfaceC0258b
    public void a(JSONObject jSONObject) {
        this.f22613a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f22614b.b(new f(this, hashSet, jSONObject, j));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f22614b.b(new e(this, hashSet, jSONObject, j));
    }
}
