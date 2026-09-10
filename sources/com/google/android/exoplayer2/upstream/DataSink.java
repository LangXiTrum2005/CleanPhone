package com.google.android.exoplayer2.upstream;

/* JADX INFO: loaded from: classes3.dex */
public interface DataSink {

    public interface Factory {
    }

    void a(DataSpec dataSpec);

    void close();

    void write(byte[] bArr, int i2, int i3);
}
