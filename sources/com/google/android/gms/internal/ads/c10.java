package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;
import com.ironsource.C0335f8;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c10 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d10 f12988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12989c;

    public c10(d10 d10Var) {
        this.f12987a = 2;
        this.f12989c = false;
        this.f12988b = d10Var;
    }

    public void a() {
        this.f12989c = true;
        this.f12988b.b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12987a) {
            case 0:
                this.f12988b.c("windowVisibilityChanged", C0335f8.f28653k, String.valueOf(this.f12989c));
                break;
            case 1:
                boolean z10 = this.f12989c;
                d10 d10Var = this.f12988b;
                d10Var.getClass();
                d10Var.c("windowFocusChanged", "hasWindowFocus", String.valueOf(z10));
                break;
            default:
                if (!this.f12989c) {
                    this.f12988b.b();
                    y01 y01Var = zzs.zza;
                    y01Var.removeCallbacks(this);
                    y01Var.postDelayed(this, 250L);
                }
                break;
        }
    }

    public /* synthetic */ c10(d10 d10Var, boolean z10, int i10) {
        this.f12987a = i10;
        this.f12989c = z10;
        this.f12988b = d10Var;
    }
}
