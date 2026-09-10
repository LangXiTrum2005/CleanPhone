package arytenoidectomy;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;

/* JADX INFO: compiled from: CustomTabsSessionToken.java */
/* JADX INFO: loaded from: classes.dex */
public class formularize {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ICustomTabsCallback f14365attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final dern f14366dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final PendingIntent f14367saneness;

    /* JADX INFO: compiled from: CustomTabsSessionToken.java */
    public class attabal extends dern {
        public attabal() {
        }

        @Override // arytenoidectomy.dern
        public void extraCallback(String str, Bundle bundle) {
            try {
                formularize.this.f14365attabal.extraCallback(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // arytenoidectomy.dern
        public Bundle extraCallbackWithResult(String str, Bundle bundle) {
            try {
                return formularize.this.f14365attabal.extraCallbackWithResult(str, bundle);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // arytenoidectomy.dern
        public void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
            try {
                formularize.this.f14365attabal.onActivityLayout(i, i2, i3, i4, i5, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // arytenoidectomy.dern
        public void onActivityResized(int i, int i2, Bundle bundle) {
            try {
                formularize.this.f14365attabal.onActivityResized(i, i2, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // arytenoidectomy.dern
        public void onMessageChannelReady(Bundle bundle) {
            try {
                formularize.this.f14365attabal.onMessageChannelReady(bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // arytenoidectomy.dern
        public void onMinimized(Bundle bundle) {
            try {
                formularize.this.f14365attabal.onMinimized(bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // arytenoidectomy.dern
        public void onNavigationEvent(int i, Bundle bundle) {
            try {
                formularize.this.f14365attabal.onNavigationEvent(i, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // arytenoidectomy.dern
        public void onPostMessage(String str, Bundle bundle) {
            try {
                formularize.this.f14365attabal.onPostMessage(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // arytenoidectomy.dern
        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
            try {
                formularize.this.f14365attabal.onRelationshipValidationResult(i, uri, z, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // arytenoidectomy.dern
        public void onUnminimized(Bundle bundle) {
            try {
                formularize.this.f14365attabal.onUnminimized(bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // arytenoidectomy.dern
        public void onWarmupCompleted(Bundle bundle) {
            try {
                formularize.this.f14365attabal.onWarmupCompleted(bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public formularize(ICustomTabsCallback iCustomTabsCallback, PendingIntent pendingIntent) {
        if (iCustomTabsCallback == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f14365attabal = iCustomTabsCallback;
        this.f14367saneness = pendingIntent;
        this.f14366dern = iCustomTabsCallback == null ? null : new attabal();
    }

    public IBinder attabal() {
        ICustomTabsCallback iCustomTabsCallback = this.f14365attabal;
        if (iCustomTabsCallback == null) {
            return null;
        }
        return iCustomTabsCallback.asBinder();
    }

    public PendingIntent dern() {
        return this.f14367saneness;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof formularize)) {
            return false;
        }
        formularize formularizeVar = (formularize) obj;
        PendingIntent pendingIntentDern = formularizeVar.dern();
        PendingIntent pendingIntent = this.f14367saneness;
        if ((pendingIntent == null) != (pendingIntentDern == null)) {
            return false;
        }
        return pendingIntent != null ? pendingIntent.equals(pendingIntentDern) : saneness().equals(formularizeVar.saneness());
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.f14367saneness;
        return pendingIntent != null ? pendingIntent.hashCode() : saneness().hashCode();
    }

    public final IBinder saneness() {
        ICustomTabsCallback iCustomTabsCallback = this.f14365attabal;
        if (iCustomTabsCallback != null) {
            return iCustomTabsCallback.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }
}
