package com.applovin.impl;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0951n0 extends i5 {
    private final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f11317h;

    public C0951n0(String str, com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        super("CommunicatorRequestTask", kVar, str);
        this.g = str;
        this.f11317h = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f10954a.q0().a(new a(this.f11317h, this.f10954a, d()));
    }

    /* JADX INFO: renamed from: com.applovin.impl.n0$a */
    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z2) {
            super(aVar, kVar, z2);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.C0957q0.e
        public void a(String str, JSONObject jSONObject, int i2) {
            this.f10954a.t().a(C0951n0.this.g, C0951n0.this.f11317h.f(), i2, jSONObject, null, true);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.C0957q0.e
        public void a(String str, int i2, String str2, JSONObject jSONObject) {
            this.f10954a.t().a(C0951n0.this.g, C0951n0.this.f11317h.f(), i2, jSONObject, str2, false);
        }
    }
}
