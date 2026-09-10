package be;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b1 extends com.google.gson.t {
    @Override // com.google.gson.t
    public final Object b(ge.a aVar) throws IOException {
        int iH = aVar.H();
        if (iH != 9) {
            return iH == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.F())) : Boolean.valueOf(aVar.x());
        }
        aVar.D();
        return null;
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        bVar.z((Boolean) obj);
    }
}
