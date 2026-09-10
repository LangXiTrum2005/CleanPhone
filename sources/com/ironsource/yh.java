package com.ironsource;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yh implements com.ironsource.sdk.controller.l.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Tb f31328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31329c;

    public /* synthetic */ yh(Tb tb2, Object obj, int i10) {
        this.f31327a = i10;
        this.f31328b = tb2;
        this.f31329c = obj;
    }

    @Override // com.ironsource.sdk.controller.l.a
    public final void a(com.ironsource.sdk.controller.f.a aVar) {
        switch (this.f31327a) {
            case 0:
                Tb.a(this.f31328b, (D8) this.f31329c, aVar);
                break;
            default:
                Tb.a(this.f31328b, (Activity) this.f31329c, aVar);
                break;
        }
    }
}
