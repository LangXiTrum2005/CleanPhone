package starveling;

import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: PointerInputEventProcessor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0011"}, d2 = {"Lstarveling/dovishness;", "", "<init>", "()V", "Lstarveling/gintrap;", "pointerInputEvent", "Lstarveling/yemenite;", "positionCalculator", "Lstarveling/marial;", "saneness", "(Lstarveling/gintrap;Lstarveling/yemenite;)Lstarveling/marial;", "", "attabal", "Landroidx/collection/gintrap;", "Lstarveling/dovishness$attabal;", "Landroidx/collection/gintrap;", "previousPointerInputData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class dovishness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final androidx.collection.gintrap<attabal> previousPointerInputData = new androidx.collection.gintrap<>(0, 1, null);

    /* JADX INFO: compiled from: PointerInputEventProcessor.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\f\u0010\u0012R\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Lstarveling/dovishness$attabal;", "", "", "uptime", "Lsupplicat/competently;", "positionOnScreen", "", "down", "Lstarveling/oilcan;", "type", "<init>", "(JJZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "attabal", "J", "dern", "()J", "saneness", "Z", "()Z", "wireman", "I", "getType-T8wyACA", "()I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final long uptime;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public final boolean down;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final long positionOnScreen;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public final int type;

        public /* synthetic */ attabal(long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, z, i);
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final boolean getDown() {
            return this.down;
        }

        /* JADX INFO: renamed from: dern, reason: from getter */
        public final long getUptime() {
            return this.uptime;
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final long getPositionOnScreen() {
            return this.positionOnScreen;
        }

        public attabal(long j, long j2, boolean z, int i) {
            this.uptime = j;
            this.positionOnScreen = j2;
            this.down = z;
            this.type = i;
        }
    }

    public final void attabal() {
        this.previousPointerInputData.attabal();
    }

    public final marial saneness(gintrap pointerInputEvent, yemenite positionCalculator) {
        long uptime;
        boolean down;
        long jTriweekly;
        androidx.collection.gintrap gintrapVar = new androidx.collection.gintrap(pointerInputEvent.saneness().size());
        List<PointerInputEventData> listSaneness = pointerInputEvent.saneness();
        int size = listSaneness.size();
        for (int i = 0; i < size; i++) {
            PointerInputEventData pointerInputEventData = listSaneness.get(i);
            attabal attabalVarMarial = this.previousPointerInputData.marial(pointerInputEventData.getId());
            if (attabalVarMarial == null) {
                down = false;
                uptime = pointerInputEventData.getUptime();
                jTriweekly = pointerInputEventData.getPosition();
            } else {
                uptime = attabalVarMarial.getUptime();
                down = attabalVarMarial.getDown();
                jTriweekly = positionCalculator.triweekly(attabalVarMarial.getPositionOnScreen());
            }
            gintrapVar.taiyuan(pointerInputEventData.getId(), new PointerInputChange(pointerInputEventData.getId(), pointerInputEventData.getUptime(), pointerInputEventData.getPosition(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), uptime, jTriweekly, down, false, pointerInputEventData.getType(), pointerInputEventData.dern(), pointerInputEventData.getScrollDelta(), pointerInputEventData.getOriginalEventPosition(), null));
            if (pointerInputEventData.getDown()) {
                this.previousPointerInputData.taiyuan(pointerInputEventData.getId(), new attabal(pointerInputEventData.getUptime(), pointerInputEventData.getPositionOnScreen(), pointerInputEventData.getDown(), pointerInputEventData.getType(), null));
            } else {
                this.previousPointerInputData.apical(pointerInputEventData.getId());
            }
        }
        return new marial(gintrapVar, pointerInputEvent);
    }
}
