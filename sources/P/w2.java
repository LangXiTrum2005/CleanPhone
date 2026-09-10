package p;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o.a f47842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x2 f47843b;

    public w2(x2 x2Var) {
        this.f47843b = x2Var;
        Context context = x2Var.f47854a.getContext();
        CharSequence charSequence = x2Var.f47861h;
        o.a aVar = new o.a();
        aVar.f46880e = 4096;
        aVar.f46882g = 4096;
        aVar.l = null;
        aVar.f46887m = null;
        aVar.f46888n = false;
        aVar.f46889o = false;
        aVar.f46890p = 16;
        aVar.f46884i = context;
        aVar.f46876a = charSequence;
        this.f47842a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        x2 x2Var = this.f47843b;
        Window.Callback callback = x2Var.f47864k;
        if (callback == null || !x2Var.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f47842a);
    }
}
