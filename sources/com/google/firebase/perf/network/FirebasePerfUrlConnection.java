package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import gd.f;
import id.c;
import id.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import ld.g;
import md.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebasePerfUrlConnection {
    @Keep
    public static Object getContent(URL url) throws IOException {
        g gVar = g.f45301s;
        h hVar = new h();
        hVar.d();
        long j10 = hVar.f45967a;
        f fVar = new f(gVar);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new d((HttpsURLConnection) uRLConnectionOpenConnection, hVar, fVar).f42993a.b();
            }
            return uRLConnectionOpenConnection instanceof HttpURLConnection ? new c((HttpURLConnection) uRLConnectionOpenConnection, hVar, fVar).f42992a.b() : uRLConnectionOpenConnection.getContent();
        } catch (IOException e10) {
            fVar.f(j10);
            fVar.i(hVar.b());
            fVar.j(url.toString());
            id.g.c(fVar);
            throw e10;
        }
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new d((HttpsURLConnection) obj, new h(), new f(g.f45301s));
        }
        return obj instanceof HttpURLConnection ? new c((HttpURLConnection) obj, new h(), new f(g.f45301s)) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        g gVar = g.f45301s;
        h hVar = new h();
        if (!gVar.f45304c.get()) {
            return url.openConnection().getInputStream();
        }
        hVar.d();
        long j10 = hVar.f45967a;
        f fVar = new f(gVar);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new d((HttpsURLConnection) uRLConnectionOpenConnection, hVar, fVar).f42993a.e();
            }
            return uRLConnectionOpenConnection instanceof HttpURLConnection ? new c((HttpURLConnection) uRLConnectionOpenConnection, hVar, fVar).f42992a.e() : uRLConnectionOpenConnection.getInputStream();
        } catch (IOException e10) {
            fVar.f(j10);
            fVar.i(hVar.b());
            fVar.j(url.toString());
            id.g.c(fVar);
            throw e10;
        }
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        g gVar = g.f45301s;
        h hVar = new h();
        hVar.d();
        long j10 = hVar.f45967a;
        f fVar = new f(gVar);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new d((HttpsURLConnection) uRLConnectionOpenConnection, hVar, fVar).f42993a.c(clsArr);
            }
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                return new c((HttpURLConnection) uRLConnectionOpenConnection, hVar, fVar).f42992a.c(clsArr);
            }
            return uRLConnectionOpenConnection.getContent(clsArr);
        } catch (IOException e10) {
            fVar.f(j10);
            fVar.i(hVar.b());
            fVar.j(url.toString());
            id.g.c(fVar);
            throw e10;
        }
    }
}
