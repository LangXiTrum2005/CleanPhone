package androidx.core.os;

import android.os.Environment;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class EnvironmentCompat {

    public static class Api21Impl {
        public static String a(File file) {
            return Environment.getExternalStorageState(file);
        }
    }
}
