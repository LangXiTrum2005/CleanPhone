package hk;

import b2.z;
import com.applovin.shadow.okio.Segment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.n;
import qk.i0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k extends r9.b {
    public static void T(File file, File target) {
        n.f(target, "target");
        if (!file.exists()) {
            throw new b(file, null, "The source file doesn't exist.");
        }
        if (target.exists() && !target.delete()) {
            throw new b(file, target, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file.isDirectory()) {
            if (!target.mkdirs()) {
                throw new z(file, target, "Failed to create target directory.");
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
                no.b.g(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    i0.j(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                i0.j(fileInputStream, th4);
                throw th5;
            }
        }
    }

    public static boolean U(File file) {
        g gVar = new g(new i(file, j.f42399b));
        while (true) {
            boolean z10 = true;
            while (gVar.hasNext()) {
                File file2 = (File) gVar.next();
                if (file2.delete() || !file2.exists()) {
                    if (z10) {
                    }
                }
                z10 = false;
            }
            return z10;
        }
    }

    public static String V(File file) throws IOException {
        Charset charset = an.a.f3768a;
        n.f(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strP = t9.e.p(inputStreamReader);
            inputStreamReader.close();
            return strP;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(inputStreamReader, th2);
                throw th3;
            }
        }
    }

    public static void W(File file, byte[] array) throws IOException {
        n.f(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                i0.j(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static final void X(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        n.f(charset, "charset");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            n.e(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(Segment.SIZE);
        n.c(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(Segment.SIZE * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        n.e(byteBufferAllocate, "allocate(...)");
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            int iMin = Math.min(8192 - i11, str.length() - i10);
            int i12 = i10 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            n.e(cArrArray, "array(...)");
            str.getChars(i10, i12, cArrArray, i11);
            charBufferAllocate.limit(iMin + i11);
            i11 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i12 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i11 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i10 = i12;
        }
    }
}
