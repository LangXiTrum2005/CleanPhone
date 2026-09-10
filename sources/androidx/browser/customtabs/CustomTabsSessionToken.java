package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback;

/* JADX INFO: loaded from: classes.dex */
public class CustomTabsSessionToken {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICustomTabsCallback f3717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PendingIntent f3718b;

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsSessionToken$1, reason: invalid class name */
    class AnonymousClass1 extends CustomTabsCallback {
        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void extraCallback(String str, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onActivityLayout(int i2, int i3, int i4, int i5, int i6, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onActivityResized(int i2, int i3, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onMessageChannelReady(Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onMinimized(Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onNavigationEvent(int i2, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onPostMessage(String str, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onRelationshipValidationResult(int i2, Uri uri, boolean z2, Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onUnminimized(Bundle bundle) {
            throw null;
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public final void onWarmupCompleted(Bundle bundle) {
            throw null;
        }
    }

    public static class MockCallback extends ICustomTabsCallback.Stub {
        @Override // android.support.customtabs.ICustomTabsCallback
        public final void H(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void J(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void L(int i2, int i3, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void T(int i2, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void V(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void W(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void X(int i2, Uri uri, boolean z2, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void a(int i2, int i3, int i4, int i5, int i6, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback.Stub, android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final Bundle h(String str, Bundle bundle) {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void r(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void v(Bundle bundle) {
        }
    }

    public CustomTabsSessionToken(ICustomTabsCallback iCustomTabsCallback, PendingIntent pendingIntent) {
        if (iCustomTabsCallback == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f3717a = iCustomTabsCallback;
        this.f3718b = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CustomTabsSessionToken) {
            CustomTabsSessionToken customTabsSessionToken = (CustomTabsSessionToken) obj;
            PendingIntent pendingIntent = customTabsSessionToken.f3718b;
            PendingIntent pendingIntent2 = this.f3718b;
            if ((pendingIntent2 == null) == (pendingIntent == null)) {
                if (pendingIntent2 != null) {
                    return pendingIntent2.equals(pendingIntent);
                }
                ICustomTabsCallback iCustomTabsCallback = this.f3717a;
                if (iCustomTabsCallback == null) {
                    throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
                }
                IBinder iBinderAsBinder = iCustomTabsCallback.asBinder();
                ICustomTabsCallback iCustomTabsCallback2 = customTabsSessionToken.f3717a;
                if (iCustomTabsCallback2 != null) {
                    return iBinderAsBinder.equals(iCustomTabsCallback2.asBinder());
                }
                throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
            }
        }
        return false;
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.f3718b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        ICustomTabsCallback iCustomTabsCallback = this.f3717a;
        if (iCustomTabsCallback != null) {
            return iCustomTabsCallback.asBinder().hashCode();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }
}
