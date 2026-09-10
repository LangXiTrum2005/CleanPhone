package androidx.compose.ui.platform;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0002\u0006\bJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy;", "", "Landroidx/compose/ui/platform/AbstractComposeView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lkotlin/Function0;", "", "attabal", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lkotlin/jvm/functions/Function0;", "DisposeOnDetachedFromWindowOrReleasedFromPool", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ViewCompositionStrategy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f7354attabal;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.ViewCompositionStrategy$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$attabal;", "", "<init>", "()V", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "attabal", "()Landroidx/compose/ui/platform/ViewCompositionStrategy;", "Default", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ Companion f7354attabal = new Companion();

        public final ViewCompositionStrategy attabal() {
            return DisposeOnDetachedFromWindowOrReleasedFromPool.f7352saneness;
        }
    }

    Function0<Unit> attabal(AbstractComposeView view);

    /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool;", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "<init>", "()V", "Landroidx/compose/ui/platform/AbstractComposeView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lkotlin/Function0;", "", "attabal", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lkotlin/jvm/functions/Function0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool f7352saneness = new DisposeOnDetachedFromWindowOrReleasedFromPool();

        public static final void dern(AbstractComposeView abstractComposeView) {
            abstractComposeView.marial();
        }

        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public Function0<Unit> attabal(final AbstractComposeView view) {
            final attabal attabalVar = new attabal(view);
            view.addOnAttachStateChangeListener(attabalVar);
            final attendance.saneness sanenessVar = new attendance.saneness() { // from class: androidx.compose.ui.platform.technofreak
                @Override // attendance.saneness
                public final void saneness() {
                    ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.dern(view);
                }
            };
            attendance.attabal.attabal(view, sanenessVar);
            return new Function0<Unit>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.f29295attabal;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    view.removeOnAttachStateChangeListener(attabalVar);
                    attendance.attabal.competently(view, sanenessVar);
                }
            };
        }

        /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$attabal", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class attabal implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final /* synthetic */ AbstractComposeView f7353kowloon;

            public attabal(AbstractComposeView abstractComposeView) {
                this.f7353kowloon = abstractComposeView;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                if (attendance.attabal.beachfront(this.f7353kowloon)) {
                    return;
                }
                this.f7353kowloon.marial();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
            }
        }
    }
}
