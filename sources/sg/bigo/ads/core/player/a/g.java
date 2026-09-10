package sg.bigo.ads.core.player.a;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    HttpURLConnection f48763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    InputStream f48764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f48765c;

    public g(String str) {
        this.f48765c = str;
    }

    public final int a(byte[] bArr) {
        StringBuilder sb;
        String str;
        InputStream inputStream = this.f48764b;
        if (inputStream == null) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error reading data from " + this.f48765c + ": connection is absent!");
            return 0;
        }
        try {
            return inputStream.read(bArr, 0, bArr.length);
        } catch (InterruptedIOException e2) {
            e = e2;
            sb = new StringBuilder("Reading source ");
            sb.append(this.f48765c);
            str = " is interrupted, error message is : ";
            sb.append(str);
            sb.append(e.toString());
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", sb.toString());
            return 0;
        } catch (IOException e3) {
            e = e3;
            sb = new StringBuilder("Error reading data from ");
            sb.append(this.f48765c);
            str = ", error message is : ";
            sb.append(str);
            sb.append(e.toString());
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", sb.toString());
            return 0;
        }
    }

    public final HttpURLConnection b() {
        HttpURLConnection httpURLConnection;
        String headerField = this.f48765c;
        HttpURLConnection httpURLConnection2 = null;
        int i2 = 0;
        while (true) {
            try {
                sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Open connection  to " + headerField);
                httpURLConnection = (HttpURLConnection) new URL(headerField).openConnection();
                if (httpURLConnection == null) {
                    break;
                }
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    boolean z2 = responseCode == 301 || responseCode == 302 || responseCode == 303;
                    if (z2) {
                        headerField = httpURLConnection.getHeaderField("Location");
                        i2++;
                        httpURLConnection.disconnect();
                    }
                    if (i2 > 5) {
                        sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Too many redirects: ".concat(String.valueOf(i2)));
                    }
                    if (!z2) {
                        break;
                    }
                    httpURLConnection2 = httpURLConnection;
                } catch (IOException e2) {
                    e = e2;
                    httpURLConnection2 = httpURLConnection;
                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "PingHttpUrlSource#openConnection, error message is : " + e.toString());
                    return httpURLConnection2;
                }
            } catch (IOException e3) {
                e = e3;
            }
        }
        return httpURLConnection;
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.f48763a;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (ArrayIndexOutOfBoundsException e2) {
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error closing connection correctly, the error message is : " + e2.toString());
            } catch (IllegalArgumentException e3) {
                e = e3;
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", "connection disconnect error..., the error message is : " + e.toString());
            } catch (NullPointerException e4) {
                e = e4;
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", "connection disconnect error..., the error message is : " + e.toString());
            }
        }
    }
}
