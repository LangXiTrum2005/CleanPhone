package o4;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f47126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f47127b;

    public k(View view, ArrayList arrayList) {
        this.f47126a = view;
        this.f47127b = arrayList;
    }

    @Override // o4.q
    public final void c(r rVar) {
        rVar.v(this);
        this.f47126a.setVisibility(8);
        ArrayList arrayList = this.f47127b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((View) arrayList.get(i10)).setVisibility(0);
        }
    }

    @Override // o4.q
    public final void e(r rVar) {
        rVar.v(this);
        rVar.a(this);
    }

    @Override // o4.q
    public final void a() {
    }

    @Override // o4.q
    public final void b() {
    }

    @Override // o4.q
    public final void d() {
    }
}
