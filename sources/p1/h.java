package p1;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends i1.f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f48037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i1.p f48038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f48039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f2.c0 f48040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f48041i;

    public h(int i10, Exception exc, int i11) {
        this(i10, exc, i11, null, -1, null, 4, null, false);
    }

    public final h a(f2.c0 c0Var) {
        String message = getMessage();
        String str = l1.y.f44830a;
        return new h(message, getCause(), this.f42536a, this.f48035c, this.f48036d, this.f48037e, this.f48038f, this.f48039g, c0Var, this.f42537b, this.f48041i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, Throwable th2, int i10, int i11, String str2, int i12, i1.p pVar, int i13, f2.c0 c0Var, long j10, boolean z10) {
        super(i10, j10, str, th2);
        Bundle bundle = Bundle.EMPTY;
        go.k.i(!z10 || i11 == 1);
        go.k.i(th2 != null || i11 == 3);
        this.f48035c = i11;
        this.f48036d = str2;
        this.f48037e = i12;
        this.f48038f = pVar;
        this.f48039g = i13;
        this.f48040h = c0Var;
        this.f48041i = z10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(int i10, Exception exc, int i11, String str, int i12, i1.p pVar, int i13, f2.c0 c0Var, boolean z10) {
        String str2;
        int i14;
        i1.p pVar2;
        String string;
        String str3;
        if (i10 == 0) {
            str2 = str;
            i14 = i12;
            pVar2 = pVar;
            string = "Source error";
        } else if (i10 != 1) {
            if (i10 != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            str2 = str;
            i14 = i12;
            pVar2 = pVar;
        } else {
            StringBuilder sb2 = new StringBuilder();
            str2 = str;
            sb2.append(str2);
            sb2.append(" error, index=");
            i14 = i12;
            sb2.append(i14);
            sb2.append(", format=");
            pVar2 = pVar;
            sb2.append(pVar2);
            sb2.append(", format_supported=");
            String str4 = l1.y.f44830a;
            if (i13 == 0) {
                str3 = "NO";
            } else if (i13 == 1) {
                str3 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i13 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i13 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i13 == 4) {
                str3 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb2.append(str3);
            string = sb2.toString();
        }
        this(TextUtils.isEmpty(null) ? string : wi.d.h(string, ": null"), exc, i11, i10, str2, i14, pVar2, i13, c0Var, SystemClock.elapsedRealtime(), z10);
    }
}
