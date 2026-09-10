package om;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends h implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile m5.k f47566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ al.f f47567e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, al.l lVar2, al.f fVar) {
        super(lVar, lVar2);
        this.f47567e = fVar;
        if (lVar == null) {
            d(0);
            throw null;
        }
        this.f47566d = null;
    }

    public static /* synthetic */ void a(int i10) {
        String str = i10 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i10 != 2 ? 2 : 3];
        if (i10 != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = X3.i.X;
        }
        if (i10 != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i10 == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static /* synthetic */ void d(int i10) {
        String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 2 ? 3 : 2];
        if (i10 == 1) {
            objArr[0] = "computable";
        } else if (i10 != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i10 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // om.h
    public final void b(Object obj) {
        this.f47566d = new m5.k(obj);
        try {
            if (obj == null) {
                a(2);
                throw null;
            }
            this.f47567e.invoke(obj);
            this.f47566d = null;
        } catch (Throwable th2) {
            this.f47566d = null;
            throw th2;
        }
    }

    @Override // om.h
    public final bc.i c(boolean z10) {
        return new bc.i(12, (Object) new pm.g(j1.f.C(rm.i.f49701d)), false);
    }

    @Override // om.h, jk.a
    public final Object invoke() throws Throwable {
        Object objInvoke;
        m5.k kVar = this.f47566d;
        if (kVar == null || ((Thread) kVar.f45903c) != Thread.currentThread()) {
            objInvoke = super.invoke();
        } else {
            if (((Thread) kVar.f45903c) != Thread.currentThread()) {
                throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
            }
            objInvoke = kVar.f45902b;
        }
        if (objInvoke != null) {
            return objInvoke;
        }
        d(2);
        throw null;
    }
}
