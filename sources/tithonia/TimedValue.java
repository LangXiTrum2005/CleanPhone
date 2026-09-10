package tithonia;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C3414a2;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tithonia.marial, reason: from toString */
/* JADX INFO: compiled from: measureTime.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Ltithonia/marial;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "value", "Lkotlin/time/saneness;", IronSourceConstants.EVENTS_DURATION, "<init>", "(Ljava/lang/Object;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "attabal", "()Ljava/lang/Object;", "saneness", "()J", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "dern", "J", "getDuration-UwyO8pc", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TimedValue<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    public final long duration;
    private final T value;

    public /* synthetic */ TimedValue(Object obj, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, j);
    }

    public final T attabal() {
        return this.value;
    }

    public final T dern() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimedValue)) {
            return false;
        }
        TimedValue timedValue = (TimedValue) other;
        return Intrinsics.wireman(this.value, timedValue.value) && p002kotlin.time.saneness.kowloon(this.duration, timedValue.duration);
    }

    public int hashCode() {
        T t = this.value;
        return ((t == null ? 0 : t.hashCode()) * 31) + p002kotlin.time.saneness.trm(this.duration);
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    public String toString() {
        return "TimedValue(value=" + this.value + ", duration=" + ((Object) p002kotlin.time.saneness.starveling(this.duration)) + ')';
    }

    public TimedValue(T t, long j) {
        this.value = t;
        this.duration = j;
    }
}
