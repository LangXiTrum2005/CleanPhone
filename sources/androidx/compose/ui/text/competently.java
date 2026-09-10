package androidx.compose.ui.text;

import clubfoot.impromptu;
import com.applovin.sdk.AppLovinMediationProvider;
import com.ironsource.C3414a2;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: TextRange.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087@\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000bR\u0011\u0010\u0015\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000bR\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR\u0011\u0010\u0019\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000bR\u0011\u0010\u001c\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/text/competently;", "", "", "packedValue", "dern", "(J)J", "", "formularize", "(J)Ljava/lang/String;", "", "apical", "(J)I", C3414a2.d, "", "wireman", "(JLjava/lang/Object;)Z", "attabal", "J", "cutely", "start", "competently", TtmlNode.END, "taiyuan", "min", "impromptu", AppLovinMediationProvider.MAX, "beachfront", "(J)Z", "collapsed", "saneness", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final long packedValue;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final long f7704dern = impromptu.attabal(0);

    /* JADX INFO: renamed from: androidx.compose.ui.text.competently$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TextRange.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/competently$attabal;", "", "<init>", "()V", "Landroidx/compose/ui/text/competently;", "Zero", "J", "attabal", "()J", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long attabal() {
            return competently.f7704dern;
        }

        public Companion() {
        }
    }

    public /* synthetic */ competently(long j) {
        this.packedValue = j;
    }

    public static int apical(long j) {
        return Long.hashCode(j);
    }

    public static final boolean beachfront(long j) {
        return cutely(j) == competently(j);
    }

    public static final int competently(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int cutely(long j) {
        return (int) (j >> 32);
    }

    public static String formularize(long j) {
        return "TextRange(" + cutely(j) + ", " + competently(j) + ')';
    }

    public static final int impromptu(long j) {
        return cutely(j) > competently(j) ? cutely(j) : competently(j);
    }

    public static final boolean marial(long j, long j2) {
        return j == j2;
    }

    public static final /* synthetic */ competently saneness(long j) {
        return new competently(j);
    }

    public static final int taiyuan(long j) {
        return cutely(j) > competently(j) ? competently(j) : cutely(j);
    }

    public static boolean wireman(long j, Object obj) {
        return (obj instanceof competently) && j == ((competently) obj).getPackedValue();
    }

    public boolean equals(Object obj) {
        return wireman(this.packedValue, obj);
    }

    public int hashCode() {
        return apical(this.packedValue);
    }

    /* JADX INFO: renamed from: impassible, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return formularize(this.packedValue);
    }

    public static long dern(long j) {
        return j;
    }
}
