package z;

import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f54594h;

    public k(l lVar) {
        this.f54594h = lVar;
    }

    @Override // z.h
    public final String g() {
        i iVar = (i) this.f54594h.f54595a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f54590a + X3.j.f27836e;
    }
}
