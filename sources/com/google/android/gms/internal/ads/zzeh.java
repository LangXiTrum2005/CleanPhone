package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeh {
    public static void zza(MediaFormat mediaFormat, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer(androidx.datastore.preferences.protobuf.a.g(i2, "csd-", new StringBuilder(String.valueOf(i2).length() + 4)), ByteBuffer.wrap((byte[]) list.get(i2)));
        }
    }

    public static void zzb(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }
}
