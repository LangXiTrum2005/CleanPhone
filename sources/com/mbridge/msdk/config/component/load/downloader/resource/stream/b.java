package com.mbridge.msdk.config.component.load.downloader.resource.stream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BufferedOutputStream f32245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileDescriptor f32246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RandomAccessFile f32247c;

    public b(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.f32247c = randomAccessFile;
        this.f32246b = randomAccessFile.getFD();
        this.f32245a = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void close() throws IOException {
        this.f32245a.close();
        this.f32247c.close();
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void flushAndSync() throws IOException {
        this.f32245a.flush();
        this.f32246b.sync();
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void seek(long j10) throws IOException {
        this.f32247c.seek(j10);
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.resource.stream.a
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f32245a.write(bArr, i10, i11);
    }
}
