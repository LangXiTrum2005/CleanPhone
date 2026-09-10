package hb;

import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import l1.d;
import va.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42295a;

    public b(int i10) {
        this.f42295a = i10;
    }

    public static b b(int i10) throws InvalidAlgorithmParameterException {
        if (i10 == 16 || i10 == 32) {
            return new b(i10);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i10 * 8)));
    }

    @Override // va.i
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f42295a == this.f42295a;
    }

    public final int hashCode() {
        return Objects.hash(b.class, Integer.valueOf(this.f42295a));
    }

    public final String toString() {
        return d.i(new StringBuilder("AesCmac PRF Parameters ("), this.f42295a, "-byte key)");
    }
}
