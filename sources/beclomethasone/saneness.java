package beclomethasone;

import android.net.Uri;
import com.ironsource.X3;

/* JADX INFO: compiled from: MediaStoreUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class saneness {
    public static boolean attabal(Uri uri) {
        return dern(uri) && uri.getPathSegments().contains("picker");
    }

    public static boolean beachfront(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    public static boolean dern(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && X3.i.I0.equals(uri.getAuthority());
    }

    public static boolean marial(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    public static boolean saneness(Uri uri) {
        return dern(uri) && !beachfront(uri);
    }

    public static boolean wireman(Uri uri) {
        return dern(uri) && beachfront(uri);
    }
}
