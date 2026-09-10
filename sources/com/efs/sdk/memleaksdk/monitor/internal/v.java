package com.efs.sdk.memleaksdk.monitor.internal;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface v extends Closeable {
    long b(l lVar, long j) throws IOException;

    void close() throws IOException;
}
