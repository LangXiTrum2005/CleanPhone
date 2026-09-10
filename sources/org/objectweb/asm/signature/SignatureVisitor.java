package org.objectweb.asm.signature;

/* JADX INFO: loaded from: classes5.dex */
public abstract class SignatureVisitor {
    public static final char EXTENDS = '+';
    public static final char INSTANCEOF = '=';
    public static final char SUPER = '-';
    protected final int api;

    public SignatureVisitor(int i) {
        if (i == 589824 || i == 524288 || i == 458752 || i == 393216 || i == 327680 || i == 262144 || i == 17432576) {
            this.api = i;
            return;
        }
        throw new IllegalArgumentException("Unsupported api " + i);
    }

    public SignatureVisitor visitTypeArgument(char c) {
        return this;
    }

    public void visitTypeArgument() {
    }

    public SignatureVisitor visitArrayType() {
        return this;
    }

    public SignatureVisitor visitClassBound() {
        return this;
    }

    public void visitEnd() {
    }

    public SignatureVisitor visitExceptionType() {
        return this;
    }

    public SignatureVisitor visitInterface() {
        return this;
    }

    public SignatureVisitor visitInterfaceBound() {
        return this;
    }

    public SignatureVisitor visitParameterType() {
        return this;
    }

    public SignatureVisitor visitReturnType() {
        return this;
    }

    public SignatureVisitor visitSuperclass() {
        return this;
    }

    public void visitBaseType(char c) {
    }

    public void visitClassType(String str) {
    }

    public void visitFormalTypeParameter(String str) {
    }

    public void visitInnerClassType(String str) {
    }

    public void visitTypeVariable(String str) {
    }
}
