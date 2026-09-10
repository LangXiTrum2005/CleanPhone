package gondola;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes2.dex */
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Charset f27390attabal = Charset.forName(C.ASCII_NAME);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Charset f27391saneness = Charset.forName(C.UTF8_NAME);

    public static void attabal(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void saneness(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                saneness(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}
