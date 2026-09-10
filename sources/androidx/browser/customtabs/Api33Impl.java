package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
class Api33Impl {
    public static <T> T a(Bundle bundle, String str, Class<T> cls) {
        return (T) bundle.getParcelable(str, cls);
    }
}
