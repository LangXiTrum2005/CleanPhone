package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v4.media.a;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.FacebookSdkNotInitializedException;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/Validate;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class Validate {
    public static final boolean a(Context context, String str) {
        List<ResolveInfo> listQueryIntentActivities;
        Intrinsics.f(context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            listQueryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        } else {
            listQueryIntentActivities = null;
        }
        if (listQueryIntentActivities == null) {
            return false;
        }
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!Intrinsics.a(activityInfo.name, "com.facebook.CustomTabActivity") || !Intrinsics.a(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z2 = true;
        }
        return z2;
    }

    public static final void b(Context context, boolean z2) {
        ActivityInfo activityInfo;
        Intrinsics.f(context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (PackageManager.NameNotFoundException unused) {
                activityInfo = null;
            }
        } else {
            activityInfo = null;
        }
        if (activityInfo == null) {
            if (z2) {
                throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
            }
            Log.w("com.facebook.internal.Validate", "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
        }
    }

    public static final void c(Context context, boolean z2) {
        Intrinsics.f(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            if (z2) {
                throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
            }
            Log.w("com.facebook.internal.Validate", "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
    }

    public static final void d(String arg, String str) {
        Intrinsics.f(arg, "arg");
        if (arg.length() <= 0) {
            throw new IllegalArgumentException(a.n("Argument '", str, "' cannot be empty").toString());
        }
    }

    public static final void e(GraphRequestBatch container) {
        Intrinsics.f(container, "container");
        Iterator<GraphRequest> it = container.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("Container 'requests' cannot contain null values");
            }
        }
        if (container.isEmpty()) {
            throw new IllegalArgumentException("Container 'requests' cannot be empty".toString());
        }
    }

    public static final void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(a.n("Argument '", str, "' cannot be null"));
        }
    }

    public static final void g(String str, String str2) {
        if (Utility.C(str)) {
            throw new IllegalArgumentException(a.n("Argument '", str2, "' cannot be null or empty").toString());
        }
    }

    public static final void h() {
        if (!FacebookSdk.f15923p.get()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
