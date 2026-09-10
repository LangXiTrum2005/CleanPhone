package bd;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;
import mb.g;
import tb.q;
import tb.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements tb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f5585b;

    public /* synthetic */ b(q qVar, int i10) {
        this.f5584a = i10;
        this.f5585b = qVar;
    }

    @Override // tb.d
    public final Object g(s sVar) {
        switch (this.f5584a) {
            case 0:
                return FirebasePerfRegistrar.lambda$getComponents$0(this.f5585b, sVar);
            case 1:
                return RemoteConfigRegistrar.lambda$getComponents$0(this.f5585b, sVar);
            case 2:
                return new rc.c((Context) sVar.a(Context.class), ((g) sVar.a(g.class)).g(), sVar.f(q.a(rc.d.class)), sVar.d(od.b.class), (Executor) sVar.g(this.f5585b));
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.f5585b, sVar);
        }
    }
}
