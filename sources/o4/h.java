package o4;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f47123b;

    public /* synthetic */ h() {
        this.f47122a = 2;
    }

    @Override // o4.q
    public final void c(r rVar) {
        switch (this.f47122a) {
            case 0:
                View view = (View) this.f47123b;
                c cVar = y.f47176a;
                view.setTransitionAlpha(1.0f);
                rVar.v(this);
                break;
            case 1:
                ((r) this.f47123b).y();
                rVar.v(this);
                break;
            default:
                w wVar = (w) this.f47123b;
                int i10 = wVar.f47170x - 1;
                wVar.f47170x = i10;
                if (i10 == 0) {
                    wVar.f47171y = false;
                    wVar.m();
                }
                rVar.v(this);
                break;
        }
    }

    @Override // o4.s, o4.q
    public void e(r rVar) {
        switch (this.f47122a) {
            case 2:
                w wVar = (w) this.f47123b;
                if (!wVar.f47171y) {
                    wVar.E();
                    wVar.f47171y = true;
                }
                break;
        }
    }

    public /* synthetic */ h(Object obj, int i10) {
        this.f47122a = i10;
        this.f47123b = obj;
    }
}
