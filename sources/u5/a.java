package u5;

import com.adjust.sdk.OnAdidReadListener;
import xi.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements OnAdidReadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f51902b;

    public /* synthetic */ a(int i10, o oVar) {
        this.f51901a = i10;
        this.f51902b = oVar;
    }

    @Override // com.adjust.sdk.OnAdidReadListener
    public final void onAdidRead(String str) {
        switch (this.f51901a) {
            case 0:
                this.f51902b.a(str);
                break;
            default:
                this.f51902b.a(str);
                break;
        }
    }
}
