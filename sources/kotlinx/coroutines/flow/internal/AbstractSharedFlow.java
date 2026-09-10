package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AbstractSharedFlow<S extends AbstractSharedFlowSlot<?>> {
    public AbstractSharedFlowSlot[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f44993Y;
    public int Z;
    public SubscriptionCountStateFlow e0;

    public final AbstractSharedFlowSlot c() {
        AbstractSharedFlowSlot abstractSharedFlowSlotE;
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            try {
                AbstractSharedFlowSlot[] abstractSharedFlowSlotArrF = this.X;
                if (abstractSharedFlowSlotArrF == null) {
                    abstractSharedFlowSlotArrF = f();
                    this.X = abstractSharedFlowSlotArrF;
                } else if (this.f44993Y >= abstractSharedFlowSlotArrF.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractSharedFlowSlotArrF, abstractSharedFlowSlotArrF.length * 2);
                    Intrinsics.e(objArrCopyOf, "copyOf(...)");
                    this.X = (AbstractSharedFlowSlot[]) objArrCopyOf;
                    abstractSharedFlowSlotArrF = (AbstractSharedFlowSlot[]) objArrCopyOf;
                }
                int i2 = this.Z;
                do {
                    abstractSharedFlowSlotE = abstractSharedFlowSlotArrF[i2];
                    if (abstractSharedFlowSlotE == null) {
                        abstractSharedFlowSlotE = e();
                        abstractSharedFlowSlotArrF[i2] = abstractSharedFlowSlotE;
                    }
                    i2++;
                    if (i2 >= abstractSharedFlowSlotArrF.length) {
                        i2 = 0;
                    }
                } while (!abstractSharedFlowSlotE.a(this));
                this.Z = i2;
                this.f44993Y++;
                subscriptionCountStateFlow = this.e0;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (subscriptionCountStateFlow != null) {
            subscriptionCountStateFlow.u(1);
        }
        return abstractSharedFlowSlotE;
    }

    public final StateFlow d() {
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            subscriptionCountStateFlow = this.e0;
            if (subscriptionCountStateFlow == null) {
                int i2 = this.f44993Y;
                subscriptionCountStateFlow = new SubscriptionCountStateFlow(1, Integer.MAX_VALUE, BufferOverflow.f44779Y);
                subscriptionCountStateFlow.a(Integer.valueOf(i2));
                this.e0 = subscriptionCountStateFlow;
            }
        }
        return subscriptionCountStateFlow;
    }

    public abstract AbstractSharedFlowSlot e();

    public abstract AbstractSharedFlowSlot[] f();

    public final void g(AbstractSharedFlowSlot abstractSharedFlowSlot) {
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        int i2;
        Continuation[] continuationArrB;
        synchronized (this) {
            try {
                int i3 = this.f44993Y - 1;
                this.f44993Y = i3;
                subscriptionCountStateFlow = this.e0;
                if (i3 == 0) {
                    this.Z = 0;
                }
                Intrinsics.d(abstractSharedFlowSlot, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                continuationArrB = abstractSharedFlowSlot.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArrB) {
            if (continuation != null) {
                continuation.resumeWith(Unit.f43263a);
            }
        }
        if (subscriptionCountStateFlow != null) {
            subscriptionCountStateFlow.u(-1);
        }
    }
}
