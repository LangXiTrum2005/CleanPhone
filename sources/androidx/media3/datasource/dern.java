package androidx.media3.datasource;

import android.net.Uri;
import com.google.common.base.impassible;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.common.collect.wostteth;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.services.core.network.model.HttpRequest;
import decarock.grimness;
import decarock.triweekly;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import vir.apical;
import vir.arytenoidectomy;
import vir.competently;
import vir.cutely;

/* JADX INFO: compiled from: DefaultHttpDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public class dern extends vir.attabal implements androidx.media3.datasource.attabal {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final cutely f11434apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public InputStream f11435arytenoidectomy;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final boolean f11436beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final int f11437competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final cutely f11438cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final impassible<String> f11439formularize;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public long f11440graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final boolean f11441impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final int f11442impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public HttpURLConnection f11443kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final boolean f11444marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public long f11445molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public boolean f11446monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int f11447polloi;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final String f11448taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public competently f11449triweekly;

    /* JADX INFO: renamed from: androidx.media3.datasource.dern$dern, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultHttpDataSource.java */
    public static class C0082dern extends wostteth<String, List<String>> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final Map<String, List<String>> f11450kowloon;

        public C0082dern(Map<String, List<String>> map) {
            this.f11450kowloon = map;
        }

        public static /* synthetic */ boolean marial(String str) {
            return str != null;
        }

        public static /* synthetic */ boolean wireman(Map.Entry entry) {
            return entry.getKey() != null;
        }

        @Override // com.google.common.collect.wostteth, java.util.Map
        public boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // com.google.common.collect.wostteth, java.util.Map
        public boolean containsValue(Object obj) {
            return super.standardContainsValue(obj);
        }

        @Override // com.google.common.collect.wostteth, java.util.Map
        /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
        public List<String> get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // com.google.common.collect.wostteth, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return Sets.saneness(super.entrySet(), new impassible() { // from class: vir.impromptu
                @Override // com.google.common.base.impassible
                public final boolean apply(Object obj) {
                    return androidx.media3.datasource.dern.C0082dern.wireman((Map.Entry) obj);
                }
            });
        }

        @Override // com.google.common.collect.wostteth, java.util.Map
        public boolean equals(Object obj) {
            return obj != null && super.standardEquals(obj);
        }

        @Override // com.google.common.collect.wostteth, java.util.Map
        public int hashCode() {
            return super.standardHashCode();
        }

        @Override // com.google.common.collect.wostteth, java.util.Map
        public boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // com.google.common.collect.wostteth, java.util.Map
        public Set<String> keySet() {
            return Sets.saneness(super.keySet(), new impassible() { // from class: vir.taiyuan
                @Override // com.google.common.base.impassible
                public final boolean apply(Object obj) {
                    return androidx.media3.datasource.dern.C0082dern.marial((String) obj);
                }
            });
        }

        @Override // com.google.common.collect.wostteth, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // com.google.common.collect.wostteth, com.google.common.collect.igbo
        /* JADX INFO: renamed from: delegate */
        public Map<String, List<String>> wireman() {
            return this.f11450kowloon;
        }
    }

    /* JADX INFO: compiled from: DefaultHttpDataSource.java */
    public static final class saneness implements androidx.media3.datasource.attabal.InterfaceC0080attabal {

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public boolean f11453competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public impassible<String> f11454dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public boolean f11455impromptu;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public arytenoidectomy f11457saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public boolean f11458taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public String f11459wireman;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final cutely f11451attabal = new cutely();

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f11456marial = 8000;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public int f11452beachfront = 8000;

        @Override // androidx.media3.datasource.attabal.InterfaceC0080attabal
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public dern createDataSource() {
            dern dernVar = new dern(this.f11459wireman, this.f11456marial, this.f11452beachfront, this.f11453competently, this.f11455impromptu, this.f11451attabal, this.f11454dern, this.f11458taiyuan);
            arytenoidectomy arytenoidectomyVar = this.f11457saneness;
            if (arytenoidectomyVar != null) {
                dernVar.dern(arytenoidectomyVar);
            }
            return dernVar;
        }

        public saneness saneness(String str) {
            this.f11459wireman = str;
            return this;
        }
    }

    public static boolean cutely(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    public static void impassible(HttpURLConnection httpURLConnection, long j) {
        if (httpURLConnection == null || grimness.f25080attabal > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = ((Class) decarock.attabal.marial(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    public final HttpURLConnection apical(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionTriweekly = triweekly(url);
        httpURLConnectionTriweekly.setConnectTimeout(this.f11437competently);
        httpURLConnectionTriweekly.setReadTimeout(this.f11442impromptu);
        HashMap map2 = new HashMap();
        cutely cutelyVar = this.f11438cutely;
        if (cutelyVar != null) {
            map2.putAll(cutelyVar.attabal());
        }
        map2.putAll(this.f11434apical.attabal());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionTriweekly.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strAttabal = apical.attabal(j, j2);
        if (strAttabal != null) {
            httpURLConnectionTriweekly.setRequestProperty(Command.HTTP_HEADER_RANGE, strAttabal);
        }
        String str = this.f11448taiyuan;
        if (str != null) {
            httpURLConnectionTriweekly.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, str);
        }
        httpURLConnectionTriweekly.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnectionTriweekly.setInstanceFollowRedirects(z2);
        httpURLConnectionTriweekly.setDoOutput(bArr != null);
        httpURLConnectionTriweekly.setRequestMethod(competently.dern(i));
        if (bArr == null) {
            httpURLConnectionTriweekly.connect();
            return httpURLConnectionTriweekly;
        }
        httpURLConnectionTriweekly.setFixedLengthStreamingMode(bArr.length);
        httpURLConnectionTriweekly.connect();
        OutputStream outputStream = httpURLConnectionTriweekly.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnectionTriweekly;
    }

    public final void arytenoidectomy(long j, competently competentlyVar) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int i = ((InputStream) grimness.impromptu(this.f11435arytenoidectomy)).read(bArr, 0, (int) Math.min(j, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), competentlyVar, 2000, 1);
            }
            if (i == -1) {
                throw new HttpDataSource$HttpDataSourceException(competentlyVar, 2008, 1);
            }
            j -= (long) i;
            wireman(i);
        }
    }

    @Override // androidx.media3.datasource.attabal
    public long attabal(final competently competentlyVar) throws HttpDataSource$HttpDataSourceException {
        byte[] bArrWireman;
        this.f11449triweekly = competentlyVar;
        long j = 0;
        this.f11440graveside = 0L;
        this.f11445molybdenite = 0L;
        beachfront(competentlyVar);
        try {
            HttpURLConnection httpURLConnectionFormularize = formularize(competentlyVar);
            this.f11443kowloon = httpURLConnectionFormularize;
            this.f11447polloi = httpURLConnectionFormularize.getResponseCode();
            String responseMessage = httpURLConnectionFormularize.getResponseMessage();
            int i = this.f11447polloi;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionFormularize.getHeaderFields();
                if (this.f11447polloi == 416) {
                    if (competentlyVar.f39546competently == apical.dern(httpURLConnectionFormularize.getHeaderField("Content-Range"))) {
                        this.f11446monoploid = true;
                        competently(competentlyVar);
                        long j2 = competentlyVar.f39549impromptu;
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionFormularize.getErrorStream();
                try {
                    bArrWireman = errorStream != null ? kaif.dern.wireman(errorStream) : grimness.f25081beachfront;
                } catch (IOException unused) {
                    bArrWireman = grimness.f25081beachfront;
                }
                byte[] bArr = bArrWireman;
                impromptu();
                throw new HttpDataSource$InvalidResponseCodeException(this.f11447polloi, responseMessage, this.f11447polloi == 416 ? new DataSourceException(2008) : null, headerFields, competentlyVar, bArr);
            }
            final String contentType = httpURLConnectionFormularize.getContentType();
            impassible<String> impassibleVar = this.f11439formularize;
            if (impassibleVar != null && !impassibleVar.apply(contentType)) {
                impromptu();
                throw new HttpDataSource$HttpDataSourceException(contentType, competentlyVar) { // from class: androidx.media3.datasource.HttpDataSource$InvalidContentTypeException
                    public final String contentType;

                    {
                        super("Invalid content type: " + contentType, competentlyVar, 2003, 1);
                        this.contentType = contentType;
                    }
                };
            }
            if (this.f11447polloi == 200) {
                long j3 = competentlyVar.f39546competently;
                if (j3 != 0) {
                    j = j3;
                }
            }
            boolean zCutely = cutely(httpURLConnectionFormularize);
            if (zCutely) {
                this.f11445molybdenite = competentlyVar.f39549impromptu;
            } else {
                long j4 = competentlyVar.f39549impromptu;
                if (j4 != -1) {
                    this.f11445molybdenite = j4;
                } else {
                    long jSaneness = apical.saneness(httpURLConnectionFormularize.getHeaderField("Content-Length"), httpURLConnectionFormularize.getHeaderField("Content-Range"));
                    this.f11445molybdenite = jSaneness != -1 ? jSaneness - j : -1L;
                }
            }
            try {
                this.f11435arytenoidectomy = httpURLConnectionFormularize.getInputStream();
                if (zCutely) {
                    this.f11435arytenoidectomy = new GZIPInputStream(this.f11435arytenoidectomy);
                }
                this.f11446monoploid = true;
                competently(competentlyVar);
                try {
                    arytenoidectomy(j, competentlyVar);
                    return this.f11445molybdenite;
                } catch (IOException e) {
                    impromptu();
                    if (e instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e, competentlyVar, 2000, 1);
                }
            } catch (IOException e2) {
                impromptu();
                throw new HttpDataSource$HttpDataSourceException(e2, competentlyVar, 2000, 1);
            }
        } catch (IOException e3) {
            impromptu();
            throw HttpDataSource$HttpDataSourceException.createForIOException(e3, competentlyVar, 1);
        }
    }

    @Override // androidx.media3.datasource.attabal
    public void close() throws HttpDataSource$HttpDataSourceException {
        try {
            InputStream inputStream = this.f11435arytenoidectomy;
            if (inputStream != null) {
                long j = this.f11445molybdenite;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.f11440graveside;
                }
                impassible(this.f11443kowloon, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new HttpDataSource$HttpDataSourceException(e, (competently) grimness.impromptu(this.f11449triweekly), 2000, 3);
                }
            }
            this.f11435arytenoidectomy = null;
            impromptu();
            if (this.f11446monoploid) {
                this.f11446monoploid = false;
                marial();
            }
        } catch (Throwable th) {
            this.f11435arytenoidectomy = null;
            impromptu();
            if (this.f11446monoploid) {
                this.f11446monoploid = false;
                marial();
            }
            throw th;
        }
    }

    public final HttpURLConnection formularize(competently competentlyVar) throws IOException {
        URL url = new URL(competentlyVar.f39544attabal.toString());
        int i = competentlyVar.f39548dern;
        byte[] bArr = competentlyVar.f39553wireman;
        long j = competentlyVar.f39546competently;
        long j2 = competentlyVar.f39549impromptu;
        int i2 = 1;
        boolean zWireman = competentlyVar.wireman(1);
        if (!this.f11444marial && !this.f11436beachfront && !this.f11441impassible) {
            return apical(url, i, bArr, j, j2, zWireman, true, competentlyVar.f39550marial);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 > 20) {
                throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException("Too many redirects: " + i4), competentlyVar, 2001, 1);
            }
            HttpURLConnection httpURLConnectionApical = apical(url, i, bArr, j, j2, zWireman, false, competentlyVar.f39550marial);
            int responseCode = httpURLConnectionApical.getResponseCode();
            String headerField = httpURLConnectionApical.getHeaderField("Location");
            if ((i == i2 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionApical.disconnect();
                url = taiyuan(url, headerField, competentlyVar);
            } else {
                if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionApical;
                }
                httpURLConnectionApical.disconnect();
                if (!this.f11441impassible || responseCode != 302) {
                    bArr = null;
                    i = 1;
                }
                url = taiyuan(url, headerField, competentlyVar);
            }
            i3 = i4;
            i2 = 1;
        }
    }

    @Override // androidx.media3.datasource.attabal
    public Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f11443kowloon;
        return httpURLConnection == null ? ImmutableMap.of() : new C0082dern(httpURLConnection.getHeaderFields());
    }

    @Override // androidx.media3.datasource.attabal
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f11443kowloon;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void impromptu() {
        HttpURLConnection httpURLConnection = this.f11443kowloon;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                triweekly.wireman("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f11443kowloon = null;
        }
    }

    public final int kowloon(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f11445molybdenite;
        if (j != -1) {
            long j2 = j - this.f11440graveside;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int i3 = ((InputStream) grimness.impromptu(this.f11435arytenoidectomy)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.f11440graveside += (long) i3;
        wireman(i3);
        return i3;
    }

    @Override // androidx.media3.common.taiyuan
    public int read(byte[] bArr, int i, int i2) throws HttpDataSource$HttpDataSourceException {
        try {
            return kowloon(bArr, i, i2);
        } catch (IOException e) {
            throw HttpDataSource$HttpDataSourceException.createForIOException(e, (competently) grimness.impromptu(this.f11449triweekly), 2);
        }
    }

    public final URL taiyuan(URL url, String str, competently competentlyVar) throws HttpDataSource$HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource$HttpDataSourceException("Null location redirect", competentlyVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!HttpRequest.DEFAULT_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource$HttpDataSourceException("Unsupported protocol redirect: " + protocol, competentlyVar, 2001, 1);
            }
            if (this.f11444marial || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.f11436beachfront) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e) {
                    throw new HttpDataSource$HttpDataSourceException(e, competentlyVar, 2001, 1);
                }
            }
            throw new HttpDataSource$HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", competentlyVar, 2001, 1);
        } catch (MalformedURLException e2) {
            throw new HttpDataSource$HttpDataSourceException(e2, competentlyVar, 2001, 1);
        }
    }

    public HttpURLConnection triweekly(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    public dern(String str, int i, int i2, boolean z, boolean z2, cutely cutelyVar, impassible<String> impassibleVar, boolean z3) {
        super(true);
        this.f11448taiyuan = str;
        this.f11437competently = i;
        this.f11442impromptu = i2;
        this.f11444marial = z;
        this.f11436beachfront = z2;
        if (z && z2) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.f11438cutely = cutelyVar;
        this.f11439formularize = impassibleVar;
        this.f11434apical = new cutely();
        this.f11441impassible = z3;
    }
}
