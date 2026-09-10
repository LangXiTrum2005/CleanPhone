package p002kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.ironsource.X3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.graveside;
import p002kotlin.collections.polloi;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import patroclinal.formularize;

/* JADX INFO: compiled from: KotlinTarget.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum KotlinTarget {
    CLASS("class", false, 2, null),
    ANNOTATION_CLASS("annotation class", false, 2, null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, null),
    FIELD("field", false, 2, null),
    LOCAL_VARIABLE("local variable", false, 2, null),
    VALUE_PARAMETER("value parameter", false, 2, null),
    CONSTRUCTOR("constructor", false, 2, null),
    FUNCTION("function", false, 2, null),
    PROPERTY_GETTER("getter", false, 2, null),
    PROPERTY_SETTER("setter", false, 2, null),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE(X3.i.b, false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY("class", false),
    OBJECT("object", false),
    STANDALONE_OBJECT("standalone object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    BACKING_FIELD("backing field", false, 2, null),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);


    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final List<KotlinTarget> f29928adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final Set<KotlinTarget> f29929arytenoidectomy;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public static final List<KotlinTarget> f29930cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public static final List<KotlinTarget> f29931cuirassed;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final List<KotlinTarget> f29932dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public static final List<KotlinTarget> f29933gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final List<KotlinTarget> f29934graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final List<KotlinTarget> f29936molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final Set<KotlinTarget> f29937monoploid;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public static final Map<AnnotationUseSiteTarget, KotlinTarget> f29938oilcan;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final List<KotlinTarget> f29939polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public static final List<KotlinTarget> f29940preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public static final List<KotlinTarget> f29941rotuma;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public static final List<KotlinTarget> f29943stratoscope;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public static final List<KotlinTarget> f29944trm;
    private final String description;
    private final boolean isDefault;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public static final /* synthetic */ pussyfooter.attabal f29942sealless = p002kotlin.enums.attabal.attabal(attabal());
    public static final attabal Companion = new attabal(null);

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final HashMap<String, KotlinTarget> f29935kowloon = new HashMap<>();

    /* JADX INFO: compiled from: KotlinTarget.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public attabal() {
        }
    }

    static {
        for (KotlinTarget kotlinTarget : values()) {
            f29935kowloon.put(kotlinTarget.name(), kotlinTarget);
        }
        KotlinTarget[] kotlinTargetArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (KotlinTarget kotlinTarget2 : kotlinTargetArrValues) {
            if (kotlinTarget2.isDefault) {
                arrayList.add(kotlinTarget2);
            }
        }
        f29929arytenoidectomy = CollectionsKt.prefect(arrayList);
        f29937monoploid = polloi.lampshade(values());
        KotlinTarget kotlinTarget3 = ANNOTATION_CLASS;
        KotlinTarget kotlinTarget4 = CLASS;
        f29939polloi = adultoid.kowloon(kotlinTarget3, kotlinTarget4);
        f29936molybdenite = adultoid.kowloon(LOCAL_CLASS, kotlinTarget4);
        f29934graveside = adultoid.kowloon(CLASS_ONLY, kotlinTarget4);
        KotlinTarget kotlinTarget5 = COMPANION_OBJECT;
        KotlinTarget kotlinTarget6 = OBJECT;
        f29928adultoid = adultoid.kowloon(kotlinTarget5, kotlinTarget6, kotlinTarget4);
        f29932dovishness = adultoid.kowloon(STANDALONE_OBJECT, kotlinTarget6, kotlinTarget4);
        f29933gintrap = adultoid.kowloon(INTERFACE, kotlinTarget4);
        f29941rotuma = adultoid.kowloon(ENUM_CLASS, kotlinTarget4);
        KotlinTarget kotlinTarget7 = ENUM_ENTRY;
        KotlinTarget kotlinTarget8 = PROPERTY;
        KotlinTarget kotlinTarget9 = FIELD;
        f29940preprohormone = adultoid.kowloon(kotlinTarget7, kotlinTarget8, kotlinTarget9);
        KotlinTarget kotlinTarget10 = PROPERTY_SETTER;
        f29930cord = graveside.marial(kotlinTarget10);
        KotlinTarget kotlinTarget11 = PROPERTY_GETTER;
        f29931cuirassed = graveside.marial(kotlinTarget11);
        f29943stratoscope = graveside.marial(FUNCTION);
        KotlinTarget kotlinTarget12 = FILE;
        f29944trm = graveside.marial(kotlinTarget12);
        AnnotationUseSiteTarget annotationUseSiteTarget = AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER;
        KotlinTarget kotlinTarget13 = VALUE_PARAMETER;
        f29938oilcan = seminary.impassible(formularize.attabal(annotationUseSiteTarget, kotlinTarget13), formularize.attabal(AnnotationUseSiteTarget.FIELD, kotlinTarget9), formularize.attabal(AnnotationUseSiteTarget.PROPERTY, kotlinTarget8), formularize.attabal(AnnotationUseSiteTarget.FILE, kotlinTarget12), formularize.attabal(AnnotationUseSiteTarget.PROPERTY_GETTER, kotlinTarget11), formularize.attabal(AnnotationUseSiteTarget.PROPERTY_SETTER, kotlinTarget10), formularize.attabal(AnnotationUseSiteTarget.RECEIVER, kotlinTarget13), formularize.attabal(AnnotationUseSiteTarget.SETTER_PARAMETER, kotlinTarget13), formularize.attabal(AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD, kotlinTarget9));
    }

    KotlinTarget(String str, boolean z) {
        this.description = str;
        this.isDefault = z;
    }

    /* synthetic */ KotlinTarget(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
