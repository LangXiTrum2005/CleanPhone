package restrictive;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Region;
import androidx.compose.ui.graphics.Path;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AndroidCanvas.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u001d\u001a\u00020\u001c*\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010!\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010\u0003R,\u0010.\u001a\u00060%j\u0002`&8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b'\u0010(\u0012\u0004\b-\u0010\u0003\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Lrestrictive/yemenite;", "Lrestrictive/creditor;", "<init>", "()V", "", "formularize", "impromptu", "", "dx", "dy", "competently", "(FF)V", "Lrestrictive/lerp;", "matrix", "triweekly", "([F)V", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "Lrestrictive/splinterproof;", "clipOp", "marial", "(FFFFI)V", "Landroidx/compose/ui/graphics/Path;", "path", "beachfront", "(Landroidx/compose/ui/graphics/Path;I)V", "Landroid/graphics/Region$Op;", "monoploid", "(I)Landroid/graphics/Region$Op;", "Lrestrictive/lotta;", "paint", "dern", "(FFFFLrestrictive/lotta;)V", "apical", "impassible", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "attabal", "Landroid/graphics/Canvas;", "kowloon", "()Landroid/graphics/Canvas;", "arytenoidectomy", "(Landroid/graphics/Canvas;)V", "getInternalCanvas$annotations", "internalCanvas", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class yemenite implements creditor {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public Canvas internalCanvas = sealless.f36348attabal;

    @Override // restrictive.creditor
    public void apical() {
        hydrovane.f36255attabal.attabal(this.internalCanvas, true);
    }

    public final void arytenoidectomy(Canvas canvas) {
        this.internalCanvas = canvas;
    }

    @Override // restrictive.creditor
    public void beachfront(Path path, int clipOp) {
        Canvas canvas = this.internalCanvas;
        if (!(path instanceof androidx.compose.ui.graphics.attabal)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((androidx.compose.ui.graphics.attabal) path).getInternalPath(), monoploid(clipOp));
    }

    @Override // restrictive.creditor
    public void competently(float dx, float dy) {
        this.internalCanvas.translate(dx, dy);
    }

    @Override // restrictive.creditor
    public void dern(float left, float top, float right, float bottom, lotta paint) {
        this.internalCanvas.drawRect(left, top, right, bottom, paint.monoploid());
    }

    @Override // restrictive.creditor
    public void formularize() {
        this.internalCanvas.save();
    }

    @Override // restrictive.creditor
    public void impassible() {
        hydrovane.f36255attabal.attabal(this.internalCanvas, false);
    }

    @Override // restrictive.creditor
    public void impromptu() {
        this.internalCanvas.restore();
    }

    /* JADX INFO: renamed from: kowloon, reason: from getter */
    public final Canvas getInternalCanvas() {
        return this.internalCanvas;
    }

    @Override // restrictive.creditor
    public void marial(float left, float top, float right, float bottom, int clipOp) {
        this.internalCanvas.clipRect(left, top, right, bottom, monoploid(clipOp));
    }

    public final Region.Op monoploid(int i) {
        return splinterproof.marial(i, splinterproof.INSTANCE.attabal()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // restrictive.creditor
    public void triweekly(float[] matrix) {
        if (nosophobia.dern(matrix)) {
            return;
        }
        Matrix matrix2 = new Matrix();
        merc.attabal(matrix2, matrix);
        this.internalCanvas.concat(matrix2);
    }
}
