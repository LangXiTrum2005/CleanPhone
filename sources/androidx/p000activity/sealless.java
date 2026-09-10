package androidx.p000activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OnBackPressedCallback.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0006H'¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0014\u0010\u0013R*\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u0005R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/activity/sealless;", "", "", "enabled", "<init>", "(Z)V", "", "remove", "()V", "Landroidx/activity/saneness;", "backEvent", "handleOnBackStarted", "(Landroidx/activity/saneness;)V", "handleOnBackProgressed", "handleOnBackPressed", "handleOnBackCancelled", "Landroidx/activity/dern;", "cancellable", "addCancellable", "(Landroidx/activity/dern;)V", "removeCancellable", "value", "isEnabled", "Z", "()Z", "setEnabled", "Ljava/util/concurrent/CopyOnWriteArrayList;", "cancellables", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function0;", "enabledChangedCallback", "Lkotlin/jvm/functions/Function0;", "getEnabledChangedCallback$activity_release", "()Lkotlin/jvm/functions/Function0;", "setEnabledChangedCallback$activity_release", "(Lkotlin/jvm/functions/Function0;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class sealless {
    private final CopyOnWriteArrayList<dern> cancellables = new CopyOnWriteArrayList<>();
    private Function0<Unit> enabledChangedCallback;
    private boolean isEnabled;

    public sealless(boolean z) {
        this.isEnabled = z;
    }

    public final void addCancellable(dern cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    public final Function0<Unit> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(saneness backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public void handleOnBackStarted(saneness backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    /* JADX INFO: renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((dern) it.next()).cancel();
        }
    }

    public final void removeCancellable(dern cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        Function0<Unit> function0 = this.enabledChangedCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(Function0<Unit> function0) {
        this.enabledChangedCallback = function0;
    }

    public void handleOnBackCancelled() {
    }
}
