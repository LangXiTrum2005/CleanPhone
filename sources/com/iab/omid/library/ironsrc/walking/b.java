package com.iab.omid.library.ironsrc.walking;

import com.iab.omid.library.ironsrc.walking.async.d;
import com.iab.omid.library.ironsrc.walking.async.e;
import com.iab.omid.library.ironsrc.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b implements com.iab.omid.library.ironsrc.walking.async.b.InterfaceC0029b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f25331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.walking.async.c f25332b;

    public b(com.iab.omid.library.ironsrc.walking.async.c cVar) {
        this.f25332b = cVar;
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.b.InterfaceC0029b
    public JSONObject a() {
        return this.f25331a;
    }

    public void b() {
        this.f25332b.b(new d(this));
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.b.InterfaceC0029b
    public void a(JSONObject jSONObject) {
        this.f25331a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f25332b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f25332b.b(new e(this, hashSet, jSONObject, j10));
    }
}
