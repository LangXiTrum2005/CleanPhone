package yn;

import an.g;
import com.bumptech.glide.d;
import com.ironsource.X3;
import d0.c;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.b;
import kotlin.jvm.internal.n;
import lo.e;
import lo.h;
import lo.t;
import xj.k;
import xj.o;
import xj.s;
import xn.l;
import xn.m;
import xn.q;
import xn.w;
import xn.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f54560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f54561b = d.F(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f54562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TimeZone f54563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f54564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f54565f;

    static {
        int i10 = 0;
        byte[] bArr = new byte[0];
        f54560a = bArr;
        e eVar = new e();
        eVar.n(0, bArr);
        long j10 = 0;
        f54562c = new x(j10, eVar);
        c(j10, j10, j10);
        h hVar = h.f45638d;
        h[] hVarArr = {jj.d.s("efbbbf"), jj.d.s("feff"), jj.d.s("fffe"), jj.d.s("0000ffff"), jj.d.s("ffff0000")};
        ArrayList arrayListD0 = k.D0(hVarArr);
        s.Y(arrayListD0);
        ArrayList arrayList = new ArrayList(5);
        for (int i11 = 0; i11 < 5; i11++) {
            h hVar2 = hVarArr[i11];
            arrayList.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
        ArrayList arrayListS = o.S(Arrays.copyOf(numArr, numArr.length));
        int i12 = 0;
        int i13 = 0;
        while (i12 < 5) {
            arrayListS.set(o.N(arrayListD0, hVarArr[i12]), Integer.valueOf(i13));
            i12++;
            i13++;
        }
        if (((h) arrayListD0.get(0)).d() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i14 = 0;
        while (i14 < arrayListD0.size()) {
            h prefix = (h) arrayListD0.get(i14);
            int i15 = i14 + 1;
            int i16 = i15;
            while (i16 < arrayListD0.size()) {
                h hVar3 = (h) arrayListD0.get(i16);
                hVar3.getClass();
                n.f(prefix, "prefix");
                if (!hVar3.k(prefix, prefix.d())) {
                    break;
                }
                if (hVar3.d() == prefix.d()) {
                    throw new IllegalArgumentException(("duplicate option: " + hVar3).toString());
                }
                if (((Number) arrayListS.get(i16)).intValue() > ((Number) arrayListS.get(i14)).intValue()) {
                    arrayListD0.remove(i16);
                    arrayListS.remove(i16);
                } else {
                    i16++;
                }
            }
            i14 = i15;
        }
        e eVar2 = new e();
        c.a(0L, eVar2, 0, arrayListD0, 0, arrayListD0.size(), arrayListS);
        int[] iArr = new int[(int) (eVar2.f45637b / ((long) 4))];
        while (!eVar2.exhausted()) {
            iArr[i10] = eVar2.readInt();
            i10++;
        }
        Object[] objArrCopyOf = Arrays.copyOf(hVarArr, 5);
        n.e(objArrCopyOf, "copyOf(this, size)");
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        n.c(timeZone);
        f54563d = timeZone;
        f54564e = new g("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f54565f = an.h.F0(an.h.E0(q.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(m mVar, m other) {
        n.f(mVar, "<this>");
        n.f(other, "other");
        return n.a(mVar.f53992d, other.f53992d) && mVar.f53993e == other.f53993e && n.a(mVar.f53989a, other.f53989a);
    }

    public static final int b(long j10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (j10 < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small.").toString());
    }

    public static final void c(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(Closeable closeable) {
        n.f(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket socket) {
        n.f(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!n.a(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final int f(String str, char c4, int i10, int i11) {
        n.f(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c4) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int g(String str, String str2, int i10, int i11) {
        n.f(str, "<this>");
        while (i10 < i11) {
            if (an.h.r0(str2, str.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final String h(String format, Object... objArr) {
        n.f(format, "format");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator comparator) {
        n.f(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                b bVarA = kotlin.jvm.internal.m.a(strArr2);
                while (bVarA.hasNext()) {
                    if (comparator.compare(str, (String) bVarA.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long j(w wVar) {
        String strB = wVar.f54086f.b("Content-Length");
        if (strB == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strB);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List k(Object... elements) {
        n.f(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(o.Q(Arrays.copyOf(objArr, objArr.length)));
        n.e(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (n.h(cCharAt, 31) <= 0 || n.h(cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int m(String str, int i10, int i11) {
        n.f(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int n(String str, int i10, int i11) {
        n.f(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 != i10) {
                    i12--;
                }
            }
        }
        return i10;
    }

    public static final String[] o(String[] strArr, String[] other, Comparator comparator) {
        n.f(other, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean p(String name) {
        n.f(name, "name");
        return name.equalsIgnoreCase("Authorization") || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
    }

    public static final int q(char c4) {
        if ('0' <= c4 && c4 < ':') {
            return c4 - '0';
        }
        if ('a' <= c4 && c4 < 'g') {
            return c4 - 'W';
        }
        if ('A' > c4 || c4 >= 'G') {
            return -1;
        }
        return c4 - '7';
    }

    public static final int r(lo.g gVar) {
        n.f(gVar, "<this>");
        return (gVar.readByte() & 255) | ((gVar.readByte() & 255) << 16) | ((gVar.readByte() & 255) << 8);
    }

    public static final boolean s(t tVar, int i10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        n.f(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = tVar.timeout().e() ? tVar.timeout().c() - jNanoTime : Long.MAX_VALUE;
        tVar.timeout().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            e eVar = new e();
            while (tVar.l(8192L, eVar) != -1) {
                eVar.skip(eVar.f45637b);
            }
            if (jC == Long.MAX_VALUE) {
                tVar.timeout().a();
                return true;
            }
            tVar.timeout().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                tVar.timeout().a();
                return false;
            }
            tVar.timeout().d(jNanoTime + jC);
            return false;
        } catch (Throwable th2) {
            if (jC == Long.MAX_VALUE) {
                tVar.timeout().a();
            } else {
                tVar.timeout().d(jNanoTime + jC);
            }
            throw th2;
        }
    }

    public static final l t(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fo.b bVar = (fo.b) it.next();
            h hVar = bVar.f41210a;
            h hVar2 = bVar.f41211b;
            String strM = hVar.m();
            String strM2 = hVar2.m();
            arrayList.add(strM);
            arrayList.add(an.h.T0(strM2).toString());
        }
        return new l((String[]) arrayList.toArray(new String[0]));
    }

    public static final String u(m mVar, boolean z10) {
        int i10;
        n.f(mVar, "<this>");
        int i11 = mVar.f53993e;
        String strF = mVar.f53992d;
        if (an.h.q0(strF, ":", false)) {
            strF = defpackage.e.f(']', X3.j.f27834d, strF);
        }
        if (!z10) {
            String scheme = mVar.f53989a;
            n.f(scheme, "scheme");
            if (scheme.equals("http")) {
                i10 = 80;
            } else {
                i10 = scheme.equals("https") ? 443 : -1;
            }
            if (i11 == i10) {
                return strF;
            }
        }
        return strF + ':' + i11;
    }

    public static final List v(List list) {
        n.f(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(xj.n.O0(list));
        n.e(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final int w(String str, int i10) {
        if (str != null) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j10 < 0) {
                    return 0;
                }
                return (int) j10;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String x(String str, int i10, int i11) {
        int iM = m(str, i10, i11);
        String strSubstring = str.substring(iM, n(str, iM, i11));
        n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
