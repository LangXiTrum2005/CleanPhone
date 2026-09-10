package talweg;

import android.content.ComponentName;
import android.content.Context;
import com.ironsource.C3414a2;

/* JADX INFO: compiled from: PackageManagerHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final String f38662attabal = androidx.work.apical.beachfront("PackageManagerHelper");

    public static void attabal(Context context, Class<?> cls, boolean z) {
        String str = C3414a2.e;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            androidx.work.apical.dern().attabal(f38662attabal, String.format("%s %s", cls.getName(), z ? "enabled" : C3414a2.e), new Throwable[0]);
        } catch (Exception e) {
            androidx.work.apical apicalVarDern = androidx.work.apical.dern();
            String str2 = f38662attabal;
            String name = cls.getName();
            if (z) {
                str = "enabled";
            }
            apicalVarDern.attabal(str2, String.format("%s could not be %s", name, str), e);
        }
    }
}
