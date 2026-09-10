package com.bumptech.glide.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: compiled from: ExceptionPassthroughInputStream.java */
/* JADX INFO: loaded from: classes2.dex */
public final class wireman extends InputStream {

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final Queue<wireman> f17945monoploid = formularize.competently(0);

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public IOException f17946arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public InputStream f17947kowloon;

    public static wireman saneness(InputStream inputStream) {
        wireman wiremanVarPoll;
        Queue<wireman> queue = f17945monoploid;
        synchronized (queue) {
            wiremanVarPoll = queue.poll();
        }
        if (wiremanVarPoll == null) {
            wiremanVarPoll = new wireman();
        }
        wiremanVarPoll.dern(inputStream);
        return wiremanVarPoll;
    }

    public IOException attabal() {
        return this.f17946arytenoidectomy;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f17947kowloon.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f17947kowloon.close();
    }

    public void dern(InputStream inputStream) {
        this.f17947kowloon = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f17947kowloon.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f17947kowloon.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f17947kowloon.read();
        } catch (IOException e) {
            this.f17946arytenoidectomy = e;
            throw e;
        }
    }

    public void release() {
        this.f17946arytenoidectomy = null;
        this.f17947kowloon = null;
        Queue<wireman> queue = f17945monoploid;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f17947kowloon.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        try {
            return this.f17947kowloon.skip(j);
        } catch (IOException e) {
            this.f17946arytenoidectomy = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f17947kowloon.read(bArr);
        } catch (IOException e) {
            this.f17946arytenoidectomy = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f17947kowloon.read(bArr, i, i2);
        } catch (IOException e) {
            this.f17946arytenoidectomy = e;
            throw e;
        }
    }
}
