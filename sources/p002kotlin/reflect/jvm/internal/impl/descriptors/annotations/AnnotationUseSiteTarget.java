package p002kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import pussyfooter.attabal;

/* JADX INFO: compiled from: AnnotationUseSiteTarget.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum AnnotationUseSiteTarget {
    FIELD(null, 1, null),
    FILE(null, 1, null),
    PROPERTY(null, 1, null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(0 == true ? 1 : 0, 1, null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");


    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final /* synthetic */ attabal f29913arytenoidectomy = p002kotlin.enums.attabal.attabal(attabal());
    private final String renderName;

    AnnotationUseSiteTarget(String str) {
        this.renderName = str == null ? saccharine.attabal.beachfront(name()) : str;
    }

    public final String getRenderName() {
        return this.renderName;
    }

    /* synthetic */ AnnotationUseSiteTarget(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
