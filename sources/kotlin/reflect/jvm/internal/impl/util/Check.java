package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;

/* JADX INFO: loaded from: classes7.dex */
public interface Check {

    public static final class DefaultImpls {
        public static String a(Check check, JavaMethodDescriptor javaMethodDescriptor) {
            if (check.a(javaMethodDescriptor)) {
                return null;
            }
            return check.getDescription();
        }
    }

    boolean a(JavaMethodDescriptor javaMethodDescriptor);

    String b(JavaMethodDescriptor javaMethodDescriptor);

    String getDescription();
}
