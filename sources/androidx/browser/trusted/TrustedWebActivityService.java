package androidx.browser.trusted;

import A.AbstractC0891g;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.service.notification.StatusBarNotification;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import android.util.Log;
import androidx.core.app.NotificationManagerCompat;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class TrustedWebActivityService extends Service {
    public NotificationManager X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f3722Y = -1;
    public final ITrustedWebActivityService.Stub Z = new ITrustedWebActivityService.Stub() { // from class: androidx.browser.trusted.TrustedWebActivityService.1
        {
            attachInterface(this, ITrustedWebActivityService.I8);
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final void A(IBinder iBinder) {
            b0();
            if (iBinder == null) {
                return;
            }
            ITrustedWebActivityCallback.Stub.b0(iBinder);
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final Bundle C() {
            b0();
            NotificationManager notificationManager = TrustedWebActivityService.this.X;
            if (notificationManager == null) {
                throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
            }
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", activeNotifications);
            return bundle;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final int M() {
            b0();
            return TrustedWebActivityService.this.c();
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final Bundle N(Bundle bundle) {
            NotificationChannel notificationChannel;
            b0();
            TrustedWebActivityServiceConnection.a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            String string = bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME");
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            if (trustedWebActivityService.X == null) {
                throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
            }
            boolean z2 = false;
            if (NotificationManagerCompat.from(trustedWebActivityService).areNotificationsEnabled() && (Build.VERSION.SDK_INT < 26 || (notificationChannel = trustedWebActivityService.X.getNotificationChannel(TrustedWebActivityService.a(string))) == null || notificationChannel.getImportance() != 0)) {
                z2 = true;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", z2);
            return bundle2;
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final void R(Bundle bundle) {
            b0();
            TrustedWebActivityServiceConnection.a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            TrustedWebActivityServiceConnection.a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            String string = bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG");
            int i2 = bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID");
            NotificationManager notificationManager = TrustedWebActivityService.this.X;
            if (notificationManager == null) {
                throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
            }
            notificationManager.cancel(string, i2);
        }

        public final void b0() {
            boolean zA;
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            if (trustedWebActivityService.f3722Y == -1) {
                String[] packagesForUid = trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                if (packagesForUid == null) {
                    packagesForUid = new String[0];
                }
                Token tokenLoad = trustedWebActivityService.b().load();
                PackageManager packageManager = trustedWebActivityService.getPackageManager();
                if (tokenLoad != null) {
                    for (String str : packagesForUid) {
                        try {
                            zA = (Build.VERSION.SDK_INT >= 28 ? new PackageIdentityUtils.Api28Implementation() : new PackageIdentityUtils.Pre28Implementation()).a(packageManager, str);
                        } catch (PackageManager.NameNotFoundException | IOException e2) {
                            Log.e("PackageIdentity", "Could not check if package matches token.", e2);
                            zA = false;
                        }
                        if (zA) {
                            trustedWebActivityService.f3722Y = Binder.getCallingUid();
                            break;
                        }
                    }
                }
            }
            if (trustedWebActivityService.f3722Y != Binder.getCallingUid()) {
                throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final Bundle p() {
            b0();
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            int iC = trustedWebActivityService.c();
            Bundle bundle = new Bundle();
            if (iC == -1) {
                return bundle;
            }
            bundle.putParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP", BitmapFactory.decodeResource(trustedWebActivityService.getResources(), iC));
            return bundle;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0075 A[PHI: r2
  0x0075: PHI (r2v3 android.app.Notification) = (r2v2 android.app.Notification), (r2v4 android.app.Notification), (r2v4 android.app.Notification) binds: [B:8:0x003f, B:15:0x006d, B:17:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public final Bundle t(Bundle bundle) {
            Notification notificationBuild;
            b0();
            TrustedWebActivityServiceConnection.a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            TrustedWebActivityServiceConnection.a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            TrustedWebActivityServiceConnection.a(bundle, "android.support.customtabs.trusted.NOTIFICATION");
            TrustedWebActivityServiceConnection.a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            String string = bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG");
            int i2 = bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID");
            Notification notification = (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION");
            String string2 = bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME");
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            if (trustedWebActivityService.X == null) {
                throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
            }
            boolean z2 = false;
            if (NotificationManagerCompat.from(trustedWebActivityService).areNotificationsEnabled()) {
                if (Build.VERSION.SDK_INT >= 26) {
                    String strA = TrustedWebActivityService.a(string2);
                    NotificationManager notificationManager = trustedWebActivityService.X;
                    notificationManager.createNotificationChannel(AbstractC0891g.g(strA, string2));
                    if (notificationManager.getNotificationChannel(strA).getImportance() == 0) {
                        notificationBuild = null;
                    } else {
                        Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(trustedWebActivityService, notification);
                        builderRecoverBuilder.setChannelId(strA);
                        notificationBuild = builderRecoverBuilder.build();
                    }
                    notification = notificationBuild;
                    NotificationChannel notificationChannel = trustedWebActivityService.X.getNotificationChannel(strA);
                    if (notificationChannel == null || notificationChannel.getImportance() != 0) {
                        trustedWebActivityService.X.notify(string, i2, notification);
                        z2 = true;
                    }
                } else {
                    trustedWebActivityService.X.notify(string, i2, notification);
                    z2 = true;
                }
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", z2);
            return bundle2;
        }
    };

    public static String a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    public abstract TokenStore b();

    public final int c() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.Z;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.X = (NotificationManager) getSystemService("notification");
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.f3722Y = -1;
        return super.onUnbind(intent);
    }
}
