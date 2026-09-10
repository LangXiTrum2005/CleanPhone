package androidx.compose.ui.text.font;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AndroidFontUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0018\u0010\u000f\u001a\u00020\u0000*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/graveside;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/arytenoidectomy;", TtmlNode.ATTR_TTS_FONT_STYLE, "", "dern", "(Landroidx/compose/ui/text/font/graveside;I)I", "", "isBold", "isItalic", "saneness", "(ZZ)I", "Landroidx/compose/ui/text/font/graveside$attabal;", "attabal", "(Landroidx/compose/ui/text/font/graveside$attabal;)Landroidx/compose/ui/text/font/graveside;", "AndroidBold", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class marial {
    public static final FontWeight attabal(FontWeight.Companion companion) {
        return companion.wireman();
    }

    public static final int dern(FontWeight fontWeight, int i) {
        return saneness(fontWeight.compareTo(attabal(FontWeight.INSTANCE)) >= 0, arytenoidectomy.marial(i, arytenoidectomy.INSTANCE.attabal()));
    }

    public static final int saneness(boolean z, boolean z2) {
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }
}
