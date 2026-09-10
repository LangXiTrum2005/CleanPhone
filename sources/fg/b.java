package fg;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import d5.o;
import java.nio.FloatBuffer;
import p.u0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ec.a f40813j = new ec.a("FrameDrawer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SurfaceTexture f40814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Surface f40815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u0 f40816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public of.a f40817d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f40821h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f40818e = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f40819f = 1.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40820g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f40822i = new Object();

    public b() {
        o oVar = new o(17);
        u0 u0Var = new u0();
        this.f40816c = u0Var;
        u0Var.f47829m = oVar;
        of.a aVar = new of.a();
        FloatBuffer floatBufferN = android.support.v4.media.session.a.n(8);
        floatBufferN.put(of.a.f47408g);
        floatBufferN.clear();
        aVar.f47411f = floatBufferN;
        this.f40817d = aVar;
        SurfaceTexture surfaceTexture = new SurfaceTexture(oVar.f38703b);
        this.f40814a = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new a(this));
        this.f40815b = new Surface(this.f40814a);
    }
}
