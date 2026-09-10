package com.iab.omid.library.bigosg.walking;

import com.iab.omid.library.bigosg.walking.a.d;
import com.iab.omid.library.bigosg.walking.a.e;
import com.iab.omid.library.bigosg.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b implements com.iab.omid.library.bigosg.walking.a.b.InterfaceC0220b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f21717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bigosg.walking.a.c f21718b;

    public b(com.iab.omid.library.bigosg.walking.a.c cVar) {
        this.f21718b = cVar;
    }

    public void a() {
        this.f21718b.b(new d(this));
    }

    @Override // com.iab.omid.library.bigosg.walking.a.b.InterfaceC0220b
    public JSONObject b() {
        return this.f21717a;
    }

    @Override // com.iab.omid.library.bigosg.walking.a.b.InterfaceC0220b
    public void a(JSONObject jSONObject) {
        this.f21717a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f21718b.b(new e(this, hashSet, jSONObject, j));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f21718b.b(new f(this, hashSet, jSONObject, j));
    }
}
