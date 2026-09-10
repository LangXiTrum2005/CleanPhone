package l2;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import com.applovin.impl.da;
import com.google.android.gms.internal.ads.g1;
import com.google.android.gms.internal.ads.ht0;
import com.google.android.gms.internal.ads.x0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.CopyOnWriteArraySet;
import oa.f0;
import oa.j0;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final da f44905r = new da(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f44907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f44908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f44909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f44910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l1.u f44911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArraySet f44912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f44913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g1 f44914i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ht0 f44915j = new ht0(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l1.w f44916k;
    public Pair l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f44917m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f44918n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f44919o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f44920p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f44921q;

    public o(x0 x0Var) {
        this.f44906a = x0Var.f21655a;
        m mVar = (m) x0Var.f21660f;
        mVar.getClass();
        this.f44907b = mVar;
        this.f44908c = new SparseArray();
        f0 f0Var = j0.f47265b;
        n1 n1Var = n1.f47281e;
        this.f44909d = x0Var.f21656b;
        l1.u uVar = (l1.u) x0Var.f21661g;
        this.f44911f = uVar;
        long j10 = x0Var.f21658d;
        this.f44913h = j10 != C.TIME_UNSET ? -j10 : -9223372036854775807L;
        g1 g1Var = (g1) x0Var.f21662h;
        this.f44914i = g1Var;
        this.f44910e = new c((q) x0Var.f21659e, g1Var, uVar);
        this.f44912g = new CopyOnWriteArraySet();
        new i1.o().a();
        this.f44919o = C.TIME_UNSET;
        this.f44921q = -1;
        this.f44918n = 0;
    }
}
