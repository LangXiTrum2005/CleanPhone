package com.iab.omid.library.bytedance2.walking;

import com.iab.omid.library.bytedance2.walking.async.d;
import com.iab.omid.library.bytedance2.walking.async.e;
import com.iab.omid.library.bytedance2.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b implements com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0224b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f21813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.walking.async.c f21814b;

    public b(com.iab.omid.library.bytedance2.walking.async.c cVar) {
        this.f21814b = cVar;
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0224b
    public JSONObject a() {
        return this.f21813a;
    }

    public void b() {
        this.f21814b.b(new d(this));
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0224b
    public void a(JSONObject jSONObject) {
        this.f21813a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f21814b.b(new f(this, hashSet, jSONObject, j));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.f21814b.b(new e(this, hashSet, jSONObject, j));
    }
}
