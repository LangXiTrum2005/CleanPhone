package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewStructure;
import com.mbridge.msdk.MBridgeConstans;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/gintrap;", "", "<init>", "()V", "Landroid/view/ViewStructure;", "structure", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "attabal", "(Landroid/view/ViewStructure;Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class gintrap {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final gintrap f7434attabal = new gintrap();

    public final void attabal(ViewStructure structure, View view) {
        structure.setClassName(view.getAccessibilityClassName().toString());
    }
}
