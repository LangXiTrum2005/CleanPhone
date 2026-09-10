package com.iab.omid.library.mmadbridge.walking;

import com.iab.omid.library.mmadbridge.walking.async.d;
import com.iab.omid.library.mmadbridge.walking.async.e;
import com.iab.omid.library.mmadbridge.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b implements com.iab.omid.library.mmadbridge.walking.async.b.InterfaceC0033b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f25465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.walking.async.c f25466b;

    public b(com.iab.omid.library.mmadbridge.walking.async.c cVar) {
        this.f25466b = cVar;
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.b.InterfaceC0033b
    public JSONObject a() {
        return this.f25465a;
    }

    public void b() {
        this.f25466b.b(new d(this));
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.b.InterfaceC0033b
    public void a(JSONObject jSONObject) {
        this.f25465a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f25466b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f25466b.b(new e(this, hashSet, jSONObject, j10));
    }
}
