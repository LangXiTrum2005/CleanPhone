package s1;

import android.os.SystemClock;
import b2.w;
import com.google.android.gms.internal.ads.a0;
import com.google.android.gms.internal.ads.bq0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ea.b0;
import i1.d0;
import i1.p;
import i2.r;
import j2.n;
import j2.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import l1.y;
import n1.u;
import oa.j0;
import p1.e1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements g2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f50037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k5.g f50038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f50039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f50040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n1.h f50041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f50042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f50043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f50044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h[] f50045i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r f50046j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t1.c f50047k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f2.b f50048m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f50049n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, s1.i] */
    public i(bc.i iVar, o oVar, t1.c cVar, k5.g gVar, int i10, int[] iArr, r rVar, int i11, n1.h hVar, long j10, int i12, boolean z10, ArrayList arrayList, l lVar) {
        int i13;
        n2.k gVar2;
        g2.e eVar;
        ?? obj = new Object();
        obj.f50037a = oVar;
        obj.f50047k = cVar;
        obj.f50038b = gVar;
        obj.f50039c = iArr;
        obj.f50046j = rVar;
        obj.f50040d = i11;
        obj.f50041e = hVar;
        obj.l = i10;
        obj.f50042f = j10;
        obj.f50043g = i12;
        l lVar2 = lVar;
        obj.f50044h = lVar2;
        long jC = cVar.c(i10);
        ArrayList arrayListF = obj.f();
        obj.f50045i = new h[rVar.length()];
        int i14 = 0;
        int i15 = 0;
        i iVar2 = obj;
        while (i15 < iVar2.f50045i.length) {
            t1.m mVar = (t1.m) arrayListF.get(rVar.getIndexInTrackGroup(i15));
            t1.b bVarX = gVar.x(mVar.f50389b);
            h[] hVarArr = iVar2.f50045i;
            t1.b bVar = bVarX == null ? (t1.b) mVar.f50389b.get(i14) : bVarX;
            p pVar = mVar.f50388a;
            iVar.getClass();
            String str = pVar.f42642m;
            if (d0.l(str)) {
                if (iVar.f5552b) {
                    gVar2 = new k3.h(((n) iVar.f5553c).g(pVar), pVar);
                } else {
                    eVar = null;
                    i13 = i15;
                    mVar = mVar;
                    hVarArr = hVarArr;
                }
                long j11 = jC;
                hVarArr[i13] = new h(j11, mVar, bVar, eVar, 0L, mVar.b());
                i15 = i13 + 1;
                iVar2 = this;
                lVar2 = lVar;
                jC = j11;
                i14 = 0;
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith(MimeTypes.AUDIO_WEBM) || str.startsWith(MimeTypes.APPLICATION_WEBM) || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    i13 = i15;
                    gVar2 = new f3.e((n) iVar.f5553c, iVar.f5552b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    gVar2 = new j3.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    gVar2 = new j3.a((byte) 0, 0);
                } else {
                    int i16 = z10 ? 4 : 0;
                    i13 = i15;
                    gVar2 = new h3.g((n) iVar.f5553c, iVar.f5552b ? i16 : i16 | 32, null, null, arrayList, lVar2);
                }
                eVar = new g2.e(gVar2, i11, pVar);
                long j12 = jC;
                hVarArr[i13] = new h(j12, mVar, bVar, eVar, 0L, mVar.b());
                i15 = i13 + 1;
                iVar2 = this;
                lVar2 = lVar;
                jC = j12;
                i14 = 0;
            }
            i13 = i15;
            eVar = new g2.e(gVar2, i11, pVar);
            long j13 = jC;
            hVarArr[i13] = new h(j13, mVar, bVar, eVar, 0L, mVar.b());
            i15 = i13 + 1;
            iVar2 = this;
            lVar2 = lVar;
            jC = j13;
            i14 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    @Override // g2.j
    public final long a(long j10, e1 e1Var) {
        long jE;
        for (h hVar : this.f50045i) {
            g gVar = hVar.f50034d;
            long j11 = hVar.f50036f;
            g gVar2 = hVar.f50034d;
            if (gVar != null) {
                long jC = hVar.c();
                if (jC != 0) {
                    gVar2.getClass();
                    long jK = gVar2.k(j10, hVar.f50035e) + j11;
                    long jE2 = hVar.e(jK);
                    if (jE2 >= j10) {
                        jE = jE2;
                    } else {
                        if (jC != -1) {
                            gVar2.getClass();
                            if (jK >= ((gVar2.A() + j11) + jC) - 1) {
                                jE = jE2;
                            }
                        }
                        jE = hVar.e(jK + 1);
                    }
                    return e1Var.a(j10, jE2, jE);
                }
            }
        }
        return j10;
    }

    @Override // g2.j
    public final void b(g2.f fVar) {
        if (fVar instanceof g2.l) {
            int iF = this.f50046j.f(((g2.l) fVar).f41369d);
            h[] hVarArr = this.f50045i;
            h hVar = hVarArr[iF];
            if (hVar.f50034d == null) {
                g2.e eVar = hVar.f50031a;
                eVar.getClass();
                n2.g gVarA = eVar.a();
                if (gVarA != null) {
                    t1.m mVar = hVar.f50032b;
                    hVarArr[iF] = new h(hVar.f50035e, mVar, hVar.f50033c, hVar.f50031a, hVar.f50036f, new androidx.recyclerview.widget.c(gVarA, mVar.f50390c, 11));
                }
            }
        }
        l lVar = this.f50044h;
        if (lVar != null) {
            long j10 = lVar.f50063d;
            if (j10 == C.TIME_UNSET || fVar.f41373h > j10) {
                lVar.f50063d = fVar.f41373h;
            }
            lVar.f50064e.f50071g = true;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r15v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v17 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v5 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v6 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r22v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v4 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // g2.j
    public final void c(p1.k0 r63, long r64, java.util.List r66, bc.i r67) {
        /*
            Method dump skipped, instruction units count: 943
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.i.c(p1.k0, long, java.util.List, bc.i):void");
    }

    @Override // g2.j
    public final boolean d(g2.f fVar, boolean z10, w wVar, b0 b0Var) {
        long jMax;
        if (z10) {
            l lVar = this.f50044h;
            if (lVar != null) {
                long j10 = lVar.f50063d;
                boolean z11 = j10 != C.TIME_UNSET && j10 < fVar.f41372g;
                m mVar = lVar.f50064e;
                if (mVar.f50070f.f50342d) {
                    if (!mVar.f50072h) {
                        if (z11) {
                            if (mVar.f50071g) {
                                mVar.f50072h = true;
                                mVar.f50071g = false;
                                f fVar2 = (f) mVar.f50066b.f47269b;
                                fVar2.D.removeCallbacks(fVar2.f50027w);
                                fVar2.D();
                                return true;
                            }
                        }
                    }
                    return true;
                }
            }
            boolean z12 = this.f50047k.f50342d;
            h[] hVarArr = this.f50045i;
            if (!z12 && (fVar instanceof g2.m)) {
                IOException iOException = (IOException) wVar.f5411c;
                if ((iOException instanceof u) && ((u) iOException).f46407c == 404) {
                    h hVar = hVarArr[this.f50046j.f(fVar.f41369d)];
                    long jC = hVar.c();
                    if (jC != -1 && jC != 0) {
                        g gVar = hVar.f50034d;
                        gVar.getClass();
                        if (((g2.m) fVar).a() > ((gVar.A() + hVar.f50036f) + jC) - 1) {
                            this.f50049n = true;
                            return true;
                        }
                    }
                }
            }
            h hVar2 = hVarArr[this.f50046j.f(fVar.f41369d)];
            t1.m mVar2 = hVar2.f50032b;
            t1.b bVar = hVar2.f50033c;
            j0 j0Var = mVar2.f50389b;
            k5.g gVar2 = this.f50038b;
            t1.b bVarX = gVar2.x(j0Var);
            if (bVarX == null || bVar.equals(bVarX)) {
                r rVar = this.f50046j;
                j0 j0Var2 = hVar2.f50032b.f50389b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                int length = rVar.length();
                int i10 = 0;
                for (int i11 = 0; i11 < length; i11++) {
                    if (rVar.a(i11, jElapsedRealtime)) {
                        i10++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i12 = 0; i12 < j0Var2.size(); i12++) {
                    hashSet.add(Integer.valueOf(((t1.b) j0Var2.get(i12)).f50337c));
                }
                int size = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList arrayListB = gVar2.b(j0Var2);
                for (int i13 = 0; i13 < arrayListB.size(); i13++) {
                    hashSet2.add(Integer.valueOf(((t1.b) arrayListB.get(i13)).f50337c));
                }
                bq0 bq0Var = new bq0(size, size - hashSet2.size(), length, i10);
                if (bq0Var.a(2) || bq0Var.a(1)) {
                    b0Var.getClass();
                    a0 a0VarC = b0.c(bq0Var, wVar);
                    if (a0VarC != null) {
                        long j11 = a0VarC.f11792b;
                        int i14 = a0VarC.f11791a;
                        if (bq0Var.a(i14)) {
                            if (i14 == 2) {
                                r rVar2 = this.f50046j;
                                return rVar2.c(rVar2.f(fVar.f41369d), j11);
                            }
                            if (i14 == 1) {
                                long jElapsedRealtime2 = SystemClock.elapsedRealtime() + j11;
                                String str = bVar.f50336b;
                                HashMap map = (HashMap) gVar2.f44325a;
                                if (map.containsKey(str)) {
                                    Long l = (Long) map.get(str);
                                    String str2 = y.f44830a;
                                    jMax = Math.max(jElapsedRealtime2, l.longValue());
                                } else {
                                    jMax = jElapsedRealtime2;
                                }
                                map.put(str, Long.valueOf(jMax));
                                int i15 = bVar.f50337c;
                                if (i15 != Integer.MIN_VALUE) {
                                    Integer numValueOf = Integer.valueOf(i15);
                                    HashMap map2 = (HashMap) gVar2.f44326b;
                                    if (map2.containsKey(numValueOf)) {
                                        Long l10 = (Long) map2.get(numValueOf);
                                        String str3 = y.f44830a;
                                        jElapsedRealtime2 = Math.max(jElapsedRealtime2, l10.longValue());
                                    }
                                    map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // g2.j
    public final boolean e(long j10, g2.f fVar, List list) {
        if (this.f50048m != null) {
            return false;
        }
        return this.f50046j.d(j10, fVar, list);
    }

    public final ArrayList f() {
        List list = this.f50047k.a(this.l).f50374c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f50039c) {
            arrayList.addAll(((t1.a) list.get(i10)).f50331c);
        }
        return arrayList;
    }

    public final h g(int i10) {
        h[] hVarArr = this.f50045i;
        h hVar = hVarArr[i10];
        t1.b bVarX = this.f50038b.x(hVar.f50032b.f50389b);
        if (bVarX == null || bVarX.equals(hVar.f50033c)) {
            return hVar;
        }
        h hVar2 = new h(hVar.f50035e, hVar.f50032b, bVarX, hVar.f50031a, hVar.f50036f, hVar.f50034d);
        hVarArr[i10] = hVar2;
        return hVar2;
    }

    @Override // g2.j
    public final int getPreferredQueueSize(long j10, List list) {
        return (this.f50048m != null || this.f50046j.length() < 2) ? list.size() : this.f50046j.evaluateQueueSize(j10, list);
    }

    @Override // g2.j
    public final void maybeThrowError() throws f2.b {
        f2.b bVar = this.f50048m;
        if (bVar != null) {
            throw bVar;
        }
        this.f50037a.maybeThrowError();
    }

    @Override // g2.j
    public final void release() {
        for (h hVar : this.f50045i) {
            g2.e eVar = hVar.f50031a;
            if (eVar != null) {
                eVar.f41356a.release();
            }
        }
    }
}
