package milliradian;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: IntOffset.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001a\u0016\u0010\u000b\u001a\u00020\u0003*\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"", "x", "y", "Lmilliradian/impassible;", "attabal", "(II)J", "Lsupplicat/competently;", "offset", "dern", "(JJ)J", "saneness", "wireman", "(J)J", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class triweekly {
    public static final long attabal(int i, int i2) {
        return impassible.saneness((((long) i2) & 4294967295L) | (((long) i) << 32));
    }

    public static final long dern(long j, long j2) {
        return supplicat.impromptu.attabal(supplicat.competently.apical(j) + impassible.wireman(j2), supplicat.competently.formularize(j) + impassible.marial(j2));
    }

    public static final long saneness(long j, long j2) {
        return supplicat.impromptu.attabal(supplicat.competently.apical(j) - impassible.wireman(j2), supplicat.competently.formularize(j) - impassible.marial(j2));
    }

    public static final long wireman(long j) {
        int iRound = Math.round(supplicat.competently.apical(j));
        return impassible.saneness((((long) Math.round(supplicat.competently.formularize(j))) & 4294967295L) | (((long) iRound) << 32));
    }
}
