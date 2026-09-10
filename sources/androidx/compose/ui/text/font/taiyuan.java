package androidx.compose.ui.text.font;

import androidx.compose.runtime.tout;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FontFamily.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0003\u001a\u00020\u00028G¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/font/taiyuan;", "", "", "canLoadSynchronously", "<init>", "(Z)V", "kowloon", "Z", "getCanLoadSynchronously", "()Z", "getCanLoadSynchronously$annotations", "()V", "arytenoidectomy", "attabal", "saneness", "Landroidx/compose/ui/text/font/competently;", "Landroidx/compose/ui/text/font/rotuma;", "Landroidx/compose/ui/text/font/supplicat;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class taiyuan {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final boolean canLoadSynchronously;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final supplicat f7804monoploid = new beachfront();

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final gintrap f7805polloi = new gintrap(C.SANS_SERIF_NAME, "FontFamily.SansSerif");

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final gintrap f7803molybdenite = new gintrap(C.SERIF_NAME, "FontFamily.Serif");

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final gintrap f7802graveside = new gintrap("monospace", "FontFamily.Monospace");

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final gintrap f7800adultoid = new gintrap("cursive", "FontFamily.Cursive");

    /* JADX INFO: compiled from: FontFamily.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001JB\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0001\u0001\rø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/taiyuan$saneness;", "", "Landroidx/compose/ui/text/font/taiyuan;", TtmlNode.ATTR_TTS_FONT_FAMILY, "Landroidx/compose/ui/text/font/graveside;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/arytenoidectomy;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/monoploid;", "fontSynthesis", "Landroidx/compose/runtime/tout;", "attabal", "(Landroidx/compose/ui/text/font/taiyuan;Landroidx/compose/ui/text/font/graveside;II)Landroidx/compose/runtime/tout;", "Landroidx/compose/ui/text/font/FontFamilyResolverImpl;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface saneness {
        static /* synthetic */ tout saneness(saneness sanenessVar, taiyuan taiyuanVar, FontWeight fontWeight, int i, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
            }
            if ((i3 & 1) != 0) {
                taiyuanVar = null;
            }
            if ((i3 & 2) != 0) {
                fontWeight = FontWeight.INSTANCE.attabal();
            }
            if ((i3 & 4) != 0) {
                i = arytenoidectomy.INSTANCE.saneness();
            }
            if ((i3 & 8) != 0) {
                i2 = monoploid.INSTANCE.attabal();
            }
            return sanenessVar.attabal(taiyuanVar, fontWeight, i, i2);
        }

        tout<Object> attabal(taiyuan fontFamily, FontWeight fontWeight, int fontStyle, int fontSynthesis);
    }

    public /* synthetic */ taiyuan(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    public taiyuan(boolean z) {
        this.canLoadSynchronously = z;
    }
}
