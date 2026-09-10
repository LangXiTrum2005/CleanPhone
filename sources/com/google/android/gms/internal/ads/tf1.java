package com.google.android.gms.internal.ads;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.X3;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class tf1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tf1 f20362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final tf1 f20363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final tf1 f20364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final tf1 f20365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final tf1 f20366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final tf1 f20367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final tf1 f20368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final tf1 f20369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final tf1 f20370k;
    public static final tf1 l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20372b;

    static {
        int i10 = 0;
        f20362c = new tf1("TINK", i10);
        f20363d = new tf1("CRUNCHY", i10);
        f20364e = new tf1("NO_PREFIX", i10);
        int i11 = 1;
        f20365f = new tf1("TINK", i11);
        f20366g = new tf1("CRUNCHY", i11);
        f20367h = new tf1("NO_PREFIX", i11);
        int i12 = 2;
        f20368i = new tf1("TINK", i12);
        f20369j = new tf1("NO_PREFIX", i12);
        int i13 = 3;
        f20370k = new tf1("IEEE_P1363", i13);
        l = new tf1("DER", i13);
    }

    public static tf1 a(np0 np0Var) {
        String str;
        np0Var.G(2);
        int iK = np0Var.K();
        int i10 = iK >> 1;
        int i11 = iK & 1;
        int iK2 = np0Var.K() >> 3;
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i12 = iK2 | (i11 << 5);
        String str2 = i10 < 10 ? ".0" : ".";
        int length = str2.length() + 4;
        int length2 = String.valueOf(i10).length();
        int length3 = String.valueOf(i12).length();
        String str3 = i12 < 10 ? ".0" : ".";
        StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.i(length + length2, length3, str3));
        sb2.append(str);
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(str3);
        sb2.append(i12);
        return new tf1(sb2.toString(), 5);
    }

    public static String f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e10);
                String strJoin = TextUtils.join(", ", objArr);
                int length = str2.length();
                str2 = d5.u.h(new StringBuilder(String.valueOf(strJoin).length() + length + 2 + 1), str2, " [", strJoin, X3.j.f27836e);
            }
        }
        return q4.a.j(new StringBuilder(str.length() + 3 + String.valueOf(str2).length()), str, " : ", str2);
    }

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", f(this.f20372b, str, objArr));
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", f(this.f20372b, str, objArr));
        }
    }

    public void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", f(this.f20372b, str, objArr));
        }
    }

    public void e(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", f(this.f20372b, str, objArr), remoteException);
        }
    }

    public String toString() {
        switch (this.f20371a) {
            case 0:
                return this.f20372b;
            case 1:
                return this.f20372b;
            case 2:
                return this.f20372b;
            case 3:
                return this.f20372b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ tf1(String str, int i10) {
        this.f20371a = i10;
        this.f20372b = str;
    }

    public tf1(String str) {
        this.f20371a = 6;
        int iMyUid = Process.myUid();
        int iMyPid = Process.myPid();
        StringBuilder sb2 = new StringBuilder(String.valueOf(iMyUid).length() + 15 + String.valueOf(iMyPid).length() + 2);
        l1.d.p(sb2, "UID: [", iMyUid, "]  PID: [", iMyPid);
        sb2.append("] ");
        this.f20372b = sb2.toString().concat(str);
    }
}
