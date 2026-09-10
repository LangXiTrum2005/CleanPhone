package be;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class s0 extends com.google.gson.t {
    @Override // com.google.gson.t
    public final Object b(ge.a aVar) throws IOException {
        if (aVar.H() == 9) {
            aVar.D();
            return null;
        }
        try {
            String strF = aVar.F();
            if (strF.equals("null")) {
                return null;
            }
            return new URI(strF);
        } catch (URISyntaxException e10) {
            throw new com.google.gson.h(e10);
        }
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        URI uri = (URI) obj;
        bVar.B(uri == null ? null : uri.toASCIIString());
    }
}
