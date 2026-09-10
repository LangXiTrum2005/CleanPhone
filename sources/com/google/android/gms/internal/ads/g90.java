package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g90 implements gx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx1 f14800b;

    public /* synthetic */ g90(fx1 fx1Var, int i10) {
        this.f14799a = i10;
        this.f14800b = fx1Var;
    }

    @Override // com.google.android.gms.internal.ads.kx1
    public final Object zzb() {
        int i10 = this.f14799a;
        fx1 fx1Var = this.f14800b;
        switch (i10) {
            case 0:
                th0 th0Var = (th0) fx1Var.zzb();
                k00 k00Var = l00.f16608a;
                ic1.h(k00Var);
                return new nc0(th0Var, k00Var);
            case 1:
                return new nc0((u80) fx1Var.zzb(), l00.f16615h);
            case 2:
                th0 th0Var2 = (th0) fx1Var.zzb();
                k00 k00Var2 = l00.f16608a;
                ic1.h(k00Var2);
                return new nc0(th0Var2, k00Var2);
            case 3:
                b90 b90Var = (b90) fx1Var.zzb();
                k00 k00Var3 = l00.f16608a;
                ic1.h(k00Var3);
                nc0 nc0Var = new nc0(b90Var, k00Var3);
                int i11 = ia1.f15692c;
                return new ja1(nc0Var);
            case 4:
                th0 th0Var3 = (th0) fx1Var.zzb();
                k00 k00Var4 = l00.f16608a;
                ic1.h(k00Var4);
                return new nc0(th0Var3, k00Var4);
            case 5:
                th0 th0Var4 = (th0) fx1Var.zzb();
                k00 k00Var5 = l00.f16608a;
                ic1.h(k00Var5);
                return new nc0(th0Var4, k00Var5);
            case 6:
                th0 th0Var5 = (th0) fx1Var.zzb();
                k00 k00Var6 = l00.f16608a;
                ic1.h(k00Var6);
                return new nc0(th0Var5, k00Var6);
            case 7:
                return new nc0((o90) fx1Var.zzb(), l00.f16615h);
            case 8:
                return new nc0((o90) fx1Var.zzb(), l00.f16615h);
            case 9:
                return new nc0((i90) fx1Var.zzb(), l00.f16615h);
            case 10:
                return new nc0((i90) fx1Var.zzb(), l00.f16615h);
            case 11:
                o60 o60Var = (o60) fx1Var.zzb();
                k00 k00Var7 = l00.f16608a;
                ic1.h(k00Var7);
                return new nc0(o60Var, k00Var7);
            case 12:
                String str = ((y80) fx1Var.zzb()).f22193b.f12578e;
                ic1.h(str);
                return str;
            case 13:
                Set setSingleton = Collections.singleton(new nc0((m90) fx1Var.zzb(), l00.f16615h));
                ic1.h(setSingleton);
                return setSingleton;
            case 14:
                return new nc0((aw0) fx1Var.zzb(), l00.f16615h);
            case 15:
                return new nc0((aw0) fx1Var.zzb(), l00.f16615h);
            case 16:
                Set setSingleton2 = Collections.singleton(new nc0((m90) fx1Var.zzb(), l00.f16615h));
                ic1.h(setSingleton2);
                return setSingleton2;
            case 17:
                return new nc0((zc0) fx1Var.zzb(), l00.f16613f);
            case 18:
                return new nc0((zc0) fx1Var.zzb(), l00.f16613f);
            case 19:
                return new nc0((hd0) fx1Var.zzb(), l00.f16613f);
            case 20:
                return new nc0((hd0) fx1Var.zzb(), l00.f16613f);
            case 21:
                return new nc0((hd0) fx1Var.zzb(), l00.f16613f);
            case 22:
                return new nc0((tg0) fx1Var.zzb(), l00.f16615h);
            case 23:
                Set setSingleton3 = Collections.singleton(new nc0((m90) fx1Var.zzb(), l00.f16615h));
                ic1.h(setSingleton3);
                return setSingleton3;
            case 24:
                return new nc0((q90) fx1Var.zzb(), l00.f16613f);
            case 25:
                kd0 kd0Var = (kd0) fx1Var.zzb();
                k00 k00Var8 = l00.f16608a;
                ic1.h(k00Var8);
                return new nc0(kd0Var, k00Var8);
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                Set setSingleton4 = Collections.singleton(new nc0((id0) fx1Var.zzb(), l00.f16615h));
                ic1.h(setSingleton4);
                return setSingleton4;
            case 27:
                return new nc0((ic0) fx1Var.zzb(), l00.f16615h);
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                return new id0((pa0) fx1Var.zzb());
            default:
                ke0 ke0Var = (ke0) fx1Var.zzb();
                ic1.h(ke0Var);
                return ke0Var;
        }
    }
}
