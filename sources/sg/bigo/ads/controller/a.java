package sg.bigo.ads.controller;

import android.util.Pair;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.core.g;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f47747a;

    public a(c cVar) {
        this.f47747a = cVar;
    }

    @Override // sg.bigo.ads.controller.e
    public final void a(int i2, int i3, int i4, String str, Pair<sg.bigo.ads.api.b, l> pair) {
        c cVar = this.f47747a;
        if (cVar != null) {
            cVar.a(i2, i3, i4, str, pair);
        }
    }

    @Override // sg.bigo.ads.controller.e
    public final /* bridge */ /* synthetic */ void a(int i2, sg.bigo.ads.api.b bVar, g[] gVarArr) {
        sg.bigo.ads.api.b bVar2 = bVar;
        g[] gVarArr2 = gVarArr;
        c cVar = this.f47747a;
        if (cVar != null) {
            cVar.a(i2, bVar2, gVarArr2);
        }
    }
}
