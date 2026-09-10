package kaif;

import com.google.common.base.formularize;
import com.google.common.collect.ImmutableSet;
import com.google.common.io.FileWriteMode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: Files.java */
/* JADX INFO: loaded from: classes3.dex */
public final class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final reconvict.attabal<File> f29041attabal = new attabal();

    /* JADX INFO: compiled from: Files.java */
    public class attabal implements reconvict.attabal<File> {
    }

    /* JADX INFO: compiled from: Files.java */
    public static final class dern extends kaif.saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final File f29042attabal;

        public /* synthetic */ dern(File file, beachfront beachfrontVar) {
            this(file);
        }

        @Override // kaif.saneness
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public FileInputStream saneness() throws IOException {
            return new FileInputStream(this.f29042attabal);
        }

        public String toString() {
            return "Files.asByteSource(" + this.f29042attabal + ")";
        }

        public dern(File file) {
            this.f29042attabal = (File) formularize.triweekly(file);
        }
    }

    /* JADX INFO: compiled from: Files.java */
    public static final class saneness extends kaif.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final File f29043attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final ImmutableSet<FileWriteMode> f29044saneness;

        public /* synthetic */ saneness(File file, FileWriteMode[] fileWriteModeArr, beachfront beachfrontVar) {
            this(file, fileWriteModeArr);
        }

        @Override // kaif.attabal
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public FileOutputStream attabal() throws IOException {
            return new FileOutputStream(this.f29043attabal, this.f29044saneness.contains(FileWriteMode.APPEND));
        }

        public String toString() {
            return "Files.asByteSink(" + this.f29043attabal + ", " + this.f29044saneness + ")";
        }

        public saneness(File file, FileWriteMode... fileWriteModeArr) {
            this.f29043attabal = (File) formularize.triweekly(file);
            this.f29044saneness = ImmutableSet.copyOf(fileWriteModeArr);
        }
    }

    public static kaif.attabal attabal(File file, FileWriteMode... fileWriteModeArr) {
        return new saneness(file, fileWriteModeArr, null);
    }

    public static void beachfront(byte[] bArr, File file) throws Throwable {
        attabal(file, new FileWriteMode[0]).saneness(bArr);
    }

    public static void dern(File file, File file2) throws Throwable {
        formularize.apical(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        saneness(file).attabal(attabal(file2, new FileWriteMode[0]));
    }

    public static void marial(File file, File file2) throws Throwable {
        formularize.triweekly(file);
        formularize.triweekly(file2);
        formularize.apical(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (file.renameTo(file2)) {
            return;
        }
        dern(file, file2);
        if (file.delete()) {
            return;
        }
        if (file2.delete()) {
            throw new IOException("Unable to delete " + file);
        }
        throw new IOException("Unable to delete " + file2);
    }

    public static kaif.saneness saneness(File file) {
        return new dern(file, null);
    }

    public static void wireman(File file) throws IOException {
        formularize.triweekly(file);
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        throw new IOException("Unable to create parent directories of " + file);
    }
}
