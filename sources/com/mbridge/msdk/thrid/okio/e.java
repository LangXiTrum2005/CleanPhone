package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface e extends s, ReadableByteChannel {
    long a(byte b10) throws IOException;

    c a();

    String a(Charset charset) throws IOException;

    boolean a(long j10, f fVar) throws IOException;

    f b(long j10) throws IOException;

    String c() throws IOException;

    byte[] c(long j10) throws IOException;

    String d(long j10) throws IOException;

    int e() throws IOException;

    void e(long j10) throws IOException;

    boolean f() throws IOException;

    short g() throws IOException;

    long i() throws IOException;

    InputStream j();

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    void skip(long j10) throws IOException;
}
