package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.IEngagementSignalsCallback;
import androidx.collection.SimpleArrayMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class CustomTabsService extends Service {
    public final SimpleArrayMap X = new SimpleArrayMap(0);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ICustomTabsService.Stub f3712Y = new AnonymousClass1();

    /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsService$1, reason: invalid class name */
    public class AnonymousClass1 extends ICustomTabsService.Stub {
        public AnonymousClass1() {
            attachInterface(this, ICustomTabsService.E8);
        }

        public static PendingIntent c0(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            bundle.remove("android.support.customtabs.extra.SESSION_ID");
            return pendingIntent;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean G(long j) {
            return CustomTabsService.this.i();
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final int O(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            new CustomTabsSessionToken(iCustomTabsCallback, c0(bundle));
            return CustomTabsService.this.d();
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean Q(ICustomTabsCallback iCustomTabsCallback) {
            return d0(iCustomTabsCallback, null);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean S(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, ArrayList arrayList) {
            new CustomTabsSessionToken(iCustomTabsCallback, c0(bundle));
            return CustomTabsService.this.b();
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean U(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
            new CustomTabsSessionToken(iCustomTabsCallback, null);
            new Bundle();
            return CustomTabsService.this.f();
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean Y(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            new CustomTabsSessionToken(iCustomTabsCallback, c0(bundle));
            return false;
        }

        public final boolean d0(ICustomTabsCallback iCustomTabsCallback, PendingIntent pendingIntent) {
            final CustomTabsSessionToken customTabsSessionToken = new CustomTabsSessionToken(iCustomTabsCallback, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: androidx.browser.customtabs.a
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        CustomTabsService.AnonymousClass1 anonymousClass1 = this.X;
                        CustomTabsSessionToken customTabsSessionToken2 = customTabsSessionToken;
                        CustomTabsService customTabsService = CustomTabsService.this;
                        customTabsService.getClass();
                        try {
                            synchronized (customTabsService.X) {
                                try {
                                    ICustomTabsCallback iCustomTabsCallback2 = customTabsSessionToken2.f3717a;
                                    IBinder iBinderAsBinder = iCustomTabsCallback2 == null ? null : iCustomTabsCallback2.asBinder();
                                    if (iBinderAsBinder == null) {
                                        return;
                                    }
                                    iBinderAsBinder.unlinkToDeath((IBinder.DeathRecipient) customTabsService.X.get(iBinderAsBinder), 0);
                                    customTabsService.X.remove(iBinderAsBinder);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } catch (NoSuchElementException unused) {
                        }
                    }
                };
                synchronized (CustomTabsService.this.X) {
                    iCustomTabsCallback.asBinder().linkToDeath(deathRecipient, 0);
                    CustomTabsService.this.X.put(iCustomTabsCallback.asBinder(), deathRecipient);
                }
                return CustomTabsService.this.c();
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean g(int i2, Uri uri, Bundle bundle, ICustomTabsCallback iCustomTabsCallback) {
            new CustomTabsSessionToken(iCustomTabsCallback, c0(bundle));
            return CustomTabsService.this.h();
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean l(int i2, Uri uri, Bundle bundle, ICustomTabsCallback iCustomTabsCallback) {
            new CustomTabsSessionToken(iCustomTabsCallback, c0(bundle));
            return CustomTabsService.this.e();
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final Bundle m(Bundle bundle, String str) {
            return CustomTabsService.this.a();
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean o(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
            new CustomTabsSessionToken(iCustomTabsCallback, c0(bundle));
            if (bundle != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                }
            }
            return CustomTabsService.this.f();
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean q(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return d0(iCustomTabsCallback, c0(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean s(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) {
            IEngagementSignalsCallback.Stub.b0(iBinder);
            new CustomTabsSessionToken(iCustomTabsCallback, c0(bundle));
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean w(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            new CustomTabsSessionToken(iCustomTabsCallback, c0(bundle));
            return CustomTabsService.this.g();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FilePurpose {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Relation {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Result {
    }

    public abstract Bundle a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract int d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f3712Y;
    }
}
