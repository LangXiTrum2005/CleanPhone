package b6;

import android.app.Activity;
import android.content.Context;
import eb.d0;
import fc.f;
import java.util.HashSet;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ti.b, ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f5494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f5495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ui.b f5496c;

    @Override // ui.a
    public final void onAttachedToActivity(ui.b bVar) {
        f fVar = (f) bVar;
        Activity activity = (Activity) fVar.f40780b;
        c cVar = this.f5494a;
        if (cVar != null) {
            cVar.f5499c = activity;
        }
        this.f5496c = bVar;
        fVar.b(cVar);
        ((f) this.f5496c).e(this.f5494a);
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a aVar) {
        Context context = aVar.f50787a;
        this.f5494a = new c(context);
        p pVar = new p(aVar.f50789c, "flutter.baseflow.com/permissions/methods");
        this.f5495b = pVar;
        pVar.b(new d0(context, new rc.d(4), this.f5494a, new e()));
    }

    @Override // ui.a
    public final void onDetachedFromActivity() {
        c cVar = this.f5494a;
        if (cVar != null) {
            cVar.f5499c = null;
        }
        ui.b bVar = this.f5496c;
        if (bVar != null) {
            ((f) bVar).H(cVar);
            ui.b bVar2 = this.f5496c;
            ((HashSet) ((f) bVar2).f40782d).remove(this.f5494a);
        }
        this.f5496c = null;
    }

    @Override // ui.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a aVar) {
        this.f5495b.b(null);
        this.f5495b = null;
    }

    @Override // ui.a
    public final void onReattachedToActivityForConfigChanges(ui.b bVar) {
        onAttachedToActivity(bVar);
    }
}
