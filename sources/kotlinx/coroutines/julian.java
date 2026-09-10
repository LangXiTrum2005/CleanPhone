package kotlinx.coroutines;

import p002kotlin.Metadata;
import p002kotlin.Unit;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\t¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/julian;", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/cord;", "Lkotlinx/coroutines/monroe;", "parent", "<init>", "(Lkotlinx/coroutines/monroe;)V", "", "dern", "()Z", "molet", "monoploid", "Z", "cultivated", "handlesException", "premeiotic", "onCancelComplete", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class julian extends JobSupport implements cord {

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final boolean handlesException;

    public julian(monroe monroeVar) {
        super(true);
        coi(monroeVar);
        this.handlesException = molet();
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: cultivated, reason: from getter */
    public boolean getHandlesException() {
        return this.handlesException;
    }

    @Override // kotlinx.coroutines.cord
    public boolean dern() {
        return igbo(Unit.f29295attabal);
    }

    public final boolean molet() {
        JobSupport jobSupportAdultoid;
        graveside gravesideVarCoffeecake = coffeecake();
        adultoid adultoidVar = gravesideVarCoffeecake instanceof adultoid ? (adultoid) gravesideVarCoffeecake : null;
        if (adultoidVar != null && (jobSupportAdultoid = adultoidVar.adultoid()) != null) {
            while (!jobSupportAdultoid.getHandlesException()) {
                graveside gravesideVarCoffeecake2 = jobSupportAdultoid.coffeecake();
                adultoid adultoidVar2 = gravesideVarCoffeecake2 instanceof adultoid ? (adultoid) gravesideVarCoffeecake2 : null;
                if (adultoidVar2 == null || (jobSupportAdultoid = adultoidVar2.adultoid()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean premeiotic() {
        return true;
    }
}
