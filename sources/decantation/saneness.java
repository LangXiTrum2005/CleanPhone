package decantation;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzjo;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@23.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ImmutableSet f25049attabal = ImmutableSet.of("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final ImmutableList f25053saneness = ImmutableList.of("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final ImmutableList f25051dern = ImmutableList.of("auto", MBridgeConstans.DYNAMIC_VIEW_WX_APP, "am");

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final ImmutableList f25054wireman = ImmutableList.of("_r", "_dbg");

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final ImmutableList f25052marial = new ImmutableList.attabal().cutely(zzjo.zza).cutely(zzjo.zzb).impassible();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final ImmutableList f25050beachfront = ImmutableList.of("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static boolean attabal(String str) {
        return !f25051dern.contains(str);
    }

    public static boolean dern(String str) {
        return !f25049attabal.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean marial(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!attabal(str) || bundle == null) {
            return false;
        }
        ImmutableList immutableList = f25054wireman;
        int size = immutableList.size();
        int i = 0;
        while (i < size) {
            boolean zContainsKey = bundle.containsKey((String) immutableList.get(i));
            i++;
            if (zContainsKey) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals(AppMeasurement.FIAM_ORIGIN)) {
                    bundle.putString("_cis", "fiam_integration");
                    return true;
                }
            } else if (str.equals("fdl")) {
                bundle.putString("_cis", "fdl_integration");
                return true;
            }
        } else if (str.equals(AppMeasurement.FCM_ORIGIN)) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean saneness(String str, Bundle bundle) {
        if (f25053saneness.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        ImmutableList immutableList = f25054wireman;
        int size = immutableList.size();
        int i = 0;
        while (i < size) {
            boolean zContainsKey = bundle.containsKey((String) immutableList.get(i));
            i++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean wireman(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals(AppMeasurement.FIAM_ORIGIN);
        }
        if (f25052marial.contains(str2)) {
            return false;
        }
        ImmutableList immutableList = f25050beachfront;
        int size = immutableList.size();
        int i = 0;
        while (i < size) {
            boolean zMatches = str2.matches((String) immutableList.get(i));
            i++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }
}
