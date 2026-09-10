package com.google.android.exoplayer2;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class BundleListRetriever extends Binder {
    public static final int X;

    static {
        X = Util.f18979a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
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
