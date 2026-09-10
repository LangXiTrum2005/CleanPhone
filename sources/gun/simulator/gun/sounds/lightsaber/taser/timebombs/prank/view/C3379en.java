package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.en, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3379en implements InterfaceC4798uz, InterfaceC4886vz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AW f4338a;
    public final Context b;
    public final AW c;
    public final Set d;
    public final Executor e;

    public C3379en(Context context, String str, Set set, AW aw, Executor executor) {
        this.f4338a = new C3914ku(context, str);
        this.d = set;
        this.e = executor;
        this.c = aw;
        this.b = context;
    }

    public final synchronized int a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C5062xz c5062xz = (C5062xz) this.f4338a.get();
        if (!c5062xz.i(jCurrentTimeMillis)) {
            return 1;
        }
        c5062xz.g();
        return 3;
    }

    public final Task b() {
        if (!UserManagerCompat.isUserUnlocked(this.b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.e, new CallableC3291dn(this, 0));
    }

    public final void c() {
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!UserManagerCompat.isUserUnlocked(this.b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.e, new CallableC3291dn(this, 1));
        }
    }
}
