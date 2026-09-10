package supplicat;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: RoundRect.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a=\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a8\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\"\u0015\u0010\u0011\u001a\u00020\u000e*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0015\u0010\u0015\u001a\u00020\u0012*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "radiusX", "radiusY", "Lsupplicat/apical;", "attabal", "(FFFFFF)Lsupplicat/apical;", "Lsupplicat/attabal;", "cornerRadius", "saneness", "(FFFFJ)Lsupplicat/apical;", "Lsupplicat/taiyuan;", "dern", "(Lsupplicat/apical;)Lsupplicat/taiyuan;", "boundingRect", "", "wireman", "(Lsupplicat/apical;)Z", "isSimple", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class formularize {
    public static final apical attabal(float f, float f2, float f3, float f4, float f5, float f6) {
        long jAttabal = saneness.attabal(f5, f6);
        return new apical(f, f2, f3, f4, jAttabal, jAttabal, jAttabal, jAttabal, null);
    }

    public static final taiyuan dern(apical apicalVar) {
        return new taiyuan(apicalVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String(), apicalVar.getTop(), apicalVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String(), apicalVar.getBottom());
    }

    public static final apical saneness(float f, float f2, float f3, float f4, long j) {
        return attabal(f, f2, f3, f4, attabal.wireman(j), attabal.marial(j));
    }

    public static final boolean wireman(apical apicalVar) {
        return attabal.wireman(apicalVar.getTopLeftCornerRadius()) == attabal.marial(apicalVar.getTopLeftCornerRadius()) && attabal.wireman(apicalVar.getTopLeftCornerRadius()) == attabal.wireman(apicalVar.getTopRightCornerRadius()) && attabal.wireman(apicalVar.getTopLeftCornerRadius()) == attabal.marial(apicalVar.getTopRightCornerRadius()) && attabal.wireman(apicalVar.getTopLeftCornerRadius()) == attabal.wireman(apicalVar.getBottomRightCornerRadius()) && attabal.wireman(apicalVar.getTopLeftCornerRadius()) == attabal.marial(apicalVar.getBottomRightCornerRadius()) && attabal.wireman(apicalVar.getTopLeftCornerRadius()) == attabal.wireman(apicalVar.getBottomLeftCornerRadius()) && attabal.wireman(apicalVar.getTopLeftCornerRadius()) == attabal.marial(apicalVar.getBottomLeftCornerRadius());
    }
}
