package com.smartdigimkt.n4;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public interface h {

    public interface a {
        h a();
    }

    int a(byte[] bArr, int i2, int i3) throws IOException;

    long a(k kVar) throws IOException;

    Uri c();

    void close() throws IOException;
}
