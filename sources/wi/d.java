package wi;

import com.android.billingclient.api.BillingResult;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class d {
    public static final boolean a(int i10) {
        return i10 == 6 || i10 == 4;
    }

    public static /* synthetic */ boolean b(int i10) {
        switch (i10) {
            case 1:
                return true;
            case 2:
            case 3:
                return false;
            case 4:
            case 5:
                return true;
            case 6:
                return false;
            default:
                throw null;
        }
    }

    public static /* synthetic */ int c(int i10) {
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    if (i10 == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i11;
    }

    public static /* synthetic */ String d(int i10) {
        if (i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            return "only_me";
        }
        if (i10 == 3) {
            return "friends";
        }
        if (i10 == 4) {
            return "everyone";
        }
        throw null;
    }

    public static /* synthetic */ String e(int i10) {
        if (i10 == 1) {
            return "facebook";
        }
        if (i10 == 2) {
            return "instagram";
        }
        throw null;
    }

    public static int f(int i10, int i11, int i12) {
        return (Integer.hashCode(i10) + i11) * i12;
    }

    public static BillingResult g(int i10, String str) {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(i10);
        builderNewBuilder.setDebugMessage(str);
        return builderNewBuilder.build();
    }

    public static String h(String str, String str2) {
        return str + str2;
    }

    public static String i(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String j(StringBuilder sb2, String str) {
        return str + ((Object) sb2);
    }

    public static String k(StringBuilder sb2, String str, char c4) {
        sb2.append(str);
        sb2.append(c4);
        return sb2.toString();
    }

    public static StringBuilder l(long j10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j10);
        sb2.append(str2);
        return sb2;
    }

    public static void m(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    public static /* synthetic */ String n(int i10) {
        if (i10 == 1) {
            return "S256";
        }
        if (i10 == 2) {
            return "PLAIN";
        }
        throw null;
    }

    public static /* synthetic */ String o(int i10) {
        switch (i10) {
            case 1:
                return "NATIVE_WITH_FALLBACK";
            case 2:
                return "NATIVE_ONLY";
            case 3:
                return "KATANA_ONLY";
            case 4:
                return "WEB_ONLY";
            case 5:
                return "DIALOG_ONLY";
            case 6:
                return "DEVICE_AUTH";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String p(int i10) {
        if (i10 == 1) {
            return "DECLARATION";
        }
        if (i10 == 2) {
            return "FAKE_OVERRIDE";
        }
        if (i10 != 3) {
            return i10 != 4 ? "null" : "SYNTHESIZED";
        }
        return "DELEGATION";
    }
}
