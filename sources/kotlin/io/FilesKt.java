package kotlin.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"kotlin/io/FilesKt__FilePathComponentsKt", "kotlin/io/FilesKt__FileReadWriteKt", "kotlin/io/FilesKt__FileTreeWalkKt", "kotlin/io/FilesKt__UtilsKt"}, k = 4, mv = {2, 1, 0}, xi = 49)
public final class FilesKt extends FilesKt__UtilsKt {
    public static void b(File file, File target, int i2) throws IOException {
        boolean z2 = (i2 & 2) == 0;
        Intrinsics.f(file, "<this>");
        Intrinsics.f(target, "target");
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.");
        }
        if (target.exists()) {
            if (!z2) {
                throw new FileAlreadyExistsException(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new FileAlreadyExistsException(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (!target.mkdirs()) {
                throw new FileSystemException(file, target, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                ByteStreamsKt.a(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.a(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.a(fileInputStream, th3);
                throw th4;
            }
        }
    }

    public static byte[] c(File file) throws IOException {
        Intrinsics.f(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i2 = (int) length;
            byte[] bArrCopyOf = new byte[i2];
            int i3 = i2;
            int i4 = 0;
            while (i3 > 0) {
                int i5 = fileInputStream.read(bArrCopyOf, i4, i3);
                if (i5 < 0) {
                    break;
                }
                i3 -= i5;
                i4 += i5;
            }
            if (i3 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i4);
                Intrinsics.e(bArrCopyOf, "copyOf(...)");
            } else {
                int i6 = fileInputStream.read();
                if (i6 != -1) {
                    ExposingBufferByteArrayOutputStream exposingBufferByteArrayOutputStream = new ExposingBufferByteArrayOutputStream(8193);
                    exposingBufferByteArrayOutputStream.write(i6);
                    ByteStreamsKt.a(fileInputStream, exposingBufferByteArrayOutputStream);
                    int size = exposingBufferByteArrayOutputStream.size() + i2;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrD = exposingBufferByteArrayOutputStream.d();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    Intrinsics.e(bArrCopyOf, "copyOf(...)");
                    ArraysKt.m(i2, 0, exposingBufferByteArrayOutputStream.size(), bArrD, bArrCopyOf);
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static String d(File file, Charset charset) throws IOException {
        Intrinsics.f(file, "<this>");
        Intrinsics.f(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strB = TextStreamsKt.b(inputStreamReader);
            inputStreamReader.close();
            return strB;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.a(inputStreamReader, th);
                throw th2;
            }
        }
    }

    public static File e(File file, String str) {
        int length;
        int iU;
        File file2 = new File(str);
        String path = file2.getPath();
        Intrinsics.e(path, "getPath(...)");
        char c2 = File.separatorChar;
        int iU2 = StringsKt.u(path, c2, 0, 4);
        if (iU2 == 0) {
            if (path.length() <= 1 || path.charAt(1) != c2 || (iU = StringsKt.u(path, c2, 2, 4)) < 0) {
                length = 1;
            } else {
                int iU3 = StringsKt.u(path, c2, iU + 1, 4);
                length = iU3 >= 0 ? iU3 + 1 : path.length();
            }
        } else if (iU2 <= 0 || path.charAt(iU2 - 1) != ':') {
            length = (iU2 == -1 && StringsKt.q(path, AbstractJsonLexerKt.COLON)) ? path.length() : 0;
        } else {
            length = iU2 + 1;
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        Intrinsics.e(string, "toString(...)");
        if ((string.length() == 0) || StringsKt.q(string, c2)) {
            return new File(string + file2);
        }
        return new File(string + c2 + file2);
    }

    public static FileTreeWalk f(File file) {
        FileWalkDirection fileWalkDirection = FileWalkDirection.X;
        Intrinsics.f(file, "<this>");
        return new FileTreeWalk(file, fileWalkDirection);
    }

    public static void g(File file, String text, Charset charset) {
        Intrinsics.f(file, "<this>");
        Intrinsics.f(text, "text");
        Intrinsics.f(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            FilesKt__FileReadWriteKt.a(fileOutputStream, text, charset);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.a(fileOutputStream, th);
                throw th2;
            }
        }
    }
}
