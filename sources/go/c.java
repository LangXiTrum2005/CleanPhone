package go;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.Window;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import b2.d0;
import cl.x0;
import cn.c0;
import com.google.android.gms.internal.ads.ur1;
import com.google.android.gms.internal.auth.h0;
import com.google.android.gms.internal.auth.l1;
import com.google.android.gms.internal.auth.m0;
import com.google.android.gms.internal.auth.n0;
import com.google.android.gms.internal.auth.o;
import com.google.android.gms.internal.auth.o1;
import com.google.android.gms.internal.auth.q0;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.internal.play_billing.q1;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.c1;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.z0;
import com.ironsource.X3;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import lo.n;
import org.json.JSONArray;
import org.json.JSONObject;
import qk.i0;
import qk.x;
import tk.k1;
import xj.p;
import xj.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f42027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f42028b;

    public static ul.a A(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        pk.c cVar = new pk.c(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(p.W(cVar, 10));
        pk.b it = cVar.iterator();
        while (it.f48398c) {
            it.nextInt();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        Iterator it2 = arrayList.iterator();
        int i10 = 0;
        while (it2.hasNext()) {
            iArr[i10] = ((Number) it2.next()).intValue();
            i10++;
        }
        return new ul.a(Arrays.copyOf(iArr, size));
    }

    public static hh.c B(File file) {
        w wVar = w.f53867a;
        try {
            if (!file.exists()) {
                return new hh.c(wVar);
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                og.b bVar = new og.b(new n(q1.B(fileInputStream)));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                bVar.n();
                while (bVar.s()) {
                    if (kotlin.jvm.internal.n.a(bVar.x(), "assetsDictionary")) {
                        int i10 = hh.b.f42351a[v0.i.c(bVar.C())];
                        if (i10 == 1) {
                            bVar.k();
                            while (bVar.s()) {
                                try {
                                    dh.b bVarX = r9.b.x(bVar);
                                    linkedHashMap.put(bVarX.f38876a, bVarX);
                                } catch (Exception e10) {
                                    Log.e("ProjectLogger", "Asset Parsing: Error parsing individual asset", e10);
                                    bVar.F();
                                }
                            }
                            bVar.q();
                        } else if (i10 != 2) {
                            Log.e("ProjectLogger", "Asset Parsing: Unexpected token type for assetsDictionary");
                            bVar.F();
                        } else {
                            bVar.n();
                            while (bVar.s()) {
                                String strX = bVar.x();
                                try {
                                    linkedHashMap.put(strX, r9.b.x(bVar));
                                } catch (Exception e11) {
                                    String message = "Asset Parsing: Error parsing asset with key: " + strX;
                                    kotlin.jvm.internal.n.f(message, "message");
                                    Log.e("ProjectLogger", message, e11);
                                    bVar.F();
                                }
                            }
                            bVar.r();
                            String message2 = "Asset Parsing: Migrated from old object format - " + linkedHashMap.size() + " assets";
                            kotlin.jvm.internal.n.f(message2, "message");
                            Log.i("ProjectLogger", message2);
                        }
                    } else {
                        bVar.F();
                    }
                }
                bVar.r();
                hh.c cVar = new hh.c(linkedHashMap);
                fileInputStream.close();
                return cVar;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    i0.j(fileInputStream, th2);
                    throw th3;
                }
            }
        } catch (Exception e12) {
            Log.e("ProjectLogger", "JSON Parsing: Error parsing assets JSON", e12);
            return new hh.c(wVar);
        }
    }

    public static LinkedHashSet C(yl.f fVar, Collection collection, Collection collection2, zk.e eVar, lm.k kVar, bm.l lVar, boolean z10) {
        if (fVar == null) {
            a(12);
            throw null;
        }
        if (collection == null) {
            a(13);
            throw null;
        }
        if (eVar == null) {
            a(15);
            throw null;
        }
        if (kVar == null) {
            a(16);
            throw null;
        }
        if (lVar == null) {
            a(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        lVar.h(fVar, collection, collection2, eVar, new jl.a(kVar, linkedHashSet, z10));
        return linkedHashSet;
    }

    public static LinkedHashSet D(yl.f fVar, AbstractCollection abstractCollection, Collection collection, zk.e eVar, lm.k kVar, bm.l lVar) {
        if (fVar == null) {
            a(0);
            throw null;
        }
        if (eVar == null) {
            a(3);
            throw null;
        }
        if (kVar == null) {
            a(4);
            throw null;
        }
        if (lVar != null) {
            return C(fVar, abstractCollection, collection, eVar, kVar, lVar, false);
        }
        a(5);
        throw null;
    }

    public static LinkedHashSet E(yl.f fVar, Collection collection, AbstractCollection abstractCollection, ml.j jVar, lm.k kVar, bm.l lVar) {
        if (fVar == null) {
            a(6);
            throw null;
        }
        if (collection == null) {
            a(7);
            throw null;
        }
        if (jVar == null) {
            a(9);
            throw null;
        }
        if (kVar == null) {
            a(10);
            throw null;
        }
        if (lVar != null) {
            return C(fVar, collection, abstractCollection, jVar, kVar, lVar, true);
        }
        a(11);
        throw null;
    }

    public static void F(Window window) {
        if (Build.VERSION.SDK_INT >= 35) {
            window.setDecorFitsSystemWindows(false);
            return;
        }
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | NotificationCompat.FLAG_LOCAL_ONLY);
        window.setDecorFitsSystemWindows(false);
    }

    public static void G(xi.f binaryMessenger, final tj.l lVar) {
        nf nfVar;
        kotlin.jvm.internal.n.f(binaryMessenger, "binaryMessenger");
        xi.l hVar = (lVar == null || (nfVar = lVar.f50859a) == null) ? new defpackage.h(10) : nfVar.e();
        Object obj = null;
        k5.g gVar = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.scrollTo", hVar, obj);
        if (lVar != null) {
            final int i10 = 0;
            gVar.C(new xi.b() { // from class: tj.c0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    int i11;
                    int i12 = i10;
                    int i13 = 3;
                    int i14 = 0;
                    l lVar2 = lVar;
                    switch (i12) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                lVar2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                            return;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                lVar2.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                            return;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                lVar2.getClass();
                                listQ3 = j1.f.C(new u0(view3.getScrollX(), view3.getScrollY()));
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
                            return;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                lVar2.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                            return;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                lVar2.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                            return;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            u uVar = (u) obj15;
                            try {
                                lVar2.getClass();
                                int iOrdinal = uVar.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    nf nfVar2 = lVar2.f50859a;
                                    u uVar2 = u.UNKNOWN;
                                    nfVar2.getClass();
                                    throw new IllegalArgumentException(uVar2 + " doesn't represent a native value.");
                                }
                                listQ6 = j1.f.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj16 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj16;
                            Object obj17 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj17;
                            try {
                                lVar2.getClass();
                                if (list7.isEmpty()) {
                                    g0 g0Var = new g0(18);
                                    WeakHashMap weakHashMap = m0.s0.f45746a;
                                    m0.l0.b(view7, g0Var);
                                } else {
                                    Iterator it = list7.iterator();
                                    while (it.hasNext()) {
                                        switch ((x0) it.next()) {
                                            case SYSTEM_BARS:
                                                i11 = i14 | 519;
                                                break;
                                            case DISPLAY_CUTOUT:
                                                i11 = i14 | 128;
                                                break;
                                            case CAPTION_BAR:
                                                i11 = i14 | 4;
                                                break;
                                            case IME:
                                                i11 = i14 | 8;
                                                break;
                                            case MANDATORY_SYSTEM_GESTURES:
                                                i11 = i14 | 32;
                                                break;
                                            case NAVIGATION_BARS:
                                                i11 = i14 | 2;
                                                break;
                                            case STATUS_BARS:
                                                i11 = i14 | 1;
                                                break;
                                            case SYSTEM_GESTURES:
                                                i11 = i14 | 16;
                                                break;
                                            case TAPPABLE_ELEMENT:
                                                i11 = i14 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i14 = i11;
                                    }
                                    p1.q qVar = new p1.q(i14, i13);
                                    WeakHashMap weakHashMap2 = m0.s0.f45746a;
                                    m0.l0.b(view7, qVar);
                                }
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
                            return;
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        k5.g gVar2 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.scrollBy", hVar, obj);
        if (lVar != null) {
            final int i11 = 1;
            gVar2.C(new xi.b() { // from class: tj.c0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    int i12;
                    int i13 = i11;
                    int i14 = 3;
                    int i15 = 0;
                    l lVar2 = lVar;
                    switch (i13) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                lVar2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                            return;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                lVar2.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                            return;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                lVar2.getClass();
                                listQ3 = j1.f.C(new u0(view3.getScrollX(), view3.getScrollY()));
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
                            return;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                lVar2.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                            return;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                lVar2.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                            return;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            u uVar = (u) obj15;
                            try {
                                lVar2.getClass();
                                int iOrdinal = uVar.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    nf nfVar2 = lVar2.f50859a;
                                    u uVar2 = u.UNKNOWN;
                                    nfVar2.getClass();
                                    throw new IllegalArgumentException(uVar2 + " doesn't represent a native value.");
                                }
                                listQ6 = j1.f.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj16 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj16;
                            Object obj17 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj17;
                            try {
                                lVar2.getClass();
                                if (list7.isEmpty()) {
                                    g0 g0Var = new g0(18);
                                    WeakHashMap weakHashMap = m0.s0.f45746a;
                                    m0.l0.b(view7, g0Var);
                                } else {
                                    Iterator it = list7.iterator();
                                    while (it.hasNext()) {
                                        switch ((x0) it.next()) {
                                            case SYSTEM_BARS:
                                                i12 = i15 | 519;
                                                break;
                                            case DISPLAY_CUTOUT:
                                                i12 = i15 | 128;
                                                break;
                                            case CAPTION_BAR:
                                                i12 = i15 | 4;
                                                break;
                                            case IME:
                                                i12 = i15 | 8;
                                                break;
                                            case MANDATORY_SYSTEM_GESTURES:
                                                i12 = i15 | 32;
                                                break;
                                            case NAVIGATION_BARS:
                                                i12 = i15 | 2;
                                                break;
                                            case STATUS_BARS:
                                                i12 = i15 | 1;
                                                break;
                                            case SYSTEM_GESTURES:
                                                i12 = i15 | 16;
                                                break;
                                            case TAPPABLE_ELEMENT:
                                                i12 = i15 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i15 = i12;
                                    }
                                    p1.q qVar = new p1.q(i15, i14);
                                    WeakHashMap weakHashMap2 = m0.s0.f45746a;
                                    m0.l0.b(view7, qVar);
                                }
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
                            return;
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        k5.g gVar3 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.getScrollPosition", hVar, obj);
        if (lVar != null) {
            final int i12 = 2;
            gVar3.C(new xi.b() { // from class: tj.c0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    int i13;
                    int i14 = i12;
                    int i15 = 3;
                    int i16 = 0;
                    l lVar2 = lVar;
                    switch (i14) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                lVar2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                            return;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                lVar2.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                            return;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                lVar2.getClass();
                                listQ3 = j1.f.C(new u0(view3.getScrollX(), view3.getScrollY()));
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
                            return;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                lVar2.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                            return;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                lVar2.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                            return;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            u uVar = (u) obj15;
                            try {
                                lVar2.getClass();
                                int iOrdinal = uVar.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    nf nfVar2 = lVar2.f50859a;
                                    u uVar2 = u.UNKNOWN;
                                    nfVar2.getClass();
                                    throw new IllegalArgumentException(uVar2 + " doesn't represent a native value.");
                                }
                                listQ6 = j1.f.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj16 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj16;
                            Object obj17 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj17;
                            try {
                                lVar2.getClass();
                                if (list7.isEmpty()) {
                                    g0 g0Var = new g0(18);
                                    WeakHashMap weakHashMap = m0.s0.f45746a;
                                    m0.l0.b(view7, g0Var);
                                } else {
                                    Iterator it = list7.iterator();
                                    while (it.hasNext()) {
                                        switch ((x0) it.next()) {
                                            case SYSTEM_BARS:
                                                i13 = i16 | 519;
                                                break;
                                            case DISPLAY_CUTOUT:
                                                i13 = i16 | 128;
                                                break;
                                            case CAPTION_BAR:
                                                i13 = i16 | 4;
                                                break;
                                            case IME:
                                                i13 = i16 | 8;
                                                break;
                                            case MANDATORY_SYSTEM_GESTURES:
                                                i13 = i16 | 32;
                                                break;
                                            case NAVIGATION_BARS:
                                                i13 = i16 | 2;
                                                break;
                                            case STATUS_BARS:
                                                i13 = i16 | 1;
                                                break;
                                            case SYSTEM_GESTURES:
                                                i13 = i16 | 16;
                                                break;
                                            case TAPPABLE_ELEMENT:
                                                i13 = i16 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i16 = i13;
                                    }
                                    p1.q qVar = new p1.q(i16, i15);
                                    WeakHashMap weakHashMap2 = m0.s0.f45746a;
                                    m0.l0.b(view7, qVar);
                                }
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
                            return;
                    }
                }
            });
        } else {
            gVar3.C(null);
        }
        k5.g gVar4 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.setVerticalScrollBarEnabled", hVar, obj);
        if (lVar != null) {
            final int i13 = 3;
            gVar4.C(new xi.b() { // from class: tj.c0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    int i14;
                    int i15 = i13;
                    int i16 = 3;
                    int i17 = 0;
                    l lVar2 = lVar;
                    switch (i15) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                lVar2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                            return;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                lVar2.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                            return;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                lVar2.getClass();
                                listQ3 = j1.f.C(new u0(view3.getScrollX(), view3.getScrollY()));
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
                            return;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                lVar2.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                            return;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                lVar2.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                            return;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            u uVar = (u) obj15;
                            try {
                                lVar2.getClass();
                                int iOrdinal = uVar.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    nf nfVar2 = lVar2.f50859a;
                                    u uVar2 = u.UNKNOWN;
                                    nfVar2.getClass();
                                    throw new IllegalArgumentException(uVar2 + " doesn't represent a native value.");
                                }
                                listQ6 = j1.f.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj16 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj16;
                            Object obj17 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj17;
                            try {
                                lVar2.getClass();
                                if (list7.isEmpty()) {
                                    g0 g0Var = new g0(18);
                                    WeakHashMap weakHashMap = m0.s0.f45746a;
                                    m0.l0.b(view7, g0Var);
                                } else {
                                    Iterator it = list7.iterator();
                                    while (it.hasNext()) {
                                        switch ((x0) it.next()) {
                                            case SYSTEM_BARS:
                                                i14 = i17 | 519;
                                                break;
                                            case DISPLAY_CUTOUT:
                                                i14 = i17 | 128;
                                                break;
                                            case CAPTION_BAR:
                                                i14 = i17 | 4;
                                                break;
                                            case IME:
                                                i14 = i17 | 8;
                                                break;
                                            case MANDATORY_SYSTEM_GESTURES:
                                                i14 = i17 | 32;
                                                break;
                                            case NAVIGATION_BARS:
                                                i14 = i17 | 2;
                                                break;
                                            case STATUS_BARS:
                                                i14 = i17 | 1;
                                                break;
                                            case SYSTEM_GESTURES:
                                                i14 = i17 | 16;
                                                break;
                                            case TAPPABLE_ELEMENT:
                                                i14 = i17 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i17 = i14;
                                    }
                                    p1.q qVar = new p1.q(i17, i16);
                                    WeakHashMap weakHashMap2 = m0.s0.f45746a;
                                    m0.l0.b(view7, qVar);
                                }
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
                            return;
                    }
                }
            });
        } else {
            gVar4.C(null);
        }
        k5.g gVar5 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.setHorizontalScrollBarEnabled", hVar, obj);
        if (lVar != null) {
            final int i14 = 4;
            gVar5.C(new xi.b() { // from class: tj.c0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    int i15;
                    int i16 = i14;
                    int i17 = 3;
                    int i18 = 0;
                    l lVar2 = lVar;
                    switch (i16) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                lVar2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                            return;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                lVar2.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                            return;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                lVar2.getClass();
                                listQ3 = j1.f.C(new u0(view3.getScrollX(), view3.getScrollY()));
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
                            return;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                lVar2.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                            return;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                lVar2.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                            return;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            u uVar = (u) obj15;
                            try {
                                lVar2.getClass();
                                int iOrdinal = uVar.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    nf nfVar2 = lVar2.f50859a;
                                    u uVar2 = u.UNKNOWN;
                                    nfVar2.getClass();
                                    throw new IllegalArgumentException(uVar2 + " doesn't represent a native value.");
                                }
                                listQ6 = j1.f.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj16 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj16;
                            Object obj17 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj17;
                            try {
                                lVar2.getClass();
                                if (list7.isEmpty()) {
                                    g0 g0Var = new g0(18);
                                    WeakHashMap weakHashMap = m0.s0.f45746a;
                                    m0.l0.b(view7, g0Var);
                                } else {
                                    Iterator it = list7.iterator();
                                    while (it.hasNext()) {
                                        switch ((x0) it.next()) {
                                            case SYSTEM_BARS:
                                                i15 = i18 | 519;
                                                break;
                                            case DISPLAY_CUTOUT:
                                                i15 = i18 | 128;
                                                break;
                                            case CAPTION_BAR:
                                                i15 = i18 | 4;
                                                break;
                                            case IME:
                                                i15 = i18 | 8;
                                                break;
                                            case MANDATORY_SYSTEM_GESTURES:
                                                i15 = i18 | 32;
                                                break;
                                            case NAVIGATION_BARS:
                                                i15 = i18 | 2;
                                                break;
                                            case STATUS_BARS:
                                                i15 = i18 | 1;
                                                break;
                                            case SYSTEM_GESTURES:
                                                i15 = i18 | 16;
                                                break;
                                            case TAPPABLE_ELEMENT:
                                                i15 = i18 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i18 = i15;
                                    }
                                    p1.q qVar = new p1.q(i18, i17);
                                    WeakHashMap weakHashMap2 = m0.s0.f45746a;
                                    m0.l0.b(view7, qVar);
                                }
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
                            return;
                    }
                }
            });
        } else {
            gVar5.C(null);
        }
        k5.g gVar6 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.setOverScrollMode", hVar, obj);
        if (lVar != null) {
            final int i15 = 5;
            gVar6.C(new xi.b() { // from class: tj.c0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    int i16;
                    int i17 = i15;
                    int i18 = 3;
                    int i19 = 0;
                    l lVar2 = lVar;
                    switch (i17) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                lVar2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                            return;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                lVar2.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                            return;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                lVar2.getClass();
                                listQ3 = j1.f.C(new u0(view3.getScrollX(), view3.getScrollY()));
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
                            return;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                lVar2.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                            return;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                lVar2.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                            return;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            u uVar = (u) obj15;
                            try {
                                lVar2.getClass();
                                int iOrdinal = uVar.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    nf nfVar2 = lVar2.f50859a;
                                    u uVar2 = u.UNKNOWN;
                                    nfVar2.getClass();
                                    throw new IllegalArgumentException(uVar2 + " doesn't represent a native value.");
                                }
                                listQ6 = j1.f.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj16 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj16;
                            Object obj17 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj17;
                            try {
                                lVar2.getClass();
                                if (list7.isEmpty()) {
                                    g0 g0Var = new g0(18);
                                    WeakHashMap weakHashMap = m0.s0.f45746a;
                                    m0.l0.b(view7, g0Var);
                                } else {
                                    Iterator it = list7.iterator();
                                    while (it.hasNext()) {
                                        switch ((x0) it.next()) {
                                            case SYSTEM_BARS:
                                                i16 = i19 | 519;
                                                break;
                                            case DISPLAY_CUTOUT:
                                                i16 = i19 | 128;
                                                break;
                                            case CAPTION_BAR:
                                                i16 = i19 | 4;
                                                break;
                                            case IME:
                                                i16 = i19 | 8;
                                                break;
                                            case MANDATORY_SYSTEM_GESTURES:
                                                i16 = i19 | 32;
                                                break;
                                            case NAVIGATION_BARS:
                                                i16 = i19 | 2;
                                                break;
                                            case STATUS_BARS:
                                                i16 = i19 | 1;
                                                break;
                                            case SYSTEM_GESTURES:
                                                i16 = i19 | 16;
                                                break;
                                            case TAPPABLE_ELEMENT:
                                                i16 = i19 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i19 = i16;
                                    }
                                    p1.q qVar = new p1.q(i19, i18);
                                    WeakHashMap weakHashMap2 = m0.s0.f45746a;
                                    m0.l0.b(view7, qVar);
                                }
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
                            return;
                    }
                }
            });
        } else {
            gVar6.C(null);
        }
        k5.g gVar7 = new k5.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.View.setInsetListenerToSetInsetsToZero", hVar, obj);
        if (lVar == null) {
            gVar7.C(null);
        } else {
            final int i16 = 6;
            gVar7.C(new xi.b() { // from class: tj.c0
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    List listQ6;
                    List listQ7;
                    int i17;
                    int i18 = i16;
                    int i19 = 3;
                    int i110 = 0;
                    l lVar2 = lVar;
                    switch (i18) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                lVar2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
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
                            return;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                lVar2.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
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
                            return;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                lVar2.getClass();
                                listQ3 = j1.f.C(new u0(view3.getScrollX(), view3.getScrollY()));
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
                            return;
                        case 3:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                lVar2.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
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
                            return;
                        case 4:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                lVar2.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
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
                            return;
                        case 5:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            u uVar = (u) obj15;
                            try {
                                lVar2.getClass();
                                int iOrdinal = uVar.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    nf nfVar2 = lVar2.f50859a;
                                    u uVar2 = u.UNKNOWN;
                                    nfVar2.getClass();
                                    throw new IllegalArgumentException(uVar2 + " doesn't represent a native value.");
                                }
                                listQ6 = j1.f.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof a) {
                                    a aVar6 = th7;
                                    listQ6 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                                } else {
                                    listQ6 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            bVar.e(listQ6);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj16 = list6.get(0);
                            kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.view.View");
                            View view7 = (View) obj16;
                            Object obj17 = list6.get(1);
                            kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.webviewflutter.WindowInsetsType>");
                            List list7 = (List) obj17;
                            try {
                                lVar2.getClass();
                                if (list7.isEmpty()) {
                                    g0 g0Var = new g0(18);
                                    WeakHashMap weakHashMap = m0.s0.f45746a;
                                    m0.l0.b(view7, g0Var);
                                } else {
                                    Iterator it = list7.iterator();
                                    while (it.hasNext()) {
                                        switch ((x0) it.next()) {
                                            case SYSTEM_BARS:
                                                i17 = i110 | 519;
                                                break;
                                            case DISPLAY_CUTOUT:
                                                i17 = i110 | 128;
                                                break;
                                            case CAPTION_BAR:
                                                i17 = i110 | 4;
                                                break;
                                            case IME:
                                                i17 = i110 | 8;
                                                break;
                                            case MANDATORY_SYSTEM_GESTURES:
                                                i17 = i110 | 32;
                                                break;
                                            case NAVIGATION_BARS:
                                                i17 = i110 | 2;
                                                break;
                                            case STATUS_BARS:
                                                i17 = i110 | 1;
                                                break;
                                            case SYSTEM_GESTURES:
                                                i17 = i110 | 16;
                                                break;
                                            case TAPPABLE_ELEMENT:
                                                i17 = i110 | 64;
                                                break;
                                            default:
                                                continue;
                                        }
                                        i110 = i17;
                                    }
                                    p1.q qVar = new p1.q(i110, i19);
                                    WeakHashMap weakHashMap2 = m0.s0.f45746a;
                                    m0.l0.b(view7, qVar);
                                }
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
                            return;
                    }
                }
            });
        }
    }

    public static final String H(zk.e classDescriptor, String str) {
        String internalName;
        kotlin.jvm.internal.n.f(classDescriptor, "classDescriptor");
        String str2 = yk.d.f54447a;
        yl.e eVarI = fm.e.g(classDescriptor).i();
        kotlin.jvm.internal.n.e(eVarI, "fqNameSafe.toUnsafe()");
        yl.b bVarF = yk.d.f(eVarI);
        if (bVarF != null) {
            internalName = gm.b.b(bVarF).e();
            kotlin.jvm.internal.n.e(internalName, "byClassId(it).internalName");
        } else {
            internalName = o.d(classDescriptor, rl.e.f49628d);
        }
        kotlin.jvm.internal.n.f(internalName, "internalName");
        return internalName + '.' + str;
    }

    public static boolean I(String str) {
        return str == null || str.isEmpty();
    }

    public static Object J(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(J(it.next()));
                }
                return jSONArray;
            }
            if (obj.getClass().isArray()) {
                JSONArray jSONArray2 = new JSONArray();
                int length = Array.getLength(obj);
                for (int i10 = 0; i10 < length; i10++) {
                    jSONArray2.put(J(Array.get(obj, i10)));
                }
                return jSONArray2;
            }
            if (obj instanceof Map) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    jSONObject.put((String) entry.getKey(), J(entry.getValue()));
                }
                return jSONObject;
            }
            if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                return obj;
            }
            if (obj.getClass().getPackage().getName().startsWith("java.")) {
                return obj.toString();
            }
            return null;
        } catch (Exception unused) {
        }
    }

    public static ArrayList K(Throwable th2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th2.toString());
        arrayList.add(th2.getClass().getSimpleName());
        arrayList.add("Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
        return arrayList;
    }

    public static int L(byte[] bArr, int i10, d0 d0Var) throws q0 {
        int iP = P(bArr, i10, d0Var);
        int i11 = d0Var.f5246c;
        if (i11 < 0) {
            throw q0.g();
        }
        if (i11 > bArr.length - iP) {
            throw q0.h();
        }
        if (i11 == 0) {
            d0Var.f5247d = h0.f22838c;
            return iP;
        }
        d0Var.f5247d = h0.p(bArr, iP, i11);
        return iP + i11;
    }

    public static int M(int i10, byte[] bArr) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static int N(l1 l1Var, int i10, byte[] bArr, int i11, int i12, n0 n0Var, d0 d0Var) throws q0 {
        m0 m0VarZzd = l1Var.zzd();
        l1 l1Var2 = l1Var;
        byte[] bArr2 = bArr;
        int i13 = i12;
        d0 d0Var2 = d0Var;
        int iS = S(m0VarZzd, l1Var2, bArr2, i11, i13, d0Var2);
        l1Var2.a(m0VarZzd);
        d0Var2.f5247d = m0VarZzd;
        n0Var.add(m0VarZzd);
        while (iS < i13) {
            d0 d0Var3 = d0Var2;
            int i14 = i13;
            int iP = P(bArr2, iS, d0Var3);
            if (i10 != d0Var3.f5246c) {
                break;
            }
            byte[] bArr3 = bArr2;
            l1 l1Var3 = l1Var2;
            m0 m0VarZzd2 = l1Var3.zzd();
            iS = S(m0VarZzd2, l1Var3, bArr3, iP, i14, d0Var3);
            l1Var2 = l1Var3;
            bArr2 = bArr3;
            i13 = i14;
            d0Var2 = d0Var3;
            l1Var2.a(m0VarZzd2);
            d0Var2.f5247d = m0VarZzd2;
            n0Var.add(m0VarZzd2);
        }
        return iS;
    }

    public static int O(int i10, byte[] bArr, int i11, int i12, o1 o1Var, d0 d0Var) throws q0 {
        if ((i10 >>> 3) == 0) {
            throw new q0("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iR = R(bArr, i11, d0Var);
            o1Var.b(i10, Long.valueOf(d0Var.f5245b));
            return iR;
        }
        if (i13 == 1) {
            o1Var.b(i10, Long.valueOf(T(i11, bArr)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iP = P(bArr, i11, d0Var);
            int i14 = d0Var.f5246c;
            if (i14 < 0) {
                throw q0.g();
            }
            if (i14 > bArr.length - iP) {
                throw q0.h();
            }
            if (i14 == 0) {
                o1Var.b(i10, h0.f22838c);
            } else {
                o1Var.b(i10, h0.p(bArr, iP, i14));
            }
            return iP + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new q0("Protocol message contained an invalid tag (zero).");
            }
            o1Var.b(i10, Integer.valueOf(M(i11, bArr)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        o1 o1VarA = o1.a();
        int i16 = 0;
        while (i11 < i12) {
            int iP2 = P(bArr, i11, d0Var);
            i16 = d0Var.f5246c;
            if (i16 == i15) {
                i11 = iP2;
                break;
            }
            i11 = O(i16, bArr, iP2, i12, o1VarA, d0Var);
        }
        if (i11 > i12 || i16 != i15) {
            throw new q0("Failed to parse the message.");
        }
        o1Var.b(i10, o1VarA);
        return i11;
    }

    public static int P(byte[] bArr, int i10, d0 d0Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return Q(b10, i11, d0Var, bArr);
        }
        d0Var.f5246c = b10;
        return i11;
    }

    public static int Q(int i10, int i11, d0 d0Var, byte[] bArr) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            d0Var.f5246c = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            d0Var.f5246c = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            d0Var.f5246c = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            d0Var.f5246c = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                d0Var.f5246c = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int R(byte[] bArr, int i10, d0 d0Var) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            d0Var.f5245b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & 127)) << i13;
            b10 = b11;
            i12 = i14;
        }
        d0Var.f5245b = j11;
        return i12;
    }

    public static int S(Object obj, l1 l1Var, byte[] bArr, int i10, int i11, d0 d0Var) throws q0 {
        int iQ = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iQ = Q(i12, iQ, d0Var, bArr);
            i12 = d0Var.f5246c;
        }
        int i13 = iQ;
        if (i12 < 0 || i12 > i11 - i13) {
            throw q0.h();
        }
        int i14 = i13 + i12;
        l1Var.f(obj, bArr, i13, i14, d0Var);
        d0Var.f5247d = obj;
        return i14;
    }

    public static long T(int i10, byte[] bArr) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    public static /* synthetic */ void a(int i10) {
        String str = i10 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 18 ? 3 : 2];
        switch (i10) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static void b(int i10) {
        if (2 > i10 || i10 >= 37) {
            StringBuilder sbU = defpackage.e.u(i10, "radix ", " was not in valid range ");
            sbU.append(new pk.c(2, 36, 1));
            throw new IllegalArgumentException(sbU.toString());
        }
    }

    public static final long c(long j10, bn.c sourceUnit, bn.c targetUnit) {
        kotlin.jvm.internal.n.f(sourceUnit, "sourceUnit");
        kotlin.jvm.internal.n.f(targetUnit, "targetUnit");
        return targetUnit.f5753a.convert(j10, sourceUnit.f5753a);
    }

    public static final long d(long j10, bn.c sourceUnit, bn.c targetUnit) {
        kotlin.jvm.internal.n.f(sourceUnit, "sourceUnit");
        kotlin.jvm.internal.n.f(targetUnit, "targetUnit");
        return targetUnit.f5753a.convert(j10, sourceUnit.f5753a);
    }

    public static IconCompat e(Icon icon) {
        icon.getClass();
        int type = icon.getType();
        if (type == 2) {
            return IconCompat.d(null, icon.getResPackage(), icon.getResId());
        }
        if (type == 4) {
            Uri uri = icon.getUri();
            PorterDuff.Mode mode = IconCompat.f4014k;
            uri.getClass();
            String string = uri.toString();
            string.getClass();
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f4016b = string;
            return iconCompat;
        }
        if (type != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.f4016b = icon;
            return iconCompat2;
        }
        Uri uri2 = icon.getUri();
        PorterDuff.Mode mode2 = IconCompat.f4014k;
        uri2.getClass();
        String string2 = uri2.toString();
        string2.getClass();
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.f4016b = string2;
        return iconCompat3;
    }

    public static void f(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        throw new IOException("Unable to create parent directories of " + file);
    }

    public static int g(byte[] bArr, int i10, ur1 ur1Var) throws com.google.crypto.tink.shaded.protobuf.d0 {
        int iM = m(bArr, i10, ur1Var);
        int i11 = ur1Var.f20874a;
        if (i11 < 0) {
            throw com.google.crypto.tink.shaded.protobuf.d0.j();
        }
        if (i11 > bArr.length - iM) {
            throw com.google.crypto.tink.shaded.protobuf.d0.l();
        }
        if (i11 == 0) {
            ur1Var.f20876c = com.google.crypto.tink.shaded.protobuf.i.f24569b;
            return iM;
        }
        ur1Var.f20876c = com.google.crypto.tink.shaded.protobuf.i.m(bArr, iM, i11);
        return iM + i11;
    }

    public static int h(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static long i(int i10, byte[] bArr) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public static int j(z0 z0Var, int i10, byte[] bArr, int i11, int i12, a0 a0Var, ur1 ur1Var) throws com.google.crypto.tink.shaded.protobuf.d0 {
        Object objD = z0Var.d();
        z0 z0Var2 = z0Var;
        byte[] bArr2 = bArr;
        int i13 = i12;
        ur1 ur1Var2 = ur1Var;
        int iZ = z(objD, z0Var2, bArr2, i11, i13, ur1Var2);
        z0Var2.b(objD);
        ur1Var2.f20876c = objD;
        a0Var.add(objD);
        while (iZ < i13) {
            ur1 ur1Var3 = ur1Var2;
            int i14 = i13;
            int iM = m(bArr2, iZ, ur1Var3);
            if (i10 != ur1Var3.f20874a) {
                break;
            }
            byte[] bArr3 = bArr2;
            z0 z0Var3 = z0Var2;
            Object objD2 = z0Var3.d();
            iZ = z(objD2, z0Var3, bArr3, iM, i14, ur1Var3);
            z0Var2 = z0Var3;
            bArr2 = bArr3;
            i13 = i14;
            ur1Var2 = ur1Var3;
            z0Var2.b(objD2);
            ur1Var2.f20876c = objD2;
            a0Var.add(objD2);
        }
        return iZ;
    }

    public static int k(int i10, byte[] bArr, int i11, int i12, c1 c1Var, ur1 ur1Var) throws com.google.crypto.tink.shaded.protobuf.d0 {
        if ((i10 >>> 3) == 0) {
            throw com.google.crypto.tink.shaded.protobuf.d0.d();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iO = o(bArr, i11, ur1Var);
            c1Var.d(i10, Long.valueOf(ur1Var.f20875b));
            return iO;
        }
        if (i13 == 1) {
            c1Var.d(i10, Long.valueOf(i(i11, bArr)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iM = m(bArr, i11, ur1Var);
            int i14 = ur1Var.f20874a;
            if (i14 < 0) {
                throw com.google.crypto.tink.shaded.protobuf.d0.j();
            }
            if (i14 > bArr.length - iM) {
                throw com.google.crypto.tink.shaded.protobuf.d0.l();
            }
            if (i14 == 0) {
                c1Var.d(i10, com.google.crypto.tink.shaded.protobuf.i.f24569b);
            } else {
                c1Var.d(i10, com.google.crypto.tink.shaded.protobuf.i.m(bArr, iM, i14));
            }
            return iM + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.d0.d();
            }
            c1Var.d(i10, Integer.valueOf(h(i11, bArr)));
            return i11 + 4;
        }
        c1 c1VarC = c1.c();
        int i15 = (i10 & (-8)) | 4;
        int i16 = ur1Var.f20877d + 1;
        ur1Var.f20877d = i16;
        if (i16 >= 100) {
            throw new com.google.crypto.tink.shaded.protobuf.d0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i17 = 0;
        while (i11 < i12) {
            int iM2 = m(bArr, i11, ur1Var);
            i17 = ur1Var.f20874a;
            if (i17 == i15) {
                i11 = iM2;
                break;
            }
            i11 = k(i17, bArr, iM2, i12, c1VarC, ur1Var);
        }
        ur1Var.f20877d--;
        if (i11 > i12 || i17 != i15) {
            throw com.google.crypto.tink.shaded.protobuf.d0.k();
        }
        c1Var.d(i10, c1VarC);
        return i11;
    }

    public static int l(int i10, byte[] bArr, int i11, ur1 ur1Var) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            ur1Var.f20874a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            ur1Var.f20874a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            ur1Var.f20874a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            ur1Var.f20874a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                ur1Var.f20874a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int m(byte[] bArr, int i10, ur1 ur1Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return l(b10, bArr, i11, ur1Var);
        }
        ur1Var.f20874a = b10;
        return i11;
    }

    public static int n(int i10, byte[] bArr, int i11, int i12, a0 a0Var, ur1 ur1Var) {
        y yVar = (y) a0Var;
        int iM = m(bArr, i11, ur1Var);
        yVar.addInt(ur1Var.f20874a);
        while (iM < i12) {
            int iM2 = m(bArr, iM, ur1Var);
            if (i10 != ur1Var.f20874a) {
                break;
            }
            iM = m(bArr, iM2, ur1Var);
            yVar.addInt(ur1Var.f20874a);
        }
        return iM;
    }

    public static int o(byte[] bArr, int i10, ur1 ur1Var) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            ur1Var.f20875b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & 127)) << i13;
            b10 = b11;
            i12 = i14;
        }
        ur1Var.f20875b = j11;
        return i12;
    }

    public static boolean p(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService(X3.i.f27786d);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
            return false;
        }
        for (int i10 : hdrCapabilities.getSupportedHdrTypes()) {
            if (i10 == 1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean q(char c4, char c5, boolean z10) {
        if (c4 == c5) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c4);
        char upperCase2 = Character.toUpperCase(c5);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static x0 r(yl.f fVar, zk.e eVar) {
        if (fVar == null) {
            a(19);
            throw null;
        }
        if (eVar == null) {
            a(20);
            throw null;
        }
        Collection collectionP = eVar.p();
        if (collectionP.size() != 1) {
            return null;
        }
        for (x0 x0Var : ((cl.l) collectionP.iterator().next()).B()) {
            if (x0Var.getName().equals(fVar)) {
                return x0Var;
            }
        }
        return null;
    }

    public static final qk.d s(qk.e eVar) {
        Object obj;
        if (eVar instanceof qk.d) {
            return (qk.d) eVar;
        }
        if (!(eVar instanceof qk.y)) {
            throw new c0("Cannot calculate JVM erasure for type: " + eVar, 3);
        }
        tk.o1 o1Var = ((tk.l1) ((qk.y) eVar)).f51012b;
        qk.w wVar = tk.l1.f51010d[0];
        Object objInvoke = o1Var.invoke();
        kotlin.jvm.internal.n.e(objInvoke, "<get-upperBounds>(...)");
        List list = (List) objInvoke;
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            x xVar = (x) next;
            kotlin.jvm.internal.n.d(xVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            zk.g gVarE = ((k1) xVar).f51002a.P().e();
            zk.e eVar2 = gVarE instanceof zk.e ? (zk.e) gVarE : null;
            if (eVar2 != null && eVar2.l0() != 2 && eVar2.l0() != 5) {
                obj = next;
                break;
            }
        }
        x xVar2 = (x) obj;
        if (xVar2 == null) {
            xVar2 = (x) xj.n.q0(list);
        }
        return xVar2 != null ? t(xVar2) : kotlin.jvm.internal.d0.f44761a.b(Object.class);
    }

    public static final qk.d t(x xVar) {
        qk.e eVarE = ((k1) xVar).e();
        if (eVarE != null) {
            return s(eVarE);
        }
        throw new c0("Cannot calculate JVM erasure for type: " + xVar, 3);
    }

    public static boolean u(zk.c callableMemberDescriptor) {
        kotlin.jvm.internal.n.f(callableMemberDescriptor, "callableMemberDescriptor");
        if (!il.g.f43076d.contains(callableMemberDescriptor.getName())) {
            return false;
        }
        if (xj.n.i0(il.g.f43075c, fm.e.c(callableMemberDescriptor)) && callableMemberDescriptor.B().isEmpty()) {
            return true;
        }
        if (!wk.h.z(callableMemberDescriptor)) {
            return false;
        }
        Collection overriddenDescriptors = callableMemberDescriptor.f();
        kotlin.jvm.internal.n.e(overriddenDescriptors, "overriddenDescriptors");
        Collection<zk.c> collection = overriddenDescriptors;
        if (collection.isEmpty()) {
            return false;
        }
        for (zk.c it : collection) {
            kotlin.jvm.internal.n.e(it, "it");
            if (u(it)) {
                return true;
            }
        }
        return false;
    }

    public static void v(Context context) {
        boolean z10;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (k.I(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            z10 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        new cj.i(context, z10, taskCompletionSource, 8).run();
        taskCompletionSource.getTask();
    }

    public static String w(vm.e eVar, kl.e eVar2) {
        if (eVar.b(eVar2)) {
            return null;
        }
        return eVar.getDescription();
    }

    public static boolean x(char c4) {
        return Character.isWhitespace(c4) || Character.isSpaceChar(c4);
    }

    public static int y(Object obj, z0 z0Var, byte[] bArr, int i10, int i11, int i12, ur1 ur1Var) throws com.google.crypto.tink.shaded.protobuf.d0 {
        r0 r0Var = (r0) z0Var;
        int i13 = ur1Var.f20877d + 1;
        ur1Var.f20877d = i13;
        if (i13 >= 100) {
            throw new com.google.crypto.tink.shaded.protobuf.d0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iE = r0Var.E(obj, bArr, i10, i11, i12, ur1Var);
        ur1Var.f20877d--;
        ur1Var.f20876c = obj;
        return iE;
    }

    public static int z(Object obj, z0 z0Var, byte[] bArr, int i10, int i11, ur1 ur1Var) throws com.google.crypto.tink.shaded.protobuf.d0 {
        int iL = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iL = l(i12, bArr, iL, ur1Var);
            i12 = ur1Var.f20874a;
        }
        int i13 = iL;
        if (i12 < 0 || i12 > i11 - i13) {
            throw com.google.crypto.tink.shaded.protobuf.d0.l();
        }
        int i14 = ur1Var.f20877d + 1;
        ur1Var.f20877d = i14;
        if (i14 >= 100) {
            throw new com.google.crypto.tink.shaded.protobuf.d0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i15 = i13 + i12;
        z0Var.i(obj, bArr, i13, i15, ur1Var);
        ur1Var.f20877d--;
        ur1Var.f20876c = obj;
        return i15;
    }
}
