package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
public final class AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 implements KotlinJvmBinaryClass.MemberVisitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader f43964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f43965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KotlinJvmBinaryClass f43966c;

    public final class AnnotationVisitorForMethod extends MemberAnnotationVisitor implements KotlinJvmBinaryClass.MethodAnnotationVisitor {
        public AnnotationVisitorForMethod(MemberSignature memberSignature) {
            super(memberSignature);
        }

        public final KotlinJvmBinaryClass.AnnotationArgumentVisitor c(int i2, ClassId classId, ReflectAnnotationSource reflectAnnotationSource) {
            MemberSignature memberSignatureE = MemberSignature.Companion.e(this.f43967a, i2);
            AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1 = AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.this;
            List arrayList = (List) abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.f43965b.get(memberSignatureE);
            if (arrayList == null) {
                arrayList = new ArrayList();
                abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.f43965b.put(memberSignatureE, arrayList);
            }
            return abstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.f43964a.s(classId, reflectAnnotationSource, arrayList);
        }
    }

    public class MemberAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationVisitor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MemberSignature f43967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f43968b = new ArrayList();

        public MemberAnnotationVisitor(MemberSignature memberSignature) {
            this.f43967a = memberSignature;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
        public final void a() {
            ArrayList arrayList = this.f43968b;
            if (arrayList.isEmpty()) {
                return;
            }
            AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.this.f43965b.put(this.f43967a, arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
        public final KotlinJvmBinaryClass.AnnotationArgumentVisitor b(ClassId classId, ReflectAnnotationSource reflectAnnotationSource) {
            return AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1.this.f43964a.s(classId, reflectAnnotationSource, this.f43968b);
        }
    }

    public AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, HashMap map, KotlinJvmBinaryClass kotlinJvmBinaryClass, HashMap map2) {
        this.f43964a = abstractBinaryClassAnnotationAndConstantLoader;
        this.f43965b = map;
        this.f43966c = kotlinJvmBinaryClass;
    }

    public final AnnotationVisitorForMethod a(Name name, String str) {
        Intrinsics.f(name, "name");
        String strB = name.b();
        Intrinsics.e(strB, "name.asString()");
        return new AnnotationVisitorForMethod(MemberSignature.Companion.d(strB, str));
    }
}
