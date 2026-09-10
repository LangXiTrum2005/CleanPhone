package cl;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p extends al.b implements zk.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yl.f f6584b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(al.j jVar, yl.f fVar) {
        super(jVar);
        if (jVar == null) {
            z0(0);
            throw null;
        }
        if (fVar == null) {
            z0(1);
            throw null;
        }
        this.f6584b = fVar;
    }

    public static String H0(zk.j jVar) {
        try {
            String str = am.h.f3708e.w(jVar) + X3.j.f27834d + jVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(jVar)) + X3.j.f27836e;
            if (str != null) {
                return str;
            }
            z0(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = jVar.getClass().getSimpleName() + " " + jVar.getName();
            if (str2 != null) {
                return str2;
            }
            z0(6);
            throw null;
        }
    }

    public static /* synthetic */ void z0(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5 || i10 == 6) {
            objArr[1] = InAppPurchaseConstants.METHOD_TO_STRING;
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                objArr[2] = InAppPurchaseConstants.METHOD_TO_STRING;
            } else if (i10 != 5 && i10 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // zk.j
    public final yl.f getName() {
        yl.f fVar = this.f6584b;
        if (fVar != null) {
            return fVar;
        }
        z0(2);
        throw null;
    }

    public String toString() {
        return H0(this);
    }

    public zk.j a() {
        return this;
    }
}
