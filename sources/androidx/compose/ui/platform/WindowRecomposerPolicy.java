package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import java.util.concurrent.atomic.AtomicReference;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/WindowRecomposerPolicy;", "", "<init>", "()V", "Landroid/view/View;", "rootView", "Landroidx/compose/runtime/Recomposer;", "attabal", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/platform/deadwork;", "saneness", "Ljava/util/concurrent/atomic/AtomicReference;", "factory", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WindowRecomposerPolicy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final WindowRecomposerPolicy f7379attabal = new WindowRecomposerPolicy();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final AtomicReference<deadwork> factory = new AtomicReference<>(deadwork.INSTANCE.dern());

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int f7380dern = 8;

    public final Recomposer attabal(View rootView) {
        Recomposer recomposerAttabal = factory.get().attabal(rootView);
        WindowRecomposer_androidKt.taiyuan(rootView, recomposerAttabal);
        rootView.addOnAttachStateChangeListener(new attabal(kotlinx.coroutines.cutely.wireman(kotlinx.coroutines.wostteth.f32471kowloon, forkful.impromptu.saneness(rootView.getHandler(), "windowRecomposer cleanup").preterite(), null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(recomposerAttabal, rootView, null), 2, null)));
        return recomposerAttabal;
    }

    /* JADX INFO: compiled from: WindowRecomposer.android.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/WindowRecomposerPolicy$attabal", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.monroe f7382kowloon;

        public attabal(kotlinx.coroutines.monroe monroeVar) {
            this.f7382kowloon = monroeVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            v.removeOnAttachStateChangeListener(this);
            kotlinx.coroutines.monroe.attabal.attabal(this.f7382kowloon, null, 1, null);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
        }
    }
}
