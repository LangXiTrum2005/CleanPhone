package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.semantics.SemanticsNode;
import com.ironsource.Y3;
import milliradian.kowloon;
import p002kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.taiyuan, reason: from toString */
/* JADX INFO: compiled from: ScrollCapture.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u000f\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/scrollcapture/taiyuan;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "", "depth", "Lmilliradian/kowloon;", "viewportBoundsInWindow", "Landroidx/compose/ui/layout/competently;", Y3.f, "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;ILmilliradian/kowloon;Landroidx/compose/ui/layout/competently;)V", "", "toString", "()Ljava/lang/String;", "attabal", "Landroidx/compose/ui/semantics/SemanticsNode;", "dern", "()Landroidx/compose/ui/semantics/SemanticsNode;", "saneness", "I", "()I", "Lmilliradian/kowloon;", "wireman", "()Lmilliradian/kowloon;", "Landroidx/compose/ui/layout/competently;", "()Landroidx/compose/ui/layout/competently;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScrollCaptureCandidate {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public final SemanticsNode node;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    public final kowloon viewportBoundsInWindow;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final int depth;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata and from toString */
    public final androidx.compose.ui.layout.competently coordinates;

    public ScrollCaptureCandidate(SemanticsNode semanticsNode, int i, kowloon kowloonVar, androidx.compose.ui.layout.competently competentlyVar) {
        this.node = semanticsNode;
        this.depth = i;
        this.viewportBoundsInWindow = kowloonVar;
        this.coordinates = competentlyVar;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final androidx.compose.ui.layout.competently getCoordinates() {
        return this.coordinates;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final SemanticsNode getNode() {
        return this.node;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    public String toString() {
        return "ScrollCaptureCandidate(node=" + this.node + ", depth=" + this.depth + ", viewportBoundsInWindow=" + this.viewportBoundsInWindow + ", coordinates=" + this.coordinates + ')';
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final kowloon getViewportBoundsInWindow() {
        return this.viewportBoundsInWindow;
    }
}
