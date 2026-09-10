package overassessment;

import android.content.Context;
import androidx.work.apical;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: WorkDatabasePathHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final String f34899attabal = apical.beachfront("WrkDbPathHelper");

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final String[] f34900saneness = {"-journal", "-shm", "-wal"};

    public static File attabal(Context context) {
        return dern(context, "androidx.work.workdb");
    }

    public static Map<File, File> beachfront(Context context) {
        HashMap map = new HashMap();
        File fileSaneness = saneness(context);
        File fileAttabal = attabal(context);
        map.put(fileSaneness, fileAttabal);
        for (String str : f34900saneness) {
            map.put(new File(fileSaneness.getPath() + str), new File(fileAttabal.getPath() + str));
        }
        return map;
    }

    public static File dern(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    public static void marial(Context context) {
        if (saneness(context).exists()) {
            apical.dern().attabal(f34899attabal, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            Map<File, File> mapBeachfront = beachfront(context);
            for (File file : mapBeachfront.keySet()) {
                File file2 = mapBeachfront.get(file);
                if (file.exists() && file2 != null) {
                    if (file2.exists()) {
                        apical.dern().impromptu(f34899attabal, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                    }
                    apical.dern().attabal(f34899attabal, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
                }
            }
        }
    }

    public static File saneness(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    public static String wireman() {
        return "androidx.work.workdb";
    }
}
