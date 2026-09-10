package eb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.p0;
import androidx.recyclerview.widget.p1;
import b2.l0;
import b2.o0;
import com.google.android.gms.internal.ads.zs;
import com.google.android.gms.internal.play_billing.q1;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ea.f2;
import f2.b1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;
import jb.a1;
import oa.n1;
import org.json.JSONObject;
import pm.n0;
import pm.q0;
import pm.r0;
import tl.v0;
import tl.y0;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements f0, n2.m, xi.n, qm.b, d9.d, d5.t, com.bumptech.glide.load.data.d, SuccessContinuation, ic.a, io.flutter.plugin.platform.h, wi.i, hb.c, OnCompleteListener, lm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f39976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f39977c;

    public /* synthetic */ d0(int i10, Object obj, Object obj2) {
        this.f39975a = i10;
        this.f39977c = obj;
        this.f39976b = obj2;
    }

    public static String Q0(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public static d0 R0(a1 a1Var) {
        return new d0(0, a1Var, j0.c(a1Var.D()));
    }

    @Override // qm.b
    public pm.a1 A(ArrayList arrayList) {
        pm.c0 c0Var;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (pm.a1) xj.n.F0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(xj.p.W(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            pm.a1 a1Var = (pm.a1) it.next();
            z10 = z10 || pm.c.j(a1Var);
            if (a1Var instanceof pm.c0) {
                c0Var = (pm.c0) a1Var;
            } else {
                if (!(a1Var instanceof pm.r)) {
                    throw new aa.b((byte) 0, 20);
                }
                c0Var = ((pm.r) a1Var).f48470b;
                z11 = true;
            }
            arrayList2.add(c0Var);
        }
        if (z10) {
            return rm.i.c(rm.h.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        qm.u uVar = qm.u.f49202a;
        if (!z11) {
            return uVar.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(xj.p.W(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(pm.c.z((pm.a1) it2.next()));
        }
        return pm.f.j(uVar.b(arrayList2), uVar.b(arrayList3));
    }

    @Override // qm.b
    public boolean A0(sm.f c4, sm.f c5) {
        kotlin.jvm.internal.n.f(c4, "c1");
        kotlin.jvm.internal.n.f(c5, "c2");
        if (!(c4 instanceof n0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!(c5 instanceof n0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (qm.g.b(c4, c5)) {
            return true;
        }
        n0 n0Var = (n0) c4;
        n0 n0Var2 = (n0) c5;
        Map map = (Map) this.f39976b;
        if (((qm.c) this.f39977c).a(n0Var, n0Var2)) {
            return true;
        }
        if (map == null) {
            return false;
        }
        n0 n0Var3 = (n0) map.get(n0Var);
        n0 n0Var4 = (n0) map.get(n0Var2);
        if (n0Var3 == null || !n0Var3.equals(n0Var2)) {
            return n0Var4 != null && n0Var4.equals(n0Var);
        }
        return true;
    }

    @Override // lm.c
    public List B(lm.u container, tl.t tVar) {
        kotlin.jvm.internal.n.f(container, "container");
        Iterable iterable = (List) tVar.n(((km.a) this.f39976b).f44723h);
        if (iterable == null) {
            iterable = xj.v.f53866a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(xj.p.W(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((f2) this.f39977c).d((tl.g) it.next(), container.f45591a));
        }
        return arrayList;
    }

    @Override // wi.i
    public void B0(int i10) {
        io.flutter.plugin.platform.m mVar = (io.flutter.plugin.platform.m) this.f39977c;
        if (mVar.b0(i10) != null) {
            mVar.f43350p.B0(i10);
        } else {
            ((io.flutter.plugin.platform.n) this.f39976b).f43373w.B0(i10);
        }
    }

    @Override // qm.b
    public pm.c0 C(pm.r rVar) {
        return qm.g.Y(rVar);
    }

    @Override // qm.b
    public n0 C0(sm.d dVar) {
        return qm.g.W(dVar);
    }

    @Override // qm.b
    public boolean D(sm.f fVar) {
        return qm.g.D(fVar);
    }

    @Override // qm.b
    public boolean D0(sm.f fVar) {
        return qm.g.z(fVar);
    }

    @Override // qm.b
    public sm.c E(sm.c cVar) {
        return qm.g.a0(this, cVar);
    }

    @Override // io.flutter.plugin.platform.h
    public void E0() {
        ((io.flutter.plugin.platform.n) this.f39976b).E0();
        ((io.flutter.plugin.platform.m) this.f39977c).E0();
    }

    @Override // qm.b
    public boolean F(sm.f fVar) {
        return qm.g.x(fVar);
    }

    @Override // lm.a
    public Object F0(lm.u uVar, tl.g0 proto, pm.y yVar) {
        kotlin.jvm.internal.n.f(proto, "proto");
        return null;
    }

    @Override // qm.b
    public void G(sm.c cVar) {
        kotlin.jvm.internal.n.f(cVar, "<this>");
        qm.g.g(cVar);
    }

    @Override // qm.b
    public int G0(sm.b bVar) {
        return qm.g.k(bVar);
    }

    @Override // qm.b
    public q0 H(cm.b bVar) {
        return qm.g.T(bVar);
    }

    @Override // qm.b
    public boolean H0(sm.d dVar) {
        kotlin.jvm.internal.n.f(dVar, "<this>");
        pm.c0 c0VarH = qm.g.h(dVar);
        return (c0VarH != null ? qm.g.e(this, c0VarH) : null) != null;
    }

    @Override // qm.b
    public pm.c0 I(sm.c cVar) {
        pm.c0 c0VarY;
        kotlin.jvm.internal.n.f(cVar, "<this>");
        pm.r rVarG = qm.g.g(cVar);
        if (rVarG != null && (c0VarY = qm.g.Y(rVarG)) != null) {
            return c0VarY;
        }
        pm.c0 c0VarH = qm.g.h(cVar);
        kotlin.jvm.internal.n.c(c0VarH);
        return c0VarH;
    }

    @Override // qm.b
    public Collection I0(sm.f fVar) {
        return qm.g.V(fVar);
    }

    @Override // qm.b
    public r0 J(sm.c cVar) {
        return qm.g.i(cVar);
    }

    @Override // qm.b
    public boolean J0(sm.f fVar) {
        return qm.g.G(fVar);
    }

    @Override // wi.i
    public void K(int i10) {
        io.flutter.plugin.platform.m mVar = (io.flutter.plugin.platform.m) this.f39977c;
        if (mVar.b0(i10) != null) {
            mVar.f43350p.K(i10);
        } else {
            ((io.flutter.plugin.platform.n) this.f39976b).f43373w.K(i10);
        }
    }

    @Override // qm.b
    public int K0(sm.f fVar) {
        return qm.g.R(fVar);
    }

    @Override // qm.b
    public int L(m0 receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        int iV = receiver.v();
        d5.u.u(iV, "this.variance");
        return j1.f.i(iV);
    }

    @Override // qm.b
    public pm.a1 L0(sm.b bVar) {
        return qm.g.O(bVar);
    }

    @Override // qm.b
    public void M(sm.d dVar) {
        qm.g.L(dVar);
    }

    @Override // qm.b
    public pm.c0 M0(sm.d dVar, boolean z10) {
        return qm.g.Z(dVar, z10);
    }

    @Override // qm.b
    public int N(q0 q0Var) {
        return qm.g.t(q0Var);
    }

    @Override // qm.b
    public boolean N0(sm.f fVar) {
        return qm.g.E(fVar);
    }

    @Override // lm.c
    public ArrayList O(v0 proto, vl.f nameResolver) {
        kotlin.jvm.internal.n.f(proto, "proto");
        kotlin.jvm.internal.n.f(nameResolver, "nameResolver");
        Iterable iterable = (List) proto.n(((km.a) this.f39976b).l);
        if (iterable == null) {
            iterable = xj.v.f53866a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(xj.p.W(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((f2) this.f39977c).d((tl.g) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // qm.b
    public sm.b O0(sm.d dVar) {
        return qm.g.e(this, dVar);
    }

    @Override // lm.c
    public List P(lm.u uVar, zl.a proto, int i10) {
        String str;
        km.a aVar = (km.a) this.f39976b;
        kotlin.jvm.internal.n.f(proto, "proto");
        d5.u.n(i10, "kind");
        if (proto instanceof tl.y) {
            aVar.getClass();
        } else {
            if (!(proto instanceof tl.g0)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int iC = v0.i.c(i10);
            if (iC != 1 && iC != 2 && iC != 3) {
                if (i10 == 1) {
                    str = "FUNCTION";
                } else if (i10 == 2) {
                    str = "PROPERTY";
                } else if (i10 != 3) {
                    str = i10 != 4 ? "null" : "PROPERTY_SETTER";
                } else {
                    str = "PROPERTY_GETTER";
                }
                throw new IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(str).toString());
            }
            aVar.getClass();
        }
        xj.v vVar = xj.v.f53866a;
        ArrayList arrayList = new ArrayList(xj.p.W(vVar, 10));
        Iterator<E> it = vVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((f2) this.f39977c).d((tl.g) it.next(), uVar.f45591a));
        }
        return arrayList;
    }

    public void P0(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.f39976b).add(q4.a.j(new StringBuilder(length + 1 + strValueOf.length()), str, X3.j.f27830b, strValueOf));
    }

    @Override // lm.c
    public ArrayList Q(tl.q0 proto, vl.f nameResolver) {
        kotlin.jvm.internal.n.f(proto, "proto");
        kotlin.jvm.internal.n.f(nameResolver, "nameResolver");
        Iterable iterable = (List) proto.n(((km.a) this.f39976b).f44726k);
        if (iterable == null) {
            iterable = xj.v.f53866a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(xj.p.W(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((f2) this.f39977c).d((tl.g) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // qm.b
    public Set R(sm.d dVar) {
        return qm.g.S(this, dVar);
    }

    @Override // qm.b
    public q0 S(sm.c cVar, int i10) {
        return qm.g.p(cVar, i10);
    }

    public View S0(int i10, int i11, int i12, int i13) {
        View viewU;
        p1 p1Var = (p1) this.f39977c;
        p0 p0Var = (p0) this.f39976b;
        int iD = p0Var.d();
        int iC = p0Var.c();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            switch (p0Var.f4881a) {
                case 0:
                    viewU = p0Var.f4882b.u(i10);
                    break;
                default:
                    viewU = p0Var.f4882b.u(i10);
                    break;
            }
            int iB = p0Var.b(viewU);
            int iA = p0Var.a(viewU);
            p1Var.f4884b = iD;
            p1Var.f4885c = iC;
            p1Var.f4886d = iB;
            p1Var.f4887e = iA;
            if (i12 != 0) {
                p1Var.f4883a = i12;
                if (p1Var.a()) {
                    return viewU;
                }
            }
            if (i13 != 0) {
                p1Var.f4883a = i13;
                if (p1Var.a()) {
                    view = viewU;
                }
            }
            i10 += i14;
        }
        return view;
    }

    @Override // qm.b
    public pm.a1 T(q0 q0Var) {
        return qm.g.r(q0Var);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0103  */
    /* JADX WARN: Code duplicated, block: B:58:0x010b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0111  */
    /* JADX WARN: Code duplicated, block: B:61:0x0119  */
    /* JADX WARN: Code duplicated, block: B:62:0x011f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0127  */
    /* JADX WARN: Code duplicated, block: B:65:0x012d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0135  */
    public ae.r T0(fe.a aVar, boolean z10) {
        ae.r rVar;
        String str;
        ae.r aVar2;
        final Type type = aVar.f40810b;
        Class cls = aVar.f40809a;
        HashMap map = (HashMap) this.f39976b;
        if (map.get(type) != null) {
            throw new ClassCastException();
        }
        if (map.get(cls) != null) {
            throw new ClassCastException();
        }
        final int i10 = 1;
        final int i11 = 0;
        ae.b bVar = null;
        if (EnumSet.class.isAssignableFrom(cls)) {
            rVar = new ae.r() { // from class: ae.c
                @Override // ae.r
                public final Object d() {
                    switch (i11) {
                        case 0:
                            Type type2 = type;
                            if (!(type2 instanceof ParameterizedType)) {
                                throw new com.google.gson.h("Invalid EnumSet type: " + type2.toString());
                            }
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type3 instanceof Class) {
                                return EnumSet.noneOf((Class) type3);
                            }
                            throw new com.google.gson.h("Invalid EnumSet type: " + type2.toString());
                        default:
                            Type type4 = type;
                            if (!(type4 instanceof ParameterizedType)) {
                                throw new com.google.gson.h("Invalid EnumMap type: " + type4.toString());
                            }
                            Type type5 = ((ParameterizedType) type4).getActualTypeArguments()[0];
                            if (type5 instanceof Class) {
                                return new EnumMap((Class) type5);
                            }
                            throw new com.google.gson.h("Invalid EnumMap type: " + type4.toString());
                    }
                }
            };
        } else {
            rVar = cls == EnumMap.class ? new ae.r() { // from class: ae.c
                @Override // ae.r
                public final Object d() {
                    switch (i10) {
                        case 0:
                            Type type2 = type;
                            if (!(type2 instanceof ParameterizedType)) {
                                throw new com.google.gson.h("Invalid EnumSet type: " + type2.toString());
                            }
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type3 instanceof Class) {
                                return EnumSet.noneOf((Class) type3);
                            }
                            throw new com.google.gson.h("Invalid EnumSet type: " + type2.toString());
                        default:
                            Type type4 = type;
                            if (!(type4 instanceof ParameterizedType)) {
                                throw new com.google.gson.h("Invalid EnumMap type: " + type4.toString());
                            }
                            Type type5 = ((ParameterizedType) type4).getActualTypeArguments()[0];
                            if (type5 instanceof Class) {
                                return new EnumMap((Class) type5);
                            }
                            throw new com.google.gson.h("Invalid EnumMap type: " + type4.toString());
                    }
                }
            } : null;
        }
        if (rVar != null) {
            return rVar;
        }
        ae.i.e((ArrayList) this.f39977c);
        int i12 = 3;
        if (Modifier.isAbstract(cls.getModifiers())) {
            aVar2 = null;
        } else {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                com.bumptech.glide.c cVar = de.c.f38839a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e10) {
                    str = "Failed making constructor '" + de.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e10.getMessage() + de.c.e(e10);
                }
                aVar2 = str != null ? new ae.a(str, i10) : new a4.a(declaredConstructor, i12);
            } catch (NoSuchMethodException unused) {
                aVar2 = null;
            }
        }
        if (aVar2 != null) {
            return aVar2;
        }
        int i13 = 2;
        int i14 = 4;
        if (Collection.class.isAssignableFrom(cls)) {
            if (cls.isAssignableFrom(ArrayList.class)) {
                bVar = new ae.b(i14);
            } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
                bVar = new ae.b(5);
            } else if (cls.isAssignableFrom(TreeSet.class)) {
                bVar = new ae.b(6);
            } else if (cls.isAssignableFrom(ArrayDeque.class)) {
                bVar = new ae.b(7);
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (cls.isAssignableFrom(ae.q.class)) {
                if (type instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    if (actualTypeArguments.length == 0 || ae.i.g(actualTypeArguments[0]) != String.class) {
                        if (cls.isAssignableFrom(LinkedHashMap.class)) {
                            bVar = new ae.b(i11);
                        } else if (cls.isAssignableFrom(TreeMap.class)) {
                            bVar = new ae.b(i10);
                        } else if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
                            bVar = new ae.b(i13);
                        } else if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
                            bVar = new ae.b(i12);
                        }
                    }
                }
                bVar = new ae.b(8);
            } else if (cls.isAssignableFrom(LinkedHashMap.class)) {
                bVar = new ae.b(i11);
            } else if (cls.isAssignableFrom(TreeMap.class)) {
                bVar = new ae.b(i10);
            } else if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
                bVar = new ae.b(i13);
            } else if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
                bVar = new ae.b(i12);
            }
        }
        if (bVar != null) {
            return bVar;
        }
        String strQ0 = Q0(cls);
        if (strQ0 != null) {
            return new ae.a(strQ0, i11);
        }
        if (z10) {
            return new a4.a(cls, i14);
        }
        return new ae.a("Unable to create instance of " + cls + "; Register an InstanceCreator or a TypeAdapter for this type.", i13);
    }

    @Override // qm.b
    public q0 U(sm.d dVar, int i10) {
        kotlin.jvm.internal.n.f(dVar, "<this>");
        if (i10 < 0 || i10 >= qm.g.c(dVar)) {
            return null;
        }
        return qm.g.p(dVar, i10);
    }

    public String U0(e6.f fVar) {
        String str;
        synchronized (((a7.l) this.f39976b)) {
            str = (String) ((a7.l) this.f39976b).a(fVar);
        }
        if (str == null) {
            i6.g gVar = (i6.g) ((v9.e) this.f39977c).g();
            try {
                fVar.b(gVar.f42902a);
                byte[] bArrDigest = gVar.f42902a.digest();
                char[] cArr = a7.p.f3445b;
                synchronized (cArr) {
                    for (int i10 = 0; i10 < bArrDigest.length; i10++) {
                        byte b10 = bArrDigest[i10];
                        int i11 = i10 * 2;
                        char[] cArr2 = a7.p.f3444a;
                        cArr[i11] = cArr2[(b10 & 255) >>> 4];
                        cArr[i11 + 1] = cArr2[b10 & 15];
                    }
                    str = new String(cArr);
                }
                ((v9.e) this.f39977c).e(gVar);
            } catch (Throwable th2) {
                ((v9.e) this.f39977c).e(gVar);
                throw th2;
            }
        }
        synchronized (((a7.l) this.f39976b)) {
            ((a7.l) this.f39976b).e(fVar, str);
        }
        return str;
    }

    @Override // qm.b
    public boolean V(sm.d dVar) {
        return qm.g.B(dVar);
    }

    public boolean V0(View view) {
        p1 p1Var = (p1) this.f39977c;
        p0 p0Var = (p0) this.f39976b;
        int iD = p0Var.d();
        int iC = p0Var.c();
        int iB = p0Var.b(view);
        int iA = p0Var.a(view);
        p1Var.f4884b = iD;
        p1Var.f4885c = iC;
        p1Var.f4886d = iB;
        p1Var.f4887e = iA;
        p1Var.f4883a = 24579;
        return p1Var.a();
    }

    @Override // qm.b
    public boolean W(sm.b bVar) {
        return qm.g.J(bVar);
    }

    public void W0(f2 f2Var) {
        b2.q qVar = (b2.q) this.f39977c;
        l0 l0VarA = l0.f5321c;
        String str = (String) ((o0) f2Var.f39410c).f5351a.get("range");
        if (str != null) {
            try {
                l0VarA = l0.a(str);
            } catch (i1.e0 e10) {
                qVar.f5370a.f("SDP format error.", e10);
                return;
            }
        }
        Uri uri = qVar.f5377h;
        b2.t tVar = qVar.f5370a;
        oa.q.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            n1 n1Var = ((o0) f2Var.f39410c).f5352b;
            if (i10 >= n1Var.f47283d) {
                n1 n1VarT = oa.j0.t(i11, objArrCopyOf);
                if (n1VarT.isEmpty()) {
                    tVar.f("No playable track.", null);
                    return;
                }
                tVar.getClass();
                long j10 = l0VarA.f5324b;
                b2.x xVar = (b2.x) tVar.f5398b;
                for (int i12 = 0; i12 < n1VarT.f47283d; i12++) {
                    b2.v vVar = new b2.v(xVar, (b2.c0) n1VarT.get(i12), i12, xVar.f5419h);
                    xVar.f5416e.add(vVar);
                    vVar.f5404b.e(vVar.f5403a.f5400b, xVar.f5414c, 0);
                }
                b2.b0 b0Var = (b2.b0) xVar.f5418g.f3698b;
                b0Var.l = l1.y.M(j10 - l0VarA.f5323a);
                b0Var.f5228m = !(j10 == C.TIME_UNSET);
                b0Var.f5229n = j10 == C.TIME_UNSET;
                b0Var.f5230o = false;
                b0Var.x();
                qVar.f5384p = true;
                return;
            }
            b2.c cVar = (b2.c) n1Var.get(i10);
            String strH = q1.H(cVar.f5241j.f5221b);
            strH.getClass();
            switch (strH) {
                case "MPEG4-GENERIC":
                case "L8":
                case "AC3":
                case "AMR":
                case "L16":
                case "VP8":
                case "VP9":
                case "H264":
                case "H265":
                case "OPUS":
                case "PCMA":
                case "PCMU":
                case "MP4A-LATM":
                case "AMR-WB":
                case "MP4V-ES":
                case "H263-1998":
                case "H263-2000":
                    b2.c0 c0Var = new b2.c0((b2.r) f2Var.f39409b, cVar, uri);
                    int i13 = i11 + 1;
                    int iF = oa.b0.f(objArrCopyOf.length, i13);
                    if (iF > objArrCopyOf.length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF);
                    }
                    objArrCopyOf[i11] = c0Var;
                    i11 = i13;
                    break;
            }
            i10++;
        }
    }

    @Override // qm.b
    public boolean X(sm.d dVar) {
        kotlin.jvm.internal.n.f(dVar, "<this>");
        return qm.g.D(qm.g.W(dVar));
    }

    public void X0() {
        b2.q qVar = (b2.q) this.f39977c;
        go.k.t(qVar.f5383o == 2);
        qVar.f5383o = 1;
        qVar.f5386r = false;
        long j10 = qVar.f5387s;
        if (j10 != C.TIME_UNSET) {
            qVar.k(l1.y.Z(j10));
        }
    }

    public void Y0(x xVar) throws GeneralSecurityException {
        HashMap map = (HashMap) this.f39976b;
        if (xVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        z zVar = new z(xVar.f40018a, xVar.f40019b);
        if (!map.containsKey(zVar)) {
            map.put(zVar, xVar);
            return;
        }
        x xVar2 = (x) map.get(zVar);
        if (xVar2.equals(xVar) && xVar.equals(xVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + zVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qm.b
    public q0 Z(sm.e eVar, int i10) {
        kotlin.jvm.internal.n.f(eVar, "<this>");
        if (eVar instanceof sm.d) {
            return qm.g.p((sm.c) eVar, i10);
        }
        if (eVar instanceof sm.a) {
            E e10 = ((sm.a) eVar).get(i10);
            kotlin.jvm.internal.n.e(e10, "get(index)");
            return (q0) e10;
        }
        throw new IllegalStateException(("unknown type argument list type: " + eVar + ", " + kotlin.jvm.internal.d0.f44761a.b(eVar.getClass())).toString());
    }

    public void Z0(x7.a aVar) {
        o5.j jVar = (o5.j) this.f39977c;
        ((androidx.lifecycle.f0) this.f39976b).h(aVar);
        if (aVar instanceof d5.s) {
            jVar.h((d5.s) aVar);
        } else if (aVar instanceof d5.q) {
            jVar.i(((d5.q) aVar).f38707b);
        }
    }

    @Override // qm.b
    public boolean a(sm.b bVar) {
        return bVar instanceof cm.a;
    }

    @Override // qm.b
    public boolean a0(pm.a1 a1Var) {
        kotlin.jvm.internal.n.f(a1Var, "<this>");
        return qm.g.F(q0(a1Var)) != qm.g.F(I(a1Var));
    }

    public n2.a0 a1(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f39976b;
            if (i11 >= iArr.length) {
                l1.a.e("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new n2.j();
            }
            if (i10 == iArr[i11]) {
                return ((b1[]) this.f39977c)[i11];
            }
            i11++;
        }
    }

    @Override // wi.i
    public long b(wi.f fVar) {
        return ((io.flutter.plugin.platform.n) this.f39976b).f43373w.b(fVar);
    }

    @Override // io.flutter.plugin.platform.h
    public View b0(int i10) {
        io.flutter.plugin.platform.m mVar = (io.flutter.plugin.platform.m) this.f39977c;
        return mVar.b0(i10) != null ? mVar.b0(i10) : ((io.flutter.plugin.platform.n) this.f39976b).b0(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int b1(Context context, j9.c cVar) {
        int i10;
        k9.c0.h(context);
        k9.c0.h(cVar);
        int iC = 0;
        if (!((k9.f) cVar).requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = cVar.getMinApkVersion();
        SparseIntArray sparseIntArray = (SparseIntArray) this.f39976b;
        synchronized (sparseIntArray) {
            i10 = sparseIntArray.get(minApkVersion, -1);
        }
        if (i10 != -1) {
            return i10;
        }
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.f39976b;
        synchronized (sparseIntArray2) {
            int i11 = 0;
            while (true) {
                try {
                    if (i11 >= sparseIntArray2.size()) {
                        iC = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray2.keyAt(i11);
                    if (iKeyAt > minApkVersion && sparseIntArray2.get(iKeyAt) == 0) {
                        break;
                    }
                    i11++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (iC == -1) {
                iC = ((i9.d) this.f39977c).c(context, minApkVersion);
            }
            sparseIntArray2.put(minApkVersion, iC);
        }
        return iC;
    }

    @Override // wi.i
    public void c(boolean z10) {
        ((io.flutter.plugin.platform.n) ((io.flutter.plugin.platform.n) this.f39976b).f43373w.f43335b).f43368r = z10;
    }

    @Override // qm.b
    public boolean c0(sm.c cVar) {
        kotlin.jvm.internal.n.f(cVar, "<this>");
        pm.c0 c0VarH = qm.g.h(cVar);
        return (c0VarH != null ? qm.g.f(c0VarH) : null) != null;
    }

    @Override // io.flutter.plugin.platform.h
    public void d(io.flutter.view.g gVar) {
        ((io.flutter.plugin.platform.n) this.f39976b).f43360i.f43310a = gVar;
        ((io.flutter.plugin.platform.m) this.f39977c).f43343h.f43310a = gVar;
    }

    @Override // qm.b
    public pm.c0 d0(sm.d dVar) {
        return qm.g.j(dVar);
    }

    @Override // qm.b
    public boolean e(q0 q0Var) {
        return qm.g.K(q0Var);
    }

    @Override // qm.b
    public pm.a1 e0(sm.c cVar) {
        return qm.g.P(cVar);
    }

    @Override // n2.m
    public void endTracks() {
        b2.x xVar = (b2.x) this.f39977c;
        xVar.f5413b.post(new b2.s(xVar, 0));
    }

    @Override // wi.i
    public void f(int i10, int i11) {
        io.flutter.plugin.platform.m mVar = (io.flutter.plugin.platform.m) this.f39977c;
        if (mVar.b0(i10) != null) {
            mVar.f43350p.f(i10, i11);
        } else {
            ((io.flutter.plugin.platform.n) this.f39976b).f43373w.f(i10, i11);
        }
    }

    @Override // qm.b
    public pm.c0 f0(pm.n nVar) {
        return qm.g.Q(nVar);
    }

    @Override // wi.i
    public void g(wi.g gVar) {
        io.flutter.plugin.platform.m mVar = (io.flutter.plugin.platform.m) this.f39977c;
        if (mVar.b0(gVar.f53228a) != null) {
            mVar.f43350p.g(gVar);
        } else {
            ((io.flutter.plugin.platform.n) this.f39976b).f43373w.g(gVar);
        }
    }

    @Override // qm.b
    public pm.c0 g0(sm.c cVar) {
        return qm.g.h(cVar);
    }

    @Override // com.bumptech.glide.load.data.d
    public void h(Exception exc) {
        g6.e0 e0Var = (g6.e0) this.f39977c;
        k6.q qVar = (k6.q) this.f39976b;
        k6.q qVar2 = e0Var.f41593f;
        if (qVar2 == null || qVar2 != qVar) {
            return;
        }
        g6.e0 e0Var2 = (g6.e0) this.f39977c;
        k6.q qVar3 = (k6.q) this.f39976b;
        g6.j jVar = e0Var2.f41589b;
        g6.f fVar = e0Var2.f41594g;
        com.bumptech.glide.load.data.e eVar = qVar3.f44371c;
        jVar.c(fVar, exc, eVar, eVar.c());
    }

    @Override // qm.b
    public boolean h0(sm.d dVar) {
        return qm.g.F(dVar);
    }

    @Override // lm.c
    public List i(lm.u uVar, zl.a proto, int i10) {
        List list;
        km.a aVar = (km.a) this.f39976b;
        kotlin.jvm.internal.n.f(proto, "proto");
        d5.u.n(i10, "kind");
        if (proto instanceof tl.l) {
            list = (List) ((tl.l) proto).n(aVar.f44717b);
        } else if (proto instanceof tl.y) {
            list = (List) ((tl.y) proto).n(aVar.f44719d);
        } else {
            if (!(proto instanceof tl.g0)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int iC = v0.i.c(i10);
            if (iC == 1) {
                list = (List) ((tl.g0) proto).n(aVar.f44720e);
            } else if (iC == 2) {
                list = (List) ((tl.g0) proto).n(aVar.f44721f);
            } else {
                if (iC != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((tl.g0) proto).n(aVar.f44722g);
            }
        }
        if (list == null) {
            list = xj.v.f53866a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(xj.p.W(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((f2) this.f39977c).d((tl.g) it.next(), uVar.f45591a));
        }
        return arrayList;
    }

    @Override // qm.b
    public qm.i i0(sm.b bVar) {
        return qm.g.X(bVar);
    }

    @Override // qm.b
    public boolean j(sm.d dVar) {
        kotlin.jvm.internal.n.f(dVar, "<this>");
        return qm.g.y(qm.g.W(dVar));
    }

    @Override // ic.a
    public StackTraceElement[] j0(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        ic.a[] aVarArr = (ic.a[]) this.f39976b;
        StackTraceElement[] stackTraceElementArrJ0 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            ic.a aVar = aVarArr[i10];
            if (stackTraceElementArrJ0.length <= 1024) {
                break;
            }
            stackTraceElementArrJ0 = aVar.j0(stackTraceElementArr);
        }
        return stackTraceElementArrJ0.length > 1024 ? ((ea.a0) this.f39977c).j0(stackTraceElementArrJ0) : stackTraceElementArrJ0;
    }

    @Override // qm.b
    public pm.a1 k(sm.d dVar, sm.d dVar2) {
        return qm.g.m(this, dVar, dVar2);
    }

    @Override // qm.b
    public sm.d k0(sm.d dVar) {
        pm.c0 c0VarQ;
        kotlin.jvm.internal.n.f(dVar, "<this>");
        pm.n nVarF = qm.g.f(dVar);
        return (nVarF == null || (c0VarQ = qm.g.Q(nVarF)) == null) ? dVar : c0VarQ;
    }

    @Override // qm.b
    public boolean l(sm.d dVar) {
        kotlin.jvm.internal.n.f(dVar, "<this>");
        return qm.g.G(p0(dVar)) && !qm.g.H(dVar);
    }

    @Override // qm.b
    public pm.r l0(sm.c cVar) {
        return qm.g.g(cVar);
    }

    @Override // wi.i
    public void m(wi.f fVar) {
        ((io.flutter.plugin.platform.n) this.f39976b).f43373w.m(fVar);
    }

    @Override // qm.b
    public boolean m0(sm.f fVar) {
        return qm.g.y(fVar);
    }

    @Override // d9.d
    public Object n(IBinder iBinder) throws IOException, zs {
        IInterface sVar;
        int i10 = com.google.android.gms.internal.auth.g0.f22823b;
        if (iBinder == null) {
            sVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            sVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.auth.o0 ? (com.google.android.gms.internal.auth.o0) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.auth.s(iBinder, "com.google.android.auth.IAuthManagerService", 0);
        }
        String str = (String) this.f39976b;
        Bundle bundle = (Bundle) this.f39977c;
        com.google.android.gms.internal.auth.s sVar2 = (com.google.android.gms.internal.auth.s) sVar;
        sVar2.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(sVar2.f22790c);
        parcelObtain.writeString(str);
        com.google.android.gms.internal.auth.f.b(parcelObtain, bundle);
        Parcel parcelV1 = sVar2.v1(parcelObtain, 2);
        Bundle bundle2 = (Bundle) com.google.android.gms.internal.auth.f.a(parcelV1, Bundle.CREATOR);
        parcelV1.recycle();
        if (bundle2 == null) {
            d9.a.f38794c.p("Service call returned null.", new Object[0]);
            throw new IOException("Service unavailable.");
        }
        String string = bundle2.getString("Error");
        if (bundle2.getBoolean("booleanResult")) {
            return null;
        }
        throw new zs(string, 6);
    }

    @Override // lm.c
    public List n0(lm.u uVar, zl.a callableProto, int i10, int i11, y0 y0Var) {
        kotlin.jvm.internal.n.f(callableProto, "callableProto");
        d5.u.n(i10, "kind");
        Iterable iterable = (List) y0Var.n(((km.a) this.f39976b).f44725j);
        if (iterable == null) {
            iterable = xj.v.f53866a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(xj.p.W(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((f2) this.f39977c).d((tl.g) it.next(), uVar.f45591a));
        }
        return arrayList;
    }

    @Override // qm.b
    public int o(sm.c cVar) {
        return qm.g.c(cVar);
    }

    @Override // qm.b
    public boolean o0(sm.d dVar, sm.d dVar2) {
        return qm.g.w(dVar, dVar2);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        la.k kVar = (la.k) this.f39976b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f39977c;
        synchronized (kVar.f45265f) {
            kVar.f45264e.remove(taskCompletionSource);
        }
    }

    @Override // xi.n
    public void onMethodCall(xi.m mVar, xi.o oVar) {
        Context context = (Context) this.f39976b;
        b6.c cVar = (b6.c) this.f39977c;
        String str = mVar.f53822a;
        Object obj = mVar.f53823b;
        str.getClass();
        int i10 = 2;
        int i11 = 1;
        int i12 = 0;
        switch (str) {
            case "checkServiceStatus":
                wi.j jVar = (wi.j) oVar;
                b6.e.a(Integer.parseInt(obj.toString()), context, new b6.a(jVar, i12), new b6.a(jVar, i11));
                break;
            case "shouldShowRequestPermissionRationale":
                int i13 = Integer.parseInt(obj.toString());
                Activity activity = cVar.f5499c;
                if (activity != null) {
                    ArrayList arrayListF = b6.d.f(activity, i13);
                    if (arrayListF == null) {
                        Log.d("permissions_handler", "No android specific permissions needed for: " + i13);
                        ((wi.j) oVar).a(Boolean.FALSE);
                    } else if (arrayListF.isEmpty()) {
                        Log.d("permissions_handler", "No permissions found in manifest for: " + i13 + " no need to show request rationale");
                        ((wi.j) oVar).a(Boolean.FALSE);
                    } else {
                        ((wi.j) oVar).a(Boolean.valueOf(b0.b.j(cVar.f5499c, (String) arrayListF.get(0))));
                    }
                    break;
                } else {
                    Log.d("permissions_handler", "Unable to detect current Activity.");
                    ((wi.j) oVar).b("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.", null);
                    break;
                }
                break;
            case "checkPermissionStatus":
                ((wi.j) oVar).a(Integer.valueOf(cVar.a(Integer.parseInt(obj.toString()))));
                break;
            case "openAppSettings":
                if (context != null) {
                    try {
                        Intent intent = new Intent();
                        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.addCategory("android.intent.category.DEFAULT");
                        intent.setData(Uri.parse("package:" + context.getPackageName()));
                        intent.addFlags(268435456);
                        intent.addFlags(1073741824);
                        intent.addFlags(8388608);
                        context.startActivity(intent);
                        ((wi.j) oVar).a(Boolean.TRUE);
                    } catch (Exception unused) {
                        ((wi.j) oVar).a(Boolean.FALSE);
                        return;
                    }
                    break;
                } else {
                    Log.d("permissions_handler", "Context cannot be null.");
                    ((wi.j) oVar).b("PermissionHandler.AppSettingsManager", "Android context cannot be null.", null);
                    break;
                }
                break;
            case "requestPermissions":
                List<Integer> list = (List) obj;
                wi.j jVar2 = (wi.j) oVar;
                b6.a aVar = new b6.a(jVar2, i10);
                if (cVar.f5500d > 0) {
                    jVar2.b("PermissionHandler.PermissionManager", "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).", null);
                    break;
                } else if (cVar.f5499c == null) {
                    Log.d("permissions_handler", "Unable to detect current Activity.");
                    jVar2.b("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.", null);
                    break;
                } else {
                    cVar.f5498b = aVar;
                    cVar.f5501e = new HashMap();
                    cVar.f5500d = 0;
                    ArrayList arrayList = new ArrayList();
                    for (Integer num : list) {
                        if (cVar.a(num.intValue()) != 1) {
                            ArrayList arrayListF2 = b6.d.f(cVar.f5499c, num.intValue());
                            if (arrayListF2 != null && !arrayListF2.isEmpty()) {
                                int i14 = Build.VERSION.SDK_INT;
                                if (num.intValue() == 16) {
                                    cVar.c(209, "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                                } else if (num.intValue() == 22) {
                                    cVar.c(210, "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                                } else if (num.intValue() == 23) {
                                    cVar.c(211, "android.settings.action.MANAGE_OVERLAY_PERMISSION");
                                } else if (num.intValue() == 24) {
                                    cVar.c(212, "android.settings.MANAGE_UNKNOWN_APP_SOURCES");
                                } else if (num.intValue() == 27) {
                                    cVar.c(213, "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
                                } else if (i14 >= 31 && num.intValue() == 34) {
                                    cVar.c(214, "android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                                } else if (num.intValue() != 37 && num.intValue() != 0) {
                                    arrayList.addAll(arrayListF2);
                                    cVar.f5500d = arrayListF2.size() + cVar.f5500d;
                                } else if (cVar.b()) {
                                    arrayList.add("android.permission.WRITE_CALENDAR");
                                    arrayList.add("android.permission.READ_CALENDAR");
                                    cVar.f5500d += 2;
                                } else {
                                    cVar.f5501e.put(num, 0);
                                }
                            } else if (!cVar.f5501e.containsKey(num)) {
                                cVar.f5501e.put(num, 0);
                                cVar.f5501e.put(num, 0);
                            }
                        } else if (!cVar.f5501e.containsKey(num)) {
                            cVar.f5501e.put(num, 1);
                        }
                    }
                    if (arrayList.size() > 0) {
                        b0.b.i(cVar.f5499c, (String[]) arrayList.toArray(new String[0]), 24);
                    }
                    b6.a aVar2 = cVar.f5498b;
                    if (aVar2 != null && cVar.f5500d == 0) {
                        aVar2.f5493b.a(cVar.f5501e);
                        break;
                    }
                }
                break;
            default:
                ((wi.j) oVar).c();
                break;
        }
    }

    @Override // qm.b
    public sm.e p(sm.d dVar) {
        return qm.g.d(dVar);
    }

    @Override // qm.b
    public n0 p0(sm.c cVar) {
        kotlin.jvm.internal.n.f(cVar, "<this>");
        pm.c0 c0VarH = qm.g.h(cVar);
        if (c0VarH == null) {
            c0VarH = q0(cVar);
        }
        return qm.g.W(c0VarH);
    }

    @Override // hb.c
    public byte[] q(int i10, byte[] bArr) {
        return bArr.length <= 64 ? ((ib.a) this.f39976b).q(i10, bArr) : ((f2) this.f39977c).q(i10, bArr);
    }

    @Override // qm.b
    public pm.c0 q0(sm.c cVar) {
        pm.c0 c0VarN;
        kotlin.jvm.internal.n.f(cVar, "<this>");
        pm.r rVarG = qm.g.g(cVar);
        if (rVarG != null && (c0VarN = qm.g.N(rVarG)) != null) {
            return c0VarN;
        }
        pm.c0 c0VarH = qm.g.h(cVar);
        kotlin.jvm.internal.n.c(c0VarH);
        return c0VarH;
    }

    @Override // qm.b
    public int r(sm.e eVar) {
        kotlin.jvm.internal.n.f(eVar, "<this>");
        if (eVar instanceof sm.d) {
            return qm.g.c((sm.c) eVar);
        }
        if (eVar instanceof sm.a) {
            return ((sm.a) eVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + eVar + ", " + kotlin.jvm.internal.d0.f44761a.b(eVar.getClass())).toString());
    }

    @Override // qm.b
    public pm.n r0(sm.d dVar) {
        return qm.g.f(dVar);
    }

    @Override // qm.b
    public boolean s(m0 m0Var, sm.f fVar) {
        return qm.g.v(m0Var, fVar);
    }

    @Override // qm.b
    public boolean s0(sm.c receiver) {
        kotlin.jvm.internal.n.f(receiver, "$receiver");
        return receiver instanceof ql.f;
    }

    @Override // lm.c
    public List t(lm.u uVar, tl.g0 proto) {
        kotlin.jvm.internal.n.f(proto, "proto");
        ((km.a) this.f39976b).getClass();
        xj.v vVar = xj.v.f53866a;
        ArrayList arrayList = new ArrayList(xj.p.W(vVar, 10));
        Iterator<E> it = vVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((f2) this.f39977c).d((tl.g) it.next(), uVar.f45591a));
        }
        return arrayList;
    }

    @Override // io.flutter.plugin.platform.h
    public boolean t0(int i10) {
        io.flutter.plugin.platform.m mVar = (io.flutter.plugin.platform.m) this.f39977c;
        if (mVar.b0(i10) == null) {
            return ((io.flutter.plugin.platform.n) this.f39976b).t0(i10);
        }
        mVar.getClass();
        return false;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) throws Throwable {
        FileWriter fileWriter;
        com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f39977c;
        JSONObject jSONObject = (JSONObject) ((ac.g) this.f39976b).f3464c.f3457a.submit(new hc.c(this, 0)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            hc.b bVarM = ((od.c) dVar.f22983c).m(jSONObject);
            n5.f fVar = (n5.f) dVar.f22985e;
            long j10 = bVarM.f42299c;
            fVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j10);
                fileWriter = new FileWriter((File) fVar.f46523b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    }
                    zb.f.b(fileWriter, "Failed to close settings writer.");
                    com.google.android.gms.internal.consent_sdk.d.o("Loaded settings: ", jSONObject);
                    String str = ((hc.e) dVar.f22982b).f42310f;
                    SharedPreferences.Editor editorEdit = ((Context) dVar.f22981a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    editorEdit.putString("existing_instance_identifier", str);
                    editorEdit.apply();
                    ((AtomicReference) dVar.f22988h).set(bVarM);
                    ((TaskCompletionSource) ((AtomicReference) dVar.f22989i).get()).trySetResult(bVarM);
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    zb.f.b(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                zb.f.b(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
        }
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f39975a) {
            case 1:
                return ((HashMap) this.f39976b).toString();
            case 24:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f39977c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f39976b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // n2.m
    public n2.a0 track(int i10, int i11) {
        return (b1) this.f39976b;
    }

    @Override // lm.c
    public ArrayList u0(lm.s container) {
        kotlin.jvm.internal.n.f(container, "container");
        Iterable iterable = (List) container.f45585d.n(((km.a) this.f39976b).f44718c);
        if (iterable == null) {
            iterable = xj.v.f53866a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(xj.p.W(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((f2) this.f39977c).d((tl.g) it.next(), container.f45591a));
        }
        return arrayList;
    }

    @Override // qm.b
    public m0 v(sm.f fVar, int i10) {
        return qm.g.q(fVar, i10);
    }

    @Override // qm.b
    public boolean v0(sm.f fVar) {
        return qm.g.A(fVar);
    }

    @Override // qm.b
    public qm.a w(sm.d dVar) {
        return qm.g.U(this, dVar);
    }

    @Override // lm.c
    public List w0(lm.u uVar, tl.g0 proto) {
        kotlin.jvm.internal.n.f(proto, "proto");
        ((km.a) this.f39976b).getClass();
        xj.v vVar = xj.v.f53866a;
        ArrayList arrayList = new ArrayList(xj.p.W(vVar, 10));
        Iterator<E> it = vVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((f2) this.f39977c).d((tl.g) it.next(), uVar.f45591a));
        }
        return arrayList;
    }

    @Override // lm.a
    public Object x(lm.u uVar, tl.g0 proto, pm.y yVar) {
        kotlin.jvm.internal.n.f(proto, "proto");
        tl.d dVar = (tl.d) com.google.android.gms.internal.auth.i.u(proto, ((km.a) this.f39976b).f44724i);
        if (dVar == null) {
            return null;
        }
        return ((f2) this.f39977c).D(yVar, dVar, uVar.f45591a);
    }

    @Override // wi.i
    public void x0(wi.h hVar, b6.a aVar) {
        if (((io.flutter.plugin.platform.m) this.f39977c).b0(hVar.f53243a) != null) {
            return;
        }
        ((io.flutter.plugin.platform.n) this.f39976b).f43373w.x0(hVar, aVar);
    }

    @Override // qm.b
    public pm.c0 y(pm.r rVar) {
        return qm.g.N(rVar);
    }

    @Override // wi.i
    public void y0(double d10, double d11, int i10) {
        if (((io.flutter.plugin.platform.m) this.f39977c).b0(i10) != null) {
            return;
        }
        ((io.flutter.plugin.platform.n) this.f39976b).f43373w.y0(d10, d11, i10);
    }

    @Override // qm.b
    public void z(sm.d dVar) {
        qm.g.M(dVar);
    }

    @Override // com.bumptech.glide.load.data.d
    public void z0(Object obj) {
        g6.e0 e0Var = (g6.e0) this.f39977c;
        k6.q qVar = (k6.q) this.f39976b;
        k6.q qVar2 = e0Var.f41593f;
        if (qVar2 == null || qVar2 != qVar) {
            return;
        }
        g6.e0 e0Var2 = (g6.e0) this.f39977c;
        k6.q qVar3 = (k6.q) this.f39976b;
        g6.l lVar = e0Var2.f41588a.f41611p;
        if (obj != null && lVar.a(qVar3.f44371c.c())) {
            e0Var2.f41592e = obj;
            e0Var2.f41589b.l(2);
        } else {
            g6.j jVar = e0Var2.f41589b;
            e6.f fVar = qVar3.f44369a;
            com.bumptech.glide.load.data.e eVar = qVar3.f44371c;
            jVar.b(fVar, obj, eVar, eVar.c(), e0Var2.f41594g);
        }
    }

    public /* synthetic */ d0(int i10, boolean z10) {
        this.f39975a = i10;
    }

    public /* synthetic */ d0(Object obj, boolean z10, Object obj2, int i10) {
        this.f39975a = i10;
        this.f39976b = obj;
        this.f39977c = obj2;
    }

    public d0(IBinder iBinder) throws RemoteException {
        this.f39975a = 17;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f39976b = new Messenger(iBinder);
            this.f39977c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f39977c = new h9.e(iBinder);
            this.f39976b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public /* synthetic */ d0(Object obj) {
        this.f39975a = 24;
        this.f39977c = obj;
        this.f39976b = new ArrayList();
    }

    public d0(String str, com.bumptech.glide.d dVar, j9.d dVar2) {
        this.f39975a = 23;
        this.f39977c = str;
        this.f39976b = dVar;
    }

    public d0(HashMap map, qm.c equalityAxioms) {
        this.f39975a = 7;
        kotlin.jvm.internal.n.f(equalityAxioms, "equalityAxioms");
        this.f39976b = map;
        this.f39977c = equalityAxioms;
    }

    public d0(uf.b bVar) {
        this.f39975a = 9;
        this.f39976b = bVar.f52208k;
        this.f39977c = bVar.f52207j;
    }

    public d0(Context context, rc.d dVar, b6.c cVar, b6.e eVar) {
        this.f39975a = 6;
        this.f39976b = context;
        this.f39977c = cVar;
    }

    public d0(ic.a[] aVarArr) {
        this.f39975a = 21;
        this.f39976b = aVarArr;
        this.f39977c = new ea.a0(28);
    }

    @Override // n2.m
    public void u(n2.t tVar) {
    }

    public d0(zk.w module, zc.u uVar, km.a protocol) {
        this.f39975a = 29;
        kotlin.jvm.internal.n.f(module, "module");
        kotlin.jvm.internal.n.f(protocol, "protocol");
        this.f39976b = protocol;
        this.f39977c = new f2(module, uVar);
    }

    public d0(int i10) {
        this.f39975a = i10;
        switch (i10) {
            case 13:
                this.f39976b = new HashMap();
                this.f39977c = new HashMap();
                break;
            case 20:
                this.f39976b = new a7.l(1000L);
                this.f39977c = b7.d.a(10, new ea.b0(27));
                break;
            case 25:
                i9.d dVar = i9.d.f42926e;
                this.f39976b = new SparseIntArray();
                this.f39977c = dVar;
                break;
            default:
                this.f39976b = new androidx.lifecycle.f0();
                this.f39977c = new o5.j();
                Z0(d5.t.f38709c9);
                break;
        }
    }

    public d0(a0 a0Var) {
        this.f39975a = 13;
        this.f39976b = new HashMap(a0Var.f39963a);
        this.f39977c = new HashMap(a0Var.f39964b);
    }

    @Override // qm.b
    public void Y(sm.d dVar, sm.f fVar) {
    }

    public d0(p0 p0Var) {
        this.f39975a = 3;
        this.f39976b = p0Var;
        p1 p1Var = new p1();
        p1Var.f4883a = 0;
        this.f39977c = p1Var;
    }

    public d0(l2.c cVar) {
        this.f39975a = 27;
        this.f39977c = cVar;
    }

    public d0(b2.q qVar) {
        this.f39975a = 4;
        this.f39977c = qVar;
        this.f39976b = l1.y.q(null);
    }
}
