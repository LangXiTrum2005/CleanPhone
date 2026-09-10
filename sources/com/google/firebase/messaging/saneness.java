package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: compiled from: ByteStreams.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness {
    public static byte[] attabal(Queue<byte[]> queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArrRemove = queue.remove();
        if (bArrRemove.length == i) {
            return bArrRemove;
        }
        int length = i - bArrRemove.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArrRemove, i);
        while (length > 0) {
            byte[] bArrRemove2 = queue.remove();
            int iMin = Math.min(length, bArrRemove2.length);
            System.arraycopy(bArrRemove2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static int dern(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static byte[] marial(InputStream inputStream, Queue<byte[]> queue, int i) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(i) * 2));
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = inputStream.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return attabal(queue, i);
                }
                i2 += i3;
                i += i3;
            }
            iMin = dern(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return attabal(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static InputStream saneness(InputStream inputStream, long j) {
        return new attabal(inputStream, j);
    }

    public static byte[] wireman(InputStream inputStream) throws IOException {
        return marial(inputStream, new ArrayDeque(20), 0);
    }

    /* JADX INFO: compiled from: ByteStreams.java */
    public static final class attabal extends FilterInputStream {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public long f22742arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public long f22743kowloon;

        public attabal(InputStream inputStream, long j) {
            super(inputStream);
            this.f22742arytenoidectomy = -1L;
            this.f22743kowloon = j;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f22743kowloon);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i) {
            ((FilterInputStream) this).in.mark(i);
            this.f22742arytenoidectomy = this.f22743kowloon;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f22743kowloon == 0) {
                return -1;
            }
            int i = ((FilterInputStream) this).in.read();
            if (i != -1) {
                this.f22743kowloon--;
            }
            return i;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f22742arytenoidectomy == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f22743kowloon = this.f22742arytenoidectomy;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.f22743kowloon));
            this.f22743kowloon -= jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            long j = this.f22743kowloon;
            if (j == 0) {
                return -1;
            }
            int i3 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
            if (i3 != -1) {
                this.f22743kowloon -= (long) i3;
            }
            return i3;
        }
    }
}
