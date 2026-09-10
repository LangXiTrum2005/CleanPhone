package kotlin.jvm.internal;

import java.util.List;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes7.dex */
public class ReflectionFactory {
    public KFunction a(FunctionReference functionReference) {
        return functionReference;
    }

    public KClass b(Class cls) {
        return new ClassReference(cls);
    }

    public KDeclarationContainer c(Class cls, String str) {
        return new PackageReference(cls, str);
    }

    public KType d(KType kType) {
        TypeReference typeReference = (TypeReference) kType;
        KClassifier classifier = kType.getX();
        List arguments = kType.getF43338Y();
        typeReference.getClass();
        return new TypeReference(classifier, arguments, typeReference.Z | 2);
    }

    public KMutableProperty0 e(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public KMutableProperty1 f(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public KMutableProperty2 g(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    public KProperty0 h(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public KProperty1 i(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public KProperty2 j(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }

    public String k(FunctionBase functionBase) {
        String string = functionBase.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String l(Lambda lambda) {
        return k(lambda);
    }

    public KType m(KClass classifier, List arguments, boolean z2) {
        Intrinsics.f(classifier, "classifier");
        Intrinsics.f(arguments, "arguments");
        return new TypeReference(classifier, arguments, z2 ? 1 : 0);
    }
}
