package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzja;
import com.google.android.gms.internal.measurement.zzjb;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzhe;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zzja f4435a;
    public static final zzja b;
    public static final zzja c;
    public static final zzja d;
    public static final zzja e;

    static {
        zzjb.zzi("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
        f4435a = zzja.zzj("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
        b = zzja.zzi("auto", MBridgeConstans.DYNAMIC_VIEW_WX_APP, "am");
        c = zzja.zzh("_r", "_dbg");
        zzix zzixVar = new zzix();
        zzixVar.zza(zzhe.zza);
        zzixVar.zza(zzhe.zzb);
        d = zzixVar.zzb();
        e = zzja.zzh("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    public static boolean a(String str, String str2, Bundle bundle) {
        byte b2;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!(!b.contains(str)) || bundle == null) {
            return false;
        }
        zzja zzjaVar = c;
        int size = zzjaVar.size();
        int i = 0;
        while (i < size) {
            boolean zContainsKey = bundle.containsKey((String) zzjaVar.get(i));
            i++;
            if (zContainsKey) {
                return false;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 101200) {
            if (iHashCode != 101230) {
                if (iHashCode == 3142703 && str.equals(AppMeasurement.FIAM_ORIGIN)) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("fdl")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals(AppMeasurement.FCM_ORIGIN)) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        if (b2 == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        if (b2 != 2) {
            return false;
        }
        bundle.putString("_cis", "fiam_integration");
        return true;
    }

    public static boolean b(Bundle bundle, String str) {
        if (f4435a.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        zzja zzjaVar = c;
        int size = zzjaVar.size();
        int i = 0;
        while (i < size) {
            boolean zContainsKey = bundle.containsKey((String) zzjaVar.get(i));
            i++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals(AppMeasurement.FIAM_ORIGIN);
        }
        if (d.contains(str2)) {
            return false;
        }
        zzja zzjaVar = e;
        int size = zzjaVar.size();
        int i = 0;
        while (i < size) {
            boolean zMatches = str2.matches((String) zzjaVar.get(i));
            i++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }
}
