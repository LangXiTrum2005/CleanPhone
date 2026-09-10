package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3202cn implements InterfaceC3718ih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4245a;
    public final /* synthetic */ RW b;

    public /* synthetic */ C3202cn(RW rw, int i) {
        this.f4245a = i;
        this.b = rw;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3718ih
    public final Object c(C3274de0 c3274de0) {
        int i = this.f4245a;
        RW rw = this.b;
        switch (i) {
            case 0:
                return new C3379en((Context) c3274de0.a(Context.class), ((C4266ou) c3274de0.a(C4266ou.class)).c(), c3274de0.j(C4710tz.class), c3274de0.c(C3645ho.class), (Executor) c3274de0.e(rw));
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0(rw, c3274de0);
        }
    }
}
