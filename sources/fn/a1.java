package fn;

import com.google.android.gms.internal.ads.fs1;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a1 extends fs1 implements n0, e, gn.l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f41028e = AtomicReferenceFieldUpdater.newUpdater(a1.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41029d;

    public a1(Object obj) {
        this._state$volatile = obj;
    }

    @Override // fn.m0
    public final boolean a(Object obj) {
        d0(obj);
        return true;
    }

    @Override // gn.l
    public final e b(ak.k kVar, int i10, en.a aVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != en.a.f40123b) ? g.n(this, kVar, i10, aVar) : this;
    }

    public final boolean c0(Object obj, Object obj2) {
        hn.u uVar = gn.b.f41982b;
        if (obj == null) {
            obj = uVar;
        }
        if (obj2 == null) {
            obj2 = uVar;
        }
        return e0(obj, obj2);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00ee A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0032, B:33:0x0084, B:35:0x008c, B:38:0x0093, B:39:0x0097, B:41:0x009a, B:51:0x00bb, B:54:0x00cb, B:55:0x00e7, B:61:0x00f7, B:58:0x00ee, B:60:0x00f4, B:43:0x00a0, B:47:0x00a7, B:21:0x0049, B:24:0x0052, B:32:0x0075, B:27:0x0060, B:29:0x0064), top: B:68:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[LOOP:0: B:55:0x00e7->B:73:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00ca -> B:33:0x0084). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // fn.e
    public final java.lang.Object collect(fn.f r14, ak.f r15) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fn.a1.collect(fn.f, ak.f):java.lang.Object");
    }

    public final void d0(Object obj) {
        if (obj == null) {
            obj = gn.b.f41982b;
        }
        e0(null, obj);
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final gn.c e() {
        return new b1();
    }

    public final boolean e0(Object obj, Object obj2) {
        int i10;
        gn.c[] cVarArr;
        hn.u uVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f41028e;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.n.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.n.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i11 = this.f41029d;
            if ((i11 & 1) != 0) {
                this.f41029d = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f41029d = i12;
            gn.c[] cVarArr2 = (gn.c[]) this.f14525c;
            while (true) {
                b1[] b1VarArr = (b1[]) cVarArr2;
                if (b1VarArr != null) {
                    for (b1 b1Var : b1VarArr) {
                        if (b1Var != null) {
                            AtomicReference atomicReference = b1Var.f41036a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (uVar = g.f41072c)) {
                                    break;
                                }
                                hn.u uVar2 = g.f41071b;
                                if (obj4 != uVar2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, uVar2)) {
                                            ((cn.l) obj4).resumeWith(wj.r.f53297a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, uVar)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f41029d;
                    if (i10 == i12) {
                        this.f41029d = i12 + 1;
                        return true;
                    }
                    cVarArr = (gn.c[]) this.f14525c;
                }
                cVarArr2 = cVarArr;
                i12 = i10;
            }
        }
    }

    @Override // fn.m0, fn.f
    public final Object emit(Object obj, ak.f fVar) {
        d0(obj);
        return wj.r.f53297a;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final gn.c[] f() {
        return new b1[2];
    }

    @Override // fn.y0
    public final Object getValue() {
        hn.u uVar = gn.b.f41982b;
        Object obj = f41028e.get(this);
        if (obj == uVar) {
            return null;
        }
        return obj;
    }
}
