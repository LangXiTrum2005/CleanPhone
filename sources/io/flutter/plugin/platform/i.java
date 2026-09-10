package io.flutter.plugin.platform;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f43325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f43326c;

    public /* synthetic */ i(h hVar, int i10, int i11) {
        this.f43324a = i11;
        this.f43326c = hVar;
        this.f43325b = i10;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.f43324a) {
            case 0:
                n nVar = (n) this.f43326c;
                int i10 = this.f43325b;
                if (!z10) {
                    io.flutter.plugin.editing.j jVar = nVar.f43358g;
                    if (jVar != null) {
                        jVar.b(i10);
                    }
                    break;
                } else {
                    xi.p pVar = (xi.p) nVar.f43359h.f52487a;
                    if (pVar != null) {
                        pVar.a("viewFocused", Integer.valueOf(i10), null);
                        break;
                    }
                }
                break;
            default:
                m mVar = (m) this.f43326c;
                int i11 = this.f43325b;
                if (!z10) {
                    io.flutter.plugin.editing.j jVar2 = mVar.f43341f;
                    if (jVar2 != null) {
                        jVar2.b(i11);
                    }
                    break;
                } else {
                    xi.p pVar2 = (xi.p) mVar.f43342g.f53211a;
                    if (pVar2 != null) {
                        pVar2.a("viewFocused", Integer.valueOf(i11), null);
                        break;
                    }
                }
                break;
        }
    }
}
