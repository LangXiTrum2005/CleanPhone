package com.google.android.exoplayer2.offline;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public interface DownloadCursor extends Closeable {
    Download W();

    int getPosition();

    default boolean moveToNext() {
        return moveToPosition(getPosition() + 1);
    }

    boolean moveToPosition(int i2);
}
