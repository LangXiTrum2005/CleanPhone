package ads_mobile_sdk;

import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.impassible;
import kotlinx.coroutines.kowloon;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tx0 implements InitializationCompleteCallback {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ impassible b;

    public tx0(AtomicBoolean atomicBoolean, kowloon kowloonVar) {
        this.a = atomicBoolean;
        this.b = kowloonVar;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.a.getAndSet(true)) {
            return;
        }
        impassible impassibleVar = this.b;
        Result.Companion companion = Result.INSTANCE;
        impassibleVar.resumeWith(Result.m3351constructorimpl(new rn0(error, k41.ADAPTER_INITIALIZATION_ERROR)));
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        if (this.a.getAndSet(true)) {
            return;
        }
        impassible impassibleVar = this.b;
        Result.Companion companion = Result.INSTANCE;
        impassibleVar.resumeWith(Result.m3351constructorimpl(new tn0(Unit.f29295attabal)));
    }
}
