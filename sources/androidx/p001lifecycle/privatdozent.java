package androidx.p001lifecycle;

import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ServiceLifecycleDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/privatdozent;", "", "Landroidx/lifecycle/arytenoidectomy;", IronSourceConstants.EVENTS_PROVIDER, "<init>", "(Landroidx/lifecycle/arytenoidectomy;)V", "", "dern", "()V", "saneness", "marial", "wireman", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "beachfront", "(Landroidx/lifecycle/Lifecycle$Event;)V", "Landroidx/lifecycle/polloi;", "attabal", "Landroidx/lifecycle/polloi;", "registry", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/privatdozent$attabal;", "Landroidx/lifecycle/privatdozent$attabal;", "lastDispatchRunnable", "Landroidx/lifecycle/Lifecycle;", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "lifecycle-service"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class privatdozent {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final polloi registry;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public attabal lastDispatchRunnable;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Handler handler;

    /* JADX INFO: compiled from: ServiceLifecycleDispatcher.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/privatdozent$attabal;", "Ljava/lang/Runnable;", "Landroidx/lifecycle/polloi;", "registry", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "<init>", "(Landroidx/lifecycle/polloi;Landroidx/lifecycle/Lifecycle$Event;)V", "", "run", "()V", "kowloon", "Landroidx/lifecycle/polloi;", "arytenoidectomy", "Landroidx/lifecycle/Lifecycle$Event;", "getEvent", "()Landroidx/lifecycle/Lifecycle$Event;", "", "monoploid", "Z", "wasExecuted", "lifecycle-service"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public final Lifecycle.Event event;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final polloi registry;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
        public boolean wasExecuted;

        public attabal(polloi registry, Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            Intrinsics.checkNotNullParameter(event, "event");
            this.registry = registry;
            this.event = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wasExecuted) {
                return;
            }
            this.registry.taiyuan(this.event);
            this.wasExecuted = true;
        }
    }

    public privatdozent(arytenoidectomy provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.registry = new polloi(provider);
        this.handler = new Handler(Looper.getMainLooper());
    }

    public Lifecycle attabal() {
        return this.registry;
    }

    public final void beachfront(Lifecycle.Event event) {
        attabal attabalVar = this.lastDispatchRunnable;
        if (attabalVar != null) {
            attabalVar.run();
        }
        attabal attabalVar2 = new attabal(this.registry, event);
        this.lastDispatchRunnable = attabalVar2;
        this.handler.postAtFrontOfQueue(attabalVar2);
    }

    public void dern() {
        beachfront(Lifecycle.Event.ON_CREATE);
    }

    public void marial() {
        beachfront(Lifecycle.Event.ON_START);
    }

    public void saneness() {
        beachfront(Lifecycle.Event.ON_START);
    }

    public void wireman() {
        beachfront(Lifecycle.Event.ON_STOP);
        beachfront(Lifecycle.Event.ON_DESTROY);
    }
}
