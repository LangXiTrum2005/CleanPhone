package org.objectweb.asm.commons;

import org.objectweb.asm.Attribute;
import org.objectweb.asm.ByteVector;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;

/* JADX INFO: loaded from: classes5.dex */
public final class ModuleResolutionAttribute extends Attribute {
    public static final int RESOLUTION_DO_NOT_RESOLVE_BY_DEFAULT = 1;
    public static final int RESOLUTION_WARN_DEPRECATED = 2;
    public static final int RESOLUTION_WARN_DEPRECATED_FOR_REMOVAL = 4;
    public static final int RESOLUTION_WARN_INCUBATING = 8;
    public int resolution;

    public ModuleResolutionAttribute(int i) {
        super("ModuleResolution");
        this.resolution = i;
    }

    @Override // org.objectweb.asm.Attribute
    public Attribute read(ClassReader classReader, int i, int i2, char[] cArr, int i3, Label[] labelArr) {
        return new ModuleResolutionAttribute(classReader.readUnsignedShort(i));
    }

    @Override // org.objectweb.asm.Attribute
    public ByteVector write(ClassWriter classWriter, byte[] bArr, int i, int i2, int i3) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(this.resolution);
        return byteVector;
    }

    public ModuleResolutionAttribute() {
        this(0);
    }
}
