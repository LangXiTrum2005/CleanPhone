package kb;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements va.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f44579e = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hb.c f44580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f44582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f44583d;

    public l(k kVar, int i10) throws InvalidAlgorithmParameterException {
        this.f44580a = kVar;
        this.f44581b = i10;
        this.f44582c = new byte[0];
        this.f44583d = new byte[0];
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        kVar.q(i10, new byte[0]);
    }

    public final byte[] a(byte[] bArr) {
        byte[] bArr2 = this.f44583d;
        int length = bArr2.length;
        int i10 = this.f44581b;
        hb.c cVar = this.f44580a;
        byte[] bArr3 = this.f44582c;
        return length > 0 ? x7.a.k(bArr3, cVar.q(i10, x7.a.k(bArr, bArr2))) : x7.a.k(bArr3, cVar.q(i10, bArr));
    }

    public l(fb.a aVar) {
        this.f44580a = android.support.v4.media.session.a.k(hb.a.t0(hb.b.b(aVar.f40718b.f40731a), aVar.f40719c));
        fb.d dVar = aVar.f40718b;
        this.f44581b = dVar.f40732b;
        this.f44582c = aVar.f40720d.b();
        if (dVar.f40733c.equals(fb.c.f40728d)) {
            this.f44583d = Arrays.copyOf(f44579e, 1);
        } else {
            this.f44583d = new byte[0];
        }
    }

    public l(fb.f fVar) {
        this.f44580a = new k("HMAC" + fVar.f40738b.f40762d, new SecretKeySpec(((lb.a) fVar.f40739c.f50111a).b(), "HMAC"));
        fb.j jVar = fVar.f40738b;
        this.f44581b = jVar.f40760b;
        this.f44582c = fVar.f40740d.b();
        if (jVar.f40761c.equals(fb.i.f40756d)) {
            this.f44583d = Arrays.copyOf(f44579e, 1);
        } else {
            this.f44583d = new byte[0];
        }
    }
}
