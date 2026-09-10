package aa;

import d5.u;
import defpackage.e;
import java.util.Arrays;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class b extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3448a;

    public /* synthetic */ b(byte b10, int i10) {
        this.f3448a = i10;
    }

    public static b a(int i10, int i11, String str, String str2) {
        return new b(c(i10, i11, str, str2), 10);
    }

    public static b b(int i10, String str, String str2) {
        return new b(c(i10, i10 + 1, str, str2), 10);
    }

    public static String c(int i10, int i11, String str, String str2) {
        if (i11 < 0) {
            i11 = str2.length();
        }
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(": ");
        if (i10 > 8) {
            sb2.append("...");
            sb2.append((CharSequence) str2, i10 - 5, i10);
        } else {
            sb2.append((CharSequence) str2, 0, i10);
        }
        sb2.append('[');
        sb2.append(str2.substring(i10, i11));
        sb2.append(']');
        if (str2.length() - i11 > 8) {
            sb2.append((CharSequence) str2, i11, i11 + 5);
            sb2.append("...");
        } else {
            sb2.append((CharSequence) str2, i11, str2.length());
        }
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f3448a) {
            case 10:
                synchronized (this) {
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, String str, Throwable th2) {
        super(str, th2);
        this.f3448a = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i10) {
        super(str);
        this.f3448a = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, boolean z10) {
        super(str);
        this.f3448a = 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Throwable th2, int i10) {
        super(th2);
        this.f3448a = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10) {
        super(d.k(new StringBuilder(String.valueOf(i10).length() + 3), "r: ", i10));
        this.f3448a = 4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(String str, String[] strArr, String[] strArr2) {
        this.f3448a = 15;
        StringBuilder sbK = u.k("Could not find '", str, "'. Looked for: ");
        sbK.append(Arrays.toString(strArr));
        sbK.append(", but only found: ");
        super(e.q(Arrays.toString(strArr2), ".", sbK));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f3448a = 21;
    }
}
