package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k32 f13774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o42[] f13776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ez1 f13780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean[] f13782i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ux1[] f13783j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m f13784k;
    public final lo0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public dz1 f13785m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public v42 f13786n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public s f13787o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f13788p;

    public dz1(ux1[] ux1VarArr, long j10, m mVar, u uVar, lo0 lo0Var, ez1 ez1Var, s sVar) {
        this.f13783j = ux1VarArr;
        this.f13788p = j10;
        this.f13784k = mVar;
        this.l = lo0Var;
        r32 r32Var = ez1Var.f14116a;
        this.f13775b = r32Var.f19359a;
        this.f13780g = ez1Var;
        this.f13786n = v42.f21027d;
        this.f13787o = sVar;
        this.f13776c = new o42[2];
        this.f13782i = new boolean[2];
        long j11 = ez1Var.f14117b;
        lo0Var.getClass();
        int i10 = sz1.f20092k;
        Pair pair = (Pair) r32Var.f19359a;
        Object obj = pair.first;
        r32 r32VarA = r32Var.a(pair.second);
        lz1 lz1Var = (lz1) ((HashMap) lo0Var.f17085f).get(obj);
        lz1Var.getClass();
        ((HashSet) lo0Var.f17088i).add(lz1Var);
        kz1 kz1Var = (kz1) ((HashMap) lo0Var.f17087h).get(lz1Var);
        if (kz1Var != null) {
            kz1Var.f16587a.o(kz1Var.f16588b);
        }
        lz1Var.f17167c.add(r32VarA);
        k32 k32VarC = lz1Var.f17165a.c(r32VarA, uVar, j11);
        ((IdentityHashMap) lo0Var.f17084e).put(k32VarC, lz1Var);
        lo0Var.q();
        this.f13774a = k32VarC;
    }

    public final long a() {
        return this.f13780g.f14117b + this.f13788p;
    }

    public final boolean b() {
        if (this.f13778e) {
            return !this.f13779f || this.f13774a.zzb() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean c() {
        if (this.f13778e) {
            return b() || d() - this.f13780g.f14117b >= C.TIME_UNSET;
        }
        return false;
    }

    public final long d() {
        if (!this.f13778e) {
            return this.f13780g.f14117b;
        }
        long jZzb = this.f13779f ? this.f13774a.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.f13780g.f14120e : jZzb;
    }

    public final void e(ci ciVar) {
        this.f13778e = true;
        this.f13786n = this.f13774a.zzn();
        s sVarF = f(ciVar);
        ez1 ez1Var = this.f13780g;
        long jMax = ez1Var.f14117b;
        long j10 = ez1Var.f14120e;
        if (j10 != C.TIME_UNSET && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jG = g(sVarF, jMax, false, new boolean[2]);
        long j11 = this.f13788p;
        ez1 ez1Var2 = this.f13780g;
        this.f13788p = (ez1Var2.f14117b - jG) + j11;
        this.f13780g = ez1Var2.a(jG, ez1Var2.f14118c);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x028d  */
    /* JADX WARN: Code duplicated, block: B:208:0x0448  */
    /* JADX WARN: Code duplicated, block: B:210:0x044e  */
    /* JADX WARN: Code duplicated, block: B:222:0x046d  */
    /* JADX WARN: Code duplicated, block: B:224:0x0472  */
    /* JADX WARN: Code duplicated, block: B:227:0x048d  */
    /* JADX WARN: Code duplicated, block: B:229:0x0491  */
    /* JADX WARN: Code duplicated, block: B:232:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:237:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:239:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:240:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:243:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:245:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:251:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:253:0x0500  */
    /* JADX WARN: Code duplicated, block: B:254:0x0503  */
    /* JADX WARN: Code duplicated, block: B:259:0x0525  */
    /* JADX WARN: Code duplicated, block: B:261:0x052b  */
    /* JADX WARN: Code duplicated, block: B:262:0x0535  */
    /* JADX WARN: Code duplicated, block: B:265:0x0543  */
    /* JADX WARN: Code duplicated, block: B:268:0x054d  */
    /* JADX WARN: Code duplicated, block: B:272:0x056b  */
    /* JADX WARN: Code duplicated, block: B:274:0x0577  */
    /* JADX WARN: Code duplicated, block: B:275:0x057a  */
    /* JADX WARN: Code duplicated, block: B:278:0x059c  */
    /* JADX WARN: Code duplicated, block: B:280:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:283:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:285:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:291:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:295:0x05fc A[LOOP:21: B:293:0x05f6->B:295:0x05fc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:299:0x061c  */
    /* JADX WARN: Code duplicated, block: B:301:0x0622  */
    /* JADX WARN: Code duplicated, block: B:306:0x063d  */
    /* JADX WARN: Code duplicated, block: B:308:0x0645  */
    /* JADX WARN: Code duplicated, block: B:309:0x0648  */
    /* JADX WARN: Code duplicated, block: B:313:0x0659  */
    /* JADX WARN: Code duplicated, block: B:317:0x066d  */
    /* JADX WARN: Code duplicated, block: B:319:0x0671  */
    /* JADX WARN: Code duplicated, block: B:330:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:332:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:334:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:344:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:346:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:347:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:352:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:355:0x0706  */
    /* JADX WARN: Code duplicated, block: B:357:0x0718  */
    /* JADX WARN: Code duplicated, block: B:359:0x0725  */
    /* JADX WARN: Code duplicated, block: B:364:0x0743  */
    /* JADX WARN: Code duplicated, block: B:366:0x0757  */
    /* JADX WARN: Code duplicated, block: B:367:0x075b  */
    /* JADX WARN: Code duplicated, block: B:371:0x077a  */
    /* JADX WARN: Code duplicated, block: B:373:0x0784  */
    /* JADX WARN: Code duplicated, block: B:374:0x0787  */
    /* JADX WARN: Code duplicated, block: B:377:0x0791  */
    /* JADX WARN: Code duplicated, block: B:379:0x079f  */
    /* JADX WARN: Code duplicated, block: B:382:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:384:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:387:0x07ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:397:0x0815 A[LOOP:34: B:395:0x0811->B:397:0x0815, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:401:0x084e  */
    /* JADX WARN: Code duplicated, block: B:403:0x0854  */
    /* JADX WARN: Code duplicated, block: B:405:0x0858  */
    /* JADX WARN: Code duplicated, block: B:406:0x085f  */
    /* JADX WARN: Code duplicated, block: B:408:0x0865  */
    /* JADX WARN: Code duplicated, block: B:410:0x0869  */
    /* JADX WARN: Code duplicated, block: B:411:0x086c  */
    /* JADX WARN: Code duplicated, block: B:416:0x0877 A[LOOP:36: B:415:0x0875->B:416:0x0877, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:463:0x04b3 A[EDGE_INSN: B:463:0x04b3->B:234:0x04b3 BREAK  A[LOOP:14: B:225:0x0488->B:233:0x04b0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x04f4 A[EDGE_INSN: B:466:0x04f4->B:249:0x04f4 BREAK  A[LOOP:15: B:235:0x04b7->B:248:0x04ed], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:0x04e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:0x05b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:479:0x055c A[EDGE_INSN: B:479:0x055c->B:270:0x055c BREAK  A[LOOP:19: B:263:0x053a->B:269:0x0552], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:481:0x0552 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:485:0x05ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x0627 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x065d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x06a0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x072a A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:223:0x046f -> B:205:0x0443). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:471:0x04e3
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final com.google.android.gms.internal.ads.s f(com.google.android.gms.internal.ads.ci r33) {
        /*
            Method dump skipped, instruction units count: 2176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dz1.f(com.google.android.gms.internal.ads.ci):com.google.android.gms.internal.ads.s");
    }

    public final long g(s sVar, long j10, boolean z10, boolean[] zArr) {
        ux1[] ux1VarArr;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= sVar.f19742a) {
                break;
            }
            if (z10 || !sVar.c(this.f13787o, i10)) {
                z11 = false;
            }
            this.f13782i[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            ux1VarArr = this.f13783j;
            if (i11 >= 2) {
                break;
            }
            ux1VarArr[i11].getClass();
            i11++;
        }
        l();
        this.f13787o = sVar;
        if (this.f13785m == null) {
            int i12 = 0;
            while (true) {
                s sVar2 = this.f13787o;
                if (i12 >= sVar2.f19742a) {
                    break;
                }
                sVar2.b(i12);
                p pVar = ((p[]) this.f13787o.f19744c)[i12];
                i12++;
            }
        }
        p[] pVarArr = (p[]) sVar.f19744c;
        k32 k32Var = this.f13774a;
        boolean[] zArr2 = this.f13782i;
        o42[] o42VarArr = this.f13776c;
        long jH = k32Var.h(pVarArr, zArr2, o42VarArr, zArr, j10);
        for (int i13 = 0; i13 < 2; i13++) {
            ux1VarArr[i13].getClass();
        }
        this.f13779f = false;
        for (int i14 = 0; i14 < 2; i14++) {
            if (o42VarArr[i14] != null) {
                ps1.c0(sVar.b(i14));
                ux1VarArr[i14].getClass();
                this.f13779f = true;
            } else {
                ps1.c0(pVarArr[i14] == null);
            }
        }
        return jH;
    }

    public final void h() {
        l();
        lo0 lo0Var = this.l;
        k32 k32Var = this.f13774a;
        try {
            IdentityHashMap identityHashMap = (IdentityHashMap) lo0Var.f17084e;
            lz1 lz1Var = (lz1) identityHashMap.remove(k32Var);
            lz1Var.getClass();
            lz1Var.f17165a.b(k32Var);
            lz1Var.f17167c.remove(k32Var.f16297a);
            if (!identityHashMap.isEmpty()) {
                lo0Var.q();
            }
            lo0Var.t(lz1Var);
        } catch (RuntimeException e10) {
            v71.J("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final dz1 i() {
        return this.f13785m;
    }

    public final v42 j() {
        return this.f13786n;
    }

    public final s k() {
        return this.f13787o;
    }

    public final void l() {
        if (this.f13785m != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            s sVar = this.f13787o;
            if (i10 >= sVar.f19742a) {
                return;
            }
            sVar.b(i10);
            p pVar = ((p[]) this.f13787o.f19744c)[i10];
            i10++;
        }
    }
}
