package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r70 implements pb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19452b;

    public /* synthetic */ r70(Object obj, int i10) {
        this.f19451a = i10;
        this.f19452b = obj;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final /* synthetic */ void zza() {
        zzm zzmVarZzL;
        switch (this.f19451a) {
            case 0:
                ((jb0) this.f19452b).zzc();
                break;
            default:
                b30 b30Var = (b30) this.f19452b;
                if (b30Var != null && (zzmVarZzL = b30Var.zzL()) != null) {
                    zzmVarZzL.zzb();
                    break;
                }
                break;
        }
    }
}
