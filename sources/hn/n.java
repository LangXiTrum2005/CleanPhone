package hn;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42444e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f42445f = AtomicLongFieldUpdater.newUpdater(n.class, "_state$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u f42446g = new u("REMOVE_FROZEN", 0);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f42448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f42450d;

    public n(int i10, boolean z10) {
        this.f42447a = i10;
        this.f42448b = z10;
        int i11 = i10 - 1;
        this.f42449c = i11;
        this.f42450d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f42445f;
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) != 0) {
                return (2305843009213693952L & j10) != 0 ? 2 : 1;
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f42449c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            boolean z10 = this.f42448b;
            AtomicReferenceArray atomicReferenceArray = this.f42450d;
            if (z10 || atomicReferenceArray.get(i11 & i12) == null) {
                n nVar = this;
                if (f42445f.compareAndSet(nVar, j10, ((-1152921503533105153L) & j10) | (((long) ((i11 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i11 & i12, obj);
                    n nVarC = nVar;
                    while ((atomicLongFieldUpdater.get(nVarC) & 1152921504606846976L) != 0) {
                        nVarC = nVarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = nVarC.f42450d;
                        int i13 = nVarC.f42449c & i11;
                        Object obj2 = atomicReferenceArray2.get(i13);
                        if ((obj2 instanceof m) && ((m) obj2).f42443a == i11) {
                            atomicReferenceArray2.set(i13, obj);
                        } else {
                            nVarC = null;
                        }
                        if (nVarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = nVar;
            } else {
                int i14 = this.f42447a;
                if (i14 < 1024 || ((i11 - i10) & 1073741823) > (i14 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f42445f;
            long j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
            n nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j10, 2305843009213693952L | j10)) {
                return true;
            }
            this = nVar;
        }
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        n nVar;
        while (true) {
            atomicLongFieldUpdater = f42445f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                nVar = this;
                break;
            }
            long j11 = 1152921504606846976L | j10;
            nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j10, j11)) {
                j10 = j11;
                break;
            }
            this = nVar;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42444e;
            n nVar2 = (n) atomicReferenceFieldUpdater.get(nVar);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.f42447a * 2, nVar.f42448b);
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            while (true) {
                int i12 = nVar.f42449c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object mVar = nVar.f42450d.get(i13);
                if (mVar == null) {
                    mVar = new m(i10);
                }
                nVar3.f42450d.set(nVar3.f42449c & i10, mVar);
                i10++;
            }
            atomicLongFieldUpdater.set(nVar3, (-1152921504606846977L) & j10);
            while (!atomicReferenceFieldUpdater.compareAndSet(nVar, null, nVar3) && atomicReferenceFieldUpdater.get(nVar) == null) {
            }
        }
    }

    public final Object d() {
        n nVarC = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f42445f;
            long j10 = atomicLongFieldUpdater.get(nVarC);
            if ((j10 & 1152921504606846976L) != 0) {
                return f42446g;
            }
            int i10 = (int) (j10 & 1073741823);
            int i11 = nVarC.f42449c;
            int i12 = i10 & i11;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i11) != i12) {
                AtomicReferenceArray atomicReferenceArray = nVarC.f42450d;
                Object obj = atomicReferenceArray.get(i12);
                boolean z10 = nVarC.f42448b;
                if (obj == null) {
                    if (z10) {
                    }
                } else if (!(obj instanceof m)) {
                    long j11 = (i10 + 1) & 1073741823;
                    if (f42445f.compareAndSet(nVarC, j10, (j10 & (-1073741824)) | j11)) {
                        atomicReferenceArray.set(i12, null);
                        return obj;
                    }
                    nVarC = this;
                    if (z10) {
                        while (true) {
                            long j12 = atomicLongFieldUpdater.get(nVarC);
                            int i13 = (int) (j12 & 1073741823);
                            if ((j12 & 1152921504606846976L) != 0) {
                                nVarC = nVarC.c();
                            } else {
                                n nVar = nVarC;
                                if (f42445f.compareAndSet(nVar, j12, (j12 & (-1073741824)) | j11)) {
                                    nVar.f42450d.set(i13 & nVar.f42449c, null);
                                    nVarC = null;
                                } else {
                                    nVarC = nVar;
                                }
                            }
                            if (nVarC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
