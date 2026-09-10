package micrococcus;

import android.content.Context;
import android.os.Environment;
import java.io.File;

/* JADX INFO: compiled from: DiskFileUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {
    public static File attabal(Context context) {
        File externalCacheDir;
        if (dern.attabal() && (externalCacheDir = context.getExternalCacheDir()) != null) {
            return externalCacheDir;
        }
        return new File(Environment.getExternalStorageDirectory().getPath() + ("/Android/data/" + context.getPackageName() + "/cache/"));
    }
}
