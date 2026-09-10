package org.objectweb.asm.commons;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;

/* JADX INFO: loaded from: classes5.dex */
public class LocalVariablesSorter extends MethodVisitor {
    private static final Type OBJECT_TYPE = Type.getObjectType("java/lang/Object");
    protected final int firstLocal;
    protected int nextLocal;
    private Object[] remappedLocalTypes;
    private int[] remappedVariableIndices;

    public LocalVariablesSorter(int i, String str, MethodVisitor methodVisitor) {
        this(589824, i, str, methodVisitor);
        if (getClass() != LocalVariablesSorter.class) {
            throw new IllegalStateException();
        }
    }

    private int remap(int i, Type type) {
        if (type.getSize() + i <= this.firstLocal) {
            return i;
        }
        int size = (i * 2) + type.getSize();
        int i2 = size - 1;
        int length = this.remappedVariableIndices.length;
        if (i2 >= length) {
            int[] iArr = new int[Math.max(length * 2, size)];
            System.arraycopy(this.remappedVariableIndices, 0, iArr, 0, length);
            this.remappedVariableIndices = iArr;
        }
        int i3 = this.remappedVariableIndices[i2];
        if (i3 != 0) {
            return i3 - 1;
        }
        int iNewLocalMapping = newLocalMapping(type);
        setLocalType(iNewLocalMapping, type);
        this.remappedVariableIndices[i2] = iNewLocalMapping + 1;
        return iNewLocalMapping;
    }

    private void setFrameLocal(int i, Object obj) {
        int length = this.remappedLocalTypes.length;
        if (i >= length) {
            Object[] objArr = new Object[Math.max(length * 2, i + 1)];
            System.arraycopy(this.remappedLocalTypes, 0, objArr, 0, length);
            this.remappedLocalTypes = objArr;
        }
        this.remappedLocalTypes[i] = obj;
    }

    public int newLocal(Type type) {
        Object descriptor;
        switch (type.getSort()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                descriptor = Opcodes.INTEGER;
                break;
            case 6:
                descriptor = Opcodes.FLOAT;
                break;
            case 7:
                descriptor = Opcodes.LONG;
                break;
            case 8:
                descriptor = Opcodes.DOUBLE;
                break;
            case 9:
                descriptor = type.getDescriptor();
                break;
            case 10:
                descriptor = type.getInternalName();
                break;
            default:
                throw new AssertionError();
        }
        int iNewLocalMapping = newLocalMapping(type);
        setLocalType(iNewLocalMapping, type);
        setFrameLocal(iNewLocalMapping, descriptor);
        return iNewLocalMapping;
    }

    public int newLocalMapping(Type type) {
        int i = this.nextLocal;
        this.nextLocal = type.getSize() + i;
        return i;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        Object[] objArr3;
        Object obj;
        if (i != -1) {
            throw new IllegalArgumentException("LocalVariablesSorter only accepts expanded frames (see ClassReader.EXPAND_FRAMES)");
        }
        Object[] objArr4 = this.remappedLocalTypes;
        int length = objArr4.length;
        Object[] objArr5 = new Object[length];
        int i4 = 0;
        System.arraycopy(objArr4, 0, objArr5, 0, length);
        updateNewLocals(this.remappedLocalTypes);
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = 2;
            if (i5 >= i2) {
                break;
            }
            Object obj2 = objArr[i5];
            if (obj2 != Opcodes.TOP) {
                Type objectType = OBJECT_TYPE;
                if (obj2 == Opcodes.INTEGER) {
                    objectType = Type.INT_TYPE;
                } else if (obj2 == Opcodes.FLOAT) {
                    objectType = Type.FLOAT_TYPE;
                } else if (obj2 == Opcodes.LONG) {
                    objectType = Type.LONG_TYPE;
                } else if (obj2 == Opcodes.DOUBLE) {
                    objectType = Type.DOUBLE_TYPE;
                } else if (obj2 instanceof String) {
                    objectType = Type.getObjectType((String) obj2);
                }
                setFrameLocal(remap(i6, objectType), obj2);
            }
            if (obj2 != Opcodes.LONG && obj2 != Opcodes.DOUBLE) {
                i7 = 1;
            }
            i6 += i7;
            i5++;
        }
        int i8 = 0;
        while (true) {
            int i9 = i8;
            while (true) {
                objArr3 = this.remappedLocalTypes;
                if (i4 >= objArr3.length) {
                    super.visitFrame(i, i9, objArr3, i3, objArr2);
                    this.remappedLocalTypes = objArr5;
                    return;
                }
                obj = objArr3[i4];
                i4 += (obj == Opcodes.LONG || obj == Opcodes.DOUBLE) ? 2 : 1;
                if (obj == null || obj == Opcodes.TOP) {
                    objArr3[i8] = Opcodes.TOP;
                    i8++;
                }
            }
            objArr3[i8] = obj;
            i8++;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i, int i2) {
        super.visitIincInsn(remap(i, Type.INT_TYPE), i2);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
        super.visitLocalVariable(str, str2, str3, label, label2, remap(i, Type.getType(str2)));
    }

    @Override // org.objectweb.asm.MethodVisitor
    public AnnotationVisitor visitLocalVariableAnnotation(int i, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z) {
        Type type = Type.getType(str);
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = remap(iArr[i2], type);
        }
        return super.visitLocalVariableAnnotation(i, typePath, labelArr, labelArr2, iArr2, str, z);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int i, int i2) {
        super.visitMaxs(i, this.nextLocal);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        Type type;
        if (i != 169) {
            switch (i) {
                case 21:
                    type = Type.INT_TYPE;
                    break;
                case 22:
                    type = Type.LONG_TYPE;
                    break;
                case 23:
                    type = Type.FLOAT_TYPE;
                    break;
                case 24:
                    type = Type.DOUBLE_TYPE;
                    break;
                case 25:
                    type = OBJECT_TYPE;
                    break;
                default:
                    switch (i) {
                        case 54:
                            type = Type.INT_TYPE;
                            break;
                        case 55:
                            type = Type.LONG_TYPE;
                            break;
                        case 56:
                            type = Type.FLOAT_TYPE;
                            break;
                        case 57:
                            type = Type.DOUBLE_TYPE;
                            break;
                        case 58:
                            type = OBJECT_TYPE;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid opcode " + i);
                    }
                    break;
            }
        } else {
            type = OBJECT_TYPE;
        }
        super.visitVarInsn(i, remap(i2, type));
    }

    public LocalVariablesSorter(int i, int i2, String str, MethodVisitor methodVisitor) {
        super(i, methodVisitor);
        this.remappedVariableIndices = new int[40];
        this.remappedLocalTypes = new Object[20];
        int i3 = i2 & 8;
        this.nextLocal = i3 == 0 ? 1 : 0;
        for (Type type : Type.getArgumentTypes(str)) {
            this.nextLocal += type.getSize();
        }
        this.firstLocal = this.nextLocal;
    }

    public void updateNewLocals(Object[] objArr) {
    }

    public void setLocalType(int i, Type type) {
    }
}
