package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import android.support.v4.media.a;
import androidx.work.Logger;
import com.p004ironsource.x4;

/* JADX INFO: loaded from: classes.dex */
public class PackageManagerHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f8807a = Logger.e("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z2) {
        String str = x4.f27664e;
        String str2 = f8807a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z2 ? 1 : 2, 1);
            Logger.c().a(str2, cls.getName() + " " + (z2 ? "enabled" : x4.f27664e), new Throwable[0]);
        } catch (Exception e2) {
            Logger loggerC = Logger.c();
            String name = cls.getName();
            if (z2) {
                str = "enabled";
            }
            loggerC.a(str2, a.D(name, " could not be ", str), e2);
        }
    }
}
