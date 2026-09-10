package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzof {
    static final ImmutableList zza = ImmutableList.B("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");
    public static final /* synthetic */ int zzb = 0;

    public static String zza(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static int zzb(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public static final boolean zzc(com.google.android.gms.internal.measurement.zzkp zzkpVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i2, int i3, int i4, int i5, int i6, String str, String str2, String str3, boolean z2, boolean z3, boolean z4) {
        int i7;
        int i8;
        ImmutableSet immutableSet2;
        String str4;
        zzoe zzoeVar;
        char c2;
        int iZze = zze(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i2, i3, i4, i5, i6, str, str2, str3, z2, z3, true);
        if (iZze > 0) {
            i8 = i4;
            if (i8 == 1) {
                i7 = i3;
                if (i7 != 1) {
                    i8 = 1;
                } else {
                    i7 = 1;
                    i8 = 1;
                }
            } else {
                i7 = i3;
            }
            cArr[iZze] = '2';
        } else {
            i7 = i3;
            i8 = i4;
        }
        if (zzi(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i2, i7, i8, i5, i6, str, str2, str3, z2, z3, true) == com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c2 = '3';
        } else {
            int i9 = i6;
            if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                immutableSet2 = immutableSet;
                str4 = str;
                if (i9 == 1) {
                    if (immutableSet2.contains(str4)) {
                        if (iZze > 0 && cArr[iZze] != '2') {
                            cArr[iZze] = '1';
                        }
                        return true;
                    }
                    i9 = 1;
                }
            } else {
                immutableSet2 = immutableSet;
                str4 = str;
            }
            if (immutableMap.containsKey(zzkpVar) && (zzoeVar = (zzoe) immutableMap.get(zzkpVar)) != null) {
                int iOrdinal = zzoeVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return zzi(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i2, i7, i8, i5, i9, str, str2, str3, z2, z3, true) == com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? zzh(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i2, i7, i8, i5, i9, str, str2, str3, z2, z3, true) : zzg(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i2, i7, i8, i5, i9, str, str2, str3, z2, z3, true);
                        }
                        if (iOrdinal == 3) {
                            return zzi(zzkpVar, immutableMap, immutableMap2, immutableSet2, cArr, i2, i7, i8, i5, i9, str4, str2, str3, z2, z3, true) == com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? zzg(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i2, i7, i8, i5, i9, str, str2, str3, z2, z3, true) : zzh(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i2, i7, i8, i5, i9, str, str2, str3, z2, z3, true);
                        }
                        c2 = '0';
                    } else if (zzi(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i2, i7, i8, i5, i9, str, str2, str3, z2, z3, true) != com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return zzh(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i2, i7, i8, i5, i9, str, str2, str3, z2, z3, true);
                    }
                } else if (zzi(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i2, i7, i8, i5, i9, str, str2, str3, z2, z3, true) != com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return zzg(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i2, i7, i8, i5, i9, str, str2, str3, z2, z3, true);
                }
                c2 = '8';
            } else {
                c2 = '0';
            }
        }
        if (iZze <= 0 || cArr[iZze] == '2') {
            return false;
        }
        cArr[iZze] = c2;
        return false;
    }

    public static final Map zzd(ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i2, int i3, int i4, int i5, int i6, String str, String str2, String str3, boolean z2, boolean z3, boolean z4) {
        if (!z4) {
            return ImmutableMap.o();
        }
        com.google.android.gms.internal.measurement.zzkp zzkpVar = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        com.google.android.gms.internal.measurement.zzkq zzkqVar = (com.google.android.gms.internal.measurement.zzkq) immutableMap2.get(zzkpVar);
        com.google.android.gms.internal.measurement.zzkp zzkpVar2 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        com.google.android.gms.internal.measurement.zzkq zzkqVar2 = (com.google.android.gms.internal.measurement.zzkq) immutableMap2.get(zzkpVar2);
        com.google.android.gms.internal.measurement.zzkp zzkpVar3 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        com.google.android.gms.internal.measurement.zzkq zzkqVar3 = (com.google.android.gms.internal.measurement.zzkq) immutableMap2.get(zzkpVar3);
        com.google.android.gms.internal.measurement.zzkp zzkpVar4 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        com.google.android.gms.internal.measurement.zzkq zzkqVar4 = (com.google.android.gms.internal.measurement.zzkq) immutableMap2.get(zzkpVar4);
        ImmutableMap.Builder builderD = ImmutableMap.d();
        builderD.c("Version", "2");
        builderD.c("VendorConsent", true != z2 ? "0" : "1");
        builderD.c("VendorLegitimateInterest", true != z3 ? "0" : "1");
        builderD.c("gdprApplies", i4 != 1 ? "0" : "1");
        builderD.c("EnableAdvertiserConsentMode", i3 != 1 ? "0" : "1");
        builderD.c("PolicyVersion", String.valueOf(i5));
        builderD.c("CmpSdkID", String.valueOf(i2));
        builderD.c("PurposeOneTreatment", i6 != 1 ? "0" : "1");
        builderD.c("PublisherCC", str);
        builderD.c("PublisherRestrictions1", String.valueOf(zzkqVar != null ? zzkqVar.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza()));
        builderD.c("PublisherRestrictions3", String.valueOf(zzkqVar2 != null ? zzkqVar2.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza()));
        builderD.c("PublisherRestrictions4", String.valueOf(zzkqVar3 != null ? zzkqVar3.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza()));
        builderD.c("PublisherRestrictions7", String.valueOf(zzkqVar4 != null ? zzkqVar4.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza()));
        builderD.d(ImmutableMap.q(zzf(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i2, i3, i4, i5, i6, str, str2, str3, z2, z3, true), zzf(zzkpVar2, immutableMap, immutableMap2, immutableSet, cArr, i2, i3, i4, i5, i6, str, str2, str3, z2, z3, true), zzf(zzkpVar3, immutableMap, immutableMap2, immutableSet, cArr, i2, i3, i4, i5, i6, str, str2, str3, z2, z3, true), zzf(zzkpVar4, immutableMap, immutableMap2, immutableSet, cArr, i2, i3, i4, i5, i6, str, str2, str3, z2, z3, true)).entrySet());
        return builderD.e(ImmutableMap.r(true != zzc(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i2, i3, i4, i5, i6, str, str2, str3, z2, z3, true) ? "0" : "1", true != zzc(zzkpVar2, immutableMap, immutableMap2, immutableSet, cArr, i2, i3, i4, i5, i6, str, str2, str3, z2, z3, true) ? "0" : "1", true != zzc(zzkpVar3, immutableMap, immutableMap2, immutableSet, cArr, i2, i3, i4, i5, i6, str, str2, str3, z2, z3, true) ? "0" : "1", true != zzc(zzkpVar4, immutableMap, immutableMap2, immutableSet, cArr, i2, i3, i4, i5, i6, str, str2, str3, z2, z3, true) ? "0" : "1", new String(cArr))).b();
    }

    private static final int zze(com.google.android.gms.internal.measurement.zzkp zzkpVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i2, int i3, int i4, int i5, int i6, String str, String str2, String str3, boolean z2, boolean z3, boolean z4) {
        if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private static final String zzf(com.google.android.gms.internal.measurement.zzkp zzkpVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i2, int i3, int i4, int i5, int i6, String str, String str2, String str3, boolean z2, boolean z3, boolean z4) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str2) || str2.length() < zzkpVar.zza()) ? "0" : String.valueOf(str2.charAt(zzkpVar.zza() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= zzkpVar.zza()) {
            strValueOf = String.valueOf(str3.charAt(zzkpVar.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    private static final boolean zzg(com.google.android.gms.internal.measurement.zzkp zzkpVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i2, int i3, int i4, int i5, int i6, String str, String str2, String str3, boolean z2, boolean z3, boolean z4) {
        char c2;
        int iZze = zze(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i2, i3, i4, i5, i6, str, str2, str3, z2, z3, true);
        if (!z2) {
            c2 = '4';
        } else {
            if (str2.length() >= zzkpVar.zza()) {
                char cCharAt = str2.charAt(zzkpVar.zza() - 1);
                boolean z5 = cCharAt == '1';
                if (iZze > 0 && cArr[iZze] != '2') {
                    cArr[iZze] = cCharAt != '1' ? '6' : '1';
                }
                return z5;
            }
            c2 = '0';
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c2;
        }
        return false;
    }

    private static final boolean zzh(com.google.android.gms.internal.measurement.zzkp zzkpVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i2, int i3, int i4, int i5, int i6, String str, String str2, String str3, boolean z2, boolean z3, boolean z4) {
        char c2;
        int iZze = zze(zzkpVar, immutableMap, immutableMap2, immutableSet, cArr, i2, i3, i4, i5, i6, str, str2, str3, z2, z3, true);
        if (!z3) {
            c2 = '5';
        } else {
            if (str3.length() >= zzkpVar.zza()) {
                char cCharAt = str3.charAt(zzkpVar.zza() - 1);
                boolean z5 = cCharAt == '1';
                if (iZze > 0 && cArr[iZze] != '2') {
                    cArr[iZze] = cCharAt != '1' ? '7' : '1';
                }
                return z5;
            }
            c2 = '0';
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c2;
        }
        return false;
    }

    private static final com.google.android.gms.internal.measurement.zzkq zzi(com.google.android.gms.internal.measurement.zzkp zzkpVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i2, int i3, int i4, int i5, int i6, String str, String str2, String str3, boolean z2, boolean z3, boolean z4) {
        Object obj = com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED;
        Object obj2 = immutableMap2.get(zzkpVar);
        if (obj2 != null) {
            obj = obj2;
        }
        return (com.google.android.gms.internal.measurement.zzkq) obj;
    }
}
