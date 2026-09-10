package com.smartdigimkt.d4;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class e {
    private e() {
    }

    public static void a(MediaFormat mediaFormat, String str, String str2) {
        mediaFormat.setString(str, str2);
    }

    public static void a(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer(android.support.v4.media.a.h(i2, "csd-"), ByteBuffer.wrap(list.get(i2)));
        }
    }

    public static void a(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public static void a(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void a(MediaFormat mediaFormat, com.smartdigimkt.q4.b bVar) {
        if (bVar != null) {
            a(mediaFormat, "color-transfer", bVar.f37890c);
            a(mediaFormat, "color-standard", bVar.f37888a);
            a(mediaFormat, "color-range", bVar.f37889b);
            a(mediaFormat, "hdr-static-info", bVar.d);
        }
    }
}
