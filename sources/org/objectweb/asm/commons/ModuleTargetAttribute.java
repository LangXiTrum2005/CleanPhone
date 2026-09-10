package org.objectweb.asm.commons;

import org.objectweb.asm.Attribute;
import org.objectweb.asm.ByteVector;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;

/* JADX INFO: loaded from: classes5.dex */
public final class ModuleTargetAttribute extends Attribute {
    public String platform;

    public ModuleTargetAttribute(String str) {
        super("ModuleTarget");
        this.platform = str;
    }

    @Override // org.objectweb.asm.Attribute
    public Attribute read(ClassReader classReader, int i, int i2, char[] cArr, int i3, Label[] labelArr) {
        return new ModuleTargetAttribute(classReader.readUTF8(i, cArr));
    }

    @Override // org.objectweb.asm.Attribute
    public ByteVector write(ClassWriter classWriter, byte[] bArr, int i, int i2, int i3) {
        ByteVector byteVector = new ByteVector();
        String str = this.platform;
        byteVector.putShort(str == null ? 0 : classWriter.newUTF8(str));
        return byteVector;
    }

    public ModuleTargetAttribute() {
        this(null);
    }
}
