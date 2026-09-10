package md;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new l7.h(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f45967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f45968b;

    public h() {
        this(e(), a());
    }

    public static long a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    public static long e() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public final long b() {
        return new h().f45968b - this.f45968b;
    }

    public final long c(h hVar) {
        return hVar.f45968b - this.f45968b;
    }

    public final void d() {
        this.f45967a = e();
        this.f45968b = a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f45967a);
        parcel.writeLong(this.f45968b);
    }

    public h(long j10, long j11) {
        this.f45967a = j10;
        this.f45968b = j11;
    }
}
