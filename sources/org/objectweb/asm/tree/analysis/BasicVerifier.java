package org.objectweb.asm.tree.analysis;

import java.util.List;
import org.jacoco.core.internal.instr.InstrSupport;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;

/* JADX INFO: loaded from: classes5.dex */
public class BasicVerifier extends BasicInterpreter {
    public BasicVerifier() {
        super(589824);
        if (getClass() != BasicVerifier.class) {
            throw new IllegalStateException();
        }
    }

    public BasicValue getElementValue(BasicValue basicValue) throws AnalyzerException {
        return BasicValue.REFERENCE_VALUE;
    }

    public boolean isArrayValue(BasicValue basicValue) {
        return basicValue.isReference();
    }

    public boolean isSubTypeOf(BasicValue basicValue, BasicValue basicValue2) {
        return basicValue.equals(basicValue2);
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ Value naryOperation(AbstractInsnNode abstractInsnNode, List list) throws AnalyzerException {
        return naryOperation(abstractInsnNode, (List<? extends BasicValue>) list);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0031  */
    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue binaryOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2) throws AnalyzerException {
        BasicValue basicValueNewValue;
        BasicValue basicValueNewValue2;
        int opcode = abstractInsnNode.getOpcode();
        if (opcode != 181) {
            switch (opcode) {
                case 46:
                    basicValueNewValue2 = newValue(Type.getType("[I"));
                    basicValueNewValue = BasicValue.INT_VALUE;
                    break;
                case 47:
                    basicValueNewValue2 = newValue(Type.getType("[J"));
                    basicValueNewValue = BasicValue.INT_VALUE;
                    break;
                case 48:
                    basicValueNewValue2 = newValue(Type.getType("[F"));
                    basicValueNewValue = BasicValue.INT_VALUE;
                    break;
                case 49:
                    basicValueNewValue2 = newValue(Type.getType("[D"));
                    basicValueNewValue = BasicValue.INT_VALUE;
                    break;
                case 50:
                    basicValueNewValue2 = newValue(Type.getType("[Ljava/lang/Object;"));
                    basicValueNewValue = BasicValue.INT_VALUE;
                    break;
                case 51:
                    basicValueNewValue2 = isSubTypeOf(basicValue, newValue(Type.getType(InstrSupport.DATAFIELD_DESC))) ? newValue(Type.getType(InstrSupport.DATAFIELD_DESC)) : newValue(Type.getType("[B"));
                    basicValueNewValue = BasicValue.INT_VALUE;
                    break;
                case 52:
                    basicValueNewValue2 = newValue(Type.getType("[C"));
                    basicValueNewValue = BasicValue.INT_VALUE;
                    break;
                case 53:
                    basicValueNewValue2 = newValue(Type.getType("[S"));
                    basicValueNewValue = BasicValue.INT_VALUE;
                    break;
                default:
                    switch (opcode) {
                        case 96:
                        case 100:
                        case 104:
                        case 108:
                        case 112:
                            basicValueNewValue2 = BasicValue.INT_VALUE;
                            basicValueNewValue = basicValueNewValue2;
                            break;
                        case 97:
                        case 101:
                        case 105:
                        case 109:
                        case 113:
                            basicValueNewValue2 = BasicValue.LONG_VALUE;
                            basicValueNewValue = basicValueNewValue2;
                            break;
                        case 98:
                        case 102:
                        case 106:
                        case 110:
                        case 114:
                            basicValueNewValue2 = BasicValue.FLOAT_VALUE;
                            basicValueNewValue = basicValueNewValue2;
                            break;
                        case 99:
                        case 103:
                        case 107:
                        case 111:
                        case 115:
                            basicValueNewValue2 = BasicValue.DOUBLE_VALUE;
                            basicValueNewValue = basicValueNewValue2;
                            break;
                        default:
                            switch (opcode) {
                                case 120:
                                case 122:
                                case 124:
                                case 126:
                                case 128:
                                case 130:
                                    basicValueNewValue2 = BasicValue.INT_VALUE;
                                    basicValueNewValue = basicValueNewValue2;
                                    break;
                                case 121:
                                case 123:
                                case 125:
                                    basicValueNewValue2 = BasicValue.LONG_VALUE;
                                    basicValueNewValue = BasicValue.INT_VALUE;
                                    break;
                                case 127:
                                case 129:
                                case 131:
                                    basicValueNewValue2 = BasicValue.LONG_VALUE;
                                    basicValueNewValue = basicValueNewValue2;
                                    break;
                                default:
                                    switch (opcode) {
                                        case Opcodes.LCMP /* 148 */:
                                            basicValueNewValue2 = BasicValue.LONG_VALUE;
                                            basicValueNewValue = basicValueNewValue2;
                                            break;
                                        case Opcodes.FCMPL /* 149 */:
                                        case Opcodes.FCMPG /* 150 */:
                                            basicValueNewValue2 = BasicValue.FLOAT_VALUE;
                                            basicValueNewValue = basicValueNewValue2;
                                            break;
                                        case Opcodes.DCMPL /* 151 */:
                                        case Opcodes.DCMPG /* 152 */:
                                            basicValueNewValue2 = BasicValue.DOUBLE_VALUE;
                                            basicValueNewValue = basicValueNewValue2;
                                            break;
                                        default:
                                            switch (opcode) {
                                                case Opcodes.IF_ICMPEQ /* 159 */:
                                                case 160:
                                                case Opcodes.IF_ICMPLT /* 161 */:
                                                case Opcodes.IF_ICMPGE /* 162 */:
                                                case Opcodes.IF_ICMPGT /* 163 */:
                                                case Opcodes.IF_ICMPLE /* 164 */:
                                                    basicValueNewValue2 = BasicValue.INT_VALUE;
                                                    break;
                                                case Opcodes.IF_ACMPEQ /* 165 */:
                                                case Opcodes.IF_ACMPNE /* 166 */:
                                                    basicValueNewValue2 = BasicValue.REFERENCE_VALUE;
                                                    break;
                                                default:
                                                    throw new AssertionError();
                                            }
                                            basicValueNewValue = basicValueNewValue2;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            FieldInsnNode fieldInsnNode = (FieldInsnNode) abstractInsnNode;
            BasicValue basicValueNewValue3 = newValue(Type.getObjectType(fieldInsnNode.owner));
            basicValueNewValue = newValue(Type.getType(fieldInsnNode.desc));
            basicValueNewValue2 = basicValueNewValue3;
        }
        if (!isSubTypeOf(basicValue, basicValueNewValue2)) {
            throw new AnalyzerException(abstractInsnNode, "First argument", basicValueNewValue2, basicValue);
        }
        if (isSubTypeOf(basicValue2, basicValueNewValue)) {
            return abstractInsnNode.getOpcode() == 50 ? getElementValue(basicValue) : super.binaryOperation(abstractInsnNode, basicValue, basicValue2);
        }
        throw new AnalyzerException(abstractInsnNode, "Second argument", basicValueNewValue, basicValue2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x0039  */
    /* JADX WARN: Code duplicated, block: B:22:0x003c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue copyOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue) throws AnalyzerException {
        BasicValue basicValue2;
        int opcode = abstractInsnNode.getOpcode();
        switch (opcode) {
            case 21:
                basicValue2 = BasicValue.INT_VALUE;
                if (!basicValue2.equals(basicValue)) {
                    throw new AnalyzerException(abstractInsnNode, null, basicValue2, basicValue);
                }
                return basicValue;
            case 22:
                basicValue2 = BasicValue.LONG_VALUE;
                if (!basicValue2.equals(basicValue)) {
                    throw new AnalyzerException(abstractInsnNode, null, basicValue2, basicValue);
                }
                return basicValue;
            case 23:
                basicValue2 = BasicValue.FLOAT_VALUE;
                if (!basicValue2.equals(basicValue)) {
                    throw new AnalyzerException(abstractInsnNode, null, basicValue2, basicValue);
                }
                return basicValue;
            case 24:
                basicValue2 = BasicValue.DOUBLE_VALUE;
                if (!basicValue2.equals(basicValue)) {
                    throw new AnalyzerException(abstractInsnNode, null, basicValue2, basicValue);
                }
                return basicValue;
            case 25:
                if (basicValue.isReference()) {
                    return basicValue;
                }
                throw new AnalyzerException(abstractInsnNode, null, "an object reference", basicValue);
            default:
                switch (opcode) {
                    case 54:
                        basicValue2 = BasicValue.INT_VALUE;
                        break;
                    case 55:
                        basicValue2 = BasicValue.LONG_VALUE;
                        break;
                    case 56:
                        basicValue2 = BasicValue.FLOAT_VALUE;
                        break;
                    case 57:
                        basicValue2 = BasicValue.DOUBLE_VALUE;
                        break;
                    case 58:
                        if (basicValue.isReference() || BasicValue.RETURNADDRESS_VALUE.equals(basicValue)) {
                            return basicValue;
                        }
                        throw new AnalyzerException(abstractInsnNode, null, "an object reference or a return address", basicValue);
                    default:
                        return basicValue;
                }
                if (!basicValue2.equals(basicValue)) {
                    throw new AnalyzerException(abstractInsnNode, null, basicValue2, basicValue);
                }
                return basicValue;
        }
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue naryOperation(AbstractInsnNode abstractInsnNode, List<? extends BasicValue> list) throws AnalyzerException {
        int i;
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 197) {
            for (BasicValue basicValue : list) {
                BasicValue basicValue2 = BasicValue.INT_VALUE;
                if (!basicValue2.equals(basicValue)) {
                    throw new AnalyzerException(abstractInsnNode, null, basicValue2, basicValue);
                }
            }
        } else {
            int i2 = 0;
            if (opcode == 184 || opcode == 186) {
                i = 0;
            } else {
                Type objectType = Type.getObjectType(((MethodInsnNode) abstractInsnNode).owner);
                if (!isSubTypeOf(list.get(0), newValue(objectType))) {
                    throw new AnalyzerException(abstractInsnNode, "Method owner", newValue(objectType), list.get(0));
                }
                i = 1;
            }
            Type[] argumentTypes = Type.getArgumentTypes(opcode == 186 ? ((InvokeDynamicInsnNode) abstractInsnNode).desc : ((MethodInsnNode) abstractInsnNode).desc);
            while (i < list.size()) {
                int i3 = i2 + 1;
                BasicValue basicValueNewValue = newValue(argumentTypes[i2]);
                int i4 = i + 1;
                BasicValue basicValue3 = list.get(i);
                if (!isSubTypeOf(basicValue3, basicValueNewValue)) {
                    throw new AnalyzerException(abstractInsnNode, "Argument " + i3, basicValueNewValue, basicValue3);
                }
                i2 = i3;
                i = i4;
            }
        }
        return super.naryOperation(abstractInsnNode, list);
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public void returnOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2) throws AnalyzerException {
        if (!isSubTypeOf(basicValue, basicValue2)) {
            throw new AnalyzerException(abstractInsnNode, "Incompatible return type", basicValue2, basicValue);
        }
    }

    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue ternaryOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2, BasicValue basicValue3) throws AnalyzerException {
        BasicValue basicValueNewValue;
        BasicValue basicValue4;
        switch (abstractInsnNode.getOpcode()) {
            case 79:
                basicValueNewValue = newValue(Type.getType("[I"));
                basicValue4 = BasicValue.INT_VALUE;
                break;
            case 80:
                basicValueNewValue = newValue(Type.getType("[J"));
                basicValue4 = BasicValue.LONG_VALUE;
                break;
            case 81:
                basicValueNewValue = newValue(Type.getType("[F"));
                basicValue4 = BasicValue.FLOAT_VALUE;
                break;
            case 82:
                basicValueNewValue = newValue(Type.getType("[D"));
                basicValue4 = BasicValue.DOUBLE_VALUE;
                break;
            case 83:
                basicValue4 = BasicValue.REFERENCE_VALUE;
                basicValueNewValue = basicValue;
                break;
            case 84:
                basicValueNewValue = isSubTypeOf(basicValue, newValue(Type.getType(InstrSupport.DATAFIELD_DESC))) ? newValue(Type.getType(InstrSupport.DATAFIELD_DESC)) : newValue(Type.getType("[B"));
                basicValue4 = BasicValue.INT_VALUE;
                break;
            case 85:
                basicValueNewValue = newValue(Type.getType("[C"));
                basicValue4 = BasicValue.INT_VALUE;
                break;
            case 86:
                basicValueNewValue = newValue(Type.getType("[S"));
                basicValue4 = BasicValue.INT_VALUE;
                break;
            default:
                throw new AssertionError();
        }
        if (!isSubTypeOf(basicValue, basicValueNewValue)) {
            throw new AnalyzerException(abstractInsnNode, "First argument", "a " + basicValueNewValue + " array reference", basicValue);
        }
        BasicValue basicValue5 = BasicValue.INT_VALUE;
        if (!basicValue5.equals(basicValue2)) {
            throw new AnalyzerException(abstractInsnNode, "Second argument", basicValue5, basicValue2);
        }
        if (isSubTypeOf(basicValue3, basicValue4)) {
            return null;
        }
        throw new AnalyzerException(abstractInsnNode, "Third argument", basicValue4, basicValue3);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    @Override // org.objectweb.asm.tree.analysis.BasicInterpreter, org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue unaryOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue) throws AnalyzerException {
        BasicValue basicValueNewValue;
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 179) {
            basicValueNewValue = newValue(Type.getType(((FieldInsnNode) abstractInsnNode).desc));
        } else {
            if (opcode != 180) {
                if (opcode != 198 && opcode != 199) {
                    switch (opcode) {
                        case 116:
                            basicValueNewValue = BasicValue.INT_VALUE;
                            break;
                        case 117:
                            basicValueNewValue = BasicValue.LONG_VALUE;
                            break;
                        case 118:
                            basicValueNewValue = BasicValue.FLOAT_VALUE;
                            break;
                        case 119:
                            basicValueNewValue = BasicValue.DOUBLE_VALUE;
                            break;
                        default:
                            switch (opcode) {
                                case 132:
                                case 133:
                                case 134:
                                case 135:
                                case Opcodes.I2B /* 145 */:
                                case Opcodes.I2C /* 146 */:
                                case Opcodes.I2S /* 147 */:
                                    basicValueNewValue = BasicValue.INT_VALUE;
                                    break;
                                case 136:
                                case 137:
                                case 138:
                                    basicValueNewValue = BasicValue.LONG_VALUE;
                                    break;
                                case Opcodes.F2I /* 139 */:
                                case Opcodes.F2L /* 140 */:
                                case Opcodes.F2D /* 141 */:
                                    basicValueNewValue = BasicValue.FLOAT_VALUE;
                                    break;
                                case Opcodes.D2I /* 142 */:
                                case Opcodes.D2L /* 143 */:
                                case Opcodes.D2F /* 144 */:
                                    basicValueNewValue = BasicValue.DOUBLE_VALUE;
                                    break;
                                default:
                                    switch (opcode) {
                                        default:
                                            switch (opcode) {
                                                case Opcodes.TABLESWITCH /* 170 */:
                                                case Opcodes.LOOKUPSWITCH /* 171 */:
                                                case Opcodes.IRETURN /* 172 */:
                                                    break;
                                                case 173:
                                                    basicValueNewValue = BasicValue.LONG_VALUE;
                                                    break;
                                                case Opcodes.FRETURN /* 174 */:
                                                    basicValueNewValue = BasicValue.FLOAT_VALUE;
                                                    break;
                                                case Opcodes.DRETURN /* 175 */:
                                                    basicValueNewValue = BasicValue.DOUBLE_VALUE;
                                                    break;
                                                case Opcodes.ARETURN /* 176 */:
                                                    break;
                                                default:
                                                    switch (opcode) {
                                                        case Opcodes.NEWARRAY /* 188 */:
                                                        case 189:
                                                            break;
                                                        case Opcodes.ARRAYLENGTH /* 190 */:
                                                            if (isArrayValue(basicValue)) {
                                                                return super.unaryOperation(abstractInsnNode, basicValue);
                                                            }
                                                            throw new AnalyzerException(abstractInsnNode, null, "an array reference", basicValue);
                                                        case Opcodes.ATHROW /* 191 */:
                                                        case 192:
                                                        case Opcodes.INSTANCEOF /* 193 */:
                                                        case Opcodes.MONITORENTER /* 194 */:
                                                        case Opcodes.MONITOREXIT /* 195 */:
                                                            break;
                                                        default:
                                                            throw new AssertionError();
                                                    }
                                                    break;
                                            }
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                            basicValueNewValue = BasicValue.INT_VALUE;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                }
                if (basicValue.isReference()) {
                    return super.unaryOperation(abstractInsnNode, basicValue);
                }
                throw new AnalyzerException(abstractInsnNode, null, "an object reference", basicValue);
            }
            basicValueNewValue = newValue(Type.getObjectType(((FieldInsnNode) abstractInsnNode).owner));
        }
        if (isSubTypeOf(basicValue, basicValueNewValue)) {
            return super.unaryOperation(abstractInsnNode, basicValue);
        }
        throw new AnalyzerException(abstractInsnNode, null, basicValueNewValue, basicValue);
    }

    public BasicVerifier(int i) {
        super(i);
    }
}
