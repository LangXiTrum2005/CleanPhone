package androidx.compose.ui.platform;

import com.ironsource.X3;
import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: GlobalSnapshotManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/GlobalSnapshotManager;", "", "<init>", "()V", "", "saneness", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", X3.i.d0, "dern", "sent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GlobalSnapshotManager {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final GlobalSnapshotManager f7308attabal = new GlobalSnapshotManager();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final AtomicBoolean started = new AtomicBoolean(false);

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final AtomicBoolean sent = new AtomicBoolean(false);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int f7311wireman = 8;

    public final void saneness() {
        if (started.compareAndSet(false, true)) {
            final kotlinx.coroutines.channels.wireman wiremanVarSaneness = kotlinx.coroutines.channels.competently.saneness(1, null, null, 6, null);
            kotlinx.coroutines.cutely.wireman(kotlinx.coroutines.privatdozent.attabal(AndroidUiDispatcher.INSTANCE.saneness()), null, null, new GlobalSnapshotManager$ensureStarted$1(wiremanVarSaneness, null), 3, null);
            androidx.compose.runtime.snapshots.formularize.INSTANCE.apical(new Function1<Object, Unit>() { // from class: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p002kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke2(obj);
                    return Unit.f29295attabal;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object obj) {
                    if (GlobalSnapshotManager.sent.compareAndSet(false, true)) {
                        wiremanVarSaneness.triweekly(Unit.f29295attabal);
                    }
                }
            });
        }
    }
}
