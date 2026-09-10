package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import androidx.core.app.BundleCompat;
import androidx.media.MediaBrowserProtocol;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class UM extends MediaBrowser.ConnectionCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WM f3820a;

    public UM(WM wm) {
        this.f3820a = wm;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        WM wm = this.f3820a;
        VM vm = wm.mConnectionCallbackInternal;
        if (vm != null) {
            ZM zm = (ZM) vm;
            MediaBrowser mediaBrowser = zm.b;
            try {
                Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 0);
                    IBinder binder = BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_MESSENGER_BINDER);
                    if (binder != null) {
                        zm.f = new C3692iN(binder, zm.c);
                        TM tm = zm.d;
                        Messenger messenger = new Messenger(tm);
                        zm.g = messenger;
                        tm.getClass();
                        tm.b = new WeakReference(messenger);
                        try {
                            C3692iN c3692iN = zm.f;
                            Context context = zm.f4067a;
                            Messenger messenger2 = zm.g;
                            c3692iN.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
                            bundle.putInt(MediaBrowserProtocol.DATA_CALLING_PID, Process.myPid());
                            bundle.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, (Bundle) c3692iN.c);
                            c3692iN.N(6, bundle, messenger2);
                        } catch (RemoteException unused) {
                        }
                    }
                    BB bbC = AB.c(BundleCompat.getBinder(extras, MediaBrowserProtocol.EXTRA_SESSION_BINDER));
                    if (bbC != null) {
                        zm.h = MediaSessionCompat$Token.b(mediaBrowser.getSessionToken(), bbC);
                    }
                }
            } catch (IllegalStateException unused2) {
            }
        }
        wm.onConnected();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        WM wm = this.f3820a;
        VM vm = wm.mConnectionCallbackInternal;
        if (vm != null) {
            vm.getClass();
        }
        wm.onConnectionFailed();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        WM wm = this.f3820a;
        VM vm = wm.mConnectionCallbackInternal;
        if (vm != null) {
            ZM zm = (ZM) vm;
            zm.f = null;
            zm.g = null;
            zm.h = null;
            TM tm = zm.d;
            tm.getClass();
            tm.b = new WeakReference(null);
        }
        wm.onConnectionSuspended();
    }
}
