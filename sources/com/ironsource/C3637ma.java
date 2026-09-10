package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3637ma {
    private InterfaceC3601ka a;

    public C3637ma(InterfaceC3601ka interfaceC3601ka) {
        this.a = interfaceC3601ka;
    }

    public void a(C3619la c3619la, JSONObject jSONObject) {
        this.a.a(false, c3619la.a(), jSONObject);
    }

    public void b(C3619la c3619la, JSONObject jSONObject) {
        this.a.a(true, c3619la.d(), jSONObject);
    }
}
