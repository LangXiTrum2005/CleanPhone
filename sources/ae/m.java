package ae;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3513f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(q qVar, int i10) {
        super(qVar);
        this.f3513f = i10;
    }

    @Override // ae.o, java.util.Iterator
    public Object next() {
        switch (this.f3513f) {
            case 1:
                return a().f3526f;
            default:
                return super.next();
        }
    }
}
