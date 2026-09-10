package com.google.android.gms.internal.measurement;

import com.ironsource.X3;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class mh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f23754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f23756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f23757e;

    public mh(String str, Class cls, boolean z10, boolean z11) {
        char cCharAt = str.charAt(0);
        if ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z')) {
            throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(str));
        }
        for (int i10 = 1; i10 < str.length(); i10++) {
            char cCharAt2 = str.charAt(i10);
            if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '_'))) {
                throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
            }
        }
        this.f23753a = str;
        this.f23754b = cls;
        this.f23755c = z10;
        this.f23756d = z11;
        int iIdentityHashCode = System.identityHashCode(this);
        long j10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            j10 |= 1 << (iIdentityHashCode & 63);
            iIdentityHashCode >>>= 6;
        }
        this.f23757e = j10;
    }

    public void a(Iterator it, yh yhVar) {
        while (it.hasNext()) {
            b(it.next(), yhVar);
        }
    }

    public void b(Object obj, yh yhVar) {
        yhVar.a(obj, this.f23753a);
    }

    public final String toString() {
        String name = getClass().getName();
        String name2 = this.f23754b.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.f23753a;
        StringBuilder sb2 = new StringBuilder(str.length() + length + 1 + 1 + length2 + 1);
        d5.u.r(sb2, name, "/", str, X3.j.f27834d);
        return defpackage.e.q(name2, X3.j.f27836e, sb2);
    }
}
