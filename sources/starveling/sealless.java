package starveling;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: PointerInputEventProcessor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Lstarveling/sealless;", "", "", "value", "attabal", "(I)I", "", "beachfront", "(I)Ljava/lang/String;", "marial", C3414a2.d, "", "saneness", "(ILjava/lang/Object;)Z", "I", "wireman", "(I)Z", "dispatchedToAPointerInputModifier", "dern", "anyMovementConsumed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class sealless {
    private final int value;

    public static String beachfront(int i) {
        return "ProcessResult(value=" + i + ')';
    }

    public static final boolean dern(int i) {
        return (i & 2) != 0;
    }

    public static int marial(int i) {
        return Integer.hashCode(i);
    }

    public static boolean saneness(int i, Object obj) {
        return (obj instanceof sealless) && i == ((sealless) obj).getValue();
    }

    public static final boolean wireman(int i) {
        return (i & 1) != 0;
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return saneness(this.value, obj);
    }

    public int hashCode() {
        return marial(this.value);
    }

    public String toString() {
        return beachfront(this.value);
    }

    public static int attabal(int i) {
        return i;
    }
}
