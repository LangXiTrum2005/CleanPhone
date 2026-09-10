package agent;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.L6;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: ReportUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static String f3928attabal = "file_key_appsflyer_additional";

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static String f3929saneness = "";

    public static String attabal(Context context) {
        if (!marial.attabal(f3929saneness)) {
            return f3929saneness;
        }
        try {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            if (Build.VERSION.SDK_INT >= 30) {
                installerPackageName = context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInstallingPackageName();
            }
            if (installerPackageName != null && !marial.attabal(installerPackageName)) {
                f3929saneness = installerPackageName;
                return installerPackageName;
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static void beachfront(Map<String, Object> map) {
        Map<String, Object> map2 = (Map) babyless.beachfront.beachfront(f3928attabal, new HashMap(), Map.class);
        map2.putAll(map);
        Iterator<Map.Entry<String, Object>> it = map2.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue() == null) {
                it.remove();
            }
        }
        AppsFlyerLib.getInstance().setAdditionalData(map2);
        babyless.beachfront.apical(f3928attabal, map2);
    }

    public static void dern(Context context, kaoline.wireman wiremanVar) {
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        if (wiremanVar != null) {
            firebaseAnalytics.dern("utm_source", saneness(wiremanVar.molybdenite()));
            firebaseAnalytics.dern("utm_campaign", saneness(wiremanVar.cutely()));
            firebaseAnalytics.dern("utm_campaign_name", saneness(wiremanVar.apical()));
            firebaseAnalytics.dern("utm_content", saneness(wiremanVar.formularize()));
            firebaseAnalytics.dern("utm_medium", saneness(wiremanVar.monoploid()));
            firebaseAnalytics.dern("utm_medium_name", saneness(wiremanVar.polloi()));
            firebaseAnalytics.dern("utm_creative_id", saneness(wiremanVar.triweekly()));
            firebaseAnalytics.dern("utm_creative_name", saneness(wiremanVar.kowloon()));
            HashMap map = new HashMap();
            map.put("utm_source", saneness(wiremanVar.molybdenite()));
            map.put("utm_campaign", saneness(wiremanVar.cutely()));
            map.put("utm_campaign_name", saneness(wiremanVar.apical()));
            map.put("utm_content", saneness(wiremanVar.formularize()));
            map.put("utm_medium", saneness(wiremanVar.monoploid()));
            map.put("utm_medium_name", saneness(wiremanVar.polloi()));
            map.put("utm_creative_id", saneness(wiremanVar.triweekly()));
            map.put("utm_creative_name", saneness(wiremanVar.kowloon()));
            map.put("install_source", saneness(attabal(context)));
            beachfront(map);
        }
    }

    public static void marial(Context context, String str, String str2, String str3) {
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        Bundle bundle = new Bundle();
        bundle.putString(MBInterstitialActivity.INTENT_CAMAPIGN, str3);
        bundle.putString("medium", str2);
        bundle.putString("source", str);
        firebaseAnalytics.attabal("campaign_details", bundle);
    }

    public static String saneness(String str) {
        if (str == null) {
            return "";
        }
        return (!TextUtils.isEmpty(str) && str.length() > 35) ? str.substring(0, 34) : str;
    }

    public static void wireman(Context context, boolean z) {
        if (z) {
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
            firebaseAnalytics.dern("did", com.yolo.networklibrary.common.util.dern.monoploid(context));
            firebaseAnalytics.dern("mcc", com.yolo.networklibrary.common.util.dern.taiyuan(context));
            firebaseAnalytics.dern("mnc", com.yolo.networklibrary.common.util.dern.cutely(context));
            firebaseAnalytics.dern(L6.q, com.yolo.networklibrary.common.util.dern.formularize(context));
            firebaseAnalytics.dern("cv", com.blankj.utilcode.util.wireman.saneness());
            firebaseAnalytics.dern("ud_first_open_time", String.valueOf(System.currentTimeMillis()));
        }
        HashMap map = new HashMap();
        map.put("did", com.yolo.networklibrary.common.util.dern.monoploid(context));
        map.put("ad_country", com.yolo.networklibrary.common.util.dern.taiyuan(context));
        map.put("mnc", com.yolo.networklibrary.common.util.dern.cutely(context));
        map.put(L6.q, com.yolo.networklibrary.common.util.dern.formularize(context));
        map.put("cv", com.blankj.utilcode.util.wireman.saneness());
        map.put("ud_first_open_time", String.valueOf(System.currentTimeMillis()));
        beachfront(map);
    }
}
