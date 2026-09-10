package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class CustomTabColorSchemeParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f3688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f3689b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f3690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f3691b;
    }

    public CustomTabColorSchemeParams(Integer num, Integer num2) {
        this.f3688a = num;
        this.f3689b = num2;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f3688a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f3689b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        return bundle;
    }
}
