package ea;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oa.n1 f39764a = oa.j0.D("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean b(com.google.android.gms.internal.measurement.g0 g0Var, oa.s1 s1Var, oa.s1 s1Var2, oa.b2 b2Var, char[] cArr, int i10, int i11, int i12, String str, String str2, String str3, boolean z10, boolean z11) {
        r3 r3Var;
        char c4;
        int iC = c(g0Var);
        if (iC > 0 && (i11 != 1 || i10 != 1)) {
            cArr[iC] = '2';
        }
        if (g(g0Var, s1Var2) == com.google.android.gms.internal.measurement.h0.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c4 = '3';
        } else {
            if (g0Var == com.google.android.gms.internal.measurement.g0.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i12 == 1 && b2Var.f47229d.equals(str)) {
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = '1';
                }
                return true;
            }
            if (s1Var.containsKey(g0Var) && (r3Var = (r3) s1Var.get(g0Var)) != null) {
                int iOrdinal = r3Var.ordinal();
                com.google.android.gms.internal.measurement.h0 h0Var = com.google.android.gms.internal.measurement.h0.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (iOrdinal != 0) {
                    com.google.android.gms.internal.measurement.h0 h0Var2 = com.google.android.gms.internal.measurement.h0.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return g(g0Var, s1Var2) == h0Var ? f(g0Var, cArr, str3, z11) : e(g0Var, cArr, str2, z10);
                        }
                        if (iOrdinal == 3) {
                            return g(g0Var, s1Var2) == h0Var2 ? e(g0Var, cArr, str2, z10) : f(g0Var, cArr, str3, z11);
                        }
                        c4 = '0';
                    } else if (g(g0Var, s1Var2) != h0Var2) {
                        return f(g0Var, cArr, str3, z11);
                    }
                } else if (g(g0Var, s1Var2) != h0Var) {
                    return e(g0Var, cArr, str2, z10);
                }
                c4 = '8';
            } else {
                c4 = '0';
            }
        }
        if (iC <= 0 || cArr[iC] == '2') {
            return false;
        }
        cArr[iC] = c4;
        return false;
    }

    public static final int c(com.google.android.gms.internal.measurement.g0 g0Var) {
        if (g0Var == com.google.android.gms.internal.measurement.g0.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (g0Var == com.google.android.gms.internal.measurement.g0.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (g0Var == com.google.android.gms.internal.measurement.g0.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return g0Var == com.google.android.gms.internal.measurement.g0.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String d(com.google.android.gms.internal.measurement.g0 g0Var, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < g0Var.zza()) ? "0" : String.valueOf(str.charAt(g0Var.zza() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= g0Var.zza()) {
            strValueOf = String.valueOf(str2.charAt(g0Var.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean e(com.google.android.gms.internal.measurement.g0 g0Var, char[] cArr, String str, boolean z10) {
        char c4;
        int iC = c(g0Var);
        if (!z10) {
            c4 = '4';
        } else {
            if (str.length() >= g0Var.zza()) {
                char cCharAt = str.charAt(g0Var.zza() - 1);
                boolean z11 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '6' : '1';
                }
                return z11;
            }
            c4 = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c4;
        }
        return false;
    }

    public static final boolean f(com.google.android.gms.internal.measurement.g0 g0Var, char[] cArr, String str, boolean z10) {
        char c4;
        int iC = c(g0Var);
        if (!z10) {
            c4 = '5';
        } else {
            if (str.length() >= g0Var.zza()) {
                char cCharAt = str.charAt(g0Var.zza() - 1);
                boolean z11 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '7' : '1';
                }
                return z11;
            }
            c4 = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c4;
        }
        return false;
    }

    public static final com.google.android.gms.internal.measurement.h0 g(com.google.android.gms.internal.measurement.g0 g0Var, oa.s1 s1Var) {
        Object obj = s1Var.get(g0Var);
        if (obj == null) {
            obj = com.google.android.gms.internal.measurement.h0.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (com.google.android.gms.internal.measurement.h0) obj;
    }
}
