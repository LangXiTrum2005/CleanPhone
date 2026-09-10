package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g32 implements p42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ya1 f14739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14740b;

    public g32(List list, List list2) {
        aa1 aa1Var = ca1.f13122b;
        rb0.p(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i10 = 0;
        ps1.v(list.size() == list2.size());
        int i11 = 0;
        while (i10 < list.size()) {
            f32 f32Var = new f32((p42) list.get(i10), (List) list2.get(i10));
            int length = objArrCopyOf.length;
            int i12 = i11 + 1;
            int iD = x91.d(length, i12);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i11] = f32Var;
            i10++;
            i11 = i12;
        }
        this.f14739a = ca1.A(i11, objArrCopyOf);
        this.f14740b = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void a(long j10) {
        int i10 = 0;
        while (true) {
            ya1 ya1Var = this.f14739a;
            if (i10 >= ya1Var.f22210d) {
                return;
            }
            ((f32) ya1Var.get(i10)).a(j10);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final boolean b(bz1 bz1Var) {
        boolean zB;
        boolean z10 = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                break;
            }
            int i10 = 0;
            zB = false;
            while (true) {
                ya1 ya1Var = this.f14739a;
                if (i10 >= ya1Var.f22210d) {
                    break;
                }
                long jZzc2 = ((f32) ya1Var.get(i10)).f14201a.zzc();
                boolean z11 = jZzc2 != Long.MIN_VALUE && jZzc2 <= bz1Var.f12944a;
                if (jZzc2 == jZzc || z11) {
                    zB |= ((f32) ya1Var.get(i10)).f14201a.b(bz1Var);
                }
                i10++;
            }
            z10 |= zB;
        } while (zB);
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final long zzb() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            ya1 ya1Var = this.f14739a;
            if (i10 >= ya1Var.f22210d) {
                break;
            }
            f32 f32Var = (f32) ya1Var.get(i10);
            long jZzb = f32Var.f14201a.zzb();
            ca1 ca1Var = f32Var.f14202b;
            if ((ca1Var.contains(1) || ca1Var.contains(2) || ca1Var.contains(4)) && jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
            if (jZzb != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzb);
            }
            i10++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.f14740b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f14740b;
        return j10 != C.TIME_UNSET ? j10 : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final long zzc() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            ya1 ya1Var = this.f14739a;
            if (i10 >= ya1Var.f22210d) {
                break;
            }
            long jZzc = ((f32) ya1Var.get(i10)).f14201a.zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
            i10++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final boolean zze() {
        int i10 = 0;
        while (true) {
            ya1 ya1Var = this.f14739a;
            if (i10 >= ya1Var.f22210d) {
                return false;
            }
            if (((f32) ya1Var.get(i10)).f14201a.zze()) {
                return true;
            }
            i10++;
        }
    }
}
