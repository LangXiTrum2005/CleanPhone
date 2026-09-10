package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzfw;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zf0 implements y30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bg0 f22595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b30 f22596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj f22597d;

    public /* synthetic */ zf0(bg0 bg0Var, b30 b30Var, kj kjVar, int i10) {
        this.f22594a = i10;
        this.f22595b = bg0Var;
        this.f22596c = b30Var;
        this.f22597d = kjVar;
    }

    @Override // com.google.android.gms.internal.ads.y30
    public final void zza(boolean z10, int i10, String str, String str2) {
        switch (this.f22594a) {
            case 0:
                bg0 bg0Var = this.f22595b;
                kj kjVar = this.f22597d;
                if (!z10) {
                    bg0Var.getClass();
                    int length = String.valueOf(i10).length();
                    StringBuilder sb2 = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    sb2.append("Html video Web View failed to load. Error code: ");
                    sb2.append(i10);
                    sb2.append(", Description: ");
                    sb2.append(str);
                    kjVar.zzd(new eo0(1, defpackage.e.q(", Failing URL: ", str2, sb2)));
                } else {
                    zzfw zzfwVar = bg0Var.f12765a.f18360a;
                    if (zzfwVar != null) {
                        b30 b30Var = this.f22596c;
                        if (b30Var.zzh() != null) {
                            b30Var.zzh().x1(zzfwVar);
                        }
                    }
                    kjVar.a();
                }
                break;
            default:
                bg0 bg0Var2 = this.f22595b;
                bg0Var2.getClass();
                ou0 ou0Var = bg0Var2.f12765a;
                boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.W4)).booleanValue();
                b30 b30Var2 = this.f22596c;
                kj kjVar2 = this.f22597d;
                if (!zBooleanValue) {
                    zzfw zzfwVar2 = ou0Var.f18360a;
                    if (zzfwVar2 != null && b30Var2.zzh() != null) {
                        b30Var2.zzh().x1(zzfwVar2);
                    }
                    kjVar2.a();
                } else if (!z10) {
                    int length2 = String.valueOf(i10).length();
                    StringBuilder sb3 = new StringBuilder(length2 + 64 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    sb3.append("Native Video WebView failed to load. Error code: ");
                    sb3.append(i10);
                    sb3.append(", Description: ");
                    sb3.append(str);
                    kjVar2.zzd(new eo0(1, defpackage.e.q(", Failing URL: ", str2, sb3)));
                } else {
                    zzfw zzfwVar3 = ou0Var.f18360a;
                    if (zzfwVar3 != null && b30Var2.zzh() != null) {
                        b30Var2.zzh().x1(zzfwVar3);
                    }
                    kjVar2.a();
                }
                break;
        }
    }
}
