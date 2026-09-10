package graunch;

import com.ironsource.X3;
import duvetyn.adultoid;
import duvetyn.dovishness;
import duvetyn.sealless;
import duvetyn.supplicat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\bf\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\r¨\u0006\u001b"}, d2 = {"Lgraunch/attabal;", "", "Ljava/io/File;", X3.i.b, "Lduvetyn/supplicat;", "source", "(Ljava/io/File;)Lduvetyn/supplicat;", "Lduvetyn/sealless;", "sink", "(Ljava/io/File;)Lduvetyn/sealless;", "appendingSink", "", "delete", "(Ljava/io/File;)V", "", "exists", "(Ljava/io/File;)Z", "", "size", "(Ljava/io/File;)J", "from", "to", "rename", "(Ljava/io/File;Ljava/io/File;)V", "directory", "deleteContents", "attabal", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f27425attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final attabal f27424saneness = new Companion.C0626attabal();

    /* JADX INFO: renamed from: graunch.attabal$attabal, reason: collision with other inner class name and from kotlin metadata */
    /* JADX INFO: compiled from: FileSystem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\b"}, d2 = {"Lgraunch/attabal$attabal;", "", "<init>", "()V", "Lgraunch/attabal;", "SYSTEM", "Lgraunch/attabal;", "attabal", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ Companion f27425attabal = new Companion();

        /* JADX INFO: renamed from: graunch.attabal$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FileSystem.kt */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lgraunch/attabal$attabal$attabal;", "Lgraunch/attabal;", "<init>", "()V", "Ljava/io/File;", X3.i.b, "Lduvetyn/supplicat;", "source", "(Ljava/io/File;)Lduvetyn/supplicat;", "Lduvetyn/sealless;", "sink", "(Ljava/io/File;)Lduvetyn/sealless;", "appendingSink", "", "delete", "(Ljava/io/File;)V", "", "exists", "(Ljava/io/File;)Z", "", "size", "(Ljava/io/File;)J", "from", "to", "rename", "(Ljava/io/File;Ljava/io/File;)V", "directory", "deleteContents", "", "toString", "()Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class C0626attabal implements attabal {
            @Override // graunch.attabal
            public sealless appendingSink(File file) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    return adultoid.attabal(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return adultoid.attabal(file);
                }
            }

            @Override // graunch.attabal
            public void delete(File file) throws IOException {
                Intrinsics.checkNotNullParameter(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException(Intrinsics.arytenoidectomy("failed to delete ", file));
                }
            }

            @Override // graunch.attabal
            public void deleteContents(File directory) throws IOException {
                Intrinsics.checkNotNullParameter(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException(Intrinsics.arytenoidectomy("not a readable directory: ", directory));
                }
                int length = fileArrListFiles.length;
                int i = 0;
                while (i < length) {
                    File file = fileArrListFiles[i];
                    i++;
                    if (file.isDirectory()) {
                        Intrinsics.checkNotNullExpressionValue(file, "file");
                        deleteContents(file);
                    }
                    if (!file.delete()) {
                        throw new IOException(Intrinsics.arytenoidectomy("failed to delete ", file));
                    }
                }
            }

            @Override // graunch.attabal
            public boolean exists(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.exists();
            }

            @Override // graunch.attabal
            public void rename(File from, File to) throws IOException {
                Intrinsics.checkNotNullParameter(from, "from");
                Intrinsics.checkNotNullParameter(to, "to");
                delete(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // graunch.attabal
            public sealless sink(File file) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    return dovishness.competently(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return dovishness.competently(file, false, 1, null);
                }
            }

            @Override // graunch.attabal
            public long size(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.length();
            }

            @Override // graunch.attabal
            public supplicat source(File file) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(file, "file");
                return adultoid.cutely(file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }
    }

    sealless appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File directory) throws IOException;

    boolean exists(File file);

    void rename(File from, File to) throws IOException;

    sealless sink(File file) throws FileNotFoundException;

    long size(File file);

    supplicat source(File file) throws FileNotFoundException;
}
