package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes7.dex */
public enum KotlinTarget {
    CLASS(true),
    ANNOTATION_CLASS(true),
    TYPE_PARAMETER(false),
    PROPERTY(true),
    FIELD(true),
    LOCAL_VARIABLE(true),
    VALUE_PARAMETER(true),
    CONSTRUCTOR(true),
    FUNCTION(true),
    PROPERTY_GETTER(true),
    PROPERTY_SETTER(true),
    TYPE(false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPRESSION(false),
    FILE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TYPEALIAS(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    /* JADX INFO: Fake field, exist only in values array */
    STAR_PROJECTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    PROPERTY_PARAMETER(false),
    CLASS_ONLY(false),
    OBJECT(false),
    STANDALONE_OBJECT(false),
    COMPANION_OBJECT(false),
    INTERFACE(false),
    ENUM_CLASS(false),
    ENUM_ENTRY(false),
    LOCAL_CLASS(false),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITH_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE(false),
    /* JADX INFO: Fake field, exist only in values array */
    BACKING_FIELD(true),
    /* JADX INFO: Fake field, exist only in values array */
    INITIALIZER(false),
    /* JADX INFO: Fake field, exist only in values array */
    DESTRUCTURING_DECLARATION(false),
    /* JADX INFO: Fake field, exist only in values array */
    LAMBDA_EXPRESSION(false),
    /* JADX INFO: Fake field, exist only in values array */
    ANONYMOUS_FUNCTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT_LITERAL(false);


    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final HashMap f43620Y = new HashMap();
    public static final List Z;
    public static final List e0;
    public static final List f0;
    public static final List g0;
    public static final List h0;
    public static final List i0;
    public static final List j0;
    public static final List k0;
    public static final List l0;
    public static final List m0;
    public static final List n0;
    public static final List o0;
    public static final Object p0;
    public final boolean X;

    public static final class Companion {
    }

    static {
        for (KotlinTarget kotlinTarget : values()) {
            f43620Y.put(kotlinTarget.name(), kotlinTarget);
        }
        KotlinTarget[] kotlinTargetArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (KotlinTarget kotlinTarget2 : kotlinTargetArrValues) {
            if (kotlinTarget2.X) {
                arrayList.add(kotlinTarget2);
            }
        }
        CollectionsKt.l0(arrayList);
        ArraysKt.O(values());
        KotlinTarget kotlinTarget3 = ANNOTATION_CLASS;
        KotlinTarget kotlinTarget4 = CLASS;
        Z = CollectionsKt.I(kotlinTarget3, kotlinTarget4);
        e0 = CollectionsKt.I(LOCAL_CLASS, kotlinTarget4);
        f0 = CollectionsKt.I(CLASS_ONLY, kotlinTarget4);
        KotlinTarget kotlinTarget5 = COMPANION_OBJECT;
        KotlinTarget kotlinTarget6 = OBJECT;
        g0 = CollectionsKt.I(kotlinTarget5, kotlinTarget6, kotlinTarget4);
        h0 = CollectionsKt.I(STANDALONE_OBJECT, kotlinTarget6, kotlinTarget4);
        i0 = CollectionsKt.I(INTERFACE, kotlinTarget4);
        j0 = CollectionsKt.I(ENUM_CLASS, kotlinTarget4);
        KotlinTarget kotlinTarget7 = ENUM_ENTRY;
        KotlinTarget kotlinTarget8 = PROPERTY;
        KotlinTarget kotlinTarget9 = FIELD;
        k0 = CollectionsKt.I(kotlinTarget7, kotlinTarget8, kotlinTarget9);
        KotlinTarget kotlinTarget10 = PROPERTY_SETTER;
        l0 = CollectionsKt.H(kotlinTarget10);
        KotlinTarget kotlinTarget11 = PROPERTY_GETTER;
        m0 = CollectionsKt.H(kotlinTarget11);
        n0 = CollectionsKt.H(FUNCTION);
        KotlinTarget kotlinTarget12 = FILE;
        o0 = CollectionsKt.H(kotlinTarget12);
        AnnotationUseSiteTarget annotationUseSiteTarget = AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER;
        KotlinTarget kotlinTarget13 = VALUE_PARAMETER;
        p0 = MapsKt.j(new Pair(annotationUseSiteTarget, kotlinTarget13), new Pair(AnnotationUseSiteTarget.FIELD, kotlinTarget9), new Pair(AnnotationUseSiteTarget.PROPERTY, kotlinTarget8), new Pair(AnnotationUseSiteTarget.FILE, kotlinTarget12), new Pair(AnnotationUseSiteTarget.PROPERTY_GETTER, kotlinTarget11), new Pair(AnnotationUseSiteTarget.PROPERTY_SETTER, kotlinTarget10), new Pair(AnnotationUseSiteTarget.RECEIVER, kotlinTarget13), new Pair(AnnotationUseSiteTarget.SETTER_PARAMETER, kotlinTarget13), new Pair(AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD, kotlinTarget9));
    }

    KotlinTarget(boolean z2) {
        this.X = z2;
    }
}
