package n1;

import android.net.Uri;
import android.util.Base64;
import i1.e0;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f46358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f46359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f46360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f46361h;

    @Override // n1.h
    public final long C(k kVar) throws i, e0 {
        e();
        this.f46358e = kVar;
        Uri uri = kVar.f46369a;
        long j10 = kVar.f46374f;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        go.k.k("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = l1.y.f44830a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new e0("Unexpected URI format: " + uriNormalizeScheme, null, true, 0);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f46359f = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e10) {
                throw new e0(defpackage.e.n("Error while parsing Base64 encoded string: ", str2), e10, true, 0);
            }
        } else {
            this.f46359f = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j11 = kVar.f46373e;
        byte[] bArr = this.f46359f;
        if (j11 > bArr.length) {
            this.f46359f = null;
            throw new i(2008);
        }
        int i10 = (int) j11;
        this.f46360g = i10;
        int length = bArr.length - i10;
        this.f46361h = length;
        if (j10 != -1) {
            this.f46361h = (int) Math.min(length, j10);
        }
        g(kVar);
        return j10 != -1 ? j10 : this.f46361h;
    }

    @Override // n1.h
    public final void close() {
        if (this.f46359f != null) {
            this.f46359f = null;
            d();
        }
        this.f46358e = null;
    }

    @Override // n1.h
    public final Uri getUri() {
        k kVar = this.f46358e;
        if (kVar != null) {
            return kVar.f46369a;
        }
        return null;
    }

    @Override // i1.i
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f46361h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.f46359f;
        String str = l1.y.f44830a;
        System.arraycopy(bArr2, this.f46360g, bArr, i10, iMin);
        this.f46360g += iMin;
        this.f46361h -= iMin;
        b(iMin);
        return iMin;
    }
}
