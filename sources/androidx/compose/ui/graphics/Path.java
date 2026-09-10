package androidx.compose.ui.graphics;

import p002kotlin.Metadata;
import supplicat.apical;
import supplicat.taiyuan;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001dJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "", "Lsupplicat/taiyuan;", "rect", "Landroidx/compose/ui/graphics/Path$Direction;", "direction", "", "competently", "(Lsupplicat/taiyuan;Landroidx/compose/ui/graphics/Path$Direction;)V", "Lsupplicat/apical;", "roundRect", "marial", "(Lsupplicat/apical;Landroidx/compose/ui/graphics/Path$Direction;)V", "reset", "()V", "dern", "getBounds", "()Lsupplicat/taiyuan;", "path1", "path2", "Landroidx/compose/ui/graphics/marial;", "operation", "", "beachfront", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "attabal", "()Z", "isConvex", "isEmpty", "Direction", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Path {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f6464attabal;

    /* JADX INFO: compiled from: Path.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/Path$Direction;", "", "(Ljava/lang/String;I)V", "CounterClockwise", "Clockwise", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Direction {
        CounterClockwise,
        Clockwise
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.Path$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Path.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/Path$attabal;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ Companion f6464attabal = new Companion();
    }

    static /* synthetic */ void saneness(Path path, taiyuan taiyuanVar, Direction direction, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
        }
        if ((i & 2) != 0) {
            direction = Direction.CounterClockwise;
        }
        path.competently(taiyuanVar, direction);
    }

    static /* synthetic */ void wireman(Path path, apical apicalVar, Direction direction, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
        }
        if ((i & 2) != 0) {
            direction = Direction.CounterClockwise;
        }
        path.marial(apicalVar, direction);
    }

    boolean attabal();

    boolean beachfront(Path path1, Path path2, int operation);

    void competently(taiyuan rect, Direction direction);

    default void dern() {
        reset();
    }

    taiyuan getBounds();

    boolean isEmpty();

    void marial(apical roundRect, Direction direction);

    void reset();
}
