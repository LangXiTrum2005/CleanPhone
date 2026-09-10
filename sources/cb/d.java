package cb;

import eb.w;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements va.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f5975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f5976b;

    public d(c cVar, w wVar) {
        this.f5975a = cVar;
        this.f5976b = wVar;
    }

    @Override // va.b
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArrA = this.f5975a.f5974a.a(bArr, bArr2);
        int length = bArr.length;
        return bArrA;
    }

    @Override // va.b
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Iterator it = this.f5976b.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                return ((c) it.next()).f5974a.b(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
