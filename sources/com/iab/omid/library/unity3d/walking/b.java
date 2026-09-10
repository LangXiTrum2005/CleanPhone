package com.iab.omid.library.unity3d.walking;

import com.iab.omid.library.unity3d.walking.async.d;
import com.iab.omid.library.unity3d.walking.async.e;
import com.iab.omid.library.unity3d.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b implements com.iab.omid.library.unity3d.walking.async.b.InterfaceC0037b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f25591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.unity3d.walking.async.c f25592b;

    public b(com.iab.omid.library.unity3d.walking.async.c cVar) {
        this.f25592b = cVar;
    }

    @Override // com.iab.omid.library.unity3d.walking.async.b.InterfaceC0037b
    public JSONObject a() {
        return this.f25591a;
    }

    public void b() {
        this.f25592b.b(new d(this));
    }

    @Override // com.iab.omid.library.unity3d.walking.async.b.InterfaceC0037b
    public void a(JSONObject jSONObject) {
        this.f25591a = jSONObject;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f25592b.b(new f(this, hashSet, jSONObject, j10));
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j10) {
        this.f25592b.b(new e(this, hashSet, jSONObject, j10));
    }
}
