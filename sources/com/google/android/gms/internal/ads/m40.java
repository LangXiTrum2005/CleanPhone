package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m40 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j40 f17239b;

    public /* synthetic */ m40(j40 j40Var, int i10) {
        this.f17238a = i10;
        this.f17239b = j40Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        switch (this.f17238a) {
            case 0:
                j40 j40Var = this.f17239b;
                return new i40(j40Var.f15966b, j40Var.f15965a);
            case 1:
                Context context = this.f17239b.f15966b;
                ic1.h(context);
                return context;
            case 2:
                WeakReference weakReference = this.f17239b.f15968d;
                ic1.h(weakReference);
                return weakReference;
            case 3:
                return new az0(this.f17239b.f15966b);
            case 4:
                j40 j40Var2 = this.f17239b;
                j40Var2.getClass();
                return new zzk(j40Var2.f15966b, j40Var2.f15965a);
            case 5:
                zzs zzsVarZzc = zzt.zzc();
                j40 j40Var3 = this.f17239b;
                String strZze = zzsVarZzc.zze(j40Var3.f15966b, j40Var3.f15965a.afmaVersion);
                ic1.h(strZze);
                return strZze;
            default:
                return Long.valueOf(this.f17239b.f15967c);
        }
    }
}
