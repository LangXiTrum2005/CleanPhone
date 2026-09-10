package com.mbridge.msdk.config.component.common.network;

import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f31953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f31954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f31955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.monitor.b f31956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f31957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f31958f = "HTTP";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.socket.a f31959g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.okhttp.a f31960h = null;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements com.mbridge.msdk.config.component.common.network.b {
        public a() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.b
        public void a() {
            if (c.this.f31959g != null) {
                c.this.f31959g.a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements com.mbridge.msdk.config.component.common.network.b {
        public b() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.b
        public void a() {
            if (c.this.f31960h != null) {
                c.this.f31960h.a();
            }
        }
    }

    public c(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2) {
        this.f31955c = aVar;
        this.f31954b = aVar2;
        this.f31956d = aVar2.a();
    }

    private void c() {
        try {
            com.mbridge.msdk.config.component.common.network.connect.socket.a aVar = new com.mbridge.msdk.config.component.common.network.connect.socket.a(this.f31955c, this.f31954b, this.f31953a);
            this.f31959g = aVar;
            aVar.a(this.f31957e);
            this.f31956d.a(new a());
        } catch (Exception e10) {
            q0.b("NetworkRequestTask", e10.getMessage(), e10);
        }
    }

    public void a(String str, com.mbridge.msdk.config.component.common.network.a aVar) {
        this.f31957e = str;
        this.f31953a = aVar;
        this.f31958f = this.f31955c.i();
    }

    public void b() {
        com.mbridge.msdk.config.component.common.network.a aVar = this.f31953a;
        if (aVar != null) {
            aVar.a(this.f31954b);
        }
        if (this.f31958f.equals("TCP")) {
            c();
        } else {
            a();
        }
    }

    private void a() {
        try {
            com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar = new com.mbridge.msdk.config.component.common.network.connect.okhttp.a(this.f31955c, this.f31954b, this.f31953a);
            this.f31960h = aVar;
            aVar.a(this.f31957e);
            this.f31956d.a(new b());
        } catch (Exception e10) {
            q0.b("NetworkRequestTask", e10.getMessage(), e10);
        }
    }
}
