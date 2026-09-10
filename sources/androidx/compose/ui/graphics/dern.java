package androidx.compose.ui.graphics;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import supplicat.apical;
import supplicat.formularize;
import supplicat.taiyuan;

/* JADX INFO: compiled from: Outline.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0005\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/dern;", "", "<init>", "()V", "Lsupplicat/taiyuan;", "attabal", "()Lsupplicat/taiyuan;", "bounds", "saneness", "dern", "Landroidx/compose/ui/graphics/dern$attabal;", "Landroidx/compose/ui/graphics/dern$saneness;", "Landroidx/compose/ui/graphics/dern$dern;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class dern {

    /* JADX INFO: compiled from: Outline.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/dern$attabal;", "Landroidx/compose/ui/graphics/dern;", "Landroidx/compose/ui/graphics/Path;", "path", "<init>", "(Landroidx/compose/ui/graphics/Path;)V", "attabal", "Landroidx/compose/ui/graphics/Path;", "saneness", "()Landroidx/compose/ui/graphics/Path;", "Lsupplicat/taiyuan;", "()Lsupplicat/taiyuan;", "bounds", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal extends dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final Path path;

        public attabal(Path path) {
            super(null);
            this.path = path;
        }

        @Override // androidx.compose.ui.graphics.dern
        /* JADX INFO: renamed from: attabal */
        public taiyuan getRect() {
            return this.path.getBounds();
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final Path getPath() {
            return this.path;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.dern$dern, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Outline.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/dern$dern;", "Landroidx/compose/ui/graphics/dern;", "Lsupplicat/apical;", "roundRect", "<init>", "(Lsupplicat/apical;)V", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "attabal", "Lsupplicat/apical;", "saneness", "()Lsupplicat/apical;", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/graphics/Path;", "dern", "()Landroidx/compose/ui/graphics/Path;", "roundRectPath", "Lsupplicat/taiyuan;", "()Lsupplicat/taiyuan;", "bounds", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C0046dern extends dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final apical roundRect;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final Path roundRectPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0046dern(apical apicalVar) {
            super(0 == true ? 1 : 0);
            Path path = null;
            this.roundRect = apicalVar;
            if (!formularize.wireman(apicalVar)) {
                Path pathAttabal = androidx.compose.ui.graphics.saneness.attabal();
                Path.wireman(pathAttabal, apicalVar, null, 2, null);
                path = pathAttabal;
            }
            this.roundRectPath = path;
        }

        @Override // androidx.compose.ui.graphics.dern
        /* JADX INFO: renamed from: attabal */
        public taiyuan getRect() {
            return formularize.dern(this.roundRect);
        }

        /* JADX INFO: renamed from: dern, reason: from getter */
        public final Path getRoundRectPath() {
            return this.roundRectPath;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof C0046dern) && Intrinsics.wireman(this.roundRect, ((C0046dern) other).roundRect);
        }

        public int hashCode() {
            return this.roundRect.hashCode();
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final apical getRoundRect() {
            return this.roundRect;
        }
    }

    /* JADX INFO: compiled from: Outline.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/dern$saneness;", "Landroidx/compose/ui/graphics/dern;", "Lsupplicat/taiyuan;", "rect", "<init>", "(Lsupplicat/taiyuan;)V", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "attabal", "Lsupplicat/taiyuan;", "saneness", "()Lsupplicat/taiyuan;", "bounds", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness extends dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final taiyuan rect;

        public saneness(taiyuan taiyuanVar) {
            super(null);
            this.rect = taiyuanVar;
        }

        @Override // androidx.compose.ui.graphics.dern
        /* JADX INFO: renamed from: attabal, reason: from getter */
        public taiyuan getRect() {
            return this.rect;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof saneness) && Intrinsics.wireman(this.rect, ((saneness) other).rect);
        }

        public int hashCode() {
            return this.rect.hashCode();
        }

        public final taiyuan saneness() {
            return this.rect;
        }
    }

    public /* synthetic */ dern(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: attabal */
    public abstract taiyuan getRect();

    public dern() {
    }
}
