package jj;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class c implements ti.b, ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f43934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xi.f f43935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ui.b f43936c;

    @Override // ui.a
    public final void onAttachedToActivity(ui.b bVar) {
        this.f43936c = bVar;
        fc.f fVar = (fc.f) bVar;
        fVar.b(this.f43934a);
        this.f43934a.f43930b = (Activity) fVar.f40780b;
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a aVar) {
        xi.f fVar = aVar.f50789c;
        Context context = aVar.f50787a;
        d dVar = new d(0);
        this.f43935b = fVar;
        b bVar = new b(context, dVar);
        this.f43934a = bVar;
        b.h(fVar, bVar);
    }

    @Override // ui.a
    public final void onDetachedFromActivity() {
        ((fc.f) this.f43936c).H(this.f43934a);
        this.f43934a.f43930b = null;
        this.f43936c = null;
    }

    @Override // ui.a
    public final void onDetachedFromActivityForConfigChanges() {
        ((fc.f) this.f43936c).H(this.f43934a);
        this.f43934a.f43930b = null;
        this.f43936c = null;
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a aVar) {
        this.f43934a = null;
        xi.f fVar = this.f43935b;
        if (fVar != null) {
            b.h(fVar, null);
            this.f43935b = null;
        }
    }

    @Override // ui.a
    public final void onReattachedToActivityForConfigChanges(ui.b bVar) {
        this.f43936c = bVar;
        fc.f fVar = (fc.f) bVar;
        fVar.b(this.f43934a);
        this.f43934a.f43930b = (Activity) fVar.f40780b;
    }
}
