package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: AndroidTextToolbar.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/AndroidTextToolbar;", "Landroidx/compose/ui/platform/claque;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "<init>", "(Landroid/view/View;)V", "attabal", "Landroid/view/View;", "Landroid/view/ActionMode;", "saneness", "Landroid/view/ActionMode;", "actionMode", "Lmathsort/attabal;", "dern", "Lmathsort/attabal;", "textActionModeCallback", "Landroidx/compose/ui/platform/TextToolbarStatus;", "<set-?>", "wireman", "Landroidx/compose/ui/platform/TextToolbarStatus;", "getStatus", "()Landroidx/compose/ui/platform/TextToolbarStatus;", "status", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidTextToolbar implements claque {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final View view;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public ActionMode actionMode;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final mathsort.attabal textActionModeCallback = new mathsort.attabal(new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidTextToolbar$textActionModeCallback$1
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
            this.this$0.actionMode = null;
        }
    }, null, null, null, null, null, 62, null);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public TextToolbarStatus status = TextToolbarStatus.Hidden;

    public AndroidTextToolbar(View view) {
        this.view = view;
    }
}
