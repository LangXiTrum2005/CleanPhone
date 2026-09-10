package fg;

import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.view.Surface;
import androidx.fragment.app.o;
import cg.k;
import cg.l;
import cg.p;
import com.ironsource.Xa;
import com.unity3d.services.UnityAdsConstants;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.n;
import p.u0;
import wj.h;
import wj.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends cg.a implements zf.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaFormat f40830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f40831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f40832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f40833h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(MediaFormat targetFormat, int i10) {
        super("VideoRenderer");
        n.f(targetFormat, "targetFormat");
        this.f40829d = i10;
        this.f40830e = targetFormat;
        this.f40831f = this;
        this.f40832g = r9.b.u(new defpackage.c(6));
        int integer = targetFormat.getInteger("width");
        int integer2 = targetFormat.getInteger("height");
        targetFormat.setInteger("width", integer);
        targetFormat.setInteger("height", integer2);
        this.f6381b.a("encoded output format: " + targetFormat);
        ec.a aVar = this.f6381b;
        StringBuilder sbL = l1.d.l("output size=", integer, "x", integer2, ", flipped=");
        sbL.append(false);
        aVar.a(sbL.toString());
    }

    @Override // zf.c
    public final void a(MediaFormat mediaFormat) {
        this.f6381b.a("decoded input format: " + mediaFormat);
    }

    @Override // zf.c
    public final Surface b(MediaFormat sourceFormat) {
        Object objC;
        float f10;
        n.f(sourceFormat, "sourceFormat");
        this.f6381b.a("encoded input format: " + sourceFormat);
        try {
            objC = Integer.valueOf(sourceFormat.getInteger("rotation-degrees"));
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        if (h.a(objC) != null) {
            objC = 0;
        }
        int iIntValue = ((Number) objC).intValue();
        int i10 = this.f40829d;
        if (iIntValue != i10) {
            throw new IllegalStateException(("Unexpected difference in rotation. DataSource=" + i10 + ", MediaFormat=" + iIntValue).toString());
        }
        sourceFormat.setInteger("rotation-degrees", 0);
        int i11 = iIntValue % 360;
        j jVar = this.f40832g;
        ((b) jVar.getValue()).f40820g = i11;
        boolean z10 = i11 % 180 != 0;
        float integer = sourceFormat.getInteger("width") / sourceFormat.getInteger("height");
        MediaFormat mediaFormat = this.f40830e;
        float integer2 = (z10 ? mediaFormat.getInteger("height") : mediaFormat.getInteger("width")) / (z10 ? mediaFormat.getInteger("width") : mediaFormat.getInteger("height"));
        float f11 = 1.0f;
        if (integer > integer2) {
            float f12 = integer / integer2;
            f10 = 1.0f;
            f11 = f12;
        } else {
            f10 = integer < integer2 ? integer2 / integer : 1.0f;
        }
        b bVar = (b) jVar.getValue();
        bVar.f40818e = f11;
        bVar.f40819f = f10;
        this.f40833h = new c(sourceFormat.getInteger("frame-rate"), mediaFormat.getInteger("frame-rate"));
        Surface surface = ((b) jVar.getValue()).f40815b;
        n.e(surface, "getSurface(...)");
        return surface;
    }

    @Override // cg.a
    public final p c(cg.n state) {
        n.f(state, "state");
        if (state instanceof l) {
            ((zf.d) ((l) state).f6411a).f54938c.invoke(Boolean.FALSE);
            return new l(0L);
        }
        c cVar = this.f40833h;
        if (cVar == null) {
            n.l("frameDropper");
            throw null;
        }
        double d10 = cVar.f40825c;
        ec.a aVar = cVar.f40823a;
        double d11 = cVar.f40826d;
        double d12 = cVar.f40824b;
        double d13 = d11 + d12;
        cVar.f40826d = d13;
        int i10 = cVar.f40827e;
        cVar.f40827e = i10 + 1;
        if (i10 == 0) {
            aVar.c("RENDERING (first frame) - currentSpf=" + d13 + " inputSpf=" + d12 + " outputSpf=" + d10);
        } else {
            if (d13 <= d10) {
                aVar.c("DROPPING - currentSpf=" + d13 + " inputSpf=" + d12 + " outputSpf=" + d10);
                ((zf.d) state.f6411a).f54938c.invoke(Boolean.FALSE);
                return new k(false);
            }
            double d14 = d13 - d10;
            cVar.f40826d = d14;
            aVar.c("RENDERING - currentSpf=" + d14 + " inputSpf=" + d12 + " outputSpf=" + d10);
        }
        ((zf.d) state.f6411a).f54938c.invoke(Boolean.TRUE);
        b bVar = (b) this.f40832g.getValue();
        synchronized (bVar.f40822i) {
            while (!bVar.f40821h) {
                try {
                    bVar.f40822i.wait(Xa.f27908s);
                    if (!bVar.f40821h) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e10) {
                    throw new RuntimeException(e10);
                }
            }
            bVar.f40821h = false;
        }
        bVar.f40814a.updateTexImage();
        bVar.f40814a.getTransformMatrix((float[]) bVar.f40816c.f47822e);
        float f10 = 1.0f / bVar.f40818e;
        float f11 = 1.0f / bVar.f40819f;
        Matrix.translateM((float[]) bVar.f40816c.f47822e, 0, (1.0f - f10) / 2.0f, (1.0f - f11) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Matrix.scaleM((float[]) bVar.f40816c.f47822e, 0, f10, f11, 1.0f);
        Matrix.translateM((float[]) bVar.f40816c.f47822e, 0, 0.5f, 0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Matrix.rotateM((float[]) bVar.f40816c.f47822e, 0, bVar.f40820g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        Matrix.translateM((float[]) bVar.f40816c.f47822e, 0, -0.5f, -0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        u0 u0Var = bVar.f40816c;
        of.a drawable = bVar.f40817d;
        u0Var.getClass();
        n.f(drawable, "drawable");
        float[] modelViewProjectionMatrix = drawable.f47409d;
        n.f(modelViewProjectionMatrix, "modelViewProjectionMatrix");
        nf.a.b("draw start");
        o oVar = new o(u0Var, drawable, modelViewProjectionMatrix, 4);
        GLES20.glUseProgram(u0Var.f47818a);
        nf.a.b("glUseProgram");
        oVar.invoke();
        GLES20.glUseProgram(0);
        nf.a.b("draw end");
        return new cg.n(Long.valueOf(((zf.d) state.f6411a).f54937b));
    }

    @Override // cg.a
    public final cg.c d() {
        return this.f40831f;
    }

    @Override // cg.a
    public final void g() {
        b bVar = (b) this.f40832g.getValue();
        u0 u0Var = bVar.f40816c;
        if (!u0Var.f47819b) {
            GLES20.glDeleteProgram(u0Var.f47818a);
            for (d5.o oVar : (d5.o[]) u0Var.f47821d) {
                GLES20.glDeleteShader(oVar.f38703b);
            }
            u0Var.f47819b = true;
        }
        n.f((FloatBuffer) u0Var.f47824g, "<this>");
        d5.o oVar2 = (d5.o) u0Var.f47829m;
        if (oVar2 != null) {
            GLES20.glDeleteTextures(1, new int[]{oVar2.f38703b}, 0);
        }
        u0Var.f47829m = null;
        bVar.f40815b.release();
        bVar.f40815b = null;
        bVar.f40814a = null;
        bVar.f40817d = null;
        bVar.f40816c = null;
    }
}
