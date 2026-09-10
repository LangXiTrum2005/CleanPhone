package p002kotlin.reflect.jvm.internal.impl.descriptors;

import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Modality.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum Modality {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;


    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final /* synthetic */ pussyfooter.attabal f29895arytenoidectomy = p002kotlin.enums.attabal.attabal(attabal());
    public static final attabal Companion = new attabal(null);

    /* JADX INFO: compiled from: Modality.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Modality attabal(boolean z, boolean z2, boolean z3) {
            if (z) {
                return Modality.SEALED;
            }
            if (z2) {
                return Modality.ABSTRACT;
            }
            return z3 ? Modality.OPEN : Modality.FINAL;
        }

        public attabal() {
        }
    }
}
