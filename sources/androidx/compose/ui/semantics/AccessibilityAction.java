package androidx.compose.ui.semantics;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.beachfront;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.attabal, reason: from toString */
/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000*\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0004B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/semantics/attabal;", "Lpatroclinal/beachfront;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "label", "action", "<init>", "(Ljava/lang/String;Lpatroclinal/beachfront;)V", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "attabal", "Ljava/lang/String;", "saneness", "Lpatroclinal/beachfront;", "()Lpatroclinal/beachfront;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AccessibilityAction<T extends patroclinal.beachfront<? extends Boolean>> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public final String label;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final T action;

    public AccessibilityAction(String str, T t) {
        this.label = str;
        this.action = t;
    }

    public final T attabal() {
        return this.action;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction = (AccessibilityAction) other;
        return Intrinsics.wireman(this.label, accessibilityAction.label) && Intrinsics.wireman(this.action, accessibilityAction.action);
    }

    public int hashCode() {
        String str = this.label;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        T t = this.action;
        return iHashCode + (t != null ? t.hashCode() : 0);
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }
}
