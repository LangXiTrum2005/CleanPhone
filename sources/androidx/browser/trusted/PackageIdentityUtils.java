package androidx.browser.trusted;

import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
class PackageIdentityUtils {

    public static class Api28Implementation implements SignaturesCompat {
        @Override // androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat
        public final boolean a(PackageManager packageManager, String str) {
            throw null;
        }
    }

    public static class Pre28Implementation implements SignaturesCompat {
        @Override // androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat
        public final boolean a(PackageManager packageManager, String str) {
            throw null;
        }
    }

    public interface SignaturesCompat {
        boolean a(PackageManager packageManager, String str);
    }
}
