package androidx.media.session;

import A.AbstractC0912t;
import android.app.ForegroundServiceStartNotAllowedException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.a;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.Log;
import android.view.KeyEvent;
import androidx.core.content.ContextCompat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5362a = 0;

    public static final class Api31 {
        public static ForegroundServiceStartNotAllowedException a(IllegalStateException illegalStateException) {
            return AbstractC0912t.c(illegalStateException);
        }

        public static boolean b(IllegalStateException illegalStateException) {
            return AbstractC0912t.y(illegalStateException);
        }
    }

    public static class MediaButtonConnectionCallback extends MediaBrowserCompat.ConnectionCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f5363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Intent f5364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BroadcastReceiver.PendingResult f5365c;
        public MediaBrowserCompat d;

        public MediaButtonConnectionCallback(BroadcastReceiver.PendingResult pendingResult, Context context, Intent intent) {
            this.f5363a = context;
            this.f5364b = intent;
            this.f5365c = pendingResult;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public final void onConnected() {
            new MediaControllerCompat(this.f5363a, this.d.getSessionToken()).dispatchMediaButtonEvent((KeyEvent) this.f5364b.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            this.d.disconnect();
            this.f5365c.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public final void onConnectionFailed() {
            this.d.disconnect();
            this.f5365c.finish();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
        public final void onConnectionSuspended() {
            this.d.disconnect();
            this.f5365c.finish();
        }
    }

    public static ComponentName a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        if (listQueryIntentServices.isEmpty()) {
            return null;
        }
        StringBuilder sbY = a.y("Expected 1 service that handles ", str, ", found ");
        sbY.append(listQueryIntentServices.size());
        throw new IllegalStateException(sbY.toString());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName componentNameA = a(context, "android.intent.action.MEDIA_BUTTON");
        if (componentNameA == null) {
            ComponentName componentNameA2 = a(context, "android.media.browse.MediaBrowserService");
            if (componentNameA2 == null) {
                throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
            }
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            MediaButtonConnectionCallback mediaButtonConnectionCallback = new MediaButtonConnectionCallback(pendingResultGoAsync, applicationContext, intent);
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, componentNameA2, mediaButtonConnectionCallback, null);
            mediaButtonConnectionCallback.d = mediaBrowserCompat;
            mediaBrowserCompat.connect();
            return;
        }
        intent.setComponent(componentNameA);
        try {
            ContextCompat.startForegroundService(context, intent);
        } catch (IllegalStateException e2) {
            if (Build.VERSION.SDK_INT < 31 || !Api31.b(e2)) {
                throw e2;
            }
            Log.e("MediaButtonReceiver", "caught exception when trying to start a foreground service from the background: " + Api31.a(e2).getMessage());
        }
    }
}
