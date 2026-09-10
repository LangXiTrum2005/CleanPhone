package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k60 implements oa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16341b;

    public /* synthetic */ k60(Object obj, int i10) {
        this.f16340a = i10;
        this.f16341b = obj;
    }

    @Override // com.google.android.gms.internal.ads.oa0
    public final void C(Context context) {
        int i10 = this.f16340a;
        Object obj = this.f16341b;
        switch (i10) {
            case 0:
                try {
                    try {
                        ut utVar = ((wu0) obj).f21609a;
                        utVar.zzm();
                        if (context != null) {
                            try {
                                utVar.k(new s9.b(context));
                                return;
                            } catch (Throwable th2) {
                                throw new qu0(th2);
                            }
                        }
                        return;
                    } catch (Throwable th3) {
                        throw new qu0(th3);
                    }
                } catch (qu0 e10) {
                    int i11 = zze.zza;
                    zzo.zzj("Cannot invoke onResume for the mediation adapter.", e10);
                    return;
                }
            default:
                b30 b30Var = (b30) obj;
                if (b30Var != null) {
                    b30Var.onResume();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.oa0
    public final void a(Context context) {
        int i10 = this.f16340a;
        Object obj = this.f16341b;
        switch (i10) {
            case 0:
                try {
                    try {
                        ((wu0) obj).f21609a.zzi();
                    } catch (Throwable th2) {
                        throw new qu0(th2);
                    }
                } catch (qu0 e10) {
                    int i11 = zze.zza;
                    zzo.zzj("Cannot invoke onDestroy for the mediation adapter.", e10);
                    return;
                }
                break;
            default:
                b30 b30Var = (b30) obj;
                if (b30Var != null) {
                    b30Var.destroy();
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.oa0
    public final void zza(Context context) {
        int i10 = this.f16340a;
        Object obj = this.f16341b;
        switch (i10) {
            case 0:
                try {
                    try {
                        ((wu0) obj).f21609a.zzl();
                    } catch (Throwable th2) {
                        throw new qu0(th2);
                    }
                } catch (qu0 e10) {
                    int i11 = zze.zza;
                    zzo.zzj("Cannot invoke onPause for the mediation adapter.", e10);
                    return;
                }
                break;
            default:
                b30 b30Var = (b30) obj;
                if (b30Var != null) {
                    b30Var.onPause();
                }
                break;
        }
    }
}
