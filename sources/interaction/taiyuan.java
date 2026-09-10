package interaction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import p002kotlin.Metadata;
import p002kotlin.io.FileAlreadyExistsException;
import p002kotlin.io.FileSystemException;
import p002kotlin.io.NoSuchFileException;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f\"\u0015\u0010\u0012\u001a\u00020\r*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Ljava/io/File;", "target", "", "overwrite", "", "bufferSize", "molybdenite", "(Ljava/io/File;Ljava/io/File;ZI)Ljava/io/File;", "adultoid", "(Ljava/io/File;)Z", "relative", "gintrap", "(Ljava/io/File;Ljava/io/File;)Ljava/io/File;", "", "rotuma", "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;", "dovishness", "(Ljava/io/File;)Ljava/lang/String;", "extension", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/io/FilesKt")
public class taiyuan extends impromptu {
    public static boolean adultoid(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        while (true) {
            boolean z = true;
            for (File file2 : impromptu.monoploid(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static String dovishness(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return StringsKt.osteal(name, '.', "");
    }

    public static final File gintrap(File file, File relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        if (marial.saneness(relative)) {
            return relative;
        }
        String string = file.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (string.length() != 0) {
            char c = File.separatorChar;
            if (!StringsKt.permissivist(string, c, false, 2, null)) {
                return new File(string + c + relative);
            }
        }
        return new File(string + relative);
    }

    public static /* synthetic */ File graveside(File file, File file2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return molybdenite(file, file2, z, i);
    }

    public static final File molybdenite(File file, File target, boolean z, int i) throws FileSystemException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z) {
                throw new FileAlreadyExistsException(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new FileAlreadyExistsException(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (target.mkdirs()) {
                return target;
            }
            throw new FileSystemException(file, target, "Failed to create target directory.");
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                attabal.attabal(fileInputStream, fileOutputStream, i);
                saneness.attabal(fileOutputStream, null);
                saneness.attabal(fileInputStream, null);
                return target;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    saneness.attabal(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                saneness.attabal(fileInputStream, th3);
                throw th4;
            }
        }
    }

    public static File rotuma(File file, String relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        return gintrap(file, new File(relative));
    }
}
