package org.objectweb.asm.commons;

import com.ironsource.X3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jacoco.core.internal.instr.InstrSupport;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

/* JADX INFO: loaded from: classes5.dex */
public class AnalyzerAdapter extends MethodVisitor {
    private List<Label> labels;
    public List<Object> locals;
    private int maxLocals;
    private int maxStack;
    private String owner;
    public List<Object> stack;
    public Map<Object, Object> uninitializedTypes;

    public AnalyzerAdapter(String str, int i, String str2, String str3, MethodVisitor methodVisitor) {
        this(589824, str, i, str2, str3, methodVisitor);
        if (getClass() != AnalyzerAdapter.class) {
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:57:0x0200  */
    /* JADX WARN: Code duplicated, block: B:58:0x0205  */
    /* JADX WARN: Code duplicated, block: B:82:0x027c  */
    /* JADX WARN: Code duplicated, block: B:83:0x028a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0293  */
    /* JADX WARN: Code duplicated, block: B:85:0x02a1  */
    private void execute(int i, int i2, String str) {
        int i3;
        Object obj;
        int i4;
        Object obj2;
        if (i == 168 || i == 169) {
            throw new IllegalArgumentException("JSR/RET are not supported");
        }
        if (this.locals == null) {
            this.labels = null;
            return;
        }
        switch (i) {
            case 0:
                break;
            case 1:
                push(Opcodes.NULL);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 17:
                push(Opcodes.INTEGER);
                break;
            case 9:
            case 10:
                push(Opcodes.LONG);
                push(Opcodes.TOP);
                break;
            case 11:
            case 12:
            case 13:
                push(Opcodes.FLOAT);
                break;
            case 14:
            case 15:
                push(Opcodes.DOUBLE);
                push(Opcodes.TOP);
                break;
            default:
                switch (i) {
                    case 21:
                    case 23:
                    case 25:
                        push(get(i2));
                        break;
                    case 22:
                    case 24:
                        push(get(i2));
                        push(Opcodes.TOP);
                        break;
                    default:
                        switch (i) {
                            case 46:
                            case 51:
                            case 52:
                            case 53:
                                pop(2);
                                push(Opcodes.INTEGER);
                                break;
                            case 47:
                                pop(2);
                                push(Opcodes.LONG);
                                push(Opcodes.TOP);
                                break;
                            case 48:
                                pop(2);
                                push(Opcodes.FLOAT);
                                break;
                            case 49:
                                pop(2);
                                push(Opcodes.DOUBLE);
                                push(Opcodes.TOP);
                                break;
                            case 50:
                                pop(1);
                                Object objPop = pop();
                                if (objPop instanceof String) {
                                    pushDescriptor(((String) objPop).substring(1));
                                } else if (objPop != Opcodes.NULL) {
                                    push("java/lang/Object");
                                } else {
                                    push(objPop);
                                }
                                break;
                            case 54:
                            case 56:
                            case 58:
                                set(i2, pop());
                                if (i2 > 0 && ((obj = get((i3 = i2 - 1))) == Opcodes.LONG || obj == Opcodes.DOUBLE)) {
                                    set(i3, Opcodes.TOP);
                                }
                                break;
                            case 55:
                            case 57:
                                pop(1);
                                set(i2, pop());
                                Integer num = Opcodes.TOP;
                                set(i2 + 1, num);
                                if (i2 > 0 && ((obj2 = get((i4 = i2 - 1))) == Opcodes.LONG || obj2 == Opcodes.DOUBLE)) {
                                    set(i4, num);
                                }
                                break;
                            default:
                                switch (i) {
                                    case 79:
                                    case 81:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                        pop(3);
                                        break;
                                    case 80:
                                    case 82:
                                        pop(4);
                                        break;
                                    case 87:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                        pop(1);
                                        break;
                                    case 88:
                                    case Opcodes.IF_ICMPEQ /* 159 */:
                                    case 160:
                                    case Opcodes.IF_ICMPLT /* 161 */:
                                    case Opcodes.IF_ICMPGE /* 162 */:
                                    case Opcodes.IF_ICMPGT /* 163 */:
                                    case Opcodes.IF_ICMPLE /* 164 */:
                                    case Opcodes.IF_ACMPEQ /* 165 */:
                                    case Opcodes.IF_ACMPNE /* 166 */:
                                        pop(2);
                                        break;
                                    case 89:
                                        Object objPop2 = pop();
                                        push(objPop2);
                                        push(objPop2);
                                        break;
                                    case 90:
                                        Object objPop3 = pop();
                                        Object objPop4 = pop();
                                        push(objPop3);
                                        push(objPop4);
                                        push(objPop3);
                                        break;
                                    case 91:
                                        Object objPop5 = pop();
                                        Object objPop6 = pop();
                                        Object objPop7 = pop();
                                        push(objPop5);
                                        push(objPop7);
                                        push(objPop6);
                                        push(objPop5);
                                        break;
                                    case 92:
                                        Object objPop8 = pop();
                                        Object objPop9 = pop();
                                        push(objPop9);
                                        push(objPop8);
                                        push(objPop9);
                                        push(objPop8);
                                        break;
                                    case 93:
                                        Object objPop10 = pop();
                                        Object objPop11 = pop();
                                        Object objPop12 = pop();
                                        push(objPop11);
                                        push(objPop10);
                                        push(objPop12);
                                        push(objPop11);
                                        push(objPop10);
                                        break;
                                    case 94:
                                        Object objPop13 = pop();
                                        Object objPop14 = pop();
                                        Object objPop15 = pop();
                                        Object objPop16 = pop();
                                        push(objPop14);
                                        push(objPop13);
                                        push(objPop16);
                                        push(objPop15);
                                        push(objPop14);
                                        push(objPop13);
                                        break;
                                    case 95:
                                        Object objPop17 = pop();
                                        Object objPop18 = pop();
                                        push(objPop17);
                                        push(objPop18);
                                        break;
                                    case 96:
                                    case 100:
                                    case 104:
                                    case 108:
                                    case 112:
                                    case 120:
                                    case 122:
                                    case 124:
                                    case 126:
                                    case 128:
                                    case 130:
                                    case 136:
                                    case Opcodes.D2I /* 142 */:
                                    case Opcodes.FCMPL /* 149 */:
                                    case Opcodes.FCMPG /* 150 */:
                                        pop(2);
                                        push(Opcodes.INTEGER);
                                        break;
                                    case 97:
                                    case 101:
                                    case 105:
                                    case 109:
                                    case 113:
                                    case 127:
                                    case 129:
                                    case 131:
                                        pop(4);
                                        push(Opcodes.LONG);
                                        push(Opcodes.TOP);
                                        break;
                                    case 98:
                                    case 102:
                                    case 106:
                                    case 110:
                                    case 114:
                                    case 137:
                                    case Opcodes.D2F /* 144 */:
                                        pop(2);
                                        push(Opcodes.FLOAT);
                                        break;
                                    case 99:
                                    case 103:
                                    case 107:
                                    case 111:
                                    case 115:
                                        pop(4);
                                        push(Opcodes.DOUBLE);
                                        push(Opcodes.TOP);
                                        break;
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case Opcodes.I2B /* 145 */:
                                    case Opcodes.I2C /* 146 */:
                                    case Opcodes.I2S /* 147 */:
                                    case Opcodes.GOTO /* 167 */:
                                        break;
                                    case 121:
                                    case 123:
                                    case 125:
                                        pop(3);
                                        push(Opcodes.LONG);
                                        push(Opcodes.TOP);
                                        break;
                                    case 132:
                                        set(i2, Opcodes.INTEGER);
                                        break;
                                    case 133:
                                    case Opcodes.F2L /* 140 */:
                                        pop(1);
                                        push(Opcodes.LONG);
                                        push(Opcodes.TOP);
                                        break;
                                    case 134:
                                        pop(1);
                                        push(Opcodes.FLOAT);
                                        break;
                                    case 135:
                                    case Opcodes.F2D /* 141 */:
                                        pop(1);
                                        push(Opcodes.DOUBLE);
                                        push(Opcodes.TOP);
                                        break;
                                    case 138:
                                        pop(2);
                                        push(Opcodes.DOUBLE);
                                        push(Opcodes.TOP);
                                        break;
                                    case Opcodes.F2I /* 139 */:
                                        pop(1);
                                        push(Opcodes.INTEGER);
                                        break;
                                    case Opcodes.D2L /* 143 */:
                                        pop(2);
                                        push(Opcodes.LONG);
                                        push(Opcodes.TOP);
                                        break;
                                    case Opcodes.LCMP /* 148 */:
                                    case Opcodes.DCMPL /* 151 */:
                                    case Opcodes.DCMPG /* 152 */:
                                        pop(4);
                                        push(Opcodes.INTEGER);
                                        break;
                                    default:
                                        switch (i) {
                                            case Opcodes.TABLESWITCH /* 170 */:
                                            case Opcodes.LOOKUPSWITCH /* 171 */:
                                            case Opcodes.IRETURN /* 172 */:
                                            case Opcodes.FRETURN /* 174 */:
                                            case Opcodes.ARETURN /* 176 */:
                                                pop(1);
                                                break;
                                            case 173:
                                            case Opcodes.DRETURN /* 175 */:
                                                pop(2);
                                                break;
                                            case Opcodes.RETURN /* 177 */:
                                                break;
                                            case Opcodes.GETSTATIC /* 178 */:
                                                pushDescriptor(str);
                                                break;
                                            case Opcodes.PUTSTATIC /* 179 */:
                                                pop(str);
                                                break;
                                            case Opcodes.GETFIELD /* 180 */:
                                                pop(1);
                                                pushDescriptor(str);
                                                break;
                                            case Opcodes.PUTFIELD /* 181 */:
                                                pop(str);
                                                pop();
                                                break;
                                            default:
                                                switch (i) {
                                                    case Opcodes.NEW /* 187 */:
                                                        push(this.labels.get(0));
                                                        break;
                                                    case Opcodes.NEWARRAY /* 188 */:
                                                        pop();
                                                        switch (i2) {
                                                            case 4:
                                                                pushDescriptor(InstrSupport.DATAFIELD_DESC);
                                                                break;
                                                            case 5:
                                                                pushDescriptor("[C");
                                                                break;
                                                            case 6:
                                                                pushDescriptor("[F");
                                                                break;
                                                            case 7:
                                                                pushDescriptor("[D");
                                                                break;
                                                            case 8:
                                                                pushDescriptor("[B");
                                                                break;
                                                            case 9:
                                                                pushDescriptor("[S");
                                                                break;
                                                            case 10:
                                                                pushDescriptor("[I");
                                                                break;
                                                            case 11:
                                                                pushDescriptor("[J");
                                                                break;
                                                            default:
                                                                throw new IllegalArgumentException("Invalid array type " + i2);
                                                        }
                                                        break;
                                                    case 189:
                                                        pop();
                                                        pushDescriptor(X3.j.d + Type.getObjectType(str));
                                                        break;
                                                    case Opcodes.ARRAYLENGTH /* 190 */:
                                                    case Opcodes.INSTANCEOF /* 193 */:
                                                        pop(1);
                                                        push(Opcodes.INTEGER);
                                                        break;
                                                    case Opcodes.ATHROW /* 191 */:
                                                    case Opcodes.MONITORENTER /* 194 */:
                                                    case Opcodes.MONITOREXIT /* 195 */:
                                                        pop(1);
                                                        break;
                                                    case 192:
                                                        pop();
                                                        pushDescriptor(Type.getObjectType(str).getDescriptor());
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case Opcodes.MULTIANEWARRAY /* 197 */:
                                                                pop(i2);
                                                                pushDescriptor(str);
                                                                break;
                                                            case Opcodes.IFNULL /* 198 */:
                                                            case Opcodes.IFNONNULL /* 199 */:
                                                                pop(1);
                                                                break;
                                                            default:
                                                                throw new IllegalArgumentException("Invalid opcode " + i);
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
        this.labels = null;
    }

    private Object get(int i) {
        this.maxLocals = Math.max(this.maxLocals, i + 1);
        return i < this.locals.size() ? this.locals.get(i) : Opcodes.TOP;
    }

    private Object pop() {
        List<Object> list = this.stack;
        return list.remove(list.size() - 1);
    }

    private void push(Object obj) {
        this.stack.add(obj);
        this.maxStack = Math.max(this.maxStack, this.stack.size());
    }

    private void pushDescriptor(String str) {
        if (str.charAt(0) == '(') {
            str = Type.getReturnType(str).getDescriptor();
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'F') {
            push(Opcodes.FLOAT);
            return;
        }
        if (cCharAt == 'L') {
            push(str.substring(1, str.length() - 1));
            return;
        }
        if (cCharAt != 'S') {
            if (cCharAt == 'V') {
                return;
            }
            if (cCharAt != 'I') {
                if (cCharAt == 'J') {
                    push(Opcodes.LONG);
                    push(Opcodes.TOP);
                    return;
                } else if (cCharAt != 'Z') {
                    if (cCharAt == '[') {
                        push(str);
                        return;
                    }
                    switch (cCharAt) {
                        case 'B':
                        case 'C':
                            break;
                        case 'D':
                            push(Opcodes.DOUBLE);
                            push(Opcodes.TOP);
                            return;
                        default:
                            throw new AssertionError();
                    }
                }
            }
        }
        push(Opcodes.INTEGER);
    }

    private void set(int i, Object obj) {
        this.maxLocals = Math.max(this.maxLocals, i + 1);
        while (i >= this.locals.size()) {
            this.locals.add(Opcodes.TOP);
        }
        this.locals.set(i, obj);
    }

    private static void visitFrameTypes(int i, Object[] objArr, List<Object> list) {
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            list.add(obj);
            if (obj == Opcodes.LONG || obj == Opcodes.DOUBLE) {
                list.add(Opcodes.TOP);
            }
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        super.visitFieldInsn(i, str, str2, str3);
        execute(i, 0, str3);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        if (i != -1) {
            throw new IllegalArgumentException("AnalyzerAdapter only accepts expanded frames (see ClassReader.EXPAND_FRAMES)");
        }
        super.visitFrame(i, i2, objArr, i3, objArr2);
        List<Object> list = this.locals;
        if (list != null) {
            list.clear();
            this.stack.clear();
        } else {
            this.locals = new ArrayList();
            this.stack = new ArrayList();
        }
        visitFrameTypes(i2, objArr, this.locals);
        visitFrameTypes(i3, objArr2, this.stack);
        this.maxLocals = Math.max(this.maxLocals, this.locals.size());
        this.maxStack = Math.max(this.maxStack, this.stack.size());
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i, int i2) {
        super.visitIincInsn(i, i2);
        this.maxLocals = Math.max(this.maxLocals, i + 1);
        execute(132, i, null);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i) {
        super.visitInsn(i);
        execute(i, 0, null);
        if ((i < 172 || i > 177) && i != 191) {
            return;
        }
        this.locals = null;
        this.stack = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i, int i2) {
        super.visitIntInsn(i, i2);
        execute(i, i2, null);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        super.visitInvokeDynamicInsn(str, str2, handle, objArr);
        if (this.locals == null) {
            this.labels = null;
            return;
        }
        pop(str2);
        pushDescriptor(str2);
        this.labels = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i, Label label) {
        super.visitJumpInsn(i, label);
        execute(i, 0, null);
        if (i == 167) {
            this.locals = null;
            this.stack = null;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(Label label) {
        super.visitLabel(label);
        if (this.labels == null) {
            this.labels = new ArrayList(3);
        }
        this.labels.add(label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        super.visitLdcInsn(obj);
        if (this.locals == null) {
            this.labels = null;
            return;
        }
        if (obj instanceof Integer) {
            push(Opcodes.INTEGER);
        } else if (obj instanceof Long) {
            push(Opcodes.LONG);
            push(Opcodes.TOP);
        } else if (obj instanceof Float) {
            push(Opcodes.FLOAT);
        } else if (obj instanceof Double) {
            push(Opcodes.DOUBLE);
            push(Opcodes.TOP);
        } else if (obj instanceof String) {
            push("java/lang/String");
        } else if (obj instanceof Type) {
            int sort = ((Type) obj).getSort();
            if (sort == 10 || sort == 9) {
                push("java/lang/Class");
            } else {
                if (sort != 11) {
                    throw new IllegalArgumentException();
                }
                push("java/lang/invoke/MethodType");
            }
        } else if (obj instanceof Handle) {
            push("java/lang/invoke/MethodHandle");
        } else {
            if (!(obj instanceof ConstantDynamic)) {
                throw new IllegalArgumentException();
            }
            pushDescriptor(((ConstantDynamic) obj).getDescriptor());
        }
        this.labels = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
        char cCharAt = str2.charAt(0);
        this.maxLocals = Math.max(this.maxLocals, ((cCharAt == 'J' || cCharAt == 'D') ? 2 : 1) + i);
        super.visitLocalVariable(str, str2, str3, label, label2, i);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        super.visitLookupSwitchInsn(label, iArr, labelArr);
        execute(Opcodes.LOOKUPSWITCH, 0, null);
        this.locals = null;
        this.stack = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int i, int i2) {
        if (this.mv != null) {
            this.maxStack = Math.max(this.maxStack, i);
            int iMax = Math.max(this.maxLocals, i2);
            this.maxLocals = iMax;
            this.mv.visitMaxs(this.maxStack, iMax);
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        if (this.api < 327680 && (i & 256) == 0) {
            super.visitMethodInsn(i, str, str2, str3, z);
            return;
        }
        super.visitMethodInsn(i, str, str2, str3, z);
        int i2 = i & (-257);
        if (this.locals == null) {
            this.labels = null;
            return;
        }
        pop(str3);
        if (i2 != 184) {
            Object objPop = pop();
            if (i2 == 183 && str2.equals("<init>")) {
                Object obj = objPop == Opcodes.UNINITIALIZED_THIS ? this.owner : this.uninitializedTypes.get(objPop);
                for (int i3 = 0; i3 < this.locals.size(); i3++) {
                    if (this.locals.get(i3) == objPop) {
                        this.locals.set(i3, obj);
                    }
                }
                for (int i4 = 0; i4 < this.stack.size(); i4++) {
                    if (this.stack.get(i4) == objPop) {
                        this.stack.set(i4, obj);
                    }
                }
            }
        }
        pushDescriptor(str3);
        this.labels = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i) {
        super.visitMultiANewArrayInsn(str, i);
        execute(Opcodes.MULTIANEWARRAY, i, str);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        super.visitTableSwitchInsn(i, i2, label, labelArr);
        execute(Opcodes.TABLESWITCH, 0, null);
        this.locals = null;
        this.stack = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i, String str) {
        if (i == 187) {
            if (this.labels == null) {
                Label label = new Label();
                ArrayList arrayList = new ArrayList(3);
                this.labels = arrayList;
                arrayList.add(label);
                MethodVisitor methodVisitor = this.mv;
                if (methodVisitor != null) {
                    methodVisitor.visitLabel(label);
                }
            }
            Iterator<Label> it = this.labels.iterator();
            while (it.hasNext()) {
                this.uninitializedTypes.put(it.next(), str);
            }
        }
        super.visitTypeInsn(i, str);
        execute(i, 0, str);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        super.visitVarInsn(i, i2);
        this.maxLocals = Math.max(this.maxLocals, (i == 22 || i == 24 || i == 55 || i == 57 ? 2 : 1) + i2);
        execute(i, i2, null);
    }

    private void pop(int i) {
        int size = this.stack.size();
        int i2 = size - i;
        for (int i3 = size - 1; i3 >= i2; i3--) {
            this.stack.remove(i3);
        }
    }

    public AnalyzerAdapter(int i, String str, int i2, String str2, String str3, MethodVisitor methodVisitor) {
        super(i, methodVisitor);
        this.owner = str;
        this.locals = new ArrayList();
        this.stack = new ArrayList();
        this.uninitializedTypes = new HashMap();
        if ((i2 & 8) == 0) {
            if ("<init>".equals(str2)) {
                this.locals.add(Opcodes.UNINITIALIZED_THIS);
            } else {
                this.locals.add(str);
            }
        }
        for (Type type : Type.getArgumentTypes(str3)) {
            switch (type.getSort()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    this.locals.add(Opcodes.INTEGER);
                    break;
                case 6:
                    this.locals.add(Opcodes.FLOAT);
                    break;
                case 7:
                    this.locals.add(Opcodes.LONG);
                    this.locals.add(Opcodes.TOP);
                    break;
                case 8:
                    this.locals.add(Opcodes.DOUBLE);
                    this.locals.add(Opcodes.TOP);
                    break;
                case 9:
                    this.locals.add(type.getDescriptor());
                    break;
                case 10:
                    this.locals.add(type.getInternalName());
                    break;
                default:
                    throw new AssertionError();
            }
        }
        this.maxLocals = this.locals.size();
    }

    private void pop(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt != '(') {
            if (cCharAt != 'J' && cCharAt != 'D') {
                pop(1);
                return;
            } else {
                pop(2);
                return;
            }
        }
        int size = 0;
        for (Type type : Type.getArgumentTypes(str)) {
            size += type.getSize();
        }
        pop(size);
    }
}
