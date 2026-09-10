package bm;

import com.facebook.appevents.iap.InAppPurchaseConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f5734b = new k(1, "SUCCESS");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5735a;

    public k(int i10, String str) {
        if (i10 != 0) {
            this.f5735a = i10;
        } else {
            a(3);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0031  */
    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 3 : 2];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "debugMessage";
        } else if (i10 == 3) {
            objArr[0] = "success";
        } else if (i10 != 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
        } else {
            objArr[0] = "debugMessage";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                break;
            case 5:
                objArr[1] = "getResult";
                break;
            case 6:
                objArr[1] = InAppPurchaseConstants.METHOD_GET_DEBUG_MESSAGE;
                break;
            default:
                objArr[1] = "success";
                break;
        }
        if (i10 == 1) {
            objArr[2] = "incompatible";
        } else if (i10 == 2) {
            objArr[2] = "conflict";
        } else if (i10 == 3 || i10 == 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    public static k b(String str) {
        return new k(3, str);
    }

    public static k d(String str) {
        return new k(2, str);
    }

    public final int c() {
        int i10 = this.f5735a;
        if (i10 != 0) {
            return i10;
        }
        a(5);
        throw null;
    }
}
