package com.mbridge.msdk.config.component.common.network.connect.socket;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f31972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f31973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f31974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.retry.a f31975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f31976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.monitor.a f31977f;

    public a(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2, com.mbridge.msdk.config.component.common.network.a aVar3) {
        this.f31972a = aVar;
        this.f31973b = aVar2;
        this.f31974c = aVar3;
        this.f31977f = aVar2.b();
    }

    public com.mbridge.msdk.config.component.common.network.result.a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return a(1008, 1008, "URL cannot be empty");
        }
        b bVar = new b(this.f31972a, this.f31973b, this.f31974c);
        this.f31976e = bVar;
        bVar.c(str);
        this.f31976e.a(this.f31975d);
        c.a().a(this.f31976e, this.f31977f);
        return this.f31973b;
    }

    public void a() {
        b bVar = this.f31976e;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.a aVar) {
        this.f31975d = aVar;
    }

    private com.mbridge.msdk.config.component.common.network.result.a a(int i10, int i11, String str) {
        this.f31973b.a(str);
        this.f31973b.c(i10);
        this.f31973b.a(i11);
        this.f31973b.b(0);
        return this.f31973b;
    }
}
