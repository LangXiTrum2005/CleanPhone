package p002kotlin.reflect.jvm.internal.impl.types.model;

import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import pussyfooter.attabal;

/* JADX INFO: compiled from: TypeSystemContext.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum TypeVariance {
    IN(ScarConstants.IN_SIGNAL_KEY),
    OUT("out"),
    INV("");


    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final /* synthetic */ attabal f31786arytenoidectomy = p002kotlin.enums.attabal.attabal(attabal());
    private final String presentation;

    TypeVariance(String str) {
        this.presentation = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.presentation;
    }
}
