package androidx.browser.customtabs;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.IEngagementSignalsCallback;
import com.inmobi.media.C3075j2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class CustomTabsSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3713a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICustomTabsService f3714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ICustomTabsCallback f3715c;
    public final ComponentName d;

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsSession$1, reason: invalid class name */
    class AnonymousClass1 extends IEngagementSignalsCallback.Stub {
        public static final /* synthetic */ int Z = 0;
        public final Handler X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ C3075j2 f3716Y;

        public AnonymousClass1(C3075j2 c3075j2) {
            this.f3716Y = c3075j2;
            attachInterface(this, IEngagementSignalsCallback.F8);
            this.X = new Handler(Looper.getMainLooper());
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void onGreatestScrollPercentageIncreased(final int i2, final Bundle bundle) {
            Handler handler = this.X;
            final C3075j2 c3075j2 = this.f3716Y;
            handler.post(new Runnable() { // from class: androidx.browser.customtabs.c
                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = CustomTabsSession.AnonymousClass1.Z;
                    c3075j2.onGreatestScrollPercentageIncreased(i2, bundle);
                }
            });
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void onSessionEnded(boolean z2, Bundle bundle) {
            this.X.post(new b(this.f3716Y, z2, bundle, 0));
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void onVerticalScrollEvent(boolean z2, Bundle bundle) {
            this.X.post(new b(this.f3716Y, z2, bundle, 1));
        }
    }

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsSession$2, reason: invalid class name */
    class AnonymousClass2 extends IEngagementSignalsCallback.Stub {
        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void onGreatestScrollPercentageIncreased(int i2, Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                throw null;
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void onSessionEnded(boolean z2, Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                throw null;
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void onVerticalScrollEvent(boolean z2, Bundle bundle) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                throw null;
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        }
    }

    public static class MockSession extends ICustomTabsService.Stub {
        @Override // android.support.customtabs.ICustomTabsService
        public final boolean G(long j) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final int O(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            return 0;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean Q(ICustomTabsCallback iCustomTabsCallback) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean S(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, ArrayList arrayList) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean U(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean Y(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean g(int i2, Uri uri, Bundle bundle, ICustomTabsCallback iCustomTabsCallback) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean l(int i2, Uri uri, Bundle bundle, ICustomTabsCallback iCustomTabsCallback) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final Bundle m(Bundle bundle, String str) {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean o(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean q(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean s(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean w(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return false;
        }
    }

    public static class PendingSession {
    }

    public CustomTabsSession(ICustomTabsService iCustomTabsService, ICustomTabsCallback iCustomTabsCallback, ComponentName componentName) {
        this.f3714b = iCustomTabsService;
        this.f3715c = iCustomTabsCallback;
        this.d = componentName;
    }

    public final Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        return bundle2;
    }

    public final boolean b() {
        try {
            return this.f3714b.Y(this.f3715c, a(Bundle.EMPTY));
        } catch (SecurityException e2) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e2);
        }
    }

    public final boolean c(Uri uri, ArrayList arrayList) {
        try {
            return this.f3714b.S(this.f3715c, uri, a(null), arrayList);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final void d(String str) {
        Bundle bundleA = a(null);
        synchronized (this.f3713a) {
            try {
                try {
                    this.f3714b.O(this.f3715c, str, bundleA);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(C3075j2 c3075j2) {
        Bundle bundleA = a(Bundle.EMPTY);
        try {
            this.f3714b.s(this.f3715c, new AnonymousClass1(c3075j2), bundleA);
        } catch (SecurityException e2) {
            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e2);
        }
    }
}
