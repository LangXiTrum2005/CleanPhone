package sl;

import na.g;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends al.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f50269c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(g gVar, int i10) {
        super(7);
        this.f50268b = i10;
        this.f50269c = gVar;
    }

    @Override // al.b
    public final void F0(String[] strArr) {
        switch (this.f50268b) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                }
                ((d) this.f50269c.f46631b).f50275d = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                }
                ((d) this.f50269c.f46631b).f50276e = strArr;
                return;
        }
    }
}
