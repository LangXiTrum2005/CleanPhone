package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import p005e.a;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractSignatureParts<TAnnotation> {

    public static final class TypeAndDefaultQualifiers {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KotlinTypeMarker f43912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final JavaTypeQualifiersByElementType f43913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TypeParameterMarker f43914c;

        public TypeAndDefaultQualifiers(KotlinTypeMarker kotlinTypeMarker, JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, TypeParameterMarker typeParameterMarker) {
            this.f43912a = kotlinTypeMarker;
            this.f43913b = javaTypeQualifiersByElementType;
            this.f43914c = typeParameterMarker;
        }
    }

    public static void a(Object obj, ArrayList arrayList, Function1 function1) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) ((AbstractSignatureParts$toIndexed$1$1) function1).invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next(), arrayList, function1);
            }
        }
    }

    public abstract AnnotationTypeQualifierResolver b();

    public abstract Annotations c(KotlinTypeMarker kotlinTypeMarker);

    /* JADX WARN: Code duplicated, block: B:34:0x007f  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Code duplicated, block: B:68:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[LOOP:1: B:32:0x0079->B:69:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    public final NullabilityQualifierWithMigrationStatus d(TypeParameterMarker receiver) {
        ?? arrayList;
        NullabilityQualifier nullabilityQualifier;
        Iterator it;
        Iterator it2;
        KotlinType kotlinTypeF;
        if (!i(receiver)) {
            return null;
        }
        Intrinsics.f(receiver, "$receiver");
        if (!(receiver instanceof TypeParameterDescriptor)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(receiver);
            sb.append(", ");
            throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb).toString());
        }
        List upperBounds = ((TypeParameterDescriptor) receiver).getUpperBounds();
        Intrinsics.e(upperBounds, "this.upperBounds");
        List list = upperBounds;
        boolean z2 = list instanceof Collection;
        if (z2 && list.isEmpty()) {
            return null;
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            if (!ClassicTypeSystemContext.DefaultImpls.D((KotlinTypeMarker) it3.next())) {
                if (z2 && list.isEmpty()) {
                    if (!z2) {
                    }
                    it = list.iterator();
                    while (it.hasNext()) {
                        if (f((KotlinTypeMarker) it.next()) != null) {
                            arrayList = new ArrayList();
                            it2 = list.iterator();
                            while (it2.hasNext()) {
                                kotlinTypeF = f((KotlinTypeMarker) it2.next());
                                if (kotlinTypeF != null) {
                                    arrayList.add(kotlinTypeF);
                                }
                            }
                        }
                    }
                    return null;
                }
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        if (!z2 && list.isEmpty()) {
                            return null;
                        }
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (f((KotlinTypeMarker) it.next()) != null) {
                                arrayList = new ArrayList();
                                it2 = list.iterator();
                                while (it2.hasNext()) {
                                    kotlinTypeF = f((KotlinTypeMarker) it2.next());
                                    if (kotlinTypeF != null) {
                                        arrayList.add(kotlinTypeF);
                                    }
                                }
                            }
                        }
                        return null;
                    }
                    if (g((KotlinTypeMarker) it4.next()) != null) {
                        arrayList = upperBounds;
                    }
                }
                Iterable iterable = (Iterable) arrayList;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it5 = iterable.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            nullabilityQualifier = NullabilityQualifier.f43930Y;
                            break;
                        }
                        if (!ClassicTypeSystemContext.DefaultImpls.J((KotlinTypeMarker) it5.next())) {
                            nullabilityQualifier = NullabilityQualifier.Z;
                            break;
                        }
                    }
                } else {
                    nullabilityQualifier = NullabilityQualifier.f43930Y;
                    break;
                }
                return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, arrayList != upperBounds);
            }
        }
        return null;
    }

    public abstract JavaTypeQualifiersByElementType e();

    public abstract KotlinType f(KotlinTypeMarker kotlinTypeMarker);

    public final NullabilityQualifier g(KotlinTypeMarker kotlinTypeMarker) {
        SimpleClassicTypeSystemContext simpleClassicTypeSystemContext = SimpleClassicTypeSystemContext.f44576a;
        if (ClassicTypeSystemContext.DefaultImpls.H(simpleClassicTypeSystemContext.i0(kotlinTypeMarker))) {
            return NullabilityQualifier.f43930Y;
        }
        if (ClassicTypeSystemContext.DefaultImpls.H(simpleClassicTypeSystemContext.n(kotlinTypeMarker))) {
            return null;
        }
        return NullabilityQualifier.Z;
    }

    public abstract boolean h();

    public abstract boolean i(TypeParameterMarker typeParameterMarker);

    public final ArrayList j(KotlinTypeMarker kotlinTypeMarker) {
        SimpleClassicTypeSystemContext simpleClassicTypeSystemContext = SimpleClassicTypeSystemContext.f44576a;
        TypeAndDefaultQualifiers typeAndDefaultQualifiers = new TypeAndDefaultQualifiers(kotlinTypeMarker, b().b(e(), c(kotlinTypeMarker)), null);
        AbstractSignatureParts$toIndexed$1$1 abstractSignatureParts$toIndexed$1$1 = new AbstractSignatureParts$toIndexed$1$1(this, simpleClassicTypeSystemContext);
        ArrayList arrayList = new ArrayList(1);
        a(typeAndDefaultQualifiers, arrayList, abstractSignatureParts$toIndexed$1$1);
        return arrayList;
    }
}
