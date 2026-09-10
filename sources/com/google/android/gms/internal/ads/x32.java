package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x32 implements q32, p32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q32[] f21729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f21730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f21731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f21732d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f21733e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f21734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v42 f21735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q32[] f21736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g32 f21737i;

    public x32(long[] jArr, q32... q32VarArr) {
        this.f21729a = q32VarArr;
        aa1 aa1Var = ca1.f13122b;
        ya1 ya1Var = ya1.f22208e;
        this.f21737i = new g32(ya1Var, ya1Var);
        this.f21731c = new IdentityHashMap();
        this.f21736h = new q32[0];
        this.f21730b = new boolean[q32VarArr.length];
        for (int i10 = 0; i10 < q32VarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.f21730b[i10] = true;
                this.f21729a[i10] = new t42(q32VarArr[i10], j10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final void a(long j10) {
        this.f21737i.a(j10);
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final boolean b(bz1 bz1Var) {
        ArrayList arrayList = this.f21732d;
        if (arrayList.isEmpty()) {
            return this.f21737i.b(bz1Var);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q32) arrayList.get(i10)).b(bz1Var);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final long c(long j10) {
        long jC = this.f21736h[0].c(j10);
        int i10 = 1;
        while (true) {
            q32[] q32VarArr = this.f21736h;
            if (i10 >= q32VarArr.length) {
                return jC;
            }
            if (q32VarArr[i10].c(jC) != jC) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.p32, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.p32
    public final void d(q32 q32Var) {
        q32[] q32VarArr;
        ArrayList arrayList = this.f21732d;
        arrayList.remove(q32Var);
        if (arrayList.isEmpty()) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                q32VarArr = this.f21729a;
                if (i10 >= q32VarArr.length) {
                    break;
                }
                i11 += q32VarArr[i10].zzn().f21028a;
                i10++;
            }
            ni[] niVarArr = new ni[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < q32VarArr.length; i13++) {
                v42 v42VarZzn = q32VarArr[i13].zzn();
                int i14 = v42VarZzn.f21028a;
                int i15 = 0;
                while (i15 < i14) {
                    ni niVarA = v42VarZzn.a(i15);
                    int i16 = niVarA.f17829a;
                    g22[] g22VarArr = new g22[i16];
                    int i17 = 0;
                    while (i17 < i16) {
                        g22 g22Var = niVarA.f17832d[i17];
                        g22Var.getClass();
                        i12 i12Var = new i12(g22Var);
                        String str = g22Var.f14665a;
                        if (str == null) {
                            str = "";
                        }
                        q32[] q32VarArr2 = q32VarArr;
                        int i18 = i12;
                        StringBuilder sb2 = new StringBuilder(str.length() + com.applovin.impl.ca.e(i13, 1));
                        sb2.append(i13);
                        sb2.append(":");
                        sb2.append(str);
                        i12Var.f15499a = sb2.toString();
                        String str2 = g22Var.f14676m;
                        if (str2 != null) {
                            StringBuilder sb3 = new StringBuilder(com.applovin.impl.ca.e(i13, 1) + str2.length());
                            sb3.append(i13);
                            sb3.append(":");
                            sb3.append(str2);
                            i12Var.l = sb3.toString();
                        }
                        g22VarArr[i17] = new g22(i12Var);
                        i17++;
                        q32VarArr = q32VarArr2;
                        i12 = i18;
                    }
                    q32[] q32VarArr3 = q32VarArr;
                    int i19 = i12;
                    String str3 = niVarA.f17830b;
                    StringBuilder sb4 = new StringBuilder(com.applovin.impl.ca.e(i13, 1) + String.valueOf(str3).length());
                    sb4.append(i13);
                    sb4.append(":");
                    sb4.append(str3);
                    ni niVar = new ni(sb4.toString(), g22VarArr);
                    this.f21733e.put(niVar, niVarA);
                    i12 = i19 + 1;
                    niVarArr[i19] = niVar;
                    i15++;
                    q32VarArr = q32VarArr3;
                }
            }
            this.f21735g = new v42(niVarArr);
            ?? r2 = this.f21734f;
            r2.getClass();
            r2.d(this);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.p32, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.p32
    public final /* bridge */ /* synthetic */ void e(p42 p42Var) {
        ?? r2 = this.f21734f;
        r2.getClass();
        r2.e(this);
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final long f(long j10, wz1 wz1Var) {
        q32[] q32VarArr = this.f21736h;
        return (q32VarArr.length > 0 ? q32VarArr[0] : this.f21729a[0]).f(j10, wz1Var);
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final void g(p32 p32Var, long j10) {
        this.f21734f = p32Var;
        ArrayList arrayList = this.f21732d;
        q32[] q32VarArr = this.f21729a;
        Collections.addAll(arrayList, q32VarArr);
        for (q32 q32Var : q32VarArr) {
            q32Var.g(this, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final long h(p[] pVarArr, boolean[] zArr, o42[] o42VarArr, boolean[] zArr2, long j10) {
        int length;
        IdentityHashMap identityHashMap;
        int length2 = pVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = pVarArr.length;
            identityHashMap = this.f21731c;
            if (i11 >= length) {
                break;
            }
            o42 o42Var = o42VarArr[i11];
            Integer num = o42Var == null ? null : (Integer) identityHashMap.get(o42Var);
            iArr[i11] = num == null ? -1 : num.intValue();
            p pVar = pVarArr[i11];
            if (pVar != null) {
                String str = pVar.zza().f17830b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        identityHashMap.clear();
        o42[] o42VarArr2 = new o42[length];
        o42[] o42VarArr3 = new o42[length];
        p[] pVarArr2 = new p[length];
        q32[] q32VarArr = this.f21729a;
        ArrayList arrayList = new ArrayList(q32VarArr.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < q32VarArr.length) {
            int i13 = i10;
            while (i13 < pVarArr.length) {
                o42VarArr3[i13] = iArr[i13] == i12 ? o42VarArr[i13] : null;
                if (iArr2[i13] == i12) {
                    p pVar2 = pVarArr[i13];
                    pVar2.getClass();
                    ni niVar = (ni) this.f21733e.get(pVar2.zza());
                    niVar.getClass();
                    pVarArr2[i13] = new w32(pVar2, niVar);
                } else {
                    pVarArr2[i13] = null;
                }
                i13++;
                iArr2 = iArr2;
                iArr = iArr;
            }
            int[] iArr3 = iArr2;
            int[] iArr4 = iArr;
            ArrayList arrayList2 = arrayList;
            q32[] q32VarArr2 = q32VarArr;
            int i14 = i12;
            long jH = q32VarArr[i12].h(pVarArr2, zArr, o42VarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = jH;
            } else if (jH != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < pVarArr.length; i15++) {
                if (iArr3[i15] == i14) {
                    o42 o42Var2 = o42VarArr3[i15];
                    o42Var2.getClass();
                    o42VarArr2[i15] = o42Var2;
                    identityHashMap.put(o42Var2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr4[i15] == i14) {
                    ps1.c0(o42VarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList2.add(q32VarArr2[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            q32VarArr = q32VarArr2;
            iArr2 = iArr3;
            iArr = iArr4;
            i10 = 0;
        }
        int i16 = i10;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(o42VarArr2, i16, o42VarArr, i16, length);
        this.f21736h = (q32[]) arrayList3.toArray(new q32[i16]);
        this.f21737i = new g32(arrayList3, v71.w(arrayList3, t51.f20194f));
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final void i(long j10) {
        for (q32 q32Var : this.f21736h) {
            q32Var.i(j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final long zzb() {
        return this.f21737i.zzb();
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final long zzc() {
        return this.f21737i.zzc();
    }

    @Override // com.google.android.gms.internal.ads.p42
    public final boolean zze() {
        return this.f21737i.zze();
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final void zzm() {
        int i10 = 0;
        while (true) {
            q32[] q32VarArr = this.f21729a;
            if (i10 >= q32VarArr.length) {
                return;
            }
            q32VarArr[i10].zzm();
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final v42 zzn() {
        v42 v42Var = this.f21735g;
        v42Var.getClass();
        return v42Var;
    }

    @Override // com.google.android.gms.internal.ads.q32
    public final long zzr() {
        long j10 = -9223372036854775807L;
        for (q32 q32Var : this.f21736h) {
            long jZzr = q32Var.zzr();
            if (jZzr == C.TIME_UNSET) {
                if (j10 != C.TIME_UNSET && q32Var.c(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == C.TIME_UNSET) {
                for (q32 q32Var2 : this.f21736h) {
                    if (q32Var2 == q32Var) {
                        break;
                    }
                    if (q32Var2.c(jZzr) != jZzr) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = jZzr;
            } else if (jZzr != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }
}
