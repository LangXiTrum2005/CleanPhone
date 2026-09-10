package rd;

import td.d;
import wb.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f49568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f49569c;

    public /* synthetic */ a(b bVar, d dVar, int i10) {
        this.f49567a = i10;
        this.f49568b = bVar;
        this.f49569c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f49567a) {
            case 0:
                this.f49568b.a(this.f49569c);
                break;
            default:
                this.f49568b.a(this.f49569c);
                break;
        }
    }
}
