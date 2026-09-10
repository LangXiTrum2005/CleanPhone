package org.jacoco.core.runtime;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import org.jacoco.core.internal.instr.InstrSupport;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
public class ModifiedSystemClassRuntime extends AbstractRuntime {
    private static final String ACCESS_FIELD_TYPE = "Ljava/lang/Object;";
    private final String accessFieldName;
    private final Class<?> systemClass;
    private final String systemClassName;

    public ModifiedSystemClassRuntime(Class<?> cls, String str) {
        this.systemClass = cls;
        this.systemClassName = cls.getName().replace('.', '/');
        this.accessFieldName = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void createDataField(ClassVisitor classVisitor, String str) {
        classVisitor.visitField(4233, str, ACCESS_FIELD_TYPE, null, null);
    }

    public static IRuntime createFor(Instrumentation instrumentation, String str) throws ClassNotFoundException {
        return createFor(instrumentation, str, "$jacocoAccess");
    }

    public static byte[] instrument(byte[] bArr, final String str) {
        ClassReader classReaderClassReaderFor = InstrSupport.classReaderFor(bArr);
        ClassWriter classWriter = new ClassWriter(classReaderClassReaderFor, 0);
        classReaderClassReaderFor.accept(new ClassVisitor(589824, classWriter) { // from class: org.jacoco.core.runtime.ModifiedSystemClassRuntime.2
            @Override // org.objectweb.asm.ClassVisitor
            public void visitEnd() {
                ModifiedSystemClassRuntime.createDataField(this.cv, str);
                super.visitEnd();
            }
        }, 8);
        return classWriter.toByteArray();
    }

    @Override // org.jacoco.core.runtime.IExecutionDataAccessorGenerator
    public int generateDataAccessor(long j, String str, int i, MethodVisitor methodVisitor) {
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, this.systemClassName, this.accessFieldName, ACCESS_FIELD_TYPE);
        RuntimeData.generateAccessCall(j, str, i, methodVisitor);
        return 6;
    }

    @Override // org.jacoco.core.runtime.AbstractRuntime, org.jacoco.core.runtime.IRuntime
    public void startup(RuntimeData runtimeData) throws Exception {
        super.startup(runtimeData);
        this.systemClass.getField(this.accessFieldName).set(null, runtimeData);
    }

    public static IRuntime createFor(Instrumentation instrumentation, final String str, final String str2) throws ClassNotFoundException {
        ClassFileTransformer classFileTransformer = new ClassFileTransformer() { // from class: org.jacoco.core.runtime.ModifiedSystemClassRuntime.1
            public byte[] transform(ClassLoader classLoader, String str3, Class<?> cls, ProtectionDomain protectionDomain, byte[] bArr) throws IllegalClassFormatException {
                if (str3.equals(str)) {
                    return ModifiedSystemClassRuntime.instrument(bArr, str2);
                }
                return null;
            }
        };
        instrumentation.addTransformer(classFileTransformer);
        Class<?> cls = Class.forName(str.replace('/', '.'));
        instrumentation.removeTransformer(classFileTransformer);
        try {
            cls.getField(str2);
            return new ModifiedSystemClassRuntime(cls, str2);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(String.format("Class %s could not be instrumented.", str), e);
        }
    }

    @Override // org.jacoco.core.runtime.IRuntime
    public void shutdown() {
    }
}
