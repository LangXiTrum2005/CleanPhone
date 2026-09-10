package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;

/* JADX INFO: loaded from: classes7.dex */
public final class JavaAnnotationTargetMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f43810a = MapsKt.j(new Pair("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), new Pair("TYPE", EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE)), new Pair("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS)), new Pair("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER)), new Pair("FIELD", EnumSet.of(KotlinTarget.FIELD)), new Pair("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE)), new Pair("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER)), new Pair("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR)), new Pair("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER)), new Pair("TYPE_USE", EnumSet.of(KotlinTarget.TYPE)));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f43811b = MapsKt.j(new Pair("RUNTIME", KotlinRetention.X), new Pair("CLASS", KotlinRetention.f43619Y), new Pair("SOURCE", KotlinRetention.Z));

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public static ArrayValue a(List arguments) {
        Intrinsics.f(arguments, "arguments");
        ArrayList arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof JavaEnumValueAnnotationArgument) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) f43810a.get(((JavaEnumValueAnnotationArgument) it.next()).e().b());
            if (iterable == null) {
                iterable = EmptySet.X;
            }
            CollectionsKt.g(iterable, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.n(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new EnumValue(ClassId.j(StandardNames.FqNames.f43505u), Name.g(((KotlinTarget) it2.next()).name())));
        }
        return new ArrayValue(arrayList3, JavaAnnotationTargetMapper$mapJavaTargetArguments$1.X);
    }
}
