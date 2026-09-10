package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.ironsource.X3;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: MessagingAnalytics.java */
/* JADX INFO: loaded from: classes3.dex */
public class restrictive {
    public static boolean adultoid(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static int apical(Bundle bundle) {
        int iArytenoidectomy = arytenoidectomy(bundle);
        if (iArytenoidectomy == 2) {
            return 5;
        }
        return iArytenoidectomy == 1 ? 10 : 0;
    }

    public static int arytenoidectomy(Bundle bundle) {
        String string = bundle.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = bundle.getString("google.priority");
        }
        return cutely(string);
    }

    public static boolean attabal() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            iiion.beachfront.impassible();
            Context contextApical = iiion.beachfront.impassible().apical();
            SharedPreferences sharedPreferences = contextApical.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            PackageManager packageManager = contextApical.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextApical.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
            }
            return false;
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
    }

    public static String beachfront(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) Tasks.await(com.google.firebase.installations.attabal.monoploid(iiion.beachfront.impassible()).getId());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public static String competently(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    public static void cord(MessagingClientEvent.Event event, Intent intent, staphylococcal.taiyuan taiyuanVar) {
        MessagingClientEvent messagingClientEventSaneness;
        if (taiyuanVar == null || (messagingClientEventSaneness = saneness(event, intent)) == null) {
            return;
        }
        try {
            taiyuanVar.attabal("FCM_CLIENT_EVENT_LOGGING", vowellike.attabal.class, staphylococcal.dern.saneness("proto"), new staphylococcal.competently() { // from class: com.google.firebase.messaging.supplicat
                @Override // staphylococcal.competently
                public final Object apply(Object obj) {
                    return ((vowellike.attabal) obj).dern();
                }
            }).attabal(staphylococcal.wireman.competently(vowellike.attabal.saneness().saneness(messagingClientEventSaneness).attabal(), staphylococcal.beachfront.saneness(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
        } catch (RuntimeException unused) {
        }
    }

    public static void cuirassed(String str, Bundle bundle) {
        try {
            iiion.beachfront.impassible();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String strWireman = wireman(bundle);
            if (strWireman != null) {
                bundle2.putString("_nmid", strWireman);
            }
            String strMarial = marial(bundle);
            if (strMarial != null) {
                bundle2.putString("_nmn", strMarial);
            }
            String strTaiyuan = taiyuan(bundle);
            if (!TextUtils.isEmpty(strTaiyuan)) {
                bundle2.putString("label", strTaiyuan);
            }
            String strCompetently = competently(bundle);
            if (!TextUtils.isEmpty(strCompetently)) {
                bundle2.putString("message_channel", strCompetently);
            }
            String strPolloi = polloi(bundle);
            if (strPolloi != null) {
                bundle2.putString("_nt", strPolloi);
            }
            String strFormularize = formularize(bundle);
            if (strFormularize != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(strFormularize));
                } catch (NumberFormatException unused) {
                }
            }
            String strGraveside = graveside(bundle);
            if (strGraveside != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(strGraveside));
                } catch (NumberFormatException unused2) {
                }
            }
            String strTriweekly = triweekly(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", strTriweekly);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            anthomaniac.attabal attabalVar = (anthomaniac.attabal) iiion.beachfront.impassible().cutely(anthomaniac.attabal.class);
            if (attabalVar != null) {
                attabalVar.attabal(AppMeasurement.FCM_ORIGIN, str, bundle2);
            }
        } catch (IllegalStateException unused3) {
        }
    }

    public static int cutely(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public static String dern(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    public static void dovishness(Intent intent) {
        cuirassed("_nd", intent.getExtras());
    }

    public static String formularize(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    public static void gintrap(Intent intent) {
        cuirassed("_nf", intent.getExtras());
    }

    public static String graveside(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    public static MessagingClientEvent.MessageType impassible(Bundle bundle) {
        return (bundle == null || !polder.graveside(bundle)) ? MessagingClientEvent.MessageType.DATA_MESSAGE : MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION;
    }

    public static String impromptu(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    public static String kowloon() {
        return iiion.beachfront.impassible().apical().getPackageName();
    }

    public static String marial(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    public static int molybdenite(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static long monoploid(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException unused) {
            }
        }
        iiion.beachfront beachfrontVarImpassible = iiion.beachfront.impassible();
        String strWireman = beachfrontVarImpassible.kowloon().wireman();
        if (strWireman != null) {
            try {
                return Long.parseLong(strWireman);
            } catch (NumberFormatException unused2) {
            }
        }
        String strDern = beachfrontVarImpassible.kowloon().dern();
        try {
            if (!strDern.startsWith("1:")) {
                return Long.parseLong(strDern);
            }
            String[] strArrSplit = strDern.split(":");
            if (strArrSplit.length < 2) {
                return 0L;
            }
            String str = strArrSplit[1];
            if (str.isEmpty()) {
                return 0L;
            }
            return Long.parseLong(str);
        } catch (NumberFormatException unused3) {
            return 0L;
        }
    }

    public static boolean oilcan(Intent intent) {
        if (intent == null || adultoid(intent)) {
            return false;
        }
        return yemenite(intent.getExtras());
    }

    public static String polloi(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    public static void preprohormone(Intent intent) {
        if (oilcan(intent)) {
            cuirassed("_nr", intent.getExtras());
        }
        if (trm(intent)) {
            cord(MessagingClientEvent.Event.MESSAGE_DELIVERED, intent, FirebaseMessaging.adultoid());
        }
    }

    public static void rotuma(Bundle bundle) {
        stratoscope(bundle);
        cuirassed("_no", bundle);
    }

    public static MessagingClientEvent saneness(MessagingClientEvent.Event event, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        MessagingClientEvent.attabal attabalVarCutely = MessagingClientEvent.arytenoidectomy().triweekly(molybdenite(extras)).marial(event).beachfront(beachfront(extras)).taiyuan(kowloon()).formularize(MessagingClientEvent.SDKPlatform.ANDROID).impromptu(impassible(extras)).cutely(apical(extras));
        String strImpromptu = impromptu(extras);
        if (strImpromptu != null) {
            attabalVarCutely.competently(strImpromptu);
        }
        String strPolloi = polloi(extras);
        if (strPolloi != null) {
            attabalVarCutely.impassible(strPolloi);
        }
        String strDern = dern(extras);
        if (strDern != null) {
            attabalVarCutely.dern(strDern);
        }
        String strTaiyuan = taiyuan(extras);
        if (strTaiyuan != null) {
            attabalVarCutely.saneness(strTaiyuan);
        }
        String strMarial = marial(extras);
        if (strMarial != null) {
            attabalVarCutely.wireman(strMarial);
        }
        long jMonoploid = monoploid(extras);
        if (jMonoploid > 0) {
            attabalVarCutely.apical(jMonoploid);
        }
        return attabalVarCutely.attabal();
    }

    public static void stratoscope(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString("google.c.a.tc"))) {
            Log.isLoggable("FirebaseMessaging", 3);
            return;
        }
        anthomaniac.attabal attabalVar = (anthomaniac.attabal) iiion.beachfront.impassible().cutely(anthomaniac.attabal.class);
        Log.isLoggable("FirebaseMessaging", 3);
        if (attabalVar != null) {
            String string = bundle.getString("google.c.a.c_id");
            attabalVar.saneness(AppMeasurement.FCM_ORIGIN, "_ln", string);
            Bundle bundle2 = new Bundle();
            bundle2.putString("source", "Firebase");
            bundle2.putString("medium", "notification");
            bundle2.putString(MBInterstitialActivity.INTENT_CAMAPIGN, string);
            attabalVar.attabal(AppMeasurement.FCM_ORIGIN, "_cmp", bundle2);
        }
    }

    public static String taiyuan(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    public static String triweekly(Bundle bundle) {
        return (bundle == null || !polder.graveside(bundle)) ? "data" : X3.i.d;
    }

    public static boolean trm(Intent intent) {
        if (intent == null || adultoid(intent)) {
            return false;
        }
        return attabal();
    }

    public static String wireman(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    public static boolean yemenite(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }
}
