package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.media.a;
import android.text.TextUtils;
import com.google.android.gms.common.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzae;
import com.thinkup.core.common.n.mo;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class GoogleServices {
    private static final Object zza = new Object();
    private static GoogleServices zzb;
    private final String zzc;
    private final Status zzd;
    private final boolean zze;
    private final boolean zzf;

    public GoogleServices(String str, boolean z2) {
        this.zzc = str;
        this.zzd = Status.RESULT_SUCCESS;
        this.zze = z2;
        this.zzf = !z2;
    }

    private static GoogleServices checkInitialized(String str) {
        GoogleServices googleServices;
        synchronized (zza) {
            try {
                googleServices = zzb;
                if (googleServices == null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                    sb.append("Initialize must be called before ");
                    sb.append(str);
                    sb.append(mo.ono);
                    throw new IllegalStateException(sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return googleServices;
    }

    public static void clearInstanceForTest() {
        synchronized (zza) {
            zzb = null;
        }
    }

    public static String getGoogleAppId() {
        return checkInitialized("getGoogleAppId").zzc;
    }

    public static Status initialize(Context context) {
        Status status;
        Preconditions.checkNotNull(context, "Context must not be null.");
        synchronized (zza) {
            try {
                if (zzb == null) {
                    zzb = new GoogleServices(context);
                }
                status = zzb.zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return status;
    }

    public static boolean isMeasurementEnabled() {
        GoogleServices googleServicesCheckInitialized = checkInitialized("isMeasurementEnabled");
        return googleServicesCheckInitialized.zzd.isSuccess() && googleServicesCheckInitialized.zze;
    }

    public static boolean isMeasurementExplicitlyDisabled() {
        return checkInitialized("isMeasurementExplicitlyDisabled").zzf;
    }

    public Status checkGoogleAppId(String str) {
        String str2 = this.zzc;
        return (str2 == null || str2.equals(str)) ? Status.RESULT_SUCCESS : new Status(10, a.s(new StringBuilder(str2.length() + 97), "Initialize was called with two different Google App IDs.  Only the first app ID will be used: '", str2, "'."));
    }

    public GoogleServices(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
        boolean z2 = true;
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            boolean z3 = integer == 0;
            z2 = integer != 0;
            this.zzf = z3;
        } else {
            this.zzf = false;
        }
        this.zze = z2;
        String strZza = zzae.zza(context);
        strZza = strZza == null ? new StringResourceValueReader(context).getString("google_app_id") : strZza;
        if (TextUtils.isEmpty(strZza)) {
            this.zzd = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.zzc = null;
        } else {
            this.zzc = strZza;
            this.zzd = Status.RESULT_SUCCESS;
        }
    }

    public static Status initialize(Context context, String str, boolean z2) {
        Preconditions.checkNotNull(context, "Context must not be null.");
        Preconditions.checkNotEmpty(str, "App ID must be nonempty.");
        synchronized (zza) {
            try {
                GoogleServices googleServices = zzb;
                if (googleServices != null) {
                    return googleServices.checkGoogleAppId(str);
                }
                GoogleServices googleServices2 = new GoogleServices(str, z2);
                zzb = googleServices2;
                return googleServices2.zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
