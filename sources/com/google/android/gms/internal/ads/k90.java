package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzat;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k90 implements d81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16384d;

    public /* synthetic */ k90(Object obj, Object obj2, Object obj3, int i10) {
        this.f16381a = i10;
        this.f16382b = obj;
        this.f16383c = obj2;
        this.f16384d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.d81
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f16381a) {
            case 0:
                du0 du0Var = (du0) obj;
                zzat zzatVar = new zzat((Context) this.f16382b);
                zzatVar.zze(du0Var.B);
                zzatVar.zzf(du0Var.C.toString());
                zzatVar.zzd(((VersionInfoParcel) this.f16383c).afmaVersion);
                zzatVar.zzc(((ou0) this.f16384d).f18366g);
                return zzatVar;
            case 1:
                b30 b30Var = (b30) this.f16382b;
                if (((du0) this.f16383c).M) {
                    b30Var.s();
                }
                b50 b50Var = (b50) this.f16384d;
                b30Var.zzJ();
                b30Var.onPause();
                return b50Var.W();
            case 2:
                b30 b30Var2 = (b30) this.f16382b;
                if (((du0) this.f16383c).M) {
                    b30Var2.s();
                }
                h50 h50Var = (h50) this.f16384d;
                b30Var2.zzJ();
                b30Var2.onPause();
                return h50Var.W();
            default:
                b30 b30Var3 = (b30) this.f16382b;
                if (((du0) this.f16383c).M) {
                    b30Var3.s();
                }
                l50 l50Var = (l50) this.f16384d;
                b30Var3.zzJ();
                b30Var3.onPause();
                return l50Var.X();
        }
    }
}
