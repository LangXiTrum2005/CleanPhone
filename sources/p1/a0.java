package p1;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f47922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f47923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f47924c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.function.IntConsumer, p1.y] */
    public a0(b0 b0Var, Context context) {
        this.f47924c = b0Var;
        this.f47922a = new WeakReference(context);
        ?? r0 = new IntConsumer() { // from class: p1.y
            @Override // java.util.function.IntConsumer
            public final void accept(int i10) {
                b0 b0Var2 = this.f48200a.f47924c;
                if (b0Var2.f47936e0) {
                    return;
                }
                b0Var2.d1(1, 19, Integer.valueOf(i10));
            }
        };
        this.f47923b = r0;
        context.registerDeviceIdChangeListener(new z(b0Var.f47956v.a(b0Var.f47954t, null), 0), r0);
    }

    public static void a(a0 a0Var) {
        Context context = (Context) a0Var.f47922a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(a0Var.f47923b);
    }
}
