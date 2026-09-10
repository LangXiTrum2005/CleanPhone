package be;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class i implements com.google.gson.u {
    @Override // com.google.gson.u
    public final com.google.gson.t create(com.google.gson.d dVar, fe.a aVar) {
        Class superclass = aVar.f40809a;
        if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
            return null;
        }
        if (!superclass.isEnum()) {
            superclass = superclass.getSuperclass();
        }
        return new j(superclass);
    }
}
