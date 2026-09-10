package sn;

import b2.w;
import bc.i;
import com.google.android.gms.internal.ads.hx0;
import com.google.android.gms.internal.ads.kj1;
import i3.f;
import kotlin.jvm.internal.n;
import tn.g;
import tn.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f50282d = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hx0 f50283a = new hx0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final un.a f50284b = un.b.f52276a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rb.c f50285c = new rb.c(9);

    public final Object a(nn.a deserializer, String str) {
        byte b10;
        n.f(deserializer, "deserializer");
        this.f50283a.getClass();
        f fVar = new f(str);
        Object objK = new kj1(this, j.OBJ, fVar, deserializer.d()).k(deserializer);
        String str2 = (String) fVar.f42856f;
        int i10 = fVar.f42852b;
        while (true) {
            b10 = 10;
            if (i10 != -1 && i10 < str2.length()) {
                int i11 = i10 + 1;
                char cCharAt = str2.charAt(i10);
                if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                    fVar.f42852b = i11;
                    b10 = g.b(cCharAt);
                    break;
                }
                i10 = i11;
            } else {
                fVar.f42852b = str2.length();
                break;
            }
        }
        if (b10 == 10) {
            return objK;
        }
        f.n(fVar, "Expected EOF after parsing, but had " + str.charAt(fVar.f42852b - 1) + " instead", 0, 6);
        throw null;
    }

    public final String b(nn.a serializer, Object obj) {
        char[] cArr;
        n.f(serializer, "serializer");
        w wVar = new w((byte) 0, 21);
        tn.b bVar = tn.b.f51592c;
        synchronized (bVar) {
            xj.j jVar = (xj.j) bVar.f4131b;
            cArr = null;
            char[] cArr2 = (char[]) (jVar.isEmpty() ? null : jVar.removeLast());
            if (cArr2 != null) {
                bVar.f4130a -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        wVar.f5411c = cArr;
        try {
            j jVar2 = j.OBJ;
            f4.a[] aVarArr = new f4.a[j.f51606h.size()];
            this.f50283a.getClass();
            new f4.a(new i(wVar, 13), this, jVar2, aVarArr).i(serializer, obj);
            return wVar.toString();
        } finally {
            wVar.i();
        }
    }
}
