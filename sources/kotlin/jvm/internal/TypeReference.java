package kotlin.jvm.internal;

import android.support.v4.media.a;
import androidx.room.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KVariance;
import kotlinx.serialization.internal.CollectionDescriptorsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/jvm/internal/TypeReference;", "Lkotlin/reflect/KType;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TypeReference implements KType {
    public final KClassifier X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final List f43338Y;
    public final int Z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lkotlin/jvm/internal/TypeReference$Companion;", "", "", "IS_MARKED_NULLABLE", "I", "IS_MUTABLE_COLLECTION_TYPE", "IS_NOTHING_TYPE", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43339a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                KVariance kVariance = KVariance.X;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KVariance kVariance2 = KVariance.X;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KVariance kVariance3 = KVariance.X;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43339a = iArr;
        }
    }

    public TypeReference(KClassifier classifier, List arguments, int i2) {
        Intrinsics.f(classifier, "classifier");
        Intrinsics.f(arguments, "arguments");
        this.X = classifier;
        this.f43338Y = arguments;
        this.Z = i2;
    }

    public final String a(boolean z2) {
        String name;
        KClassifier kClassifier = this.X;
        KClass kClass = kClassifier instanceof KClass ? (KClass) kClassifier : null;
        Class clsB = kClass != null ? JvmClassMappingKt.b(kClass) : null;
        if (clsB == null) {
            name = kClassifier.toString();
        } else if ((this.Z & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsB.isArray()) {
            if (clsB.equals(boolean[].class)) {
                name = "kotlin.BooleanArray";
            } else if (clsB.equals(char[].class)) {
                name = "kotlin.CharArray";
            } else if (clsB.equals(byte[].class)) {
                name = "kotlin.ByteArray";
            } else if (clsB.equals(short[].class)) {
                name = "kotlin.ShortArray";
            } else if (clsB.equals(int[].class)) {
                name = "kotlin.IntArray";
            } else if (clsB.equals(float[].class)) {
                name = "kotlin.FloatArray";
            } else if (clsB.equals(long[].class)) {
                name = "kotlin.LongArray";
            } else {
                name = clsB.equals(double[].class) ? "kotlin.DoubleArray" : CollectionDescriptorsKt.ARRAY_NAME;
            }
        } else if (z2 && clsB.isPrimitive()) {
            Intrinsics.d(kClassifier, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = JvmClassMappingKt.c((KClass) kClassifier).getName();
        } else {
            name = clsB.getName();
        }
        List list = this.f43338Y;
        return a.D(name, list.isEmpty() ? "" : CollectionsKt.D(list, ", ", "<", ">", new b(this, 15), 24), isMarkedNullable() ? "?" : "");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeReference)) {
            return false;
        }
        TypeReference typeReference = (TypeReference) obj;
        return Intrinsics.a(this.X, typeReference.X) && Intrinsics.a(this.f43338Y, typeReference.f43338Y) && this.Z == typeReference.Z;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        return EmptyList.X;
    }

    @Override // kotlin.reflect.KType
    /* JADX INFO: renamed from: getArguments, reason: from getter */
    public final List getF43338Y() {
        return this.f43338Y;
    }

    @Override // kotlin.reflect.KType
    /* JADX INFO: renamed from: getClassifier, reason: from getter */
    public final KClassifier getX() {
        return this.X;
    }

    public final int hashCode() {
        return Integer.hashCode(this.Z) + androidx.media3.extractor.text.ttml.a.c(this.X.hashCode() * 31, 31, this.f43338Y);
    }

    @Override // kotlin.reflect.KType
    public final boolean isMarkedNullable() {
        return (this.Z & 1) != 0;
    }

    public final String toString() {
        return a(false) + " (Kotlin reflection is not available)";
    }
}
