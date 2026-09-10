package co;

import an.p;
import cc.a2;
import com.applovin.shadow.okhttp3.internal.http.DatesKt;
import com.ironsource.B5;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.n;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import xj.v;
import xn.j;
import xn.l;
import xn.m;
import xn.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    static {
        lo.h hVar = lo.h.f45638d;
        jj.d.v("\"\\");
        jj.d.v("\t ,=");
    }

    public static final boolean a(w wVar) {
        if (n.a(wVar.f54081a.f54061b, "HEAD")) {
            return false;
        }
        int i10 = wVar.f54084d;
        return (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && yn.a.j(wVar) == -1 && !"chunked".equalsIgnoreCase(w.a("Transfer-Encoding", wVar))) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(xn.b bVar, m url, l headers) {
        List list;
        int i10;
        j jVar;
        long j10;
        n.f(bVar, "<this>");
        n.f(url, "url");
        n.f(headers, "headers");
        if (bVar == xn.b.f53928b) {
            return;
        }
        Pattern pattern = j.f53971j;
        int size = headers.size();
        int i11 = 0;
        ArrayList arrayList = null;
        for (int i12 = 0; i12 < size; i12++) {
            if ("Set-Cookie".equalsIgnoreCase(headers.h(i12))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(headers.q(i12));
            }
        }
        List listUnmodifiableList = v.f53866a;
        if (arrayList != null) {
            List listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
            n.e(listUnmodifiableList2, "{\n      Collections.unmodifiableList(result)\n    }");
            list = listUnmodifiableList2;
        } else {
            list = listUnmodifiableList;
        }
        int size2 = list.size();
        int i13 = 0;
        ArrayList arrayList2 = null;
        while (i13 < size2) {
            String setCookie = (String) list.get(i13);
            n.f(setCookie, "setCookie");
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = yn.a.f54560a;
            char c4 = ';';
            int iF = yn.a.f(setCookie, ';', i11, setCookie.length());
            char c5 = B5.U;
            int iF2 = yn.a.f(setCookie, B5.U, i11, iF);
            if (iF2 == iF) {
                i10 = i11;
                jVar = null;
                break;
            }
            String strX = yn.a.x(setCookie, i11, iF2);
            if (strX.length() == 0 || yn.a.l(strX) != -1) {
                i10 = i11;
                jVar = null;
                break;
            }
            String strX2 = yn.a.x(setCookie, iF2 + 1, iF);
            if (yn.a.l(strX2) != -1) {
                i10 = i11;
            } else {
                int i14 = iF + 1;
                int length = setCookie.length();
                int i15 = i11;
                int i16 = i15;
                int i17 = i16;
                long j11 = -1;
                long jF = 253402300799999L;
                String str = null;
                String str2 = null;
                boolean z10 = true;
                while (true) {
                    if (i14 < length) {
                        int iF3 = yn.a.f(setCookie, c4, i14, length);
                        int iF4 = yn.a.f(setCookie, c5, i14, iF3);
                        String strX3 = yn.a.x(setCookie, i14, iF4);
                        String strX4 = iF4 < iF3 ? yn.a.x(setCookie, iF4 + 1, iF3) : "";
                        if (strX3.equalsIgnoreCase("expires")) {
                            try {
                                jF = a2.F(strX4.length(), strX4);
                                i16 = 1;
                            } catch (NumberFormatException | IllegalArgumentException unused) {
                            }
                        } else if (strX3.equalsIgnoreCase("max-age")) {
                            try {
                                long j12 = Long.parseLong(strX4);
                                j11 = j12 <= 0 ? Long.MIN_VALUE : j12;
                            } catch (NumberFormatException e10) {
                                Pattern patternCompile = Pattern.compile("-?\\d+");
                                n.e(patternCompile, "compile(...)");
                                if (!patternCompile.matcher(strX4).matches()) {
                                    throw e10;
                                }
                                j11 = p.p0(strX4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                            }
                            i16 = 1;
                        } else if (strX3.equalsIgnoreCase(X3.j.D)) {
                            if (p.h0(strX4, ".", false)) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            String strO = x7.a.O(an.h.E0(strX4, "."));
                            if (strO == null) {
                                throw new IllegalArgumentException();
                            }
                            str2 = strO;
                            z10 = false;
                        } else if (strX3.equalsIgnoreCase("path")) {
                            str = strX4;
                        } else if (strX3.equalsIgnoreCase("secure")) {
                            i17 = 1;
                        } else if (strX3.equalsIgnoreCase("httponly")) {
                            i15 = 1;
                        }
                        i14 = iF3 + 1;
                        c4 = ';';
                        c5 = B5.U;
                    } else {
                        if (j11 == Long.MIN_VALUE) {
                            j10 = Long.MIN_VALUE;
                        } else if (j11 != -1) {
                            long j13 = jCurrentTimeMillis + (j11 <= 9223372036854775L ? j11 * ((long) 1000) : Long.MAX_VALUE);
                            j10 = (j13 < jCurrentTimeMillis || j13 > DatesKt.MAX_DATE) ? 253402300799999L : j13;
                        } else {
                            j10 = jF;
                        }
                        String str3 = url.f53992d;
                        if (str2 == null) {
                            str2 = str3;
                        } else {
                            if (n.a(str3, str2) || (p.h0(str3, str2, false) && str3.charAt((str3.length() - str2.length()) - 1) == '.' && !yn.a.f54564e.a(str3))) {
                            }
                            i10 = 0;
                        }
                        if (str3.length() == str2.length() || PublicSuffixDatabase.f47559g.a(str2) != null) {
                            String strSubstring = "/";
                            i10 = 0;
                            if (str == null || !p.p0(str, "/", false)) {
                                String strB = url.b();
                                int iB0 = an.h.B0(strB, '/', 0, 6);
                                if (iB0 != 0) {
                                    strSubstring = strB.substring(0, iB0);
                                    n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                }
                                str = strSubstring;
                            }
                            jVar = new j(strX, strX2, j10, str2, str, i17, i15, i16, z10);
                            break;
                        }
                        i10 = 0;
                    }
                }
            }
            jVar = null;
            break;
            if (jVar != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(jVar);
            }
            i13++;
            i11 = i10;
        }
        if (arrayList2 != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            n.e(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
        }
        listUnmodifiableList.isEmpty();
    }
}
