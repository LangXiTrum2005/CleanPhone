package hydrosulfurous;

import com.ironsource.sdk.controller.f;
import com.unity3d.ads.BuildConfig;
import java.util.concurrent.Executor;
import kotlinx.coroutines.merc;
import kotlinx.coroutines.sensatory;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import pigboat.trm;
import pigboat.yemenite;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0014\u001a\u00060\u0005j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0014\u001a\u00060\u0005j\u0002`\u0013H\u0017¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lhydrosulfurous/attabal;", "Lkotlinx/coroutines/sensatory;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "Ljava/lang/Runnable;", f.b.g, "", "execute", "(Ljava/lang/Runnable;)V", "", "parallelism", "", "name", "Lkotlinx/coroutines/merc;", "sayid", "(ILjava/lang/String;)Lkotlinx/coroutines/merc;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/Runnable;", "block", "itchy", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "lerp", "close", "toString", "()Ljava/lang/String;", "polloi", "Lkotlinx/coroutines/merc;", BuildConfig.FLAVOR, "czestochowa", "()Ljava/util/concurrent/Executor;", "executor", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class attabal extends sensatory implements Executor {

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final attabal f28322monoploid = new attabal();

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public static final merc default = merc.coi(cutely.f28326arytenoidectomy, yemenite.marial("kotlinx.coroutines.io.parallelism", p002kotlin.ranges.wireman.wireman(64, trm.attabal()), 0, 0, 12, null), null, 2, null);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        itchy(EmptyCoroutineContext.INSTANCE, command);
    }

    @Override // kotlinx.coroutines.merc
    public void itchy(CoroutineContext context, Runnable block) {
        default.itchy(context, block);
    }

    @Override // kotlinx.coroutines.merc
    public void lerp(CoroutineContext context, Runnable block) {
        default.lerp(context, block);
    }

    @Override // kotlinx.coroutines.merc
    public merc sayid(int parallelism, String name) {
        return cutely.f28326arytenoidectomy.sayid(parallelism, name);
    }

    @Override // kotlinx.coroutines.merc
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return "Dispatchers.IO";
    }

    @Override // kotlinx.coroutines.sensatory
    /* JADX INFO: renamed from: czestochowa */
    public Executor getExecutor() {
        return this;
    }
}
