package p002kotlin.reflect.jvm.internal.impl.descriptors;

import pussyfooter.attabal;

/* JADX INFO: compiled from: ClassKind.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum ClassKind {
    CLASS("class"),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY(null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");


    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final /* synthetic */ attabal f29893arytenoidectomy = p002kotlin.enums.attabal.attabal(attabal());
    private final String codeRepresentation;

    ClassKind(String str) {
        this.codeRepresentation = str;
    }

    public final boolean isSingleton() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
