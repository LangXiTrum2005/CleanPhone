package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/FullyDrawnReporter;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FullyDrawnReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f3226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f3227b;
    public boolean d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3228c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f3229e = new ArrayList();

    public FullyDrawnReporter(Executor executor, a aVar) {
        this.f3226a = executor;
        this.f3227b = aVar;
        new d(this, 3);
    }

    public final void a() {
        synchronized (this.f3228c) {
            try {
                this.d = true;
                Iterator it = this.f3229e.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.f3229e.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
