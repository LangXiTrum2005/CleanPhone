package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ti1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ti1 f20404b = new ti1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f20405a = new HashMap();

    public final synchronized void a(String str, ff1 ff1Var) {
        try {
            HashMap map = this.f20405a;
            if (!map.containsKey(str)) {
                map.put(str, ff1Var);
                return;
            }
            if (((ff1) map.get(str)).equals(ff1Var)) {
                return;
            }
            String strValueOf = String.valueOf(map.get(str));
            String strValueOf2 = String.valueOf(ff1Var);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 45 + strValueOf.length() + 17 + strValueOf2.length());
            sb2.append("Parameters object with name ");
            sb2.append(str);
            sb2.append(" already exists (");
            sb2.append(strValueOf);
            sb2.append("), cannot insert ");
            sb2.append(strValueOf2);
            throw new GeneralSecurityException(sb2.toString());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (ff1) entry.getValue());
        }
    }
}
