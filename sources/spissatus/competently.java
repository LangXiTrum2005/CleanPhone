package spissatus;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import gelandelaufer.cutely;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: FileStore.java */
/* JADX INFO: loaded from: classes3.dex */
public class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f38036attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final File f38037beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final File f38038competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final File f38039dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final File f38040marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final File f38041saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final File f38042wireman;

    public competently(Context context) {
        String str;
        String strWireman = cutely.f26651attabal.marial(context).wireman();
        this.f38036attabal = strWireman;
        File filesDir = context.getFilesDir();
        this.f38041saneness = filesDir;
        if (rotuma()) {
            str = ".crashlytics.v3" + File.separator + gintrap(strWireman);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File fileMolybdenite = molybdenite(new File(filesDir, str));
        this.f38039dern = fileMolybdenite;
        this.f38042wireman = molybdenite(new File(fileMolybdenite, "open-sessions"));
        this.f38040marial = molybdenite(new File(fileMolybdenite, "reports"));
        this.f38037beachfront = molybdenite(new File(fileMolybdenite, "priority-reports"));
        this.f38038competently = molybdenite(new File(fileMolybdenite, "native-reports"));
    }

    public static boolean adultoid(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                adultoid(file2);
            }
        }
        return file.delete();
    }

    public static <T> List<T> dovishness(T[] tArr) {
        return tArr == null ? Collections.EMPTY_LIST : Arrays.asList(tArr);
    }

    public static String gintrap(String str) {
        return str.length() > 40 ? CommonUtils.cuirassed(str) : str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    public static File graveside(File file) {
        file.mkdirs();
        return file;
    }

    public static synchronized File molybdenite(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                gelandelaufer.competently.beachfront().saneness("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                gelandelaufer.competently.beachfront().wireman("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        } catch (Throwable th) {
            throw th;
        }
    }

    public File apical(String str) {
        return graveside(new File(arytenoidectomy(str), "native"));
    }

    public final File arytenoidectomy(String str) {
        return graveside(new File(this.f38042wireman, str));
    }

    public List<String> beachfront() {
        return dovishness(this.f38042wireman.list());
    }

    public File competently(String str) {
        return new File(this.f38039dern, str);
    }

    public List<File> cutely() {
        return dovishness(this.f38038competently.listFiles());
    }

    public final void dern(final String str) {
        String[] list;
        if (!this.f38041saneness.exists() || (list = this.f38041saneness.list(new FilenameFilter() { // from class: spissatus.beachfront
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.startsWith(str);
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            saneness(str2);
        }
    }

    public File formularize(String str) {
        return new File(this.f38037beachfront, str);
    }

    public List<File> impassible() {
        return dovishness(this.f38037beachfront.listFiles());
    }

    public List<File> impromptu(FilenameFilter filenameFilter) {
        return dovishness(this.f38039dern.listFiles(filenameFilter));
    }

    public List<File> kowloon() {
        return dovishness(this.f38040marial.listFiles());
    }

    public boolean marial(String str) {
        return adultoid(new File(this.f38042wireman, str));
    }

    public File monoploid(String str, String str2) {
        return new File(arytenoidectomy(str), str2);
    }

    public List<File> polloi(String str, FilenameFilter filenameFilter) {
        return dovishness(arytenoidectomy(str).listFiles(filenameFilter));
    }

    public final boolean rotuma() {
        return !this.f38036attabal.isEmpty();
    }

    public final void saneness(String str) {
        File file = new File(this.f38041saneness, str);
        if (file.exists() && adultoid(file)) {
            gelandelaufer.competently.beachfront().saneness("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    public File taiyuan(String str) {
        return new File(this.f38038competently, str);
    }

    public File triweekly(String str) {
        return new File(this.f38040marial, str);
    }

    public void wireman() {
        saneness(".com.google.firebase.crashlytics");
        saneness(".com.google.firebase.crashlytics-ndk");
        if (rotuma()) {
            saneness(".com.google.firebase.crashlytics.files.v1");
            dern(".com.google.firebase.crashlytics.files.v2" + File.pathSeparator);
        }
    }
}
