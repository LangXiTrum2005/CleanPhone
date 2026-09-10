package androidx.browser.trusted;

import android.app.Notification;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: compiled from: TrustedWebActivityServiceConnection.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal {

    /* JADX INFO: renamed from: androidx.browser.trusted.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TrustedWebActivityServiceConnection.java */
    public static class C0033attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Parcelable[] f5616attabal;

        public C0033attabal(Parcelable[] parcelableArr) {
            this.f5616attabal = parcelableArr;
        }

        public Bundle attabal() {
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", this.f5616attabal);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: TrustedWebActivityServiceConnection.java */
    public static class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f5617attabal;

        public dern(String str) {
            this.f5617attabal = str;
        }

        public static dern attabal(Bundle bundle) {
            attabal.attabal(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new dern(bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    /* JADX INFO: compiled from: TrustedWebActivityServiceConnection.java */
    public static class marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final boolean f5618attabal;

        public marial(boolean z) {
            this.f5618attabal = z;
        }

        public Bundle attabal() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", this.f5618attabal);
            return bundle;
        }
    }

    /* JADX INFO: compiled from: TrustedWebActivityServiceConnection.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f5619attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f5620saneness;

        public saneness(String str, int i) {
            this.f5619attabal = str;
            this.f5620saneness = i;
        }

        public static saneness attabal(Bundle bundle) {
            attabal.attabal(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            attabal.attabal(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            return new saneness(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"));
        }
    }

    /* JADX INFO: compiled from: TrustedWebActivityServiceConnection.java */
    public static class wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f5621attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final Notification f5622dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f5623saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final String f5624wireman;

        public wireman(String str, int i, Notification notification, String str2) {
            this.f5621attabal = str;
            this.f5623saneness = i;
            this.f5622dern = notification;
            this.f5624wireman = str2;
        }

        public static wireman attabal(Bundle bundle) {
            attabal.attabal(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            attabal.attabal(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            attabal.attabal(bundle, "android.support.customtabs.trusted.NOTIFICATION");
            attabal.attabal(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new wireman(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"), (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION"), bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    public static void attabal(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return;
        }
        throw new IllegalArgumentException("Bundle must contain " + str);
    }
}
