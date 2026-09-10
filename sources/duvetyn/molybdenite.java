package duvetyn;

import com.ironsource.X3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JvmSystemFileSystem.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u0018J\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\u0016*\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020\u0016*\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lduvetyn/molybdenite;", "Lduvetyn/cutely;", "<init>", "()V", "Lduvetyn/cord;", "path", "Lduvetyn/taiyuan;", "impromptu", "(Lduvetyn/cord;)Lduvetyn/taiyuan;", X3.i.b, "Lduvetyn/impromptu;", "taiyuan", "(Lduvetyn/cord;)Lduvetyn/impromptu;", "", "mustCreate", "mustExist", "apical", "(Lduvetyn/cord;ZZ)Lduvetyn/impromptu;", "Lduvetyn/supplicat;", "formularize", "(Lduvetyn/cord;)Lduvetyn/supplicat;", "dir", "", "wireman", "(Lduvetyn/cord;Z)V", "source", "target", "attabal", "(Lduvetyn/cord;Lduvetyn/cord;)V", "beachfront", "", "toString", "()Ljava/lang/String;", "triweekly", "(Lduvetyn/cord;)V", "impassible", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class molybdenite extends cutely {
    @Override // duvetyn.cutely
    public impromptu apical(cord file, boolean mustCreate, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (mustCreate && mustExist) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        if (mustCreate) {
            impassible(file);
        }
        if (mustExist) {
            triweekly(file);
        }
        return new polloi(true, new RandomAccessFile(file.toFile(), "rw"));
    }

    @Override // duvetyn.cutely
    public void attabal(cord source, cord target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // duvetyn.cutely
    public void beachfront(cord path, boolean mustExist) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (mustExist) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // duvetyn.cutely
    public supplicat formularize(cord file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return adultoid.cutely(file.toFile());
    }

    public final void impassible(cord cordVar) throws IOException {
        if (competently(cordVar)) {
            throw new IOException(cordVar + " already exists.");
        }
    }

    @Override // duvetyn.cutely
    public taiyuan impromptu(cord path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new taiyuan(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // duvetyn.cutely
    public impromptu taiyuan(cord file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new polloi(false, new RandomAccessFile(file.toFile(), "r"));
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    public final void triweekly(cord cordVar) throws IOException {
        if (competently(cordVar)) {
            return;
        }
        throw new IOException(cordVar + " doesn't exist.");
    }

    @Override // duvetyn.cutely
    public void wireman(cord dir, boolean mustCreate) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        taiyuan taiyuanVarImpromptu = impromptu(dir);
        if (taiyuanVarImpromptu == null || !taiyuanVarImpromptu.getIsDirectory()) {
            throw new IOException("failed to create directory: " + dir);
        }
        if (mustCreate) {
            throw new IOException(dir + " already exists.");
        }
    }
}
