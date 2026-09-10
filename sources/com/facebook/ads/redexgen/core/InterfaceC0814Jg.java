package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public interface InterfaceC0814Jg {
    boolean AD7(C0812Je c0812Je);

    HttpURLConnection AFt(String str, Proxy proxy) throws IOException;

    InputStream AFu(HttpURLConnection httpURLConnection) throws IOException;

    OutputStream AFv(HttpURLConnection httpURLConnection) throws IOException;

    void AGE(HttpURLConnection httpURLConnection, EnumC0810Jc enumC0810Jc, String str) throws IOException;

    byte[] AGb(InputStream inputStream) throws IOException;

    void AKD(OutputStream outputStream, byte[] bArr) throws IOException;
}
