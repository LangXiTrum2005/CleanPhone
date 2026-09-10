package ud;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f52132a = new o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final am.e f52133b;

    static {
        oc.d dVar = new oc.d();
        dVar.a(n0.class, g.f52075a);
        dVar.a(v0.class, h.f52081a);
        dVar.a(k.class, e.f52059a);
        dVar.a(b.class, d.f52048a);
        dVar.a(a.class, c.f52024a);
        dVar.a(e0.class, f.f52067a);
        dVar.f47373d = true;
        f52133b = new am.e(dVar, 25);
    }

    public static b a(mb.g gVar) throws PackageManager.NameNotFoundException {
        gVar.a();
        Context context = gVar.f45928a;
        kotlin.jvm.internal.n.e(context, "getApplicationContext(...)");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = String.valueOf(packageInfo.getLongVersionCode());
        gVar.a();
        String str = gVar.f45930c.f45944b;
        kotlin.jvm.internal.n.e(str, "getApplicationId(...)");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.n.e(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.n.e(RELEASE, "RELEASE");
        kotlin.jvm.internal.n.c(packageName);
        String str2 = packageInfo.versionName;
        String str3 = str2 == null ? strValueOf : str2;
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.n.e(MANUFACTURER, "MANUFACTURER");
        gVar.a();
        e0 e0VarB = f0.b(context);
        gVar.a();
        return new b(str, new a(packageName, str3, strValueOf, e0VarB, f0.a(context)));
    }
}
