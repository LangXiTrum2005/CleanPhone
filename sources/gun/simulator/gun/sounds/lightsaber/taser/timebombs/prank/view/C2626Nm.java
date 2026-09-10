package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2626Nm implements InterfaceC4429ql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3476a;
    public final ArrayList b;
    public final InterfaceC4429ql c;
    public C2685Pt d;
    public Z5 e;
    public C2597Mj f;
    public InterfaceC4429ql g;
    public C3628hf0 h;
    public C4253ol i;
    public C5107yX j;
    public InterfaceC4429ql k;

    public C2626Nm(Context context, InterfaceC4429ql interfaceC4429ql) {
        this.f3476a = context.getApplicationContext();
        interfaceC4429ql.getClass();
        this.c = interfaceC4429ql;
        this.b = new ArrayList();
    }

    public static void h(InterfaceC4429ql interfaceC4429ql, Bd0 bd0) {
        if (interfaceC4429ql != null) {
            interfaceC4429ql.c(bd0);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final void c(Bd0 bd0) {
        bd0.getClass();
        this.c.c(bd0);
        this.b.add(bd0);
        h(this.d, bd0);
        h(this.e, bd0);
        h(this.f, bd0);
        h(this.g, bd0);
        h(this.h, bd0);
        h(this.i, bd0);
        h(this.j, bd0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final void close() {
        InterfaceC4429ql interfaceC4429ql = this.k;
        if (interfaceC4429ql != null) {
            try {
                interfaceC4429ql.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final long d(C4868vl c4868vl) {
        FW.s(this.k == null);
        String scheme = c4868vl.f5150a.getScheme();
        int i = Ug0.f3833a;
        Uri uri = c4868vl.f5150a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f3476a;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    C2685Pt c2685Pt = new C2685Pt(false);
                    this.d = c2685Pt;
                    g(c2685Pt);
                }
                this.k = this.d;
            } else {
                if (this.e == null) {
                    Z5 z5 = new Z5(context);
                    this.e = z5;
                    g(z5);
                }
                this.k = this.e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                Z5 z6 = new Z5(context);
                this.e = z6;
                g(z6);
            }
            this.k = this.e;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                C2597Mj c2597Mj = new C2597Mj(context);
                this.f = c2597Mj;
                g(c2597Mj);
            }
            this.k = this.f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            InterfaceC4429ql interfaceC4429ql = this.c;
            if (zEquals) {
                if (this.g == null) {
                    try {
                        InterfaceC4429ql interfaceC4429ql2 = (InterfaceC4429ql) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.g = interfaceC4429ql2;
                        g(interfaceC4429ql2);
                    } catch (ClassNotFoundException unused) {
                        AbstractC4038mJ.f();
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.g == null) {
                        this.g = interfaceC4429ql;
                    }
                }
                this.k = this.g;
            } else if ("udp".equals(scheme)) {
                if (this.h == null) {
                    C3628hf0 c3628hf0 = new C3628hf0(8000);
                    this.h = c3628hf0;
                    g(c3628hf0);
                }
                this.k = this.h;
            } else if ("data".equals(scheme)) {
                if (this.i == null) {
                    C4253ol c4253ol = new C4253ol(false);
                    this.i = c4253ol;
                    g(c4253ol);
                }
                this.k = this.i;
            } else if (RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    C5107yX c5107yX = new C5107yX(context);
                    this.j = c5107yX;
                    g(c5107yX);
                }
                this.k = this.j;
            } else {
                this.k = interfaceC4429ql;
            }
        }
        return this.k.d(c4868vl);
    }

    public final void g(InterfaceC4429ql interfaceC4429ql) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            interfaceC4429ql.c((Bd0) arrayList.get(i));
            i++;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final Map getResponseHeaders() {
        InterfaceC4429ql interfaceC4429ql = this.k;
        return interfaceC4429ql == null ? Collections.emptyMap() : interfaceC4429ql.getResponseHeaders();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final Uri getUri() {
        InterfaceC4429ql interfaceC4429ql = this.k;
        if (interfaceC4429ql == null) {
            return null;
        }
        return interfaceC4429ql.getUri();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3813jl
    public final int read(byte[] bArr, int i, int i2) {
        InterfaceC4429ql interfaceC4429ql = this.k;
        interfaceC4429ql.getClass();
        return interfaceC4429ql.read(bArr, i, i2);
    }
}
