package ec;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f40023c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40025b;

    public a(int i10, String str) {
        this.f40025b = i10;
        this.f40024a = str;
    }

    public void a(String str) {
        b(1, null, str);
    }

    public void b(int i10, Exception exc, String str) {
        if (this.f40025b <= i10) {
            String str2 = this.f40024a;
            if (i10 == 0) {
                Log.v(str2, str, exc);
                return;
            }
            if (i10 == 1) {
                Log.i(str2, str, exc);
            } else if (i10 == 2) {
                Log.w(str2, str, exc);
            } else {
                if (i10 != 3) {
                    return;
                }
                Log.e(str2, str, exc);
            }
        }
    }

    public void c(String str) {
        b(0, null, str);
    }

    public a(String str) {
        this.f40024a = str;
        this.f40025b = f40023c;
    }
}
