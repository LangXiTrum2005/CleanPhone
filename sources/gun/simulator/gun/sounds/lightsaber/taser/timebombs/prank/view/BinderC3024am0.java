package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.am0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC3024am0 extends Binder {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2294Ar f4140a;

    public BinderC3024am0(C2294Ar c2294Ar) {
        this.f4140a = c2294Ar;
    }

    public final void a(C3113bm0 c3113bm0) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Intent intent = c3113bm0.f4188a;
        AbstractServiceC2320Br abstractServiceC2320Br = (AbstractServiceC2320Br) this.f4140a.b;
        abstractServiceC2320Br.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        abstractServiceC2320Br.f2896a.execute(new RunnableC4746uO(abstractServiceC2320Br, intent, taskCompletionSource, 9));
        taskCompletionSource.getTask().addOnCompleteListener(new N5(25), new C2503Is(c3113bm0, 1));
    }
}
