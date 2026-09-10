package androidx.media3.common;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: AuxEffectInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f11081attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final float f11082saneness;

    public marial(int i, float f) {
        this.f11081attabal = i;
        this.f11082saneness = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && marial.class == obj.getClass()) {
            marial marialVar = (marial) obj;
            if (this.f11081attabal == marialVar.f11081attabal && Float.compare(marialVar.f11082saneness, this.f11082saneness) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f11081attabal) * 31) + Float.floatToIntBits(this.f11082saneness);
    }
}
