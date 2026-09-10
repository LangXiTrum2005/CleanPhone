package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* JADX INFO: loaded from: classes6.dex */
public final class s1 implements ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t1 f41462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t1 f41463b;

    public s1(t1 t1Var, t1 t1Var2) {
        this.f41463b = t1Var;
        this.f41462a = t1Var2;
    }

    @Override // com.startapp.sdk.internal.ti
    public final void a() {
        ((z6) ((y6) this.f41463b.f40636i.a())).c(this.f41462a, ii.v);
        t1 t1Var = this.f41463b;
        Context context = t1Var.f40631a;
        AdEventListener adEventListener = t1Var.d;
        t1Var.d = null;
        a0.b(context, adEventListener, t1Var.f40632b, false);
    }

    @Override // com.startapp.sdk.internal.ti
    public final void a(String str) {
        ((z6) ((y6) this.f41463b.f40636i.a())).c(this.f41462a, ii.f41114w);
        this.f41463b.f40632b.setErrorMessage(str);
        t1 t1Var = this.f41463b;
        Context context = t1Var.f40631a;
        AdEventListener adEventListener = t1Var.d;
        t1Var.d = null;
        a0.a(context, adEventListener, t1Var.f40632b, false);
    }
}
