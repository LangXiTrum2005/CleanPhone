package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MemberKindCheck implements Check {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44613a;

    public static final class Member extends MemberKindCheck {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Member f44614b = new Member("must be a member function");

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public final boolean a(JavaMethodDescriptor javaMethodDescriptor) {
            return javaMethodDescriptor.k0 != null;
        }
    }

    public static final class MemberOrExtension extends MemberKindCheck {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final MemberOrExtension f44615b = new MemberOrExtension("must be a member or an extension function");

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public final boolean a(JavaMethodDescriptor javaMethodDescriptor) {
            return (javaMethodDescriptor.k0 == null && javaMethodDescriptor.j0 == null) ? false : true;
        }
    }

    public MemberKindCheck(String str) {
        this.f44613a = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String b(JavaMethodDescriptor javaMethodDescriptor) {
        return Check.DefaultImpls.a(this, javaMethodDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String getDescription() {
        return this.f44613a;
    }
}
