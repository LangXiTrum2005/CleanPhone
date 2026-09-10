package com.bumptech.glide;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.WebView;
import cl.x0;
import com.google.android.gms.internal.consent_sdk.x;
import com.google.android.gms.internal.measurement.nf;
import com.ironsource.C0375hc;
import ea.f2;
import i1.e0;
import il.o;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.n;
import lm.w;
import m0.r1;
import pm.y;
import tl.e1;
import tl.z;
import xj.b0;
import xj.p;
import xj.t;
import xj.v;
import xn.l;
import xn.r;
import zk.j0;
import zk.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static int A(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean B() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static boolean C(Throwable th2) {
        Throwable cause;
        if (th2 instanceof InterruptedException) {
            return true;
        }
        if (th2.equals(th2.getCause()) || (cause = th2.getCause()) == null) {
            return false;
        }
        return C(cause);
    }

    public static final int D(z zVar) {
        int i10 = zVar == null ? -1 : w.f45596a[zVar.ordinal()];
        if (i10 != 1) {
            int i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    i11 = 4;
                    if (i10 != 4) {
                    }
                }
            }
            return i11;
        }
        return 1;
    }

    public static final void E(bf.b bVar, Iterable assets) {
        n.f(bVar, "<this>");
        n.f(assets, "assets");
        LinkedHashMap linkedHashMapY = b0.Y((Map) K(bVar));
        Iterator it = assets.iterator();
        while (it.hasNext()) {
            dh.b bVar2 = (dh.b) it.next();
            linkedHashMapY.put(bVar2.f38876a, bVar2);
        }
        bVar.a(linkedHashMapY);
    }

    public static l F(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            String str = strArr2[i11];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i11] = an.h.T0(str).toString();
        }
        int iJ = go.k.J(0, strArr2.length - 1, 2);
        if (iJ >= 0) {
            while (true) {
                String str2 = strArr2[i10];
                String str3 = strArr2[i10 + 1];
                h(str2);
                l(str3, str2);
                if (i10 == iJ) {
                    break;
                }
                i10 += 2;
            }
        }
        return new l(strArr2);
    }

    public static final boolean G(String method) {
        n.f(method, "method");
        return (method.equals(C0375hc.f28788a) || method.equals("HEAD")) ? false : true;
    }

    public static void J(ni.c cVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", ni.c.class).invoke(null, cVar);
        } catch (Exception e10) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + cVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e10);
        }
    }

    public static final Object K(bf.b bVar) {
        n.f(bVar, "<this>");
        Object obj = bVar.f5698a.get();
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException("BehaviorRelay has no value yet");
    }

    public static void L(xi.f binaryMessenger, final tj.l lVar) {
        nf nfVar;
        n.f(binaryMessenger, "binaryMessenger");
        xi.l hVar = (lVar == null || (nfVar = lVar.f50859a) == null) ? new defpackage.h(10) : nfVar.e();
        Object obj = null;
        k5.g gVar = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.instance", hVar, obj);
        if (lVar != null) {
            final int i10 = 0;
            gVar.C(new xi.b() { // from class: tj.x
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    switch (i10) {
                        case 0:
                            l lVar2 = lVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) lVar2.f50859a.f23783c).a(((Long) obj3).longValue(), CookieManager.getInstance());
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
                            l lVar3 = lVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                lVar3.getClass();
                                cookieManager.setCookie(str, str2);
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
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            hj.b bVar2 = new hj.b(bVar, 16);
                            lVar.getClass();
                            ((CookieManager) obj7).removeAllCookies(new k(bVar2, 0));
                            break;
                        case 3:
                            l lVar4 = lVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                lVar4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
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
                        default:
                            l lVar5 = lVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj11 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager3 = (CookieManager) obj11;
                            Object obj12 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj12;
                            try {
                                lVar5.getClass();
                                listQ4 = j1.f.C(cookieManager3.getCookie(str3));
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
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        k5.g gVar2 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setCookie", hVar, obj);
        if (lVar != null) {
            final int i11 = 1;
            gVar2.C(new xi.b() { // from class: tj.x
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    switch (i11) {
                        case 0:
                            l lVar2 = lVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) lVar2.f50859a.f23783c).a(((Long) obj3).longValue(), CookieManager.getInstance());
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
                            l lVar3 = lVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                lVar3.getClass();
                                cookieManager.setCookie(str, str2);
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
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            hj.b bVar2 = new hj.b(bVar, 16);
                            lVar.getClass();
                            ((CookieManager) obj7).removeAllCookies(new k(bVar2, 0));
                            break;
                        case 3:
                            l lVar4 = lVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                lVar4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
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
                        default:
                            l lVar5 = lVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj11 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager3 = (CookieManager) obj11;
                            Object obj12 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj12;
                            try {
                                lVar5.getClass();
                                listQ4 = j1.f.C(cookieManager3.getCookie(str3));
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
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        k5.g gVar3 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.removeAllCookies", hVar, obj);
        if (lVar != null) {
            final int i12 = 2;
            gVar3.C(new xi.b() { // from class: tj.x
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    switch (i12) {
                        case 0:
                            l lVar2 = lVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) lVar2.f50859a.f23783c).a(((Long) obj3).longValue(), CookieManager.getInstance());
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
                            l lVar3 = lVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                lVar3.getClass();
                                cookieManager.setCookie(str, str2);
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
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            hj.b bVar2 = new hj.b(bVar, 16);
                            lVar.getClass();
                            ((CookieManager) obj7).removeAllCookies(new k(bVar2, 0));
                            break;
                        case 3:
                            l lVar4 = lVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                lVar4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
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
                        default:
                            l lVar5 = lVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj11 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager3 = (CookieManager) obj11;
                            Object obj12 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj12;
                            try {
                                lVar5.getClass();
                                listQ4 = j1.f.C(cookieManager3.getCookie(str3));
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
                    }
                }
            });
        } else {
            gVar3.C(null);
        }
        k5.g gVar4 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setAcceptThirdPartyCookies", hVar, obj);
        if (lVar != null) {
            final int i13 = 3;
            gVar4.C(new xi.b() { // from class: tj.x
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    switch (i13) {
                        case 0:
                            l lVar2 = lVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) lVar2.f50859a.f23783c).a(((Long) obj3).longValue(), CookieManager.getInstance());
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
                            l lVar3 = lVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                lVar3.getClass();
                                cookieManager.setCookie(str, str2);
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
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            hj.b bVar2 = new hj.b(bVar, 16);
                            lVar.getClass();
                            ((CookieManager) obj7).removeAllCookies(new k(bVar2, 0));
                            break;
                        case 3:
                            l lVar4 = lVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                lVar4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
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
                        default:
                            l lVar5 = lVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj11 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager3 = (CookieManager) obj11;
                            Object obj12 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj12;
                            try {
                                lVar5.getClass();
                                listQ4 = j1.f.C(cookieManager3.getCookie(str3));
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
                    }
                }
            });
        } else {
            gVar4.C(null);
        }
        k5.g gVar5 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManager.getCookies", hVar, obj);
        if (lVar == null) {
            gVar5.C(null);
        } else {
            final int i14 = 4;
            gVar5.C(new xi.b() { // from class: tj.x
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    switch (i14) {
                        case 0:
                            l lVar2 = lVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) lVar2.f50859a.f23783c).a(((Long) obj3).longValue(), CookieManager.getInstance());
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
                            l lVar3 = lVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                lVar3.getClass();
                                cookieManager.setCookie(str, str2);
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
                            Object obj7 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            hj.b bVar2 = new hj.b(bVar, 16);
                            lVar.getClass();
                            ((CookieManager) obj7).removeAllCookies(new k(bVar2, 0));
                            break;
                        case 3:
                            l lVar4 = lVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                lVar4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
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
                        default:
                            l lVar5 = lVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj11 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager3 = (CookieManager) obj11;
                            Object obj12 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj12;
                            try {
                                lVar5.getClass();
                                listQ4 = j1.f.C(cookieManager3.getCookie(str3));
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
                    }
                }
            });
        }
    }

    public static pk.a M(pk.c cVar, int i10) {
        n.f(cVar, "<this>");
        boolean z10 = i10 > 0;
        Integer numValueOf = Integer.valueOf(i10);
        if (!z10) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i11 = cVar.f48393a;
        int i12 = cVar.f48394b;
        if (cVar.f48395c <= 0) {
            i10 = -i10;
        }
        return new pk.a(i11, i12, i10);
    }

    public static boolean N(View view, uj.c cVar) {
        if (view != null) {
            if (cVar.c(view)) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    if (N(viewGroup.getChildAt(i10), cVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static pk.c O(int i10, int i11) {
        if (i11 > Integer.MIN_VALUE) {
            return new pk.c(i10, i11 - 1, 1);
        }
        pk.c cVar = pk.c.f48400d;
        return pk.c.f48400d;
    }

    public static Object P(Class cls, String str, v6.c... cVarArr) {
        int length = cVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i10 = 0; i10 < cVarArr.length; i10++) {
            v6.c cVar = cVarArr[i10];
            cVar.getClass();
            clsArr[i10] = (Class) cVar.f52487a;
            objArr[i10] = cVarArr[i10].f52488b;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }

    public static ArrayList a(List protocols) {
        n.f(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((r) obj) != r.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p.W(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((r) it.next()).f54059a);
        }
        return arrayList2;
    }

    public static void d(Context context, uj.b bVar) {
        Activity activityV = v(context);
        if (activityV != null) {
            x4.k.f53630a.getClass();
            int i10 = x4.l.f53631b;
            Rect bounds = ((WindowManager) activityV.getSystemService(WindowManager.class)).getMaximumWindowMetrics().getBounds();
            n.e(bounds, "wm.maximumWindowMetrics.bounds");
            r1 _windowInsetsCompat = b5.a.f5491a.a(activityV);
            int i11 = bounds.left;
            int i12 = bounds.top;
            int i13 = bounds.right;
            int i14 = bounds.bottom;
            if (i11 > i13) {
                throw new IllegalArgumentException(defpackage.e.g(i11, i13, "Left must be less than or equal to right, left: ", ", right: ").toString());
            }
            if (i12 > i14) {
                throw new IllegalArgumentException(defpackage.e.g(i12, i14, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
            }
            n.f(_windowInsetsCompat, "_windowInsetsCompat");
            ((ni.c) bVar).f46737a.updateDisplayMetrics(0, new Rect(i11, i12, i13, i14).width(), new Rect(i11, i12, i13, i14).height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static void h(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(yn.a.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str).toString());
            }
        }
    }

    public static void i(long j10, String str) {
        if (j10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j10 + ") must be >= 0");
    }

    public static void j(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static void k(boolean z10) {
        if (!z10) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static void l(String str, String str2) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(yn.a.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i10), str2));
                sb2.append(yn.a.p(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }

    public static int m(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            return i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static long n(long j10) {
        if (j10 < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j10 > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j10;
    }

    public static long o(long j10, pk.e eVar) {
        long j11 = eVar.f48406b;
        long j12 = eVar.f48405a;
        if (!eVar.isEmpty()) {
            if (j10 < Long.valueOf(j12).longValue()) {
                return Long.valueOf(j12).longValue();
            }
            return j10 > Long.valueOf(j11).longValue() ? Long.valueOf(j11).longValue() : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + eVar + '.');
    }

    public static long[] p(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i10 = (int) length;
        go.k.f(length, length == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int");
        long[] jArr3 = new long[i10];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public static byte[] q(List protocols) {
        n.f(protocols, "protocols");
        lo.e eVar = new lo.e();
        for (String str : a(protocols)) {
            eVar.q(str.length());
            eVar.v(str);
        }
        return eVar.readByteArray(eVar.f45637b);
    }

    public static final ArrayList r(ArrayList arrayList, Collection oldValueParameters, s sVar) {
        n.f(oldValueParameters, "oldValueParameters");
        arrayList.size();
        oldValueParameters.size();
        ArrayList<wj.f> arrayListU0 = xj.n.U0(arrayList, oldValueParameters);
        ArrayList arrayList2 = new ArrayList(p.W(arrayListU0, 10));
        for (wj.f fVar : arrayListU0) {
            y yVar = (y) fVar.f53283a;
            x0 x0Var = (x0) fVar.f53284b;
            int i10 = x0Var.f6631f;
            al.j annotations = x0Var.getAnnotations();
            yl.f name = x0Var.getName();
            n.e(name, "oldParameter.name");
            boolean zK0 = x0Var.K0();
            boolean z10 = x0Var.f6633h;
            boolean z11 = x0Var.f6634i;
            y yVarF = x0Var.f6635j != null ? fm.e.j(sVar).d().f(yVar) : null;
            j0 j0VarC = x0Var.c();
            n.e(j0VarC, "oldParameter.source");
            arrayList2.add(new x0(sVar, null, i10, annotations, name, yVar, zK0, z10, z11, yVarF, j0VarC));
        }
        return arrayList2;
    }

    public static Bitmap s(byte[] bArr, int i10, int i11) throws IOException {
        BitmapFactory.Options options;
        if (i11 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i10, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int iMax = Math.max(options.outWidth, options.outHeight); iMax > i11; iMax /= 2) {
                options.inSampleSize *= 2;
            }
        } else {
            options = null;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i10, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (bitmapDecodeByteArray == null) {
            throw e0.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            a1.h hVar = new a1.h(byteArrayInputStream);
            byteArrayInputStream.close();
            int iN = hVar.n();
            if (iN == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(iN);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public static final o t(e1 e1Var) {
        switch (e1Var == null ? -1 : w.f45597b[e1Var.ordinal()]) {
            case 1:
                o INTERNAL = zk.n.f54977d;
                n.e(INTERNAL, "INTERNAL");
                return INTERNAL;
            case 2:
                o PRIVATE = zk.n.f54974a;
                n.e(PRIVATE, "PRIVATE");
                return PRIVATE;
            case 3:
                o PRIVATE_TO_THIS = zk.n.f54975b;
                n.e(PRIVATE_TO_THIS, "PRIVATE_TO_THIS");
                return PRIVATE_TO_THIS;
            case 4:
                o PROTECTED = zk.n.f54976c;
                n.e(PROTECTED, "PROTECTED");
                return PROTECTED;
            case 5:
                o PUBLIC = zk.n.f54978e;
                n.e(PUBLIC, "PUBLIC");
                return PUBLIC;
            case 6:
                o LOCAL = zk.n.f54979f;
                n.e(LOCAL, "LOCAL");
                return LOCAL;
            default:
                o PRIVATE2 = zk.n.f54974a;
                n.e(PRIVATE2, "PRIVATE");
                return PRIVATE2;
        }
    }

    public static f2 u(List input) {
        n.f(input, "input");
        List listI0 = xj.n.I0(input, dh.b.f38875n);
        ArrayList arrayListZ = z(listI0, new ak.c(5));
        HashSet hashSetM0 = xj.n.M0(p.X(arrayListZ));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI0) {
            if (!hashSetM0.contains((dh.b) obj)) {
                arrayList.add(obj);
            }
        }
        return new f2(arrayListZ, arrayList);
    }

    public static Activity v(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return v(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static int w(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public static Set x() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final ml.e0 y(zk.e eVar) {
        zk.e eVar2;
        n.f(eVar, "<this>");
        int i10 = fm.e.f41020a;
        Iterator it = eVar.g().P().f().iterator();
        while (true) {
            if (!it.hasNext()) {
                eVar2 = null;
                break;
            }
            y yVar = (y) it.next();
            if (!wk.h.x(yVar)) {
                zk.g gVarE = yVar.P().e();
                if (bm.e.n(gVarE, 1) || bm.e.n(gVarE, 3)) {
                    n.d(gVarE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    eVar2 = (zk.e) gVarE;
                    break;
                }
            }
        }
        if (eVar2 == null) {
            return null;
        }
        im.n nVarG0 = eVar2.g0();
        ml.e0 e0Var = nVarG0 instanceof ml.e0 ? (ml.e0) nVarG0 : null;
        return e0Var == null ? y(eVar2) : e0Var;
    }

    public static ArrayList z(List list, jk.c cVar) {
        List list2;
        ArrayList arrayListO0 = xj.n.O0(list);
        ArrayList arrayList = new ArrayList();
        while (arrayListO0.size() > 1) {
            if (arrayListO0.size() <= 1) {
                list2 = v.f53866a;
            } else {
                ArrayList arrayListO1 = xj.n.O0(arrayListO0);
                Object objRemove = arrayListO1.remove(0);
                ArrayList arrayListS = xj.o.S(objRemove);
                for (Object obj : arrayListO1) {
                    if (((Boolean) cVar.invoke(objRemove, obj)).booleanValue()) {
                        arrayListS.add(obj);
                    }
                }
                list2 = arrayListS;
            }
            t.d0(arrayListO0, new com.ironsource.sdk.controller.y(xj.n.M0(list2), 3));
            if (list2.size() > 1) {
                arrayList.add(list2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((List) obj2).isEmpty()) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public abstract void H(o5.g gVar, o5.g gVar2);

    public abstract void I(o5.g gVar, Thread thread);

    public j9.c b(Context context, Looper looper, x xVar, Object obj, j9.j jVar, j9.k kVar) {
        return c(context, looper, xVar, obj, (com.google.android.gms.common.api.internal.r) jVar, (com.google.android.gms.common.api.internal.r) kVar);
    }

    public j9.c c(Context context, Looper looper, x xVar, Object obj, com.google.android.gms.common.api.internal.r rVar, com.google.android.gms.common.api.internal.r rVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract boolean e(o5.h hVar, o5.c cVar, o5.c cVar2);

    public abstract boolean f(o5.h hVar, Object obj, Object obj2);

    public abstract boolean g(o5.h hVar, o5.g gVar, o5.g gVar2);
}
