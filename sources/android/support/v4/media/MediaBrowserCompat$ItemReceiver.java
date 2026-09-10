package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import e.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends d {
    @Override // e.d
    public final void a(int i10, Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(android.support.v4.media.session.a.class.getClassLoader());
        }
        if (i10 != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
