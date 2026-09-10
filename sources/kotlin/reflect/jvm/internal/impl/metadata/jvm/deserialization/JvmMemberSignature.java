package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public abstract class JvmMemberSignature {

    public static final class Field extends JvmMemberSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f44150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f44151b;

        public Field(String name, String desc) {
            Intrinsics.f(name, "name");
            Intrinsics.f(desc, "desc");
            this.f44150a = name;
            this.f44151b = desc;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        public final String a() {
            return this.f44150a + AbstractJsonLexerKt.COLON + this.f44151b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Field)) {
                return false;
            }
            Field field = (Field) obj;
            return Intrinsics.a(this.f44150a, field.f44150a) && Intrinsics.a(this.f44151b, field.f44151b);
        }

        public final int hashCode() {
            return this.f44151b.hashCode() + (this.f44150a.hashCode() * 31);
        }
    }

    public static final class Method extends JvmMemberSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f44152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f44153b;

        public Method(String name, String desc) {
            Intrinsics.f(name, "name");
            Intrinsics.f(desc, "desc");
            this.f44152a = name;
            this.f44153b = desc;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        public final String a() {
            return this.f44152a + this.f44153b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Method)) {
                return false;
            }
            Method method = (Method) obj;
            return Intrinsics.a(this.f44152a, method.f44152a) && Intrinsics.a(this.f44153b, method.f44153b);
        }

        public final int hashCode() {
            return this.f44153b.hashCode() + (this.f44152a.hashCode() * 31);
        }
    }

    public abstract String a();

    public final String toString() {
        return a();
    }
}
