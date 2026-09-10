package androidx.profileinstaller;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
class BenchmarkOperation {

    public static class Api21ContextHelper {
    }

    public static class Api24ContextHelper {
    }

    public static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : fileArrListFiles) {
            z2 = a(file2) && z2;
        }
        return z2;
    }
}
