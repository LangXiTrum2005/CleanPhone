package be;

import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class z0 extends com.google.gson.t {
    @Override // com.google.gson.t
    public final Object b(ge.a aVar) throws IOException {
        boolean zX;
        BitSet bitSet = new BitSet();
        aVar.d();
        int iH = aVar.H();
        int i10 = 0;
        while (iH != 2) {
            int iC = v0.i.c(iH);
            if (iC == 5 || iC == 6) {
                int iZ = aVar.z();
                if (iZ == 0) {
                    zX = false;
                } else {
                    if (iZ != 1) {
                        StringBuilder sbU = defpackage.e.u(iZ, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        sbU.append(aVar.t());
                        throw new com.google.gson.m(sbU.toString());
                    }
                    zX = true;
                }
            } else {
                if (iC != 7) {
                    throw new com.google.gson.m("Invalid bitset value type: " + d5.u.z(iH) + "; at path " + aVar.r());
                }
                zX = aVar.x();
            }
            if (zX) {
                bitSet.set(i10);
            }
            i10++;
            iH = aVar.H();
        }
        aVar.o();
        return bitSet;
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        bVar.h();
        int length = bitSet.length();
        for (int i10 = 0; i10 < length; i10++) {
            bVar.y(bitSet.get(i10) ? 1L : 0L);
        }
        bVar.o();
    }
}
