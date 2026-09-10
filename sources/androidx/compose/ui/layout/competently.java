package androidx.compose.ui.layout;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: LayoutCoordinates.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\"\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ.\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00138&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/competently;", "", "Lsupplicat/competently;", "relativeToLocal", "adultoid", "(J)J", "starveling", "sourceCoordinates", "relativeToSource", "cutely", "(Landroidx/compose/ui/layout/competently;J)J", "", "includeMotionFrameOfReference", "marial", "(Landroidx/compose/ui/layout/competently;JZ)J", "clipBounds", "Lsupplicat/taiyuan;", "stratoscope", "(Landroidx/compose/ui/layout/competently;Z)Lsupplicat/taiyuan;", "Lmilliradian/monoploid;", "triweekly", "()J", "size", "supplicat", "()Landroidx/compose/ui/layout/competently;", "parentLayoutCoordinates", "impassible", "()Z", "isAttached", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface competently {
    static /* synthetic */ supplicat.taiyuan beachfront(competently competentlyVar, competently competentlyVar2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localBoundingBoxOf");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return competentlyVar.stratoscope(competentlyVar2, z);
    }

    long adultoid(long relativeToLocal);

    long cutely(competently sourceCoordinates, long relativeToSource);

    boolean impassible();

    default long marial(competently sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
    }

    long starveling(long relativeToLocal);

    supplicat.taiyuan stratoscope(competently sourceCoordinates, boolean clipBounds);

    competently supplicat();

    long triweekly();
}
