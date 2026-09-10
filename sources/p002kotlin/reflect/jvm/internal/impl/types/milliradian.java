package p002kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: TypeProjectionBase.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class milliradian implements timberyard {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof timberyard)) {
            return false;
        }
        timberyard timberyardVar = (timberyard) obj;
        return saneness() == timberyardVar.saneness() && dern() == timberyardVar.dern() && getType().equals(timberyardVar.getType());
    }

    public int hashCode() {
        int iHashCode = dern().hashCode();
        if (nosophobia.gintrap(getType())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (saneness() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (saneness()) {
            return "*";
        }
        if (dern() == Variance.INVARIANT) {
            return getType().toString();
        }
        return dern() + " " + getType();
    }
}
