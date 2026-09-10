package sg.bigo.ads.common.b;

import android.content.Context;
import android.text.TextUtils;
import com.unity3d.services.core.fid.Constants;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f47114a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f47115b = true;

    public static String a(Context context) {
        if (!TextUtils.isEmpty(f47114a) || !f47115b) {
            return f47114a;
        }
        try {
            Class<?> cls = Class.forName("com.appsflyer.AppsFlyerLib");
            Object objInvoke = cls.getMethod("getAppsFlyerUID", Context.class).invoke(cls.getMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]), context);
            if (objInvoke instanceof String) {
                f47114a = (String) objInvoke;
            }
        } catch (Exception unused) {
            f47115b = false;
        }
        return f47114a;
    }
}
