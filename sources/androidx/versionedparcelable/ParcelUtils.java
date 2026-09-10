package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: loaded from: classes.dex */
public class ParcelUtils {
    public static VersionedParcelable a(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(MediaSessionCompat.KEY_SESSION2_TOKEN);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(ParcelUtils.class.getClassLoader());
            Parcelable parcelable = bundle2.getParcelable("a");
            if (parcelable instanceof ParcelImpl) {
                return ((ParcelImpl) parcelable).X;
            }
            throw new IllegalArgumentException("Invalid parcel");
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
