package ea;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b4 extends v3 {
    public static final boolean J0(String str) {
        String str2 = (String) d0.f39331t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.J().u()) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ea.a4 H0(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.b4.H0(java.lang.String):ea.a4");
    }

    public final String I0(String str) {
        f1 f1Var = this.f39807b.f39371a;
        e4.T(f1Var);
        String strT0 = f1Var.T0(str);
        if (TextUtils.isEmpty(strT0)) {
            return (String) d0.f39328r.a(null);
        }
        Uri uri = Uri.parse((String) d0.f39328r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strT0).length() + 1 + String.valueOf(authority).length());
        sb2.append(strT0);
        sb2.append(".");
        sb2.append(authority);
        builderBuildUpon.authority(sb2.toString());
        return builderBuildUpon.build().toString();
    }
}
