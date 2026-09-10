package arytenoidectomy;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.IEngagementSignalsCallback;
import java.util.List;

/* JADX INFO: compiled from: CustomTabsSession.java */
/* JADX INFO: loaded from: classes.dex */
public final class apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Object f14351attabal = new Object();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ICustomTabsCallback f14352dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final PendingIntent f14353marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ICustomTabsService f14354saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final ComponentName f14355wireman;

    /* JADX INFO: compiled from: CustomTabsSession.java */
    public class attabal extends IEngagementSignalsCallback.Stub {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final Handler f14356dern = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ impassible f14358wireman;

        public attabal(impassible impassibleVar) {
            this.f14358wireman = impassibleVar;
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(final int i, final Bundle bundle) {
            Handler handler = this.f14356dern;
            final impassible impassibleVar = this.f14358wireman;
            handler.post(new Runnable() { // from class: arytenoidectomy.taiyuan
                @Override // java.lang.Runnable
                public final void run() {
                    impassibleVar.onGreatestScrollPercentageIncreased(i, bundle);
                }
            });
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onSessionEnded(final boolean z, final Bundle bundle) {
            Handler handler = this.f14356dern;
            final impassible impassibleVar = this.f14358wireman;
            handler.post(new Runnable() { // from class: arytenoidectomy.impromptu
                @Override // java.lang.Runnable
                public final void run() {
                    impassibleVar.onSessionEnded(z, bundle);
                }
            });
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onVerticalScrollEvent(final boolean z, final Bundle bundle) {
            Handler handler = this.f14356dern;
            final impassible impassibleVar = this.f14358wireman;
            handler.post(new Runnable() { // from class: arytenoidectomy.cutely
                @Override // java.lang.Runnable
                public final void run() {
                    impassibleVar.onVerticalScrollEvent(z, bundle);
                }
            });
        }
    }

    public apical(ICustomTabsService iCustomTabsService, ICustomTabsCallback iCustomTabsCallback, ComponentName componentName, PendingIntent pendingIntent) {
        this.f14354saneness = iCustomTabsService;
        this.f14352dern = iCustomTabsCallback;
        this.f14355wireman = componentName;
        this.f14353marial = pendingIntent;
    }

    public boolean apical(Uri uri) {
        return formularize(uri, null, new Bundle());
    }

    public final void attabal(Bundle bundle) {
        PendingIntent pendingIntent = this.f14353marial;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    public ComponentName beachfront() {
        return this.f14355wireman;
    }

    public PendingIntent competently() {
        return this.f14353marial;
    }

    public int cutely(String str, Bundle bundle) {
        int iPostMessage;
        Bundle bundleSaneness = saneness(bundle);
        synchronized (this.f14351attabal) {
            try {
                try {
                    iPostMessage = this.f14354saneness.postMessage(this.f14352dern, str, bundleSaneness);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iPostMessage;
    }

    public final IEngagementSignalsCallback.Stub dern(impassible impassibleVar) {
        return new attabal(impassibleVar);
    }

    public boolean formularize(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle bundleWireman = wireman(uri2);
            if (bundleWireman == null) {
                return this.f14354saneness.requestPostMessageChannel(this.f14352dern, uri);
            }
            bundle.putAll(bundleWireman);
            return this.f14354saneness.requestPostMessageChannelWithExtras(this.f14352dern, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean impassible(impassible impassibleVar, Bundle bundle) throws RemoteException {
        try {
            return this.f14354saneness.setEngagementSignalsCallback(this.f14352dern, dern(impassibleVar).asBinder(), saneness(bundle));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    public boolean impromptu(Bundle bundle) throws RemoteException {
        try {
            return this.f14354saneness.isEngagementSignalsApiAvailable(this.f14352dern, saneness(bundle));
        } catch (SecurityException e) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e);
        }
    }

    public IBinder marial() {
        return this.f14352dern.asBinder();
    }

    public final Bundle saneness(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        attabal(bundle2);
        return bundle2;
    }

    public boolean taiyuan(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f14354saneness.mayLaunchUrl(this.f14352dern, uri, saneness(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean triweekly(int i, Uri uri, Bundle bundle) {
        if (i >= 1 && i <= 2) {
            try {
                return this.f14354saneness.validateRelationship(this.f14352dern, i, uri, saneness(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public final Bundle wireman(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.f14353marial != null) {
            attabal(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }
}
