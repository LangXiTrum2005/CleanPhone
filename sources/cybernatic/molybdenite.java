package cybernatic;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: ExtractorUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class molybdenite {
    @Pure
    public static void attabal(boolean z, String str) throws ParserException {
        if (!z) {
            throw ParserException.createForMalformedContainer(str, null);
        }
    }

    public static int dern(monoploid monoploidVar, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int iSaneness = monoploidVar.saneness(bArr, i + i3, i2 - i3);
            if (iSaneness == -1) {
                break;
            }
            i3 += iSaneness;
        }
        return i3;
    }

    public static boolean marial(monoploid monoploidVar, int i) throws IOException {
        try {
            monoploidVar.skipFully(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean saneness(monoploid monoploidVar, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return monoploidVar.peekFully(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static boolean wireman(monoploid monoploidVar, byte[] bArr, int i, int i2) throws IOException {
        try {
            monoploidVar.readFully(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
