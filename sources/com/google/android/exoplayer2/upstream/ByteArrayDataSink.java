package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class ByteArrayDataSink implements DataSink {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ByteArrayOutputStream f18733a;

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public final void a(DataSpec dataSpec) {
        long j = dataSpec.g;
        if (j == -1) {
            this.f18733a = new ByteArrayOutputStream();
        } else {
            Assertions.b(j <= 2147483647L);
            this.f18733a = new ByteArrayOutputStream((int) j);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public final void close() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = this.f18733a;
        int i2 = Util.f18979a;
        byteArrayOutputStream.close();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public final void write(byte[] bArr, int i2, int i3) {
        ByteArrayOutputStream byteArrayOutputStream = this.f18733a;
        int i4 = Util.f18979a;
        byteArrayOutputStream.write(bArr, i2, i3);
    }
}
