package l1;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f44800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f44801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f44802c;

    public o(p pVar, j2.f fVar, Executor executor) {
        this.f44802c = pVar;
        this.f44800a = new WeakReference(fVar);
        this.f44801b = executor;
    }
}
