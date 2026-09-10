package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v20 extends z00 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k10 f21006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public so0 f21007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d10 f21008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21010g;

    public v20(Context context, k10 k10Var) {
        super(context);
        this.f21010g = 1;
        this.f21009f = false;
        this.f21006c = k10Var;
        k10Var.a(this);
    }

    public final boolean B() {
        int i10 = this.f21010g;
        return (i10 == 1 || i10 == 2 || this.f21007d == null) ? false : true;
    }

    public final void C(int i10) {
        m10 m10Var = this.f22442b;
        k10 k10Var = this.f21006c;
        if (i10 == 4) {
            k10Var.d();
            m10Var.f17206d = true;
            m10Var.a();
        } else if (this.f21010g == 4) {
            k10Var.f16258m = false;
            m10Var.f17206d = false;
            m10Var.a();
        }
        this.f21010g = i10;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final String h() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void i(d10 d10Var) {
        this.f21008e = d10Var;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void j(String str) {
        if (str != null) {
            Uri.parse(str).toString();
            this.f21007d = new so0(15);
            C(3);
            zzs.zza.post(new u20(this, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void k() {
        zze.zza("AdImmersivePlayerView stop");
        so0 so0Var = this.f21007d;
        if (so0Var != null) {
            ((AtomicBoolean) so0Var.f20013b).set(false);
            this.f21007d = null;
            C(1);
        }
        this.f21006c.b();
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void l() {
        zze.zza("AdImmersivePlayerView play");
        if (B()) {
            ((AtomicBoolean) this.f21007d.f20013b).set(true);
            C(4);
            this.f22441a.f14655c = true;
            zzs.zza.post(new u20(this, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void m() {
        zze.zza("AdImmersivePlayerView pause");
        if (B() && ((AtomicBoolean) this.f21007d.f20013b).get()) {
            ((AtomicBoolean) this.f21007d.f20013b).set(false);
            C(5);
            zzs.zza.post(new u20(this, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final int n() {
        return B() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final int o() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void p(int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 27);
        sb2.append("AdImmersivePlayerView seek ");
        sb2.append(i10);
        zze.zza(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final int r() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final int s() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final long t() {
        return 0L;
    }

    @Override // android.view.View
    public final String toString() {
        String name = v20.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return q4.a.j(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final long u() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final long v() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final int w() {
        return B() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.l10
    public final void zzq() {
        if (this.f21007d != null) {
            this.f22442b.getClass();
        }
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void q(float f10, float f11) {
    }
}
