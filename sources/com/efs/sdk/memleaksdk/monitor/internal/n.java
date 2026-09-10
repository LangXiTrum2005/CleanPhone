package com.efs.sdk.memleaksdk.monitor.internal;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public interface n extends v, ReadableByteChannel {
    long a(byte b) throws IOException;

    String a(long j) throws IOException;

    String a(long j, Charset charset) throws IOException;

    boolean b() throws IOException;

    byte[] b(long j) throws IOException;

    byte c() throws IOException;

    void c(long j) throws IOException;

    short d() throws IOException;

    int e() throws IOException;

    long f() throws IOException;
}
