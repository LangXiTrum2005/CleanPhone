package sealless;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AutofillUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001e\u0010\u001bJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lsealless/molybdenite;", "", "<init>", "()V", "Landroid/view/ViewStructure;", "structure", "Landroid/view/autofill/AutofillId;", "parent", "", "virtualId", "", "competently", "(Landroid/view/ViewStructure;Landroid/view/autofill/AutofillId;I)V", "attabal", "(Landroid/view/ViewStructure;)Landroid/view/autofill/AutofillId;", "type", "impromptu", "(Landroid/view/ViewStructure;I)V", "", "", "hints", "beachfront", "(Landroid/view/ViewStructure;[Ljava/lang/String;)V", "Landroid/view/autofill/AutofillValue;", "value", "", "wireman", "(Landroid/view/autofill/AutofillValue;)Z", "saneness", "dern", "marial", "", "taiyuan", "(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class molybdenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final molybdenite f37445attabal = new molybdenite();

    public final AutofillId attabal(ViewStructure structure) {
        return structure.getAutofillId();
    }

    public final void beachfront(ViewStructure structure, String[] hints) {
        structure.setAutofillHints(hints);
    }

    public final void competently(ViewStructure structure, AutofillId parent, int virtualId) {
        structure.setAutofillId(parent, virtualId);
    }

    public final boolean dern(AutofillValue value) {
        return value.isList();
    }

    public final void impromptu(ViewStructure structure, int type) {
        structure.setAutofillType(type);
    }

    public final boolean marial(AutofillValue value) {
        return value.isToggle();
    }

    public final boolean saneness(AutofillValue value) {
        return value.isDate();
    }

    public final CharSequence taiyuan(AutofillValue value) {
        return value.getTextValue();
    }

    public final boolean wireman(AutofillValue value) {
        return value.isText();
    }
}
