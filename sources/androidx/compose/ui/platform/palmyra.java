package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.ScrollAxisRange;
import java.util.List;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: SemanticsUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Landroidx/compose/ui/platform/palmyra;", "Landroidx/compose/ui/node/mathsort;", "", "semanticsNodeId", "", "allScopes", "", "oldXValue", "oldYValue", "Landroidx/compose/ui/semantics/taiyuan;", "horizontalScrollAxisRange", "verticalScrollAxisRange", "<init>", "(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;Landroidx/compose/ui/semantics/taiyuan;Landroidx/compose/ui/semantics/taiyuan;)V", "kowloon", "I", "wireman", "()I", "arytenoidectomy", "Ljava/util/List;", "getAllScopes", "()Ljava/util/List;", "monoploid", "Ljava/lang/Float;", "saneness", "()Ljava/lang/Float;", "competently", "(Ljava/lang/Float;)V", "polloi", "dern", "impromptu", "molybdenite", "Landroidx/compose/ui/semantics/taiyuan;", "attabal", "()Landroidx/compose/ui/semantics/taiyuan;", "beachfront", "(Landroidx/compose/ui/semantics/taiyuan;)V", "graveside", "marial", "taiyuan", "", "oilcan", "()Z", "isValidOwnerScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class palmyra implements androidx.compose.ui.node.mathsort {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final List<palmyra> allScopes;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public ScrollAxisRange verticalScrollAxisRange;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final int semanticsNodeId;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public ScrollAxisRange horizontalScrollAxisRange;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public Float oldXValue;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public Float oldYValue;

    public palmyra(int i, List<palmyra> list, Float f, Float f2, ScrollAxisRange scrollAxisRange, ScrollAxisRange scrollAxisRange2) {
        this.semanticsNodeId = i;
        this.allScopes = list;
        this.oldXValue = f;
        this.oldYValue = f2;
        this.horizontalScrollAxisRange = scrollAxisRange;
        this.verticalScrollAxisRange = scrollAxisRange2;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final ScrollAxisRange getHorizontalScrollAxisRange() {
        return this.horizontalScrollAxisRange;
    }

    public final void beachfront(ScrollAxisRange scrollAxisRange) {
        this.horizontalScrollAxisRange = scrollAxisRange;
    }

    public final void competently(Float f) {
        this.oldXValue = f;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final Float getOldYValue() {
        return this.oldYValue;
    }

    public final void impromptu(Float f) {
        this.oldYValue = f;
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final ScrollAxisRange getVerticalScrollAxisRange() {
        return this.verticalScrollAxisRange;
    }

    @Override // androidx.compose.ui.node.mathsort
    public boolean oilcan() {
        return this.allScopes.contains(this);
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final Float getOldXValue() {
        return this.oldXValue;
    }

    public final void taiyuan(ScrollAxisRange scrollAxisRange) {
        this.verticalScrollAxisRange = scrollAxisRange;
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final int getSemanticsNodeId() {
        return this.semanticsNodeId;
    }
}
