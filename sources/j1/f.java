package j1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebSettings;
import cl.x0;
import cn.d0;
import cn.n0;
import com.google.android.gms.internal.measurement.f2;
import com.google.android.gms.internal.measurement.nf;
import com.unity3d.services.UnityAdsConstants;
import d5.u;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import q7.e0;
import qk.w;
import tj.r;
import zk.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f implements p0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AudioManager f43591a;

    public static int A(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 == 3) {
            return 4;
        }
        if (i10 == 4) {
            return 5;
        }
        if (i10 == 5) {
            return 6;
        }
        throw new IllegalArgumentException(defpackage.e.h(i10, "Could not convert ", " to State"));
    }

    public static String B(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e10) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e10);
                    StringBuilder sbK = u.k("<", str2, " threw ");
                    sbK.append(e10.getClass().getName());
                    sbK.append(">");
                    string = sbK.toString();
                }
            }
            objArr[i11] = string;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i12 = 0;
        while (i10 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i12)) != -1) {
            sb2.append((CharSequence) strValueOf, i12, iIndexOf);
            sb2.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) strValueOf, i12, strValueOf.length());
        if (i10 < objArr.length) {
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

    public static List C(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.n.e(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:42:0x0105  */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0111  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011d, code lost:
    
        if (fm.e.g(r0).equals(fm.e.g(r3)) != false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static rl.j D(zk.s r8, cl.x0 r9) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.f.D(zk.s, cl.x0):rl.j");
    }

    public static v0.b E(String name, na.g gVar, jc.a aVar, int i10) {
        if ((i10 & 2) != 0) {
            gVar = null;
        }
        jk.b bVar = aVar;
        if ((i10 & 4) != 0) {
            bVar = v0.a.f52278e;
        }
        jn.e eVar = n0.f6748a;
        hn.d dVarB = d0.b(jn.d.f44017b.plus(d0.e()));
        kotlin.jvm.internal.n.f(name, "name");
        return new v0.b(name, gVar, bVar, dVarB);
    }

    public static void F(rl.m mVar, Annotation annotation) {
        Class clsP = d0.c.p(d0.c.l(annotation));
        rl.k kVarL = mVar.l(fl.c.a(clsP), new el.a(annotation));
        if (kVarL != null) {
            G(kVarL, annotation, clsP);
        }
    }

    public static void G(rl.k kVar, Annotation annotation, Class cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        kotlin.jvm.internal.n.e(declaredMethods, "annotationType.declaredMethods");
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                kotlin.jvm.internal.n.c(objInvoke);
                yl.f fVarE = yl.f.e(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    kVar.u(fVarE, g((Class) objInvoke));
                } else if (el.d.f40115a.contains(enclosingClass)) {
                    kVar.p(fVarE, objInvoke);
                } else {
                    List list = fl.c.f40980a;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        kotlin.jvm.internal.n.e(enclosingClass, "if (clazz.isEnum) clazz else clazz.enclosingClass");
                        kVar.w(fVarE, fl.c.a(enclosingClass), yl.f.e(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        kotlin.jvm.internal.n.e(interfaces, "clazz.interfaces");
                        Class annotationClass = (Class) xj.k.z0(interfaces);
                        kotlin.jvm.internal.n.e(annotationClass, "annotationClass");
                        rl.k kVarZ = kVar.z(fl.c.a(annotationClass), fVarE);
                        if (kVarZ != null) {
                            G(kVarZ, (Annotation) objInvoke, annotationClass);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        rl.l lVarL = kVar.l(fVarE);
                        if (lVarL != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                yl.b bVarA = fl.c.a(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                                    lVarL.b0(bVarA, yl.f.e(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type java.lang.Class<*>");
                                    lVarL.U(g((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) objInvoke) {
                                    rl.k kVarS = lVarL.s(fl.c.a(componentType));
                                    if (kVarS != null) {
                                        kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Annotation");
                                        G(kVarS, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) objInvoke) {
                                    lVarL.j0(obj4);
                                }
                            }
                            lVarL.k();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        kVar.k();
    }

    public static void H(xi.f binaryMessenger, final r rVar) {
        nf nfVar;
        kotlin.jvm.internal.n.f(binaryMessenger, "binaryMessenger");
        xi.l hVar = (rVar == null || (nfVar = rVar.f50897a) == null) ? new defpackage.h(10) : nfVar.e();
        Object obj = null;
        k5.g gVar = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDomStorageEnabled", hVar, obj);
        if (rVar != null) {
            final int i10 = 0;
            gVar.C(new xi.b() { // from class: tj.f0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    int i11 = i10;
                    r rVar2 = rVar;
                    switch (i11) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                rVar2.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = j1.f.C(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = j1.f.C(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                rVar2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = j1.f.C(null);
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                rVar2.getClass();
                                listQ14 = j1.f.C(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            t tVar = (t) obj30;
                            try {
                                rVar2.getClass();
                                int iOrdinal = tVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        k5.g gVar2 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptCanOpenWindowsAutomatically", hVar, obj);
        if (rVar != null) {
            final int i11 = 15;
            gVar2.C(new xi.b() { // from class: tj.f0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    int i12 = i11;
                    r rVar2 = rVar;
                    switch (i12) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                rVar2.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = j1.f.C(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = j1.f.C(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                rVar2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = j1.f.C(null);
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                rVar2.getClass();
                                listQ14 = j1.f.C(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            t tVar = (t) obj30;
                            try {
                                rVar2.getClass();
                                int iOrdinal = tVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        k5.g gVar3 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportMultipleWindows", hVar, obj);
        if (rVar != null) {
            final int i12 = 16;
            gVar3.C(new xi.b() { // from class: tj.f0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    int i13 = i12;
                    r rVar2 = rVar;
                    switch (i13) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                rVar2.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = j1.f.C(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = j1.f.C(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                rVar2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = j1.f.C(null);
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                rVar2.getClass();
                                listQ14 = j1.f.C(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            t tVar = (t) obj30;
                            try {
                                rVar2.getClass();
                                int iOrdinal = tVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                    }
                }
            });
        } else {
            gVar3.C(null);
        }
        k5.g gVar4 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptEnabled", hVar, obj);
        if (rVar != null) {
            final int i13 = 1;
            gVar4.C(new xi.b() { // from class: tj.f0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    int i14 = i13;
                    r rVar2 = rVar;
                    switch (i14) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                rVar2.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = j1.f.C(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = j1.f.C(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                rVar2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = j1.f.C(null);
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                rVar2.getClass();
                                listQ14 = j1.f.C(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            t tVar = (t) obj30;
                            try {
                                rVar2.getClass();
                                int iOrdinal = tVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                    }
                }
            });
        } else {
            gVar4.C(null);
        }
        k5.g gVar5 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUserAgentString", hVar, obj);
        if (rVar != null) {
            final int i14 = 2;
            gVar5.C(new xi.b() { // from class: tj.f0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    int i15 = i14;
                    r rVar2 = rVar;
                    switch (i15) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                rVar2.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = j1.f.C(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = j1.f.C(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                rVar2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = j1.f.C(null);
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                rVar2.getClass();
                                listQ14 = j1.f.C(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            t tVar = (t) obj30;
                            try {
                                rVar2.getClass();
                                int iOrdinal = tVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                    }
                }
            });
        } else {
            gVar5.C(null);
        }
        k5.g gVar6 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMediaPlaybackRequiresUserGesture", hVar, obj);
        if (rVar != null) {
            final int i15 = 3;
            gVar6.C(new xi.b() { // from class: tj.f0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    int i16 = i15;
                    r rVar2 = rVar;
                    switch (i16) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                rVar2.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = j1.f.C(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = j1.f.C(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                rVar2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = j1.f.C(null);
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                rVar2.getClass();
                                listQ14 = j1.f.C(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            t tVar = (t) obj30;
                            try {
                                rVar2.getClass();
                                int iOrdinal = tVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                    }
                }
            });
        } else {
            gVar6.C(null);
        }
        k5.g gVar7 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportZoom", hVar, obj);
        if (rVar != null) {
            final int i16 = 4;
            gVar7.C(new xi.b() { // from class: tj.f0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    int i17 = i16;
                    r rVar2 = rVar;
                    switch (i17) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                rVar2.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = j1.f.C(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = j1.f.C(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                rVar2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = j1.f.C(null);
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                rVar2.getClass();
                                listQ14 = j1.f.C(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            t tVar = (t) obj30;
                            try {
                                rVar2.getClass();
                                int iOrdinal = tVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                    }
                }
            });
        } else {
            gVar7.C(null);
        }
        k5.g gVar8 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setLoadWithOverviewMode", hVar, obj);
        if (rVar != null) {
            final int i17 = 5;
            gVar8.C(new xi.b() { // from class: tj.f0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    int i18 = i17;
                    r rVar2 = rVar;
                    switch (i18) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                rVar2.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = j1.f.C(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = j1.f.C(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                rVar2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = j1.f.C(null);
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                rVar2.getClass();
                                listQ14 = j1.f.C(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            t tVar = (t) obj30;
                            try {
                                rVar2.getClass();
                                int iOrdinal = tVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                    }
                }
            });
        } else {
            gVar8.C(null);
        }
        k5.g gVar9 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUseWideViewPort", hVar, obj);
        if (rVar != null) {
            final int i18 = 6;
            gVar9.C(new xi.b() { // from class: tj.f0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    int i19 = i18;
                    r rVar2 = rVar;
                    switch (i19) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                rVar2.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = j1.f.C(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = j1.f.C(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                rVar2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = j1.f.C(null);
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                rVar2.getClass();
                                listQ14 = j1.f.C(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            t tVar = (t) obj30;
                            try {
                                rVar2.getClass();
                                int iOrdinal = tVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                    }
                }
            });
        } else {
            gVar9.C(null);
        }
        k5.g gVar10 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDisplayZoomControls", hVar, obj);
        if (rVar != null) {
            final int i19 = 7;
            gVar10.C(new xi.b() { // from class: tj.f0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    int i110 = i19;
                    r rVar2 = rVar;
                    switch (i110) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                rVar2.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = j1.f.C(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = j1.f.C(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                rVar2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = j1.f.C(null);
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                rVar2.getClass();
                                listQ14 = j1.f.C(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            t tVar = (t) obj30;
                            try {
                                rVar2.getClass();
                                int iOrdinal = tVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                    }
                }
            });
        } else {
            gVar10.C(null);
        }
        k5.g gVar11 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setBuiltInZoomControls", hVar, obj);
        if (rVar != null) {
            final int i20 = 8;
            gVar11.C(new xi.b() { // from class: tj.f0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    int i110 = i20;
                    r rVar2 = rVar;
                    switch (i110) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                rVar2.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = j1.f.C(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = j1.f.C(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                rVar2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = j1.f.C(null);
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                rVar2.getClass();
                                listQ14 = j1.f.C(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            t tVar = (t) obj30;
                            try {
                                rVar2.getClass();
                                int iOrdinal = tVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                    }
                }
            });
        } else {
            gVar11.C(null);
        }
        k5.g gVar12 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowFileAccess", hVar, obj);
        if (rVar != null) {
            final int i21 = 9;
            gVar12.C(new xi.b() { // from class: tj.f0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    int i110 = i21;
                    r rVar2 = rVar;
                    switch (i110) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                rVar2.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = j1.f.C(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = j1.f.C(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                rVar2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = j1.f.C(null);
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                rVar2.getClass();
                                listQ14 = j1.f.C(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            t tVar = (t) obj30;
                            try {
                                rVar2.getClass();
                                int iOrdinal = tVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                    }
                }
            });
        } else {
            gVar12.C(null);
        }
        k5.g gVar13 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowContentAccess", hVar, obj);
        if (rVar != null) {
            final int i22 = 10;
            gVar13.C(new xi.b() { // from class: tj.f0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    int i110 = i22;
                    r rVar2 = rVar;
                    switch (i110) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                rVar2.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = j1.f.C(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = j1.f.C(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                rVar2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = j1.f.C(null);
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                rVar2.getClass();
                                listQ14 = j1.f.C(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            t tVar = (t) obj30;
                            try {
                                rVar2.getClass();
                                int iOrdinal = tVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                    }
                }
            });
        } else {
            gVar13.C(null);
        }
        k5.g gVar14 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setGeolocationEnabled", hVar, obj);
        if (rVar != null) {
            final int i23 = 11;
            gVar14.C(new xi.b() { // from class: tj.f0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    int i110 = i23;
                    r rVar2 = rVar;
                    switch (i110) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                rVar2.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = j1.f.C(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = j1.f.C(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                rVar2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = j1.f.C(null);
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                rVar2.getClass();
                                listQ14 = j1.f.C(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            t tVar = (t) obj30;
                            try {
                                rVar2.getClass();
                                int iOrdinal = tVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                    }
                }
            });
        } else {
            gVar14.C(null);
        }
        k5.g gVar15 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setTextZoom", hVar, obj);
        if (rVar != null) {
            final int i24 = 12;
            gVar15.C(new xi.b() { // from class: tj.f0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    int i110 = i24;
                    r rVar2 = rVar;
                    switch (i110) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                rVar2.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = j1.f.C(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = j1.f.C(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                rVar2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = j1.f.C(null);
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                rVar2.getClass();
                                listQ14 = j1.f.C(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            t tVar = (t) obj30;
                            try {
                                rVar2.getClass();
                                int iOrdinal = tVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                    }
                }
            });
        } else {
            gVar15.C(null);
        }
        k5.g gVar16 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.getUserAgentString", hVar, obj);
        if (rVar != null) {
            final int i25 = 13;
            gVar16.C(new xi.b() { // from class: tj.f0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    int i110 = i25;
                    r rVar2 = rVar;
                    switch (i110) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                rVar2.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = j1.f.C(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = j1.f.C(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                rVar2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = j1.f.C(null);
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                rVar2.getClass();
                                listQ14 = j1.f.C(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            t tVar = (t) obj30;
                            try {
                                rVar2.getClass();
                                int iOrdinal = tVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                    }
                }
            });
        } else {
            gVar16.C(null);
        }
        k5.g gVar17 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMixedContentMode", hVar, obj);
        if (rVar == null) {
            gVar17.C(null);
        } else {
            final int i26 = 14;
            gVar17.C(new xi.b() { // from class: tj.f0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    List listQ8;
                    List listQ9;
                    List listQ10;
                    List listQ11;
                    List listQ12;
                    List listQ13;
                    List listQ14;
                    List listQ15;
                    List listQ16;
                    List listQ17;
                    int i110 = i26;
                    r rVar2 = rVar;
                    switch (i110) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listQ = j1.f.C(null);
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof a) {
                                    a aVar = th2;
                                    listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listQ2 = j1.f.C(null);
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof a) {
                                    a aVar2 = th3;
                                    listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                rVar2.getClass();
                                webSettings3.setUserAgentString(str);
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof a) {
                                    a aVar3 = th4;
                                    listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            break;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listQ4 = j1.f.C(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof a) {
                                    a aVar4 = th5;
                                    listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            break;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof a) {
                                    a aVar5 = th6;
                                    listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                                } else {
                                    listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            break;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listQ6 = j1.f.C(null);
                                break;
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            break;
                        case 6:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listQ7 = j1.f.C(null);
                                break;
                            } catch (Throwable th8) {
                                if (th8 instanceof a) {
                                    a aVar7 = th8;
                                    listQ7 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                                } else {
                                    listQ7 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            bVar.e(listQ7);
                            break;
                        case 7:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listQ8 = j1.f.C(null);
                                break;
                            } catch (Throwable th9) {
                                if (th9 instanceof a) {
                                    a aVar8 = th9;
                                    listQ8 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                                } else {
                                    listQ8 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            bVar.e(listQ8);
                            break;
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listQ9 = j1.f.C(null);
                                break;
                            } catch (Throwable th10) {
                                if (th10 instanceof a) {
                                    a aVar9 = th10;
                                    listQ9 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                                } else {
                                    listQ9 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            bVar.e(listQ9);
                            break;
                        case 9:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listQ10 = j1.f.C(null);
                                break;
                            } catch (Throwable th11) {
                                if (th11 instanceof a) {
                                    a aVar10 = th11;
                                    listQ10 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                                } else {
                                    listQ10 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            bVar.e(listQ10);
                            break;
                        case 10:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listQ11 = j1.f.C(null);
                                break;
                            } catch (Throwable th12) {
                                if (th12 instanceof a) {
                                    a aVar11 = th12;
                                    listQ11 = xj.o.Q(aVar11.f50793a, aVar11.f50794b, aVar11.f50795c);
                                } else {
                                    listQ11 = xj.o.Q(th12.getClass().getSimpleName(), th12.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            bVar.e(listQ11);
                            break;
                        case 11:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listQ12 = j1.f.C(null);
                                break;
                            } catch (Throwable th13) {
                                if (th13 instanceof a) {
                                    a aVar12 = th13;
                                    listQ12 = xj.o.Q(aVar12.f50793a, aVar12.f50794b, aVar12.f50795c);
                                } else {
                                    listQ12 = xj.o.Q(th13.getClass().getSimpleName(), th13.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            bVar.e(listQ12);
                            break;
                        case 12:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                rVar2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listQ13 = j1.f.C(null);
                                break;
                            } catch (Throwable th14) {
                                if (th14 instanceof a) {
                                    a aVar13 = th14;
                                    listQ13 = xj.o.Q(aVar13.f50793a, aVar13.f50794b, aVar13.f50795c);
                                } else {
                                    listQ13 = xj.o.Q(th14.getClass().getSimpleName(), th14.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            bVar.e(listQ13);
                            break;
                        case 13:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                rVar2.getClass();
                                listQ14 = j1.f.C(webSettings14.getUserAgentString());
                                break;
                            } catch (Throwable th15) {
                                if (th15 instanceof a) {
                                    a aVar14 = th15;
                                    listQ14 = xj.o.Q(aVar14.f50793a, aVar14.f50794b, aVar14.f50795c);
                                } else {
                                    listQ14 = xj.o.Q(th15.getClass().getSimpleName(), th15.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            bVar.e(listQ14);
                            break;
                        case 14:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            t tVar = (t) obj30;
                            try {
                                rVar2.getClass();
                                int iOrdinal = tVar.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listQ15 = j1.f.C(null);
                                break;
                            } catch (Throwable th16) {
                                if (th16 instanceof a) {
                                    a aVar15 = th16;
                                    listQ15 = xj.o.Q(aVar15.f50793a, aVar15.f50794b, aVar15.f50795c);
                                } else {
                                    listQ15 = xj.o.Q(th16.getClass().getSimpleName(), th16.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            bVar.e(listQ15);
                            break;
                        case 15:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listQ16 = j1.f.C(null);
                                break;
                            } catch (Throwable th17) {
                                if (th17 instanceof a) {
                                    a aVar16 = th17;
                                    listQ16 = xj.o.Q(aVar16.f50793a, aVar16.f50794b, aVar16.f50795c);
                                } else {
                                    listQ16 = xj.o.Q(th17.getClass().getSimpleName(), th17.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            bVar.e(listQ16);
                            break;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                rVar2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listQ17 = j1.f.C(null);
                                break;
                            } catch (Throwable th18) {
                                if (th18 instanceof a) {
                                    a aVar17 = th18;
                                    listQ17 = xj.o.Q(aVar17.f50793a, aVar17.f50794b, aVar17.f50795c);
                                } else {
                                    listQ17 = xj.o.Q(th18.getClass().getSimpleName(), th18.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th18), th18.getCause()));
                                }
                            }
                            bVar.e(listQ17);
                            break;
                    }
                }
            });
        }
    }

    public static int I(int i10) {
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return 0;
        }
        int i11 = 1;
        if (iC != 1) {
            i11 = 2;
            if (iC != 2) {
                i11 = 3;
                if (iC != 3) {
                    i11 = 4;
                    if (iC != 4) {
                        if (iC == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + u.w(i10) + " to int");
                    }
                }
            }
        }
        return i11;
    }

    public static String J(int i10) {
        ArrayList arrayList = new ArrayList();
        if (f(i10, 1)) {
            arrayList.add(1);
        }
        if (f(i10, 4)) {
            arrayList.add(2);
        }
        if (f(i10, 2)) {
            arrayList.add(3);
        }
        return defpackage.e.o("( ", xj.n.u0(arrayList, " OR ", null, null, new bh.a(12), 30), " )");
    }

    public static boolean L(byte b10) {
        return b10 > -65;
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static Bitmap b(Bitmap bitmap, int i10) {
        if (bitmap != null) {
            switch (i10) {
                case 1:
                case 3:
                case 6:
                case 8:
                    break;
                case 2:
                case 4:
                case 5:
                case 7:
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Matrix matrix = new Matrix();
                    if (i10 == 2 || i10 == 7) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else {
                        if (i10 != 4 && i10 != 5) {
                            return bitmap;
                        }
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                    if (bitmapCreateBitmap != bitmap) {
                        bitmap.recycle();
                    }
                    return bitmapCreateBitmap;
                default:
                    f2.o(i10, "Unknown EXIF orientation: ", "ImageUtils");
                    return bitmap;
            }
        }
        return bitmap;
    }

    public static final Object c(Object possiblyPrimitiveType, boolean z10) {
        gm.c cVar;
        kotlin.jvm.internal.n.f(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (!z10) {
            return possiblyPrimitiveType;
        }
        rl.j jVar = (rl.j) possiblyPrimitiveType;
        if (!(jVar instanceof rl.i) || (cVar = ((rl.i) jVar).f49634i) == null) {
            return jVar;
        }
        String strE = gm.b.c(cVar.h()).e();
        kotlin.jvm.internal.n.e(strE, "byFqNameWithoutInnerClas…apperFqName).internalName");
        return rl.e.d(strE);
    }

    public static yj.c d(yj.c cVar) {
        cVar.s();
        cVar.f54416c = true;
        return cVar.f54415b > 0 ? cVar : yj.c.f54413d;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static d5.d e(byte[] bArr) throws Throwable {
        Throwable th2;
        ObjectInputStream objectInputStream;
        IOException e10;
        d5.d dVar = new d5.d();
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream2 = null;
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        try {
                            for (int i10 = objectInputStream.readInt(); i10 > 0; i10--) {
                                dVar.f38686a.add(new d5.c(objectInputStream.readBoolean(), Uri.parse(objectInputStream.readUTF())));
                            }
                        } catch (IOException e11) {
                            e10 = e11;
                            e10.printStackTrace();
                            if (objectInputStream != null) {
                            }
                            byteArrayInputStream.close();
                            return dVar;
                        }
                        byteArrayInputStream.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                } catch (IOException e13) {
                    objectInputStream = null;
                    e10 = e13;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (0 != 0) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e14) {
                            e14.printStackTrace();
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th2;
                    } catch (IOException e15) {
                        e15.printStackTrace();
                        throw th2;
                    }
                }
                try {
                    objectInputStream.close();
                } catch (IOException e16) {
                    e16.printStackTrace();
                }
            } catch (Throwable th4) {
                th2 = th4;
                if (0 != 0) {
                    objectInputStream2.close();
                }
                byteArrayInputStream.close();
                throw th2;
            }
        }
        return dVar;
    }

    public static boolean f(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, wj.d] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, wj.d] */
    public static dm.f g(Class cls) {
        int i10 = 0;
        while (cls.isArray()) {
            i10++;
            cls = cls.getComponentType();
            kotlin.jvm.internal.n.e(cls, "currentClass.componentType");
        }
        if (cls.isPrimitive()) {
            if (cls.equals(Void.TYPE)) {
                return new dm.f(yl.b.j(wk.l.f53341d.g()), i10);
            }
            wk.j jVarG = gm.c.b(cls.getName()).g();
            kotlin.jvm.internal.n.e(jVarG, "get(currentClass.name).primitiveType");
            return i10 > 0 ? new dm.f(yl.b.j((yl.c) jVarG.f53329d.getValue()), i10 - 1) : new dm.f(yl.b.j((yl.c) jVarG.f53328c.getValue()), i10);
        }
        yl.b bVarA = fl.c.a(cls);
        String str = yk.d.f54447a;
        yl.b bVar = (yl.b) yk.d.f54454h.get(bVarA.b().i());
        if (bVar != null) {
            bVarA = bVar;
        }
        return new dm.f(bVarA, i10);
    }

    public static int h(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final int i(int i10) {
        u.n(i10, "<this>");
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return 3;
        }
        if (iC == 1) {
            return 1;
        }
        if (iC == 2) {
            return 2;
        }
        throw new aa.b((byte) 0, 20);
    }

    public static l7.a j(Bundle bundle, String applicationId) {
        String string;
        kotlin.jvm.internal.n.f(bundle, "bundle");
        kotlin.jvm.internal.n.f(applicationId, "applicationId");
        Date dateM = e0.m(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date dateM2 = e0.m(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
        if (string2 == null || string2.length() == 0 || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null || string.length() == 0) {
            return null;
        }
        return new l7.a(string2, applicationId, string, stringArrayList, null, null, l7.g.f45124c, dateM, new Date(), dateM2, bundle.getString("graph_domain"));
    }

    public static l7.a k(HashSet hashSet, Bundle bundle, l7.g gVar, String applicationId) {
        Collection collectionM;
        ArrayList arrayListM;
        ArrayList arrayListM2;
        kotlin.jvm.internal.n.f(bundle, "bundle");
        kotlin.jvm.internal.n.f(applicationId, "applicationId");
        Date dateM = e0.m(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        if (string != null) {
            Date dateM2 = e0.m(bundle, "data_access_expiration_time", new Date(0L));
            String string2 = bundle.getString("granted_scopes");
            if (string2 != null && string2.length() > 0) {
                collectionM = hashSet;
                collectionM = hashSet;
                String[] strArr = (String[]) an.h.I0(string2, new String[]{","}, 0, 6).toArray(new String[0]);
                collectionM = xj.o.M(Arrays.copyOf(strArr, strArr.length));
            }
            collectionM = hashSet;
            collectionM = hashSet;
            collectionM = hashSet;
            String string3 = bundle.getString("denied_scopes");
            if (string3 == null || string3.length() <= 0) {
                arrayListM = null;
            } else {
                String[] strArr2 = (String[]) an.h.I0(string3, new String[]{","}, 0, 6).toArray(new String[0]);
                arrayListM = xj.o.M(Arrays.copyOf(strArr2, strArr2.length));
            }
            String string4 = bundle.getString("expired_scopes");
            if (string4 == null || string4.length() <= 0) {
                arrayListM2 = null;
            } else {
                String[] strArr3 = (String[]) an.h.I0(string4, new String[]{","}, 0, 6).toArray(new String[0]);
                arrayListM2 = xj.o.M(Arrays.copyOf(strArr3, strArr3.length));
            }
            if (!e0.w(string)) {
                String string5 = bundle.getString("graph_domain");
                String string6 = bundle.getString("signed_request");
                if (string6 == null || string6.length() == 0) {
                    throw new l7.n("Authorization response does not contain the signed_request");
                }
                try {
                    String[] strArr4 = (String[]) an.h.I0(string6, new String[]{"."}, 0, 6).toArray(new String[0]);
                    if (strArr4.length == 2) {
                        byte[] data = Base64.decode(strArr4[1], 0);
                        kotlin.jvm.internal.n.e(data, "data");
                        String string7 = new JSONObject(new String(data, an.a.f3768a)).getString("user_id");
                        kotlin.jvm.internal.n.e(string7, "jsonObject.getString(\"user_id\")");
                        return new l7.a(string, applicationId, string7, collectionM, arrayListM, arrayListM2, gVar, dateM, new Date(), dateM2, string5);
                    }
                } catch (UnsupportedEncodingException | JSONException unused) {
                }
                throw new l7.n("Failed to retrieve user_id from signed_request");
            }
        }
        return null;
    }

    public static l7.i l(Bundle bundle, String str) {
        kotlin.jvm.internal.n.f(bundle, "bundle");
        String string = bundle.getString("id_token");
        if (string == null || string.length() == 0 || str == null || str.length() == 0) {
            return null;
        }
        try {
            return new l7.i(string, str);
        } catch (Exception e10) {
            throw new l7.n(e10.getMessage(), e10);
        }
    }

    public static yj.c m() {
        return new yj.c(10);
    }

    public static boolean n(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
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
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                if (dArr.length == dArr2.length) {
                    int length = dArr.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        if (q(dArr[i10], dArr2[i10])) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                float[] fArr = (float[]) obj;
                float[] fArr2 = (float[]) obj2;
                if (fArr.length == fArr2.length) {
                    int length2 = fArr.length;
                    for (int i11 = 0; i11 < length2; i11++) {
                        if (t(fArr[i11], fArr2[i11])) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                Object[] objArr = (Object[]) obj;
                Object[] objArr2 = (Object[]) obj2;
                if (objArr.length == objArr2.length) {
                    int length3 = objArr.length;
                    for (int i12 = 0; i12 < length3; i12++) {
                        if (n(objArr[i12], objArr2[i12])) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof List) && (obj2 instanceof List)) {
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list.size() == list2.size()) {
                    Iterator it = list.iterator();
                    Iterator it2 = list2.iterator();
                    while (it.hasNext() && it2.hasNext()) {
                        if (!n(it.next(), it2.next())) {
                        }
                    }
                    return true;
                }
            } else {
                if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
                    if ((obj instanceof Double) && (obj2 instanceof Double)) {
                        return q(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
                    }
                    return ((obj instanceof Float) && (obj2 instanceof Float)) ? t(((Number) obj).floatValue(), ((Number) obj2).floatValue()) : obj.equals(obj2);
                }
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                if (map.size() == map2.size()) {
                    loop4: for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        for (Map.Entry entry2 : map2.entrySet()) {
                            if (n(key, entry2.getKey())) {
                                if (!n(entry.getValue(), entry2.getValue())) {
                                    break loop4;
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static int o(Object obj) {
        int iO = 0;
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return Arrays.hashCode((byte[]) obj);
        }
        if (obj instanceof int[]) {
            return Arrays.hashCode((int[]) obj);
        }
        if (obj instanceof long[]) {
            return Arrays.hashCode((long[]) obj);
        }
        int iO2 = 1;
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length = dArr.length;
            while (iO < length) {
                double d10 = dArr[iO];
                int i10 = iO2 * 31;
                if (d10 == 0.0d) {
                    d10 = 0.0d;
                }
                long jDoubleToLongBits = Double.doubleToLongBits(d10);
                iO2 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                iO++;
            }
            return iO2;
        }
        boolean z10 = obj instanceof float[];
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z10) {
            float[] fArr = (float[]) obj;
            int length2 = fArr.length;
            while (iO < length2) {
                float f11 = fArr[iO];
                int i11 = iO2 * 31;
                if (f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f11 = 0.0f;
                }
                iO2 = i11 + Float.floatToIntBits(f11);
                iO++;
            }
            return iO2;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length3 = objArr.length;
            while (iO < length3) {
                iO2 = (iO2 * 31) + o(objArr[iO]);
                iO++;
            }
            return iO2;
        }
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iO2 = (iO2 * 31) + o(it.next());
            }
            return iO2;
        }
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                iO += o(entry.getValue()) ^ (o(entry.getKey()) * 31);
            }
            return iO;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Number) obj).doubleValue();
            long jDoubleToLongBits2 = Double.doubleToLongBits(dDoubleValue != 0.0d ? dDoubleValue : 0.0d);
            return (int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32));
        }
        if (!(obj instanceof Float)) {
            return obj.hashCode();
        }
        float fFloatValue = ((Number) obj).floatValue();
        if (fFloatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f10 = fFloatValue;
        }
        return Float.floatToIntBits(f10);
    }

    public static boolean p(zk.b superDescriptor, zk.b subDescriptor) {
        kotlin.jvm.internal.n.f(superDescriptor, "superDescriptor");
        kotlin.jvm.internal.n.f(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof kl.e) || !(superDescriptor instanceof s)) {
            return false;
        }
        kl.e eVar = (kl.e) subDescriptor;
        eVar.B().size();
        s sVar = (s) superDescriptor;
        sVar.B().size();
        List listB = eVar.a().B();
        kotlin.jvm.internal.n.e(listB, "subDescriptor.original.valueParameters");
        List listB2 = sVar.a().B();
        kotlin.jvm.internal.n.e(listB2, "superDescriptor.original.valueParameters");
        for (wj.f fVar : xj.n.U0(listB, listB2)) {
            x0 subParameter = (x0) fVar.f53283a;
            x0 superParameter = (x0) fVar.f53284b;
            kotlin.jvm.internal.n.e(subParameter, "subParameter");
            boolean z10 = D((s) subDescriptor, subParameter) instanceof rl.i;
            kotlin.jvm.internal.n.e(superParameter, "superParameter");
            if (z10 != (D(sVar, superParameter) instanceof rl.i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean q(double d10, double d11) {
        if ((d10 == 0.0d ? 0.0d : d10) == (d11 != 0.0d ? d11 : 0.0d)) {
            return true;
        }
        return Double.isNaN(d10) && Double.isNaN(d11);
    }

    public static final Object r(s0.i iVar, jk.c cVar, ak.f fVar) {
        return iVar.a(new ch.a(cVar, null, 4), fVar);
    }

    public static String s(com.google.crypto.tink.shaded.protobuf.i iVar) {
        StringBuilder sb2 = new StringBuilder(iVar.size());
        for (int i10 = 0; i10 < iVar.size(); i10++) {
            byte b10 = iVar.b(i10);
            if (b10 == 34) {
                sb2.append("\\\"");
            } else if (b10 == 39) {
                sb2.append("\\'");
            } else if (b10 != 92) {
                switch (b10) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b10 < 32 || b10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b10 >>> 6) & 3) + 48));
                            sb2.append((char) (((b10 >>> 3) & 7) + 48));
                            sb2.append((char) ((b10 & 7) + 48));
                        } else {
                            sb2.append((char) b10);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static boolean t(float f10, float f11) {
        float f12 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f13 = f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : f10;
        if (f11 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f12 = f11;
        }
        if (f13 == f12) {
            return true;
        }
        return Float.isNaN(f10) && Float.isNaN(f11);
    }

    public static synchronized AudioManager u(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                f43591a = null;
            }
            AudioManager audioManager = f43591a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                l1.f fVar = new l1.f();
                l1.a.g().execute(new com.unity3d.services.ads.operation.show.b(22, applicationContext, fVar));
                fVar.a();
                AudioManager audioManager2 = f43591a;
                audioManager2.getClass();
                return audioManager2;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            f43591a = audioManager3;
            audioManager3.getClass();
            return audioManager3;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static String v(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static final Object w(om.m mVar, w p10) {
        kotlin.jvm.internal.n.f(mVar, "<this>");
        kotlin.jvm.internal.n.f(p10, "p");
        return mVar.invoke();
    }

    public static int x(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(defpackage.e.h(i10, "Could not convert ", " to BackoffPolicy"));
    }

    public static int y(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 == 3) {
            return 4;
        }
        if (i10 == 4) {
            return 5;
        }
        if (i10 == 5) {
            return 6;
        }
        throw new IllegalArgumentException(defpackage.e.h(i10, "Could not convert ", " to NetworkType"));
    }

    public static int z(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(defpackage.e.h(i10, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public abstract void K(byte[] bArr, int i10, int i11);
}
