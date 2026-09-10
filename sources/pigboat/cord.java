package pigboat;

import com.ironsource.C3414a2;
import com.ironsource.D1;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import pigboat.preprohormone;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081@\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0018\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0004\u0092\u0001\u0004\u0018\u00010\u0003¨\u0006\u0019"}, d2 = {"Lpigboat/cord;", "Lpigboat/preprohormone;", "S", "", "value", "attabal", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "marial", "isClosed", "dern", "(Ljava/lang/Object;)Lpigboat/preprohormone;", "getSegment$annotations", "()V", D1.i, "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class cord<S extends preprohormone<S>> {
    private final Object value;

    public static String beachfront(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public static final S dern(Object obj) {
        if (obj == attabal.f35328attabal) {
            throw new IllegalStateException("Does not contain segment");
        }
        Intrinsics.competently(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (S) obj;
    }

    public static final boolean marial(Object obj) {
        return obj == attabal.f35328attabal;
    }

    public static boolean saneness(Object obj, Object obj2) {
        return (obj2 instanceof cord) && Intrinsics.wireman(obj, ((cord) obj2).getValue());
    }

    public static int wireman(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final /* synthetic */ Object getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        return saneness(this.value, other);
    }

    public int hashCode() {
        return wireman(this.value);
    }

    public String toString() {
        return beachfront(this.value);
    }

    public static <S extends preprohormone<S>> Object attabal(Object obj) {
        return obj;
    }
}
