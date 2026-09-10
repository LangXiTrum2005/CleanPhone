package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.badlogic.gdx.net.HttpResponseHeader;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.aB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2974aB implements InterfaceC3551gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3742iy f4113a;
    public final int b;
    public HttpURLConnection c;
    public InputStream d;
    public volatile boolean e;

    public C2974aB(C3742iy c3742iy, int i) {
        this.f4113a = c3742iy;
        this.b = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final Class a() {
        return InputStream.class;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void b() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void c(IV iv, InterfaceC3463fl interfaceC3463fl) {
        C3742iy c3742iy = this.f4113a;
        int i = AbstractC4653tJ.f5029a;
        SystemClock.elapsedRealtimeNanos();
        try {
            interfaceC3463fl.k(d(c3742iy.d(), 0, null, c3742iy.b.getHeaders()));
        } catch (IOException e) {
            interfaceC3463fl.d(e);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final void cancel() {
        this.e = true;
    }

    public final InputStream d(URL url, int i, URL url2, Map map) throws C3124bu {
        int responseCode;
        int responseCode2 = -1;
        if (i >= 5) {
            throw new C3124bu(-1, "Too many (> 5) redirects!", (IOException) null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new C3124bu(-1, "In re-direct loop", (IOException) null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int i2 = this.b;
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.d = this.c.getInputStream();
                if (this.e) {
                    return null;
                }
                try {
                    responseCode = this.c.getResponseCode();
                } catch (IOException unused2) {
                    responseCode = -1;
                }
                int i3 = responseCode / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.d = new C2675Pj(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                httpURLConnection2.getContentEncoding();
                            }
                            this.d = httpURLConnection2.getInputStream();
                        }
                        return this.d;
                    } catch (IOException e) {
                        try {
                            responseCode2 = httpURLConnection2.getResponseCode();
                        } catch (IOException unused3) {
                        }
                        throw new C3124bu(responseCode2, "Failed to obtain InputStream", e);
                    }
                }
                if (i3 != 3) {
                    if (responseCode == -1) {
                        throw new C3124bu(responseCode, 0);
                    }
                    try {
                        throw new C3124bu(responseCode, this.c.getResponseMessage(), (IOException) null);
                    } catch (IOException e2) {
                        throw new C3124bu(responseCode, "Failed to get a response message", e2);
                    }
                }
                String headerField = this.c.getHeaderField(HttpResponseHeader.Location);
                if (TextUtils.isEmpty(headerField)) {
                    throw new C3124bu(responseCode, "Received empty or null redirect url", (IOException) null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    return d(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new C3124bu(responseCode, AbstractC3888ke0.i("Bad redirect url: ", headerField), e3);
                }
            } catch (IOException e4) {
                try {
                    responseCode2 = this.c.getResponseCode();
                } catch (IOException unused4) {
                }
                throw new C3124bu(responseCode2, "Failed to connect or obtain data", e4);
            }
        } catch (IOException e5) {
            throw new C3124bu(0, "URL.openConnection threw", e5);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3551gl
    public final EnumC4516rl e() {
        return EnumC4516rl.b;
    }
}
