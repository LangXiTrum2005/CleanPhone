package cn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i1 extends kotlin.jvm.internal.k implements jk.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6720b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, obj, cls, str, str2, i11);
        this.f6720b = i12;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        switch (this.f6720b) {
            case 0:
                ((j1) this.receiver).j((Throwable) obj);
                break;
            case 1:
                l8.a.d(obj);
                break;
            case 2:
                l8.a.b(obj);
                break;
            case 3:
                l8.a.b(obj);
                break;
            default:
                l8.a.b(obj);
                break;
        }
        return wj.r.f53297a;
    }
}
