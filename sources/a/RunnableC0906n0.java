package A;

import com.inmobi.media.C3164ob;
import com.inmobi.media.C3259ub;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: A.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0906n0 implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Function1 f3187Y;
    public final /* synthetic */ C3259ub Z;

    public /* synthetic */ RunnableC0906n0(Function1 function1, C3259ub c3259ub, int i2) {
        this.X = i2;
        this.f3187Y = function1;
        this.Z = c3259ub;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.X) {
            case 0:
                C3164ob.a(this.f3187Y, this.Z);
                break;
            case 1:
                C3259ub.a(this.f3187Y, this.Z);
                break;
            default:
                C3259ub.b(this.f3187Y, this.Z);
                break;
        }
    }
}
