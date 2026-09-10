package clubfoot;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: TextRange.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a$\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"", "start", TtmlNode.END, "Landroidx/compose/ui/text/competently;", "saneness", "(II)J", "index", "attabal", "(I)J", "minimumValue", "maximumValue", "dern", "(JII)J", "", "wireman", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class impromptu {
    public static final long attabal(int i) {
        return saneness(i, i);
    }

    public static final long dern(long j, int i, int i2) {
        int iApical = p002kotlin.ranges.wireman.apical(androidx.compose.ui.text.competently.cutely(j), i, i2);
        int iApical2 = p002kotlin.ranges.wireman.apical(androidx.compose.ui.text.competently.competently(j), i, i2);
        return (iApical == androidx.compose.ui.text.competently.cutely(j) && iApical2 == androidx.compose.ui.text.competently.competently(j)) ? j : saneness(iApical, iApical2);
    }

    public static final long saneness(int i, int i2) {
        return androidx.compose.ui.text.competently.dern(wireman(i, i2));
    }

    public static final long wireman(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
        }
        if (i2 >= 0) {
            return (((long) i2) & 4294967295L) | (((long) i) << 32);
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
    }
}
