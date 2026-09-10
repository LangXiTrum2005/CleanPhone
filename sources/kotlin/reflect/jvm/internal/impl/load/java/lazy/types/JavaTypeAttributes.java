package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;

/* JADX INFO: loaded from: classes7.dex */
public final class JavaTypeAttributes extends ErasureTypeAttributes {
    public final TypeUsage d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JavaTypeFlexibility f43900e;
    public final boolean f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f43901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SimpleType f43902i;

    public /* synthetic */ JavaTypeAttributes(TypeUsage typeUsage, boolean z2, boolean z3, Set set, int i2) {
        this(typeUsage, JavaTypeFlexibility.X, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? null : set, null);
    }

    public static JavaTypeAttributes e(JavaTypeAttributes javaTypeAttributes, JavaTypeFlexibility javaTypeFlexibility, boolean z2, Set set, SimpleType simpleType, int i2) {
        TypeUsage howThisTypeIsUsed = javaTypeAttributes.d;
        if ((i2 & 2) != 0) {
            javaTypeFlexibility = javaTypeAttributes.f43900e;
        }
        JavaTypeFlexibility flexibility = javaTypeFlexibility;
        if ((i2 & 4) != 0) {
            z2 = javaTypeAttributes.f;
        }
        boolean z3 = z2;
        boolean z4 = javaTypeAttributes.g;
        if ((i2 & 16) != 0) {
            set = javaTypeAttributes.f43901h;
        }
        Set set2 = set;
        if ((i2 & 32) != 0) {
            simpleType = javaTypeAttributes.f43902i;
        }
        javaTypeAttributes.getClass();
        Intrinsics.f(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.f(flexibility, "flexibility");
        return new JavaTypeAttributes(howThisTypeIsUsed, flexibility, z3, z4, set2, simpleType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public final SimpleType a() {
        return this.f43902i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public final TypeUsage b() {
        return this.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public final Set c() {
        return this.f43901h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public final ErasureTypeAttributes d(TypeParameterDescriptor typeParameter) {
        Intrinsics.f(typeParameter, "typeParameter");
        Set set = this.f43901h;
        return e(this, null, false, set != null ? SetsKt.g(set, typeParameter) : SetsKt.h(typeParameter), null, 47);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public final boolean equals(Object obj) {
        if (!(obj instanceof JavaTypeAttributes)) {
            return false;
        }
        JavaTypeAttributes javaTypeAttributes = (JavaTypeAttributes) obj;
        return Intrinsics.a(javaTypeAttributes.f43902i, this.f43902i) && javaTypeAttributes.d == this.d && javaTypeAttributes.f43900e == this.f43900e && javaTypeAttributes.f == this.f && javaTypeAttributes.g == this.g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public final int hashCode() {
        SimpleType simpleType = this.f43902i;
        int iHashCode = simpleType != null ? simpleType.hashCode() : 0;
        int iHashCode2 = this.d.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.f43900e.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i2 = (iHashCode3 * 31) + (this.f ? 1 : 0) + iHashCode3;
        return (i2 * 31) + (this.g ? 1 : 0) + i2;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.d + ", flexibility=" + this.f43900e + ", isRaw=" + this.f + ", isForAnnotationParameter=" + this.g + ", visitedTypeParameters=" + this.f43901h + ", defaultType=" + this.f43902i + ')';
    }

    public JavaTypeAttributes(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z2, boolean z3, Set set, SimpleType simpleType) {
        super(typeUsage, set, simpleType);
        this.d = typeUsage;
        this.f43900e = javaTypeFlexibility;
        this.f = z2;
        this.g = z3;
        this.f43901h = set;
        this.f43902i = simpleType;
    }
}
