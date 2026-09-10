package kotlin.reflect.jvm.internal.impl.types;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* JADX INFO: loaded from: classes7.dex */
public class ErasureTypeAttributes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeUsage f44506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f44507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SimpleType f44508c;

    public ErasureTypeAttributes(TypeUsage howThisTypeIsUsed, Set set, SimpleType simpleType) {
        Intrinsics.f(howThisTypeIsUsed, "howThisTypeIsUsed");
        this.f44506a = howThisTypeIsUsed;
        this.f44507b = set;
        this.f44508c = simpleType;
    }

    public SimpleType a() {
        return this.f44508c;
    }

    public TypeUsage b() {
        return this.f44506a;
    }

    public Set c() {
        return this.f44507b;
    }

    public ErasureTypeAttributes d(TypeParameterDescriptor typeParameter) {
        Intrinsics.f(typeParameter, "typeParameter");
        TypeUsage typeUsageB = b();
        Set setC = c();
        return new ErasureTypeAttributes(typeUsageB, setC != null ? SetsKt.g(setC, typeParameter) : SetsKt.h(typeParameter), a());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ErasureTypeAttributes)) {
            return false;
        }
        ErasureTypeAttributes erasureTypeAttributes = (ErasureTypeAttributes) obj;
        return Intrinsics.a(erasureTypeAttributes.a(), a()) && erasureTypeAttributes.b() == b();
    }

    public int hashCode() {
        SimpleType simpleTypeA = a();
        int iHashCode = simpleTypeA != null ? simpleTypeA.hashCode() : 0;
        return b().hashCode() + (iHashCode * 31) + iHashCode;
    }
}
