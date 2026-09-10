package com.badlogic.gdx.utils;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class StreamUtils {
    public static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final byte[] EMPTY_BYTES = new byte[0];

    public static class OptimizedByteArrayOutputStream extends ByteArrayOutputStream {
        public OptimizedByteArrayOutputStream(int i) {
            super(i);
        }

        public byte[] getBuffer() {
            return ((ByteArrayOutputStream) this).buf;
        }

        @Override // java.io.ByteArrayOutputStream
        public synchronized byte[] toByteArray() {
            int i = ((ByteArrayOutputStream) this).count;
            byte[] bArr = ((ByteArrayOutputStream) this).buf;
            if (i == bArr.length) {
                return bArr;
            }
            return super.toByteArray();
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void copyStream(InputStream inputStream, OutputStream outputStream) throws IOException {
        copyStream(inputStream, outputStream, new byte[4096]);
    }

    public static byte[] copyStreamToByteArray(InputStream inputStream) throws IOException {
        return copyStreamToByteArray(inputStream, inputStream.available());
    }

    public static String copyStreamToString(InputStream inputStream) throws IOException {
        return copyStreamToString(inputStream, inputStream.available(), null);
    }

    public static void copyStream(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        copyStream(inputStream, outputStream, new byte[i]);
    }

    public static byte[] copyStreamToByteArray(InputStream inputStream, int i) throws IOException {
        OptimizedByteArrayOutputStream optimizedByteArrayOutputStream = new OptimizedByteArrayOutputStream(Math.max(0, i));
        copyStream(inputStream, optimizedByteArrayOutputStream);
        return optimizedByteArrayOutputStream.toByteArray();
    }

    public static String copyStreamToString(InputStream inputStream, int i) throws IOException {
        return copyStreamToString(inputStream, i, null);
    }

    public static void copyStream(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static String copyStreamToString(InputStream inputStream, int i, @Null String str) throws IOException {
        InputStreamReader inputStreamReader = str == null ? new InputStreamReader(inputStream) : new InputStreamReader(inputStream, str);
        StringWriter stringWriter = new StringWriter(Math.max(0, i));
        char[] cArr = new char[4096];
        while (true) {
            int i2 = inputStreamReader.read(cArr);
            if (i2 != -1) {
                stringWriter.write(cArr, 0, i2);
            } else {
                return stringWriter.toString();
            }
        }
    }

    public static void copyStream(InputStream inputStream, ByteBuffer byteBuffer) throws IOException {
        copyStream(inputStream, byteBuffer, new byte[4096]);
    }

    public static void copyStream(InputStream inputStream, ByteBuffer byteBuffer, int i) throws IOException {
        copyStream(inputStream, byteBuffer, new byte[i]);
    }

    public static int copyStream(InputStream inputStream, ByteBuffer byteBuffer, byte[] bArr) throws IOException {
        int iPosition = byteBuffer.position();
        int i = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 != -1) {
                BufferUtils.copy(bArr, 0, (Buffer) byteBuffer, i2);
                i += i2;
                byteBuffer.position(iPosition + i);
            } else {
                byteBuffer.position(iPosition);
                return i;
            }
        }
    }
}
