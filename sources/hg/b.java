package hg;

import com.google.android.gms.internal.ads.n3;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f42349b;

    public b(int i10) {
        this.f42348a = i10;
        switch (i10) {
            case 1:
                this.f42349b = new ArrayList();
                break;
            default:
                this.f42349b = new n3(720, 1280);
                break;
        }
    }

    @Override // hg.c
    public final n3 a(n3 n3Var) {
        switch (this.f42348a) {
            case 0:
                return (n3) this.f42349b;
            default:
                Iterator it = ((ArrayList) this.f42349b).iterator();
                while (it.hasNext()) {
                    n3Var = ((c) it.next()).a(n3Var);
                }
                return n3Var;
        }
    }
}
