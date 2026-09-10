package starveling;

import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001e\u0010\f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Lstarveling/adultoid;", "", "attabal", "(Lstarveling/adultoid;)Z", "saneness", "marial", "ignoreConsumed", "Lsupplicat/competently;", "wireman", "(Lstarveling/adultoid;Z)J", "Lmilliradian/monoploid;", "size", "dern", "(Lstarveling/adultoid;J)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class triweekly {
    public static final boolean attabal(PointerInputChange pointerInputChange) {
        return !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed();
    }

    @patroclinal.wireman
    public static final boolean dern(PointerInputChange pointerInputChange, long j) {
        long position = pointerInputChange.getPosition();
        float fApical = supplicat.competently.apical(position);
        float fFormularize = supplicat.competently.formularize(position);
        return fApical < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fApical > ((float) milliradian.monoploid.competently(j)) || fFormularize < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fFormularize > ((float) milliradian.monoploid.beachfront(j));
    }

    public static final boolean marial(PointerInputChange pointerInputChange) {
        return !supplicat.competently.taiyuan(wireman(pointerInputChange, true), supplicat.competently.INSTANCE.dern());
    }

    public static final boolean saneness(PointerInputChange pointerInputChange) {
        return pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed();
    }

    public static final long wireman(PointerInputChange pointerInputChange, boolean z) {
        return (z || !pointerInputChange.apical()) ? supplicat.competently.kowloon(pointerInputChange.getPosition(), pointerInputChange.getPreviousPosition()) : supplicat.competently.INSTANCE.dern();
    }
}
