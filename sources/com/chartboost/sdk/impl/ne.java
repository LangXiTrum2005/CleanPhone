package com.chartboost.sdk.impl;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f14542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileDescriptor f14543b;

    public ne(RandomAccessFile randomAccessFile) throws IOException {
        Intrinsics.f(randomAccessFile, "randomAccessFile");
        this.f14542a = randomAccessFile;
        FileDescriptor fd = randomAccessFile.getFD();
        Intrinsics.e(fd, "getFD(...)");
        this.f14543b = fd;
    }

    public final void a() throws IOException {
        this.f14542a.close();
    }

    public final FileDescriptor b() {
        return this.f14543b;
    }

    public final long c() {
        return this.f14542a.length();
    }
}
