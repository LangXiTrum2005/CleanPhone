package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* JADX INFO: compiled from: BenchmarkOperation.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal {

    /* JADX INFO: renamed from: androidx.profileinstaller.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BenchmarkOperation.java */
    public static class C0094attabal {
        public static File attabal(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* JADX INFO: compiled from: BenchmarkOperation.java */
    public static class saneness {
        public static Context attabal(Context context) {
            return context.createDeviceProtectedStorageContext();
        }
    }

    public static boolean attabal(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = attabal(file2) && z;
        }
        return z;
    }

    public static void saneness(Context context, ProfileInstallReceiver.attabal attabalVar) {
        if (attabal(Build.VERSION.SDK_INT >= 34 ? saneness.attabal(context).getCacheDir() : C0094attabal.attabal(saneness.attabal(context)))) {
            attabalVar.attabal(14, null);
        } else {
            attabalVar.attabal(15, null);
        }
    }
}
