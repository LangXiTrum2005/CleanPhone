package androidx.core.app;

import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class NotificationChannelCompat {

    public static class Api26Impl {
        public static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBypassDnd();
        }

        public static boolean b(NotificationChannel notificationChannel) {
            return notificationChannel.canShowBadge();
        }

        public static NotificationChannel c(String str, CharSequence charSequence, int i2) {
            return new NotificationChannel(str, charSequence, i2);
        }

        public static void d(NotificationChannel notificationChannel, boolean z2) {
            notificationChannel.enableLights(z2);
        }

        public static void e(NotificationChannel notificationChannel, boolean z2) {
            notificationChannel.enableVibration(z2);
        }

        public static AudioAttributes f(NotificationChannel notificationChannel) {
            return notificationChannel.getAudioAttributes();
        }

        public static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getDescription();
        }

        public static String h(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        public static String i(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        public static int j(NotificationChannel notificationChannel) {
            return notificationChannel.getImportance();
        }

        public static int k(NotificationChannel notificationChannel) {
            return notificationChannel.getLightColor();
        }

        public static int l(NotificationChannel notificationChannel) {
            return notificationChannel.getLockscreenVisibility();
        }

        public static CharSequence m(NotificationChannel notificationChannel) {
            return notificationChannel.getName();
        }

        public static Uri n(NotificationChannel notificationChannel) {
            return notificationChannel.getSound();
        }

        public static long[] o(NotificationChannel notificationChannel) {
            return notificationChannel.getVibrationPattern();
        }

        public static void p(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        public static void q(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        public static void r(NotificationChannel notificationChannel, int i2) {
            notificationChannel.setLightColor(i2);
        }

        public static void s(NotificationChannel notificationChannel, boolean z2) {
            notificationChannel.setShowBadge(z2);
        }

        public static void t(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        public static void u(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }

        public static boolean v(NotificationChannel notificationChannel) {
            return notificationChannel.shouldShowLights();
        }

        public static boolean w(NotificationChannel notificationChannel) {
            return notificationChannel.shouldVibrate();
        }
    }

    public static class Api29Impl {
        public static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBubble();
        }
    }

    public static class Api30Impl {
        public static String a(NotificationChannel notificationChannel) {
            return notificationChannel.getConversationId();
        }

        public static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        public static boolean c(NotificationChannel notificationChannel) {
            return notificationChannel.isImportantConversation();
        }

        public static void d(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }
    }

    public static class Builder {
    }
}
