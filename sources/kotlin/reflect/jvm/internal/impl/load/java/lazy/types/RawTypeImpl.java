package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class RawTypeImpl extends FlexibleType implements RawType {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawTypeImpl(SimpleType lowerBound, SimpleType upperBound) {
        super(lowerBound, upperBound);
        Intrinsics.f(lowerBound, "lowerBound");
        Intrinsics.f(upperBound, "upperBound");
        KotlinTypeChecker.f44562a.d(lowerBound, upperBound);
    }

    public static final ArrayList R0(DescriptorRendererImpl descriptorRendererImpl, KotlinType kotlinType) {
        List listF0 = kotlinType.F0();
        ArrayList arrayList = new ArrayList(CollectionsKt.n(listF0, 10));
        Iterator it = listF0.iterator();
        while (it.hasNext()) {
            arrayList.add(descriptorRendererImpl.g0((TypeProjection) it.next()));
        }
        return arrayList;
    }

    public static final String S0(String str, String str2) {
        if (!StringsKt.m(str, '<')) {
            return str;
        }
        return StringsKt.S(str, '<') + '<' + str2 + '>' + StringsKt.Q('>', str, str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType L0(boolean z2) {
        return new RawTypeImpl(this.f44509Y.L0(z2), this.Z.L0(z2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final UnwrappedType N0(TypeAttributes newAttributes) {
        Intrinsics.f(newAttributes, "newAttributes");
        return new RawTypeImpl(this.f44509Y.N0(newAttributes), this.Z.N0(newAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final SimpleType O0() {
        return this.f44509Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final String P0(DescriptorRendererImpl descriptorRendererImpl, DescriptorRendererImpl descriptorRendererImpl2) {
        SimpleType simpleType = this.f44509Y;
        String strA0 = descriptorRendererImpl.a0(simpleType);
        SimpleType simpleType2 = this.Z;
        String strA1 = descriptorRendererImpl.a0(simpleType2);
        if (descriptorRendererImpl2.d.p()) {
            return "raw (" + strA0 + ".." + strA1 + ')';
        }
        if (simpleType2.F0().isEmpty()) {
            return descriptorRendererImpl.G(strA0, strA1, TypeUtilsKt.f(this));
        }
        ArrayList arrayListR0 = R0(descriptorRendererImpl, simpleType);
        ArrayList arrayListR1 = R0(descriptorRendererImpl, simpleType2);
        String strD = CollectionsKt.D(arrayListR0, ", ", null, null, RawTypeImpl$render$newArgs$1.X, 30);
        ArrayList arrayListN0 = CollectionsKt.n0(arrayListR0, arrayListR1);
        if (!arrayListN0.isEmpty()) {
            Iterator it = arrayListN0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strA1 = S0(strA1, strD);
                    break;
                }
                Pair pair = (Pair) it.next();
                String str = (String) pair.X;
                String str2 = (String) pair.f43249Y;
                if (!Intrinsics.a(str, StringsKt.D(str2, "out ")) && !str2.equals("*")) {
                    break;
                }
            }
        } else {
            strA1 = S0(strA1, strD);
            break;
        }
        String strS0 = S0(strA0, strD);
        return Intrinsics.a(strS0, strA1) ? strS0 : descriptorRendererImpl.G(strS0, strA1, TypeUtilsKt.f(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final FlexibleType J0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new RawTypeImpl((SimpleType) kotlinTypeRefiner.a(this.f44509Y), (SimpleType) kotlinTypeRefiner.a(this.Z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final MemberScope n() {
        ClassifierDescriptor classifierDescriptorC = H0().c();
        ClassDescriptor classDescriptor = classifierDescriptorC instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorC : null;
        if (classDescriptor != null) {
            MemberScope memberScopeJ0 = classDescriptor.j0(new RawSubstitution());
            Intrinsics.e(memberScopeJ0, "classDescriptor.getMemberScope(RawSubstitution())");
            return memberScopeJ0;
        }
        throw new IllegalStateException(("Incorrect classifier: " + H0().c()).toString());
    }
}
