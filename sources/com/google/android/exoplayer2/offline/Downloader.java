package com.google.android.exoplayer2.offline;

/* JADX INFO: loaded from: classes3.dex */
public interface Downloader {

    public interface ProgressListener {
    }

    void a(ProgressListener progressListener);

    void cancel();

    void remove();
}
