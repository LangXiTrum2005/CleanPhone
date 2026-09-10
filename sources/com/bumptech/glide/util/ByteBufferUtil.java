package com.bumptech.glide.util;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ByteBufferUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f12830a = new AtomicReference();

    public static final class SafeArray {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f12834c;

        public SafeArray(byte[] bArr, int i2, int i3) {
            this.f12834c = bArr;
            this.f12832a = i2;
            this.f12833b = i3;
        }
    }

    public static MappedByteBuffer a(File file) throws Throwable {
        Throwable th;
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                    try {
                        channel.close();
                    } catch (IOException unused) {
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                    return mappedByteBufferLoad;
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel = channel;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (randomAccessFile == null) {
                        throw th;
                    }
                    try {
                        randomAccessFile.close();
                        throw th;
                    } catch (IOException unused4) {
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = null;
        }
    }

    public static ByteBuffer b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        AtomicReference atomicReference = f12830a;
        byte[] bArr = (byte[]) atomicReference.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[16384];
        }
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 < 0) {
                atomicReference.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return c(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    public static ByteBuffer c(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    public static byte[] d(ByteBuffer byteBuffer) {
        SafeArray safeArray = (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) ? null : new SafeArray(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        if (safeArray != null && safeArray.f12832a == 0) {
            if (safeArray.f12833b == safeArray.f12834c.length) {
                return byteBuffer.array();
            }
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void e(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        c(byteBuffer);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile.getChannel();
                channel.write(byteBuffer);
                channel.force(false);
                channel.close();
                randomAccessFile.close();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                th = th;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    public static InputStream f(ByteBuffer byteBuffer) {
        return new ByteBufferStream(byteBuffer);
    }

    public static class ByteBufferStream extends InputStream {
        public final ByteBuffer X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f12831Y = -1;

        public ByteBufferStream(ByteBuffer byteBuffer) {
            this.X = byteBuffer;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.X.remaining();
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i2) {
            this.f12831Y = this.X.position();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            ByteBuffer byteBuffer = this.X;
            if (byteBuffer.hasRemaining()) {
                return byteBuffer.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            int i2 = this.f12831Y;
            if (i2 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.X.position(i2);
        }

        @Override // java.io.InputStream
        public final long skip(long j) {
            ByteBuffer byteBuffer = this.X;
            if (!byteBuffer.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j, byteBuffer.remaining());
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i2, int i3) {
            ByteBuffer byteBuffer = this.X;
            if (!byteBuffer.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i3, byteBuffer.remaining());
            byteBuffer.get(bArr, i2, iMin);
            return iMin;
        }
    }
}
