package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.R;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4524rp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f4948a;
    public final Context b;
    public final NN c;

    public C4524rp(Context context, NN nn, ExecutorService executorService) {
        this.f4948a = executorService;
        this.b = context;
        this.c = nn;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0330  */
    /* JADX WARN: Code duplicated, block: B:262:0x0326 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v150 */
    /* JADX WARN: Type inference failed for: r0v151 */
    /* JADX WARN: Type inference failed for: r0v94 */
    public final boolean a() {
        C3767jC c3767jC;
        Bundle bundle;
        int identifier;
        Uri defaultUri;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        Integer numValueOf;
        Long lValueOf;
        long[] jArr;
        int[] iArr;
        int i;
        if (this.c.m("gcm.n.noui")) {
            return true;
        }
        Context context = this.b;
        if (!((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!PlatformVersion.isAtLeastLollipop()) {
                SystemClock.sleep(10L);
            }
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strQ = this.c.q("gcm.n.image");
        if (TextUtils.isEmpty(strQ)) {
            c3767jC = null;
        } else {
            try {
                c3767jC = new C3767jC(new URL(strQ));
            } catch (MalformedURLException unused) {
                c3767jC = null;
            }
        }
        if (c3767jC != null) {
            ExecutorService executorService = this.f4948a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            c3767jC.b = executorService.submit(new RunnableC3976le0(29, c3767jC, taskCompletionSource));
            c3767jC.c = taskCompletionSource.getTask();
        }
        Context context2 = this.b;
        NN nn = this.c;
        AtomicInteger atomicInteger = AbstractC3803jg.f4564a;
        try {
            ApplicationInfo applicationInfo = context2.getPackageManager().getApplicationInfo(context2.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
        }
        Bundle bundle2 = bundle;
        String strQ2 = nn.q("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT < 26) {
            strQ2 = null;
        } else {
            try {
                if (context2.getPackageManager().getApplicationInfo(context2.getPackageName(), 0).targetSdkVersion < 26) {
                    strQ2 = null;
                } else {
                    NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                    if (TextUtils.isEmpty(strQ2) || notificationManager.getNotificationChannel(strQ2) == null) {
                        strQ2 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (TextUtils.isEmpty(strQ2) || notificationManager.getNotificationChannel(strQ2) == null) {
                            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                                int identifier2 = context2.getResources().getIdentifier("fcm_fallback_notification_channel_label", TypedValues.Custom.S_STRING, context2.getPackageName());
                                notificationManager.createNotificationChannel(AbstractC3497g7.i(identifier2 == 0 ? "Misc" : context2.getString(identifier2)));
                            }
                            strQ2 = "fcm_fallback_notification_channel";
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context2, strQ2);
        CharSequence charSequenceP = nn.p(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(charSequenceP)) {
            builder.setContentTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = nn.p(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(charSequenceP2)) {
            builder.setContentText(charSequenceP2);
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(charSequenceP2));
        }
        String strQ3 = nn.q("gcm.n.icon");
        if (TextUtils.isEmpty(strQ3) || (((identifier = resources.getIdentifier(strQ3, "drawable", packageName)) == 0 || !AbstractC3803jg.a(resources, identifier)) && ((identifier = resources.getIdentifier(strQ3, "mipmap", packageName)) == 0 || !AbstractC3803jg.a(resources, identifier)))) {
            identifier = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (identifier == 0 || !AbstractC3803jg.a(resources, identifier)) {
                try {
                    identifier = packageManager.getApplicationInfo(packageName, 0).icon;
                } catch (PackageManager.NameNotFoundException e2) {
                    e2.toString();
                }
            }
            if (identifier == 0 || !AbstractC3803jg.a(resources, identifier)) {
                identifier = R.drawable.sym_def_app_icon;
            }
        }
        builder.setSmallIcon(identifier);
        String strQ4 = nn.q("gcm.n.sound2");
        if (TextUtils.isEmpty(strQ4)) {
            strQ4 = nn.q("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strQ4)) {
            defaultUri = null;
        } else if (MRAIDCommunicatorUtil.STATES_DEFAULT.equals(strQ4) || resources.getIdentifier(strQ4, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strQ4);
        }
        if (defaultUri != null) {
            builder.setSound(defaultUri);
        }
        String strQ5 = nn.q("gcm.n.click_action");
        if (TextUtils.isEmpty(strQ5)) {
            String strQ6 = nn.q("gcm.n.link_android");
            if (TextUtils.isEmpty(strQ6)) {
                strQ6 = nn.q("gcm.n.link");
            }
            Uri uri = !TextUtils.isEmpty(strQ6) ? Uri.parse(strQ6) : null;
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
            }
        } else {
            launchIntentForPackage = new Intent(strQ5);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        }
        AtomicInteger atomicInteger2 = AbstractC3803jg.f4564a;
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            Bundle bundle3 = new Bundle((Bundle) nn.b);
            for (String str : ((Bundle) nn.b).keySet()) {
                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                    bundle3.remove(str);
                }
            }
            launchIntentForPackage.putExtras(bundle3);
            if (nn.m("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", nn.u());
            }
            activity = PendingIntent.getActivity(context2, atomicInteger2.incrementAndGet(), launchIntentForPackage, Build.VERSION.SDK_INT >= 23 ? 1140850688 : 1073741824);
        }
        builder.setContentIntent(activity);
        if (nn.m("google.c.a.e")) {
            broadcast = PendingIntent.getBroadcast(context2, atomicInteger2.incrementAndGet(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra(CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT, new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(nn.u())), Build.VERSION.SDK_INT >= 23 ? 1140850688 : 1073741824);
        } else {
            broadcast = null;
        }
        if (broadcast != null) {
            builder.setDeleteIntent(broadcast);
        }
        String strQ7 = nn.q("gcm.n.color");
        if (TextUtils.isEmpty(strQ7)) {
            i = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i != 0) {
                numValueOf = Integer.valueOf(ContextCompat.getColor(context2, i));
            } else {
                numValueOf = null;
            }
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strQ7));
            } catch (IllegalArgumentException unused3) {
                i = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i != 0) {
                    try {
                        numValueOf = Integer.valueOf(ContextCompat.getColor(context2, i));
                    } catch (Resources.NotFoundException unused4) {
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            }
        }
        if (numValueOf != null) {
            builder.setColor(numValueOf.intValue());
        }
        builder.setAutoCancel(!nn.m("gcm.n.sticky"));
        builder.setLocalOnly(nn.m("gcm.n.local_only"));
        CharSequence charSequenceQ = nn.q("gcm.n.ticker");
        if (charSequenceQ != null) {
            builder.setTicker(charSequenceQ);
        }
        Integer numN = nn.n("gcm.n.notification_priority");
        if (numN == null || numN.intValue() < -2 || numN.intValue() > 2) {
            numN = null;
        }
        if (numN != null) {
            builder.setPriority(numN.intValue());
        }
        Integer numN2 = nn.n("gcm.n.visibility");
        if (numN2 == null || numN2.intValue() < -1 || numN2.intValue() > 1) {
            numN2 = null;
        }
        if (numN2 != null) {
            builder.setVisibility(numN2.intValue());
        }
        Integer numN3 = nn.n("gcm.n.notification_count");
        if (numN3 == null || numN3.intValue() < 0) {
            numN3 = null;
        }
        if (numN3 != null) {
            builder.setNumber(numN3.intValue());
        }
        String strQ8 = nn.q("gcm.n.event_time");
        if (TextUtils.isEmpty(strQ8)) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(strQ8));
            } catch (NumberFormatException unused5) {
                NN.A("gcm.n.event_time");
                lValueOf = null;
            }
        }
        if (lValueOf != null) {
            builder.setShowWhen(true);
            builder.setWhen(lValueOf.longValue());
        }
        JSONArray jSONArrayO = nn.o("gcm.n.vibrate_timings");
        if (jSONArrayO == null) {
            jArr = null;
        } else {
            try {
                if (jSONArrayO.length() <= 1) {
                    throw new JSONException("vibrateTimings have invalid length");
                }
                int length = jSONArrayO.length();
                jArr = new long[length];
                for (int i2 = 0; i2 < length; i2++) {
                    jArr[i2] = jSONArrayO.optLong(i2);
                }
            } catch (NumberFormatException | JSONException unused6) {
                jSONArrayO.toString();
                jArr = null;
            }
        }
        if (jArr != null) {
            builder.setVibrate(jArr);
        }
        JSONArray jSONArrayO2 = nn.o("gcm.n.light_settings");
        if (jSONArrayO2 == null) {
            iArr = null;
        } else {
            iArr = new int[3];
            try {
                if (jSONArrayO2.length() != 3) {
                    throw new JSONException("lightSettings don't have all three fields");
                }
                int color = Color.parseColor(jSONArrayO2.optString(0));
                if (color == -16777216) {
                    throw new IllegalArgumentException("Transparent color is invalid");
                }
                iArr[0] = color;
                iArr[1] = jSONArrayO2.optInt(1);
                iArr[2] = jSONArrayO2.optInt(2);
            } catch (IllegalArgumentException e3) {
                jSONArrayO2.toString();
                e3.getMessage();
                iArr = null;
            } catch (JSONException unused7) {
                jSONArrayO2.toString();
                iArr = null;
            }
        }
        if (iArr != null) {
            builder.setLights(iArr[0], iArr[1], iArr[2]);
        }
        boolean zM = nn.m("gcm.n.default_sound");
        ?? r0 = zM;
        if (nn.m("gcm.n.default_vibrate_timings")) {
            r0 = (zM ? 1 : 0) | 2;
        }
        int i3 = r0;
        if (nn.m("gcm.n.default_light_settings")) {
            i3 = (r0 == true ? 1 : 0) | 4;
        }
        builder.setDefaults(i3);
        String strQ9 = nn.q("gcm.n.tag");
        if (TextUtils.isEmpty(strQ9)) {
            strQ9 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        String str2 = strQ9;
        if (c3767jC != null) {
            try {
                Bitmap bitmap = (Bitmap) Tasks.await((Task) Preconditions.checkNotNull(c3767jC.c), 5L, TimeUnit.SECONDS);
                builder.setLargeIcon(bitmap);
                builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon((Bitmap) null));
            } catch (InterruptedException unused8) {
                c3767jC.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e4) {
                Objects.toString(e4.getCause());
            } catch (TimeoutException unused9) {
                c3767jC.close();
            }
        }
        ((NotificationManager) this.b.getSystemService("notification")).notify(str2, 0, builder.build());
        return true;
    }
}
