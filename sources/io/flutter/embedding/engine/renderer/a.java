package io.flutter.embedding.engine.renderer;

import java.util.Iterator;
import mi.g0;
import mi.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43214b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f43213a = i10;
        this.f43214b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, mi.d] */
    @Override // io.flutter.embedding.engine.renderer.i
    public final void c() {
        switch (this.f43213a) {
            case 0:
                ((h) this.f43214b).f43250d = false;
                break;
            case 1:
                mi.e eVar = (mi.e) this.f43214b;
                eVar.f45983a.c();
                eVar.f45990h = false;
                break;
            case 2:
                s sVar = (s) this.f43214b;
                sVar.f46058i = false;
                Iterator it = sVar.f46057h.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).c();
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, mi.d] */
    @Override // io.flutter.embedding.engine.renderer.i
    public final void d() {
        switch (this.f43213a) {
            case 0:
                ((h) this.f43214b).f43250d = true;
                break;
            case 1:
                mi.e eVar = (mi.e) this.f43214b;
                eVar.f45983a.d();
                eVar.f45990h = true;
                eVar.f45991i = true;
                break;
            case 2:
                s sVar = (s) this.f43214b;
                sVar.f46058i = true;
                Iterator it = sVar.f46057h.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).d();
                }
                break;
            default:
                g0 g0Var = (g0) this.f43214b;
                g0Var.f45998a.setAlpha(1.0f);
                h hVar = g0Var.f45999b;
                if (hVar != null) {
                    hVar.f43247a.removeIsDisplayingFlutterUiListener(this);
                }
                break;
        }
    }

    private final void a() {
    }
}
