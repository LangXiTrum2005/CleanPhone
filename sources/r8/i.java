package r8;

import android.util.Base64;
import java.util.Arrays;
import r1.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f49490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o8.d f49491c;

    public i(String str, byte[] bArr, o8.d dVar) {
        this.f49489a = str;
        this.f49490b = bArr;
        this.f49491c = dVar;
    }

    public static s a() {
        s sVar = new s(1);
        sVar.f49340d = o8.d.f47211a;
        return sVar;
    }

    public final i b(o8.d dVar) {
        s sVarA = a();
        sVarA.n(this.f49489a);
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        sVarA.f49340d = dVar;
        sVarA.f49339c = this.f49490b;
        return sVarA.c();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f49489a.equals(iVar.f49489a) && Arrays.equals(this.f49490b, iVar.f49490b) && this.f49491c.equals(iVar.f49491c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f49491c.hashCode() ^ ((((this.f49489a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f49490b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.f49490b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f49489a);
        sb2.append(", ");
        sb2.append(this.f49491c);
        sb2.append(", ");
        return defpackage.e.q(strEncodeToString, ")", sb2);
    }
}
