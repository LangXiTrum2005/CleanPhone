package vm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends xj.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f52657c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f52658d;

    public b(c cVar) {
        this.f52658d = cVar;
    }

    @Override // xj.b
    public final void a() {
        int i10;
        Object[] objArr;
        do {
            i10 = this.f52657c + 1;
            this.f52657c = i10;
            objArr = this.f52658d.f52659a;
            if (i10 >= objArr.length) {
                break;
            }
        } while (objArr[i10] == null);
        if (i10 >= objArr.length) {
            this.f53834a = 2;
            return;
        }
        Object obj = objArr[i10];
        kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
        this.f53835b = obj;
        this.f53834a = 1;
    }
}
