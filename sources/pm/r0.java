package pm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r0 extends q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f48473b;

    public r0(int i10, y yVar) {
        if (i10 == 0) {
            e(0);
            throw null;
        }
        if (yVar == null) {
            e(1);
            throw null;
        }
        this.f48472a = i10;
        this.f48473b = yVar;
    }

    public static /* synthetic */ void e(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i10 == 3) {
            objArr[2] = "replaceType";
        } else if (i10 != 4 && i10 != 5) {
            if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // pm.q0
    public final int a() {
        int i10 = this.f48472a;
        if (i10 != 0) {
            return i10;
        }
        e(4);
        throw null;
    }

    @Override // pm.q0
    public final y b() {
        y yVar = this.f48473b;
        if (yVar != null) {
            return yVar;
        }
        e(5);
        throw null;
    }

    @Override // pm.q0
    public final boolean c() {
        return false;
    }

    @Override // pm.q0
    public final q0 d(qm.f fVar) {
        if (fVar == null) {
            e(6);
            throw null;
        }
        y type = this.f48473b;
        kotlin.jvm.internal.n.f(type, "type");
        return new r0(this.f48472a, type);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r0(y yVar) {
        this(1, yVar);
        if (yVar != null) {
        } else {
            e(2);
            throw null;
        }
    }
}
