package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f4247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2 f4248c;

    public /* synthetic */ a2(r rVar, c2 c2Var, int i10) {
        this.f4246a = i10;
        this.f4247b = rVar;
        this.f4248c = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4246a) {
            case 0:
                r rVar = this.f4247b;
                ArrayList arrayList = rVar.f4456b;
                c2 c2Var = this.f4248c;
                if (arrayList.contains(c2Var)) {
                    int i10 = c2Var.f4271a;
                    View view = c2Var.f4273c.mView;
                    kotlin.jvm.internal.n.e(view, "operation.fragment.mView");
                    defpackage.e.a(i10, view, rVar.f4455a);
                }
                break;
            case 1:
                r this$0 = this.f4247b;
                kotlin.jvm.internal.n.f(this$0, "this$0");
                c2 operation = this.f4248c;
                kotlin.jvm.internal.n.f(operation, "$operation");
                this$0.a(operation);
                break;
            default:
                r rVar2 = this.f4247b;
                ArrayList arrayList2 = rVar2.f4456b;
                c2 c2Var2 = this.f4248c;
                arrayList2.remove(c2Var2);
                rVar2.f4457c.remove(c2Var2);
                break;
        }
    }
}
