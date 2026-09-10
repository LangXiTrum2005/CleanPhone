package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import d5.u;
import gd.f;
import java.io.IOException;
import ld.g;
import md.h;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebasePerfHttpClient {
    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        h hVar = new h();
        f fVar = new f(g.f45301s);
        try {
            fVar.j(httpUriRequest.getURI().toString());
            fVar.c(httpUriRequest.getMethod());
            Long lA = id.g.a(httpUriRequest);
            if (lA != null) {
                fVar.e(lA.longValue());
            }
            hVar.d();
            fVar.f(hVar.f45967a);
            return (T) httpClient.execute(httpUriRequest, new id.f(responseHandler, hVar, fVar));
        } catch (IOException e10) {
            u.s(hVar, fVar, fVar);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        h.e();
        long jA = h.a();
        f fVar = new f(g.f45301s);
        try {
            fVar.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            fVar.c(httpRequest.getRequestLine().getMethod());
            Long lA = id.g.a(httpRequest);
            if (lA != null) {
                fVar.e(lA.longValue());
            }
            long jE = h.e();
            jA = h.a();
            fVar.f(jE);
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest);
            h.e();
            fVar.i(h.a() - jA);
            fVar.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = id.g.a(httpResponseExecute);
            if (lA2 != null) {
                fVar.h(lA2.longValue());
            }
            String strB = id.g.b(httpResponseExecute);
            if (strB != null) {
                fVar.g(strB);
            }
            fVar.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            h.e();
            fVar.i(h.a() - jA);
            id.g.c(fVar);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        h.e();
        long jA = h.a();
        f fVar = new f(g.f45301s);
        try {
            fVar.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            fVar.c(httpRequest.getRequestLine().getMethod());
            Long lA = id.g.a(httpRequest);
            if (lA != null) {
                fVar.e(lA.longValue());
            }
            long jE = h.e();
            jA = h.a();
            fVar.f(jE);
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest, httpContext);
            h.e();
            fVar.i(h.a() - jA);
            fVar.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = id.g.a(httpResponseExecute);
            if (lA2 != null) {
                fVar.h(lA2.longValue());
            }
            String strB = id.g.b(httpResponseExecute);
            if (strB != null) {
                fVar.g(strB);
            }
            fVar.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            h.e();
            fVar.i(h.a() - jA);
            id.g.c(fVar);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        h.e();
        long jA = h.a();
        f fVar = new f(g.f45301s);
        try {
            fVar.j(httpUriRequest.getURI().toString());
            fVar.c(httpUriRequest.getMethod());
            Long lA = id.g.a(httpUriRequest);
            if (lA != null) {
                fVar.e(lA.longValue());
            }
            long jE = h.e();
            jA = h.a();
            fVar.f(jE);
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest);
            h.e();
            fVar.i(h.a() - jA);
            fVar.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = id.g.a(httpResponseExecute);
            if (lA2 != null) {
                fVar.h(lA2.longValue());
            }
            String strB = id.g.b(httpResponseExecute);
            if (strB != null) {
                fVar.g(strB);
            }
            fVar.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            h.e();
            fVar.i(h.a() - jA);
            id.g.c(fVar);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        h.e();
        long jA = h.a();
        f fVar = new f(g.f45301s);
        try {
            fVar.j(httpUriRequest.getURI().toString());
            fVar.c(httpUriRequest.getMethod());
            Long lA = id.g.a(httpUriRequest);
            if (lA != null) {
                fVar.e(lA.longValue());
            }
            long jE = h.e();
            jA = h.a();
            fVar.f(jE);
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest, httpContext);
            h.e();
            fVar.i(h.a() - jA);
            fVar.d(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = id.g.a(httpResponseExecute);
            if (lA2 != null) {
                fVar.h(lA2.longValue());
            }
            String strB = id.g.b(httpResponseExecute);
            if (strB != null) {
                fVar.g(strB);
            }
            fVar.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            h.e();
            fVar.i(h.a() - jA);
            id.g.c(fVar);
            throw e10;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        h hVar = new h();
        f fVar = new f(g.f45301s);
        try {
            fVar.j(httpUriRequest.getURI().toString());
            fVar.c(httpUriRequest.getMethod());
            Long lA = id.g.a(httpUriRequest);
            if (lA != null) {
                fVar.e(lA.longValue());
            }
            hVar.d();
            fVar.f(hVar.f45967a);
            return (T) httpClient.execute(httpUriRequest, new id.f(responseHandler, hVar, fVar), httpContext);
        } catch (IOException e10) {
            u.s(hVar, fVar, fVar);
            throw e10;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        h hVar = new h();
        f fVar = new f(g.f45301s);
        try {
            fVar.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            fVar.c(httpRequest.getRequestLine().getMethod());
            Long lA = id.g.a(httpRequest);
            if (lA != null) {
                fVar.e(lA.longValue());
            }
            hVar.d();
            fVar.f(hVar.f45967a);
            return (T) httpClient.execute(httpHost, httpRequest, new id.f(responseHandler, hVar, fVar));
        } catch (IOException e10) {
            u.s(hVar, fVar, fVar);
            throw e10;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        h hVar = new h();
        f fVar = new f(g.f45301s);
        try {
            fVar.j(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            fVar.c(httpRequest.getRequestLine().getMethod());
            Long lA = id.g.a(httpRequest);
            if (lA != null) {
                fVar.e(lA.longValue());
            }
            hVar.d();
            fVar.f(hVar.f45967a);
            return (T) httpClient.execute(httpHost, httpRequest, new id.f(responseHandler, hVar, fVar), httpContext);
        } catch (IOException e10) {
            u.s(hVar, fVar, fVar);
            throw e10;
        }
    }
}
