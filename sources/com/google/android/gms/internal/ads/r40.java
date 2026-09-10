package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r40 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx1 f19369b;

    public /* synthetic */ r40(hz hzVar, fx1 fx1Var, int i10) {
        this.f19368a = i10;
        this.f19369b = fx1Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        int i10 = this.f19368a;
        fx1 fx1Var = this.f19369b;
        switch (i10) {
            case 0:
                zi0 zi0Var = (zi0) fx1Var.zzb();
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                Set setSingleton = ((Boolean) zzba.zzc().a(am.f12355t2)).booleanValue() ? Collections.singleton(new nc0(zi0Var, k00Var)) : Collections.EMPTY_SET;
                ic1.h(setSingleton);
                return setSingleton;
            case 1:
                return new pn0((nh0) fx1Var.zzb());
            case 2:
                return new ko0((nh0) fx1Var.zzb());
            case 3:
                mg0 mg0Var = (mg0) fx1Var.zzb();
                k00 k00Var2 = l00.f16608a;
                ic1.h(k00Var2);
                return new xu0(mg0Var, k00Var2);
            case 4:
                return new d60((Context) fx1Var.zzb());
            case 5:
                nc0 nc0Var = new nc0((e80) fx1Var.zzb(), l00.f16615h);
                int i11 = ia1.f15692c;
                return new ja1(nc0Var);
            case 6:
                Set setSingleton2 = Collections.singleton(new nc0((e80) fx1Var.zzb(), l00.f16615h));
                ic1.h(setSingleton2);
                return setSingleton2;
            case 7:
                return new nc0((c80) fx1Var.zzb(), l00.f16613f);
            case 8:
                return new nc0((c80) fx1Var.zzb(), l00.f16613f);
            case 9:
                Set setSingleton3 = Collections.singleton(new nc0((e80) fx1Var.zzb(), l00.f16615h));
                ic1.h(setSingleton3);
                return setSingleton3;
            case 10:
                i80 i80Var = (i80) fx1Var.zzb();
                k00 k00Var3 = l00.f16608a;
                ic1.h(k00Var3);
                return new nc0(i80Var, k00Var3);
            case 11:
                return new u80((qa0) fx1Var.zzb());
            case 12:
                cb0 cb0Var = (cb0) fx1Var.zzb();
                k00 k00Var4 = l00.f16608a;
                ic1.h(k00Var4);
                return new nc0(cb0Var, k00Var4);
            case 13:
                cb0 cb0Var2 = (cb0) fx1Var.zzb();
                k00 k00Var5 = l00.f16608a;
                ic1.h(k00Var5);
                return new nc0(cb0Var2, k00Var5);
            case 14:
                return new nc0((y80) fx1Var.zzb(), l00.f16615h);
            case 15:
                return new nc0((y80) fx1Var.zzb(), l00.f16615h);
            case 16:
                return new nc0((y80) fx1Var.zzb(), l00.f16615h);
            case 17:
                return new nc0((y80) fx1Var.zzb(), l00.f16615h);
            case 18:
                return new nc0((y80) fx1Var.zzb(), l00.f16615h);
            case 19:
                return new nc0((y80) fx1Var.zzb(), l00.f16615h);
            case 20:
                nc0 nc0Var2 = new nc0((c90) fx1Var.zzb(), l00.f16615h);
                int i12 = ia1.f15692c;
                return new ja1(nc0Var2);
            case 21:
                nc0 nc0Var3 = new nc0((c90) fx1Var.zzb(), l00.f16615h);
                int i13 = ia1.f15692c;
                return new ja1(nc0Var3);
            case 22:
                sc0 sc0Var = (sc0) fx1Var.zzb();
                k00 k00Var6 = l00.f16608a;
                ic1.h(k00Var6);
                return new nc0(sc0Var, k00Var6);
            case 23:
                u60 u60Var = (u60) fx1Var.zzb();
                k00 k00Var7 = l00.f16608a;
                ic1.h(k00Var7);
                return new nc0(u60Var, k00Var7);
            case 24:
                u60 u60Var2 = (u60) fx1Var.zzb();
                k00 k00Var8 = l00.f16608a;
                ic1.h(k00Var8);
                return new nc0(u60Var2, k00Var8);
            case 25:
                u60 u60Var3 = (u60) fx1Var.zzb();
                k00 k00Var9 = l00.f16608a;
                ic1.h(k00Var9);
                return new nc0(u60Var3, k00Var9);
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                u60 u60Var4 = (u60) fx1Var.zzb();
                k00 k00Var10 = l00.f16608a;
                ic1.h(k00Var10);
                return new nc0(u60Var4, k00Var10);
            case 27:
                u60 u60Var5 = (u60) fx1Var.zzb();
                k00 k00Var11 = l00.f16608a;
                ic1.h(k00Var11);
                return new nc0(u60Var5, k00Var11);
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                u60 u60Var6 = (u60) fx1Var.zzb();
                k00 k00Var12 = l00.f16608a;
                ic1.h(k00Var12);
                return new nc0(u60Var6, k00Var12);
            default:
                u60 u60Var7 = (u60) fx1Var.zzb();
                k00 k00Var13 = l00.f16608a;
                ic1.h(k00Var13);
                return new nc0(u60Var7, k00Var13);
        }
    }

    public /* synthetic */ r40(fx1 fx1Var, int i10) {
        this.f19368a = i10;
        this.f19369b = fx1Var;
    }
}
