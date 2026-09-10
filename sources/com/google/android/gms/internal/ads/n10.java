package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n10 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q10 f17613b;

    public /* synthetic */ n10(q10 q10Var, int i10) {
        this.f17612a = i10;
        this.f17613b = q10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f17612a;
        q10 q10Var = this.f17613b;
        switch (i10) {
            case 0:
                d10 d10Var = q10Var.f18861g;
                if (d10Var != null) {
                    d10Var.e();
                }
                break;
            case 1:
                d10 d10Var2 = q10Var.f18861g;
                if (d10Var2 != null) {
                    d10Var2.k();
                }
                break;
            case 2:
                d10 d10Var3 = q10Var.f18861g;
                if (d10Var3 != null) {
                    d10Var3.h();
                }
                break;
            case 3:
                d10 d10Var4 = q10Var.f18861g;
                if (d10Var4 != null) {
                    d10Var4.f();
                }
                break;
            case 4:
                d10 d10Var5 = q10Var.f18861g;
                if (d10Var5 != null) {
                    d10Var5.g();
                }
                break;
            case 5:
                d10 d10Var6 = q10Var.f18861g;
                if (d10Var6 != null) {
                    c10 c10Var = d10Var6.f13339e;
                    c10Var.f12989c = false;
                    y01 y01Var = zzs.zza;
                    y01Var.removeCallbacks(c10Var);
                    y01Var.postDelayed(c10Var, 250L);
                    y01Var.post(new b10(d10Var6, 0));
                }
                break;
            case 6:
                d10 d10Var7 = q10Var.f18861g;
                if (d10Var7 != null) {
                    d10Var7.i();
                }
                break;
            default:
                m10 m10Var = q10Var.f22442b;
                boolean z10 = m10Var.f17207e;
                float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float f11 = z10 ? 0.0f : m10Var.f17208f;
                if (m10Var.f17205c) {
                    f10 = f11;
                }
                r20 r20Var = q10Var.f18863i;
                if (r20Var == null) {
                    int i11 = zze.zza;
                    zzo.zzi("Trying to set volume before player is initialized.");
                } else {
                    try {
                        xz1 xz1Var = r20Var.f19289g;
                        if (xz1Var != null) {
                            xz1Var.f22051d.b();
                            xz1Var.f22050c.X0(f10);
                        }
                    } catch (IOException e10) {
                        int i12 = zze.zza;
                        zzo.zzj("", e10);
                        return;
                    }
                }
                break;
        }
    }
}
