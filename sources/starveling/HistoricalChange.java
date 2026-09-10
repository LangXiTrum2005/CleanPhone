package starveling;

import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: starveling.dern, reason: from toString */
/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R*\u0010\b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00048\u0000@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lstarveling/dern;", "", "", "uptimeMillis", "Lsupplicat/competently;", X3.i.L, "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "originalEventPosition", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "attabal", "J", "dern", "()J", "saneness", "<set-?>", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HistoricalChange {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public final long uptimeMillis;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public long originalEventPosition;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    public final long position;

    public /* synthetic */ HistoricalChange(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final long getOriginalEventPosition() {
        return this.originalEventPosition;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) supplicat.competently.monoploid(this.position)) + ')';
    }

    public /* synthetic */ HistoricalChange(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    public HistoricalChange(long j, long j2) {
        this.uptimeMillis = j;
        this.position = j2;
        this.originalEventPosition = supplicat.competently.INSTANCE.dern();
    }

    public HistoricalChange(long j, long j2, long j3) {
        this(j, j2, (DefaultConstructorMarker) null);
        this.originalEventPosition = j3;
    }
}
