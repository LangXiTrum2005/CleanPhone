package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.support.customtabs.ICustomTabsCallback;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.content.ContextCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class CustomTabsIntent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f3706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f3707b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ActivityHeightResizeBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ActivitySideSheetDecorationType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ActivitySideSheetPosition {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ActivitySideSheetRoundedCornersPosition {
    }

    public static class Api21Impl {
        public static Locale a(Intent intent) {
            String stringExtra = intent.getStringExtra("androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG");
            if (stringExtra != null) {
                return Locale.forLanguageTag(stringExtra);
            }
            return null;
        }

        public static void b(Intent intent, Locale locale) {
            intent.putExtra("androidx.browser.customtabs.extra.TRANSLATE_LANGUAGE_TAG", locale.toLanguageTag());
        }
    }

    public static class Api23Impl {
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    public static class Api24Impl {
        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    public static class Api34Impl {
        public static void a(ActivityOptions activityOptions, boolean z2) {
            activityOptions.setShareIdentityEnabled(z2);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CloseButtonPosition {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ShareState {
    }

    public CustomTabsIntent(Intent intent, Bundle bundle) {
        this.f3706a = intent;
        this.f3707b = bundle;
    }

    public final void a(Context context, Uri uri) {
        Intent intent = this.f3706a;
        intent.setData(uri);
        ContextCompat.startActivity(context, intent, this.f3707b);
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f3708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CustomTabColorSchemeParams.Builder f3709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ActivityOptions f3710c;
        public SparseArray d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bundle f3711e;
        public int f;
        public boolean g;

        public Builder() {
            this.f3708a = new Intent("android.intent.action.VIEW");
            this.f3709b = new CustomTabColorSchemeParams.Builder();
            this.f = 0;
            this.g = true;
        }

        public final CustomTabsIntent a() {
            Intent intent = this.f3708a;
            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                intent.putExtras(bundle);
            }
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.g);
            CustomTabColorSchemeParams.Builder builder = this.f3709b;
            intent.putExtras(new CustomTabColorSchemeParams(builder.f3690a, builder.f3691b).a());
            Bundle bundle2 = this.f3711e;
            if (bundle2 != null) {
                intent.putExtras(bundle2);
            }
            if (this.d != null) {
                Bundle bundle3 = new Bundle();
                bundle3.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.d);
                intent.putExtras(bundle3);
            }
            intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f);
            int i2 = Build.VERSION.SDK_INT;
            String strA = Api24Impl.a();
            if (!TextUtils.isEmpty(strA)) {
                Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey("Accept-Language")) {
                    bundleExtra.putString("Accept-Language", strA);
                    intent.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
            if (i2 >= 34) {
                if (this.f3710c == null) {
                    this.f3710c = Api23Impl.a();
                }
                Api34Impl.a(this.f3710c, false);
            }
            ActivityOptions activityOptions = this.f3710c;
            return new CustomTabsIntent(intent, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public Builder b(int i2) {
            c(i2, 0);
            return this;
        }

        public final void c(int i2, int i3) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            if (i3 < 0 || i3 > 2) {
                throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
            }
            Intent intent = this.f3708a;
            intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i2);
            intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", i3);
        }

        public Builder d(int i2) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
            }
            this.f3708a.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX", i2);
            return this;
        }

        public final void e(int i2) {
            if (i2 < 0 || i2 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f = i2;
            Intent intent = this.f3708a;
            if (i2 == 1) {
                intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            } else if (i2 == 2) {
                intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            } else {
                intent.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            }
        }

        public Builder(CustomTabsSession customTabsSession) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f3708a = intent;
            this.f3709b = new CustomTabColorSchemeParams.Builder();
            this.f = 0;
            this.g = true;
            if (customTabsSession != null) {
                intent.setPackage(customTabsSession.d.getPackageName());
                ICustomTabsCallback.Stub stub = (ICustomTabsCallback.Stub) customTabsSession.f3715c;
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", stub);
                intent.putExtras(bundle);
            }
        }
    }
}
