package org.objectweb.asm.commons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AdviceAdapter extends GeneratorAdapter implements Opcodes {
    private static final String INVALID_OPCODE = "Invalid opcode ";
    private Map<Label, List<Object>> forwardJumpStackFrames;
    private final boolean isConstructor;
    protected int methodAccess;
    protected String methodDesc;
    private List<Object> stackFrame;
    private boolean superClassConstructorCalled;
    private static final Object UNINITIALIZED_THIS = new Object();
    private static final Object OTHER = new Object();

    public AdviceAdapter(int i, MethodVisitor methodVisitor, int i2, String str, String str2) {
        super(i, methodVisitor, i2, str, str2);
        this.methodAccess = i2;
        this.methodDesc = str2;
        this.isConstructor = "<init>".equals(str);
    }

    private void addForwardJump(Label label) {
        if (this.forwardJumpStackFrames.containsKey(label)) {
            return;
        }
        this.forwardJumpStackFrames.put(label, new ArrayList(this.stackFrame));
    }

    private void addForwardJumps(Label label, Label[] labelArr) {
        addForwardJump(label);
        for (Label label2 : labelArr) {
            addForwardJump(label2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    private void doVisitMethodInsn(int i, String str, String str2) {
        if (!this.isConstructor || this.superClassConstructorCalled) {
            return;
        }
        for (Type type : Type.getArgumentTypes(str2)) {
            popValue();
            if (type.getSize() == 2) {
                popValue();
            }
        }
        if (i == 182) {
            popValue();
        } else if (i != 183) {
            if (i == 185) {
                popValue();
            }
        } else if (popValue() == UNINITIALIZED_THIS && !this.superClassConstructorCalled && str.equals("<init>")) {
            this.superClassConstructorCalled = true;
            onMethodEnter();
        }
        Type returnType = Type.getReturnType(str2);
        if (returnType != Type.VOID_TYPE) {
            Object obj = OTHER;
            pushValue(obj);
            if (returnType.getSize() == 2) {
                pushValue(obj);
            }
        }
    }

    private void endConstructorBasicBlockWithoutSuccessor() {
        this.superClassConstructorCalled = true;
    }

    private Object peekValue() {
        List<Object> list = this.stackFrame;
        return list.get(list.size() - 1);
    }

    private Object popValue() {
        List<Object> list = this.stackFrame;
        return list.remove(list.size() - 1);
    }

    private void pushValue(Object obj) {
        this.stackFrame.add(obj);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitCode() {
        super.visitCode();
        if (!this.isConstructor) {
            onMethodEnter();
        } else {
            this.stackFrame = new ArrayList();
            this.forwardJumpStackFrames = new HashMap();
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        super.visitFieldInsn(i, str, str2, str3);
        if (!this.isConstructor || this.superClassConstructorCalled) {
            return;
        }
        char cCharAt = str3.charAt(0);
        boolean z = cCharAt == 'J' || cCharAt == 'D';
        switch (i) {
            case Opcodes.GETSTATIC /* 178 */:
                Object obj = OTHER;
                pushValue(obj);
                if (z) {
                    pushValue(obj);
                    return;
                }
                return;
            case Opcodes.PUTSTATIC /* 179 */:
                popValue();
                if (z) {
                    popValue();
                    return;
                }
                return;
            case Opcodes.GETFIELD /* 180 */:
                if (z) {
                    pushValue(OTHER);
                    return;
                }
                return;
            case Opcodes.PUTFIELD /* 181 */:
                popValue();
                popValue();
                if (z) {
                    popValue();
                    return;
                }
                return;
            default:
                throw new IllegalArgumentException(INVALID_OPCODE + i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0106  */
    /* JADX WARN: Code duplicated, block: B:34:0x0119  */
    /* JADX WARN: Code duplicated, block: B:35:0x011f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0133  */
    /* JADX WARN: Code duplicated, block: B:41:0x0136 A[FALL_THROUGH] */
    /* JADX WARN: Switch 'out' block B:41:0x0136 for B:16:0x0021 already processed. Defaulting to fallback option. */
    /* JADX WARN: Switch 'out' block B:41:0x0136 for B:17:0x0024 already processed. Defaulting to fallback option. */
    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i) {
        if (!this.isConstructor || this.superClassConstructorCalled) {
            if (i != 191) {
                switch (i) {
                    case Opcodes.IRETURN /* 172 */:
                    case 173:
                    case Opcodes.FRETURN /* 174 */:
                    case Opcodes.DRETURN /* 175 */:
                    case Opcodes.ARETURN /* 176 */:
                    case Opcodes.RETURN /* 177 */:
                        onMethodExit(i);
                        break;
                }
            } else {
                onMethodExit(i);
            }
        } else if (i != 190) {
            if (i == 191) {
                popValue();
                onMethodExit(i);
                endConstructorBasicBlockWithoutSuccessor();
            } else if (i != 194 && i != 195) {
                switch (i) {
                    case 0:
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                        pushValue(OTHER);
                        break;
                    case 9:
                    case 10:
                    case 14:
                    case 15:
                        Object obj = OTHER;
                        pushValue(obj);
                        pushValue(obj);
                        break;
                    default:
                        switch (i) {
                            case 46:
                            case 48:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                                popValue();
                            case 47:
                            case 49:
                                super.visitInsn(i);
                            default:
                                switch (i) {
                                    case 79:
                                    case 81:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                        popValue();
                                        popValue();
                                        popValue();
                                        super.visitInsn(i);
                                    case 80:
                                    case 82:
                                        popValue();
                                        popValue();
                                        popValue();
                                        popValue();
                                        super.visitInsn(i);
                                    case 87:
                                    case 96:
                                    case 98:
                                    case 100:
                                    case 102:
                                    case 104:
                                    case 106:
                                    case 108:
                                    case 110:
                                    case 112:
                                    case 114:
                                    case 120:
                                    case 121:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case 125:
                                    case 126:
                                    case 128:
                                    case 130:
                                        popValue();
                                        super.visitInsn(i);
                                    case 88:
                                    case 97:
                                    case 99:
                                    case 101:
                                    case 103:
                                    case 105:
                                    case 107:
                                    case 109:
                                    case 111:
                                    case 113:
                                    case 115:
                                    case 127:
                                    case 129:
                                    case 131:
                                        popValue();
                                        popValue();
                                        super.visitInsn(i);
                                    case 89:
                                        pushValue(peekValue());
                                        super.visitInsn(i);
                                    case 90:
                                        int size = this.stackFrame.size();
                                        List<Object> list = this.stackFrame;
                                        list.add(size - 2, list.get(size - 1));
                                        super.visitInsn(i);
                                    case 91:
                                        int size2 = this.stackFrame.size();
                                        List<Object> list2 = this.stackFrame;
                                        list2.add(size2 - 3, list2.get(size2 - 1));
                                        super.visitInsn(i);
                                    case 92:
                                        int size3 = this.stackFrame.size();
                                        List<Object> list3 = this.stackFrame;
                                        int i2 = size3 - 2;
                                        int i3 = size3 - 1;
                                        list3.add(i2, list3.get(i3));
                                        List<Object> list4 = this.stackFrame;
                                        list4.add(i2, list4.get(i3));
                                        super.visitInsn(i);
                                    case 93:
                                        int size4 = this.stackFrame.size();
                                        List<Object> list5 = this.stackFrame;
                                        int i4 = size4 - 3;
                                        int i5 = size4 - 1;
                                        list5.add(i4, list5.get(i5));
                                        List<Object> list6 = this.stackFrame;
                                        list6.add(i4, list6.get(i5));
                                        super.visitInsn(i);
                                    case 94:
                                        int size5 = this.stackFrame.size();
                                        List<Object> list7 = this.stackFrame;
                                        int i6 = size5 - 4;
                                        int i7 = size5 - 1;
                                        list7.add(i6, list7.get(i7));
                                        List<Object> list8 = this.stackFrame;
                                        list8.add(i6, list8.get(i7));
                                        super.visitInsn(i);
                                    case 95:
                                        int size6 = this.stackFrame.size();
                                        List<Object> list9 = this.stackFrame;
                                        list9.add(size6 - 2, list9.get(size6 - 1));
                                        this.stackFrame.remove(size6);
                                        super.visitInsn(i);
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                        super.visitInsn(i);
                                    default:
                                        switch (i) {
                                            case 133:
                                            case 135:
                                            case Opcodes.F2L /* 140 */:
                                            case Opcodes.F2D /* 141 */:
                                                pushValue(OTHER);
                                                super.visitInsn(i);
                                            case 134:
                                            case 138:
                                            case Opcodes.F2I /* 139 */:
                                            case Opcodes.D2L /* 143 */:
                                            case Opcodes.I2B /* 145 */:
                                            case Opcodes.I2C /* 146 */:
                                            case Opcodes.I2S /* 147 */:
                                                super.visitInsn(i);
                                            case 136:
                                            case 137:
                                            case Opcodes.D2I /* 142 */:
                                            case Opcodes.D2F /* 144 */:
                                            case Opcodes.FCMPL /* 149 */:
                                            case Opcodes.FCMPG /* 150 */:
                                                popValue();
                                                super.visitInsn(i);
                                            case Opcodes.LCMP /* 148 */:
                                            case Opcodes.DCMPL /* 151 */:
                                            case Opcodes.DCMPG /* 152 */:
                                                popValue();
                                                popValue();
                                                popValue();
                                                super.visitInsn(i);
                                            default:
                                                switch (i) {
                                                    case Opcodes.IRETURN /* 172 */:
                                                    case 173:
                                                    case Opcodes.FRETURN /* 174 */:
                                                    case Opcodes.DRETURN /* 175 */:
                                                    case Opcodes.ARETURN /* 176 */:
                                                        throw new IllegalArgumentException("Invalid return in constructor");
                                                    case Opcodes.RETURN /* 177 */:
                                                        onMethodExit(i);
                                                        endConstructorBasicBlockWithoutSuccessor();
                                                        super.visitInsn(i);
                                                    default:
                                                        throw new IllegalArgumentException(INVALID_OPCODE + i);
                                                }
                                        }
                                }
                        }
                        break;
                }
            } else {
                popValue();
            }
        }
        super.visitInsn(i);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i, int i2) {
        super.visitIntInsn(i, i2);
        if (!this.isConstructor || this.superClassConstructorCalled || i == 188) {
            return;
        }
        pushValue(OTHER);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        super.visitInvokeDynamicInsn(str, str2, handle, objArr);
        doVisitMethodInsn(Opcodes.INVOKEDYNAMIC, str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i, Label label) {
        super.visitJumpInsn(i, label);
        if (!this.isConstructor || this.superClassConstructorCalled) {
            return;
        }
        if (i != 198 && i != 199) {
            switch (i) {
                case 153:
                case 154:
                case 155:
                case 156:
                case 157:
                case 158:
                    popValue();
                    break;
                case Opcodes.IF_ICMPEQ /* 159 */:
                case 160:
                case Opcodes.IF_ICMPLT /* 161 */:
                case Opcodes.IF_ICMPGE /* 162 */:
                case Opcodes.IF_ICMPGT /* 163 */:
                case Opcodes.IF_ICMPLE /* 164 */:
                case Opcodes.IF_ACMPEQ /* 165 */:
                case Opcodes.IF_ACMPNE /* 166 */:
                    popValue();
                    popValue();
                    break;
                case Opcodes.GOTO /* 167 */:
                    endConstructorBasicBlockWithoutSuccessor();
                    break;
                case Opcodes.JSR /* 168 */:
                    pushValue(OTHER);
                    break;
            }
        } else {
            popValue();
        }
        addForwardJump(label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(Label label) {
        Map<Label, List<Object>> map;
        List<Object> list;
        super.visitLabel(label);
        if (!this.isConstructor || (map = this.forwardJumpStackFrames) == null || (list = map.get(label)) == null) {
            return;
        }
        this.stackFrame = list;
        this.superClassConstructorCalled = false;
        this.forwardJumpStackFrames.remove(label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        super.visitLdcInsn(obj);
        if (!this.isConstructor || this.superClassConstructorCalled) {
            return;
        }
        Object obj2 = OTHER;
        pushValue(obj2);
        if ((obj instanceof Double) || (obj instanceof Long) || ((obj instanceof ConstantDynamic) && ((ConstantDynamic) obj).getSize() == 2)) {
            pushValue(obj2);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        super.visitLookupSwitchInsn(label, iArr, labelArr);
        if (!this.isConstructor || this.superClassConstructorCalled) {
            return;
        }
        popValue();
        addForwardJumps(label, labelArr);
        endConstructorBasicBlockWithoutSuccessor();
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        if (this.api < 327680 && (i & 256) == 0) {
            super.visitMethodInsn(i, str, str2, str3, z);
        } else {
            super.visitMethodInsn(i, str, str2, str3, z);
            doVisitMethodInsn(i & (-257), str2, str3);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i) {
        super.visitMultiANewArrayInsn(str, i);
        if (!this.isConstructor || this.superClassConstructorCalled) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            popValue();
        }
        pushValue(OTHER);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        super.visitTableSwitchInsn(i, i2, label, labelArr);
        if (!this.isConstructor || this.superClassConstructorCalled) {
            return;
        }
        popValue();
        addForwardJumps(label, labelArr);
        endConstructorBasicBlockWithoutSuccessor();
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        super.visitTryCatchBlock(label, label2, label3, str);
        if (!this.isConstructor || this.forwardJumpStackFrames.containsKey(label3)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(OTHER);
        this.forwardJumpStackFrames.put(label3, arrayList);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i, String str) {
        super.visitTypeInsn(i, str);
        if (this.isConstructor && !this.superClassConstructorCalled && i == 187) {
            pushValue(OTHER);
        }
    }

    @Override // org.objectweb.asm.commons.LocalVariablesSorter, org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        super.visitVarInsn(i, i2);
        if (!this.isConstructor || this.superClassConstructorCalled) {
            return;
        }
        if (i == 169) {
            endConstructorBasicBlockWithoutSuccessor();
            return;
        }
        switch (i) {
            case 21:
            case 23:
                pushValue(OTHER);
                return;
            case 22:
            case 24:
                Object obj = OTHER;
                pushValue(obj);
                pushValue(obj);
                return;
            case 25:
                pushValue(i2 == 0 ? UNINITIALIZED_THIS : OTHER);
                return;
            default:
                switch (i) {
                    case 54:
                    case 56:
                    case 58:
                        popValue();
                        return;
                    case 55:
                    case 57:
                        popValue();
                        popValue();
                        return;
                    default:
                        throw new IllegalArgumentException(INVALID_OPCODE + i);
                }
        }
    }

    public void onMethodEnter() {
    }

    public void onMethodExit(int i) {
    }
}
