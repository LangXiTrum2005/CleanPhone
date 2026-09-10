package xn;

import com.ironsource.B5;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u {
    public static final t a(o oVar, String content) {
        String str;
        kotlin.jvm.internal.n.f(content, "content");
        Charset charsetForName = an.a.f3768a;
        if (oVar != null) {
            Pattern pattern = o.f53998c;
            String[] strArr = oVar.f54001b;
            int iJ = go.k.J(0, strArr.length - 1, 2);
            if (iJ < 0) {
                str = null;
                break;
            }
            int i10 = 0;
            while (true) {
                if (!an.p.i0(strArr[i10], B5.N)) {
                    if (i10 == iJ) {
                        str = null;
                        break;
                    }
                    i10 += 2;
                } else {
                    str = strArr[i10 + 1];
                    break;
                }
            }
            if (str == null) {
                charsetForName = null;
            } else {
                try {
                    charsetForName = Charset.forName(str);
                } catch (IllegalArgumentException unused) {
                    charsetForName = null;
                }
            }
            if (charsetForName == null) {
                charsetForName = an.a.f3768a;
                Pattern pattern2 = o.f53998c;
                oVar = com.google.android.gms.internal.auth.i.B(oVar + "; charset=utf-8");
            }
        }
        byte[] bytes = content.getBytes(charsetForName);
        kotlin.jvm.internal.n.e(bytes, "this as java.lang.String).getBytes(charset)");
        int length = bytes.length;
        yn.a.c(bytes.length, 0, length);
        return new t(oVar, length, bytes);
    }
}
