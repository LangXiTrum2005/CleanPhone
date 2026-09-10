package androidx.compose.ui.platform;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/cord;", "", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroidx/compose/ui/draganddrop/competently;", "transferData", "Landroidx/compose/ui/draganddrop/attabal;", "dragShadowBuilder", "", "attabal", "(Landroid/view/View;Landroidx/compose/ui/draganddrop/competently;Landroidx/compose/ui/draganddrop/attabal;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class cord {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final cord f7411attabal = new cord();

    public final boolean attabal(View view, androidx.compose.ui.draganddrop.competently transferData, androidx.compose.ui.draganddrop.attabal dragShadowBuilder) {
        return view.startDragAndDrop(transferData.getClipData(), dragShadowBuilder, transferData.getLocalState(), transferData.getFlags());
    }
}
