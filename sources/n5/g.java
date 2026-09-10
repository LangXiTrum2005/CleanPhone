package n5;

import android.content.ComponentName;
import android.content.Context;
import com.ironsource.C0239a2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f46524a = d5.o.i("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z10) {
        String str = C0239a2.f28155e;
        String str2 = f46524a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            d5.o.g().e(str2, cls.getName() + " " + (z10 ? "enabled" : C0239a2.f28155e), new Throwable[0]);
        } catch (Exception e10) {
            d5.o oVarG = d5.o.g();
            String name = cls.getName();
            if (z10) {
                str = "enabled";
            }
            oVarG.e(str2, wi.d.i(name, " could not be ", str), e10);
        }
    }
}
