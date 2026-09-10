package id;

import com.ironsource.C0375hc;
import d5.u;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import md.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final fd.a f42995f = fd.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f42996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gd.f f42997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f42998c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f42999d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f43000e;

    public e(HttpURLConnection httpURLConnection, h hVar, gd.f fVar) {
        this.f42996a = httpURLConnection;
        this.f42997b = fVar;
        this.f43000e = hVar;
        fVar.j(httpURLConnection.getURL().toString());
    }

    public final void a() throws IOException {
        long j10 = this.f42998c;
        gd.f fVar = this.f42997b;
        h hVar = this.f43000e;
        if (j10 == -1) {
            hVar.d();
            long j11 = hVar.f45967a;
            this.f42998c = j11;
            fVar.f(j11);
        }
        try {
            this.f42996a.connect();
        } catch (IOException e10) {
            u.s(hVar, fVar, fVar);
            throw e10;
        }
    }

    public final Object b() throws IOException {
        h hVar = this.f43000e;
        i();
        HttpURLConnection httpURLConnection = this.f42996a;
        int responseCode = httpURLConnection.getResponseCode();
        gd.f fVar = this.f42997b;
        fVar.d(responseCode);
        try {
            Object content = httpURLConnection.getContent();
            if (content instanceof InputStream) {
                fVar.g(httpURLConnection.getContentType());
                return new a((InputStream) content, fVar, hVar);
            }
            fVar.g(httpURLConnection.getContentType());
            fVar.h(httpURLConnection.getContentLength());
            fVar.i(hVar.b());
            fVar.b();
            return content;
        } catch (IOException e10) {
            u.s(hVar, fVar, fVar);
            throw e10;
        }
    }

    public final Object c(Class[] clsArr) throws IOException {
        h hVar = this.f43000e;
        i();
        HttpURLConnection httpURLConnection = this.f42996a;
        int responseCode = httpURLConnection.getResponseCode();
        gd.f fVar = this.f42997b;
        fVar.d(responseCode);
        try {
            Object content = httpURLConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                fVar.g(httpURLConnection.getContentType());
                return new a((InputStream) content, fVar, hVar);
            }
            fVar.g(httpURLConnection.getContentType());
            fVar.h(httpURLConnection.getContentLength());
            fVar.i(hVar.b());
            fVar.b();
            return content;
        } catch (IOException e10) {
            u.s(hVar, fVar, fVar);
            throw e10;
        }
    }

    public final InputStream d() {
        HttpURLConnection httpURLConnection = this.f42996a;
        gd.f fVar = this.f42997b;
        i();
        try {
            fVar.d(httpURLConnection.getResponseCode());
        } catch (IOException unused) {
            f42995f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        return errorStream != null ? new a(errorStream, fVar, this.f43000e) : errorStream;
    }

    public final InputStream e() throws IOException {
        h hVar = this.f43000e;
        i();
        HttpURLConnection httpURLConnection = this.f42996a;
        int responseCode = httpURLConnection.getResponseCode();
        gd.f fVar = this.f42997b;
        fVar.d(responseCode);
        fVar.g(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            return inputStream != null ? new a(inputStream, fVar, hVar) : inputStream;
        } catch (IOException e10) {
            u.s(hVar, fVar, fVar);
            throw e10;
        }
    }

    public final boolean equals(Object obj) {
        return this.f42996a.equals(obj);
    }

    public final OutputStream f() throws IOException {
        h hVar = this.f43000e;
        gd.f fVar = this.f42997b;
        try {
            OutputStream outputStream = this.f42996a.getOutputStream();
            return outputStream != null ? new b(outputStream, fVar, hVar) : outputStream;
        } catch (IOException e10) {
            u.s(hVar, fVar, fVar);
            throw e10;
        }
    }

    public final int g() throws IOException {
        i();
        long j10 = this.f42999d;
        h hVar = this.f43000e;
        gd.f fVar = this.f42997b;
        if (j10 == -1) {
            long jB = hVar.b();
            this.f42999d = jB;
            fVar.f41858d.y(jB);
        }
        try {
            int responseCode = this.f42996a.getResponseCode();
            fVar.d(responseCode);
            return responseCode;
        } catch (IOException e10) {
            u.s(hVar, fVar, fVar);
            throw e10;
        }
    }

    public final String h() throws IOException {
        HttpURLConnection httpURLConnection = this.f42996a;
        i();
        long j10 = this.f42999d;
        h hVar = this.f43000e;
        gd.f fVar = this.f42997b;
        if (j10 == -1) {
            long jB = hVar.b();
            this.f42999d = jB;
            fVar.f41858d.y(jB);
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            fVar.d(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e10) {
            u.s(hVar, fVar, fVar);
            throw e10;
        }
    }

    public final int hashCode() {
        return this.f42996a.hashCode();
    }

    public final void i() {
        long j10 = this.f42998c;
        gd.f fVar = this.f42997b;
        if (j10 == -1) {
            h hVar = this.f43000e;
            hVar.d();
            long j11 = hVar.f45967a;
            this.f42998c = j11;
            fVar.f(j11);
        }
        HttpURLConnection httpURLConnection = this.f42996a;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            fVar.c(requestMethod);
        } else if (httpURLConnection.getDoOutput()) {
            fVar.c(C0375hc.f28789b);
        } else {
            fVar.c(C0375hc.f28788a);
        }
    }

    public final String toString() {
        return this.f42996a.toString();
    }
}
