package sg.bigo.ads.core.player.a;

import com.applovin.shadow.okio.Segment;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import sg.bigo.ads.common.m;

/* JADX INFO: loaded from: classes7.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f48766a = Executors.newSingleThreadExecutor(new sg.bigo.ads.common.n.c("Ping"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f48767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f48768c;

    public class a implements Callable<Boolean> {
        private a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Boolean call() {
            return Boolean.valueOf(h.this.b());
        }

        public /* synthetic */ a(h hVar, byte b2) {
            this();
        }
    }

    public h(String str, int i2) {
        this.f48767b = (String) m.a(str);
        this.f48768c = i2;
    }

    private List<Proxy> c() {
        ArrayList arrayList = new ArrayList();
        try {
            return ProxySelector.getDefault().select(new URI(d()));
        } catch (URISyntaxException e2) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Pinger#getDefaultProxies, error message is : " + e2.toString());
            return arrayList;
        }
    }

    private String d() {
        Locale locale = Locale.US;
        return "http://" + this.f48767b + ":" + this.f48768c + "/ping";
    }

    public final boolean a() {
        int i2 = 70;
        byte b2 = 0;
        int i3 = 0;
        while (i3 < 3) {
            try {
                if (((Boolean) this.f48766a.submit(new a(this, b2)).get(i2, TimeUnit.MILLISECONDS)).booleanValue()) {
                    return true;
                }
                i3++;
                i2 *= 2;
            } catch (InterruptedException | ExecutionException unused) {
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error pinging server due to unexpected error");
            } catch (TimeoutException unused2) {
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", androidx.datastore.preferences.protobuf.a.e(i3, i2, "Error pinging server (attempt: ", ", timeout: ", "). "));
            }
        }
        sg.bigo.ads.common.t.a.a(0, "ProxyCache", String.format(Locale.US, "Error pinging server (attempts: %d, max timeout: %d). If you see this message, please, report at https://github.com/danikula/AndroidVideoCache/issues/134. Default proxies are: %s", Integer.valueOf(i3), Integer.valueOf(i2 / 2), c()));
        return false;
    }

    public final boolean b() {
        g gVar = new g(d());
        try {
            byte[] bytes = "ping ok".getBytes();
            try {
                HttpURLConnection httpURLConnectionB = gVar.b();
                gVar.f48763a = httpURLConnectionB;
                if (httpURLConnectionB != null) {
                    gVar.f48764b = new BufferedInputStream(gVar.f48763a.getInputStream(), Segment.SIZE);
                }
            } catch (IOException e2) {
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Error opening connection for " + gVar.f48765c + " with offset 0, error message is : " + e2.toString());
            }
            byte[] bArr = new byte[bytes.length];
            gVar.a(bArr);
            boolean zEquals = Arrays.equals(bytes, bArr);
            sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "Ping response: `" + new String(bArr) + "`, pinged? " + zEquals);
            gVar.a();
            return zEquals;
        } catch (Throwable th) {
            gVar.a();
            throw th;
        }
    }
}
