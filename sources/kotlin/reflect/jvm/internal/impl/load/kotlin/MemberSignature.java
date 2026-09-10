package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.media3.extractor.text.ttml.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;

/* JADX INFO: loaded from: classes7.dex */
public final class MemberSignature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44012a;

    public static final class Companion {
        public static MemberSignature a(String name, String desc) {
            Intrinsics.f(name, "name");
            Intrinsics.f(desc, "desc");
            return new MemberSignature(name + '#' + desc);
        }

        public static MemberSignature b(JvmMemberSignature jvmMemberSignature) {
            if (jvmMemberSignature instanceof JvmMemberSignature.Method) {
                JvmMemberSignature.Method method = (JvmMemberSignature.Method) jvmMemberSignature;
                return d(method.f44152a, method.f44153b);
            }
            if (!(jvmMemberSignature instanceof JvmMemberSignature.Field)) {
                throw new NoWhenBranchMatchedException();
            }
            JvmMemberSignature.Field field = (JvmMemberSignature.Field) jvmMemberSignature;
            return a(field.f44150a, field.f44151b);
        }

        public static MemberSignature c(NameResolver nameResolver, JvmProtoBuf.JvmMethodSignature jvmMethodSignature) {
            Intrinsics.f(nameResolver, "nameResolver");
            return d(nameResolver.getString(jvmMethodSignature.Z), nameResolver.getString(jvmMethodSignature.e0));
        }

        public static MemberSignature d(String name, String desc) {
            Intrinsics.f(name, "name");
            Intrinsics.f(desc, "desc");
            return new MemberSignature(name.concat(desc));
        }

        public static MemberSignature e(MemberSignature memberSignature, int i2) {
            return new MemberSignature(memberSignature.f44012a + '@' + i2);
        }
    }

    public MemberSignature(String str) {
        this.f44012a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MemberSignature) && Intrinsics.a(this.f44012a, ((MemberSignature) obj).f44012a);
    }

    public final int hashCode() {
        return this.f44012a.hashCode();
    }

    public final String toString() {
        return a.p(new StringBuilder("MemberSignature(signature="), this.f44012a, ')');
    }
}
