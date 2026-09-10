package be;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c1 extends com.google.gson.t {
    @Override // com.google.gson.t
    public final Object b(ge.a aVar) {
        if (aVar.H() != 9) {
            return Boolean.valueOf(aVar.F());
        }
        aVar.D();
        return null;
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        bVar.B(bool == null ? "null" : bool.toString());
    }
}
