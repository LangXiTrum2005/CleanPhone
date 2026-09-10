package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yz1 implements cz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22416a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f22418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f22420e;

    public /* synthetic */ yz1() {
    }

    public void a(long j10) {
        this.f22418c = j10;
        if (this.f22417b) {
            this.f22419d = SystemClock.elapsedRealtime();
        }
    }

    public void b() {
        if (this.f22417b) {
            throw new IllegalStateException("This stopwatch is already running.");
        }
        this.f22417b = true;
        this.f22419d = ((r9.b) this.f22420e).P();
    }

    @Override // com.google.android.gms.internal.ads.cz1
    public void c(cc ccVar) {
        if (this.f22417b) {
            a(zzg());
        }
        this.f22420e = ccVar;
    }

    public String toString() {
        String str;
        switch (this.f22416a) {
            case 1:
                long jP = this.f22417b ? (((r9.b) this.f22420e).P() - this.f22419d) + this.f22418c : this.f22418c;
                TimeUnit timeUnit = TimeUnit.DAYS;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                if (timeUnit.convert(jP, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.HOURS;
                    if (timeUnit.convert(jP, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MINUTES;
                        if (timeUnit.convert(jP, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.SECONDS;
                            if (timeUnit.convert(jP, timeUnit2) <= 0) {
                                timeUnit = TimeUnit.MILLISECONDS;
                                if (timeUnit.convert(jP, timeUnit2) <= 0) {
                                    timeUnit = TimeUnit.MICROSECONDS;
                                    if (timeUnit.convert(jP, timeUnit2) <= 0) {
                                        timeUnit = timeUnit2;
                                    }
                                }
                            }
                        }
                    }
                }
                String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jP / timeUnit2.convert(1L, timeUnit)));
                switch (com.google.android.gms.internal.play_billing.m.f24407a[timeUnit.ordinal()]) {
                    case 1:
                        str = "ns";
                        break;
                    case 2:
                        str = "μs";
                        break;
                    case 3:
                        str = "ms";
                        break;
                    case 4:
                        str = "s";
                        break;
                    case 5:
                        str = "min";
                        break;
                    case 6:
                        str = "h";
                        break;
                    case 7:
                        str = DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D;
                        break;
                    default:
                        throw new AssertionError();
                }
                return wi.d.i(str2, " ", str);
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.cz1
    public long zzg() {
        long j10 = this.f22418c;
        if (!this.f22417b) {
            return j10;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f22419d;
        cc ccVar = (cc) this.f22420e;
        return (ccVar.f13130a == 1.0f ? uu0.t(jElapsedRealtime) : jElapsedRealtime * ((long) ccVar.f13132c)) + j10;
    }

    @Override // com.google.android.gms.internal.ads.cz1
    public cc zzj() {
        return (cc) this.f22420e;
    }

    public yz1(r9.b bVar) {
        if (bVar == null) {
            throw new NullPointerException("ticker");
        }
        this.f22420e = bVar;
    }
}
