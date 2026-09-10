package qk;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Closeable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import oa.k0;
import oa.s1;
import pm.a1;
import pm.n0;
import pm.o0;
import pm.q0;
import pm.r0;
import pm.w0;
import pm.y0;
import tk.k1;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f49121a;

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean B(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if ((obj instanceof int[]) && (obj2 instanceof int[])) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if ((obj instanceof long[]) && (obj2 instanceof long[])) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if ((obj instanceof double[]) && (obj2 instanceof double[])) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (objArr.length != objArr2.length) {
                return false;
            }
            pk.c cVarQ0 = xj.k.q0(objArr);
            if ((cVarQ0 instanceof Collection) && ((Collection) cVarQ0).isEmpty()) {
                return true;
            }
            pk.b bVarB = cVarQ0.iterator();
            while (bVarB.f48398c) {
                int iNextInt = bVarB.nextInt();
                if (!B(objArr[iNextInt], objArr2[iNextInt])) {
                    return false;
                }
            }
            return true;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() != list2.size()) {
                return false;
            }
            pk.c cVarO = xj.o.O((Collection) obj);
            if ((cVarO instanceof Collection) && ((Collection) cVarO).isEmpty()) {
                return true;
            }
            pk.b bVarB2 = cVarO.iterator();
            while (bVarB2.f48398c) {
                int iNextInt2 = bVarB2.nextInt();
                if (!B(list.get(iNextInt2), list2.get(iNextInt2))) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return kotlin.jvm.internal.n.a(obj, obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() != map2.size()) {
            return false;
        }
        if (map.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !B(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static void D(Parcel parcel, int i10) {
        if (parcel.dataPosition() != i10) {
            throw new l9.b(l1.d.k(new StringBuilder(String.valueOf(i10).length() + 26), "Overread allowed size end=", i10), parcel);
        }
    }

    public static final void E(pm.y yVar, pm.c0 c0Var, LinkedHashSet linkedHashSet, Set set) {
        zk.g gVarE = yVar.P().e();
        if (gVarE instanceof m0) {
            if (!kotlin.jvm.internal.n.a(yVar.P(), c0Var.P())) {
                linkedHashSet.add(gVarE);
                return;
            }
            for (pm.y upperBound : ((m0) gVarE).getUpperBounds()) {
                kotlin.jvm.internal.n.e(upperBound, "upperBound");
                E(upperBound, c0Var, linkedHashSet, set);
            }
            return;
        }
        zk.g gVarE2 = yVar.P().e();
        zk.h hVar = gVarE2 instanceof zk.h ? (zk.h) gVarE2 : null;
        List listI = hVar != null ? hVar.i() : null;
        int i10 = 0;
        for (q0 q0Var : yVar.t()) {
            int i11 = i10 + 1;
            m0 m0Var = listI != null ? (m0) xj.n.r0(i10, listI) : null;
            if ((m0Var == null || set == null || !set.contains(m0Var)) && !q0Var.c() && !xj.n.i0(linkedHashSet, q0Var.b().P().e()) && !kotlin.jvm.internal.n.a(q0Var.b().P(), c0Var.P())) {
                pm.y yVarB = q0Var.b();
                kotlin.jvm.internal.n.e(yVarB, "argument.type");
                E(yVarB, c0Var, linkedHashSet, set);
            }
            i10 = i11;
        }
    }

    public static final wk.h H(pm.y yVar) {
        kotlin.jvm.internal.n.f(yVar, "<this>");
        wk.h hVarD = yVar.P().d();
        kotlin.jvm.internal.n.e(hVarD, "constructor.builtIns");
        return hVarD;
    }

    public static final Type J(a0 a0Var) {
        b0 b0Var = a0Var.f49103a;
        if (b0Var == null) {
            return j0.f49122c;
        }
        x xVar = a0Var.f49104b;
        kotlin.jvm.internal.n.c(xVar);
        int iOrdinal = b0Var.ordinal();
        if (iOrdinal == 0) {
            return k(xVar, true);
        }
        if (iOrdinal == 1) {
            return new j0(null, k(xVar, true));
        }
        if (iOrdinal == 2) {
            return new j0(k(xVar, true), null);
        }
        throw new aa.b((byte) 0, 20);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    public static final String K(zk.s sVar) {
        yl.f fVar;
        zk.c cVarL = wk.h.z(sVar) ? L(sVar) : null;
        if (cVarL != null) {
            zk.c cVarK = fm.e.k(cVarL);
            if (cVarK instanceof zk.h0) {
                wk.h.z(cVarK);
                zk.c cVarB = fm.e.b(fm.e.k(cVarK), il.e.f43062h);
                if (cVarB != null && (fVar = (yl.f) il.g.f43073a.get(fm.e.g(cVarB))) != null) {
                    return fVar.b();
                }
            } else if (cVarK instanceof cl.q0) {
                int i10 = il.d.l;
                LinkedHashMap linkedHashMap = il.g0.f43085i;
                String strV = go.k.v((cl.q0) cVarK);
                yl.f fVar2 = strV == null ? null : (yl.f) linkedHashMap.get(strV);
                if (fVar2 != null) {
                    return fVar2.b();
                }
            }
        }
        return null;
    }

    public static final zk.c L(zk.c cVar) {
        kotlin.jvm.internal.n.f(cVar, "<this>");
        if (!il.g0.f43086j.contains(cVar.getName()) && !il.g.f43076d.contains(fm.e.k(cVar).getName())) {
            return null;
        }
        if (cVar instanceof zk.h0 ? true : cVar instanceof zk.g0) {
            return fm.e.b(cVar, il.e.f43064j);
        }
        if (cVar instanceof cl.q0) {
            return fm.e.b(cVar, il.e.f43065k);
        }
        return null;
    }

    public static final zk.c M(zk.c cVar) {
        kotlin.jvm.internal.n.f(cVar, "<this>");
        zk.c cVarL = L(cVar);
        if (cVarL != null) {
            return cVarL;
        }
        int i10 = il.f.l;
        yl.f name = cVar.getName();
        kotlin.jvm.internal.n.e(name, "name");
        if (il.f.b(name)) {
            return fm.e.b(cVar, il.e.l);
        }
        return null;
    }

    public static final pm.y O(m0 m0Var) {
        Object obj;
        List upperBounds = m0Var.getUpperBounds();
        kotlin.jvm.internal.n.e(upperBounds, "upperBounds");
        upperBounds.isEmpty();
        List upperBounds2 = m0Var.getUpperBounds();
        kotlin.jvm.internal.n.e(upperBounds2, "upperBounds");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            zk.g gVarE = ((pm.y) next).P().e();
            zk.e eVar = gVarE instanceof zk.e ? (zk.e) gVarE : null;
            if (eVar != null && eVar.l0() != 2 && eVar.l0() != 5) {
                obj = next;
                break;
            }
        }
        pm.y yVar = (pm.y) obj;
        if (yVar != null) {
            return yVar;
        }
        List upperBounds3 = m0Var.getUpperBounds();
        kotlin.jvm.internal.n.e(upperBounds3, "upperBounds");
        Object objO0 = xj.n.o0(upperBounds3);
        kotlin.jvm.internal.n.e(objO0, "upperBounds.first()");
        return (pm.y) objO0;
    }

    public static final boolean P(zk.e eVar, zk.c specialCallableDescriptor) {
        kotlin.jvm.internal.n.f(eVar, "<this>");
        kotlin.jvm.internal.n.f(specialCallableDescriptor, "specialCallableDescriptor");
        zk.j jVarE = specialCallableDescriptor.e();
        kotlin.jvm.internal.n.d(jVarE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        pm.c0 c0VarG = ((zk.e) jVarE).g();
        kotlin.jvm.internal.n.e(c0VarG, "specialCallableDescripto…ssDescriptor).defaultType");
        for (zk.e eVarJ = bm.e.j(eVar); eVarJ != null; eVarJ = bm.e.j(eVarJ)) {
            if (!(eVarJ instanceof kl.c)) {
                pm.c0 c0VarG2 = eVarJ.g();
                if (c0VarG2 == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "subtype", "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure", "findCorrespondingSupertype"));
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                a1 a1VarG = null;
                arrayDeque.add(new qm.n(c0VarG2, null));
                n0 n0VarP = c0VarG.P();
                while (!arrayDeque.isEmpty()) {
                    qm.n nVar = (qm.n) arrayDeque.poll();
                    pm.y yVarG = nVar.f49194a;
                    n0 n0VarP2 = yVarG.P();
                    if (n0VarP2 == null) {
                        qm.g.a(3);
                        throw null;
                    }
                    if (n0VarP == null) {
                        qm.g.a(4);
                        throw null;
                    }
                    if (n0VarP2.equals(n0VarP)) {
                        boolean zQ = yVarG.Q();
                        for (qm.n nVar2 = nVar.f49195b; nVar2 != null; nVar2 = nVar2.f49195b) {
                            pm.y yVar = nVar2.f49194a;
                            List listT = yVar.t();
                            boolean z10 = listT instanceof Collection;
                            pm.f fVar = o0.f48464b;
                            if (!z10 || !listT.isEmpty()) {
                                Iterator it = listT.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        yVarG = new w0(fVar.f(yVar.P(), yVar.t())).g(1, yVarG);
                                        break;
                                    }
                                    if (((q0) it.next()).a() != 1) {
                                        yVarG = (pm.y) go.k.b(new w0(com.bumptech.glide.c.L(fVar.f(yVar.P(), yVar.t()))).g(1, yVarG)).f52268b;
                                        break;
                                    }
                                }
                            } else {
                                yVarG = new w0(fVar.f(yVar.P(), yVar.t())).g(1, yVarG);
                                break;
                            }
                            zQ = zQ || yVar.Q();
                        }
                        n0 n0VarP3 = yVarG.P();
                        if (n0VarP3 == null) {
                            qm.g.a(3);
                            throw null;
                        }
                        if (n0VarP3.equals(n0VarP)) {
                            a1VarG = y0.g(yVarG, zQ);
                            break;
                        }
                        throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + qm.g.n(n0VarP3) + ", \n\nsupertype: " + qm.g.n(n0VarP) + " \n" + n0VarP3.equals(n0VarP));
                    }
                    for (pm.y immediateSupertype : n0VarP2.f()) {
                        kotlin.jvm.internal.n.e(immediateSupertype, "immediateSupertype");
                        arrayDeque.add(new qm.n(immediateSupertype, nVar));
                    }
                }
                if (a1VarG != null) {
                    return !wk.h.z(eVarJ);
                }
            }
        }
        return false;
    }

    public static final boolean Q(m0 typeParameter, n0 n0Var, Set set) {
        kotlin.jvm.internal.n.f(typeParameter, "typeParameter");
        List upperBounds = typeParameter.getUpperBounds();
        kotlin.jvm.internal.n.e(upperBounds, "typeParameter.upperBounds");
        List<pm.y> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (pm.y upperBound : list) {
            kotlin.jvm.internal.n.e(upperBound, "upperBound");
            if (l(upperBound, typeParameter.g().P(), set) && (n0Var == null || kotlin.jvm.internal.n.a(upperBound.P(), n0Var))) {
                return true;
            }
        }
        return false;
    }

    public static boolean R(Context context) {
        Boolean bool = f49121a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f49121a = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            fd.a.d().a("No perf logcat meta data found " + e10.getMessage());
            return false;
        }
    }

    public static boolean S(byte b10) {
        return b10 > -65;
    }

    public static final a1 T(pm.y yVar) {
        kotlin.jvm.internal.n.f(yVar, "<this>");
        a1 a1VarG = y0.g(yVar, true);
        kotlin.jvm.internal.n.e(a1VarG, "makeNullable(this)");
        return a1VarG;
    }

    public static void U(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static void V(k3.d dVar, int i10, l1.g gVar) {
        long eventTime = dVar.getEventTime(i10);
        List cues = dVar.getCues(eventTime);
        if (cues.isEmpty()) {
            return;
        }
        if (i10 == dVar.getEventTimeCount() - 1) {
            throw new IllegalStateException();
        }
        long eventTime2 = dVar.getEventTime(i10 + 1) - dVar.getEventTime(i10);
        if (eventTime2 > 0) {
            gVar.accept(new k3.a(cues, eventTime, eventTime2));
        }
    }

    public static final String a(Object[] objArr, int i10, int i11, xj.g gVar) {
        StringBuilder sb2 = new StringBuilder((i11 * 3) + 2);
        sb2.append(X3.j.f27834d);
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i10 + i12];
            if (obj == gVar) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append(X3.j.f27836e);
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "toString(...)");
        return string;
    }

    public static boolean a0(Parcel parcel, int i10) {
        r0(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static final String b(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        zm.i iVarR = zm.l.R(type, h0.f49120b);
        StringBuilder sb2 = new StringBuilder();
        Iterator it = iVarR.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        sb2.append(((Class) next).getName());
        sb2.append(an.p.l0(zm.l.N(iVarR), HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
        return sb2.toString();
    }

    public static dh.a b0(og.b bVar) {
        Object next;
        ArrayList arrayList = new ArrayList();
        bVar.n();
        String strB = "";
        ah.c cVar = null;
        Date date = null;
        while (bVar.s()) {
            String strX = bVar.x();
            if (strX != null) {
                int iHashCode = strX.hashCode();
                if (iHashCode != -1408207997) {
                    if (iHashCode != -1169356335) {
                        if (iHashCode != 3355) {
                            if (iHashCode == 3575610 && strX.equals("type")) {
                                String strB2 = bVar.B();
                                Iterator<E> it = ah.c.f3596m.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!((ah.c) next).f3597a.equals(strB2));
                                cVar = (ah.c) next;
                            }
                        } else if (strX.equals("id")) {
                            strB = bVar.B();
                            kotlin.jvm.internal.n.e(strB, "nextString(...)");
                        }
                    } else if (strX.equals("sortReferance")) {
                        date = new Date(bVar.w());
                    }
                } else if (strX.equals("assets")) {
                    bVar.k();
                    while (bVar.s()) {
                        try {
                            arrayList.add(r9.b.x(bVar));
                        } catch (Exception e10) {
                            Log.e("AssetFolderJsonModel", "Error reading CGAsset", e10);
                            bVar.F();
                        }
                    }
                    bVar.q();
                }
            }
            bVar.F();
        }
        bVar.r();
        if (cVar == null) {
            cVar = ah.c.SIMILAR;
        }
        dh.a aVar = new dh.a(strB, cVar, new ArrayList());
        aVar.a(arrayList);
        if (date != null) {
            aVar.f38873e = date;
        }
        return aVar;
    }

    public static void c(Throwable th2, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.n.f(th2, "<this>");
        kotlin.jvm.internal.n.f(exception, "exception");
        if (th2 != exception) {
            Integer num = fk.a.f40971a;
            if (num == null || num.intValue() >= 19) {
                th2.addSuppressed(exception);
                return;
            }
            Method method = ek.a.f40110a;
            if (method != null) {
                method.invoke(th2, exception);
            }
        }
    }

    public static IBinder c0(Parcel parcel, int i10) {
        int iF0 = f0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iF0);
        return strongBinder;
    }

    public static final r0 d(pm.y yVar) {
        kotlin.jvm.internal.n.f(yVar, "<this>");
        return new r0(1, yVar);
    }

    public static int d0(Parcel parcel, int i10) {
        r0(parcel, i10, 4);
        return parcel.readInt();
    }

    public static n1.k e(t1.m mVar, String str, t1.j jVar, int i10) {
        Map map = Collections.EMPTY_MAP;
        Uri uriQ = l1.a.q(str, jVar.f50383c);
        long j10 = jVar.f50381a;
        long j11 = jVar.f50382b;
        String strA = mVar.a();
        if (strA == null) {
            strA = l1.a.q(((t1.b) mVar.f50389b.get(0)).f50335a, jVar.f50383c).toString();
        }
        String str2 = strA;
        go.k.o(uriQ, "The uri must be set.");
        return new n1.k(uriQ, 1, null, s1.f47307g, j10, j11, str2, i10);
    }

    public static long e0(Parcel parcel, int i10) {
        r0(parcel, i10, 8);
        return parcel.readLong();
    }

    public static int f0(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static final pm.y g0(pm.y yVar, al.j jVar) {
        return (yVar.getAnnotations().isEmpty() && jVar.isEmpty()) ? yVar : yVar.b0().m0(pm.c.r(yVar.M(), jVar));
    }

    public static final a1 h0(pm.y yVar) {
        pm.c0 c0Var;
        a1 a1VarQ;
        kotlin.jvm.internal.n.f(yVar, "<this>");
        a1 a1VarB0 = yVar.b0();
        if (a1VarB0 instanceof pm.r) {
            pm.r rVar = (pm.r) a1VarB0;
            pm.c0 c0VarQ = rVar.f48470b;
            if (!c0VarQ.P().getParameters().isEmpty() && c0VarQ.P().e() != null) {
                List parameters = c0VarQ.P().getParameters();
                kotlin.jvm.internal.n.e(parameters, "constructor.parameters");
                List list = parameters;
                ArrayList arrayList = new ArrayList(xj.p.W(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new pm.h0((m0) it.next()));
                }
                c0VarQ = pm.c.q(c0VarQ, arrayList, null, 2);
            }
            pm.c0 c0VarQ2 = rVar.f48471c;
            if (!c0VarQ2.P().getParameters().isEmpty() && c0VarQ2.P().e() != null) {
                List parameters2 = c0VarQ2.P().getParameters();
                kotlin.jvm.internal.n.e(parameters2, "constructor.parameters");
                List list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(xj.p.W(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new pm.h0((m0) it2.next()));
                }
                c0VarQ2 = pm.c.q(c0VarQ2, arrayList2, null, 2);
            }
            a1VarQ = pm.f.j(c0VarQ, c0VarQ2);
        } else {
            if (!(a1VarB0 instanceof pm.c0)) {
                throw new aa.b((byte) 0, 20);
            }
            c0Var = (pm.c0) a1VarB0;
            if (!c0Var.P().getParameters().isEmpty() && c0Var.P().e() != null) {
                a1VarQ = c0Var;
                a1VarQ = c0Var;
                List parameters3 = c0Var.P().getParameters();
                kotlin.jvm.internal.n.e(parameters3, "constructor.parameters");
                List list3 = parameters3;
                ArrayList arrayList3 = new ArrayList(xj.p.W(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new pm.h0((m0) it3.next()));
                }
                a1VarQ = pm.c.q(c0Var, arrayList3, null, 2);
            }
        }
        a1VarQ = c0Var;
        a1VarQ = c0Var;
        a1VarQ = c0Var;
        return pm.c.h(a1VarQ, a1VarB0);
    }

    public static int i(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName)) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, context.getOpPackageName()) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static final void i0(int i10, int i11, Object[] objArr) {
        kotlin.jvm.internal.n.f(objArr, "<this>");
        while (i10 < i11) {
            objArr[i10] = null;
            i10++;
        }
    }

    public static final void j(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                c(th2, th3);
            }
        }
    }

    public static int j0(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static final Type k(x xVar, boolean z10) {
        k1 k1Var = (k1) xVar;
        e eVarE = k1Var.e();
        if (eVarE instanceof y) {
            return new f0((y) eVarE);
        }
        if (!(eVarE instanceof d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + k1Var);
        }
        d dVar = (d) eVarE;
        Class clsQ = z10 ? d0.c.q(dVar) : d0.c.p(dVar);
        List listC = k1Var.c();
        if (listC.isEmpty()) {
            return clsQ;
        }
        if (!clsQ.isArray()) {
            return t(clsQ, listC);
        }
        if (clsQ.getComponentType().isPrimitive()) {
            return clsQ;
        }
        a0 a0Var = (a0) xj.n.H0(listC);
        if (a0Var == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + k1Var);
        }
        b0 b0Var = a0Var.f49103a;
        x xVar2 = a0Var.f49104b;
        int i10 = b0Var == null ? -1 : g0.f49119a[b0Var.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return clsQ;
        }
        if (i10 != 2 && i10 != 3) {
            throw new aa.b((byte) 0, 20);
        }
        kotlin.jvm.internal.n.c(xVar2);
        Type typeK = k(xVar2, false);
        return typeK instanceof Class ? clsQ : new a(typeK);
    }

    public static Set k0(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        kotlin.jvm.internal.n.e(setSingleton, "singleton(...)");
        return setSingleton;
    }

    public static final boolean l(pm.y yVar, n0 n0Var, Set set) {
        boolean zL;
        if (kotlin.jvm.internal.n.a(yVar.P(), n0Var)) {
            return true;
        }
        zk.g gVarE = yVar.P().e();
        zk.h hVar = gVarE instanceof zk.h ? (zk.h) gVarE : null;
        List listI = hVar != null ? hVar.i() : null;
        Iterable iterableT0 = xj.n.T0(yVar.t());
        if (!(iterableT0 instanceof Collection) || !((Collection) iterableT0).isEmpty()) {
            Iterator it = iterableT0.iterator();
            do {
                xj.z zVar = (xj.z) it;
                if (zVar.f53872b.hasNext()) {
                    xj.y yVar2 = (xj.y) zVar.next();
                    int i10 = yVar2.f53869a;
                    q0 q0Var = (q0) yVar2.f53870b;
                    m0 m0Var = listI != null ? (m0) xj.n.r0(i10, listI) : null;
                    if ((m0Var == null || set == null || !set.contains(m0Var)) && !q0Var.c()) {
                        pm.y yVarB = q0Var.b();
                        kotlin.jvm.internal.n.e(yVarB, "argument.type");
                        zL = l(yVarB, n0Var, set);
                    } else {
                        zL = false;
                    }
                }
            } while (!zL);
            return true;
        }
        return false;
    }

    public static void l0(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + f0(parcel, i10));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00da  */
    public static el.b m(Class klass) {
        eo.g gVar;
        rl.k gVar2;
        sl.a aVar;
        kotlin.jvm.internal.n.f(klass, "klass");
        sl.d dVar = new sl.d();
        dVar.f50272a = null;
        dVar.f50273b = null;
        dVar.f50274c = 0;
        dVar.f50275d = null;
        dVar.f50276e = null;
        dVar.f50277f = null;
        dVar.f50278g = null;
        dVar.f50279h = null;
        Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        kotlin.jvm.internal.n.e(declaredAnnotations, "klass.declaredAnnotations");
        for (Annotation annotation : declaredAnnotations) {
            kotlin.jvm.internal.n.e(annotation, "annotation");
            Class clsP = d0.c.p(d0.c.l(annotation));
            yl.b bVarA = fl.c.a(clsP);
            yl.c cVarB = bVarA.b();
            if (cVarB.equals(il.y.f43120a)) {
                gVar2 = new rb.c(dVar, 5);
            } else if (cVarB.equals(il.y.f43133o)) {
                gVar2 = new k0(dVar, 11);
            } else if (sl.d.f50270i || dVar.f50278g != null || (aVar = (sl.a) sl.d.f50271j.get(bVarA)) == null) {
                gVar2 = null;
            } else {
                dVar.f50278g = aVar;
                gVar2 = new na.g(dVar, 13);
            }
            if (gVar2 != null) {
                j1.f.G(gVar2, annotation, clsP);
            }
        }
        xl.f fVar = xl.f.f53902g;
        if (dVar.f50278g == null || dVar.f50272a == null) {
            gVar = null;
        } else {
            xl.f fVar2 = new xl.f(dVar.f50272a, (dVar.f50274c & 8) != 0);
            if (fVar2.b(fVar)) {
                sl.a aVar2 = dVar.f50278g;
                if ((aVar2 == sl.a.CLASS || aVar2 == sl.a.FILE_FACADE || aVar2 == sl.a.MULTIFILE_CLASS_PART) && dVar.f50275d == null) {
                    gVar = null;
                }
            } else {
                dVar.f50277f = dVar.f50275d;
                dVar.f50275d = null;
            }
            String[] strArr = dVar.f50279h;
            if (strArr != null) {
                xl.a.a(strArr);
            }
            gVar = new eo.g(dVar.f50278g, fVar2, dVar.f50275d, dVar.f50277f, dVar.f50276e, dVar.f50273b, dVar.f50274c);
        }
        if (gVar == null) {
            return null;
        }
        return new el.b(klass, gVar);
    }

    public static String m0(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        exc.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        kotlin.jvm.internal.n.e(string, "toString(...)");
        return string;
    }

    public static Bundle n(Parcel parcel, int i10) {
        int iF0 = f0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iF0);
        return bundle;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    public static void n0(k3.d dVar, k3.l lVar, l1.g gVar) {
        int nextEventTimeIndex;
        boolean z10;
        long j10 = lVar.f44296a;
        if (j10 == C.TIME_UNSET) {
            nextEventTimeIndex = 0;
        } else {
            nextEventTimeIndex = dVar.getNextEventTimeIndex(j10);
            if (nextEventTimeIndex == -1) {
                nextEventTimeIndex = dVar.getEventTimeCount();
            }
            if (nextEventTimeIndex > 0 && dVar.getEventTime(nextEventTimeIndex - 1) == j10) {
                nextEventTimeIndex--;
            }
        }
        if (j10 == C.TIME_UNSET || nextEventTimeIndex >= dVar.getEventTimeCount()) {
            z10 = false;
        } else {
            List cues = dVar.getCues(j10);
            long eventTime = dVar.getEventTime(nextEventTimeIndex);
            if (cues.isEmpty()) {
                z10 = false;
            } else {
                long j11 = lVar.f44296a;
                if (j11 < eventTime) {
                    gVar.accept(new k3.a(cues, j11, eventTime - j11));
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        for (int i10 = nextEventTimeIndex; i10 < dVar.getEventTimeCount(); i10++) {
            V(dVar, i10, gVar);
        }
        if (lVar.f44297b) {
            if (z10) {
                nextEventTimeIndex--;
            }
            for (int i11 = 0; i11 < nextEventTimeIndex; i11++) {
                V(dVar, i11, gVar);
            }
            if (z10) {
                gVar.accept(new k3.a(dVar.getCues(j10), dVar.getEventTime(nextEventTimeIndex), j10 - dVar.getEventTime(nextEventTimeIndex)));
            }
        }
    }

    public static byte[] o(Parcel parcel, int i10) {
        int iF0 = f0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iF0);
        return bArrCreateByteArray;
    }

    public static int o0(Parcel parcel) {
        int i10 = parcel.readInt();
        int iF0 = f0(parcel, i10);
        char c4 = (char) i10;
        int iDataPosition = parcel.dataPosition();
        if (c4 != 20293) {
            throw new l9.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i10))), parcel);
        }
        int i11 = iF0 + iDataPosition;
        if (i11 >= iDataPosition && i11 <= parcel.dataSize()) {
            return i11;
        }
        throw new l9.b(l1.d.j(new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i11).length()), iDataPosition, "Size read is invalid start=", i11, " end="), parcel);
    }

    public static byte[][] p(Parcel parcel, int i10) {
        int iF0 = f0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        byte[][] bArr = new byte[i11][];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iF0);
        return bArr;
    }

    public static void p0(og.c cVar, dh.a folder) {
        kotlin.jvm.internal.n.f(folder, "folder");
        cVar.n();
        cVar.q("id");
        cVar.w(folder.f38869a);
        cVar.q("type");
        cVar.w(folder.f38870b.f3597a);
        cVar.q("sortReferance");
        cVar.u(folder.f38873e.getTime());
        cVar.q("assets");
        cVar.k();
        Iterator it = folder.f38871c.iterator();
        while (it.hasNext()) {
            r9.b.M(cVar, (dh.b) it.next());
        }
        cVar.o(1, 2, ']');
        cVar.p();
    }

    public static int[] q(Parcel parcel, int i10) {
        int iF0 = f0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iF0);
        return iArrCreateIntArray;
    }

    public static String q0(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strH;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                strH = "null";
            } else {
                try {
                    strH = obj.toString();
                } catch (Exception e10) {
                    String strI = wi.d.i(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strI), (Throwable) e10);
                    strH = l1.d.h("<", strI, " threw ", e10.getClass().getName(), ">");
                }
            }
            objArr[i11] = strH;
            i11++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (iIndexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i12, iIndexOf);
            sb2.append(objArr[i10]);
            i10++;
            i12 = iIndexOf + 2;
        }
        sb2.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static ArrayList r(Parcel parcel, int i10) {
        int iF0 = f0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iF0);
        return arrayList;
    }

    public static void r0(Parcel parcel, int i10, int i11) {
        int iF0 = f0(parcel, i10);
        if (iF0 == i11) {
            return;
        }
        String hexString = Integer.toHexString(iF0);
        int length = String.valueOf(i11).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iF0).length() + 4 + 1);
        l1.d.p(sb2, "Expected size ", i11, " got ", iF0);
        throw new l9.b(q4.a.j(sb2, " (0x", hexString, ")"), parcel);
    }

    public static Parcelable s(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iF0 = f0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iF0);
        return parcelable;
    }

    public static void s0(Parcel parcel, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        String hexString = Integer.toHexString(i10);
        int length = String.valueOf(i11).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i10).length() + 4 + 1);
        l1.d.p(sb2, "Expected size ", i11, " got ", i10);
        throw new l9.b(q4.a.j(sb2, " (0x", hexString, ")"), parcel);
    }

    public static final e0 t(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(xj.p.W(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(J((a0) it.next()));
            }
            return new e0(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(xj.p.W(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(J((a0) it2.next()));
            }
            return new e0(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        e0 e0VarT = t(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(xj.p.W(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(J((a0) it3.next()));
        }
        return new e0(cls, e0VarT, arrayList3);
    }

    public static final r0 u(pm.y type, int i10, m0 m0Var) {
        kotlin.jvm.internal.n.f(type, "type");
        d5.u.n(i10, "projectionKind");
        if ((m0Var != null ? m0Var.v() : 0) == i10) {
            i10 = 1;
        }
        return new r0(i10, type);
    }

    public static String v(Parcel parcel, int i10) {
        int iF0 = f0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iF0);
        return string;
    }

    public static String[] w(Parcel parcel, int i10) {
        int iF0 = f0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iF0);
        return strArrCreateStringArray;
    }

    public static ArrayList x(Parcel parcel, int i10) {
        int iF0 = f0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iF0);
        return arrayListCreateStringArrayList;
    }

    public static Object[] y(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iF0 = f0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iF0);
        return objArrCreateTypedArray;
    }

    public static ArrayList z(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iF0 = f0(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iF0);
        return arrayListCreateTypedArrayList;
    }

    public abstract String A(byte[] bArr, int i10, int i11);

    public abstract int C(byte[] bArr, int i10, int i11, String str);

    public abstract ta.f F(ta.r rVar);

    public abstract ta.q G(ta.r rVar);

    public abstract Integer I();

    public abstract va.i N();

    public abstract int W(byte[] bArr, int i10, int i11);

    public abstract void X(ta.q qVar, ta.q qVar2);

    public abstract void Y(ta.q qVar, Thread thread);

    public abstract long Z();

    public abstract boolean f(ta.r rVar, ta.f fVar, ta.f fVar2);

    public abstract boolean g(ta.r rVar, Object obj, Object obj2);

    public abstract boolean h(ta.r rVar, ta.q qVar, ta.q qVar2);
}
