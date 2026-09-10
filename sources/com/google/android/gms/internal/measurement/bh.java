package com.google.android.gms.internal.measurement;

import com.applovin.sdk.AppLovinEventTypes;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bh implements ah, lh {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f23324i = new String();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Level f23325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fh f23327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ih f23328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public qh f23329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f23330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f23331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q6 f23332h;

    public bh(q6 q6Var, Level level) {
        Objects.requireNonNull(q6Var);
        this.f23332h = q6Var;
        d.f23368a.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.f23327c = null;
        this.f23328d = null;
        this.f23329e = null;
        this.f23330f = null;
        this.f23331g = null;
        gb.b(level, AppLovinEventTypes.USER_COMPLETED_LEVEL);
        this.f23325a = level;
        this.f23326b = nanos;
    }

    @Override // com.google.android.gms.internal.measurement.lh
    public final lh a(Throwable th2) {
        mh mhVar = eh.f23436a;
        gb.b(mhVar, "metadata key");
        if (th2 != null) {
            d(mhVar, th2);
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00f9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [com.google.android.gms.internal.measurement.qh] */
    /* JADX WARN: Type inference failed for: r10v22, types: [com.google.android.gms.internal.measurement.rh] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.google.android.gms.internal.measurement.bh] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [com.google.android.gms.internal.measurement.qh] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [com.google.android.gms.internal.measurement.qh] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v31 */
    @Override // com.google.android.gms.internal.measurement.lh
    public final void b(String str, Object[] objArr) {
        boolean z10;
        fh fhVar;
        StackTraceElement[] stackTraceElementArr;
        int iL;
        int i10;
        xg xgVar;
        ?? ohVar;
        ?? r10;
        nh nhVar;
        ih ihVar = this.f23328d;
        gh ghVar = ih.f23598a;
        if (ihVar == null) {
            ((i) d.f23368a).getClass();
            i.f23554b.getClass();
            this.f23328d = ghVar;
        }
        jh shVar = this.f23328d;
        if (shVar != ghVar) {
            fh fhVar2 = this.f23327c;
            if (fhVar2 != null && fhVar2.f23471f > 0) {
                gb.b(shVar, "logSiteKey");
                int i11 = fhVar2.f23471f;
                for (int i12 = 0; i12 < i11; i12++) {
                    if (eh.f23441f.equals(fhVar2.h(i12))) {
                        shVar = new sh(shVar, fhVar2.i(i12));
                    }
                }
            }
        } else {
            shVar = null;
        }
        h hVarC = c();
        int iA = hVarC.a();
        for (int i13 = 0; i13 < iA; i13++) {
            if (hVarC.h(i13).f23753a == "eye3tag") {
                if (hVarC.j(eh.f23436a) != null) {
                    break;
                }
                mh mhVar = eh.f23444i;
                if (hVarC.j(mhVar) != null) {
                    break;
                }
                d(mhVar, th.SMALL);
                break;
            }
        }
        fh fhVar3 = this.f23327c;
        int i14 = -1;
        nh nhVar2 = qh.f23910a;
        if (fhVar3 != null) {
            if (shVar != null) {
                int i15 = zg.f24209d;
                if (fhVar3.j(eh.f23439d) != null) {
                    throw new ClassCastException();
                }
                fh fhVar4 = this.f23327c;
                wg wgVar = xg.f24154d;
                Integer num = (Integer) fhVar4.j(eh.f23437b);
                if (num == null) {
                    ohVar = 0;
                } else {
                    xgVar = (xg) xg.f24154d.c(shVar, fhVar4);
                    if (xgVar.f24155c.incrementAndGet() < num.intValue()) {
                        ohVar = xgVar;
                        ohVar = nhVar2;
                    }
                }
                ohVar = xgVar;
                fh fhVar5 = this.f23327c;
                wg wgVar2 = rh.f23945d;
                Integer num2 = (Integer) fhVar5.j(eh.f23438c);
                if (num2 == null || num2.intValue() <= 0) {
                    r10 = 0;
                } else {
                    r10 = (rh) rh.f23945d.c(shVar, fhVar5);
                    AtomicInteger atomicInteger = r10.f23947c;
                    if ((((Random) rh.f23946e.get()).nextInt(num2.intValue()) == 0 ? atomicInteger.incrementAndGet() : atomicInteger.get()) <= 0) {
                        r10 = nhVar2;
                    }
                }
                if (ohVar == 0) {
                    ohVar = r10;
                } else if (r10 != 0 && ohVar != nhVar2 && r10 != (nhVar = qh.f23911b)) {
                    if (r10 == nhVar2 || ohVar == nhVar) {
                        ohVar = r10;
                    } else {
                        ohVar = new oh(ohVar, r10);
                    }
                }
                this.f23329e = ohVar;
                z10 = ohVar != nhVar2;
            }
            fh fhVar6 = this.f23327c;
            mh mhVar2 = eh.f23444i;
            th thVar = (th) fhVar6.j(mhVar2);
            if (thVar != null) {
                fh fhVar7 = this.f23327c;
                if (fhVar7 != null && (iL = fhVar7.l(mhVar2)) >= 0) {
                    int i16 = iL + iL;
                    int i17 = i16 + 2;
                    while (true) {
                        i10 = fhVar7.f23471f;
                        if (i17 >= i10 + i10) {
                            break;
                        }
                        Object obj = fhVar7.f23470e[i17];
                        if (!obj.equals(mhVar2)) {
                            Object[] objArr2 = fhVar7.f23470e;
                            objArr2[i16] = obj;
                            objArr2[i16 + 1] = objArr2[i17 + 1];
                            i16 += 2;
                        }
                        i17 += 2;
                    }
                    fhVar7.f23471f = i10 - ((i17 - i16) >> 1);
                    while (i16 < i17) {
                        fhVar7.f23470e[i16] = null;
                        i16++;
                    }
                }
                h hVarC2 = c();
                mh mhVar3 = eh.f23436a;
                Throwable th2 = (Throwable) hVarC2.j(mhVar3);
                int i18 = thVar.f24001a;
                String[] strArr = d0.f23369a;
                if (i18 <= 0 && i18 != -1) {
                    throw new IllegalArgumentException("invalid maximum depth: 0");
                }
                d0.f23370b.getClass();
                if (!(i18 == -1 || i18 > 0)) {
                    throw new IllegalArgumentException("maxDepth must be > 0 or -1");
                }
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                String name = bh.class.getName();
                int i19 = 3;
                boolean z11 = false;
                while (true) {
                    if (i19 >= stackTrace.length) {
                        i19 = -1;
                        break;
                    }
                    if (!stackTrace[i19].getClassName().equals(name)) {
                        if (z11) {
                            break;
                        }
                    } else {
                        z11 = true;
                    }
                    i19++;
                }
                if (i19 == -1) {
                    stackTraceElementArr = new StackTraceElement[0];
                } else {
                    int length = stackTrace.length - i19;
                    if (i18 <= 0 || i18 >= length) {
                        i18 = length;
                    }
                    stackTraceElementArr = new StackTraceElement[i18];
                    System.arraycopy(stackTrace, i19, stackTraceElementArr, 0, i18);
                }
                kh khVar = new kh(thVar.toString(), th2);
                khVar.setStackTrace(stackTraceElementArr);
                d(mhVar3, khVar);
            }
        }
        qh qhVar = this.f23329e;
        if (qhVar != null) {
            ph phVar = (ph) ph.f23867c.c(shVar, this.f23327c);
            AtomicInteger atomicInteger2 = phVar.f23869b;
            AtomicBoolean atomicBoolean = phVar.f23868a;
            int iIncrementAndGet = atomicInteger2.incrementAndGet();
            if (qhVar != nhVar2 && atomicBoolean.compareAndSet(false, true)) {
                try {
                    qhVar.a();
                    atomicBoolean.set(false);
                    atomicInteger2.addAndGet(-iIncrementAndGet);
                    i14 = (-1) + iIncrementAndGet;
                } catch (Throwable th3) {
                    atomicBoolean.set(false);
                    throw th3;
                }
            }
            if (z10 && i14 > 0 && (fhVar = this.f23327c) != null) {
                fhVar.k(eh.f23440e, Integer.valueOf(i14));
            }
            z10 &= i14 >= 0;
        }
        if (z10) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            this.f23331g = objArrCopyOf;
            for (Object obj2 : objArrCopyOf) {
            }
            if (str != f23324i) {
                b0 b0Var = b0.f23308c;
                this.f23330f = new g(str);
            }
            ((i) d.f23368a).getClass();
            w wVarB = n.f23758b.b();
            if (!wVarB.f24104a.isEmpty()) {
                h hVarC3 = c();
                dh dhVar = eh.f23443h;
                w wVar = (w) hVarC3.j(dhVar);
                if (wVar != null) {
                    v vVar = wVar.f24104a;
                    if (!vVar.isEmpty()) {
                        v vVar2 = wVarB.f24104a;
                        if (!vVar2.isEmpty()) {
                            wVar = new w(new v(vVar2, vVar));
                        }
                        wVarB = wVar;
                    }
                }
                d(dhVar, wVarB);
            }
            y2 y2Var = (y2) this.f23332h.f23891b;
            try {
                e0 e0Var = (e0) e0.f23403b.get();
                int i20 = e0Var.f23404a + 1;
                e0Var.f23404a = i20;
                if (i20 == 0) {
                    throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
                }
                try {
                    if (i20 <= 100) {
                        y2Var.f(this);
                    } else {
                        q6.d("unbounded recursion in log statement", this);
                    }
                    e0Var.close();
                } catch (Throwable th4) {
                    try {
                        e0Var.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            } catch (RuntimeException e10) {
                try {
                    y2Var.i(e10, this);
                } catch (RuntimeException e11) {
                    String name2 = e11.getClass().getName();
                    String message = e11.getMessage();
                    StringBuilder sb2 = new StringBuilder(name2.length() + 2 + String.valueOf(message).length());
                    sb2.append(name2);
                    sb2.append(": ");
                    sb2.append(message);
                    q6.d(sb2.toString(), this);
                    try {
                        e11.printStackTrace(System.err);
                    } catch (RuntimeException unused) {
                    }
                }
            }
        }
    }

    public final h c() {
        fh fhVar = this.f23327c;
        return fhVar != null ? fhVar : ai.f23303e;
    }

    public final void d(mh mhVar, Object obj) {
        if (this.f23327c == null) {
            fh fhVar = new fh();
            fhVar.f23470e = new Object[8];
            fhVar.f23471f = 0;
            this.f23327c = fhVar;
        }
        this.f23327c.k(mhVar, obj);
    }

    @Override // com.google.android.gms.internal.measurement.lh
    public final lh zzn() {
        hh hhVar = new hh();
        hhVar.f23552b = 0;
        if (this.f23328d == null) {
            this.f23328d = hhVar;
        }
        return this;
    }
}
