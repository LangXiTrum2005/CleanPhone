package be;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class m0 extends com.google.gson.t {
    @Override // com.google.gson.t
    public final Object b(ge.a aVar) throws IOException {
        if (aVar.H() == 9) {
            aVar.D();
            return null;
        }
        String strF = aVar.F();
        try {
            ae.i.c(strF);
            return new BigInteger(strF);
        } catch (NumberFormatException e10) {
            StringBuilder sbK = d5.u.k("Failed parsing '", strF, "' as BigInteger; at path ");
            sbK.append(aVar.t());
            throw new com.google.gson.m(sbK.toString(), e10);
        }
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        bVar.A((BigInteger) obj);
    }
}
