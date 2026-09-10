package org.objectweb.asm.commons;

import java.util.ArrayList;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes5.dex */
public class SignatureRemapper extends SignatureVisitor {
    private ArrayList<String> classNames;
    private final Remapper remapper;
    private final SignatureVisitor signatureVisitor;

    public SignatureRemapper(SignatureVisitor signatureVisitor, Remapper remapper) {
        this(589824, signatureVisitor, remapper);
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitArrayType() {
        this.signatureVisitor.visitArrayType();
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitBaseType(char c) {
        this.signatureVisitor.visitBaseType(c);
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitClassBound() {
        this.signatureVisitor.visitClassBound();
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitClassType(String str) {
        this.classNames.add(str);
        this.signatureVisitor.visitClassType(this.remapper.mapType(str));
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitEnd() {
        this.signatureVisitor.visitEnd();
        ArrayList<String> arrayList = this.classNames;
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitExceptionType() {
        this.signatureVisitor.visitExceptionType();
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitFormalTypeParameter(String str) {
        this.signatureVisitor.visitFormalTypeParameter(str);
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitInnerClassType(String str) {
        ArrayList<String> arrayList = this.classNames;
        String strRemove = arrayList.remove(arrayList.size() - 1);
        String str2 = strRemove + '$' + str;
        this.classNames.add(str2);
        String str3 = this.remapper.mapType(strRemove) + '$';
        String strMapType = this.remapper.mapType(str2);
        this.signatureVisitor.visitInnerClassType(strMapType.substring(strMapType.startsWith(str3) ? str3.length() : strMapType.lastIndexOf(36) + 1));
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitInterface() {
        this.signatureVisitor.visitInterface();
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitInterfaceBound() {
        this.signatureVisitor.visitInterfaceBound();
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitParameterType() {
        this.signatureVisitor.visitParameterType();
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitReturnType() {
        this.signatureVisitor.visitReturnType();
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitSuperclass() {
        this.signatureVisitor.visitSuperclass();
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitTypeArgument() {
        this.signatureVisitor.visitTypeArgument();
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitTypeVariable(String str) {
        this.signatureVisitor.visitTypeVariable(str);
    }

    public SignatureRemapper(int i, SignatureVisitor signatureVisitor, Remapper remapper) {
        super(i);
        this.classNames = new ArrayList<>();
        this.signatureVisitor = signatureVisitor;
        this.remapper = remapper;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitTypeArgument(char c) {
        this.signatureVisitor.visitTypeArgument(c);
        return this;
    }
}
