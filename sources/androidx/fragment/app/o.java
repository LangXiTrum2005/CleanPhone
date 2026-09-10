package androidx.fragment.app;

import android.graphics.RectF;
import android.opengl.GLES20;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.n3;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Type;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4411h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i10) {
        super(0);
        this.f4408e = i10;
        this.f4409f = obj;
        this.f4410g = obj2;
        this.f4411h = obj3;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f4408e) {
            case 0:
                ((p) this.f4409f).f4420f.c((ViewGroup) this.f4410g, this.f4411h);
                return wj.r.f53297a;
            case 1:
                com.google.android.gms.internal.auth.i iVar = ((xn.f) this.f4409f).f53945b;
                kotlin.jvm.internal.n.c(iVar);
                return iVar.d(((xn.k) this.f4410g).a(), ((xn.a) this.f4411h).f53917h.f53992d);
            case 2:
                ml.a0 a0Var = (ml.a0) this.f4409f;
                om.o oVar = ((ll.a) a0Var.f46151b.f23782b).f45485a;
                ml.y yVar = new ml.y(a0Var, (fl.t) this.f4410g, (kl.f) this.f4411h);
                om.l lVar = (om.l) oVar;
                lVar.getClass();
                return new om.h(lVar, yVar);
            case 3:
                return ((zl.b) ((zl.v) this.f4409f)).b((ByteArrayInputStream) this.f4410g, ((lm.i) ((nm.o) this.f4411h).f46851b.f22981a).f45551p);
            case 4:
                p.u0 u0Var = (p.u0) this.f4409f;
                of.a drawable = (of.a) this.f4410g;
                float[] modelViewProjectionMatrix = (float[]) this.f4411h;
                RectF rect = (RectF) u0Var.f47828k;
                kotlin.jvm.internal.n.f(drawable, "drawable");
                int i10 = drawable.f47410e;
                kotlin.jvm.internal.n.f(modelViewProjectionMatrix, "modelViewProjectionMatrix");
                d5.o oVar2 = (d5.o) u0Var.f47829m;
                if (oVar2 != null) {
                    oVar2.c();
                }
                GLES20.glUniformMatrix4fv(((n3) u0Var.f47827j).f17624a, 1, false, modelViewProjectionMatrix, 0);
                nf.a.b("glUniformMatrix4fv");
                n3 n3Var = (n3) u0Var.f47823f;
                if (n3Var != null) {
                    GLES20.glUniformMatrix4fv(n3Var.f17624a, 1, false, (float[]) u0Var.f47822e, 0);
                    nf.a.b("glUniformMatrix4fv");
                }
                n3 n3Var2 = (n3) u0Var.f47826i;
                GLES20.glEnableVertexAttribArray(n3Var2.f17625b);
                nf.a.b("glEnableVertexAttribArray");
                int i11 = n3Var2.f17625b;
                int i12 = i10 * 4;
                FloatBuffer floatBuffer = drawable.f47411f;
                FloatBuffer floatBuffer2 = drawable.f47411f;
                GLES20.glVertexAttribPointer(i11, 2, 5126, false, i12, (Buffer) floatBuffer2);
                nf.a.b("glVertexAttribPointer");
                n3 n3Var3 = (n3) u0Var.f47825h;
                if (n3Var3 != null) {
                    if (!drawable.equals((of.a) u0Var.l) || u0Var.f47820c != 0) {
                        u0Var.l = drawable;
                        u0Var.f47820c = 0;
                        kotlin.jvm.internal.n.f(rect, "rect");
                        float fMax = -3.4028235E38f;
                        int i13 = 0;
                        float fMin = Float.MAX_VALUE;
                        float fMin2 = Float.MAX_VALUE;
                        float fMax2 = -3.4028235E38f;
                        while (floatBuffer2.hasRemaining()) {
                            float f10 = floatBuffer2.get();
                            if (i13 % 2 == 0) {
                                fMin = Math.min(fMin, f10);
                                fMax2 = Math.max(fMax2, f10);
                            } else {
                                fMax = Math.max(fMax, f10);
                                fMin2 = Math.min(fMin2, f10);
                            }
                            i13++;
                        }
                        floatBuffer2.rewind();
                        rect.set(fMin, fMax, fMax2, fMin2);
                        int iLimit = (floatBuffer.limit() / i10) * 2;
                        if (((FloatBuffer) u0Var.f47824g).capacity() < iLimit) {
                            kotlin.jvm.internal.n.f((FloatBuffer) u0Var.f47824g, "<this>");
                            u0Var.f47824g = android.support.v4.media.session.a.n(iLimit);
                        }
                        ((FloatBuffer) u0Var.f47824g).clear();
                        ((FloatBuffer) u0Var.f47824g).limit(iLimit);
                        if (iLimit > 0) {
                            int i14 = 0;
                            while (true) {
                                int i15 = i14 + 1;
                                boolean z10 = i14 % 2 == 0;
                                float f11 = floatBuffer2.get(i14);
                                float f12 = z10 ? rect.left : rect.bottom;
                                ((FloatBuffer) u0Var.f47824g).put((((f11 - f12) / ((z10 ? rect.right : rect.top) - f12)) * 1.0f) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                if (i15 < iLimit) {
                                    i14 = i15;
                                }
                            }
                        }
                    }
                    ((FloatBuffer) u0Var.f47824g).rewind();
                    GLES20.glEnableVertexAttribArray(n3Var3.f17625b);
                    nf.a.b("glEnableVertexAttribArray");
                    GLES20.glVertexAttribPointer(n3Var3.f17625b, 2, 5126, false, i12, (Buffer) u0Var.f47824g);
                    nf.a.b("glVertexAttribPointer");
                }
                u0Var.getClass();
                nf.a.b("glDrawArrays start");
                GLES20.glDrawArrays(5, 0, floatBuffer.limit() / drawable.f47410e);
                nf.a.b("glDrawArrays end");
                GLES20.glDisableVertexAttribArray(((n3) u0Var.f47826i).f17625b);
                n3 n3Var4 = (n3) u0Var.f47825h;
                if (n3Var4 != null) {
                    GLES20.glDisableVertexAttribArray(n3Var4.f17625b);
                }
                d5.o oVar3 = (d5.o) u0Var.f47829m;
                if (oVar3 != null) {
                    oVar3.j();
                }
                nf.a.b("onPostDraw end");
                return wj.r.f53297a;
            case 5:
                tk.w wVar = (tk.w) this.f4410g;
                tk.z zVar = (tk.z) this.f4411h;
                zk.g gVarE = ((pm.y) this.f4409f).P().e();
                if (!(gVarE instanceof zk.e)) {
                    throw new cn.c0("Supertype not a class: " + gVarE, 3);
                }
                Class clsJ = tk.v1.j((zk.e) gVarE);
                if (clsJ == null) {
                    throw new cn.c0("Unsupported superclass of " + wVar + ": " + gVarE, 3);
                }
                Class cls = zVar.f51095b;
                if (kotlin.jvm.internal.n.a(cls.getSuperclass(), clsJ)) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    kotlin.jvm.internal.n.e(genericSuperclass, "{\n                      …ass\n                    }");
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                kotlin.jvm.internal.n.e(interfaces, "jClass.interfaces");
                int iT0 = xj.k.t0(clsJ, interfaces);
                if (iT0 >= 0) {
                    Type type = cls.getGenericInterfaces()[iT0];
                    kotlin.jvm.internal.n.e(type, "{\n                      …ex]\n                    }");
                    return type;
                }
                throw new cn.c0("No superclass of " + wVar + " in Java reflection for " + gVarE, 3);
            default:
                List listD = (List) this.f4410g;
                com.google.android.gms.internal.auth.i iVar2 = ((xn.f) this.f4409f).f53945b;
                if (iVar2 != null) {
                    listD = iVar2.d(listD, (String) this.f4411h);
                }
                List<Certificate> list = listD;
                ArrayList arrayList = new ArrayList(xj.p.W(list, 10));
                for (Certificate certificate : list) {
                    kotlin.jvm.internal.n.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
        }
    }
}
