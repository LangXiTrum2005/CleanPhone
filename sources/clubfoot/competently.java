package clubfoot;

import com.ironsource.C3414a2;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TextLinkStyles.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lclubfoot/competently;", "", "Lclubfoot/marial;", TtmlNode.TAG_STYLE, "focusedStyle", "hoveredStyle", "pressedStyle", "<init>", "(Lclubfoot/marial;Lclubfoot/marial;Lclubfoot/marial;Lclubfoot/marial;)V", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "attabal", "Lclubfoot/marial;", "wireman", "()Lclubfoot/marial;", "saneness", "dern", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final SpanStyle style;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final SpanStyle hoveredStyle;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final SpanStyle focusedStyle;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final SpanStyle pressedStyle;

    public competently() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final SpanStyle getFocusedStyle() {
        return this.focusedStyle;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final SpanStyle getPressedStyle() {
        return this.pressedStyle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof competently)) {
            return false;
        }
        competently competentlyVar = (competently) other;
        return Intrinsics.wireman(this.style, competentlyVar.style) && Intrinsics.wireman(this.focusedStyle, competentlyVar.focusedStyle) && Intrinsics.wireman(this.hoveredStyle, competentlyVar.hoveredStyle) && Intrinsics.wireman(this.pressedStyle, competentlyVar.pressedStyle);
    }

    public int hashCode() {
        SpanStyle marialVar = this.style;
        int iHashCode = (marialVar != null ? marialVar.hashCode() : 0) * 31;
        SpanStyle marialVar2 = this.focusedStyle;
        int iHashCode2 = (iHashCode + (marialVar2 != null ? marialVar2.hashCode() : 0)) * 31;
        SpanStyle marialVar3 = this.hoveredStyle;
        int iHashCode3 = (iHashCode2 + (marialVar3 != null ? marialVar3.hashCode() : 0)) * 31;
        SpanStyle marialVar4 = this.pressedStyle;
        return iHashCode3 + (marialVar4 != null ? marialVar4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final SpanStyle getHoveredStyle() {
        return this.hoveredStyle;
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final SpanStyle getStyle() {
        return this.style;
    }

    public competently(SpanStyle marialVar, SpanStyle marialVar2, SpanStyle marialVar3, SpanStyle marialVar4) {
        this.style = marialVar;
        this.focusedStyle = marialVar2;
        this.hoveredStyle = marialVar3;
        this.pressedStyle = marialVar4;
    }

    public /* synthetic */ competently(SpanStyle marialVar, SpanStyle marialVar2, SpanStyle marialVar3, SpanStyle marialVar4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : marialVar, (i & 2) != 0 ? null : marialVar2, (i & 4) != 0 ? null : marialVar3, (i & 8) != 0 ? null : marialVar4);
    }
}
