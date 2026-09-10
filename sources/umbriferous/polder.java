package umbriferous;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: NativeSessionFileGzipper.java */
/* JADX INFO: loaded from: classes3.dex */
public class polder {
    public static void attabal(InputStream inputStream, File file) throws Throwable {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        gZIPOutputStream2.finish();
                        CommonUtils.competently(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, i);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    CommonUtils.competently(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void saneness(File file, List<merc> list) {
        for (merc mercVar : list) {
            InputStream stream = null;
            try {
                stream = mercVar.getStream();
                if (stream != null) {
                    attabal(stream, new File(file, mercVar.saneness()));
                }
            } catch (IOException unused) {
            } finally {
                CommonUtils.competently(null);
            }
        }
    }
}
