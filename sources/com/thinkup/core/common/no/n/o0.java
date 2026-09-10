package com.thinkup.core.common.no.n;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
public interface o0 extends oom, WritableByteChannel {
    @Override // com.thinkup.core.common.no.n.oom, java.io.Flushable
    void flush();

    o0 m(String str);

    o0 m(String str, int i2, int i3);

    o0 m(String str, int i2, int i3, Charset charset);

    o0 m(String str, Charset charset);

    o0 m0(int i2);

    o0 mm(int i2);

    o0 mn(int i2);

    o0 mo(int i2);

    n n();

    o0 n(byte[] bArr, int i2, int i3);

    o0 n0(int i2);

    o0 nm(long j);

    o0 nn(long j);

    o0 no(int i2);

    long o(oon oonVar);

    o0 o(oon oonVar, long j);

    o0 o0(om omVar);

    o0 o0(byte[] bArr);

    o0 o00(long j);

    o0 o0o(long j);

    o0 om();

    o0 omn();

    OutputStream oo();
}
