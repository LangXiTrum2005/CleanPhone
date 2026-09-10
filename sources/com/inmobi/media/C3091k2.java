package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.core.content.ContextCompat;
import com.inmobi.ads.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3091k2 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3059i2 f23741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final R6 f23742c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3267v3 f23743e;
    public final Context f;
    public final C3283w3 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f23745i;
    public final WeakReference j;

    public C3091k2(String urlToLoad, C3059i2 c3059i2, Context context, InterfaceC2995e2 interfaceC2995e2, InterfaceC3323yb redirectionValidator, R6 r6, String api) {
        Intrinsics.f(urlToLoad, "urlToLoad");
        Intrinsics.f(context, "context");
        Intrinsics.f(redirectionValidator, "redirectionValidator");
        Intrinsics.f(api, "api");
        this.f23740a = urlToLoad;
        this.f23741b = c3059i2;
        this.f23742c = r6;
        this.d = api;
        C3267v3 c3267v3 = new C3267v3();
        this.f23743e = c3267v3;
        this.g = new C3283w3(interfaceC2995e2, r6);
        this.f23745i = new WeakReference(interfaceC2995e2);
        this.j = new WeakReference(redirectionValidator);
        c3267v3.f24046c = this;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.e(applicationContext, "getApplicationContext(...)");
        this.f = applicationContext;
        Uc.a(context, this);
    }

    public final void a() {
        String strA;
        C3267v3 c3267v3 = this.f23743e;
        Context context = this.f;
        if (c3267v3.f24044a != null || context == null || (strA = AbstractC3299x3.a(context)) == null) {
            return;
        }
        C3235t3 c3235t3 = new C3235t3(c3267v3);
        c3267v3.f24045b = c3235t3;
        CustomTabsClient.a(context, strA, c3235t3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.f(activity, "activity");
        C3267v3 c3267v3 = this.f23743e;
        Context context = this.f;
        c3267v3.getClass();
        Intrinsics.f(context, "context");
        C3235t3 c3235t3 = c3267v3.f24045b;
        if (c3235t3 != null) {
            context.unbindService(c3235t3);
            c3267v3.f24044a = null;
        }
        c3267v3.f24045b = null;
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.f(activity, "activity");
        Intrinsics.f(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.f(activity, "activity");
    }

    public final void a(Uri uri) {
        CustomTabsIntent.Builder builder;
        CustomTabsSession customTabsSessionD;
        C3059i2 c3059i2 = this.f23741b;
        if (c3059i2 != null) {
            try {
                builder = a(c3059i2);
            } catch (Error unused) {
                C3267v3 c3267v3 = this.f23743e;
                CustomTabsSession customTabsSession = c3267v3.d;
                if (customTabsSession == null) {
                    CustomTabsClient customTabsClient = c3267v3.f24044a;
                    customTabsSessionD = customTabsClient != null ? customTabsClient.d(new C3251u3(c3267v3)) : null;
                    c3267v3.d = customTabsSessionD;
                    customTabsSession = customTabsSessionD;
                }
                builder = new CustomTabsIntent.Builder(customTabsSession);
                builder.f3708a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
            }
        } else {
            C3267v3 c3267v4 = this.f23743e;
            CustomTabsSession customTabsSession2 = c3267v4.d;
            if (customTabsSession2 == null) {
                CustomTabsClient customTabsClient2 = c3267v4.f24044a;
                customTabsSessionD = customTabsClient2 != null ? customTabsClient2.d(new C3251u3(c3267v4)) : null;
                c3267v4.d = customTabsSessionD;
                customTabsSession2 = customTabsSessionD;
            }
            builder = new CustomTabsIntent.Builder(customTabsSession2);
            builder.f3708a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
        }
        AbstractC3219s3.a(this.f, builder.a(), uri, (InterfaceC2995e2) this.f23745i.get(), this.f23742c, (InterfaceC3323yb) this.j.get(), this.d);
    }

    public final CustomTabsIntent.Builder a(C3059i2 c3059i2) {
        Bitmap bitmap;
        C3267v3 c3267v3 = this.f23743e;
        CustomTabsSession customTabsSessionD = c3267v3.d;
        if (customTabsSessionD == null) {
            CustomTabsClient customTabsClient = c3267v3.f24044a;
            customTabsSessionD = customTabsClient != null ? customTabsClient.d(new C3251u3(c3267v3)) : null;
            c3267v3.d = customTabsSessionD;
        }
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(customTabsSessionD);
        Intent intent = builder.f3708a;
        intent.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", 2);
        try {
            builder.e(2);
            intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 0);
            intent.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON", true);
            intent.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON", true);
        } catch (Error unused) {
        }
        if (c3059i2.f23681b) {
            Context context = this.f;
            int i2 = R.drawable.im_close_transparent;
            Intrinsics.f(context, "<this>");
            Drawable drawable = ContextCompat.getDrawable(context, i2);
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
                Intrinsics.e(bitmap, "getBitmap(...)");
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable != null ? drawable.getIntrinsicWidth() : 24, drawable != null ? drawable.getIntrinsicHeight() : 24, Bitmap.Config.ARGB_8888);
                Intrinsics.e(bitmapCreateBitmap, "Bitmap.createBitmap(width, height, config)");
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                if (drawable != null) {
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                }
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                bitmap = bitmapCreateBitmap;
            }
            intent.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", bitmap);
        }
        V3 v3H = U3.h();
        EnumC3179pa enumC3179paA = AbstractC3195qa.a(U3.g());
        if (enumC3179paA != EnumC3179pa.LANDSCAPE && enumC3179paA != EnumC3179pa.REVERSE_LANDSCAPE) {
            builder.c((int) (((int) (v3H.f23293b * c3059i2.f23680a)) * v3H.f23294c), 2);
        } else {
            int i3 = (int) (v3H.f23292a * c3059i2.f23680a);
            builder.d((int) (i3 * v3H.f23294c));
            if (i3 > 0) {
                intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP", i3);
            } else {
                throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
            }
        }
        intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
        return builder;
    }
}
