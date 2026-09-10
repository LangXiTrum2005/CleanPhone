package milliradian;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: Density.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\u00020\u0003*\u00020\tH\u0017ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u0002*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0005J\u0016\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lmilliradian/wireman;", "Lmilliradian/apical;", "Lmilliradian/impromptu;", "", "restrictive", "(F)F", "", "arytenoidectomy", "(F)I", "Lmilliradian/graveside;", "graveside", "(J)F", "trm", "Lmilliradian/cutely;", "Lsupplicat/impassible;", "saran", "(J)J", "getDensity", "()F", "getDensity$annotations", "()V", "density", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface wireman extends apical {
    default int arytenoidectomy(float f) {
        float fRestrictive = restrictive(f);
        if (Float.isInfinite(fRestrictive)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fRestrictive);
    }

    float getDensity();

    default float graveside(long j) {
        if (dovishness.competently(graveside.competently(j), dovishness.INSTANCE.saneness())) {
            return restrictive(impromptu(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    default float restrictive(float f) {
        return f * getDensity();
    }

    default long saran(long j) {
        return j != 9205357640488583168L ? supplicat.triweekly.attabal(restrictive(cutely.wireman(j)), restrictive(cutely.dern(j))) : supplicat.impassible.INSTANCE.attabal();
    }

    default float trm(float f) {
        return impromptu.wireman(f / getDensity());
    }
}
