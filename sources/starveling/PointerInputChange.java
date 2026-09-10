package starveling;

import com.ironsource.X3;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: starveling.adultoid, reason: from toString */
/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014Bw\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0019Jz\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0086\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0012\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b*\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b2\u0010'R\u001d\u0010\r\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b3\u0010'R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b4\u0010.R\u001d\u0010\u0011\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001d\u0010\u0012\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u0010%\u001a\u0004\b8\u0010'R$\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b9\u0010:\u0012\u0004\b;\u0010<R(\u0010\u0018\u001a\u00020\u00068\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b>\u0010%\u001a\u0004\b?\u0010'\"\u0004\b@\u0010AR*\u0010I\u001a\u00020B2\u0006\u0010C\u001a\u00020B8\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bH\u0010<\u001a\u0004\bF\u0010GR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158GX\u0087\u0004¢\u0006\f\u0012\u0004\bK\u0010<\u001a\u0004\b+\u0010JR\u0017\u0010M\u001a\u00020\b8F¢\u0006\f\u0012\u0004\bL\u0010<\u001a\u0004\b9\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"Lstarveling/adultoid;", "", "Lstarveling/graveside;", "id", "", "uptimeMillis", "Lsupplicat/competently;", X3.i.L, "", "pressed", "", "pressure", "previousUptimeMillis", "previousPosition", "previousPressed", "isInitiallyConsumed", "Lstarveling/oilcan;", "type", "scrollDelta", "<init>", "(JJJZFJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Lstarveling/dern;", "historical", "originalEventPosition", "(JJJZFJJZZILjava/util/List;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "currentTime", "currentPosition", "currentPressed", "previousTime", "attabal", "(JJJZJJZILjava/util/List;J)Lstarveling/adultoid;", "dern", "(JJJZFJJZILjava/util/List;J)Lstarveling/adultoid;", "", "toString", "()Ljava/lang/String;", "J", "marial", "()J", "saneness", "getUptimeMillis", "beachfront", "wireman", "Z", "competently", "()Z", "F", "getPressure", "()F", "getPreviousUptimeMillis", "impromptu", "taiyuan", "I", "cutely", "()I", "getScrollDelta-F1C5BW0", "apical", "Ljava/util/List;", "get_historical$annotations", "()V", "_historical", "formularize", "getOriginalEventPosition-F1C5BW0$ui_release", "setOriginalEventPosition-k-4lQ0M$ui_release", "(J)V", "Lstarveling/saneness;", "<set-?>", "impassible", "Lstarveling/saneness;", "getConsumed", "()Lstarveling/saneness;", "getConsumed$annotations", "consumed", "()Ljava/util/List;", "getHistorical$annotations", "isConsumed$annotations", "isConsumed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PointerInputChange {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public List<HistoricalChange> _historical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public final long id;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata and from toString */
    public final long previousUptimeMillis;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata and from toString */
    public final long previousPosition;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public final long scrollDelta;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    public final long position;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public long originalEventPosition;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public saneness consumed;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean previousPressed;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata and from toString */
    public final float pressure;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final long uptimeMillis;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata and from toString */
    public final int type;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean pressed;

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6);
    }

    public static /* synthetic */ PointerInputChange saneness(PointerInputChange pointerInputChange, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, List list, long j6, int i2, Object obj) {
        long j7;
        long j8 = (i2 & 1) != 0 ? pointerInputChange.id : j;
        long j9 = (i2 & 2) != 0 ? pointerInputChange.uptimeMillis : j2;
        long j10 = (i2 & 4) != 0 ? pointerInputChange.position : j3;
        boolean z3 = (i2 & 8) != 0 ? pointerInputChange.pressed : z;
        long j11 = (i2 & 16) != 0 ? pointerInputChange.previousUptimeMillis : j4;
        long j12 = (i2 & 32) != 0 ? pointerInputChange.previousPosition : j5;
        boolean z4 = (i2 & 64) != 0 ? pointerInputChange.previousPressed : z2;
        int i3 = (i2 & 128) != 0 ? pointerInputChange.type : i;
        if ((i2 & 512) != 0) {
            j7 = pointerInputChange.scrollDelta;
            j8 = j8;
        } else {
            j7 = j6;
        }
        return pointerInputChange.attabal(j8, j9, j10, z3, j11, j12, z4, i3, list, j7);
    }

    public final boolean apical() {
        return this.consumed.getDownChange() || this.consumed.getPositionChange();
    }

    public final PointerInputChange attabal(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, List<HistoricalChange> historical, long scrollDelta) {
        return dern(id, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, type, historical, scrollDelta);
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final boolean getPressed() {
        return this.pressed;
    }

    /* JADX INFO: renamed from: cutely, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final PointerInputChange dern(long id, long currentTime, long currentPosition, boolean currentPressed, float pressure, long previousTime, long previousPosition, boolean previousPressed, int type, List<HistoricalChange> historical, long scrollDelta) {
        PointerInputChange pointerInputChange = new PointerInputChange(id, currentTime, currentPosition, currentPressed, pressure, previousTime, previousPosition, previousPressed, false, type, historical, scrollDelta, this.originalEventPosition, null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final long getPreviousPosition() {
        return this.previousPosition;
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) graveside.marial(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) supplicat.competently.monoploid(this.position)) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) supplicat.competently.monoploid(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + apical() + ", type=" + ((Object) oilcan.cutely(this.type)) + ", historical=" + wireman() + ",scrollDelta=" + ((Object) supplicat.competently.monoploid(this.scrollDelta)) + ')';
    }

    public final List<HistoricalChange> wireman() {
        List<HistoricalChange> list = this._historical;
        return list == null ? p002kotlin.collections.adultoid.formularize() : list;
    }

    public /* synthetic */ PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List list, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, list, j6, j7);
    }

    public PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.id = j;
        this.uptimeMillis = j2;
        this.position = j3;
        this.pressed = z;
        this.pressure = f;
        this.previousUptimeMillis = j4;
        this.previousPosition = j5;
        this.previousPressed = z2;
        this.type = i;
        this.scrollDelta = j6;
        this.originalEventPosition = supplicat.competently.INSTANCE.dern();
        this.consumed = new saneness(z3, z3);
    }

    public PointerInputChange(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List<HistoricalChange> list, long j6, long j7) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6, null);
        this._historical = list;
        this.originalEventPosition = j7;
    }
}
