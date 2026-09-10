package androidx.compose.ui.layout;

import androidx.compose.ui.node.LookaheadCapablePlaceable;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: MeasureScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001JI\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJa\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/monoploid;", "Landroidx/compose/ui/layout/beachfront;", "", "width", "height", "", "Landroidx/compose/ui/layout/attabal;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/gintrap$attabal;", "", "placementBlock", "Landroidx/compose/ui/layout/arytenoidectomy;", "preprohormone", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/arytenoidectomy;", "Landroidx/compose/ui/layout/cuirassed;", "rulers", "polder", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/arytenoidectomy;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface monoploid extends beachfront {

    /* JADX INFO: compiled from: MeasureScope.kt */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R(\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, d2 = {"androidx/compose/ui/layout/monoploid$attabal", "Landroidx/compose/ui/layout/arytenoidectomy;", "", "dern", "()V", "", "attabal", "I", "getWidth", "()I", "width", "saneness", "getHeight", "height", "", "Landroidx/compose/ui/layout/attabal;", "Ljava/util/Map;", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/cuirassed;", "wireman", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "rulers", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal implements arytenoidectomy {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final int width;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final /* synthetic */ monoploid f6755beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final /* synthetic */ Function1<gintrap.attabal, Unit> f6756competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public final Map<androidx.compose.ui.layout.attabal, Integer> alignmentLines;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ int f6758marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final int height;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public final Function1<cuirassed, Unit> rulers;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(int i, int i2, Map<androidx.compose.ui.layout.attabal, Integer> map, Function1<? super cuirassed, Unit> function1, monoploid monoploidVar, Function1<? super gintrap.attabal, Unit> function2) {
            this.f6758marial = i;
            this.f6755beachfront = monoploidVar;
            this.f6756competently = function2;
            this.width = i;
            this.height = i2;
            this.alignmentLines = map;
            this.rulers = function1;
        }

        @Override // androidx.compose.ui.layout.arytenoidectomy
        public void dern() {
            monoploid monoploidVar = this.f6755beachfront;
            if (monoploidVar instanceof LookaheadCapablePlaceable) {
                this.f6756competently.invoke(((LookaheadCapablePlaceable) monoploidVar).getPlacementScope());
            } else {
                this.f6756competently.invoke(new stratoscope(this.f6758marial, this.f6755beachfront.getLayoutDirection()));
            }
        }

        @Override // androidx.compose.ui.layout.arytenoidectomy
        public int getHeight() {
            return this.height;
        }

        @Override // androidx.compose.ui.layout.arytenoidectomy
        public int getWidth() {
            return this.width;
        }

        @Override // androidx.compose.ui.layout.arytenoidectomy
        public Map<androidx.compose.ui.layout.attabal, Integer> saneness() {
            return this.alignmentLines;
        }

        @Override // androidx.compose.ui.layout.arytenoidectomy
        public Function1<cuirassed, Unit> wireman() {
            return this.rulers;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ arytenoidectomy polloi(monoploid monoploidVar, int i, int i2, Map map, Function1 function1, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i3 & 4) != 0) {
            map = seminary.taiyuan();
        }
        return monoploidVar.preprohormone(i, i2, map, function1);
    }

    default arytenoidectomy polder(int width, int height, Map<androidx.compose.ui.layout.attabal, Integer> alignmentLines, Function1<? super cuirassed, Unit> rulers, Function1<? super gintrap.attabal, Unit> placementBlock) {
        if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
            peridotite.attabal.saneness("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new attabal(width, height, alignmentLines, rulers, this, placementBlock);
    }

    default arytenoidectomy preprohormone(int width, int height, Map<androidx.compose.ui.layout.attabal, Integer> alignmentLines, Function1<? super gintrap.attabal, Unit> placementBlock) {
        return polder(width, height, alignmentLines, null, placementBlock);
    }
}
