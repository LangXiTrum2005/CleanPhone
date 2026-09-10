package com.pgl.ssdk;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class r {
    public static q a(RandomAccessFile randomAccessFile, long j, long j2) {
        return a(randomAccessFile.getChannel(), j, j2);
    }

    public static q a(FileChannel fileChannel, long j, long j2) {
        fileChannel.getClass();
        return new m(fileChannel, j, j2);
    }
}
