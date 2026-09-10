package kotlin.reflect.jvm.internal.impl.types;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p005e.a;

/* JADX INFO: loaded from: classes7.dex */
public final class ExpandedTypeUtilsKt {
    public static final KotlinTypeMarker a(KotlinTypeMarker receiver, HashSet hashSet) {
        KotlinTypeMarker kotlinTypeMarkerA;
        SimpleClassicTypeSystemContext simpleClassicTypeSystemContext = SimpleClassicTypeSystemContext.f44576a;
        TypeConstructor typeConstructorO = simpleClassicTypeSystemContext.O(receiver);
        if (!hashSet.add(typeConstructorO)) {
            return null;
        }
        TypeParameterDescriptor typeParameterDescriptorT = ClassicTypeSystemContext.DefaultImpls.t(typeConstructorO);
        if (typeParameterDescriptorT != null) {
            if (!(typeParameterDescriptorT instanceof TypeParameterDescriptor)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(typeParameterDescriptorT);
                sb.append(", ");
                throw new IllegalArgumentException(a.b(Reflection.f43333a, typeParameterDescriptorT.getClass(), sb).toString());
            }
            KotlinTypeMarker kotlinTypeMarkerG = TypeUtilsKt.g(typeParameterDescriptorT);
            KotlinTypeMarker kotlinTypeMarkerA2 = a(kotlinTypeMarkerG, hashSet);
            if (kotlinTypeMarkerA2 == null) {
                return null;
            }
            boolean z2 = ClassicTypeSystemContext.DefaultImpls.E(simpleClassicTypeSystemContext.O(kotlinTypeMarkerG)) || ((kotlinTypeMarkerG instanceof SimpleTypeMarker) && ClassicTypeSystemContext.DefaultImpls.K((SimpleTypeMarker) kotlinTypeMarkerG));
            if ((kotlinTypeMarkerA2 instanceof SimpleTypeMarker) && ClassicTypeSystemContext.DefaultImpls.K((SimpleTypeMarker) kotlinTypeMarkerA2) && ClassicTypeSystemContext.DefaultImpls.J(receiver) && z2) {
                return simpleClassicTypeSystemContext.p0(kotlinTypeMarkerG);
            }
            return (!ClassicTypeSystemContext.DefaultImpls.J(kotlinTypeMarkerA2) && (receiver instanceof SimpleTypeMarker) && ClassicTypeSystemContext.DefaultImpls.H((SimpleTypeMarker) receiver)) ? simpleClassicTypeSystemContext.p0(kotlinTypeMarkerA2) : kotlinTypeMarkerA2;
        }
        if (ClassicTypeSystemContext.DefaultImpls.E(typeConstructorO)) {
            Intrinsics.f(receiver, "$receiver");
            if (!(receiver instanceof KotlinType)) {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(receiver);
                sb2.append(", ");
                throw new IllegalArgumentException(a.b(Reflection.f43333a, receiver.getClass(), sb2).toString());
            }
            SimpleType simpleTypeF = InlineClassesUtilsKt.f((KotlinType) receiver);
            if (simpleTypeF == null || (kotlinTypeMarkerA = a(simpleTypeF, hashSet)) == null) {
                return null;
            }
            if (!ClassicTypeSystemContext.DefaultImpls.J(receiver)) {
                return kotlinTypeMarkerA;
            }
            if (!ClassicTypeSystemContext.DefaultImpls.J(kotlinTypeMarkerA) && (!(kotlinTypeMarkerA instanceof SimpleTypeMarker) || !ClassicTypeSystemContext.DefaultImpls.K((SimpleTypeMarker) kotlinTypeMarkerA))) {
                return simpleClassicTypeSystemContext.p0(kotlinTypeMarkerA);
            }
        }
        return receiver;
    }
}
