package kotlinx.coroutines.debug.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private {
    private volatile /* synthetic */ int installations$volatile;
    private volatile /* synthetic */ long sequenceNumber$volatile;

    static {
        AtomicIntegerFieldUpdater.newUpdater(DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.class, "installations$volatile");
        AtomicLongFieldUpdater.newUpdater(DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.class, "sequenceNumber$volatile");
    }
}
