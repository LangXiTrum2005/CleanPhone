package com.iab.omid.library.adcolony.walking;

import com.iab.omid.library.adcolony.walking.a.d;
import com.iab.omid.library.adcolony.walking.a.e;
import com.iab.omid.library.adcolony.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b implements com.iab.omid.library.adcolony.walking.a.b.InterfaceC0213b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f21526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.adcolony.walking.a.c f21527b;

    public b(com.iab.omid.library.adcolony.walking.a.c cVar) {
        this.f21527b = cVar;
    }

    public void a() {
        this.f21527b.b(new d(this));
    }

    @Override // com.iab.omid.library.adcolony.walking.a.b.InterfaceC0213b
    public JSONObject b() {
        return this.f21526a;
    }

    @Override // com.iab.omid.library.adcolony.walking.a.b.InterfaceC0213b
    public void a(JSONObject jSONObject) {
        this.f21526a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f21527b.b(new e(this, hashSet, jSONObject, j));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f21527b.b(new f(this, hashSet, jSONObject, j));
    }
}
