package id;

import com.mbridge.msdk.foundation.download.Command;
import d5.u;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import md.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends HttpsURLConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f42993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpsURLConnection f42994b;

    public d(HttpsURLConnection httpsURLConnection, h hVar, gd.f fVar) {
        super(httpsURLConnection.getURL());
        this.f42994b = httpsURLConnection;
        this.f42993a = new e(httpsURLConnection, hVar, fVar);
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.f42993a.f42996a.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() throws IOException {
        this.f42993a.a();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        e eVar = this.f42993a;
        gd.f fVar = eVar.f42997b;
        fVar.i(eVar.f43000e.b());
        fVar.b();
        eVar.f42996a.disconnect();
    }

    public final boolean equals(Object obj) {
        return this.f42993a.f42996a.equals(obj);
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.f42993a.f42996a.getAllowUserInteraction();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final String getCipherSuite() {
        return this.f42994b.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.f42993a.f42996a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final Object getContent() {
        return this.f42993a.b();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        e eVar = this.f42993a;
        eVar.i();
        return eVar.f42996a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        e eVar = this.f42993a;
        eVar.i();
        return eVar.f42996a.getContentLength();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        e eVar = this.f42993a;
        eVar.i();
        return eVar.f42996a.getContentLengthLong();
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        e eVar = this.f42993a;
        eVar.i();
        return eVar.f42996a.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        e eVar = this.f42993a;
        eVar.i();
        return eVar.f42996a.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.f42993a.f42996a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.f42993a.f42996a.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.f42993a.f42996a.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        return this.f42993a.d();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        e eVar = this.f42993a;
        eVar.i();
        return eVar.f42996a.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i10) {
        e eVar = this.f42993a;
        eVar.i();
        return eVar.f42996a.getHeaderField(i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j10) {
        e eVar = this.f42993a;
        eVar.i();
        return eVar.f42996a.getHeaderFieldDate(str, j10);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i10) {
        e eVar = this.f42993a;
        eVar.i();
        return eVar.f42996a.getHeaderFieldInt(str, i10);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i10) {
        e eVar = this.f42993a;
        eVar.i();
        return eVar.f42996a.getHeaderFieldKey(i10);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j10) {
        e eVar = this.f42993a;
        eVar.i();
        return eVar.f42996a.getHeaderFieldLong(str, j10);
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        e eVar = this.f42993a;
        eVar.i();
        return eVar.f42996a.getHeaderFields();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final HostnameVerifier getHostnameVerifier() {
        return this.f42994b.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.f42993a.f42996a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return this.f42993a.e();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.f42993a.f42996a.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        e eVar = this.f42993a;
        eVar.i();
        return eVar.f42996a.getLastModified();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getLocalCertificates() {
        return this.f42994b.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getLocalPrincipal() {
        return this.f42994b.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.f42993a.f();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getPeerPrincipal() {
        return this.f42994b.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() throws IOException {
        e eVar = this.f42993a;
        gd.f fVar = eVar.f42997b;
        try {
            return eVar.f42996a.getPermission();
        } catch (IOException e10) {
            u.s(eVar.f43000e, fVar, fVar);
            throw e10;
        }
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.f42993a.f42996a.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.f42993a.f42996a.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        return this.f42993a.f42996a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.f42993a.f42996a.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.f42993a.g();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return this.f42993a.h();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final SSLSocketFactory getSSLSocketFactory() {
        return this.f42994b.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getServerCertificates() {
        return this.f42994b.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.f42993a.f42996a.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.f42993a.f42996a.getUseCaches();
    }

    public final int hashCode() {
        return this.f42993a.f42996a.hashCode();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z10) {
        this.f42993a.f42996a.setAllowUserInteraction(z10);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i10) {
        this.f42993a.f42996a.setChunkedStreamingMode(i10);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i10) {
        this.f42993a.f42996a.setConnectTimeout(i10);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z10) {
        this.f42993a.f42996a.setDefaultUseCaches(z10);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z10) {
        this.f42993a.f42996a.setDoInput(z10);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z10) {
        this.f42993a.f42996a.setDoOutput(z10);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i10) {
        this.f42993a.f42996a.setFixedLengthStreamingMode(i10);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f42994b.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j10) {
        this.f42993a.f42996a.setIfModifiedSince(j10);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z10) {
        this.f42993a.f42996a.setInstanceFollowRedirects(z10);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i10) {
        this.f42993a.f42996a.setReadTimeout(i10);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) throws ProtocolException {
        this.f42993a.f42996a.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        e eVar = this.f42993a;
        eVar.getClass();
        if (Command.HTTP_HEADER_USER_AGENT.equalsIgnoreCase(str)) {
            eVar.f42997b.f41860f = str2;
        }
        eVar.f42996a.setRequestProperty(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f42994b.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z10) {
        this.f42993a.f42996a.setUseCaches(z10);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.f42993a.f42996a.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.f42993a.f42996a.usingProxy();
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) {
        return this.f42993a.c(clsArr);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        e eVar = this.f42993a;
        eVar.i();
        return eVar.f42996a.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j10) {
        this.f42993a.f42996a.setFixedLengthStreamingMode(j10);
    }
}
