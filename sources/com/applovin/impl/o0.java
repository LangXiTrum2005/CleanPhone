package com.applovin.impl;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class o0 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f8873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f8874h;

    public o0(String str, com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
        super("CommunicatorRequestTask", lVar, str);
        this.f8873g = str;
        this.f8874h = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f8297a.s0().a(new a(this.f8874h, this.f8297a, d()));
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends o6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar, boolean z10) {
            super(aVar, lVar, z10);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            this.f8297a.u().a(o0.this.f8873g, o0.this.f8874h.f(), i10, jSONObject, null, true);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            this.f8297a.u().a(o0.this.f8873g, o0.this.f8874h.f(), i10, jSONObject, str2, false);
        }
    }
}
