package tk;

import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yl.c f51075a = new yl.c("kotlin.jvm.JvmStatic");

    public static final r a(Object obj) {
        r rVar = obj instanceof r ? (r) obj : null;
        if (rVar != null) {
            return rVar;
        }
        e0 e0VarB = b(obj);
        return e0VarB != null ? e0VarB : c(obj);
    }

    public static final e0 b(Object obj) {
        e0 e0Var = obj instanceof e0 ? (e0) obj : null;
        if (e0Var != null) {
            return e0Var;
        }
        kotlin.jvm.internal.j jVar = obj instanceof kotlin.jvm.internal.j ? (kotlin.jvm.internal.j) obj : null;
        qk.c cVarCompute = jVar != null ? jVar.compute() : null;
        if (cVarCompute instanceof e0) {
            return (e0) cVarCompute;
        }
        return null;
    }

    public static final i1 c(Object obj) {
        i1 i1Var = obj instanceof i1 ? (i1) obj : null;
        if (i1Var != null) {
            return i1Var;
        }
        kotlin.jvm.internal.x xVar = obj instanceof kotlin.jvm.internal.x ? (kotlin.jvm.internal.x) obj : null;
        qk.c cVarCompute = xVar != null ? xVar.compute() : null;
        if (cVarCompute instanceof i1) {
            return (i1) cVarCompute;
        }
        return null;
    }

    public static final ArrayList d(al.a aVar) throws IllegalAccessException, InvocationTargetException {
        List listC;
        kotlin.jvm.internal.n.f(aVar, "<this>");
        al.j annotations = aVar.getAnnotations();
        ArrayList<Annotation> arrayList = new ArrayList();
        Iterator it = annotations.iterator();
        while (true) {
            Annotation annotationI = null;
            if (!it.hasNext()) {
                break;
            }
            al.c cVar = (al.c) it.next();
            zk.j0 j0VarC = cVar.c();
            if (j0VarC instanceof el.a) {
                annotationI = ((el.a) j0VarC).f40111a;
            } else if (j0VarC instanceof el.g) {
                fl.r rVar = ((el.g) j0VarC).f40120a;
                fl.d dVar = rVar instanceof fl.d ? (fl.d) rVar : null;
                if (dVar != null) {
                    annotationI = dVar.f40988a;
                }
            } else {
                annotationI = i(cVar);
            }
            if (annotationI != null) {
                arrayList.add(annotationI);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (d0.c.p(d0.c.l((Annotation) it2.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Annotation annotation : arrayList) {
                        Class clsP = d0.c.p(d0.c.l(annotation));
                        if (!clsP.getSimpleName().equals("Container") || clsP.getAnnotation(kotlin.jvm.internal.f0.class) == null) {
                            listC = j1.f.C(annotation);
                        } else {
                            Object objInvoke = clsP.getDeclaredMethod(X3.i.X, null).invoke(annotation, null);
                            kotlin.jvm.internal.n.d(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                            listC = xj.k.a0((Annotation[]) objInvoke);
                        }
                        xj.t.a0(listC, arrayList2);
                    }
                    return arrayList2;
                }
            }
        }
        return arrayList;
    }

    public static final Object e(Type type) {
        kotlin.jvm.internal.n.f(type, "type");
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (type.equals(Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (type.equals(Character.TYPE)) {
            return (char) 0;
        }
        if (type.equals(Byte.TYPE)) {
            return (byte) 0;
        }
        if (type.equals(Short.TYPE)) {
            return (short) 0;
        }
        if (type.equals(Integer.TYPE)) {
            return 0;
        }
        if (type.equals(Float.TYPE)) {
            return Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (type.equals(Long.TYPE)) {
            return 0L;
        }
        if (type.equals(Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (type.equals(Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final zk.b f(Class moduleAnchor, zl.k proto, vl.f nameResolver, l3.i iVar, vl.a metadataVersion, jk.c cVar) {
        List list;
        kotlin.jvm.internal.n.f(moduleAnchor, "moduleAnchor");
        kotlin.jvm.internal.n.f(proto, "proto");
        kotlin.jvm.internal.n.f(nameResolver, "nameResolver");
        kotlin.jvm.internal.n.f(metadataVersion, "metadataVersion");
        el.f fVarA = n1.a(moduleAnchor);
        if (proto instanceof tl.y) {
            list = ((tl.y) proto).f51557i;
        } else {
            if (!(proto instanceof tl.g0)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            list = ((tl.g0) proto).f51245i;
        }
        List typeParameters = list;
        lm.i iVar2 = fVarA.f40118a;
        zk.w wVar = iVar2.f45538b;
        vl.g gVar = vl.g.f52655b;
        kotlin.jvm.internal.n.e(typeParameters, "typeParameters");
        return (zk.b) cVar.invoke(new lm.r(new com.google.android.gms.internal.consent_sdk.d(iVar2, nameResolver, wVar, iVar, gVar, metadataVersion, null, null, typeParameters)), proto);
    }

    public static final cl.z g(zk.c cVar) {
        kotlin.jvm.internal.n.f(cVar, "<this>");
        if (cVar.G() == null) {
            return null;
        }
        zk.j jVarE = cVar.e();
        kotlin.jvm.internal.n.d(jVarE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((zk.e) jVarE).y0();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class h(ClassLoader classLoader, yl.b bVar, int i10) {
        String str = yk.d.f54447a;
        yl.e eVarI = bVar.b().i();
        kotlin.jvm.internal.n.e(eVarI, "kotlinClassId.asSingleFqName().toUnsafe()");
        yl.b bVarF = yk.d.f(eVarI);
        if (bVarF != null) {
            bVar = bVarF;
        }
        String strB = bVar.g().b();
        String strB2 = bVar.h().b();
        if (strB.equals("kotlin")) {
            switch (strB2.hashCode()) {
                case -901856463:
                    if (strB2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (strB2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (strB2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (strB2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (strB2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (strB2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (strB2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (strB2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (strB2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (i10 > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(X3.j.f27834d);
            }
            sb2.append("L");
        }
        if (strB.length() > 0) {
            sb2.append(strB.concat("."));
        }
        sb2.append(an.p.m0(strB2, '.', '$'));
        if (i10 > 0) {
            sb2.append(";");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "StringBuilder().apply(builderAction).toString()");
        return no.b.G(classLoader, string);
    }

    public static final Annotation i(al.c cVar) {
        zk.e eVarD = fm.e.d(cVar);
        Class clsJ = eVarD != null ? j(eVarD) : null;
        if (clsJ == null) {
            clsJ = null;
        }
        if (clsJ == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = cVar.d().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            yl.f fVar = (yl.f) entry.getKey();
            dm.g gVar = (dm.g) entry.getValue();
            ClassLoader classLoader = clsJ.getClassLoader();
            kotlin.jvm.internal.n.e(classLoader, "annotationClass.classLoader");
            Object objK = k(gVar, classLoader);
            wj.f fVar2 = objK != null ? new wj.f(fVar.b(), objK) : null;
            if (fVar2 != null) {
                arrayList.add(fVar2);
            }
        }
        Map mapW = xj.b0.W(arrayList);
        Set setKeySet = mapW.keySet();
        ArrayList arrayList2 = new ArrayList(xj.p.W(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList2.add(clsJ.getDeclaredMethod((String) it.next(), null));
        }
        return (Annotation) com.google.android.gms.internal.auth.i.g(clsJ, mapW, arrayList2);
    }

    public static final Class j(zk.e eVar) {
        kotlin.jvm.internal.n.f(eVar, "<this>");
        zk.j0 source = eVar.c();
        kotlin.jvm.internal.n.e(source, "source");
        if (source instanceof rl.n) {
            return ((rl.n) source).f49643a.f40112a;
        }
        if (source instanceof el.g) {
            fl.r rVar = ((el.g) source).f40120a;
            kotlin.jvm.internal.n.d(rVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((fl.n) rVar).f41001a;
        }
        yl.b bVarF = fm.e.f(eVar);
        if (bVarF == null) {
            return null;
        }
        return h(fl.c.d(eVar.getClass()), bVarF, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object k(dm.g gVar, ClassLoader classLoader) {
        pm.y yVar;
        Class clsH;
        if (gVar instanceof dm.a) {
            return i((al.c) ((dm.a) gVar).f38953a);
        }
        int i10 = 0;
        if (gVar instanceof dm.b) {
            dm.b bVar = (dm.b) gVar;
            dm.x xVar = bVar instanceof dm.x ? (dm.x) bVar : null;
            if (xVar != null && (yVar = xVar.f38962c) != null) {
                Object obj = bVar.f38953a;
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(xj.p.W(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(k((dm.g) it.next(), classLoader));
                }
                yl.f fVar = wk.h.f53310e;
                zk.g gVarE = yVar.P().e();
                wk.j jVarR = gVarE == null ? null : wk.h.r(gVarE);
                switch (jVarR == null ? -1 : u1.f51069a[jVarR.ordinal()]) {
                    case -1:
                        if (!wk.h.y(yVar)) {
                            throw new IllegalStateException(("Not an array type: " + yVar).toString());
                        }
                        pm.y yVarB = ((pm.q0) xj.n.F0(yVar.t())).b();
                        kotlin.jvm.internal.n.e(yVarB, "type.arguments.single().type");
                        zk.g gVarE2 = yVarB.P().e();
                        zk.e eVar = gVarE2 instanceof zk.e ? (zk.e) gVarE2 : null;
                        if (eVar == null) {
                            throw new IllegalStateException(("Not a class type: " + yVarB).toString());
                        }
                        if (wk.h.G(yVarB)) {
                            int size = ((List) obj).size();
                            String[] strArr = new String[size];
                            while (i10 < size) {
                                Object obj2 = arrayList.get(i10);
                                kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                                strArr[i10] = obj2;
                                i10++;
                            }
                            return strArr;
                        }
                        if (wk.h.b(eVar, wk.l.P)) {
                            int size2 = ((List) obj).size();
                            Class[] clsArr = new Class[size2];
                            while (i10 < size2) {
                                Object obj3 = arrayList.get(i10);
                                kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                                clsArr[i10] = obj3;
                                i10++;
                            }
                            return clsArr;
                        }
                        yl.b bVarF = fm.e.f(eVar);
                        if (bVarF != null && (clsH = h(classLoader, bVarF, 0)) != null) {
                            Object objNewInstance = Array.newInstance((Class<?>) clsH, ((List) obj).size());
                            kotlin.jvm.internal.n.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                            Object[] objArr = (Object[]) objNewInstance;
                            int size3 = arrayList.size();
                            while (i10 < size3) {
                                objArr[i10] = arrayList.get(i10);
                                i10++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        throw new aa.b((byte) 0, 20);
                    case 1:
                        int size4 = ((List) obj).size();
                        boolean[] zArr = new boolean[size4];
                        while (i10 < size4) {
                            Object obj4 = arrayList.get(i10);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            zArr[i10] = ((Boolean) obj4).booleanValue();
                            i10++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) obj).size();
                        char[] cArr = new char[size5];
                        while (i10 < size5) {
                            Object obj5 = arrayList.get(i10);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Char");
                            cArr[i10] = ((Character) obj5).charValue();
                            i10++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) obj).size();
                        byte[] bArr = new byte[size6];
                        while (i10 < size6) {
                            Object obj6 = arrayList.get(i10);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Byte");
                            bArr[i10] = ((Byte) obj6).byteValue();
                            i10++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) obj).size();
                        short[] sArr = new short[size7];
                        while (i10 < size7) {
                            Object obj7 = arrayList.get(i10);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Short");
                            sArr[i10] = ((Short) obj7).shortValue();
                            i10++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) obj).size();
                        int[] iArr = new int[size8];
                        while (i10 < size8) {
                            Object obj8 = arrayList.get(i10);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.Int");
                            iArr[i10] = ((Integer) obj8).intValue();
                            i10++;
                        }
                        return iArr;
                    case 6:
                        int size9 = ((List) obj).size();
                        float[] fArr = new float[size9];
                        while (i10 < size9) {
                            Object obj9 = arrayList.get(i10);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Float");
                            fArr[i10] = ((Float) obj9).floatValue();
                            i10++;
                        }
                        return fArr;
                    case 7:
                        int size10 = ((List) obj).size();
                        long[] jArr = new long[size10];
                        while (i10 < size10) {
                            Object obj10 = arrayList.get(i10);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.Long");
                            jArr[i10] = ((Long) obj10).longValue();
                            i10++;
                        }
                        return jArr;
                    case 8:
                        int size11 = ((List) obj).size();
                        double[] dArr = new double[size11];
                        while (i10 < size11) {
                            Object obj11 = arrayList.get(i10);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Double");
                            dArr[i10] = ((Double) obj11).doubleValue();
                            i10++;
                        }
                        return dArr;
                }
            }
        } else if (gVar instanceof dm.i) {
            wj.f fVar2 = (wj.f) ((dm.i) gVar).f38953a;
            yl.b bVar2 = (yl.b) fVar2.f53283a;
            yl.f fVar3 = (yl.f) fVar2.f53284b;
            Class clsH2 = h(classLoader, bVar2, 0);
            if (clsH2 != null) {
                return Enum.valueOf(clsH2, fVar3.b());
            }
        } else if (gVar instanceof dm.s) {
            dm.r rVar = (dm.r) ((dm.s) gVar).f38953a;
            if (rVar instanceof dm.q) {
                dm.f fVar4 = ((dm.q) rVar).f38961a;
                return h(classLoader, fVar4.f38951a, fVar4.f38952b);
            }
            if (!(rVar instanceof dm.p)) {
                throw new aa.b((byte) 0, 20);
            }
            zk.g gVarE3 = ((dm.p) rVar).f38960a.P().e();
            zk.e eVar2 = gVarE3 instanceof zk.e ? (zk.e) gVarE3 : null;
            if (eVar2 != null) {
                return j(eVar2);
            }
        } else {
            if (!(gVar instanceof dm.j ? true : gVar instanceof dm.u)) {
                return gVar.b();
            }
        }
        return null;
    }
}
