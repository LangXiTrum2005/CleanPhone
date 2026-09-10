package be;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class j0 extends com.google.gson.t {
    @Override // com.google.gson.t
    public final Object b(ge.a aVar) throws IOException {
        if (aVar.H() == 9) {
            aVar.D();
            return null;
        }
        String strF = aVar.F();
        if (strF.length() == 1) {
            return Character.valueOf(strF.charAt(0));
        }
        StringBuilder sbK = d5.u.k("Expecting character, got: ", strF, "; at ");
        sbK.append(aVar.t());
        throw new com.google.gson.m(sbK.toString());
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        Character ch2 = (Character) obj;
        bVar.B(ch2 == null ? null : String.valueOf(ch2));
    }
}
