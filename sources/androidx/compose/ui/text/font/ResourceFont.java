package androidx.compose.ui.text.font;

import com.ironsource.C3414a2;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.kattegat, reason: from toString */
/* JADX INFO: compiled from: Font.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\tR\u001a\u0010\u0015\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\r\u0010\u0014R \u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0012\u0010\tR&\u0010\u001d\u001a\u00020\u00188WX\u0097\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u001f\u001a\u00020\u001e8\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0019\u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/font/kattegat;", "Landroidx/compose/ui/text/font/impromptu;", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "saneness", "I", "wireman", "resId", "Landroidx/compose/ui/text/font/graveside;", "dern", "Landroidx/compose/ui/text/font/graveside;", "()Landroidx/compose/ui/text/font/graveside;", "weight", "Landroidx/compose/ui/text/font/arytenoidectomy;", TtmlNode.TAG_STYLE, "Landroidx/compose/ui/text/font/triweekly;", "marial", "attabal", "getLoadingStrategy-PKNRLFQ$annotations", "()V", "loadingStrategy", "Landroidx/compose/ui/text/font/molybdenite;", "variationSettings", "Landroidx/compose/ui/text/font/molybdenite;", "()Landroidx/compose/ui/text/font/molybdenite;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ResourceFont implements impromptu {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final FontWeight weight;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final int loadingStrategy;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final int resId;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final int style;

    @Override // androidx.compose.ui.text.font.impromptu
    /* JADX INFO: renamed from: attabal, reason: from getter */
    public int getLoadingStrategy() {
        return this.loadingStrategy;
    }

    @Override // androidx.compose.ui.text.font.impromptu
    /* JADX INFO: renamed from: dern, reason: from getter */
    public int getStyle() {
        return this.style;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) other;
        return this.resId == resourceFont.resId && Intrinsics.wireman(getWeight(), resourceFont.getWeight()) && arytenoidectomy.marial(getStyle(), resourceFont.getStyle()) && Intrinsics.wireman(null, null) && triweekly.beachfront(getLoadingStrategy(), resourceFont.getLoadingStrategy());
    }

    public int hashCode() {
        getWeight().hashCode();
        arytenoidectomy.beachfront(getStyle());
        triweekly.competently(getLoadingStrategy());
        throw null;
    }

    public final molybdenite marial() {
        return null;
    }

    @Override // androidx.compose.ui.text.font.impromptu
    /* JADX INFO: renamed from: saneness, reason: from getter */
    public FontWeight getWeight() {
        return this.weight;
    }

    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + ((Object) arytenoidectomy.competently(getStyle())) + ", loadingStrategy=" + ((Object) triweekly.impromptu(getLoadingStrategy())) + ')';
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final int getResId() {
        return this.resId;
    }
}
