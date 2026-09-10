package y7;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.CancellationSignal;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f54229b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f54228a = i10;
        this.f54229b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f54228a;
        Object obj = this.f54229b;
        switch (i11) {
            case 0:
                h this$0 = (h) obj;
                kotlin.jvm.internal.n.f(this$0, "this$0");
                View viewH = this$0.H(false);
                Dialog dialog = this$0.l;
                if (dialog != null) {
                    dialog.setContentView(viewH);
                }
                n nVar = this$0.A;
                if (nVar != null) {
                    this$0.O(nVar);
                }
                break;
            default:
                ((CancellationSignal) obj).cancel();
                break;
        }
    }
}
