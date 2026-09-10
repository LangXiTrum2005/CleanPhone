package androidx.compose.runtime;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0083@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\n\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/mathsort;", "", "", "value", "dern", "(I)I", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "I", "getValue", "attabal", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class mathsort {
    private final int value;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int f6076saneness = dern(0);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int f6075dern = dern(1);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int f6077wireman = dern(2);

    /* JADX INFO: renamed from: androidx.compose.runtime.mathsort$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/mathsort$attabal;", "", "<init>", "()V", "Landroidx/compose/runtime/mathsort;", "Group", "I", "attabal", "()I", "Node", "saneness", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int attabal() {
            return mathsort.f6076saneness;
        }

        public final int saneness() {
            return mathsort.f6075dern;
        }

        public Companion() {
        }
    }

    public static String beachfront(int i) {
        return "GroupKind(value=" + i + ')';
    }

    public static int marial(int i) {
        return Integer.hashCode(i);
    }

    public static boolean wireman(int i, Object obj) {
        return (obj instanceof mathsort) && i == ((mathsort) obj).getValue();
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        return wireman(this.value, other);
    }

    public int hashCode() {
        return marial(this.value);
    }

    public String toString() {
        return beachfront(this.value);
    }

    public static int dern(int i) {
        return i;
    }
}
