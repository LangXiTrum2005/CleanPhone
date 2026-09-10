package restrictive;

import com.ironsource.C3414a2;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: restrictive.preterite, reason: from toString */
/* JADX INFO: compiled from: Shadow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0014B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R&\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001c\u0012\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u0014\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Lrestrictive/preterite;", "", "Lrestrictive/overspeculate;", "color", "Lsupplicat/competently;", "offset", "", "blurRadius", "<init>", "(JJFLkotlin/jvm/internal/DefaultConstructorMarker;)V", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "attabal", "J", "saneness", "()J", "getColor-0d7_KjU$annotations", "()V", "dern", "getOffset-F1C5BW0$annotations", "F", "()F", "getBlurRadius$annotations", "wireman", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Shadow {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public final long color;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    public final float blurRadius;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final long offset;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Shadow f36310marial = new Shadow(0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, null);

    /* JADX INFO: renamed from: restrictive.preterite$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Shadow.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrestrictive/preterite$attabal;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public /* synthetic */ Shadow(long j, long j2, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, f);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final float getBlurRadius() {
        return this.blurRadius;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) other;
        return overspeculate.formularize(this.color, shadow.color) && supplicat.competently.taiyuan(this.offset, shadow.offset) && this.blurRadius == shadow.blurRadius;
    }

    public int hashCode() {
        return (((overspeculate.polloi(this.color) * 31) + supplicat.competently.impassible(this.offset)) * 31) + Float.hashCode(this.blurRadius);
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    public String toString() {
        return "Shadow(color=" + ((Object) overspeculate.molybdenite(this.color)) + ", offset=" + ((Object) supplicat.competently.monoploid(this.offset)) + ", blurRadius=" + this.blurRadius + ')';
    }

    public Shadow(long j, long j2, float f) {
        this.color = j;
        this.offset = j2;
        this.blurRadius = f;
    }

    public /* synthetic */ Shadow(long j, long j2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? dent.dern(4278190080L) : j, (i & 2) != 0 ? supplicat.competently.INSTANCE.dern() : j2, (i & 4) != 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f, null);
    }
}
