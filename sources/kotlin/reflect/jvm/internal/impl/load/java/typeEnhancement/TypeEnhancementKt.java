package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public final class TypeEnhancementKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Annotations f43957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnhancedTypeAnnotations f43958b;

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43959a;

        static {
            int[] iArr = new int[NullabilityQualifier.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f43959a = iArr;
        }
    }

    static {
        FqName ENHANCED_NULLABILITY_ANNOTATION = JvmAnnotationNames.f43773p;
        Intrinsics.e(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        f43957a = new EnhancedTypeAnnotations(ENHANCED_NULLABILITY_ANNOTATION);
        FqName ENHANCED_MUTABILITY_ANNOTATION = JvmAnnotationNames.q;
        Intrinsics.e(ENHANCED_MUTABILITY_ANNOTATION, "ENHANCED_MUTABILITY_ANNOTATION");
        f43958b = new EnhancedTypeAnnotations(ENHANCED_MUTABILITY_ANNOTATION);
    }
}
