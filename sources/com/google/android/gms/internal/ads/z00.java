package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z00 extends TextureView implements l10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g10 f22441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m10 f22442b;

    public z00(Context context) {
        super(context);
        g10 g10Var = new g10();
        g10Var.f14653a = TimeUnit.MILLISECONDS.toNanos(((Long) zzba.zzc().a(am.f12399w0)).longValue());
        g10Var.f14655c = true;
        this.f22441a = g10Var;
        this.f22442b = new m10(context, this);
    }

    public abstract String h();

    public abstract void i(d10 d10Var);

    public abstract void j(String str);

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract int n();

    public abstract int o();

    public abstract void p(int i10);

    public abstract void q(float f10, float f11);

    public abstract int r();

    public abstract int s();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract int w();

    public Integer x() {
        return null;
    }

    public void y(String str, String[] strArr, Integer num) {
        j(str);
    }

    public void A(int i10) {
    }

    public void d(int i10) {
    }

    public void f(int i10) {
    }

    public void g(int i10) {
    }

    public void z(int i10) {
    }
}
