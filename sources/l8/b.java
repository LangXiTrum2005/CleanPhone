package l8;

import android.os.Handler;
import android.os.Looper;
import bc.r;
import com.mbridge.msdk.config.component.info.provider.subprovider.f;
import kotlin.jvm.internal.n;
import l2.u;
import wi.j;
import xi.m;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Handler f45242d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f45243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f45244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45245c;

    public b(j jVar, m call) {
        n.f(call, "call");
        this.f45243a = jVar;
        this.f45244b = call;
        f45242d.hasMessages(0);
    }

    public final void a() {
        if (this.f45245c) {
            return;
        }
        this.f45245c = true;
        f45242d.post(new f(this.f45243a, 24));
    }

    public final void b(Object obj) {
        if (this.f45245c) {
            return;
        }
        this.f45245c = true;
        f45242d.post(new u(6, this.f45243a, obj));
    }

    public final void c(String code, String str, Object obj) {
        n.f(code, "code");
        if (this.f45245c) {
            return;
        }
        this.f45245c = true;
        f45242d.post(new r(this.f45243a, code, str, obj, 20));
    }
}
