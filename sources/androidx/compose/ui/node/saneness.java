package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusProperties;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: NodeKind.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR$\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/node/saneness;", "Landroidx/compose/ui/focus/FocusProperties;", "<init>", "()V", "", "attabal", "()Z", "", "saneness", "Ljava/lang/Boolean;", "canFocusValue", "value", "impassible", "apical", "(Z)V", "canFocus", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class saneness implements FocusProperties {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final saneness f7034attabal = new saneness();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static Boolean canFocusValue;

    @Override // androidx.compose.ui.focus.FocusProperties
    public void apical(boolean z) {
        canFocusValue = Boolean.valueOf(z);
    }

    public final boolean attabal() {
        return canFocusValue != null;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public boolean impassible() {
        Boolean bool = canFocusValue;
        if (bool != null) {
            return bool.booleanValue();
        }
        peridotite.attabal.dern("canFocus is read before it is written");
        throw new KotlinNothingValueException();
    }

    public final void saneness() {
        canFocusValue = null;
    }
}
