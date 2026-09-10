package na;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements i {
    public abstract boolean a(char c4);

    @Override // na.i
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
