package sealless;

import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AutofillCallback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lsealless/gintrap;", "Landroid/view/autofill/AutofillManager$AutofillCallback;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "virtualId", NotificationCompat.CATEGORY_EVENT, "", "onAutofillEvent", "(Landroid/view/View;II)V", "Lsealless/wireman;", "autofill", "attabal", "(Lsealless/wireman;)V", "saneness", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class gintrap extends AutofillManager$AutofillCallback {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final gintrap f37443attabal = new gintrap();

    public final void attabal(wireman autofill) {
        autofill.getAutofillManager().registerCallback(graveside.attabal(this));
    }

    public void onAutofillEvent(View view, int virtualId, int event) {
        super.onAutofillEvent(view, virtualId, event);
    }

    public final void saneness(wireman autofill) {
        autofill.getAutofillManager().unregisterCallback(graveside.attabal(this));
    }
}
