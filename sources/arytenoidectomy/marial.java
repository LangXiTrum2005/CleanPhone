package arytenoidectomy;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: compiled from: CustomTabsIntent.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Intent f14372attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Bundle f14373saneness;

    /* JADX INFO: compiled from: CustomTabsIntent.java */
    public static class attabal {
        public static ActivityOptions attabal() {
            return ActivityOptions.makeBasic();
        }
    }

    /* JADX INFO: compiled from: CustomTabsIntent.java */
    public static class dern {
        public static void attabal(ActivityOptions activityOptions, boolean z) {
            activityOptions.setShareIdentityEnabled(z);
        }
    }

    /* JADX INFO: compiled from: CustomTabsIntent.java */
    public static class saneness {
        public static String attabal() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    public marial(Intent intent, Bundle bundle) {
        this.f14372attabal = intent;
        this.f14373saneness = bundle;
    }

    public void attabal(Context context, Uri uri) {
        this.f14372attabal.setData(uri);
        picketboat.saneness.startActivity(context, this.f14372attabal, this.f14373saneness);
    }

    /* JADX INFO: compiled from: CustomTabsIntent.java */
    public static final class wireman {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public SparseArray<Bundle> f14375beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public Bundle f14376competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public boolean f14377cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public ArrayList<Bundle> f14378dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public ArrayList<Bundle> f14380marial;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public ActivityOptions f14383wireman;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Intent f14374attabal = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final arytenoidectomy.saneness.attabal f14381saneness = new arytenoidectomy.saneness.attabal();

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public int f14379impromptu = 0;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public boolean f14382taiyuan = true;

        public wireman() {
        }

        public wireman adultoid(boolean z) {
            this.f14374attabal.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", z);
            return this;
        }

        public wireman apical(int i) {
            return formularize(i, 0);
        }

        public final void arytenoidectomy(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f14374attabal.putExtras(bundle);
        }

        public marial attabal() {
            if (!this.f14374attabal.hasExtra("android.support.customtabs.extra.SESSION")) {
                arytenoidectomy(null, null);
            }
            ArrayList<Bundle> arrayList = this.f14378dern;
            if (arrayList != null) {
                this.f14374attabal.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f14380marial;
            if (arrayList2 != null) {
                this.f14374attabal.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f14374attabal.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f14382taiyuan);
            this.f14374attabal.putExtras(this.f14381saneness.attabal().attabal());
            Bundle bundle = this.f14376competently;
            if (bundle != null) {
                this.f14374attabal.putExtras(bundle);
            }
            if (this.f14375beachfront != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f14375beachfront);
                this.f14374attabal.putExtras(bundle2);
            }
            this.f14374attabal.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f14379impromptu);
            int i = Build.VERSION.SDK_INT;
            competently();
            if (i >= 34) {
                monoploid();
            }
            ActivityOptions activityOptions = this.f14383wireman;
            return new marial(this.f14374attabal, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public wireman beachfront(int i, arytenoidectomy.saneness sanenessVar) {
            if (i < 0 || i > 2 || i == 0) {
                throw new IllegalArgumentException("Invalid colorScheme: " + i);
            }
            if (this.f14375beachfront == null) {
                this.f14375beachfront = new SparseArray<>();
            }
            this.f14375beachfront.put(i, sanenessVar.attabal());
            return this;
        }

        public final void competently() {
            String strAttabal = saneness.attabal();
            if (TextUtils.isEmpty(strAttabal)) {
                return;
            }
            Bundle bundleExtra = this.f14374attabal.hasExtra("com.android.browser.headers") ? this.f14374attabal.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", strAttabal);
            this.f14374attabal.putExtra("com.android.browser.headers", bundleExtra);
        }

        public wireman cutely(Context context, int i, int i2) {
            this.f14374attabal.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", igbo.dern.attabal(context, i, i2).saneness());
            return this;
        }

        public wireman dern(boolean z) {
            this.f14374attabal.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON", !z);
            return this;
        }

        public wireman formularize(int i, int i2) {
            if (i <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            if (i2 < 0 || i2 > 2) {
                throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
            }
            this.f14374attabal.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i);
            this.f14374attabal.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", i2);
            return this;
        }

        public wireman graveside(Context context, int i, int i2) {
            this.f14383wireman = ActivityOptions.makeCustomAnimation(context, i, i2);
            return this;
        }

        public wireman impassible(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
            }
            this.f14374attabal.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX", i);
            return this;
        }

        public wireman impromptu(arytenoidectomy.saneness sanenessVar) {
            this.f14376competently = sanenessVar.attabal();
            return this;
        }

        public wireman kowloon(apical apicalVar) {
            this.f14374attabal.setPackage(apicalVar.beachfront().getPackageName());
            arytenoidectomy(apicalVar.marial(), apicalVar.competently());
            return this;
        }

        public wireman marial(int i) {
            if (i < 0 || i > 2) {
                throw new IllegalArgumentException("Invalid value for the position argument");
            }
            this.f14374attabal.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i);
            return this;
        }

        public wireman molybdenite(boolean z) {
            this.f14374attabal.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z ? 1 : 0);
            return this;
        }

        public final void monoploid() {
            if (this.f14383wireman == null) {
                this.f14383wireman = attabal.attabal();
            }
            dern.attabal(this.f14383wireman, this.f14377cutely);
        }

        public wireman polloi(int i) {
            if (i < 0 || i > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f14379impromptu = i;
            if (i == 1) {
                this.f14374attabal.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
                return this;
            }
            if (i == 2) {
                this.f14374attabal.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
                return this;
            }
            this.f14374attabal.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            return this;
        }

        public wireman saneness(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialWidthPx argument");
            }
            this.f14374attabal.putExtra("androidx.browser.customtabs.extra.ACTIVITY_SIDE_SHEET_BREAKPOINT_DP", i);
            return this;
        }

        public wireman taiyuan(boolean z) {
            this.f14374attabal.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON", !z);
            return this;
        }

        public wireman triweekly(boolean z) {
            this.f14382taiyuan = z;
            return this;
        }

        public wireman wireman(Bitmap bitmap) {
            this.f14374attabal.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", bitmap);
            return this;
        }

        public wireman(apical apicalVar) {
            if (apicalVar != null) {
                kowloon(apicalVar);
            }
        }
    }
}
