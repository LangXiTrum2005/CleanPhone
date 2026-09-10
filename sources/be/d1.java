package be;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d1 extends com.google.gson.t {
    @Override // com.google.gson.t
    public final Object b(ge.a aVar) throws IOException {
        if (aVar.H() == 9) {
            aVar.D();
            return null;
        }
        try {
            int iZ = aVar.z();
            if (iZ <= 255 && iZ >= -128) {
                return Byte.valueOf((byte) iZ);
            }
            StringBuilder sbU = defpackage.e.u(iZ, "Lossy conversion from ", " to byte; at path ");
            sbU.append(aVar.t());
            throw new com.google.gson.m(sbU.toString());
        } catch (NumberFormatException e10) {
            throw new com.google.gson.m(e10);
        }
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            bVar.s();
        } else {
            bVar.y(number.byteValue());
        }
    }
}
