package starveling;

import com.ironsource.C3414a2;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lstarveling/graveside;", "", "", "value", "attabal", "(J)J", "", "marial", "(J)Ljava/lang/String;", "", "wireman", "(J)I", C3414a2.d, "", "saneness", "(JLjava/lang/Object;)Z", "J", "getValue", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class graveside {
    private final long value;

    public static final boolean dern(long j, long j2) {
        return j == j2;
    }

    public static String marial(long j) {
        return "PointerId(value=" + j + ')';
    }

    public static boolean saneness(long j, Object obj) {
        return (obj instanceof graveside) && j == ((graveside) obj).getValue();
    }

    public static int wireman(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return saneness(this.value, obj);
    }

    public int hashCode() {
        return wireman(this.value);
    }

    public String toString() {
        return marial(this.value);
    }

    public static long attabal(long j) {
        return j;
    }
}
