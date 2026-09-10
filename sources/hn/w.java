package hn;

import cn.u0;
import cn.v0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f42460b = AtomicIntegerFieldUpdater.newUpdater(w.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u0[] f42461a;

    public final void a(u0 u0Var) {
        u0Var.c((v0) this);
        u0[] u0VarArr = this.f42461a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f42460b;
        if (u0VarArr == null) {
            u0VarArr = new u0[4];
            this.f42461a = u0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= u0VarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(u0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.n.e(objArrCopyOf, "copyOf(...)");
            u0VarArr = (u0[]) objArrCopyOf;
            this.f42461a = u0VarArr;
        }
        int i10 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i10 + 1);
        u0VarArr[i10] = u0Var;
        u0Var.f6773b = i10;
        c(i10);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final u0 b(int i10) {
        int i11;
        int i12;
        Object[] objArr;
        int i13;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.f42461a;
        kotlin.jvm.internal.n.c(objArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f42460b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i10 < atomicIntegerFieldUpdater.get(this)) {
            d(i10, atomicIntegerFieldUpdater.get(this));
            int i14 = (i10 - 1) / 2;
            if (i10 > 0) {
                u0 u0Var = objArr2[i10];
                kotlin.jvm.internal.n.c(u0Var);
                Object obj2 = objArr2[i14];
                kotlin.jvm.internal.n.c(obj2);
                if (u0Var.compareTo(obj2) < 0) {
                    d(i10, i14);
                    c(i14);
                } else {
                    while (true) {
                        i11 = i10 * 2;
                        i12 = i11 + 1;
                        if (i12 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.f42461a;
                        kotlin.jvm.internal.n.c(objArr);
                        i13 = i11 + 2;
                        if (i13 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i13];
                            kotlin.jvm.internal.n.c(comparable3);
                            obj = objArr[i12];
                            kotlin.jvm.internal.n.c(obj);
                            if (comparable3.compareTo(obj) >= 0) {
                                i13 = i12;
                            }
                        } else {
                            i13 = i12;
                        }
                        comparable = objArr[i10];
                        kotlin.jvm.internal.n.c(comparable);
                        comparable2 = objArr[i13];
                        kotlin.jvm.internal.n.c(comparable2);
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        d(i10, i13);
                        i10 = i13;
                    }
                }
            } else {
                while (true) {
                    i11 = i10 * 2;
                    i12 = i11 + 1;
                    if (i12 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.f42461a;
                    kotlin.jvm.internal.n.c(objArr);
                    i13 = i11 + 2;
                    if (i13 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i13];
                        kotlin.jvm.internal.n.c(comparable3);
                        obj = objArr[i12];
                        kotlin.jvm.internal.n.c(obj);
                        if (comparable3.compareTo(obj) >= 0) {
                            i13 = i12;
                        }
                    } else {
                        i13 = i12;
                    }
                    comparable = objArr[i10];
                    kotlin.jvm.internal.n.c(comparable);
                    comparable2 = objArr[i13];
                    kotlin.jvm.internal.n.c(comparable2);
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    d(i10, i13);
                    i10 = i13;
                }
            }
        }
        u0 u0Var2 = objArr2[atomicIntegerFieldUpdater.get(this)];
        kotlin.jvm.internal.n.c(u0Var2);
        u0Var2.c(null);
        u0Var2.f6773b = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return u0Var2;
    }

    public final void c(int i10) {
        while (i10 > 0) {
            u0[] u0VarArr = this.f42461a;
            kotlin.jvm.internal.n.c(u0VarArr);
            int i11 = (i10 - 1) / 2;
            u0 u0Var = u0VarArr[i11];
            kotlin.jvm.internal.n.c(u0Var);
            u0 u0Var2 = u0VarArr[i10];
            kotlin.jvm.internal.n.c(u0Var2);
            if (u0Var.compareTo(u0Var2) <= 0) {
                return;
            }
            d(i10, i11);
            i10 = i11;
        }
    }

    public final void d(int i10, int i11) {
        u0[] u0VarArr = this.f42461a;
        kotlin.jvm.internal.n.c(u0VarArr);
        u0 u0Var = u0VarArr[i11];
        kotlin.jvm.internal.n.c(u0Var);
        u0 u0Var2 = u0VarArr[i10];
        kotlin.jvm.internal.n.c(u0Var2);
        u0VarArr[i10] = u0Var;
        u0VarArr[i11] = u0Var2;
        u0Var.f6773b = i10;
        u0Var2.f6773b = i11;
    }
}
