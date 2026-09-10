package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.Path;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: ShapeContainingUtil.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a?\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a:\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a;\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/dern;", "outline", "", "x", "y", "Landroidx/compose/ui/graphics/Path;", "tmpTouchPointPath", "tmpOpPath", "", "saneness", "(Landroidx/compose/ui/graphics/dern;FFLandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Z", "Lsupplicat/taiyuan;", "rect", "marial", "(Lsupplicat/taiyuan;FF)Z", "Landroidx/compose/ui/graphics/dern$dern;", "touchPointPath", "opPath", "beachfront", "(Landroidx/compose/ui/graphics/dern$dern;FFLandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Z", "Lsupplicat/apical;", "attabal", "(Lsupplicat/apical;)Z", "Lsupplicat/attabal;", "cornerRadius", "centerX", "centerY", "competently", "(FFJFF)Z", "path", "wireman", "(Landroidx/compose/ui/graphics/Path;FFLandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class achondroplasia {
    public static final boolean attabal(supplicat.apical apicalVar) {
        return supplicat.attabal.wireman(apicalVar.getTopLeftCornerRadius()) + supplicat.attabal.wireman(apicalVar.getTopRightCornerRadius()) <= apicalVar.cutely() && supplicat.attabal.wireman(apicalVar.getBottomLeftCornerRadius()) + supplicat.attabal.wireman(apicalVar.getBottomRightCornerRadius()) <= apicalVar.cutely() && supplicat.attabal.marial(apicalVar.getTopLeftCornerRadius()) + supplicat.attabal.marial(apicalVar.getBottomLeftCornerRadius()) <= apicalVar.wireman() && supplicat.attabal.marial(apicalVar.getTopRightCornerRadius()) + supplicat.attabal.marial(apicalVar.getBottomRightCornerRadius()) <= apicalVar.wireman();
    }

    public static final boolean beachfront(androidx.compose.ui.graphics.dern.C0046dern c0046dern, float f, float f2, Path path, Path path2) {
        supplicat.apical roundRect = c0046dern.getRoundRect();
        if (f < roundRect.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String() || f >= roundRect.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String() || f2 < roundRect.getTop() || f2 >= roundRect.getBottom()) {
            return false;
        }
        if (!attabal(roundRect)) {
            Path pathAttabal = path2 == null ? androidx.compose.ui.graphics.saneness.attabal() : path2;
            Path.wireman(pathAttabal, roundRect, null, 2, null);
            return wireman(pathAttabal, f, f2, path, path2);
        }
        float fWireman = supplicat.attabal.wireman(roundRect.getTopLeftCornerRadius()) + roundRect.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String();
        float fMarial = supplicat.attabal.marial(roundRect.getTopLeftCornerRadius()) + roundRect.getTop();
        float f3 = roundRect.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String() - supplicat.attabal.wireman(roundRect.getTopRightCornerRadius());
        float top = roundRect.getTop() + supplicat.attabal.marial(roundRect.getTopRightCornerRadius());
        float f4 = roundRect.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String() - supplicat.attabal.wireman(roundRect.getBottomRightCornerRadius());
        float bottom = roundRect.getBottom() - supplicat.attabal.marial(roundRect.getBottomRightCornerRadius());
        float bottom2 = roundRect.getBottom() - supplicat.attabal.marial(roundRect.getBottomLeftCornerRadius());
        float f5 = roundRect.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String() + supplicat.attabal.wireman(roundRect.getBottomLeftCornerRadius());
        if (f < fWireman && f2 < fMarial) {
            return competently(f, f2, roundRect.getTopLeftCornerRadius(), fWireman, fMarial);
        }
        if (f < f5 && f2 > bottom2) {
            return competently(f, f2, roundRect.getBottomLeftCornerRadius(), f5, bottom2);
        }
        if (f > f3 && f2 < top) {
            return competently(f, f2, roundRect.getTopRightCornerRadius(), f3, top);
        }
        if (f <= f4 || f2 <= bottom) {
            return true;
        }
        return competently(f, f2, roundRect.getBottomRightCornerRadius(), f4, bottom);
    }

    public static final boolean competently(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fWireman = supplicat.attabal.wireman(j);
        float fMarial = supplicat.attabal.marial(j);
        return ((f5 * f5) / (fWireman * fWireman)) + ((f6 * f6) / (fMarial * fMarial)) <= 1.0f;
    }

    public static /* synthetic */ boolean dern(androidx.compose.ui.graphics.dern dernVar, float f, float f2, Path path, Path path2, int i, Object obj) {
        if ((i & 8) != 0) {
            path = null;
        }
        if ((i & 16) != 0) {
            path2 = null;
        }
        return saneness(dernVar, f, f2, path, path2);
    }

    public static final boolean marial(supplicat.taiyuan taiyuanVar, float f, float f2) {
        return taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String() <= f && f < taiyuanVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String() && taiyuanVar.getTop() <= f2 && f2 < taiyuanVar.getBottom();
    }

    public static final boolean saneness(androidx.compose.ui.graphics.dern dernVar, float f, float f2, Path path, Path path2) {
        if (dernVar instanceof androidx.compose.ui.graphics.dern.saneness) {
            return marial(((androidx.compose.ui.graphics.dern.saneness) dernVar).saneness(), f, f2);
        }
        if (dernVar instanceof androidx.compose.ui.graphics.dern.C0046dern) {
            return beachfront((androidx.compose.ui.graphics.dern.C0046dern) dernVar, f, f2, path, path2);
        }
        if (dernVar instanceof androidx.compose.ui.graphics.dern.attabal) {
            return wireman(((androidx.compose.ui.graphics.dern.attabal) dernVar).getPath(), f, f2, path, path2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean wireman(Path path, float f, float f2, Path path2, Path path3) {
        supplicat.taiyuan taiyuanVar = new supplicat.taiyuan(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        if (path2 == null) {
            path2 = androidx.compose.ui.graphics.saneness.attabal();
        }
        Path.saneness(path2, taiyuanVar, null, 2, null);
        if (path3 == null) {
            path3 = androidx.compose.ui.graphics.saneness.attabal();
        }
        path3.beachfront(path, path2, androidx.compose.ui.graphics.marial.INSTANCE.saneness());
        boolean zIsEmpty = path3.isEmpty();
        path3.reset();
        path2.reset();
        return !zIsEmpty;
    }
}
