package k;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f44040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f44041b;

    public b(c cVar, e eVar) {
        this.f44041b = cVar;
        this.f44040a = eVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        c cVar = this.f44041b;
        DialogInterface.OnClickListener onClickListener = cVar.f44055j;
        e eVar = this.f44040a;
        onClickListener.onClick(eVar.f44063b, i10);
        if (cVar.l) {
            return;
        }
        eVar.f44063b.dismiss();
    }
}
