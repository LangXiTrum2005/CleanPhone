package i6;

import a7.p;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f42895a;

    public c(int i10) {
        switch (i10) {
            case 1:
                char[] cArr = p.f3444a;
                this.f42895a = new ArrayDeque(0);
                break;
            default:
                this.f42895a = new ArrayDeque();
                break;
        }
    }

    public synchronized void a(d6.c cVar) {
        cVar.f38734b = null;
        cVar.f38735c = null;
        this.f42895a.offer(cVar);
    }
}
