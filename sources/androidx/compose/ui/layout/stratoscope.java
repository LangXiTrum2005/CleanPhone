package androidx.compose.ui.layout;

import androidx.compose.ui.unit.LayoutDirection;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: MeasureScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/layout/stratoscope;", "Landroidx/compose/ui/layout/gintrap$attabal;", "", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "<init>", "(ILandroidx/compose/ui/unit/LayoutDirection;)V", "saneness", "I", "marial", "()I", "dern", "Landroidx/compose/ui/unit/LayoutDirection;", "wireman", "()Landroidx/compose/ui/unit/LayoutDirection;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class stratoscope extends gintrap.attabal {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final LayoutDirection parentLayoutDirection;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final int parentWidth;

    public stratoscope(int i, LayoutDirection layoutDirection) {
        this.parentWidth = i;
        this.parentLayoutDirection = layoutDirection;
    }

    @Override // androidx.compose.ui.layout.gintrap.attabal
    /* JADX INFO: renamed from: marial, reason: from getter */
    public int getParentWidth() {
        return this.parentWidth;
    }

    @Override // androidx.compose.ui.layout.gintrap.attabal
    /* JADX INFO: renamed from: wireman, reason: from getter */
    public LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }
}
