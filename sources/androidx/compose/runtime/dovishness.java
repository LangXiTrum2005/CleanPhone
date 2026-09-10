package androidx.compose.runtime;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/dovishness;", "Loilcan/marial;", "", "Landroidx/compose/runtime/molybdenite;", "composition", "<init>", "(Landroidx/compose/runtime/molybdenite;)V", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "kowloon", "Landroidx/compose/runtime/molybdenite;", "getComposition", "()Landroidx/compose/runtime/molybdenite;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class dovishness implements oilcan.marial {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final molybdenite composition;

    public dovishness(molybdenite molybdeniteVar) {
        this.composition = molybdeniteVar;
    }

    public boolean equals(Object other) {
        return (other instanceof dovishness) && Intrinsics.wireman(this.composition, ((dovishness) other).composition);
    }

    public int hashCode() {
        return this.composition.hashCode() * 31;
    }
}
