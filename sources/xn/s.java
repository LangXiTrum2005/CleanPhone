package xn;

import com.google.android.gms.internal.measurement.nf;
import java.util.LinkedHashMap;
import java.util.Map;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f54060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f54062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f54063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f54064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f54065f;

    public s(m url, String method, l lVar, u uVar, Map map) {
        kotlin.jvm.internal.n.f(url, "url");
        kotlin.jvm.internal.n.f(method, "method");
        this.f54060a = url;
        this.f54061b = method;
        this.f54062c = lVar;
        this.f54063d = uVar;
        this.f54064e = map;
    }

    public final nf a() {
        nf nfVar = new nf(false);
        nfVar.f23786f = new LinkedHashMap();
        nfVar.f23782b = this.f54060a;
        nfVar.f23783c = this.f54061b;
        nfVar.f23785e = this.f54063d;
        Map map = this.f54064e;
        nfVar.f23786f = map.isEmpty() ? new LinkedHashMap() : b0.Y(map);
        nfVar.f23784d = this.f54062c.m();
        return nfVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.f54061b);
        sb2.append(", url=");
        sb2.append(this.f54060a);
        l lVar = this.f54062c;
        if (lVar.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Object obj : lVar) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    xj.o.V();
                    throw null;
                }
                wj.f fVar = (wj.f) obj;
                String str = (String) fVar.f53283a;
                String str2 = (String) fVar.f53284b;
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i10 = i11;
            }
            sb2.append(']');
        }
        Map map = this.f54064e;
        if (!map.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(map);
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
