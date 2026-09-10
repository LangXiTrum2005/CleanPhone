package ads_mobile_sdk;

import android.os.SystemClock;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.impassible;
import kotlinx.coroutines.kowloon;
import p002kotlin.Result;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;

/* JADX INFO: loaded from: classes.dex */
public final class uj2 implements SignalCallbacks {
    public final long a;
    public final amphitheatre b;
    public final impassible c;
    public final RtbAdapterData d;
    public final AtomicBoolean e;

    public uj2(String adapterName, ij2 adapterProxy, long j, amphitheatre clock, kowloon continuation) {
        Intrinsics.checkNotNullParameter(adapterName, "adapterName");
        Intrinsics.checkNotNullParameter(adapterProxy, "adapterProxy");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.a = j;
        this.b = clock;
        this.c = continuation;
        this.d = new RtbAdapterData(adapterName, adapterProxy.b().toString(), adapterProxy.a().toString(), null, null, 120);
        this.e = new AtomicBoolean(false);
    }

    public final void a(String str) {
        if (this.e.getAndSet(true)) {
            return;
        }
        RtbAdapterData rtbAdapterData = this.d;
        rtbAdapterData.signalErrorCode = 2;
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        this.b.getClass();
        rtbAdapterData.latency = Long.valueOf(p002kotlin.time.saneness.adultoid(p002kotlin.time.saneness.merc(p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS), this.a)));
        rtbAdapterData.signalErrorMessage = str;
        impassible impassibleVar = this.c;
        Result.Companion companion2 = Result.INSTANCE;
        impassibleVar.resumeWith(Result.m3351constructorimpl(this.d));
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        a(adError.getMessage());
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onSuccess(String signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        if (this.e.getAndSet(true)) {
            return;
        }
        RtbAdapterData rtbAdapterData = this.d;
        rtbAdapterData.signals = signals;
        rtbAdapterData.signalErrorCode = 0;
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        this.b.getClass();
        rtbAdapterData.latency = Long.valueOf(p002kotlin.time.saneness.adultoid(p002kotlin.time.saneness.merc(p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS), this.a)));
        impassible impassibleVar = this.c;
        Result.Companion companion2 = Result.INSTANCE;
        impassibleVar.resumeWith(Result.m3351constructorimpl(this.d));
    }

    @Override // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(String failure) {
        Intrinsics.checkNotNullParameter(failure, "failure");
        a(failure);
    }
}
