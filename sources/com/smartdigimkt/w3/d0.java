package com.smartdigimkt.w3;

import android.graphics.SurfaceTexture;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.smartdigimkt.p4.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public class d0 implements h, w.g, w.e {
    private static final String S = "SimpleExoPlayer";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final CopyOnWriteArraySet<com.smartdigimkt.q4.g> f39248A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final CopyOnWriteArraySet<com.smartdigimkt.e4.f> f39249B;
    private final CopyOnWriteArraySet<com.smartdigimkt.q4.h> C;
    private final CopyOnWriteArraySet<com.smartdigimkt.y3.g> D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final com.smartdigimkt.x3.a f39250E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private m f39251F;
    private m G;
    private Surface H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f39252I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f39253J;
    private SurfaceHolder K;
    private TextureView L;
    private com.smartdigimkt.z3.d M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private com.smartdigimkt.z3.d f39254N;
    private int O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private com.smartdigimkt.y3.b f39255P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f39256Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private com.smartdigimkt.j4.s f39257R;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected final y[] f39258w;
    private final h x;
    private final Handler y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final b f39259z;

    @Deprecated
    public interface c extends com.smartdigimkt.q4.g {
    }

    public d0(b0 b0Var, com.smartdigimkt.m4.h hVar, p pVar, com.smartdigimkt.a4.g<com.smartdigimkt.a4.k> gVar) {
        this(b0Var, hVar, pVar, gVar, new com.smartdigimkt.x3.a.C0638a());
    }

    private void R() {
        TextureView textureView = this.L;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f39259z) {
                Log.w(S, "SurfaceTextureListener already unset or replaced.");
            } else {
                this.L.setSurfaceTextureListener(null);
            }
            this.L = null;
        }
        SurfaceHolder surfaceHolder = this.K;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f39259z);
            this.K = null;
        }
    }

    @Override // com.smartdigimkt.w3.w.g
    public int A() {
        return this.f39253J;
    }

    @Override // com.smartdigimkt.w3.w
    public boolean B() {
        return this.x.B();
    }

    @Override // com.smartdigimkt.w3.w.g
    public void C() {
        a((Surface) null);
    }

    @Override // com.smartdigimkt.w3.w
    public int D() {
        return this.x.D();
    }

    @Override // com.smartdigimkt.w3.w
    public com.smartdigimkt.m4.g E() {
        return this.x.E();
    }

    @Override // com.smartdigimkt.w3.w
    public long F() {
        return this.x.F();
    }

    @Override // com.smartdigimkt.w3.w
    public w.e G() {
        return this;
    }

    public com.smartdigimkt.x3.a H() {
        return this.f39250E;
    }

    public com.smartdigimkt.y3.b I() {
        return this.f39255P;
    }

    public com.smartdigimkt.z3.d J() {
        return this.f39254N;
    }

    public m K() {
        return this.G;
    }

    public int L() {
        return this.O;
    }

    @Deprecated
    public int M() {
        return f0.e(this.f39255P.f40041c);
    }

    public com.smartdigimkt.z3.d N() {
        return this.M;
    }

    public m O() {
        return this.f39251F;
    }

    public float P() {
        return this.f39256Q;
    }

    public final boolean Q() {
        return j() == 3 && i();
    }

    @Override // com.smartdigimkt.w3.w
    public w.g a() {
        return this;
    }

    @Override // com.smartdigimkt.w3.w
    public int f() {
        return this.x.f();
    }

    @Override // com.smartdigimkt.w3.w
    public Object g() {
        return this.x.g();
    }

    @Override // com.smartdigimkt.w3.w
    public long h() {
        return this.x.h();
    }

    @Override // com.smartdigimkt.w3.w
    public boolean i() {
        return this.x.i();
    }

    @Override // com.smartdigimkt.w3.w
    public int j() {
        return this.x.j();
    }

    @Override // com.smartdigimkt.w3.w
    public int k() {
        return this.x.k();
    }

    @Override // com.smartdigimkt.w3.w
    public int l() {
        return this.x.l();
    }

    @Override // com.smartdigimkt.w3.w
    public g m() {
        return this.x.m();
    }

    @Override // com.smartdigimkt.w3.h
    public Looper n() {
        return this.x.n();
    }

    @Override // com.smartdigimkt.w3.w
    public int o() {
        return this.x.o();
    }

    @Override // com.smartdigimkt.w3.w
    public boolean p() {
        return this.x.p();
    }

    @Override // com.smartdigimkt.w3.w
    public void q() {
        this.f39250E.i();
        this.x.q();
    }

    @Override // com.smartdigimkt.w3.w
    public int r() {
        return this.x.r();
    }

    @Override // com.smartdigimkt.w3.w
    public void release() {
        this.x.release();
        R();
        Surface surface = this.H;
        if (surface != null) {
            if (this.f39252I) {
                surface.release();
            }
            this.H = null;
        }
        com.smartdigimkt.j4.s sVar = this.f39257R;
        if (sVar != null) {
            sVar.a(this.f39250E);
        }
    }

    @Override // com.smartdigimkt.w3.w
    public int s() {
        return this.x.s();
    }

    @Override // com.smartdigimkt.w3.w
    public void stop() {
        c(false);
    }

    @Override // com.smartdigimkt.w3.w
    public int t() {
        return this.x.t();
    }

    @Override // com.smartdigimkt.w3.w
    public boolean u() {
        return this.x.u();
    }

    @Override // com.smartdigimkt.w3.w
    public com.smartdigimkt.j4.f0 v() {
        return this.x.v();
    }

    @Override // com.smartdigimkt.w3.w
    public int w() {
        return this.x.w();
    }

    @Override // com.smartdigimkt.w3.w
    public long x() {
        try {
            return this.x.x();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.smartdigimkt.w3.w
    public Object y() {
        return this.x.y();
    }

    @Override // com.smartdigimkt.w3.w
    public e0 z() {
        return this.x.z();
    }

    public final class b implements com.smartdigimkt.q4.h, com.smartdigimkt.y3.g, com.smartdigimkt.e4.f, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
        private b() {
        }

        @Override // com.smartdigimkt.q4.h
        public void a(String str, long j, long j2) {
            Iterator it = d0.this.C.iterator();
            while (it.hasNext()) {
                ((com.smartdigimkt.q4.h) it.next()).a(str, j, j2);
            }
        }

        @Override // com.smartdigimkt.q4.h
        public void b(m mVar) {
            d0.this.f39251F = mVar;
            Iterator it = d0.this.C.iterator();
            while (it.hasNext()) {
                ((com.smartdigimkt.q4.h) it.next()).b(mVar);
            }
        }

        @Override // com.smartdigimkt.q4.h
        public void c(com.smartdigimkt.z3.d dVar) {
            Iterator it = d0.this.C.iterator();
            while (it.hasNext()) {
                ((com.smartdigimkt.q4.h) it.next()).c(dVar);
            }
            d0.this.f39251F = null;
            d0.this.M = null;
        }

        @Override // com.smartdigimkt.q4.h
        public void d(com.smartdigimkt.z3.d dVar) {
            d0.this.M = dVar;
            Iterator it = d0.this.C.iterator();
            while (it.hasNext()) {
                ((com.smartdigimkt.q4.h) it.next()).d(dVar);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
            d0.this.a(new Surface(surfaceTexture), true);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            d0.this.a((Surface) null, true);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            d0.this.a(surfaceHolder.getSurface(), false);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            d0.this.a((Surface) null, false);
        }

        @Override // com.smartdigimkt.q4.h
        public void a(int i2, long j) {
            Iterator it = d0.this.C.iterator();
            while (it.hasNext()) {
                ((com.smartdigimkt.q4.h) it.next()).a(i2, j);
            }
        }

        @Override // com.smartdigimkt.y3.g
        public void b(com.smartdigimkt.z3.d dVar) {
            d0.this.f39254N = dVar;
            Iterator it = d0.this.D.iterator();
            while (it.hasNext()) {
                ((com.smartdigimkt.y3.g) it.next()).b(dVar);
            }
        }

        @Override // com.smartdigimkt.q4.h
        public void a(int i2, int i3, int i4, float f) {
            Iterator it = d0.this.f39248A.iterator();
            while (it.hasNext()) {
                ((com.smartdigimkt.q4.g) it.next()).a(i2, i3, i4, f);
            }
            Iterator it2 = d0.this.C.iterator();
            while (it2.hasNext()) {
                ((com.smartdigimkt.q4.h) it2.next()).a(i2, i3, i4, f);
            }
        }

        @Override // com.smartdigimkt.y3.g
        public void b(String str, long j, long j2) {
            Iterator it = d0.this.D.iterator();
            while (it.hasNext()) {
                ((com.smartdigimkt.y3.g) it.next()).b(str, j, j2);
            }
        }

        @Override // com.smartdigimkt.q4.h
        public void a(Surface surface) {
            if (d0.this.H == surface) {
                Iterator it = d0.this.f39248A.iterator();
                while (it.hasNext()) {
                    ((com.smartdigimkt.q4.g) it.next()).a();
                }
            }
            Iterator it2 = d0.this.C.iterator();
            while (it2.hasNext()) {
                ((com.smartdigimkt.q4.h) it2.next()).a(surface);
            }
        }

        @Override // com.smartdigimkt.y3.g
        public void a(int i2) {
            d0.this.O = i2;
            Iterator it = d0.this.D.iterator();
            while (it.hasNext()) {
                ((com.smartdigimkt.y3.g) it.next()).a(i2);
            }
        }

        @Override // com.smartdigimkt.y3.g
        public void a(m mVar) {
            d0.this.G = mVar;
            Iterator it = d0.this.D.iterator();
            while (it.hasNext()) {
                ((com.smartdigimkt.y3.g) it.next()).a(mVar);
            }
        }

        @Override // com.smartdigimkt.y3.g
        public void a(int i2, long j, long j2) {
            Iterator it = d0.this.D.iterator();
            while (it.hasNext()) {
                ((com.smartdigimkt.y3.g) it.next()).a(i2, j, j2);
            }
        }

        @Override // com.smartdigimkt.y3.g
        public void a(com.smartdigimkt.z3.d dVar) {
            Iterator it = d0.this.D.iterator();
            while (it.hasNext()) {
                ((com.smartdigimkt.y3.g) it.next()).a(dVar);
            }
            d0.this.G = null;
            d0.this.f39254N = null;
            d0.this.O = 0;
        }

        @Override // com.smartdigimkt.e4.f
        public void a(com.smartdigimkt.e4.a aVar) {
            Iterator it = d0.this.f39249B.iterator();
            while (it.hasNext()) {
                ((com.smartdigimkt.e4.f) it.next()).a(aVar);
            }
        }
    }

    public d0(b0 b0Var, com.smartdigimkt.m4.h hVar, p pVar, com.smartdigimkt.a4.g<com.smartdigimkt.a4.k> gVar, com.smartdigimkt.x3.a.C0638a c0638a) {
        this(b0Var, hVar, pVar, gVar, c0638a, com.smartdigimkt.p4.c.f37520a);
    }

    public void c(com.smartdigimkt.e4.f fVar) {
        this.f39249B.remove(fVar);
    }

    @Deprecated
    public void d(com.smartdigimkt.e4.f fVar) {
        this.f39249B.retainAll(Collections.singleton(this.f39250E));
        if (fVar != null) {
            a(fVar);
        }
    }

    @Deprecated
    public void e(int i2) {
        int iB = f0.b(i2);
        a(new com.smartdigimkt.y3.b.C0644b().c(iB).a(f0.a(i2)).a());
    }

    public d0(b0 b0Var, com.smartdigimkt.m4.h hVar, p pVar, com.smartdigimkt.a4.g<com.smartdigimkt.a4.k> gVar, com.smartdigimkt.x3.a.C0638a c0638a, com.smartdigimkt.p4.c cVar) {
        b bVar = new b();
        this.f39259z = bVar;
        this.f39248A = new CopyOnWriteArraySet<>();
        this.f39249B = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<com.smartdigimkt.q4.h> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.C = copyOnWriteArraySet;
        CopyOnWriteArraySet<com.smartdigimkt.y3.g> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
        this.D = copyOnWriteArraySet2;
        Handler handler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.y = handler;
        y[] yVarArrA = b0Var.a(handler, bVar, bVar, bVar, gVar);
        this.f39258w = yVarArrA;
        this.f39256Q = 1.0f;
        this.O = 0;
        this.f39255P = com.smartdigimkt.y3.b.f40038e;
        this.f39253J = 1;
        h hVarA = a(yVarArrA, hVar, pVar, cVar);
        this.x = hVarA;
        com.smartdigimkt.x3.a aVarA = c0638a.a(hVarA, cVar);
        this.f39250E = aVarA;
        a((w.c) aVarA);
        copyOnWriteArraySet.add(aVarA);
        copyOnWriteArraySet2.add(aVarA);
        a((com.smartdigimkt.e4.f) aVarA);
        if (gVar instanceof com.smartdigimkt.a4.d) {
            ((com.smartdigimkt.a4.d) gVar).a(handler, aVarA);
        }
    }

    @Deprecated
    public void c(com.smartdigimkt.q4.h hVar) {
        this.C.retainAll(Collections.singleton(this.f39250E));
        if (hVar != null) {
            a(hVar);
        }
    }

    @Override // com.smartdigimkt.w3.w.g
    public void b(int i2) {
        this.f39253J = i2;
        for (y yVar : this.f39258w) {
            if (yVar.e() == 2) {
                this.x.a(yVar).a(4).a(Integer.valueOf(i2)).l();
            }
        }
    }

    @Override // com.smartdigimkt.w3.w
    public boolean d() {
        return this.x.d();
    }

    @Deprecated
    public void c(com.smartdigimkt.y3.g gVar) {
        this.D.retainAll(Collections.singleton(this.f39250E));
        if (gVar != null) {
            a(gVar);
        }
    }

    @Override // com.smartdigimkt.w3.w
    public int d(int i2) {
        return this.x.d(i2);
    }

    @Override // com.smartdigimkt.w3.w.g
    public void a(Surface surface) {
        R();
        a(surface, false);
    }

    @Override // com.smartdigimkt.w3.w
    public void c(int i2) {
        this.x.c(i2);
    }

    @Override // com.smartdigimkt.w3.w
    public long e() {
        return this.x.e();
    }

    @Override // com.smartdigimkt.w3.w
    public void c(boolean z2) {
        this.x.c(z2);
        com.smartdigimkt.j4.s sVar = this.f39257R;
        if (sVar != null) {
            sVar.a(this.f39250E);
            this.f39257R = null;
            this.f39250E.j();
        }
    }

    @Override // com.smartdigimkt.w3.w.g
    public void a(SurfaceHolder surfaceHolder) {
        R();
        this.K = surfaceHolder;
        Surface surface = null;
        if (surfaceHolder == null) {
            a((Surface) null, false);
            return;
        }
        surfaceHolder.addCallback(this.f39259z);
        Surface surface2 = surfaceHolder.getSurface();
        if (surface2 != null && surface2.isValid()) {
            surface = surface2;
        }
        a(surface, false);
    }

    @Override // com.smartdigimkt.w3.w.g
    public void b(Surface surface) {
        if (surface == null || surface != this.H) {
            return;
        }
        a((Surface) null);
    }

    @Override // com.smartdigimkt.w3.w
    public boolean c() {
        return this.x.c();
    }

    @Override // com.smartdigimkt.w3.w.g
    public void b(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null || surfaceHolder != this.K) {
            return;
        }
        a((SurfaceHolder) null);
    }

    @Override // com.smartdigimkt.w3.w.g
    public void a(SurfaceView surfaceView) {
        a(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // com.smartdigimkt.w3.w.g
    public void a(TextureView textureView) {
        if (textureView == null || textureView != this.L) {
            return;
        }
        b((TextureView) null);
    }

    @Override // com.smartdigimkt.w3.w.g
    public void b(SurfaceView surfaceView) {
        b(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // com.smartdigimkt.w3.w.g
    public void b(TextureView textureView) {
        R();
        this.L = textureView;
        if (textureView == null) {
            a((Surface) null, true);
            return;
        }
        if (textureView.getSurfaceTextureListener() != null) {
            Log.w(S, "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f39259z);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        a(surfaceTexture != null ? new Surface(surfaceTexture) : null, true);
    }

    public void a(com.smartdigimkt.x3.b bVar) {
        this.f39250E.a(bVar);
    }

    public void a(com.smartdigimkt.y3.b bVar) {
        this.f39255P = bVar;
        for (y yVar : this.f39258w) {
            if (yVar.e() == 1) {
                this.x.a(yVar).a(3).a(bVar).l();
            }
        }
    }

    public void b(com.smartdigimkt.x3.b bVar) {
        this.f39250E.b(bVar);
    }

    @Override // com.smartdigimkt.w3.w.g
    public void b(com.smartdigimkt.q4.g gVar) {
        this.f39248A.remove(gVar);
    }

    public void a(float f) {
        this.f39256Q = f;
        for (y yVar : this.f39258w) {
            if (yVar.e() == 1) {
                this.x.a(yVar).a(2).a(Float.valueOf(f)).l();
            }
        }
    }

    @Deprecated
    public void b(c cVar) {
        this.f39248A.clear();
        if (cVar != null) {
            a((com.smartdigimkt.q4.g) cVar);
        }
    }

    @Deprecated
    public void b(com.smartdigimkt.e4.f fVar) {
        c(fVar);
    }

    @Deprecated
    public void b(com.smartdigimkt.q4.h hVar) {
        this.C.remove(hVar);
    }

    @Deprecated
    public void a(PlaybackParams playbackParams) {
        v vVar;
        if (playbackParams != null) {
            playbackParams.allowDefaults();
            vVar = new v(playbackParams.getSpeed(), playbackParams.getPitch());
        } else {
            vVar = null;
        }
        a(vVar);
    }

    @Deprecated
    public void b(com.smartdigimkt.y3.g gVar) {
        this.D.remove(gVar);
    }

    @Override // com.smartdigimkt.w3.w
    public void b(w.c cVar) {
        this.x.b(cVar);
    }

    @Override // com.smartdigimkt.w3.w
    public void b(boolean z2) {
        this.x.b(z2);
    }

    @Override // com.smartdigimkt.w3.w.g
    public void a(com.smartdigimkt.q4.g gVar) {
        this.f39248A.add(gVar);
    }

    @Override // com.smartdigimkt.w3.w
    public v b() {
        return this.x.b();
    }

    @Deprecated
    public void a(c cVar) {
        b((com.smartdigimkt.q4.g) cVar);
    }

    @Override // com.smartdigimkt.w3.h
    public void b(h.c... cVarArr) {
        this.x.b(cVarArr);
    }

    public void a(com.smartdigimkt.e4.f fVar) {
        this.f39249B.add(fVar);
    }

    @Deprecated
    public void a(com.smartdigimkt.q4.h hVar) {
        this.C.add(hVar);
    }

    @Deprecated
    public void a(com.smartdigimkt.y3.g gVar) {
        this.D.add(gVar);
    }

    @Override // com.smartdigimkt.w3.w
    public void a(w.c cVar) {
        this.x.a(cVar);
    }

    @Override // com.smartdigimkt.w3.h
    public void a(com.smartdigimkt.j4.s sVar) {
        a(sVar, true, true);
    }

    @Override // com.smartdigimkt.w3.h
    public void a(com.smartdigimkt.j4.s sVar, boolean z2, boolean z3) {
        com.smartdigimkt.j4.s sVar2 = this.f39257R;
        if (sVar2 != sVar) {
            if (sVar2 != null) {
                sVar2.a(this.f39250E);
                this.f39250E.j();
            }
            sVar.a(this.y, this.f39250E);
            this.f39257R = sVar;
        }
        this.x.a(sVar, z2, z3);
    }

    @Override // com.smartdigimkt.w3.w
    public void a(boolean z2) {
        this.x.a(z2);
    }

    @Override // com.smartdigimkt.w3.w
    public void a(int i2) {
        this.f39250E.i();
        this.x.a(i2);
    }

    @Override // com.smartdigimkt.w3.w
    public void a(long j) {
        this.f39250E.i();
        this.x.a(j);
    }

    @Override // com.smartdigimkt.w3.w
    public void a(int i2, long j) {
        this.f39250E.i();
        this.x.a(i2, j);
    }

    @Override // com.smartdigimkt.w3.w
    public void a(v vVar) {
        this.x.a(vVar);
    }

    @Override // com.smartdigimkt.w3.h
    public void a(c0 c0Var) {
        this.x.a(c0Var);
    }

    @Override // com.smartdigimkt.w3.h
    public x a(x.b bVar) {
        return this.x.a(bVar);
    }

    @Override // com.smartdigimkt.w3.h
    public void a(h.c... cVarArr) {
        this.x.a(cVarArr);
    }

    public h a(y[] yVarArr, com.smartdigimkt.m4.h hVar, p pVar, com.smartdigimkt.p4.c cVar) {
        return new j(yVarArr, hVar, pVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Surface surface, boolean z2) {
        ArrayList arrayList = new ArrayList();
        for (y yVar : this.f39258w) {
            if (yVar.e() == 2) {
                arrayList.add(this.x.a(yVar).a(1).a(surface).l());
            }
        }
        Surface surface2 = this.H;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((x) it.next()).a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                this.x.c(false);
            }
            if (this.f39252I) {
                this.H.release();
            }
        }
        this.H = surface;
        this.f39252I = z2;
    }
}
