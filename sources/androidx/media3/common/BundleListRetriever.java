package androidx.media3.common;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes.dex */
public final class BundleListRetriever extends Binder {
    static {
        if (Util.f5683a >= 30) {
            IBinder.getSuggestedMaxIpcSizeBytes();
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return super.onTransact(i2, parcel, parcel2, i3);
        }
        if (parcel2 == null) {
            return false;
        }
        throw null;
    }
}
