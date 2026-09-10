package rc;

import android.content.Context;
import android.os.UserManager;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
import tb.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements e, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f49534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f49535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tc.b f49536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f49537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f49538e;

    public c(Context context, String str, Set set, tc.b bVar, Executor executor) {
        this.f49534a = new l(new mb.c(context, str));
        this.f49537d = set;
        this.f49538e = executor;
        this.f49536c = bVar;
        this.f49535b = context;
    }

    public final Task a() {
        if (!((UserManager) this.f49535b.getSystemService(UserManager.class)).isUserUnlocked()) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f49538e, new b(this, 0));
    }

    public final void b() {
        if (this.f49537d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!((UserManager) this.f49535b.getSystemService(UserManager.class)).isUserUnlocked()) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f49538e, new b(this, 1));
        }
    }
}
