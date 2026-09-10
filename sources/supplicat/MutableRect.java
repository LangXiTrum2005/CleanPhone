package supplicat;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;

/* JADX INFO: renamed from: supplicat.marial, reason: from toString */
/* JADX INFO: compiled from: MutableRect.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\bJ-\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012\"\u0004\b\u0019\u0010\u0014R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lsupplicat/marial;", "", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "<init>", "(FFFF)V", "", "marial", "competently", "", "toString", "()Ljava/lang/String;", "attabal", "F", "saneness", "()F", "taiyuan", "(F)V", "wireman", "apical", "dern", "cutely", "impromptu", "", "beachfront", "()Z", "isEmpty", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutableRect {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public float left;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public float right;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public float top;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public float bottom;

    public MutableRect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    public final void apical(float f) {
        this.top = f;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    public final boolean beachfront() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public final void competently(float left, float top, float right, float bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    public final void cutely(float f) {
        this.right = f;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    public final void impromptu(float f) {
        this.bottom = f;
    }

    public final void marial(float left, float top, float right, float bottom) {
        this.left = Math.max(left, this.left);
        this.top = Math.max(top, this.top);
        this.right = Math.min(right, this.right);
        this.bottom = Math.min(bottom, this.bottom);
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    public final void taiyuan(float f) {
        this.left = f;
    }

    public String toString() {
        return "MutableRect(" + dern.attabal(this.left, 1) + ", " + dern.attabal(this.top, 1) + ", " + dern.attabal(this.right, 1) + ", " + dern.attabal(this.bottom, 1) + ')';
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final float getTop() {
        return this.top;
    }
}
