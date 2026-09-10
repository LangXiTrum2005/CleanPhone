package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.pa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0516pa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0480na f30007a;

    public C0516pa(InterfaceC0480na interfaceC0480na) {
        this.f30007a = interfaceC0480na;
    }

    public void a(C0498oa c0498oa, JSONObject jSONObject) {
        this.f30007a.a(false, c0498oa.a(), jSONObject);
    }

    public void b(C0498oa c0498oa, JSONObject jSONObject) {
        this.f30007a.a(true, c0498oa.d(), jSONObject);
    }
}
