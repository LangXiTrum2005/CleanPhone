package n1;

import android.net.Uri;
import com.ironsource.C0375hc;
import com.ironsource.X3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f46368i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f46369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f46371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f46372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f46373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f46374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f46375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f46376h;

    static {
        i1.z.a("media3.datasource");
    }

    public k(Uri uri, int i10, byte[] bArr, Map map, long j10, long j11, String str, int i11) {
        go.k.i(j10 >= 0);
        go.k.i(j10 >= 0);
        go.k.i(j11 > 0 || j11 == -1);
        uri.getClass();
        this.f46369a = uri;
        this.f46370b = i10;
        this.f46371c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f46372d = Collections.unmodifiableMap(new HashMap(map));
        this.f46373e = j10;
        this.f46374f = j11;
        this.f46375g = str;
        this.f46376h = i11;
    }

    public final k a(long j10) {
        long j11 = this.f46374f;
        long j12 = j11 != -1 ? j11 - j10 : -1L;
        if (j10 == 0 && j11 == j12) {
            return this;
        }
        return new k(this.f46369a, this.f46370b, this.f46371c, this.f46372d, this.f46373e + j10, j12, this.f46375g, this.f46376h);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f46370b;
        if (i10 == 1) {
            str = C0375hc.f28788a;
        } else if (i10 == 2) {
            str = C0375hc.f28789b;
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb2.append(str);
        sb2.append(" ");
        sb2.append(this.f46369a);
        sb2.append(", ");
        sb2.append(this.f46373e);
        sb2.append(", ");
        sb2.append(this.f46374f);
        sb2.append(", ");
        sb2.append(this.f46375g);
        sb2.append(", ");
        return l1.d.i(sb2, this.f46376h, X3.j.f27836e);
    }
}
