package com.pgl.ssdk;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.p004ironsource.x4;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f33493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f33494b;

    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TextUtils.isEmpty(w.f33494b)) {
                String unused = w.f33494b = w.d();
                ax.b(z.a(), "romtype", w.f33494b);
            }
        }
    }

    private static boolean c(String str) {
        try {
            return new File(str).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d() {
        if (b("com.samsung.android.knox.SemPersonaManager") || b("com.samsung.android.knoxguard.KnoxGuardManager")) {
            return "samsung";
        }
        if (b("androidhnext.Manifest") || b("androidhnext.R")) {
            return "honor";
        }
        if (b("androidhwext.Manifest") || b("androidhwext.R")) {
            return "huawei";
        }
        if (b("oppo.Manifest") || b("oppo.R") || b("oplus.Manifest") || b("oplus.R") || b("com.oneplus.Manifest") || b("com.oneplus.R")) {
            return "oppo";
        }
        if (b("vivo.Manifest") || b("vivo.R")) {
            return "vivo";
        }
        if (b("miui.Manifest") || b("miui.R") || b("miui.os.Build")) {
            return "xiaomi";
        }
        if (b("lineageos.platform.Manifest") || b("lineageos.platform.R")) {
            return "lineage";
        }
        if (c("/system/framework/com.motorola.motosignature.jar")) {
            return "moto";
        }
        return (c("/system/framework/transsion-framework.jar") || c("/system/framework/transsion-services.jar")) ? "transsion" : x4.DEFAULT_AUCTION_FALLBACK_VALUE;
    }

    private static boolean b(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String c() {
        if (!TextUtils.isEmpty(f33494b)) {
            return f33494b;
        }
        String strA = ax.a(z.a(), "romtype", (String) null);
        f33494b = strA;
        if (!TextUtils.isEmpty(strA)) {
            return f33494b;
        }
        ar.b(new a());
        return "";
    }

    public static String a(Context context) {
        String str = f33493a;
        if (str != null) {
            return str;
        }
        String string = Settings.Global.getString(context.getContentResolver(), "boot_count");
        f33493a = string;
        return string;
    }
}
