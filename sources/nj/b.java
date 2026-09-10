package nj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.n;
import m5.k;
import wj.j;
import xi.l;
import xj.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b f46770a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f46771b = r9.b.u(new defpackage.c(14));

    public static void a(xi.f binaryMessenger, final k kVar) {
        n.f(binaryMessenger, "binaryMessenger");
        String strN = defpackage.e.n("dev.flutter.pigeon.quick_actions_android.AndroidQuickActionsApi.getLaunchAction", "");
        j jVar = f46771b;
        Object obj = null;
        k5.g gVar = new k5.g(binaryMessenger, strN, (l) jVar.getValue(), obj);
        if (kVar != null) {
            final int i10 = 0;
            gVar.C(new xi.b() { // from class: nj.a
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    int identifier;
                    List listQ2;
                    switch (i10) {
                        case 0:
                            try {
                                k kVar2 = (k) kVar;
                                Activity activity = (Activity) kVar2.f45903c;
                                if (activity == null) {
                                    throw new e("quick_action_getlaunchaction_no_activity", "There is no activity available when launching action", null);
                                }
                                Intent intent = activity.getIntent();
                                String stringExtra = intent.getStringExtra("some unique action key");
                                if (stringExtra != null && !stringExtra.isEmpty()) {
                                    d0.c.I((Context) kVar2.f45902b, stringExtra);
                                    intent.removeExtra("some unique action key");
                                }
                                listQ = j1.f.C(stringExtra);
                                bVar.e(listQ);
                                return;
                            } catch (Throwable th2) {
                                if (th2 instanceof e) {
                                    e eVar = th2;
                                    listQ = o.Q(eVar.f46775a, eVar.f46776b, eVar.f46777c);
                                } else {
                                    listQ = o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            break;
                        case 1:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.quickactions.ShortcutItemMessage>");
                            hj.b bVar2 = new hj.b(bVar, 15);
                            k kVar3 = (k) kVar;
                            Context context = (Context) kVar3.f45902b;
                            ArrayList arrayList = new ArrayList();
                            for (h hVar : (List) obj3) {
                                String str = hVar.f46782c;
                                String str2 = hVar.f46780a;
                                String str3 = hVar.f46781b;
                                d0.a aVar = new d0.a();
                                aVar.f38610a = context;
                                aVar.f38611b = str2;
                                if (str == null) {
                                    identifier = 0;
                                } else {
                                    String packageName = context.getPackageName();
                                    Resources resources = context.getResources();
                                    identifier = resources.getIdentifier(str, "drawable", packageName);
                                    if (identifier == 0) {
                                        identifier = resources.getIdentifier(str, "mipmap", packageName);
                                    }
                                }
                                Intent intentAddFlags = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).setAction("android.intent.action.RUN").putExtra("some unique action key", str2).addFlags(268435456).addFlags(536870912);
                                if (identifier > 0) {
                                    aVar.f38615f = IconCompat.c(context, identifier);
                                }
                                aVar.f38614e = str3;
                                aVar.f38613d = str3;
                                aVar.f38612c = new Intent[]{intentAddFlags};
                                if (TextUtils.isEmpty(str3)) {
                                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                                }
                                Intent[] intentArr = aVar.f38612c;
                                if (intentArr == null || intentArr.length == 0) {
                                    throw new IllegalArgumentException("Shortcut must have an intent");
                                }
                                arrayList.add(aVar);
                            }
                            new ThreadPoolExecutor(0, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue()).execute(new ld.f(kVar3, arrayList, bVar2, 4));
                            return;
                        default:
                            try {
                                Context context2 = (Context) ((k) kVar).f45902b;
                                ((ShortcutManager) context2.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
                                d0.c.v(context2).getClass();
                                Iterator it = ((ArrayList) d0.c.u(context2)).iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                                listQ2 = j1.f.C(null);
                                bVar.e(listQ2);
                                return;
                            } catch (Throwable th3) {
                                if (th3 instanceof e) {
                                    e eVar2 = th3;
                                    listQ2 = o.Q(eVar2.f46775a, eVar2.f46776b, eVar2.f46777c);
                                } else {
                                    listQ2 = o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            break;
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        k5.g gVar2 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.quick_actions_android.AndroidQuickActionsApi.setShortcutItems", ""), (l) jVar.getValue(), obj);
        if (kVar != null) {
            final int i11 = 1;
            gVar2.C(new xi.b() { // from class: nj.a
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    int identifier;
                    List listQ2;
                    switch (i11) {
                        case 0:
                            try {
                                k kVar2 = (k) kVar;
                                Activity activity = (Activity) kVar2.f45903c;
                                if (activity == null) {
                                    throw new e("quick_action_getlaunchaction_no_activity", "There is no activity available when launching action", null);
                                }
                                Intent intent = activity.getIntent();
                                String stringExtra = intent.getStringExtra("some unique action key");
                                if (stringExtra != null && !stringExtra.isEmpty()) {
                                    d0.c.I((Context) kVar2.f45902b, stringExtra);
                                    intent.removeExtra("some unique action key");
                                }
                                listQ = j1.f.C(stringExtra);
                                bVar.e(listQ);
                                return;
                            } catch (Throwable th2) {
                                if (th2 instanceof e) {
                                    e eVar = th2;
                                    listQ = o.Q(eVar.f46775a, eVar.f46776b, eVar.f46777c);
                                } else {
                                    listQ = o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            break;
                        case 1:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.quickactions.ShortcutItemMessage>");
                            hj.b bVar2 = new hj.b(bVar, 15);
                            k kVar3 = (k) kVar;
                            Context context = (Context) kVar3.f45902b;
                            ArrayList arrayList = new ArrayList();
                            for (h hVar : (List) obj3) {
                                String str = hVar.f46782c;
                                String str2 = hVar.f46780a;
                                String str3 = hVar.f46781b;
                                d0.a aVar = new d0.a();
                                aVar.f38610a = context;
                                aVar.f38611b = str2;
                                if (str == null) {
                                    identifier = 0;
                                } else {
                                    String packageName = context.getPackageName();
                                    Resources resources = context.getResources();
                                    identifier = resources.getIdentifier(str, "drawable", packageName);
                                    if (identifier == 0) {
                                        identifier = resources.getIdentifier(str, "mipmap", packageName);
                                    }
                                }
                                Intent intentAddFlags = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).setAction("android.intent.action.RUN").putExtra("some unique action key", str2).addFlags(268435456).addFlags(536870912);
                                if (identifier > 0) {
                                    aVar.f38615f = IconCompat.c(context, identifier);
                                }
                                aVar.f38614e = str3;
                                aVar.f38613d = str3;
                                aVar.f38612c = new Intent[]{intentAddFlags};
                                if (TextUtils.isEmpty(str3)) {
                                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                                }
                                Intent[] intentArr = aVar.f38612c;
                                if (intentArr == null || intentArr.length == 0) {
                                    throw new IllegalArgumentException("Shortcut must have an intent");
                                }
                                arrayList.add(aVar);
                            }
                            new ThreadPoolExecutor(0, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue()).execute(new ld.f(kVar3, arrayList, bVar2, 4));
                            return;
                        default:
                            try {
                                Context context2 = (Context) ((k) kVar).f45902b;
                                ((ShortcutManager) context2.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
                                d0.c.v(context2).getClass();
                                Iterator it = ((ArrayList) d0.c.u(context2)).iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                                listQ2 = j1.f.C(null);
                                bVar.e(listQ2);
                                return;
                            } catch (Throwable th3) {
                                if (th3 instanceof e) {
                                    e eVar2 = th3;
                                    listQ2 = o.Q(eVar2.f46775a, eVar2.f46776b, eVar2.f46777c);
                                } else {
                                    listQ2 = o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            break;
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        k5.g gVar3 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.quick_actions_android.AndroidQuickActionsApi.clearShortcutItems", ""), (l) jVar.getValue(), obj);
        if (kVar == null) {
            gVar3.C(null);
        } else {
            final int i12 = 2;
            gVar3.C(new xi.b() { // from class: nj.a
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    List listQ;
                    int identifier;
                    List listQ2;
                    switch (i12) {
                        case 0:
                            try {
                                k kVar2 = (k) kVar;
                                Activity activity = (Activity) kVar2.f45903c;
                                if (activity == null) {
                                    throw new e("quick_action_getlaunchaction_no_activity", "There is no activity available when launching action", null);
                                }
                                Intent intent = activity.getIntent();
                                String stringExtra = intent.getStringExtra("some unique action key");
                                if (stringExtra != null && !stringExtra.isEmpty()) {
                                    d0.c.I((Context) kVar2.f45902b, stringExtra);
                                    intent.removeExtra("some unique action key");
                                }
                                listQ = j1.f.C(stringExtra);
                                bVar.e(listQ);
                                return;
                            } catch (Throwable th2) {
                                if (th2 instanceof e) {
                                    e eVar = th2;
                                    listQ = o.Q(eVar.f46775a, eVar.f46776b, eVar.f46777c);
                                } else {
                                    listQ = o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            break;
                        case 1:
                            n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            n.d(obj3, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.quickactions.ShortcutItemMessage>");
                            hj.b bVar2 = new hj.b(bVar, 15);
                            k kVar3 = (k) kVar;
                            Context context = (Context) kVar3.f45902b;
                            ArrayList arrayList = new ArrayList();
                            for (h hVar : (List) obj3) {
                                String str = hVar.f46782c;
                                String str2 = hVar.f46780a;
                                String str3 = hVar.f46781b;
                                d0.a aVar = new d0.a();
                                aVar.f38610a = context;
                                aVar.f38611b = str2;
                                if (str == null) {
                                    identifier = 0;
                                } else {
                                    String packageName = context.getPackageName();
                                    Resources resources = context.getResources();
                                    identifier = resources.getIdentifier(str, "drawable", packageName);
                                    if (identifier == 0) {
                                        identifier = resources.getIdentifier(str, "mipmap", packageName);
                                    }
                                }
                                Intent intentAddFlags = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).setAction("android.intent.action.RUN").putExtra("some unique action key", str2).addFlags(268435456).addFlags(536870912);
                                if (identifier > 0) {
                                    aVar.f38615f = IconCompat.c(context, identifier);
                                }
                                aVar.f38614e = str3;
                                aVar.f38613d = str3;
                                aVar.f38612c = new Intent[]{intentAddFlags};
                                if (TextUtils.isEmpty(str3)) {
                                    throw new IllegalArgumentException("Shortcut must have a non-empty label");
                                }
                                Intent[] intentArr = aVar.f38612c;
                                if (intentArr == null || intentArr.length == 0) {
                                    throw new IllegalArgumentException("Shortcut must have an intent");
                                }
                                arrayList.add(aVar);
                            }
                            new ThreadPoolExecutor(0, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue()).execute(new ld.f(kVar3, arrayList, bVar2, 4));
                            return;
                        default:
                            try {
                                Context context2 = (Context) ((k) kVar).f45902b;
                                ((ShortcutManager) context2.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
                                d0.c.v(context2).getClass();
                                Iterator it = ((ArrayList) d0.c.u(context2)).iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                                listQ2 = j1.f.C(null);
                                bVar.e(listQ2);
                                return;
                            } catch (Throwable th3) {
                                if (th3 instanceof e) {
                                    e eVar2 = th3;
                                    listQ2 = o.Q(eVar2.f46775a, eVar2.f46776b, eVar2.f46777c);
                                } else {
                                    listQ2 = o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            break;
                    }
                }
            });
        }
    }
}
