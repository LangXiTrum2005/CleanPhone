package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PlatformTypefaces.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ*\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u0016\u001a\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/font/yemenite;", "Landroidx/compose/ui/text/font/stratoscope;", "<init>", "()V", "Landroidx/compose/ui/text/font/graveside;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/arytenoidectomy;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroid/graphics/Typeface;", "saneness", "(Landroidx/compose/ui/text/font/graveside;I)Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/gintrap;", "name", "attabal", "(Landroidx/compose/ui/text/font/gintrap;Landroidx/compose/ui/text/font/graveside;I)Landroid/graphics/Typeface;", "", "familyName", "weight", TtmlNode.TAG_STYLE, "wireman", "(Ljava/lang/String;Landroidx/compose/ui/text/font/graveside;I)Landroid/graphics/Typeface;", "genericFontFamily", "dern", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class yemenite implements stratoscope {
    @Override // androidx.compose.ui.text.font.stratoscope
    public Typeface attabal(gintrap name, FontWeight fontWeight, int fontStyle) {
        Typeface typefaceWireman = wireman(sealless.saneness(name.getName(), fontWeight), fontWeight, fontStyle);
        return typefaceWireman == null ? dern(name.getName(), fontWeight, fontStyle) : typefaceWireman;
    }

    public final Typeface dern(String genericFontFamily, FontWeight fontWeight, int fontStyle) {
        if (arytenoidectomy.marial(fontStyle, arytenoidectomy.INSTANCE.saneness()) && Intrinsics.wireman(fontWeight, FontWeight.INSTANCE.attabal()) && (genericFontFamily == null || genericFontFamily.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iDern = marial.dern(fontWeight, fontStyle);
        return (genericFontFamily == null || genericFontFamily.length() == 0) ? Typeface.defaultFromStyle(iDern) : Typeface.create(genericFontFamily, iDern);
    }

    @Override // androidx.compose.ui.text.font.stratoscope
    public Typeface saneness(FontWeight fontWeight, int fontStyle) {
        return dern(null, fontWeight, fontStyle);
    }

    public final Typeface wireman(String familyName, FontWeight weight, int style) {
        if (familyName.length() == 0) {
            return null;
        }
        Typeface typefaceDern = dern(familyName, weight, style);
        if (Intrinsics.wireman(typefaceDern, Typeface.create(Typeface.DEFAULT, marial.dern(weight, style))) || Intrinsics.wireman(typefaceDern, dern(null, weight, style))) {
            return null;
        }
        return typefaceDern;
    }
}
