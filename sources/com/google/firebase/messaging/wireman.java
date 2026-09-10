package com.google.firebase.messaging;

import android.R;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.unity3d.ads.BuildConfig;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: CommonNotificationBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final AtomicInteger f22775attabal = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX INFO: compiled from: CommonNotificationBuilder.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final NotificationCompat.impassible f22776attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f22777dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final String f22778saneness;

        public attabal(NotificationCompat.impassible impassibleVar, String str, int i) {
            this.f22776attabal = impassibleVar;
            this.f22778saneness = str;
            this.f22777dern = i;
        }
    }

    public static String apical(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str) && notificationManager.getNotificationChannel(str) != null) {
                return str;
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (!TextUtils.isEmpty(string) && notificationManager.getNotificationChannel(string) != null) {
                return string;
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                notificationManager.createNotificationChannel(monoploid.beachfront.attabal("fcm_fallback_notification_channel", identifier == 0 ? "Misc" : context.getString(identifier), 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean arytenoidectomy(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            return !dern.attabal(resources.getDrawable(i, null));
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    public static PendingIntent attabal(Context context, polder polderVar, String str, PackageManager packageManager) {
        Intent intentBeachfront = beachfront(str, polderVar, packageManager);
        if (intentBeachfront == null) {
            return null;
        }
        intentBeachfront.addFlags(67108864);
        intentBeachfront.putExtras(polderVar.preprohormone());
        if (monoploid(polderVar)) {
            intentBeachfront.putExtra("gcm.n.analytics_data", polderVar.rotuma());
        }
        return PendingIntent.getActivity(context, competently(), intentBeachfront, formularize(1073741824));
    }

    public static Intent beachfront(String str, polder polderVar, PackageManager packageManager) {
        String strArytenoidectomy = polderVar.arytenoidectomy("gcm.n.click_action");
        if (!TextUtils.isEmpty(strArytenoidectomy)) {
            Intent intent = new Intent(strArytenoidectomy);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri uriBeachfront = polderVar.beachfront();
        if (uriBeachfront == null) {
            return packageManager.getLaunchIntentForPackage(str);
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setPackage(str);
        intent2.setData(uriBeachfront);
        return intent2;
    }

    public static int competently() {
        return f22775attabal.incrementAndGet();
    }

    public static Bundle cutely(PackageManager packageManager, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
        }
        return Bundle.EMPTY;
    }

    public static PendingIntent dern(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, competently(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra(CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT, intent), formularize(1073741824));
    }

    public static int formularize(int i) {
        return i | 67108864;
    }

    public static int impassible(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && arytenoidectomy(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && arytenoidectomy(resources, identifier2)) {
                return identifier2;
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !arytenoidectomy(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                e.toString();
            }
        }
        return (i == 0 || !arytenoidectomy(resources, i)) ? R.drawable.sym_def_app_icon : i;
    }

    public static Integer impromptu(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i == 0) {
            return null;
        }
        try {
            return Integer.valueOf(picketboat.saneness.getColor(context, i));
        } catch (Resources.NotFoundException unused2) {
            return null;
        }
    }

    public static String kowloon(polder polderVar) {
        String strArytenoidectomy = polderVar.arytenoidectomy("gcm.n.tag");
        if (!TextUtils.isEmpty(strArytenoidectomy)) {
            return strArytenoidectomy;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    public static attabal marial(Context context, polder polderVar) {
        Bundle bundleCutely = cutely(context.getPackageManager(), context.getPackageName());
        return wireman(context, context, polderVar, apical(context, polderVar.apical(), bundleCutely), bundleCutely);
    }

    public static boolean monoploid(polder polderVar) {
        return polderVar.attabal("google.c.a.e");
    }

    public static PendingIntent saneness(Context context, Context context2, polder polderVar) {
        if (monoploid(polderVar)) {
            return dern(context, context2, new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(polderVar.rotuma()));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int taiyuan(polder polderVar) {
        boolean zAttabal = polderVar.attabal("gcm.n.default_sound");
        ?? r0 = zAttabal;
        if (polderVar.attabal("gcm.n.default_vibrate_timings")) {
            r0 = (zAttabal ? 1 : 0) | 2;
        }
        return polderVar.attabal("gcm.n.default_light_settings") ? r0 | 4 : r0;
    }

    public static Uri triweekly(String str, polder polderVar, Resources resources) {
        String strKowloon = polderVar.kowloon();
        if (TextUtils.isEmpty(strKowloon)) {
            return null;
        }
        if (BuildConfig.FLAVOR.equals(strKowloon) || resources.getIdentifier(strKowloon, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + strKowloon);
    }

    public static attabal wireman(Context context, Context context2, polder polderVar, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        NotificationCompat.impassible impassibleVar = new NotificationCompat.impassible(context2, str);
        String strTriweekly = polderVar.triweekly(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strTriweekly)) {
            impassibleVar.apical(strTriweekly);
        }
        String strTriweekly2 = polderVar.triweekly(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strTriweekly2)) {
            impassibleVar.cutely(strTriweekly2);
            impassibleVar.stratoscope(new NotificationCompat.apical().impromptu(strTriweekly2));
        }
        impassibleVar.cord(impassible(packageManager, resources, packageName, polderVar.arytenoidectomy("gcm.n.icon"), bundle));
        Uri uriTriweekly = triweekly(packageName, polderVar, resources);
        if (uriTriweekly != null) {
            impassibleVar.cuirassed(uriTriweekly);
        }
        impassibleVar.taiyuan(attabal(context, polderVar, packageName, packageManager));
        PendingIntent pendingIntentSaneness = saneness(context, context2, polderVar);
        if (pendingIntentSaneness != null) {
            impassibleVar.kowloon(pendingIntentSaneness);
        }
        Integer numImpromptu = impromptu(context2, polderVar.arytenoidectomy("gcm.n.color"), bundle);
        if (numImpromptu != null) {
            impassibleVar.impromptu(numImpromptu.intValue());
        }
        impassibleVar.marial(!polderVar.attabal("gcm.n.sticky"));
        impassibleVar.molybdenite(polderVar.attabal("gcm.n.local_only"));
        String strArytenoidectomy = polderVar.arytenoidectomy("gcm.n.ticker");
        if (strArytenoidectomy != null) {
            impassibleVar.trm(strArytenoidectomy);
        }
        Integer numImpassible = polderVar.impassible();
        if (numImpassible != null) {
            impassibleVar.gintrap(numImpassible.intValue());
        }
        Integer numPolloi = polderVar.polloi();
        if (numPolloi != null) {
            impassibleVar.yemenite(numPolloi.intValue());
        }
        Integer numFormularize = polderVar.formularize();
        if (numFormularize != null) {
            impassibleVar.graveside(numFormularize.intValue());
        }
        Long lCutely = polderVar.cutely("gcm.n.event_time");
        if (lCutely != null) {
            impassibleVar.rotuma(true);
            impassibleVar.sealless(lCutely.longValue());
        }
        long[] jArrMonoploid = polderVar.monoploid();
        if (jArrMonoploid != null) {
            impassibleVar.oilcan(jArrMonoploid);
        }
        int[] iArrMarial = polderVar.marial();
        if (iArrMarial != null) {
            impassibleVar.polloi(iArrMarial[0], iArrMarial[1], iArrMarial[2]);
        }
        impassibleVar.triweekly(taiyuan(polderVar));
        return new attabal(impassibleVar, kowloon(polderVar), 0);
    }
}
