package am;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.MenuItem;
import android.view.Window;
import cl.b0;
import cl.f0;
import cl.l0;
import cl.n0;
import cl.o0;
import cl.p0;
import cl.x0;
import cl.z;
import cn.o1;
import cn.p1;
import cn.q1;
import com.adjust.sdk.t0;
import com.google.android.gms.internal.ads.t02;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ironsource.X3;
import ea.a1;
import ea.d0;
import ea.m1;
import ea.p2;
import ea.p3;
import ea.s0;
import ea.v1;
import ea.y1;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k.u;
import k.v;
import k6.c0;
import ml.w;
import ni.h;
import o.e0;
import o.x;
import p.b2;
import pm.y;
import zk.h0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class e implements zk.l, vj.a, x, k6.s, k6.a, c0, com.google.android.gms.common.api.internal.k, n6.h, b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3698b;

    public /* synthetic */ e(int i10, boolean z10) {
        this.f3697a = i10;
    }

    public static e G(String str) {
        return new e((TextUtils.isEmpty(str) || str.length() > 1) ? v1.UNINITIALIZED : y1.e(str.charAt(0)), 4);
    }

    public i1.c0 A(n2.l lVar, b3.g gVar, int i10) {
        int i11;
        l1.q qVar = (l1.q) this.f3698b;
        i1.c0 c0VarM = null;
        int i12 = 0;
        while (true) {
            int i13 = 0;
            while (true) {
                int i14 = i13 % 10;
                int i15 = i14 + 10;
                if (i14 == 0 && i13 != 0) {
                    byte[] bArr = qVar.f44813a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i16 = i13 == 0 ? 10 : 1;
                try {
                    lVar.peekFully(qVar.f44813a, i15 - i16, i16);
                    qVar.M(i14);
                    qVar.L(i15);
                    if (qVar.a() < 3) {
                        throw new IndexOutOfBoundsException("position=" + qVar.f44814b + ", limit=" + qVar.f44815c);
                    }
                    int iC = qVar.C();
                    i11 = qVar.f44814b - 3;
                    qVar.f44814b = i11;
                    if (iC == 4801587) {
                        break;
                    }
                    if (n2.b.k(qVar.i()) == -1) {
                        if (i13 == 0) {
                            qVar.c(20);
                        }
                        i13++;
                        if (i13 > i10) {
                        }
                    }
                    lVar.resetPeekPosition();
                    lVar.advancePeekPosition(i12);
                    return c0VarM;
                } catch (EOFException unused) {
                }
            }
            qVar.N(6);
            int iY = qVar.y();
            int i17 = iY + 10;
            if (c0VarM == null) {
                byte[] bArr2 = new byte[i17];
                System.arraycopy(qVar.f44813a, i11, bArr2, 0, 10);
                lVar.peekFully(bArr2, 10, iY);
                c0VarM = new b3.i(gVar).M(i17, bArr2);
            } else {
                lVar.advancePeekPosition(iY);
            }
            i12 += i17;
        }
    }

    public zk.e B(fl.n javaClass) {
        kotlin.jvm.internal.n.f(javaClass, "javaClass");
        yl.c cVarC = javaClass.c();
        Class cls = javaClass.f41001a;
        Class<?> declaringClass = cls.getDeclaringClass();
        fl.n nVar = declaringClass != null ? new fl.n(declaringClass) : null;
        if (nVar != null) {
            zk.e eVarB = B(nVar);
            im.n nVarN = eVarB != null ? eVarB.N() : null;
            zk.g gVarC = nVarN != null ? nVarN.c(yl.f.e(cls.getSimpleName()), hl.b.f42412h) : null;
            if (gVarC instanceof zk.e) {
                return (zk.e) gVarC;
            }
        } else {
            ml.r rVar = (ml.r) xj.n.q0(j1.f.C(((ll.d) this.f3698b).c(cVarC.e())));
            if (rVar != null) {
                w wVar = rVar.f46235j.f46168d;
                wVar.getClass();
                return wVar.v(yl.f.e(cls.getSimpleName()), javaClass);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b5  */
    public void C(zk.s sVar, StringBuilder sb2) throws IOException {
        String strY;
        boolean z10;
        h hVar = (h) this.f3698b;
        k kVar = hVar.f3709a;
        k kVar2 = hVar.f3709a;
        if (!hVar.r()) {
            wf.a aVar = kVar2.f3734g;
            qk.w[] wVarArr = k.W;
            if (!((Boolean) aVar.getValue(kVar2, wVarArr[5])).booleanValue()) {
                hVar.y(sb2, sVar, null);
                List listP0 = sVar.p0();
                kotlin.jvm.internal.n.e(listP0, "function.contextReceiverParameters");
                hVar.C(sb2, listP0);
                il.o visibility = sVar.getVisibility();
                kotlin.jvm.internal.n.e(visibility, "function.visibility");
                hVar.h0(visibility, sb2);
                hVar.M(sb2, sVar);
                if (((Boolean) kVar2.R.getValue(kVar2, wVarArr[42])).booleanValue()) {
                    hVar.K(sVar, sb2);
                }
                hVar.S(sb2, sVar);
                if (((Boolean) kVar2.R.getValue(kVar2, wVarArr[42])).booleanValue()) {
                    boolean z11 = false;
                    if (sVar.isOperator()) {
                        Collection collectionF = sVar.f();
                        kotlin.jvm.internal.n.e(collectionF, "functionDescriptor.overriddenDescriptors");
                        Collection collection = collectionF;
                        if (!collection.isEmpty()) {
                            Iterator it = collection.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((zk.s) it.next()).isOperator()) {
                                        if (!((Boolean) kVar2.N.getValue(kVar2, k.W[38])).booleanValue()) {
                                            z10 = false;
                                        }
                                    }
                                }
                            }
                        }
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (sVar.isInfix()) {
                        Collection collectionF2 = sVar.f();
                        kotlin.jvm.internal.n.e(collectionF2, "functionDescriptor.overriddenDescriptors");
                        Collection collection2 = collectionF2;
                        if (!collection2.isEmpty()) {
                            Iterator it2 = collection2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (((zk.s) it2.next()).isInfix()) {
                                        if (!((Boolean) kVar2.N.getValue(kVar2, k.W[38])).booleanValue()) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                z11 = true;
                                break;
                            }
                        }
                        z11 = true;
                        break;
                    }
                    hVar.N(sb2, sVar.x(), "tailrec");
                    hVar.N(sb2, sVar.isSuspend(), "suspend");
                    hVar.N(sb2, sVar.isInline(), "inline");
                    hVar.N(sb2, z11, "infix");
                    hVar.N(sb2, z10, "operator");
                } else {
                    hVar.N(sb2, sVar.isSuspend(), "suspend");
                }
                hVar.J(sb2, sVar);
                if (hVar.u()) {
                    if (sVar.s0()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (sVar.u0()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(hVar.I("fun"));
            sb2.append(" ");
            List typeParameters = sVar.getTypeParameters();
            kotlin.jvm.internal.n.e(typeParameters, "function.typeParameters");
            hVar.d0(typeParameters, sb2, true);
            hVar.V(sb2, sVar);
        }
        hVar.P(sVar, sb2, true);
        List listB = sVar.B();
        kotlin.jvm.internal.n.e(listB, "function.valueParameters");
        hVar.g0(listB, sVar.a0(), sb2);
        hVar.W(sb2, sVar);
        y returnType = sVar.getReturnType();
        wf.a aVar2 = kVar.l;
        qk.w[] wVarArr2 = k.W;
        if (!((Boolean) aVar2.getValue(kVar, wVarArr2[10])).booleanValue()) {
            if (((Boolean) kVar.f3738k.getValue(kVar, wVarArr2[9])).booleanValue() || returnType == null) {
                sb2.append(": ");
                if (returnType == null) {
                    strY = "[NULL]";
                } else {
                    strY = hVar.Y(returnType);
                }
                sb2.append(strY);
            } else {
                yl.f fVar = wk.h.f53310e;
                if (!wk.h.D(returnType, wk.l.f53341d)) {
                    sb2.append(": ");
                    if (returnType == null) {
                        strY = "[NULL]";
                    } else {
                        strY = hVar.Y(returnType);
                    }
                    sb2.append(strY);
                }
            }
        }
        List typeParameters2 = sVar.getTypeParameters();
        kotlin.jvm.internal.n.e(typeParameters2, "function.typeParameters");
        hVar.i0(sb2, typeParameters2);
    }

    public void D(l0 l0Var, StringBuilder sb2, String str) throws IOException {
        h hVar = (h) this.f3698b;
        k kVar = hVar.f3709a;
        int iOrdinal = ((p) kVar.G.getValue(kVar, k.W[31])).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                return;
            }
            C(l0Var, sb2);
        } else {
            hVar.K(l0Var, sb2);
            sb2.append(str.concat(" for "));
            h0 h0VarJ0 = l0Var.J0();
            kotlin.jvm.internal.n.e(h0VarJ0, "descriptor.correspondingProperty");
            h.n(hVar, h0VarJ0, sb2);
        }
    }

    public void E() {
        long jElapsedRealtime;
        p3 p3Var = (p3) this.f3698b;
        p3Var.G0();
        m1 m1Var = (m1) p3Var.f3623a;
        a1 a1Var = m1Var.f39586e;
        m1.f(a1Var);
        p9.b bVar = m1Var.f39592k;
        bVar.getClass();
        if (a1Var.P0(System.currentTimeMillis())) {
            a1 a1Var2 = m1Var.f39586e;
            m1.f(a1Var2);
            a1Var2.l.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                s0 s0Var = m1Var.f39587f;
                m1.h(s0Var);
                s0Var.f39760n.b("Detected application was in foreground");
                bVar.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (m1Var.f39585d.R0(null, d0.f39301e1)) {
                    bVar.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                } else {
                    jElapsedRealtime = 0;
                }
                H(jCurrentTimeMillis, jElapsedRealtime);
            }
        }
    }

    public void F(long j10, long j11) {
        p3 p3Var = (p3) this.f3698b;
        p3Var.G0();
        p3Var.K0();
        m1 m1Var = (m1) p3Var.f3623a;
        a1 a1Var = m1Var.f39586e;
        m1.f(a1Var);
        if (a1Var.P0(j10)) {
            m1.f(a1Var);
            a1Var.l.b(true);
            m1Var.m().L0();
        }
        m1.f(a1Var);
        a1Var.f39216p.f(j10);
        if (a1Var.l.a()) {
            H(j10, j11);
        }
    }

    public void H(long j10, long j11) {
        p3 p3Var = (p3) this.f3698b;
        p3Var.G0();
        m1 m1Var = (m1) p3Var.f3623a;
        if (m1Var.a()) {
            a1 a1Var = m1Var.f39586e;
            m1.f(a1Var);
            a1Var.f39216p.f(j10);
            m1Var.f39592k.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39760n.c(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j12 = j10 / 1000;
            Long lValueOf = Long.valueOf(j12);
            p2 p2Var = m1Var.f39593m;
            m1.g(p2Var);
            p2Var.R0(j10, lValueOf, "auto", "_sid");
            m1.f(a1Var);
            a1Var.f39217q.f(j12);
            a1Var.l.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j12);
            m1.g(p2Var);
            p2Var.O0(j10, j11, bundle, "auto", "_s");
            String strG = a1Var.f39222v.g();
            if (TextUtils.isEmpty(strG)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strG);
            m1.g(p2Var);
            p2Var.O0(j10, j11, bundle2, "auto", "_ssr");
        }
    }

    @Override // k6.s
    public k6.r M(k6.x xVar) {
        switch (this.f3697a) {
            case 13:
                return new k6.b(0, (AssetManager) this.f3698b, this);
            case 14:
                return new k6.b((Resources) this.f3698b, xVar.b(Uri.class, AssetFileDescriptor.class));
            default:
                return new k6.d0(this);
        }
    }

    @Override // zk.l
    public Object a(cl.k kVar, Object obj) {
        ((h) this.f3698b).b0(kVar, (StringBuilder) obj, true);
        return wj.r.f53297a;
    }

    @Override // com.google.android.gms.common.api.internal.k
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        m9.c cVar = (m9.c) ((m9.e) obj).getService();
        k9.o oVar = (k9.o) this.f3698b;
        cVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(cVar.f22790c);
        int i10 = x9.a.f53673a;
        if (oVar == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            oVar.writeToParcel(parcelObtain, 0);
        }
        try {
            cVar.f22789b.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // o.x
    public void b(o.m mVar, boolean z10) {
        u uVar;
        switch (this.f3697a) {
            case 12:
                v vVar = (v) this.f3698b;
                o.m mVarK = mVar.k();
                int i10 = 0;
                boolean z11 = mVarK != mVar;
                if (z11) {
                    mVar = mVarK;
                }
                u[] uVarArr = vVar.L;
                int length = uVarArr != null ? uVarArr.length : 0;
                while (true) {
                    if (i10 >= length) {
                        uVar = null;
                    } else {
                        uVar = uVarArr[i10];
                        if (uVar == null || uVar.f44154h != mVar) {
                            i10++;
                        }
                    }
                }
                if (uVar != null) {
                    if (!z11) {
                        vVar.r(uVar, z10);
                    } else {
                        vVar.o(uVar.f44147a, uVar, mVarK);
                        vVar.r(uVar, true);
                    }
                }
                break;
            default:
                if (mVar instanceof e0) {
                    ((e0) mVar).f46916z.k().c(false);
                }
                x xVar = ((p.j) this.f3698b).f47674e;
                if (xVar != null) {
                    xVar.b(mVar, z10);
                }
                break;
        }
    }

    @Override // n6.h
    public int c() {
        return i() | (i() << 8);
    }

    @Override // k6.c0
    public com.bumptech.glide.load.data.e d(Uri uri) {
        return new com.bumptech.glide.load.data.n(1, uri, (ContentResolver) this.f3698b);
    }

    @Override // zk.l
    public Object e(cl.d0 d0Var, Object obj) throws IOException {
        cl.l lVarY;
        String str;
        StringBuilder sb2 = (StringBuilder) obj;
        h hVar = (h) this.f3698b;
        k kVar = hVar.f3709a;
        boolean z10 = d0Var.l0() == 4;
        if (!hVar.r()) {
            hVar.y(sb2, d0Var, null);
            List listT = d0Var.T();
            kotlin.jvm.internal.n.e(listT, "klass.contextReceivers");
            hVar.C(sb2, listT);
            if (!z10) {
                il.o visibility = d0Var.getVisibility();
                kotlin.jvm.internal.n.e(visibility, "klass.visibility");
                hVar.h0(visibility, sb2);
            }
            if ((d0Var.l0() != 2 || d0Var.j() != 4) && (!wi.d.a(d0Var.l0()) || d0Var.j() != 1)) {
                int iJ = d0Var.j();
                d5.u.u(iJ, "klass.modality");
                hVar.L(sb2, iJ, h.v(d0Var));
            }
            hVar.K(d0Var, sb2);
            hVar.N(sb2, hVar.q().contains(i.f3717h) && d0Var.u(), "inner");
            hVar.N(sb2, hVar.q().contains(i.f3719j) && d0Var.x0(), "data");
            hVar.N(sb2, hVar.q().contains(i.f3720k) && d0Var.isInline(), "inline");
            hVar.N(sb2, hVar.q().contains(i.f3725q) && d0Var.e0(), X3.i.X);
            hVar.N(sb2, hVar.q().contains(i.f3724p) && d0Var.Y(), "fun");
            if (d0Var.W()) {
                str = "companion object";
            } else {
                int iC = v0.i.c(d0Var.l0());
                if (iC == 0) {
                    str = "class";
                } else if (iC == 1) {
                    str = "interface";
                } else if (iC == 2) {
                    str = "enum class";
                } else if (iC == 3) {
                    str = "enum entry";
                } else if (iC == 4) {
                    str = "annotation class";
                } else {
                    if (iC != 5) {
                        throw new aa.b((byte) 0, 20);
                    }
                    str = "object";
                }
            }
            sb2.append(hVar.I(str));
        }
        if (bm.e.l(d0Var)) {
            if (((Boolean) kVar.F.getValue(kVar, k.W[30])).booleanValue()) {
                if (hVar.r()) {
                    sb2.append("companion object");
                }
                h.X(sb2);
                zk.j jVarE = d0Var.e();
                if (jVarE != null) {
                    sb2.append("of ");
                    yl.f name = jVarE.getName();
                    kotlin.jvm.internal.n.e(name, "containingDeclaration.name");
                    sb2.append(hVar.O(name, false));
                }
            }
            if (hVar.u() || !kotlin.jvm.internal.n.a(d0Var.getName(), yl.h.f54518b)) {
                if (!hVar.r()) {
                    h.X(sb2);
                }
                yl.f name2 = d0Var.getName();
                kotlin.jvm.internal.n.e(name2, "descriptor.name");
                sb2.append(hVar.O(name2, true));
            }
        } else {
            if (!hVar.r()) {
                h.X(sb2);
            }
            hVar.P(d0Var, sb2, true);
        }
        if (!z10) {
            List listI = d0Var.i();
            kotlin.jvm.internal.n.e(listI, "klass.declaredTypeParameters");
            hVar.d0(listI, sb2, false);
            hVar.A(d0Var, sb2);
            if (!wi.d.a(d0Var.l0()) && ((Boolean) kVar.f3736i.getValue(kVar, k.W[7])).booleanValue() && (lVarY = d0Var.y()) != null) {
                sb2.append(" ");
                hVar.y(sb2, lVarY, null);
                cl.l lVar = lVarY;
                il.o visibility2 = lVar.getVisibility();
                kotlin.jvm.internal.n.e(visibility2, "primaryConstructor.visibility");
                hVar.h0(visibility2, sb2);
                sb2.append(hVar.I("constructor"));
                List listB = lVar.B();
                kotlin.jvm.internal.n.e(listB, "primaryConstructor.valueParameters");
                hVar.g0(listB, lVarY.a0(), sb2);
            }
            if (!((Boolean) kVar.f3749w.getValue(kVar, k.W[21])).booleanValue() && !wk.h.E(d0Var.g())) {
                Collection collectionF = d0Var.n().f();
                kotlin.jvm.internal.n.e(collectionF, "klass.typeConstructor.supertypes");
                if (!collectionF.isEmpty() && (collectionF.size() != 1 || !wk.h.x((y) collectionF.iterator().next()))) {
                    h.X(sb2);
                    sb2.append(": ");
                    xj.n.t0(collectionF, sb2, ", ", null, null, new f(hVar, 2), 60);
                }
            }
            hVar.i0(sb2, listI);
        }
        return wj.r.f53297a;
    }

    @Override // zk.l
    public Object f(cl.h0 h0Var, Object obj) {
        StringBuilder sb2 = (StringBuilder) obj;
        h hVar = (h) this.f3698b;
        hVar.getClass();
        hVar.T(h0Var.f6518e, "package-fragment", sb2);
        if (hVar.f3709a.n()) {
            sb2.append(" in ");
            hVar.P(h0Var.e(), sb2, false);
        }
        return wj.r.f53297a;
    }

    public void g(int i10, boolean z10) {
        t02 t02Var = (t02) this.f3698b;
        if (z10) {
            t02Var.a(i10);
        } else {
            t02Var.getClass();
        }
    }

    @Override // vj.a
    public Object get() {
        tc.b bVar = (tc.b) ((k5.g) this.f3698b).f44328d;
        com.bumptech.glide.d.j(bVar);
        return bVar;
    }

    @Override // n6.h
    public int h(int i10, byte[] bArr) throws n6.g {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10 && (i12 = ((InputStream) this.f3698b).read(bArr, i11, i10 - i11)) != -1) {
            i11 += i12;
        }
        if (i11 == 0 && i12 == -1) {
            throw new n6.g();
        }
        return i11;
    }

    @Override // n6.h
    public short i() throws IOException {
        int i10 = ((InputStream) this.f3698b).read();
        if (i10 != -1) {
            return (short) i10;
        }
        throw new n6.g();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0043  */
    @Override // zk.l
    public Object j(cl.l lVar, Object obj) throws IOException {
        boolean z10;
        cl.l lVarY;
        boolean z11 = lVar.D;
        StringBuilder sb2 = (StringBuilder) obj;
        h hVar = (h) this.f3698b;
        hVar.getClass();
        hVar.y(sb2, lVar, null);
        k kVar = hVar.f3709a;
        wf.a aVar = kVar.f3741o;
        qk.w[] wVarArr = k.W;
        if (((Boolean) aVar.getValue(kVar, wVarArr[13])).booleanValue() || lVar.X().j() != 2) {
            il.o visibility = lVar.getVisibility();
            kotlin.jvm.internal.n.e(visibility, "constructor.visibility");
            if (hVar.h0(visibility, sb2)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        hVar.J(sb2, lVar);
        boolean z12 = ((Boolean) kVar.O.getValue(kVar, wVarArr[39])).booleanValue() || !z11 || z10;
        if (z12) {
            sb2.append(hVar.I("constructor"));
        }
        zk.e eVarV0 = lVar.e();
        kotlin.jvm.internal.n.e(eVarV0, "constructor.containingDeclaration");
        if (((Boolean) kVar.f3752z.getValue(kVar, wVarArr[24])).booleanValue()) {
            if (z12) {
                sb2.append(" ");
            }
            hVar.P(eVarV0, sb2, true);
            hVar.d0(lVar.getTypeParameters(), sb2, false);
        }
        List listB = lVar.B();
        kotlin.jvm.internal.n.e(listB, "constructor.valueParameters");
        hVar.g0(listB, lVar.a0(), sb2);
        if (((Boolean) kVar.f3743q.getValue(kVar, wVarArr[15])).booleanValue() && !z11 && (lVarY = eVarV0.y()) != null) {
            List listB2 = lVarY.B();
            kotlin.jvm.internal.n.e(listB2, "primaryConstructor.valueParameters");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listB2) {
                x0 x0Var = (x0) obj2;
                if (!x0Var.K0() && x0Var.f6635j == null) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                sb2.append(" : ");
                sb2.append(hVar.I("this"));
                sb2.append(xj.n.u0(arrayList, ", ", "(", ")", g.f3701f, 24));
            }
        }
        if (((Boolean) kVar.f3752z.getValue(kVar, k.W[24])).booleanValue()) {
            hVar.i0(sb2, lVar.getTypeParameters());
        }
        return wj.r.f53297a;
    }

    @Override // k6.a
    public com.bumptech.glide.load.data.e k(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.k(assetManager, str, 1);
    }

    @Override // zk.l
    public Object l(o0 o0Var, Object obj) throws IOException {
        D(o0Var, (StringBuilder) obj, "getter");
        return wj.r.f53297a;
    }

    @Override // zk.l
    public /* bridge */ /* synthetic */ Object m(zk.s sVar, Object obj) throws IOException {
        C(sVar, (StringBuilder) obj);
        return wj.r.f53297a;
    }

    @Override // zk.l
    public Object n(z zVar, Object obj) {
        ((StringBuilder) obj).append(zVar.getName());
        return wj.r.f53297a;
    }

    @Override // zk.l
    public Object o(x0 x0Var, Object obj) {
        ((h) this.f3698b).f0(x0Var, true, (StringBuilder) obj, true);
        return wj.r.f53297a;
    }

    @Override // zk.l
    public Object p(f0 f0Var, Object obj) {
        ((h) this.f3698b).P(f0Var, (StringBuilder) obj, true);
        return wj.r.f53297a;
    }

    @Override // p.b2
    public void q(o.m mVar, MenuItem menuItem) {
        ((o.g) this.f3698b).f46924f.removeCallbacksAndMessages(mVar);
    }

    @Override // zk.l
    public Object r(n0 descriptor, Object obj) throws IOException {
        kotlin.jvm.internal.n.f(descriptor, "descriptor");
        h.n((h) this.f3698b, descriptor, (StringBuilder) obj);
        return wj.r.f53297a;
    }

    @Override // zk.l
    public Object s(p0 p0Var, Object obj) throws IOException {
        D(p0Var, (StringBuilder) obj, "setter");
        return wj.r.f53297a;
    }

    @Override // n6.h
    public long skip(long j10) throws IOException {
        InputStream inputStream = (InputStream) this.f3698b;
        if (j10 < 0) {
            return 0L;
        }
        long j11 = j10;
        while (j11 > 0) {
            long jSkip = inputStream.skip(j11);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j11 -= jSkip;
        }
        return j10 - j11;
    }

    @Override // p.b2
    public void t(o.m mVar, o.o oVar) {
        o.g gVar = (o.g) this.f3698b;
        Handler handler = gVar.f46924f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.f46926h;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (mVar == ((o.f) arrayList.get(i10)).f46918b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        handler.postAtTime(new t0(this, i11 < arrayList.size() ? (o.f) arrayList.get(i11) : null, oVar, mVar, 11), mVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // o.x
    public boolean u(o.m mVar) {
        Window.Callback callback;
        switch (this.f3697a) {
            case 12:
                v vVar = (v) this.f3698b;
                if (mVar != mVar.k() || !vVar.F || (callback = vVar.l.getCallback()) == null || vVar.Q) {
                    return true;
                }
                callback.onMenuOpened(108, mVar);
                return true;
            default:
                p.j jVar = (p.j) this.f3698b;
                if (mVar == jVar.f47672c) {
                    return false;
                }
                ((e0) mVar).A.getClass();
                jVar.getClass();
                x xVar = jVar.f47674e;
                if (xVar != null) {
                    return xVar.u(mVar);
                }
                return false;
        }
    }

    @Override // zk.l
    public Object v(b0 b0Var, Object obj) {
        StringBuilder sb2 = (StringBuilder) obj;
        h hVar = (h) this.f3698b;
        hVar.getClass();
        hVar.T(b0Var.f6480d, "package", sb2);
        if (hVar.f3709a.n()) {
            sb2.append(" in context of ");
            hVar.P(b0Var.f6479c, sb2, false);
        }
        return wj.r.f53297a;
    }

    @Override // zk.l
    public Object w(nm.s sVar, Object obj) {
        StringBuilder sb2 = (StringBuilder) obj;
        h hVar = (h) this.f3698b;
        hVar.getClass();
        hVar.y(sb2, sVar, null);
        il.o oVar = sVar.f46858e;
        kotlin.jvm.internal.n.e(oVar, "typeAlias.visibility");
        hVar.h0(oVar, sb2);
        hVar.K(sVar, sb2);
        sb2.append(hVar.I("typealias"));
        sb2.append(" ");
        hVar.P(sVar, sb2, true);
        hVar.d0(sVar.i(), sb2, false);
        hVar.A(sVar, sb2);
        sb2.append(" = ");
        sb2.append(hVar.Y(sVar.L0()));
        return wj.r.f53297a;
    }

    public Bitmap x(ByteBuffer byteBuffer, y2 y2Var) {
        try {
            return ImageDecoder.decodeBitmap(ImageDecoder.createSource(byteBuffer), new ImageDecoder.OnHeaderDecodedListener() { // from class: qi.a
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                    imageDecoder.setAllocator(1);
                    h hVar = (h) this.f49023a.f3698b;
                    if (hVar != null) {
                        Size size = imageInfo.getSize();
                        FlutterJNI.nativeImageHeaderCallback(hVar.f46766a, size.getWidth(), size.getHeight());
                    }
                }
            });
        } catch (IOException e10) {
            Log.e("FlutterImageDecoderImplDefault", "Failed to decode image", e10);
            return null;
        }
    }

    public String y(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            oc.d dVar = (oc.d) this.f3698b;
            oc.e eVar = new oc.e(stringWriter, dVar.f47370a, dVar.f47371b, dVar.f47372c, dVar.f47373d);
            eVar.h(obj);
            eVar.j();
            eVar.f47375b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public Iterator z(com.google.android.gms.common.api.internal.m mVar, CharSequence charSequence) {
        return new na.q(this, mVar, charSequence);
    }

    public /* synthetic */ e(Object obj, int i10) {
        this.f3697a = i10;
        this.f3698b = obj;
    }

    public e(int i10) {
        this.f3697a = i10;
        switch (i10) {
            case 9:
                this.f3698b = new t02(1);
                break;
            case 11:
                this.f3698b = new CopyOnWriteArrayList();
                break;
            case 20:
                this.f3698b = new l1.q(10);
                break;
            default:
                this.f3698b = Handler.createAsync(Looper.getMainLooper());
                break;
        }
    }

    public e(ArrayList arrayList) {
        this.f3697a = 2;
        this.f3698b = Collections.unmodifiableList(arrayList);
    }

    public e(q1 q1Var) {
        this.f3697a = 16;
        o1 o1Var = o1.f6752b;
        p1 p1Var = p1.f6754b;
        this.f3698b = q1Var;
    }
}
