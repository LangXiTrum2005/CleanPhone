package androidx.compose.ui.graphics;

import android.graphics.RectF;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import supplicat.apical;
import supplicat.taiyuan;

/* JADX INFO: compiled from: AndroidPath.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010-\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0014\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/ui/graphics/attabal;", "Landroidx/compose/ui/graphics/Path;", "Landroid/graphics/Path;", "internalPath", "<init>", "(Landroid/graphics/Path;)V", "Lsupplicat/taiyuan;", "rect", "", "taiyuan", "(Lsupplicat/taiyuan;)V", "Landroidx/compose/ui/graphics/Path$Direction;", "direction", "competently", "(Lsupplicat/taiyuan;Landroidx/compose/ui/graphics/Path$Direction;)V", "Lsupplicat/apical;", "roundRect", "marial", "(Lsupplicat/apical;Landroidx/compose/ui/graphics/Path$Direction;)V", "reset", "()V", "dern", "getBounds", "()Lsupplicat/taiyuan;", "path1", "path2", "Landroidx/compose/ui/graphics/marial;", "operation", "", "beachfront", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "saneness", "Landroid/graphics/Path;", "impromptu", "()Landroid/graphics/Path;", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "rectF", "", "wireman", "[F", "radii", "attabal", "()Z", "isConvex$annotations", "isConvex", "isEmpty", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal implements Path {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public RectF rectF;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final android.graphics.Path internalPath;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public float[] radii;

    public attabal(android.graphics.Path path) {
        this.internalPath = path;
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean attabal() {
        return this.internalPath.isConvex();
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean beachfront(Path path1, Path path2, int operation) {
        android.graphics.Path.Op op;
        marial.Companion companion = marial.INSTANCE;
        if (marial.competently(operation, companion.attabal())) {
            op = android.graphics.Path.Op.DIFFERENCE;
        } else if (marial.competently(operation, companion.saneness())) {
            op = android.graphics.Path.Op.INTERSECT;
        } else if (marial.competently(operation, companion.dern())) {
            op = android.graphics.Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = marial.competently(operation, companion.wireman()) ? android.graphics.Path.Op.UNION : android.graphics.Path.Op.XOR;
        }
        android.graphics.Path path = this.internalPath;
        if (!(path1 instanceof attabal)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path internalPath = ((attabal) path1).getInternalPath();
        if (path2 instanceof attabal) {
            return path.op(internalPath, ((attabal) path2).getInternalPath(), op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.Path
    public void competently(taiyuan rect, Path.Direction direction) {
        taiyuan(rect);
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        Intrinsics.beachfront(rectF);
        rectF.set(rect.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String(), rect.getTop(), rect.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String(), rect.getBottom());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        Intrinsics.beachfront(rectF2);
        path.addRect(rectF2, saneness.wireman(direction));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void dern() {
        this.internalPath.rewind();
    }

    @Override // androidx.compose.ui.graphics.Path
    public taiyuan getBounds() {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        Intrinsics.beachfront(rectF);
        this.internalPath.computeBounds(rectF, true);
        return new taiyuan(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final android.graphics.Path getInternalPath() {
        return this.internalPath;
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void marial(apical roundRect, Path.Direction direction) {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        Intrinsics.beachfront(rectF);
        rectF.set(roundRect.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String(), roundRect.getTop(), roundRect.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String(), roundRect.getBottom());
        if (this.radii == null) {
            this.radii = new float[8];
        }
        float[] fArr = this.radii;
        Intrinsics.beachfront(fArr);
        fArr[0] = supplicat.attabal.wireman(roundRect.getTopLeftCornerRadius());
        fArr[1] = supplicat.attabal.marial(roundRect.getTopLeftCornerRadius());
        fArr[2] = supplicat.attabal.wireman(roundRect.getTopRightCornerRadius());
        fArr[3] = supplicat.attabal.marial(roundRect.getTopRightCornerRadius());
        fArr[4] = supplicat.attabal.wireman(roundRect.getBottomRightCornerRadius());
        fArr[5] = supplicat.attabal.marial(roundRect.getBottomRightCornerRadius());
        fArr[6] = supplicat.attabal.wireman(roundRect.getBottomLeftCornerRadius());
        fArr[7] = supplicat.attabal.marial(roundRect.getBottomLeftCornerRadius());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        Intrinsics.beachfront(rectF2);
        float[] fArr2 = this.radii;
        Intrinsics.beachfront(fArr2);
        path.addRoundRect(rectF2, fArr2, saneness.wireman(direction));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void reset() {
        this.internalPath.reset();
    }

    public final void taiyuan(taiyuan rect) {
        if (Float.isNaN(rect.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String()) || Float.isNaN(rect.getTop()) || Float.isNaN(rect.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String()) || Float.isNaN(rect.getBottom())) {
            saneness.dern("Invalid rectangle, make sure no value is NaN");
        }
    }

    public /* synthetic */ attabal(android.graphics.Path path, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new android.graphics.Path() : path);
    }
}
