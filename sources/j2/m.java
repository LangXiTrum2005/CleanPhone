package j2;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.a0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.Executors;
import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f43671d = new a0(C.TIME_UNSET, 0, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a0 f43672e = new a0(C.TIME_UNSET, 2, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a0 f43673f = new a0(C.TIME_UNSET, 3, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2.a f43674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f43675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f43676c;

    /* JADX WARN: Illegal instructions before constructor call */
    public m(String str) {
        String strN = defpackage.e.n("ExoPlayer:Loader:", str);
        String str2 = y.f44830a;
        this(new k2.a(Executors.newSingleThreadExecutor(new ch.b(strN, 2)), new i0.a(5), 0));
    }

    public final void a() {
        i iVar = this.f43675b;
        iVar.getClass();
        iVar.a(false);
    }

    public final boolean b() {
        return this.f43676c != null;
    }

    public final boolean c() {
        return this.f43675b != null;
    }

    public final void d(k kVar) {
        i iVar = this.f43675b;
        if (iVar != null) {
            iVar.a(true);
        }
        k2.a aVar = this.f43674a;
        if (kVar != null) {
            aVar.execute(new androidx.lifecycle.a0(kVar, 24));
        }
        ((i0.a) aVar.f44263c).accept(aVar.f44262b);
    }

    public final void e(j jVar, h hVar, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.f43676c = null;
        i iVar = new i(this, looperMyLooper, jVar, hVar, i10, SystemClock.elapsedRealtime());
        go.k.t(this.f43675b == null);
        this.f43675b = iVar;
        iVar.b();
    }

    @Override // j2.o
    public final void maybeThrowError() {
        IOException iOException = this.f43676c;
        if (iOException != null) {
            throw iOException;
        }
        i iVar = this.f43675b;
        if (iVar != null) {
            int i10 = iVar.f43661a;
            IOException iOException2 = iVar.f43665e;
            if (iOException2 != null && iVar.f43666f > i10) {
                throw iOException2;
            }
        }
    }

    public m(k2.a aVar) {
        this.f43674a = aVar;
    }
}
