package com.google.common.collect;

import com.google.common.base.Function;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class ByFunctionOrdering<F, T> extends Ordering<F> implements Serializable {
    private static final long serialVersionUID = 0;
    public final Function X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Ordering f19796Y;

    public ByFunctionOrdering(Function function, Ordering ordering) {
        this.X = function;
        ordering.getClass();
        this.f19796Y = ordering;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Function function = this.X;
        return this.f19796Y.compare(function.apply(obj), function.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByFunctionOrdering) {
            ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) obj;
            if (this.X.equals(byFunctionOrdering.X) && this.f19796Y.equals(byFunctionOrdering.f19796Y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.X, this.f19796Y});
    }

    public final String toString() {
        return this.f19796Y + ".onResultOf(" + this.X + ")";
    }
}
