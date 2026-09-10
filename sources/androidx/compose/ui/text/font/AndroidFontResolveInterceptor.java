package androidx.compose.ui.text.font;

import com.ironsource.C3414a2;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.dern, reason: from toString */
/* JADX INFO: compiled from: AndroidFontResolveInterceptor.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/font/dern;", "Landroidx/compose/ui/text/font/cuirassed;", "", "fontWeightAdjustment", "<init>", "(I)V", "Landroidx/compose/ui/text/font/graveside;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "attabal", "(Landroidx/compose/ui/text/font/graveside;)Landroidx/compose/ui/text/font/graveside;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "saneness", "I", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AndroidFontResolveInterceptor implements cuirassed {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final int fontWeightAdjustment;

    public AndroidFontResolveInterceptor(int i) {
        this.fontWeightAdjustment = i;
    }

    @Override // androidx.compose.ui.text.font.cuirassed
    public FontWeight attabal(FontWeight fontWeight) {
        int i = this.fontWeightAdjustment;
        return (i == 0 || i == Integer.MAX_VALUE) ? fontWeight : new FontWeight(p002kotlin.ranges.wireman.apical(fontWeight.getWeight() + this.fontWeightAdjustment, 1, 1000));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AndroidFontResolveInterceptor) && this.fontWeightAdjustment == ((AndroidFontResolveInterceptor) other).fontWeightAdjustment;
    }

    public int hashCode() {
        return Integer.hashCode(this.fontWeightAdjustment);
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.fontWeightAdjustment + ')';
    }
}
