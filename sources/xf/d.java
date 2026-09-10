package xf;

import java.nio.ShortBuffer;
import kotlin.jvm.internal.n;
import qd.i;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements jk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f53790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ShortBuffer f53791c;

    public /* synthetic */ d(i iVar, ShortBuffer shortBuffer, int i10) {
        this.f53789a = i10;
        this.f53790b = iVar;
        this.f53791c = shortBuffer;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f53789a) {
            case 0:
                i this$0 = this.f53790b;
                n.f(this$0, "this$0");
                h2.d dVar = (h2.d) this$0.f48982d;
                dVar.getClass();
                ShortBuffer shortBuffer = this.f53791c;
                shortBuffer.clear();
                dVar.f42079a.add(shortBuffer);
                break;
            default:
                i this$1 = this.f53790b;
                n.f(this$1, "this$0");
                h2.d dVar2 = (h2.d) this$1.f48982d;
                dVar2.getClass();
                ShortBuffer shortBuffer2 = this.f53791c;
                shortBuffer2.clear();
                dVar2.f42079a.add(shortBuffer2);
                break;
        }
        return r.f53297a;
    }
}
