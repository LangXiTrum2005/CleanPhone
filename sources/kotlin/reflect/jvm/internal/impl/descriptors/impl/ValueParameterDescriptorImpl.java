package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes7.dex */
public class ValueParameterDescriptorImpl extends VariableDescriptorImpl implements ValueParameterDescriptor {
    public final int g0;
    public final boolean h0;
    public final boolean i0;
    public final boolean j0;
    public final KotlinType k0;
    public final ValueParameterDescriptor l0;

    public static final class Companion {
    }

    public static final class WithDestructuringDeclaration extends ValueParameterDescriptorImpl {
        public final Lazy m0;

        public WithDestructuringDeclaration(FunctionDescriptor functionDescriptor, ValueParameterDescriptor valueParameterDescriptor, int i2, Annotations annotations, Name name, KotlinType kotlinType, boolean z2, boolean z3, boolean z4, KotlinType kotlinType2, SourceElement sourceElement, Function0 function0) {
            super(functionDescriptor, valueParameterDescriptor, i2, annotations, name, kotlinType, z2, z3, z4, kotlinType2, sourceElement);
            this.m0 = LazyKt.b(function0);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
        public final ValueParameterDescriptor B(FunctionInvokeDescriptor functionInvokeDescriptor, Name name, int i2) {
            Annotations annotations = getAnnotations();
            Intrinsics.e(annotations, "annotations");
            KotlinType type = getType();
            Intrinsics.e(type, "type");
            boolean zU0 = u0();
            SourceElement sourceElement = SourceElement.f43591a;
            Function0<List<? extends VariableDescriptor>> function0 = new Function0<List<? extends VariableDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return (List) this.X.m0.getX();
                }
            };
            return new WithDestructuringDeclaration(functionInvokeDescriptor, null, i2, annotations, name, type, zU0, this.i0, this.j0, this.k0, sourceElement, function0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValueParameterDescriptorImpl(CallableDescriptor containingDeclaration, ValueParameterDescriptor valueParameterDescriptor, int i2, Annotations annotations, Name name, KotlinType outType, boolean z2, boolean z3, boolean z4, KotlinType kotlinType, SourceElement source) {
        super(containingDeclaration, annotations, name, outType, source);
        Intrinsics.f(containingDeclaration, "containingDeclaration");
        Intrinsics.f(annotations, "annotations");
        Intrinsics.f(name, "name");
        Intrinsics.f(outType, "outType");
        Intrinsics.f(source, "source");
        this.g0 = i2;
        this.h0 = z2;
        this.i0 = z3;
        this.j0 = z4;
        this.k0 = kotlinType;
        this.l0 = valueParameterDescriptor == null ? this : valueParameterDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public ValueParameterDescriptor B(FunctionInvokeDescriptor functionInvokeDescriptor, Name name, int i2) {
        Annotations annotations = getAnnotations();
        Intrinsics.e(annotations, "annotations");
        KotlinType type = getType();
        Intrinsics.e(type, "type");
        boolean zU0 = u0();
        SourceElement sourceElement = SourceElement.f43591a;
        return new ValueParameterDescriptorImpl(functionInvokeDescriptor, null, i2, annotations, name, type, zU0, this.i0, this.j0, this.k0, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public final boolean I() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final DeclarationDescriptorNonRoot b(TypeSubstitutor substitutor) {
        Intrinsics.f(substitutor, "substitutor");
        if (substitutor.f44551a.e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public final int g() {
        return this.g0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final DescriptorVisibility getVisibility() {
        DescriptorVisibility LOCAL = DescriptorVisibilities.f;
        Intrinsics.e(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public final /* bridge */ /* synthetic */ ConstantValue h0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public final boolean i0() {
        return this.j0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public final boolean k0() {
        return this.i0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final Collection l() {
        Collection collectionL = d().l();
        Intrinsics.e(collectionL, "containingDeclaration.overriddenDescriptors");
        Collection collection = collectionL;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((ValueParameterDescriptor) ((CallableDescriptor) it.next()).e().get(this.g0));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public final KotlinType o0() {
        return this.k0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public final boolean u0() {
        if (!this.h0) {
            return false;
        }
        CallableMemberDescriptor.Kind kind = ((CallableMemberDescriptor) d()).getKind();
        kind.getClass();
        return kind != CallableMemberDescriptor.Kind.f43557Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object v(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return declarationDescriptorVisitor.h(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final CallableDescriptor d() {
        DeclarationDescriptor declarationDescriptorD = super.d();
        Intrinsics.d(declarationDescriptorD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (CallableDescriptor) declarationDescriptorD;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    /* JADX INFO: renamed from: a */
    public final ValueParameterDescriptor y0() {
        ValueParameterDescriptor valueParameterDescriptor = this.l0;
        return valueParameterDescriptor == this ? this : valueParameterDescriptor.y0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public final VariableDescriptor b(TypeSubstitutor substitutor) {
        Intrinsics.f(substitutor, "substitutor");
        if (substitutor.f44551a.e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }
}
