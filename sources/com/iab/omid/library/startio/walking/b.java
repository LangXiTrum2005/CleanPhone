package com.iab.omid.library.startio.walking;

import com.iab.omid.library.startio.walking.async.d;
import com.iab.omid.library.startio.walking.async.e;
import com.iab.omid.library.startio.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b implements com.iab.omid.library.startio.walking.async.b.InterfaceC0245b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f22314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.startio.walking.async.c f22315b;

    public b(com.iab.omid.library.startio.walking.async.c cVar) {
        this.f22315b = cVar;
    }

    @Override // com.iab.omid.library.startio.walking.async.b.InterfaceC0245b
    public JSONObject a() {
        return this.f22314a;
    }

    public void b() {
        this.f22315b.b(new d(this));
    }

    @Override // com.iab.omid.library.startio.walking.async.b.InterfaceC0245b
    public void a(JSONObject jSONObject) {
        this.f22314a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f22315b.b(new f(this, hashSet, jSONObject, j));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f22315b.b(new e(this, hashSet, jSONObject, j));
    }
}
