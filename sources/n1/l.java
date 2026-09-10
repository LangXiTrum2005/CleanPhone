package n1;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f46378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f46379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f46380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f46381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f46382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f46383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b0 f46384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f46385i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x f46386j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h f46387k;

    public l(Context context, h hVar) {
        this.f46377a = context.getApplicationContext();
        hVar.getClass();
        this.f46379c = hVar;
        this.f46378b = new ArrayList();
    }

    public static void d(h hVar, z zVar) {
        if (hVar != null) {
            hVar.c(zVar);
        }
    }

    @Override // n1.h
    public final long C(k kVar) {
        go.k.t(this.f46387k == null);
        Uri uri = kVar.f46369a;
        String scheme = uri.getScheme();
        String str = l1.y.f44830a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f46377a;
        if (zIsEmpty || Objects.equals(scheme2, X3.i.f27782b)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f46380d == null) {
                    q qVar = new q(false);
                    this.f46380d = qVar;
                    b(qVar);
                }
                this.f46387k = this.f46380d;
            } else {
                if (this.f46381e == null) {
                    b bVar = new b(context);
                    this.f46381e = bVar;
                    b(bVar);
                }
                this.f46387k = this.f46381e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f46381e == null) {
                b bVar2 = new b(context);
                this.f46381e = bVar2;
                b(bVar2);
            }
            this.f46387k = this.f46381e;
        } else if ("content".equals(scheme)) {
            if (this.f46382f == null) {
                e eVar = new e(context);
                this.f46382f = eVar;
                b(eVar);
            }
            this.f46387k = this.f46382f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            h hVar = this.f46379c;
            if (zEquals) {
                if (this.f46383g == null) {
                    try {
                        h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f46383g = hVar2;
                        b(hVar2);
                    } catch (ClassNotFoundException unused) {
                        l1.a.s("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating RTMP extension", e10);
                    }
                    if (this.f46383g == null) {
                        this.f46383g = hVar;
                    }
                }
                this.f46387k = this.f46383g;
            } else if ("udp".equals(scheme)) {
                if (this.f46384h == null) {
                    b0 b0Var = new b0(8000);
                    this.f46384h = b0Var;
                    b(b0Var);
                }
                this.f46387k = this.f46384h;
            } else if ("data".equals(scheme)) {
                if (this.f46385i == null) {
                    f fVar = new f(false);
                    this.f46385i = fVar;
                    b(fVar);
                }
                this.f46387k = this.f46385i;
            } else if (RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f46386j == null) {
                    x xVar = new x(context);
                    this.f46386j = xVar;
                    b(xVar);
                }
                this.f46387k = this.f46386j;
            } else {
                this.f46387k = hVar;
            }
        }
        return this.f46387k.C(kVar);
    }

    public final void b(h hVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f46378b;
            if (i10 >= arrayList.size()) {
                return;
            }
            hVar.c((z) arrayList.get(i10));
            i10++;
        }
    }

    @Override // n1.h
    public final void c(z zVar) {
        zVar.getClass();
        this.f46379c.c(zVar);
        this.f46378b.add(zVar);
        d(this.f46380d, zVar);
        d(this.f46381e, zVar);
        d(this.f46382f, zVar);
        d(this.f46383g, zVar);
        d(this.f46384h, zVar);
        d(this.f46385i, zVar);
        d(this.f46386j, zVar);
    }

    @Override // n1.h
    public final void close() {
        h hVar = this.f46387k;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f46387k = null;
            }
        }
    }

    @Override // n1.h
    public final Map getResponseHeaders() {
        h hVar = this.f46387k;
        return hVar == null ? Collections.EMPTY_MAP : hVar.getResponseHeaders();
    }

    @Override // n1.h
    public final Uri getUri() {
        h hVar = this.f46387k;
        if (hVar == null) {
            return null;
        }
        return hVar.getUri();
    }

    @Override // i1.i
    public final int read(byte[] bArr, int i10, int i11) {
        h hVar = this.f46387k;
        hVar.getClass();
        return hVar.read(bArr, i10, i11);
    }
}
