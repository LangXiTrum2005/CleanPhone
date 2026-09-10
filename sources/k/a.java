package k;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import p.s2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44038b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f44037a = i10;
        this.f44038b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        switch (this.f44037a) {
            case 0:
                e eVar = (e) this.f44038b;
                Message messageObtain = (view != eVar.f44070i || (message = eVar.f44072k) == null) ? null : Message.obtain(message);
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                eVar.f44086z.obtainMessage(1, eVar.f44063b).sendToTarget();
                break;
            case 1:
                ((n.a) this.f44038b).b();
                break;
            default:
                s2 s2Var = ((Toolbar) this.f44038b).L;
                o.o oVar = s2Var == null ? null : s2Var.f47809b;
                if (oVar != null) {
                    oVar.collapseActionView();
                }
                break;
        }
    }
}
