package b2;

import android.net.Uri;
import android.util.SparseArray;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.Closeable;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import oa.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f5370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f5371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SocketFactory f5373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f5374e = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray f5375f = new SparseArray();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f5376g = new p(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f5377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g0 f5378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h0 f5379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f5380k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n f5381m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h9.k f5382n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5383o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f5384p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5385q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5386r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f5387s;

    public q(t tVar, t tVar2, String str, Uri uri, SocketFactory socketFactory) {
        Uri uriBuild;
        this.f5370a = tVar;
        this.f5371b = tVar2;
        this.f5372c = str;
        this.f5373d = socketFactory;
        Pattern pattern = j0.f5303a;
        if (uri.getUserInfo() == null) {
            uriBuild = uri;
        } else {
            String encodedAuthority = uri.getEncodedAuthority();
            encodedAuthority.getClass();
            go.k.i(encodedAuthority.contains("@"));
            String str2 = l1.y.f44830a;
            uriBuild = uri.buildUpon().encodedAuthority(encodedAuthority.split("@", -1)[1]).build();
        }
        this.f5377h = uriBuild;
        this.f5378i = new g0(new eb.d0(this));
        this.l = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        this.f5379j = j0.d(uri);
        this.f5387s = C.TIME_UNSET;
        this.f5383o = -1;
    }

    public static void a(q qVar, z zVar) {
        if (qVar.f5384p) {
            qVar.f5371b.c(zVar);
            return;
        }
        t tVar = qVar.f5370a;
        String message = zVar.getMessage();
        if (message == null) {
            message = "";
        }
        tVar.f(message, zVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        n nVar = this.f5381m;
        if (nVar != null) {
            nVar.close();
            this.f5381m = null;
            Uri uri = this.f5377h;
            String str = this.f5380k;
            str.getClass();
            p pVar = this.f5376g;
            q qVar = (q) pVar.f5365d;
            int i10 = qVar.f5383o;
            if (i10 != -1 && i10 != 0) {
                qVar.f5383o = 0;
                pVar.o(pVar.k(12, str, s1.f47307g, uri));
            }
        }
        this.f5378i.close();
    }

    public final void d() {
        long jZ;
        u uVar = (u) this.f5374e.pollFirst();
        if (uVar == null) {
            x xVar = (x) this.f5371b.f5398b;
            long j10 = xVar.f5424n;
            if (j10 != C.TIME_UNSET) {
                jZ = l1.y.Z(j10);
            } else {
                long j11 = xVar.f5425o;
                jZ = j11 != C.TIME_UNSET ? l1.y.Z(j11) : 0L;
            }
            xVar.f5415d.k(jZ);
            return;
        }
        Uri uri = uVar.f5400b.f5253b.f5243b;
        uVar.f5401c.getClass();
        String str = uVar.f5401c;
        String str2 = this.f5380k;
        p pVar = this.f5376g;
        ((q) pVar.f5365d).f5383o = 0;
        oa.q.c("Transport", str);
        pVar.o(pVar.k(10, str2, s1.j(1, new Object[]{"Transport", str}, null), uri));
    }

    public final Socket h(Uri uri) {
        go.k.i(uri.getHost() != null);
        int port = uri.getPort() > 0 ? uri.getPort() : 554;
        String host = uri.getHost();
        host.getClass();
        return this.f5373d.createSocket(host, port);
    }

    public final void j(long j10) {
        if (this.f5383o == 2 && !this.f5386r) {
            Uri uri = this.f5377h;
            String str = this.f5380k;
            str.getClass();
            p pVar = this.f5376g;
            q qVar = (q) pVar.f5365d;
            go.k.t(qVar.f5383o == 2);
            pVar.o(pVar.k(5, str, s1.f47307g, uri));
            qVar.f5386r = true;
        }
        this.f5387s = j10;
    }

    public final void k(long j10) {
        Uri uri = this.f5377h;
        String str = this.f5380k;
        str.getClass();
        p pVar = this.f5376g;
        int i10 = ((q) pVar.f5365d).f5383o;
        go.k.t(i10 == 1 || i10 == 2);
        l0 l0Var = l0.f5321c;
        Object[] objArr = {Double.valueOf(j10 / 1000.0d)};
        String str2 = l1.y.f44830a;
        pVar.o(pVar.k(6, str, s1.j(1, new Object[]{Command.HTTP_HEADER_RANGE, String.format(Locale.US, "npt=%.3f-", objArr)}, null), uri));
    }
}
