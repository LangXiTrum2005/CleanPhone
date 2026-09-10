package androidx.compose.ui.platform;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/yemenite;", "", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "saneness", "(Landroid/view/View;)V", "attabal", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class yemenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final yemenite f7532attabal = new yemenite();

    public final void attabal(View view) {
        view.clearViewTranslationCallback();
    }

    public final void saneness(View view) {
        view.setViewTranslationCallback(stratoscope.attabal(cuirassed.f7412attabal));
    }
}
