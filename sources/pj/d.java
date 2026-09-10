package pj;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.n;
import wj.j;
import xi.l;
import xj.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d f48386a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f48387b = r9.b.u(new defpackage.c(17));

    public static void a(xi.f binaryMessenger, final v9.e eVar) {
        n.f(binaryMessenger, "binaryMessenger");
        String strN = defpackage.e.n("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", "");
        j jVar = f48387b;
        Object obj = null;
        k5.g gVar = new k5.g(binaryMessenger, strN, (l) jVar.getValue(), obj);
        if (eVar != null) {
            final int i10 = 0;
            gVar.C(new xi.b() { // from class: pj.c
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    int i11 = i10;
                    e eVar2 = eVar;
                    switch (i11) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z10 = false;
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            try {
                                v9.e eVar3 = (v9.e) eVar2;
                                eVar3.getClass();
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(str));
                                ComponentName componentNameResolveActivity = intent.resolveActivity(((Context) ((k3.j) eVar3.f52504c).f44293b).getPackageManager());
                                String shortString = componentNameResolveActivity == null ? null : componentNameResolveActivity.toShortString();
                                if (shortString != null) {
                                    z10 = !"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString);
                                }
                                listQ2 = j1.f.C(Boolean.valueOf(z10));
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar2 = th2;
                                    listQ2 = o.Q(bVar2.f48382a, bVar2.f48383b, null);
                                } else {
                                    listQ2 = o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            return;
                        case 1:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            boolean z11 = false;
                            Object obj4 = list.get(0);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj4;
                            Object obj5 = list.get(1);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map map = (Map) obj5;
                            Object obj6 = list.get(2);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                            try {
                                v9.e eVar4 = (v9.e) eVar2;
                                if (((Activity) eVar4.f52505d) == null) {
                                    throw new b();
                                }
                                Intent intentPutExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str2)).putExtra("com.android.browser.headers", v9.e.C(map));
                                if (zBooleanValue) {
                                    intentPutExtra.addFlags(1024);
                                }
                                try {
                                    ((Activity) eVar4.f52505d).startActivity(intentPutExtra);
                                    z11 = true;
                                } catch (ActivityNotFoundException unused) {
                                }
                                listQ3 = j1.f.C(Boolean.valueOf(z11));
                                bVar.e(listQ3);
                                return;
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar3 = th3;
                                    listQ3 = o.Q(bVar3.f48382a, bVar3.f48383b, null);
                                } else {
                                    listQ3 = o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            break;
                        case 2:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list2.get(1);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                            Object obj9 = list2.get(2);
                            n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.WebViewOptions");
                            h hVar = (h) obj9;
                            Object obj10 = list2.get(3);
                            n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.BrowserOptions");
                            try {
                                listQ4 = j1.f.C(Boolean.valueOf(((v9.e) eVar2).H(str3, zBooleanValue2, hVar, (a) obj10)));
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar4 = th4;
                                    listQ4 = o.Q(bVar4.f48382a, bVar4.f48383b, null);
                                } else {
                                    listQ4 = o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            return;
                        case 3:
                            try {
                                listQ = j1.f.C(Boolean.valueOf(u.g.b((Context) ((v9.e) eVar2).f52503b, Collections.EMPTY_LIST, false) != null));
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar5 = th5;
                                    listQ = o.Q(bVar5.f48382a, bVar5.f48383b, null);
                                } else {
                                    listQ = o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            return;
                        default:
                            try {
                                ((Context) ((v9.e) eVar2).f52503b).sendBroadcast(new Intent("close action"));
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof b) {
                                    b bVar6 = th6;
                                    listQ5 = o.Q(bVar6.f48382a, bVar6.f48383b, null);
                                } else {
                                    listQ5 = o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            return;
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        k5.g gVar2 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", ""), (l) jVar.getValue(), obj);
        if (eVar != null) {
            final int i11 = 1;
            gVar2.C(new xi.b() { // from class: pj.c
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    int i12 = i11;
                    e eVar2 = eVar;
                    switch (i12) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z10 = false;
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            try {
                                v9.e eVar3 = (v9.e) eVar2;
                                eVar3.getClass();
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(str));
                                ComponentName componentNameResolveActivity = intent.resolveActivity(((Context) ((k3.j) eVar3.f52504c).f44293b).getPackageManager());
                                String shortString = componentNameResolveActivity == null ? null : componentNameResolveActivity.toShortString();
                                if (shortString != null) {
                                    z10 = !"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString);
                                }
                                listQ2 = j1.f.C(Boolean.valueOf(z10));
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar2 = th2;
                                    listQ2 = o.Q(bVar2.f48382a, bVar2.f48383b, null);
                                } else {
                                    listQ2 = o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            return;
                        case 1:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            boolean z11 = false;
                            Object obj4 = list.get(0);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj4;
                            Object obj5 = list.get(1);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map map = (Map) obj5;
                            Object obj6 = list.get(2);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                            try {
                                v9.e eVar4 = (v9.e) eVar2;
                                if (((Activity) eVar4.f52505d) == null) {
                                    throw new b();
                                }
                                Intent intentPutExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str2)).putExtra("com.android.browser.headers", v9.e.C(map));
                                if (zBooleanValue) {
                                    intentPutExtra.addFlags(1024);
                                }
                                try {
                                    ((Activity) eVar4.f52505d).startActivity(intentPutExtra);
                                    z11 = true;
                                } catch (ActivityNotFoundException unused) {
                                }
                                listQ3 = j1.f.C(Boolean.valueOf(z11));
                                bVar.e(listQ3);
                                return;
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar3 = th3;
                                    listQ3 = o.Q(bVar3.f48382a, bVar3.f48383b, null);
                                } else {
                                    listQ3 = o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            break;
                        case 2:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list2.get(1);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                            Object obj9 = list2.get(2);
                            n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.WebViewOptions");
                            h hVar = (h) obj9;
                            Object obj10 = list2.get(3);
                            n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.BrowserOptions");
                            try {
                                listQ4 = j1.f.C(Boolean.valueOf(((v9.e) eVar2).H(str3, zBooleanValue2, hVar, (a) obj10)));
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar4 = th4;
                                    listQ4 = o.Q(bVar4.f48382a, bVar4.f48383b, null);
                                } else {
                                    listQ4 = o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            return;
                        case 3:
                            try {
                                listQ = j1.f.C(Boolean.valueOf(u.g.b((Context) ((v9.e) eVar2).f52503b, Collections.EMPTY_LIST, false) != null));
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar5 = th5;
                                    listQ = o.Q(bVar5.f48382a, bVar5.f48383b, null);
                                } else {
                                    listQ = o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            return;
                        default:
                            try {
                                ((Context) ((v9.e) eVar2).f52503b).sendBroadcast(new Intent("close action"));
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof b) {
                                    b bVar6 = th6;
                                    listQ5 = o.Q(bVar6.f48382a, bVar6.f48383b, null);
                                } else {
                                    listQ5 = o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            return;
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        k5.g gVar3 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", ""), (l) jVar.getValue(), obj);
        if (eVar != null) {
            final int i12 = 2;
            gVar3.C(new xi.b() { // from class: pj.c
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    int i13 = i12;
                    e eVar2 = eVar;
                    switch (i13) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z10 = false;
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            try {
                                v9.e eVar3 = (v9.e) eVar2;
                                eVar3.getClass();
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(str));
                                ComponentName componentNameResolveActivity = intent.resolveActivity(((Context) ((k3.j) eVar3.f52504c).f44293b).getPackageManager());
                                String shortString = componentNameResolveActivity == null ? null : componentNameResolveActivity.toShortString();
                                if (shortString != null) {
                                    z10 = !"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString);
                                }
                                listQ2 = j1.f.C(Boolean.valueOf(z10));
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar2 = th2;
                                    listQ2 = o.Q(bVar2.f48382a, bVar2.f48383b, null);
                                } else {
                                    listQ2 = o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            return;
                        case 1:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            boolean z11 = false;
                            Object obj4 = list.get(0);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj4;
                            Object obj5 = list.get(1);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map map = (Map) obj5;
                            Object obj6 = list.get(2);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                            try {
                                v9.e eVar4 = (v9.e) eVar2;
                                if (((Activity) eVar4.f52505d) == null) {
                                    throw new b();
                                }
                                Intent intentPutExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str2)).putExtra("com.android.browser.headers", v9.e.C(map));
                                if (zBooleanValue) {
                                    intentPutExtra.addFlags(1024);
                                }
                                try {
                                    ((Activity) eVar4.f52505d).startActivity(intentPutExtra);
                                    z11 = true;
                                } catch (ActivityNotFoundException unused) {
                                }
                                listQ3 = j1.f.C(Boolean.valueOf(z11));
                                bVar.e(listQ3);
                                return;
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar3 = th3;
                                    listQ3 = o.Q(bVar3.f48382a, bVar3.f48383b, null);
                                } else {
                                    listQ3 = o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            break;
                        case 2:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list2.get(1);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                            Object obj9 = list2.get(2);
                            n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.WebViewOptions");
                            h hVar = (h) obj9;
                            Object obj10 = list2.get(3);
                            n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.BrowserOptions");
                            try {
                                listQ4 = j1.f.C(Boolean.valueOf(((v9.e) eVar2).H(str3, zBooleanValue2, hVar, (a) obj10)));
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar4 = th4;
                                    listQ4 = o.Q(bVar4.f48382a, bVar4.f48383b, null);
                                } else {
                                    listQ4 = o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            return;
                        case 3:
                            try {
                                listQ = j1.f.C(Boolean.valueOf(u.g.b((Context) ((v9.e) eVar2).f52503b, Collections.EMPTY_LIST, false) != null));
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar5 = th5;
                                    listQ = o.Q(bVar5.f48382a, bVar5.f48383b, null);
                                } else {
                                    listQ = o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            return;
                        default:
                            try {
                                ((Context) ((v9.e) eVar2).f52503b).sendBroadcast(new Intent("close action"));
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof b) {
                                    b bVar6 = th6;
                                    listQ5 = o.Q(bVar6.f48382a, bVar6.f48383b, null);
                                } else {
                                    listQ5 = o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            return;
                    }
                }
            });
        } else {
            gVar3.C(null);
        }
        k5.g gVar4 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", ""), (l) jVar.getValue(), obj);
        if (eVar != null) {
            final int i13 = 3;
            gVar4.C(new xi.b() { // from class: pj.c
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    int i14 = i13;
                    e eVar2 = eVar;
                    switch (i14) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z10 = false;
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            try {
                                v9.e eVar3 = (v9.e) eVar2;
                                eVar3.getClass();
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(str));
                                ComponentName componentNameResolveActivity = intent.resolveActivity(((Context) ((k3.j) eVar3.f52504c).f44293b).getPackageManager());
                                String shortString = componentNameResolveActivity == null ? null : componentNameResolveActivity.toShortString();
                                if (shortString != null) {
                                    z10 = !"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString);
                                }
                                listQ2 = j1.f.C(Boolean.valueOf(z10));
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar2 = th2;
                                    listQ2 = o.Q(bVar2.f48382a, bVar2.f48383b, null);
                                } else {
                                    listQ2 = o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            return;
                        case 1:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            boolean z11 = false;
                            Object obj4 = list.get(0);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj4;
                            Object obj5 = list.get(1);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map map = (Map) obj5;
                            Object obj6 = list.get(2);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                            try {
                                v9.e eVar4 = (v9.e) eVar2;
                                if (((Activity) eVar4.f52505d) == null) {
                                    throw new b();
                                }
                                Intent intentPutExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str2)).putExtra("com.android.browser.headers", v9.e.C(map));
                                if (zBooleanValue) {
                                    intentPutExtra.addFlags(1024);
                                }
                                try {
                                    ((Activity) eVar4.f52505d).startActivity(intentPutExtra);
                                    z11 = true;
                                } catch (ActivityNotFoundException unused) {
                                }
                                listQ3 = j1.f.C(Boolean.valueOf(z11));
                                bVar.e(listQ3);
                                return;
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar3 = th3;
                                    listQ3 = o.Q(bVar3.f48382a, bVar3.f48383b, null);
                                } else {
                                    listQ3 = o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            break;
                        case 2:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list2.get(1);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                            Object obj9 = list2.get(2);
                            n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.WebViewOptions");
                            h hVar = (h) obj9;
                            Object obj10 = list2.get(3);
                            n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.BrowserOptions");
                            try {
                                listQ4 = j1.f.C(Boolean.valueOf(((v9.e) eVar2).H(str3, zBooleanValue2, hVar, (a) obj10)));
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar4 = th4;
                                    listQ4 = o.Q(bVar4.f48382a, bVar4.f48383b, null);
                                } else {
                                    listQ4 = o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            return;
                        case 3:
                            try {
                                listQ = j1.f.C(Boolean.valueOf(u.g.b((Context) ((v9.e) eVar2).f52503b, Collections.EMPTY_LIST, false) != null));
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar5 = th5;
                                    listQ = o.Q(bVar5.f48382a, bVar5.f48383b, null);
                                } else {
                                    listQ = o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            return;
                        default:
                            try {
                                ((Context) ((v9.e) eVar2).f52503b).sendBroadcast(new Intent("close action"));
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof b) {
                                    b bVar6 = th6;
                                    listQ5 = o.Q(bVar6.f48382a, bVar6.f48383b, null);
                                } else {
                                    listQ5 = o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            return;
                    }
                }
            });
        } else {
            gVar4.C(null);
        }
        k5.g gVar5 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", ""), (l) jVar.getValue(), obj);
        if (eVar == null) {
            gVar5.C(null);
        } else {
            final int i14 = 4;
            gVar5.C(new xi.b() { // from class: pj.c
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    List listQ5;
                    int i15 = i14;
                    e eVar2 = eVar;
                    switch (i15) {
                        case 0:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z10 = false;
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            try {
                                v9.e eVar3 = (v9.e) eVar2;
                                eVar3.getClass();
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(str));
                                ComponentName componentNameResolveActivity = intent.resolveActivity(((Context) ((k3.j) eVar3.f52504c).f44293b).getPackageManager());
                                String shortString = componentNameResolveActivity == null ? null : componentNameResolveActivity.toShortString();
                                if (shortString != null) {
                                    z10 = !"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString);
                                }
                                listQ2 = j1.f.C(Boolean.valueOf(z10));
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar2 = th2;
                                    listQ2 = o.Q(bVar2.f48382a, bVar2.f48383b, null);
                                } else {
                                    listQ2 = o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ2);
                            return;
                        case 1:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            boolean z11 = false;
                            Object obj4 = list.get(0);
                            n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj4;
                            Object obj5 = list.get(1);
                            n.d(obj5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map map = (Map) obj5;
                            Object obj6 = list.get(2);
                            n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                            try {
                                v9.e eVar4 = (v9.e) eVar2;
                                if (((Activity) eVar4.f52505d) == null) {
                                    throw new b();
                                }
                                Intent intentPutExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str2)).putExtra("com.android.browser.headers", v9.e.C(map));
                                if (zBooleanValue) {
                                    intentPutExtra.addFlags(1024);
                                }
                                try {
                                    ((Activity) eVar4.f52505d).startActivity(intentPutExtra);
                                    z11 = true;
                                } catch (ActivityNotFoundException unused) {
                                }
                                listQ3 = j1.f.C(Boolean.valueOf(z11));
                                bVar.e(listQ3);
                                return;
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar3 = th3;
                                    listQ3 = o.Q(bVar3.f48382a, bVar3.f48383b, null);
                                } else {
                                    listQ3 = o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            break;
                        case 2:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj7;
                            Object obj8 = list2.get(1);
                            n.d(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
                            Object obj9 = list2.get(2);
                            n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.WebViewOptions");
                            h hVar = (h) obj9;
                            Object obj10 = list2.get(3);
                            n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.BrowserOptions");
                            try {
                                listQ4 = j1.f.C(Boolean.valueOf(((v9.e) eVar2).H(str3, zBooleanValue2, hVar, (a) obj10)));
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar4 = th4;
                                    listQ4 = o.Q(bVar4.f48382a, bVar4.f48383b, null);
                                } else {
                                    listQ4 = o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            return;
                        case 3:
                            try {
                                listQ = j1.f.C(Boolean.valueOf(u.g.b((Context) ((v9.e) eVar2).f52503b, Collections.EMPTY_LIST, false) != null));
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar5 = th5;
                                    listQ = o.Q(bVar5.f48382a, bVar5.f48383b, null);
                                } else {
                                    listQ = o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            return;
                        default:
                            try {
                                ((Context) ((v9.e) eVar2).f52503b).sendBroadcast(new Intent("close action"));
                                listQ5 = j1.f.C(null);
                                break;
                            } catch (Throwable th6) {
                                if (th6 instanceof b) {
                                    b bVar6 = th6;
                                    listQ5 = o.Q(bVar6.f48382a, bVar6.f48383b, null);
                                } else {
                                    listQ5 = o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            bVar.e(listQ5);
                            return;
                    }
                }
            });
        }
    }
}
