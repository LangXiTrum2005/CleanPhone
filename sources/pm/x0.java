package pm;

import com.facebook.appevents.iap.InAppPurchaseConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48487b;

    public x0(String str) {
        this.f48487b = str;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    public static /* synthetic */ void E0(int i10) {
        String str = (i10 == 1 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 4) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        } else if (i10 == 2) {
            objArr[0] = "delegate";
        } else if (i10 == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i10 != 4) {
            objArr[0] = "newAttributes";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        }
        if (i10 == 1) {
            objArr[1] = InAppPurchaseConstants.METHOD_TO_STRING;
        } else if (i10 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        } else {
            objArr[1] = "refine";
        }
        if (i10 != 1) {
            if (i10 == 2) {
                objArr[2] = "replaceDelegate";
            } else if (i10 == 3) {
                objArr[2] = "refine";
            } else if (i10 != 4) {
                objArr[2] = "replaceAttributes";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // pm.c0
    /* JADX INFO: renamed from: A0 */
    public final c0 m0(j0 j0Var) {
        if (j0Var != null) {
            throw new IllegalStateException(this.f48487b);
        }
        E0(0);
        throw null;
    }

    @Override // pm.o
    public final c0 B0() {
        throw new IllegalStateException(this.f48487b);
    }

    @Override // pm.o
    /* JADX INFO: renamed from: C0 */
    public final c0 U(qm.f fVar) {
        if (fVar != null) {
            return this;
        }
        E0(3);
        throw null;
    }

    @Override // pm.o
    public final o D0(c0 c0Var) {
        throw new IllegalStateException(this.f48487b);
    }

    @Override // pm.o, pm.y
    /* JADX INFO: renamed from: U */
    public final y j0(qm.f fVar) {
        if (fVar != null) {
            return this;
        }
        E0(3);
        throw null;
    }

    @Override // pm.c0, pm.a1
    public final /* bridge */ /* synthetic */ a1 i0(boolean z10) {
        i0(z10);
        throw null;
    }

    @Override // pm.o, pm.a1
    public final a1 j0(qm.f fVar) {
        if (fVar != null) {
            return this;
        }
        E0(3);
        throw null;
    }

    @Override // pm.c0, pm.a1
    public final /* bridge */ /* synthetic */ a1 m0(j0 j0Var) {
        m0(j0Var);
        throw null;
    }

    @Override // pm.c0
    public final String toString() {
        String str = this.f48487b;
        if (str != null) {
            return str;
        }
        E0(1);
        throw null;
    }

    @Override // pm.c0
    /* JADX INFO: renamed from: z0 */
    public final c0 i0(boolean z10) {
        throw new IllegalStateException(this.f48487b);
    }
}
