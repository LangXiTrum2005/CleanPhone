package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC2266gA {
    boolean ADs(C2264g8 c2264g8);

    HttpURLConnection AGl(String str, Proxy proxy) throws IOException;

    InputStream AGm(HttpURLConnection httpURLConnection) throws IOException;

    OutputStream AGn(HttpURLConnection httpURLConnection) throws IOException;

    void AH6(HttpURLConnection httpURLConnection, EnumC2262g6 enumC2262g6, String str) throws IOException;

    byte[] AHT(InputStream inputStream) throws IOException;

    void AL8(OutputStream outputStream, byte[] bArr) throws IOException;
}
