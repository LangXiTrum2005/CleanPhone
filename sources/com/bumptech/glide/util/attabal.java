package com.bumptech.glide.util;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ByteBufferUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final AtomicReference<byte[]> f17918attabal = new AtomicReference<>();

    /* JADX INFO: compiled from: ByteBufferUtil.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f17921attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final byte[] f17922dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f17923saneness;

        public saneness(byte[] bArr, int i, int i2) {
            this.f17922dern = bArr;
            this.f17921attabal = i;
            this.f17923saneness = i2;
        }
    }

    public static ByteBuffer attabal(File file) throws Throwable {
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

    public static void beachfront(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        wireman(byteBuffer);
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

    public static InputStream competently(ByteBuffer byteBuffer) {
        return new C0180attabal(byteBuffer);
    }

    public static saneness dern(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new saneness(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    public static byte[] marial(ByteBuffer byteBuffer) {
        saneness sanenessVarDern = dern(byteBuffer);
        if (sanenessVarDern != null && sanenessVarDern.f17921attabal == 0 && sanenessVarDern.f17923saneness == sanenessVarDern.f17922dern.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        wireman(byteBufferAsReadOnlyBuffer);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static ByteBuffer saneness(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = f17918attabal.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i = inputStream.read(andSet);
            if (i < 0) {
                f17918attabal.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return wireman(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(andSet, 0, i);
        }
    }

    public static ByteBuffer wireman(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    /* JADX INFO: renamed from: com.bumptech.glide.util.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ByteBufferUtil.java */
    public static class C0180attabal extends InputStream {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public int f17919arytenoidectomy = -1;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final ByteBuffer f17920kowloon;

        public C0180attabal(ByteBuffer byteBuffer) {
            this.f17920kowloon = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f17920kowloon.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i) {
            this.f17919arytenoidectomy = this.f17920kowloon.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f17920kowloon.hasRemaining()) {
                return this.f17920kowloon.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i = this.f17919arytenoidectomy;
            if (i == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f17920kowloon.position(i);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (!this.f17920kowloon.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j, available());
            ByteBuffer byteBuffer = this.f17920kowloon;
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            if (!this.f17920kowloon.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i2, available());
            this.f17920kowloon.get(bArr, i, iMin);
            return iMin;
        }
    }
}
