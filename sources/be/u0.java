package be;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class u0 extends com.google.gson.t {
    @Override // com.google.gson.t
    public final Object b(ge.a aVar) throws IOException {
        if (aVar.H() == 9) {
            aVar.D();
            return null;
        }
        String strF = aVar.F();
        try {
            return UUID.fromString(strF);
        } catch (IllegalArgumentException e10) {
            StringBuilder sbK = d5.u.k("Failed parsing '", strF, "' as UUID; at path ");
            sbK.append(aVar.t());
            throw new com.google.gson.m(sbK.toString(), e10);
        }
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        UUID uuid = (UUID) obj;
        bVar.B(uuid == null ? null : uuid.toString());
    }
}
