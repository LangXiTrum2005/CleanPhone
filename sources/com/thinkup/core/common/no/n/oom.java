package com.thinkup.core.common.no.n;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes6.dex */
public interface oom extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    om0 o();

    void o(n nVar, long j);
}
