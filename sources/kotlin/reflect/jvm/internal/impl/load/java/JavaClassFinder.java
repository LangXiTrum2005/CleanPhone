package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: loaded from: classes7.dex */
public interface JavaClassFinder {

    public static final class Request {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClassId f43739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f43740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final JavaClass f43741c;

        public Request(ClassId classId, JavaClass javaClass, int i2) {
            javaClass = (i2 & 4) != 0 ? null : javaClass;
            this.f43739a = classId;
            this.f43740b = null;
            this.f43741c = javaClass;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return Intrinsics.a(this.f43739a, request.f43739a) && Intrinsics.a(this.f43740b, request.f43740b) && Intrinsics.a(this.f43741c, request.f43741c);
        }

        public final int hashCode() {
            int iHashCode = this.f43739a.hashCode() * 31;
            byte[] bArr = this.f43740b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            JavaClass javaClass = this.f43741c;
            return iHashCode2 + (javaClass != null ? javaClass.hashCode() : 0);
        }

        public final String toString() {
            return "Request(classId=" + this.f43739a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f43740b) + ", outerClass=" + this.f43741c + ')';
        }
    }
}
