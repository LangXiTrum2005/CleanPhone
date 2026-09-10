package kotlinx.coroutines.debug;

import java.lang.instrument.ClassFileTransformer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/debug/AgentPremain;", "", "DebugProbesTransformer", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AgentPremain {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/debug/AgentPremain$DebugProbesTransformer;", "Ljava/lang/instrument/ClassFileTransformer;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DebugProbesTransformer implements ClassFileTransformer {
    }

    static {
        Object objA;
        try {
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            objA = property != null ? Boolean.valueOf(Boolean.parseBoolean(property)) : null;
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        if (((Boolean) (objA instanceof Result.Failure ? null : objA)) != null) {
            return;
        }
        DebugProbesImpl debugProbesImpl = DebugProbesImpl.f44852a;
    }
}
