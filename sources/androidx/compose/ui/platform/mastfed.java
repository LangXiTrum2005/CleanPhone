package androidx.compose.ui.platform;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: ViewRootForTest.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/mastfed;", "Landroidx/compose/ui/node/cultivated;", "marial", "attabal", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface mastfed extends androidx.compose.ui.node.cultivated {

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f7451attabal;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.mastfed$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ViewRootForTest.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R6\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\b\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/mastfed$attabal;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/mastfed;", "", "saneness", "Lkotlin/jvm/functions/Function1;", "attabal", "()Lkotlin/jvm/functions/Function1;", "setOnViewCreatedCallback", "(Lkotlin/jvm/functions/Function1;)V", "getOnViewCreatedCallback$annotations", "onViewCreatedCallback", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ Companion f7451attabal = new Companion();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public static Function1<? super mastfed, Unit> onViewCreatedCallback;

        public final Function1<mastfed, Unit> attabal() {
            return onViewCreatedCallback;
        }
    }
}
