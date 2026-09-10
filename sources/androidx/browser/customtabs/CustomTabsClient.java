package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CustomTabsClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICustomTabsService f3692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComponentName f3693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f3694c;

    public CustomTabsClient(ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
        this.f3692a = iCustomTabsService;
        this.f3693b = componentName;
        this.f3694c = context;
    }

    public static boolean a(Context context, String str, CustomTabsServiceConnection customTabsServiceConnection) {
        customTabsServiceConnection.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, customTabsServiceConnection, 33);
    }

    public static void b(Context context, String str) {
        if (str == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        try {
            a(applicationContext, str, new CustomTabsServiceConnection() { // from class: androidx.browser.customtabs.CustomTabsClient.1
                @Override // androidx.browser.customtabs.CustomTabsServiceConnection
                public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
                    customTabsClient.e();
                    applicationContext.unbindService(this);
                }

                @Override // android.content.ServiceConnection
                public final void onServiceDisconnected(ComponentName componentName) {
                }
            });
        } catch (SecurityException unused) {
        }
    }

    public static String c(Context context, List list, boolean z2) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z2 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public final CustomTabsSession d(final CustomTabsCallback customTabsCallback) {
        ICustomTabsCallback.Stub stub = new ICustomTabsCallback.Stub() { // from class: androidx.browser.customtabs.CustomTabsClient.2
            public final Handler X;

            {
                attachInterface(this, ICustomTabsCallback.D8);
                this.X = new Handler(Looper.getMainLooper());
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void H(final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.X.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.9
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onMinimized(bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void J(final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.X.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.10
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onUnminimized(bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void L(final int i2, final int i3, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.X.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onActivityResized(i2, i3, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void T(final int i2, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.X.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onNavigationEvent(i2, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void V(final String str, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.X.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onPostMessage(str, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void W(final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.X.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onMessageChannelReady(bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void X(final int i2, final Uri uri, final boolean z2, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.X.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onRelationshipValidationResult(i2, uri, z2, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void a(final int i2, final int i3, final int i4, final int i5, final int i6, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.X.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onActivityLayout(i2, i3, i4, i5, i6, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final Bundle h(String str, Bundle bundle) {
                CustomTabsCallback customTabsCallback2 = customTabsCallback;
                if (customTabsCallback2 == null) {
                    return null;
                }
                return customTabsCallback2.extraCallbackWithResult(str, bundle);
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void r(final String str, final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.X.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.extraCallback(str, bundle);
                    }
                });
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void v(final Bundle bundle) {
                if (customTabsCallback == null) {
                    return;
                }
                this.X.post(new Runnable() { // from class: androidx.browser.customtabs.CustomTabsClient.2.7
                    @Override // java.lang.Runnable
                    public final void run() {
                        customTabsCallback.onWarmupCompleted(bundle);
                    }
                });
            }
        };
        ICustomTabsService iCustomTabsService = this.f3692a;
        try {
            if (iCustomTabsService.Q(stub)) {
                return new CustomTabsSession(iCustomTabsService, stub, this.f3693b);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void e() {
        try {
            this.f3692a.G(0L);
        } catch (RemoteException unused) {
        }
    }
}
