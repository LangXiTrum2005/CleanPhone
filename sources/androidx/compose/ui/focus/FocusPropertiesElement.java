package androidx.compose.ui.focus;

import androidx.compose.ui.node.kattegat;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FocusProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesElement;", "Landroidx/compose/ui/node/kattegat;", "Landroidx/compose/ui/focus/kowloon;", "Landroidx/compose/ui/focus/arytenoidectomy;", "scope", "<init>", "(Landroidx/compose/ui/focus/arytenoidectomy;)V", "graveside", "()Landroidx/compose/ui/focus/kowloon;", "node", "", "adultoid", "(Landroidx/compose/ui/focus/kowloon;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "saneness", "Landroidx/compose/ui/focus/arytenoidectomy;", "getScope", "()Landroidx/compose/ui/focus/arytenoidectomy;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class FocusPropertiesElement extends kattegat<kowloon> {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final arytenoidectomy scope;

    public FocusPropertiesElement(arytenoidectomy arytenoidectomyVar) {
        this.scope = arytenoidectomyVar;
    }

    @Override // androidx.compose.ui.node.kattegat
    /* JADX INFO: renamed from: adultoid, reason: merged with bridge method [inline-methods] */
    public void molybdenite(kowloon node) {
        node.underbelly(this.scope);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FocusPropertiesElement) && Intrinsics.wireman(this.scope, ((FocusPropertiesElement) other).scope);
    }

    @Override // androidx.compose.ui.node.kattegat
    /* JADX INFO: renamed from: graveside, reason: merged with bridge method [inline-methods] */
    public kowloon polloi() {
        return new kowloon(this.scope);
    }

    public int hashCode() {
        return this.scope.hashCode();
    }

    public String toString() {
        return "FocusPropertiesElement(scope=" + this.scope + ')';
    }
}
