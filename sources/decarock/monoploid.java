package decarock;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: MediaFormatUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class monoploid {
    public static void attabal(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void dern(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    public static void marial(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap(list.get(i)));
        }
    }

    public static void saneness(MediaFormat mediaFormat, androidx.media3.common.impromptu impromptuVar) {
        if (impromptuVar != null) {
            wireman(mediaFormat, "color-transfer", impromptuVar.f10969dern);
            wireman(mediaFormat, "color-standard", impromptuVar.f10966attabal);
            wireman(mediaFormat, "color-range", impromptuVar.f10971saneness);
            attabal(mediaFormat, "hdr-static-info", impromptuVar.f10972wireman);
        }
    }

    public static void wireman(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }
}
