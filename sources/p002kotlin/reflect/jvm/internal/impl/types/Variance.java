package p002kotlin.reflect.jvm.internal.impl.types;

import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import pussyfooter.attabal;

/* JADX INFO: compiled from: Variance.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum Variance {
    INVARIANT("", true, true, 0),
    IN_VARIANCE(ScarConstants.IN_SIGNAL_KEY, true, false, -1),
    OUT_VARIANCE("out", false, true, 1);


    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final /* synthetic */ attabal f31702arytenoidectomy = p002kotlin.enums.attabal.attabal(attabal());
    private final boolean allowsInPosition;
    private final boolean allowsOutPosition;
    private final String label;
    private final int superpositionFactor;

    Variance(String str, boolean z, boolean z2, int i) {
        this.label = str;
        this.allowsInPosition = z;
        this.allowsOutPosition = z2;
        this.superpositionFactor = i;
    }

    public final boolean getAllowsOutPosition() {
        return this.allowsOutPosition;
    }

    public final String getLabel() {
        return this.label;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.label;
    }
}
