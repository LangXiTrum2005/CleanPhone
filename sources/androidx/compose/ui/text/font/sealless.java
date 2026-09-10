package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: PlatformTypefaces.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a'\u0010\b\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/stratoscope;", "attabal", "()Landroidx/compose/ui/text/font/stratoscope;", "Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/molybdenite;", "variationSettings", "Landroid/content/Context;", "context", "dern", "(Landroid/graphics/Typeface;Landroidx/compose/ui/text/font/molybdenite;Landroid/content/Context;)Landroid/graphics/Typeface;", "", "name", "Landroidx/compose/ui/text/font/graveside;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "saneness", "(Ljava/lang/String;Landroidx/compose/ui/text/font/graveside;)Ljava/lang/String;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class sealless {
    public static final stratoscope attabal() {
        return Build.VERSION.SDK_INT >= 28 ? new oilcan() : new yemenite();
    }

    public static final Typeface dern(Typeface typeface, molybdenite molybdeniteVar, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? merc.f7783attabal.attabal(typeface, molybdeniteVar, context) : typeface;
    }

    public static final String saneness(String str, FontWeight fontWeight) {
        int weight = fontWeight.getWeight() / 100;
        if (weight >= 0 && weight < 2) {
            return str + "-thin";
        }
        if (2 <= weight && weight < 4) {
            return str + "-light";
        }
        if (weight == 4) {
            return str;
        }
        if (weight == 5) {
            return str + "-medium";
        }
        if ((6 <= weight && weight < 8) || 8 > weight || weight >= 11) {
            return str;
        }
        return str + "-black";
    }
}
