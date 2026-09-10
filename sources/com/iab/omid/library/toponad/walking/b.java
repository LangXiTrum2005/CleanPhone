package com.iab.omid.library.toponad.walking;

import com.iab.omid.library.toponad.walking.async.d;
import com.iab.omid.library.toponad.walking.async.e;
import com.iab.omid.library.toponad.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b implements com.iab.omid.library.toponad.walking.async.b.InterfaceC0249b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f22414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.toponad.walking.async.c f22415b;

    public b(com.iab.omid.library.toponad.walking.async.c cVar) {
        this.f22415b = cVar;
    }

    @Override // com.iab.omid.library.toponad.walking.async.b.InterfaceC0249b
    public JSONObject a() {
        return this.f22414a;
    }

    public void b() {
        this.f22415b.b(new d(this));
    }

    @Override // com.iab.omid.library.toponad.walking.async.b.InterfaceC0249b
    public void a(JSONObject jSONObject) {
        this.f22414a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f22415b.b(new f(this, hashSet, jSONObject, j));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f22415b.b(new e(this, hashSet, jSONObject, j));
    }
}
