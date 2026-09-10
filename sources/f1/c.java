package f1;

import androidx.fragment.app.j1;
import androidx.lifecycle.x0;
import bc.i;
import x.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class c extends x0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j1 f40267f = new j1(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f40268d = new j();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f40269e = false;

    @Override // androidx.lifecycle.x0
    public final void b() {
        j jVar = this.f40268d;
        int i10 = jVar.f53509c;
        for (int i11 = 0; i11 < i10; i11++) {
            b bVar = (b) jVar.f53508b[i11];
            g9.d dVar = bVar.l;
            dVar.a();
            dVar.f41753c = true;
            i iVar = bVar.f40266n;
            if (iVar != null) {
                bVar.i(iVar);
            }
            b bVar2 = dVar.f41751a;
            if (bVar2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (bVar2 != bVar) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            dVar.f41751a = null;
            if (iVar != null) {
                boolean z10 = iVar.f5552b;
            }
            dVar.f41754d = true;
            dVar.f41752b = false;
            dVar.f41753c = false;
            dVar.f41755e = false;
        }
        int i12 = jVar.f53509c;
        Object[] objArr = jVar.f53508b;
        for (int i13 = 0; i13 < i12; i13++) {
            objArr[i13] = null;
        }
        jVar.f53509c = 0;
    }
}
