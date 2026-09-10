package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CompositionLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0007\u001a\u00028\u0000H ¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\f\u0010\nJ3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\rH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/unconsolidated;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/preprohormone;", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "value", "Landroidx/compose/runtime/claque;", "dern", "(Ljava/lang/Object;)Landroidx/compose/runtime/claque;", "wireman", "marial", "Landroidx/compose/runtime/hydromechanics;", "previous", "saneness", "(Landroidx/compose/runtime/claque;Landroidx/compose/runtime/hydromechanics;)Landroidx/compose/runtime/hydromechanics;", "beachfront", "(Landroidx/compose/runtime/claque;)Landroidx/compose/runtime/hydromechanics;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class unconsolidated<T> extends preprohormone<T> {
    public unconsolidated(Function0<? extends T> function0) {
        super(function0, null);
    }

    public final hydromechanics<T> beachfront(claque<T> value) {
        if (!value.getIsDynamic()) {
            if (value.dern() != null) {
                return new ComputedValueHolder(value.dern());
            }
            return value.beachfront() != null ? new DynamicValueHolder(value.beachfront()) : new StaticValueHolder(value.wireman());
        }
        czestochowa<T> czestochowaVarBeachfront = value.beachfront();
        if (czestochowaVarBeachfront == null) {
            T tCompetently = value.competently();
            tailoring<T> tailoringVarMarial = value.marial();
            if (tailoringVarMarial == null) {
                tailoringVarMarial = liable.competently();
            }
            czestochowaVarBeachfront = liable.dern(tCompetently, tailoringVarMarial);
        }
        return new DynamicValueHolder(czestochowaVarBeachfront);
    }

    public abstract claque<T> dern(T value);

    public final claque<T> marial(T value) {
        return dern(value).impromptu();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[PHI: r5
  0x0034: PHI (r5v2 java.lang.Object) = (r5v5 java.lang.Object), (r5v6 java.lang.Object) binds: [B:17:0x0044, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.runtime.preprohormone
    public hydromechanics<T> saneness(claque<T> value, hydromechanics<T> previous) {
        ComputedValueHolder computedValueHolder;
        StaticValueHolder staticValueHolder;
        DynamicValueHolder dynamicValueHolder = null;
        if (previous instanceof DynamicValueHolder) {
            if (value.getIsDynamic()) {
                dynamicValueHolder = (DynamicValueHolder) previous;
                dynamicValueHolder.saneness().setValue(value.wireman());
            }
        } else if (previous instanceof StaticValueHolder) {
            if (value.cutely()) {
                staticValueHolder = (StaticValueHolder) previous;
                if (Intrinsics.wireman(value.wireman(), staticValueHolder.saneness())) {
                    Object obj = computedValueHolder;
                    obj = staticValueHolder;
                    dynamicValueHolder = (hydromechanics<T>) obj;
                }
            }
        } else if (previous instanceof ComputedValueHolder) {
            computedValueHolder = (ComputedValueHolder) previous;
            if (value.dern() == computedValueHolder.saneness()) {
                Object obj2 = computedValueHolder;
                obj2 = staticValueHolder;
                dynamicValueHolder = (hydromechanics<T>) obj2;
            }
        }
        return dynamicValueHolder == null ? beachfront(value) : dynamicValueHolder;
    }

    public final claque<T> wireman(T value) {
        return dern(value);
    }
}
