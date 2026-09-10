package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes7.dex */
public class AnnotationDescriptorImpl implements AnnotationDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleType f43606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f43607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SourceElement f43608c;

    public AnnotationDescriptorImpl(SimpleType simpleType, Map map, SourceElement sourceElement) {
        if (simpleType == null) {
            d(0);
            throw null;
        }
        if (map == null) {
            d(1);
            throw null;
        }
        this.f43606a = simpleType;
        this.f43607b = map;
        this.f43608c = sourceElement;
    }

    public static /* synthetic */ void d(int i2) {
        String str = (i2 == 3 || i2 == 4 || i2 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 3 || i2 == 4 || i2 == 5) ? 2 : 3];
        if (i2 == 1) {
            objArr[0] = "valueArguments";
        } else if (i2 == 2) {
            objArr[0] = "source";
        } else if (i2 == 3 || i2 == 4 || i2 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i2 == 3) {
            objArr[1] = "getType";
        } else if (i2 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i2 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i2 != 3 && i2 != 4 && i2 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i2 != 3 && i2 != 4 && i2 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final Map a() {
        Map map = this.f43607b;
        if (map != null) {
            return map;
        }
        d(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final FqName c() {
        ClassDescriptor classDescriptorD = DescriptorUtilsKt.d(this);
        if (classDescriptorD != null) {
            if (ErrorUtils.f(classDescriptorD)) {
                classDescriptorD = null;
            }
            if (classDescriptorD != null) {
                return DescriptorUtilsKt.c(classDescriptorD);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final SourceElement f() {
        SourceElement sourceElement = this.f43608c;
        if (sourceElement != null) {
            return sourceElement;
        }
        d(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final KotlinType getType() {
        SimpleType simpleType = this.f43606a;
        if (simpleType != null) {
            return simpleType;
        }
        d(3);
        throw null;
    }

    public final String toString() {
        return DescriptorRenderer.f44237a.y(this, null);
    }
}
