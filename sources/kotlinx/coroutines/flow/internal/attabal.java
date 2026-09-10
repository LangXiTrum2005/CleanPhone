package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlinx.coroutines.flow.dovishness;
import kotlinx.coroutines.flow.internal.dern;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AbstractSharedFlow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b2\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0011\u0010\u0012R8\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b2\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lkotlinx/coroutines/flow/internal/attabal;", "Lkotlinx/coroutines/flow/internal/dern;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "taiyuan", "()Lkotlinx/coroutines/flow/internal/dern;", "", "size", "", "cutely", "(I)[Lkotlinx/coroutines/flow/internal/dern;", "competently", "slot", "", "apical", "(Lkotlinx/coroutines/flow/internal/dern;)V", "value", "kowloon", "[Lkotlinx/coroutines/flow/internal/dern;", "impassible", "()[Lkotlinx/coroutines/flow/internal/dern;", "slots", "arytenoidectomy", "I", "formularize", "()I", "nCollectors", "monoploid", "nextIndex", "Lkotlinx/coroutines/flow/internal/molybdenite;", "polloi", "Lkotlinx/coroutines/flow/internal/molybdenite;", "_subscriptionCount", "Lkotlinx/coroutines/flow/dovishness;", "dern", "()Lkotlinx/coroutines/flow/dovishness;", "subscriptionCount", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class attabal<S extends dern<?>> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public int nCollectors;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public S[] slots;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public int nextIndex;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public molybdenite _subscriptionCount;

    public final void apical(S slot) {
        molybdenite molybdeniteVar;
        int i;
        wretchedly.dern<Unit>[] dernVarArrSaneness;
        synchronized (this) {
            try {
                int i2 = this.nCollectors - 1;
                this.nCollectors = i2;
                molybdeniteVar = this._subscriptionCount;
                if (i2 == 0) {
                    this.nextIndex = 0;
                }
                Intrinsics.competently(slot, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                dernVarArrSaneness = slot.saneness(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (wretchedly.dern<Unit> dernVar : dernVarArrSaneness) {
            if (dernVar != null) {
                Result.Companion companion = Result.INSTANCE;
                dernVar.resumeWith(Result.m3351constructorimpl(Unit.f29295attabal));
            }
        }
        if (molybdeniteVar != null) {
            molybdeniteVar.permissivist(-1);
        }
    }

    public final S competently() {
        S s;
        molybdenite molybdeniteVar;
        synchronized (this) {
            try {
                S[] sArr = this.slots;
                if (sArr == null) {
                    sArr = (S[]) cutely(2);
                    this.slots = sArr;
                } else if (this.nCollectors >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.slots = (S[]) ((dern[]) objArrCopyOf);
                    sArr = (S[]) ((dern[]) objArrCopyOf);
                }
                int i = this.nextIndex;
                do {
                    s = sArr[i];
                    if (s == null) {
                        s = (S) taiyuan();
                        sArr[i] = s;
                    }
                    i++;
                    if (i >= sArr.length) {
                        i = 0;
                    }
                    Intrinsics.competently(s, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!s.attabal(this));
                this.nextIndex = i;
                this.nCollectors++;
                molybdeniteVar = this._subscriptionCount;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (molybdeniteVar != null) {
            molybdeniteVar.permissivist(1);
        }
        return s;
    }

    public abstract S[] cutely(int size);

    public final dovishness<Integer> dern() {
        molybdenite molybdeniteVar;
        synchronized (this) {
            molybdeniteVar = this._subscriptionCount;
            if (molybdeniteVar == null) {
                molybdeniteVar = new molybdenite(this.nCollectors);
                this._subscriptionCount = molybdeniteVar;
            }
        }
        return molybdeniteVar;
    }

    /* JADX INFO: renamed from: formularize, reason: from getter */
    public final int getNCollectors() {
        return this.nCollectors;
    }

    public final S[] impassible() {
        return this.slots;
    }

    public abstract S taiyuan();
}
