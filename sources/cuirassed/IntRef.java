package cuirassed;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.CharsKt;

/* JADX INFO: renamed from: cuirassed.beachfront, reason: from toString */
/* JADX INFO: compiled from: IntRef.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\u0005¨\u0006\r"}, d2 = {"Lcuirassed/beachfront;", "", "", "element", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "attabal", "I", "()I", "saneness", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntRef {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public int element;

    public IntRef() {
        this(0, 1, null);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final int getElement() {
        return this.element;
    }

    public final void saneness(int i) {
        this.element = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IntRef(element = ");
        sb.append(this.element);
        sb.append(")@");
        String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb.append(string);
        return sb.toString();
    }

    public IntRef(int i) {
        this.element = i;
    }

    public /* synthetic */ IntRef(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
