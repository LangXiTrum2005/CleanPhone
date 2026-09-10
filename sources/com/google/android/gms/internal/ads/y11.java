package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y11 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f22073h = new UUID(0, 0).toString();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final iw0 f22079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x11 f22080g;

    public y11(Context context, String str, String str2, String str3) {
        if (iw0.f15862d == null) {
            iw0.f15862d = new iw0(context);
        }
        this.f22079f = iw0.f15862d;
        this.f22080g = x11.v(context);
        this.f22074a = str;
        this.f22075b = str.concat("_3p");
        this.f22076c = str2;
        this.f22077d = str2.concat("_3p");
        this.f22078e = str3;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    public final b2.i0 a(String str, String str2, long j10, boolean z10) throws IOException {
        String str3 = this.f22075b;
        iw0 iw0Var = this.f22079f;
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(f22073h)) {
                    String string = ((SharedPreferences) iw0Var.f15865c).getString(str3, null);
                    String string2 = ((SharedPreferences) iw0Var.f15865c).getString("paid_3p_hash_key", null);
                    if (string != null && string2 != null) {
                        if (!string.equals(e(str, str2, string2))) {
                            return b(str, str2);
                        }
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new b2.i0();
        }
        boolean z11 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.f22078e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        String str4 = this.f22076c;
        String str5 = this.f22077d;
        long j11 = ((SharedPreferences) iw0Var.f15865c).getLong(z11 ? str5 : str4, -1L);
        if (j11 != -1) {
            if (jCurrentTimeMillis < j11) {
                iw0Var.o(Long.valueOf(jCurrentTimeMillis), z11 ? str5 : str4);
            } else if (jCurrentTimeMillis >= j11 + j10) {
                return b(str, str2);
            }
        }
        if (!z11) {
            str3 = this.f22074a;
        }
        String string3 = ((SharedPreferences) iw0Var.f15865c).getString(str3, null);
        if (string3 == null && !z10) {
            return b(str, str2);
        }
        if (z11) {
            str4 = str5;
        }
        return new b2.i0(string3, ((SharedPreferences) iw0Var.f15865c).getLong(str4, -1L));
    }

    public final b2.i0 b(String str, String str2) throws IOException {
        if (str == null) {
            return d(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.f22079f.o(string, "paid_3p_hash_key");
        return d(e(str, str2, string), true);
    }

    public final void c(boolean z10) throws IOException {
        String str = z10 ? this.f22077d : this.f22076c;
        iw0 iw0Var = this.f22079f;
        iw0Var.w(str);
        iw0Var.w(z10 ? this.f22075b : this.f22074a);
    }

    public final b2.i0 d(String str, boolean z10) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.f22078e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        String str2 = z10 ? this.f22077d : this.f22076c;
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        iw0 iw0Var = this.f22079f;
        iw0Var.o(lValueOf, str2);
        iw0Var.o(str, z10 ? this.f22075b : this.f22074a);
        return new b2.i0(str, jCurrentTimeMillis);
    }

    public final String e(String str, String str2, String str3) {
        if (str2 != null) {
            return UUID.nameUUIDFromBytes(q4.a.j(new StringBuilder(str2.length() + str.length() + str3.length()), str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = str2 == null ? "null" : "not null";
        StringBuilder sb2 = new StringBuilder("not null".length() + str4.length() + 120);
        d5.u.r(sb2, this.f22078e, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ", str4, ", hashKey is ");
        sb2.append("not null");
        throw new IllegalArgumentException(sb2.toString());
    }
}
