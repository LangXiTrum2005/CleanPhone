package p002kotlin.coroutines.jvm.internal;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import org.jetbrains.annotations.NotNull;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DebugProbes.kt */
/* JADX INFO: loaded from: Boom+ClapC3C4E187n+thoBA%A1i_1.1.50_apkcombo.com.xapk:com.codejoy.boomclap.aos.apk:DebugProbesKt.bin */
@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0000¨\u0006\b"}, d2 = {"probeCoroutineCreated", "Lkotlin/coroutines/Continuation;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "completion", "probeCoroutineResumed", "", "frame", "probeCoroutineSuspended", "kotlinx-coroutines-integration-testing_debugAgentTest"})
public final class DebugProbesKt {
    @NotNull
    public static final <T> Continuation<T> probeCoroutineCreated(@NotNull Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        return DebugProbesImpl.INSTANCE.probeCoroutineCreated$kotlinx_coroutines_core(completion);
    }

    public static final void probeCoroutineResumed(@NotNull Continuation<?> frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        DebugProbesImpl.INSTANCE.probeCoroutineResumed$kotlinx_coroutines_core(frame);
    }

    public static final void probeCoroutineSuspended(@NotNull Continuation<?> frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        DebugProbesImpl.INSTANCE.probeCoroutineSuspended$kotlinx_coroutines_core(frame);
    }
}
