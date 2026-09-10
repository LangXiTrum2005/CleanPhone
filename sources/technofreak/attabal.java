package technofreak;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: AtomicFile.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final File f38668attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final File f38669dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final File f38670saneness;

    public attabal(File file) {
        this.f38668attabal = file;
        this.f38670saneness = new File(file.getPath() + ".new");
        this.f38669dern = new File(file.getPath() + ".bak");
    }

    public static void dern(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            file2.toString();
        }
        if (file.renameTo(file2)) {
            return;
        }
        file.toString();
        file2.toString();
    }

    public static boolean marial(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void attabal(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        marial(fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (IOException unused) {
        }
        if (this.f38670saneness.delete()) {
            return;
        }
        Objects.toString(this.f38670saneness);
    }

    public void saneness(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        marial(fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (IOException unused) {
        }
        dern(this.f38670saneness, this.f38668attabal);
    }

    public FileOutputStream wireman() throws IOException {
        if (this.f38669dern.exists()) {
            dern(this.f38669dern, this.f38668attabal);
        }
        try {
            return new FileOutputStream(this.f38670saneness);
        } catch (FileNotFoundException unused) {
            if (!this.f38670saneness.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + this.f38670saneness);
            }
            try {
                return new FileOutputStream(this.f38670saneness);
            } catch (FileNotFoundException e) {
                throw new IOException("Failed to create new file " + this.f38670saneness, e);
            }
        }
    }
}
