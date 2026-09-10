package androidx.compose.ui.node;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.node.clubfoot, reason: from toString */
/* JADX INFO: compiled from: LookaheadDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/node/clubfoot;", "Landroidx/compose/ui/node/mathsort;", "Landroidx/compose/ui/layout/arytenoidectomy;", "result", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "placeable", "<init>", "(Landroidx/compose/ui/layout/arytenoidectomy;Landroidx/compose/ui/node/LookaheadCapablePlaceable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "kowloon", "Landroidx/compose/ui/layout/arytenoidectomy;", "saneness", "()Landroidx/compose/ui/layout/arytenoidectomy;", "arytenoidectomy", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "attabal", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "oilcan", "()Z", "isValidOwnerScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PlaceableResult implements mathsort {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata and from toString */
    public final LookaheadCapablePlaceable placeable;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata and from toString */
    public final androidx.compose.ui.layout.arytenoidectomy result;

    public PlaceableResult(androidx.compose.ui.layout.arytenoidectomy arytenoidectomyVar, LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.result = arytenoidectomyVar;
        this.placeable = lookaheadCapablePlaceable;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final LookaheadCapablePlaceable getPlaceable() {
        return this.placeable;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceableResult)) {
            return false;
        }
        PlaceableResult placeableResult = (PlaceableResult) other;
        return Intrinsics.wireman(this.result, placeableResult.result) && Intrinsics.wireman(this.placeable, placeableResult.placeable);
    }

    public int hashCode() {
        return (this.result.hashCode() * 31) + this.placeable.hashCode();
    }

    @Override // androidx.compose.ui.node.mathsort
    public boolean oilcan() {
        return this.placeable.sensatory().impassible();
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final androidx.compose.ui.layout.arytenoidectomy getResult() {
        return this.result;
    }

    public String toString() {
        return "PlaceableResult(result=" + this.result + ", placeable=" + this.placeable + ')';
    }
}
