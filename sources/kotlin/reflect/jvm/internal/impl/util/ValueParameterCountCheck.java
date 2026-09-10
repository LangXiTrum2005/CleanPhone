package kotlin.reflect.jvm.internal.impl.util;

import android.support.v4.media.a;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ValueParameterCountCheck implements Check {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44637a;

    public static final class AtLeast extends ValueParameterCountCheck {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44638b;

        /* JADX WARN: Illegal instructions before constructor call */
        public AtLeast(int i2) {
            StringBuilder sbU = a.u(i2, "must have at least ", " value parameter");
            sbU.append(i2 > 1 ? "s" : "");
            super(sbU.toString());
            this.f44638b = i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public final boolean a(JavaMethodDescriptor javaMethodDescriptor) {
            return javaMethodDescriptor.e().size() >= this.f44638b;
        }
    }

    public static final class Equals extends ValueParameterCountCheck {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44639b;

        public Equals() {
            super("must have exactly 2 value parameters");
            this.f44639b = 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public final boolean a(JavaMethodDescriptor javaMethodDescriptor) {
            return javaMethodDescriptor.e().size() == this.f44639b;
        }
    }

    public static final class NoValueParameters extends ValueParameterCountCheck {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final NoValueParameters f44640b = new NoValueParameters("must have no value parameters");

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public final boolean a(JavaMethodDescriptor javaMethodDescriptor) {
            return javaMethodDescriptor.e().isEmpty();
        }
    }

    public static final class SingleValueParameter extends ValueParameterCountCheck {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final SingleValueParameter f44641b = new SingleValueParameter("must have a single value parameter");

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public final boolean a(JavaMethodDescriptor javaMethodDescriptor) {
            return javaMethodDescriptor.e().size() == 1;
        }
    }

    public ValueParameterCountCheck(String str) {
        this.f44637a = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String b(JavaMethodDescriptor javaMethodDescriptor) {
        return Check.DefaultImpls.a(this, javaMethodDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public final String getDescription() {
        return this.f44637a;
    }
}
