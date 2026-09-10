package cb;

import eb.j0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import jb.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements va.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final va.b f5971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1 f5972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f5973c;

    public b(va.b bVar, s1 s1Var, byte[] bArr) {
        this.f5971a = bVar;
        this.f5972b = s1Var;
        this.f5973c = bArr;
    }

    @Override // va.b
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        s1 s1Var = this.f5972b;
        s1 s1Var2 = s1.RAW;
        va.b bVar = this.f5971a;
        return s1Var == s1Var2 ? bVar.a(bArr, bArr2) : x7.a.k(this.f5973c, bVar.a(bArr, bArr2));
    }

    @Override // va.b
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        s1 s1Var = this.f5972b;
        s1 s1Var2 = s1.RAW;
        va.b bVar = this.f5971a;
        if (s1Var == s1Var2) {
            return bVar.b(bArr, bArr2);
        }
        if (j0.b(this.f5973c, bArr)) {
            return bVar.b(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
