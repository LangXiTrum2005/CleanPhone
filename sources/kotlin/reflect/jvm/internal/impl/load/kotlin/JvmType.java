package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: loaded from: classes7.dex */
public abstract class JvmType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Primitive f44000a = new Primitive(JvmPrimitiveType.BOOLEAN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Primitive f44001b = new Primitive(JvmPrimitiveType.CHAR);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Primitive f44002c = new Primitive(JvmPrimitiveType.BYTE);
    public static final Primitive d = new Primitive(JvmPrimitiveType.SHORT);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Primitive f44003e = new Primitive(JvmPrimitiveType.INT);
    public static final Primitive f = new Primitive(JvmPrimitiveType.FLOAT);
    public static final Primitive g = new Primitive(JvmPrimitiveType.LONG);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Primitive f44004h = new Primitive(JvmPrimitiveType.DOUBLE);

    public static final class Array extends JvmType {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final JvmType f44005i;

        public Array(JvmType elementType) {
            Intrinsics.f(elementType, "elementType");
            this.f44005i = elementType;
        }
    }

    public static final class Companion {
    }

    public static final class Object extends JvmType {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f44006i;

        public Object(String internalName) {
            Intrinsics.f(internalName, "internalName");
            this.f44006i = internalName;
        }
    }

    public static final class Primitive extends JvmType {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final JvmPrimitiveType f44007i;

        public Primitive(JvmPrimitiveType jvmPrimitiveType) {
            this.f44007i = jvmPrimitiveType;
        }
    }

    public final String toString() {
        return JvmTypeFactoryImpl.c(this);
    }
}
