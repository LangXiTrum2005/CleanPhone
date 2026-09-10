package org.objectweb.asm.tree.analysis;

import com.ironsource.X3;
import java.util.List;
import org.jacoco.core.internal.instr.InstrSupport;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.IntInsnNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MultiANewArrayInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;

/* JADX INFO: loaded from: classes5.dex */
public class BasicInterpreter extends Interpreter<BasicValue> implements Opcodes {
    public static final Type NULL_TYPE = Type.getObjectType("null");

    public BasicInterpreter() {
        super(589824);
        if (getClass() != BasicInterpreter.class) {
            throw new IllegalStateException();
        }
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue copyOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue) throws AnalyzerException {
        return basicValue;
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ Value naryOperation(AbstractInsnNode abstractInsnNode, List list) throws AnalyzerException {
        return naryOperation(abstractInsnNode, (List<? extends BasicValue>) list);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public void returnOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2) throws AnalyzerException {
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue ternaryOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2, BasicValue basicValue3) throws AnalyzerException {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0023  */
    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    /* JADX WARN: Code duplicated, block: B:19:0x0029  */
    /* JADX WARN: Code duplicated, block: B:21:0x002c  */
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue binaryOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2) throws AnalyzerException {
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 181) {
            return null;
        }
        switch (opcode) {
            case 46:
            case 51:
            case 52:
            case 53:
                return BasicValue.INT_VALUE;
            case 47:
                return BasicValue.LONG_VALUE;
            case 48:
                return BasicValue.FLOAT_VALUE;
            case 49:
                return BasicValue.DOUBLE_VALUE;
            case 50:
                return BasicValue.REFERENCE_VALUE;
            default:
                switch (opcode) {
                    case 96:
                    case 100:
                    case 104:
                    case 108:
                    case 112:
                        return BasicValue.INT_VALUE;
                    case 97:
                    case 101:
                    case 105:
                    case 109:
                    case 113:
                        return BasicValue.LONG_VALUE;
                    case 98:
                    case 102:
                    case 106:
                    case 110:
                    case 114:
                        return BasicValue.FLOAT_VALUE;
                    case 99:
                    case 103:
                    case 107:
                    case 111:
                    case 115:
                        return BasicValue.DOUBLE_VALUE;
                    default:
                        switch (opcode) {
                            case 120:
                            case 122:
                            case 124:
                            case 126:
                            case 128:
                            case 130:
                                return BasicValue.INT_VALUE;
                            case 121:
                            case 123:
                            case 125:
                            case 127:
                            case 129:
                            case 131:
                                return BasicValue.LONG_VALUE;
                            default:
                                switch (opcode) {
                                    case Opcodes.LCMP /* 148 */:
                                    case Opcodes.FCMPL /* 149 */:
                                    case Opcodes.FCMPG /* 150 */:
                                    case Opcodes.DCMPL /* 151 */:
                                    case Opcodes.DCMPG /* 152 */:
                                        return BasicValue.INT_VALUE;
                                    default:
                                        switch (opcode) {
                                            case Opcodes.IF_ICMPEQ /* 159 */:
                                            case 160:
                                            case Opcodes.IF_ICMPLT /* 161 */:
                                            case Opcodes.IF_ICMPGE /* 162 */:
                                            case Opcodes.IF_ICMPGT /* 163 */:
                                            case Opcodes.IF_ICMPLE /* 164 */:
                                            case Opcodes.IF_ACMPEQ /* 165 */:
                                            case Opcodes.IF_ACMPNE /* 166 */:
                                                return null;
                                            default:
                                                throw new AssertionError();
                                        }
                                }
                        }
                }
        }
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue merge(BasicValue basicValue, BasicValue basicValue2) {
        return !basicValue.equals(basicValue2) ? BasicValue.UNINITIALIZED_VALUE : basicValue;
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue naryOperation(AbstractInsnNode abstractInsnNode, List<? extends BasicValue> list) throws AnalyzerException {
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 197) {
            return newValue(Type.getType(((MultiANewArrayInsnNode) abstractInsnNode).desc));
        }
        return opcode == 186 ? newValue(Type.getReturnType(((InvokeDynamicInsnNode) abstractInsnNode).desc)) : newValue(Type.getReturnType(((MethodInsnNode) abstractInsnNode).desc));
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue newOperation(AbstractInsnNode abstractInsnNode) throws AnalyzerException {
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 168) {
            return BasicValue.RETURNADDRESS_VALUE;
        }
        if (opcode == 178) {
            return newValue(Type.getType(((FieldInsnNode) abstractInsnNode).desc));
        }
        if (opcode == 187) {
            return newValue(Type.getObjectType(((TypeInsnNode) abstractInsnNode).desc));
        }
        switch (opcode) {
            case 1:
                return newValue(NULL_TYPE);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return BasicValue.INT_VALUE;
            case 9:
            case 10:
                return BasicValue.LONG_VALUE;
            case 11:
            case 12:
            case 13:
                return BasicValue.FLOAT_VALUE;
            case 14:
            case 15:
                return BasicValue.DOUBLE_VALUE;
            case 16:
            case 17:
                return BasicValue.INT_VALUE;
            case 18:
                Object obj = ((LdcInsnNode) abstractInsnNode).cst;
                if (obj instanceof Integer) {
                    return BasicValue.INT_VALUE;
                }
                if (obj instanceof Float) {
                    return BasicValue.FLOAT_VALUE;
                }
                if (obj instanceof Long) {
                    return BasicValue.LONG_VALUE;
                }
                if (obj instanceof Double) {
                    return BasicValue.DOUBLE_VALUE;
                }
                if (obj instanceof String) {
                    return newValue(Type.getObjectType("java/lang/String"));
                }
                if (!(obj instanceof Type)) {
                    if (obj instanceof Handle) {
                        return newValue(Type.getObjectType("java/lang/invoke/MethodHandle"));
                    }
                    if (obj instanceof ConstantDynamic) {
                        return newValue(Type.getType(((ConstantDynamic) obj).getDescriptor()));
                    }
                    throw new AnalyzerException(abstractInsnNode, "Illegal LDC value " + obj);
                }
                int sort = ((Type) obj).getSort();
                if (sort == 10 || sort == 9) {
                    return newValue(Type.getObjectType("java/lang/Class"));
                }
                if (sort == 11) {
                    return newValue(Type.getObjectType("java/lang/invoke/MethodType"));
                }
                throw new AnalyzerException(abstractInsnNode, "Illegal LDC value " + obj);
            default:
                throw new AssertionError();
        }
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue newValue(Type type) {
        if (type == null) {
            return BasicValue.UNINITIALIZED_VALUE;
        }
        switch (type.getSort()) {
            case 0:
                return null;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return BasicValue.INT_VALUE;
            case 6:
                return BasicValue.FLOAT_VALUE;
            case 7:
                return BasicValue.LONG_VALUE;
            case 8:
                return BasicValue.DOUBLE_VALUE;
            case 9:
            case 10:
                return BasicValue.REFERENCE_VALUE;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d1  */
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue unaryOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue) throws AnalyzerException {
        int opcode = abstractInsnNode.getOpcode();
        if (opcode != 179) {
            if (opcode == 180) {
                return newValue(Type.getType(((FieldInsnNode) abstractInsnNode).desc));
            }
            if (opcode != 198 && opcode != 199) {
                switch (opcode) {
                    case 116:
                        return BasicValue.INT_VALUE;
                    case 117:
                        return BasicValue.LONG_VALUE;
                    case 118:
                        return BasicValue.FLOAT_VALUE;
                    case 119:
                        return BasicValue.DOUBLE_VALUE;
                    default:
                        switch (opcode) {
                            case 132:
                            case 136:
                            case Opcodes.F2I /* 139 */:
                            case Opcodes.D2I /* 142 */:
                            case Opcodes.I2B /* 145 */:
                            case Opcodes.I2C /* 146 */:
                            case Opcodes.I2S /* 147 */:
                                return BasicValue.INT_VALUE;
                            case 133:
                            case Opcodes.F2L /* 140 */:
                            case Opcodes.D2L /* 143 */:
                                return BasicValue.LONG_VALUE;
                            case 134:
                            case 137:
                            case Opcodes.D2F /* 144 */:
                                return BasicValue.FLOAT_VALUE;
                            case 135:
                            case 138:
                            case Opcodes.F2D /* 141 */:
                                return BasicValue.DOUBLE_VALUE;
                            default:
                                switch (opcode) {
                                    default:
                                        switch (opcode) {
                                            case Opcodes.TABLESWITCH /* 170 */:
                                            case Opcodes.LOOKUPSWITCH /* 171 */:
                                            case Opcodes.IRETURN /* 172 */:
                                            case 173:
                                            case Opcodes.FRETURN /* 174 */:
                                            case Opcodes.DRETURN /* 175 */:
                                            case Opcodes.ARETURN /* 176 */:
                                                break;
                                            default:
                                                switch (opcode) {
                                                    case Opcodes.NEWARRAY /* 188 */:
                                                        switch (((IntInsnNode) abstractInsnNode).operand) {
                                                            case 4:
                                                                return newValue(Type.getType(InstrSupport.DATAFIELD_DESC));
                                                            case 5:
                                                                return newValue(Type.getType("[C"));
                                                            case 6:
                                                                return newValue(Type.getType("[F"));
                                                            case 7:
                                                                return newValue(Type.getType("[D"));
                                                            case 8:
                                                                return newValue(Type.getType("[B"));
                                                            case 9:
                                                                return newValue(Type.getType("[S"));
                                                            case 10:
                                                                return newValue(Type.getType("[I"));
                                                            case 11:
                                                                return newValue(Type.getType("[J"));
                                                            default:
                                                                throw new AnalyzerException(abstractInsnNode, "Invalid array type");
                                                        }
                                                    case 189:
                                                        return newValue(Type.getType(X3.j.d + Type.getObjectType(((TypeInsnNode) abstractInsnNode).desc)));
                                                    case Opcodes.ARRAYLENGTH /* 190 */:
                                                        return BasicValue.INT_VALUE;
                                                    case Opcodes.ATHROW /* 191 */:
                                                        return null;
                                                    case 192:
                                                        return newValue(Type.getObjectType(((TypeInsnNode) abstractInsnNode).desc));
                                                    case Opcodes.INSTANCEOF /* 193 */:
                                                        return BasicValue.INT_VALUE;
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
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return null;
        }
        return null;
    }

    public BasicInterpreter(int i) {
        super(i);
    }
}
