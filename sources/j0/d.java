package j0;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f43555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f43556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f43557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f43558e;

    public /* synthetic */ d(String str, Context context, Object obj, int i10, int i11) {
        this.f43554a = i11;
        this.f43555b = str;
        this.f43556c = context;
        this.f43558e = obj;
        this.f43557d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f43554a) {
            case 0:
                return g.b(this.f43556c, List.of((c) this.f43558e), this.f43555b, this.f43557d);
            default:
                try {
                    return g.b(this.f43556c, (ArrayList) this.f43558e, this.f43555b, this.f43557d);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
