package pm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class u0 implements jk.b {
    @Override // jk.b
    public final Object invoke(Object obj) {
        yl.c cVar = (yl.c) obj;
        if (cVar != null) {
            return Boolean.valueOf(!cVar.equals(wk.l.f53361y));
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
    }
}
