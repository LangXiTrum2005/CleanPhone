package u;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.SparseArray;
import m0.d0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f51632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne.a f51633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActivityOptions f51634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SparseArray f51635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle f51636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f51638g;

    public h() {
        this.f51632a = new Intent("android.intent.action.VIEW");
        this.f51633b = new ne.a(29);
        this.f51637f = 0;
        this.f51638g = true;
    }

    public final i a() {
        Intent intent = this.f51632a;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f51638g);
        this.f51633b.getClass();
        intent.putExtras(new Bundle());
        Bundle bundle2 = this.f51636e;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        if (this.f51635d != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f51635d);
            intent.putExtras(bundle3);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f51637f);
        int i10 = Build.VERSION.SDK_INT;
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i10 >= 34) {
            if (this.f51634c == null) {
                this.f51634c = ActivityOptions.makeBasic();
            }
            d0.i(this.f51634c);
        }
        if (i10 >= 36) {
            if (this.f51634c == null) {
                this.f51634c = ActivityOptions.makeBasic();
            }
            n0.c.f(this.f51634c, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        ActivityOptions activityOptions = this.f51634c;
        return new i(intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public h(l lVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f51632a = intent;
        this.f51633b = new ne.a(29);
        this.f51637f = 0;
        this.f51638g = true;
        if (lVar != null) {
            intent.setPackage(lVar.f51644d.getPackageName());
            f fVar = lVar.f51643c;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", fVar);
            intent.putExtras(bundle);
        }
    }
}
