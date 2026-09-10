package androidx.fragment.app;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4381a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4383c;

    public /* synthetic */ m(y1 y1Var, View view, Rect rect) {
        this.f4382b = view;
        this.f4383c = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4381a) {
            case 0:
                c2 operation = (c2) this.f4382b;
                p this$0 = (p) this.f4383c;
                kotlin.jvm.internal.n.f(operation, "$operation");
                kotlin.jvm.internal.n.f(this$0, "this$0");
                if (g1.J(2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
                }
                operation.c(this$0);
                break;
            default:
                y1.g((View) this.f4382b, (Rect) this.f4383c);
                break;
        }
    }

    public /* synthetic */ m(c2 c2Var, p pVar) {
        this.f4382b = c2Var;
        this.f4383c = pVar;
    }
}
