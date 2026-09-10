package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.dovishness;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AbstractSharedFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/flow/internal/molybdenite;", "Lkotlinx/coroutines/flow/dovishness;", "", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "initialValue", "<init>", "(I)V", "delta", "", "permissivist", "(I)Z", "dent", "()Ljava/lang/Integer;", "value", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class molybdenite extends SharedFlowImpl<Integer> implements dovishness<Integer> {
    public molybdenite(int i) {
        super(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
        attabal(Integer.valueOf(i));
    }

    @Override // kotlinx.coroutines.flow.dovishness
    /* JADX INFO: renamed from: dent, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(seminary().intValue());
        }
        return numValueOf;
    }

    public final boolean permissivist(int delta) {
        boolean zAttabal;
        synchronized (this) {
            zAttabal = attabal(Integer.valueOf(seminary().intValue() + delta));
        }
        return zAttabal;
    }
}
