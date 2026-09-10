package androidx.core.util;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class AtomicFile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f4404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f4405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f4406c;

    public AtomicFile(File file) {
        this.f4404a = file;
        this.f4405b = new File(file.getPath() + ".new");
        this.f4406c = new File(file.getPath() + ".bak");
    }

    public static void c(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public final void a(FileOutputStream fileOutputStream) {
        boolean z2;
        if (fileOutputStream == null) {
            return;
        }
        try {
            fileOutputStream.getFD().sync();
            z2 = true;
        } catch (IOException unused) {
            z2 = false;
        }
        if (!z2) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e2) {
            Log.e("AtomicFile", "Failed to close file output stream", e2);
        }
        File file = this.f4405b;
        if (file.delete()) {
            return;
        }
        Log.e("AtomicFile", "Failed to delete new file " + file);
    }

    public final void b(FileOutputStream fileOutputStream) {
        boolean z2;
        if (fileOutputStream == null) {
            return;
        }
        try {
            fileOutputStream.getFD().sync();
            z2 = true;
        } catch (IOException unused) {
            z2 = false;
        }
        if (!z2) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e2) {
            Log.e("AtomicFile", "Failed to close file output stream", e2);
        }
        c(this.f4405b, this.f4404a);
    }

    public final FileOutputStream d() throws IOException {
        File file = this.f4405b;
        File file2 = this.f4406c;
        if (file2.exists()) {
            c(file2, this.f4404a);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + file);
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e2) {
                throw new IOException("Failed to create new file " + file, e2);
            }
        }
    }
}
