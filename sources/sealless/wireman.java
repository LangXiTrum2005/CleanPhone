package sealless;

import android.view.View;
import android.view.autofill.AutofillManager;
import com.mbridge.msdk.MBridgeConstans;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AndroidAutofill.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\b\u0010\u0011¨\u0006\u0013"}, d2 = {"Lsealless/wireman;", "Lsealless/impromptu;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lsealless/preprohormone;", "autofillTree", "<init>", "(Landroid/view/View;Lsealless/preprohormone;)V", "attabal", "Landroid/view/View;", "dern", "()Landroid/view/View;", "saneness", "Lsealless/preprohormone;", "()Lsealless/preprohormone;", "Landroid/view/autofill/AutofillManager;", "Landroid/view/autofill/AutofillManager;", "()Landroid/view/autofill/AutofillManager;", "autofillManager", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class wireman implements impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final View view;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final AutofillManager autofillManager;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final preprohormone autofillTree;

    public wireman(View view, preprohormone preprohormoneVar) {
        this.view = view;
        this.autofillTree = preprohormoneVar;
        AutofillManager autofillManagerAttabal = saneness.attabal(view.getContext().getSystemService(attabal.attabal()));
        if (autofillManagerAttabal == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.autofillManager = autofillManagerAttabal;
        view.setImportantForAutofill(1);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final AutofillManager getAutofillManager() {
        return this.autofillManager;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final View getView() {
        return this.view;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final preprohormone getAutofillTree() {
        return this.autofillTree;
    }
}
