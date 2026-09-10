package saneness;

import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class redevelopment {
    public static File attabal(File file, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(TextUtils.isEmpty(str) ? null : saneness(new File(file, str), false), str2);
    }

    public static boolean dern(File file) {
        boolean z;
        if (!file.exists()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            int length = fileArrListFiles.length;
            z = true;
            for (int i = 0; i < length; i++) {
                File file2 = fileArrListFiles[i];
                z = file2 != null && dern(file2) && z;
            }
        } else {
            z = true;
        }
        return file.delete() && z;
    }

    public static File saneness(File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static boolean wireman(File file, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                IOUtils.closeQuietly(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                IOUtils.closeQuietly(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                IOUtils.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
