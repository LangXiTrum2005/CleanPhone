package b2;

import java.io.Closeable;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Closeable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Charset f5278g = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eb.d0 f5279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2.m f5280b = new j2.m("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f5281c = defpackage.e.w();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f0 f5282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Socket f5283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f5284f;

    public g0(eb.d0 d0Var) {
        this.f5279a = d0Var;
    }

    public final void a(Socket socket) {
        this.f5283e = socket;
        this.f5282d = new f0(this, socket.getOutputStream());
        this.f5280b.e(new e0(this, socket.getInputStream()), new rc.d(this), 0);
    }

    public final void b(n1 n1Var) {
        this.f5282d.getClass();
        f0 f0Var = this.f5282d;
        f0Var.getClass();
        f0Var.f5265c.post(new androidx.fragment.app.d(f0Var, new na.g(j0.f5310h).C(n1Var).getBytes(f5278g), n1Var, 3));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5284f) {
            return;
        }
        try {
            f0 f0Var = this.f5282d;
            if (f0Var != null) {
                f0Var.close();
            }
            this.f5280b.d(null);
            Socket socket = this.f5283e;
            if (socket != null) {
                socket.close();
            }
        } finally {
            this.f5284f = true;
        }
    }
}
