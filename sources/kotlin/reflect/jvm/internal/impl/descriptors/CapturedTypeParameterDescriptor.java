package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes7.dex */
final class CapturedTypeParameterDescriptor implements TypeParameterDescriptor {
    public final TypeParameterDescriptor X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ClassifierDescriptorWithTypeParameters f43558Y;
    public final int Z;

    public CapturedTypeParameterDescriptor(TypeParameterDescriptor typeParameterDescriptor, ClassifierDescriptorWithTypeParameters declarationDescriptor, int i2) {
        Intrinsics.f(declarationDescriptor, "declarationDescriptor");
        this.X = typeParameterDescriptor;
        this.f43558Y = declarationDescriptor;
        this.Z = i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final StorageManager H() {
        return this.X.H();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final boolean L() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    public final ClassifierDescriptor y0() {
        return this.X.y0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final DeclarationDescriptor d() {
        return this.f43558Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public final SourceElement f() {
        return this.X.f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final int g() {
        return this.X.g() + this.Z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public final Annotations getAnnotations() {
        return this.X.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public final Name getName() {
        return this.X.getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final List getUpperBounds() {
        return this.X.getUpperBounds();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final TypeConstructor h() {
        return this.X.h();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final Variance j() {
        return this.X.j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final SimpleType o() {
        return this.X.o();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public final boolean t() {
        return this.X.t();
    }

    public final String toString() {
        return this.X + "[inner-copy]";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public final Object v(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return this.X.v(declarationDescriptorVisitor, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    public final DeclarationDescriptor y0() {
        return this.X.y0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    public final TypeParameterDescriptor y0() {
        return this.X.y0();
    }
}
