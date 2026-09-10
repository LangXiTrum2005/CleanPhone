package androidx.compose.ui.text.font;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\rø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/cuirassed;", "", "Landroidx/compose/ui/text/font/taiyuan;", TtmlNode.ATTR_TTS_FONT_FAMILY, "wireman", "(Landroidx/compose/ui/text/font/taiyuan;)Landroidx/compose/ui/text/font/taiyuan;", "Landroidx/compose/ui/text/font/graveside;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "attabal", "(Landroidx/compose/ui/text/font/graveside;)Landroidx/compose/ui/text/font/graveside;", "Landroidx/compose/ui/text/font/arytenoidectomy;", TtmlNode.ATTR_TTS_FONT_STYLE, "saneness", "(I)I", "Landroidx/compose/ui/text/font/monoploid;", "fontSynthesis", "dern", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface cuirassed {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f7746attabal;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.cuirassed$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FontFamilyResolver.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/font/cuirassed$attabal;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/cuirassed;", "saneness", "Landroidx/compose/ui/text/font/cuirassed;", "attabal", "()Landroidx/compose/ui/text/font/cuirassed;", "Default", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ Companion f7746attabal = new Companion();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public static final cuirassed Default = new C0052attabal();

        /* JADX INFO: renamed from: androidx.compose.ui.text.font.cuirassed$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FontFamilyResolver.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/text/font/cuirassed$attabal$attabal", "Landroidx/compose/ui/text/font/cuirassed;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C0052attabal implements cuirassed {
        }

        public final cuirassed attabal() {
            return Default;
        }
    }

    default FontWeight attabal(FontWeight fontWeight) {
        return fontWeight;
    }

    default int dern(int fontSynthesis) {
        return fontSynthesis;
    }

    default int saneness(int fontStyle) {
        return fontStyle;
    }

    default taiyuan wireman(taiyuan fontFamily) {
        return fontFamily;
    }
}
