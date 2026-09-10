package p002kotlin.reflect.jvm.internal.impl.types;

import p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront;

/* JADX INFO: compiled from: TypeProjectionImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class treadless extends milliradian {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Variance f31813attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final oilcan f31814saneness;

    public treadless(Variance variance, oilcan oilcanVar) {
        if (variance == null) {
            wireman(0);
        }
        if (oilcanVar == null) {
            wireman(1);
        }
        this.f31813attabal = variance;
        this.f31814saneness = oilcanVar;
    }

    public static /* synthetic */ void wireman(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
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
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.timberyard
    public timberyard attabal(beachfront beachfrontVar) {
        if (beachfrontVar == null) {
            wireman(6);
        }
        return new treadless(this.f31813attabal, beachfrontVar.attabal(this.f31814saneness));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.timberyard
    public Variance dern() {
        Variance variance = this.f31813attabal;
        if (variance == null) {
            wireman(4);
        }
        return variance;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.timberyard
    public oilcan getType() {
        oilcan oilcanVar = this.f31814saneness;
        if (oilcanVar == null) {
            wireman(5);
        }
        return oilcanVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.timberyard
    public boolean saneness() {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public treadless(oilcan oilcanVar) {
        this(Variance.INVARIANT, oilcanVar);
        if (oilcanVar == null) {
            wireman(2);
        }
    }
}
