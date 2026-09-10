package androidx.media3.common.text;

import android.os.Bundle;
import android.text.Spanned;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes.dex */
final class CustomSpanBundler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f5616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f5617c;
    public static final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f5618e;

    static {
        int i2 = Util.f5683a;
        f5615a = Integer.toString(0, 36);
        f5616b = Integer.toString(1, 36);
        f5617c = Integer.toString(2, 36);
        d = Integer.toString(3, 36);
        f5618e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, LanguageFeatureSpan languageFeatureSpan, int i2, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f5615a, spanned.getSpanStart(languageFeatureSpan));
        bundle2.putInt(f5616b, spanned.getSpanEnd(languageFeatureSpan));
        bundle2.putInt(f5617c, spanned.getSpanFlags(languageFeatureSpan));
        bundle2.putInt(d, i2);
        if (bundle != null) {
            bundle2.putBundle(f5618e, bundle);
        }
        return bundle2;
    }
}
