package sg.bigo.ads.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.thinkup.core.common.n.mo;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f45352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f45353b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f45354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f45355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f45356c;
        public final String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f45357e;

        public a(boolean z2, String str, String str2, String str3, String str4) {
            this.f45354a = z2;
            this.f45357e = str;
            this.d = str2;
            this.f45356c = str3;
            this.f45355b = str4;
        }
    }

    public static a a(Context context) {
        String string;
        String str;
        String str2;
        String str3;
        String strValueOf;
        int iIndexOf;
        a aVar = f45353b;
        if (aVar != null) {
            return aVar;
        }
        boolean z2 = false;
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com")), 0);
        String strConcat = null;
        String str4 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.chrome", 0);
            if (packageInfo == null || !"com.android.chrome".equals(packageInfo.packageName)) {
                string = "No chrome pkg";
                str = string;
                str2 = strConcat;
            } else {
                f45352a = "com.android.chrome";
                String str5 = packageInfo.versionName;
                try {
                    String strSubstring = (TextUtils.isEmpty(str5) || (iIndexOf = str5.indexOf(mo.ono)) < 0) ? null : str5.substring(0, iIndexOf);
                    if (TextUtils.isEmpty(strSubstring)) {
                        str3 = "Invalid chrome version: ";
                        strValueOf = String.valueOf(str5);
                    } else {
                        if (Integer.parseInt(strSubstring) >= 45) {
                            z2 = true;
                        } else {
                            str3 = "Chrome version is low: ";
                            strValueOf = String.valueOf(str5);
                        }
                        str2 = str5;
                        str = strConcat;
                    }
                    strConcat = str3.concat(strValueOf);
                    str2 = str5;
                    str = strConcat;
                } catch (PackageManager.NameNotFoundException e2) {
                    e = e2;
                    strConcat = str5;
                    string = e.toString();
                    str = string;
                    str2 = strConcat;
                } catch (Exception e3) {
                    e = e3;
                    strConcat = str5;
                    string = e.toString();
                    str = string;
                    str2 = strConcat;
                }
            }
        } catch (PackageManager.NameNotFoundException e4) {
            e = e4;
        } catch (Exception e5) {
            e = e5;
        }
        a aVar2 = new a(z2, f45352a, str2, str4, str);
        f45353b = aVar2;
        return aVar2;
    }
}
