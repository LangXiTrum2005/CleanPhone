package org.objectweb.asm.tree.analysis;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;

/* JADX INFO: loaded from: classes5.dex */
public class SourceInterpreter extends Interpreter<SourceValue> implements Opcodes {
    public SourceInterpreter() {
        super(589824);
        if (getClass() != SourceInterpreter.class) {
            throw new IllegalStateException();
        }
    }

    private static <E> boolean containsAll(Set<E> set, Set<E> set2) {
        if (set.size() < set2.size()) {
            return false;
        }
        return set.containsAll(set2);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ Value naryOperation(AbstractInsnNode abstractInsnNode, List list) throws AnalyzerException {
        return naryOperation(abstractInsnNode, (List<? extends SourceValue>) list);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public void returnOperation(AbstractInsnNode abstractInsnNode, SourceValue sourceValue, SourceValue sourceValue2) {
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue binaryOperation(AbstractInsnNode abstractInsnNode, SourceValue sourceValue, SourceValue sourceValue2) {
        int i;
        switch (abstractInsnNode.getOpcode()) {
            case 47:
            case 49:
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
            case 121:
            case 123:
            case 125:
            case 127:
            case 129:
            case 131:
                i = 2;
                break;
            default:
                i = 1;
                break;
        }
        return new SourceValue(i, abstractInsnNode);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue copyOperation(AbstractInsnNode abstractInsnNode, SourceValue sourceValue) {
        return new SourceValue(sourceValue.getSize(), abstractInsnNode);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue merge(SourceValue sourceValue, SourceValue sourceValue2) {
        Set<AbstractInsnNode> set = sourceValue.insns;
        if (!(set instanceof SmallSet)) {
            if (sourceValue.size == sourceValue2.size) {
            }
            HashSet hashSet = new HashSet();
            hashSet.addAll(sourceValue.insns);
            hashSet.addAll(sourceValue2.insns);
            return new SourceValue(Math.min(sourceValue.size, sourceValue2.size), hashSet);
        }
        Set<AbstractInsnNode> set2 = sourceValue2.insns;
        if (set2 instanceof SmallSet) {
            Set<AbstractInsnNode> setUnion = ((SmallSet) set).union((SmallSet) set2);
            if (setUnion != sourceValue.insns || sourceValue.size != sourceValue2.size) {
                return new SourceValue(Math.min(sourceValue.size, sourceValue2.size), setUnion);
            }
        } else if (sourceValue.size == sourceValue2.size || !containsAll(set, sourceValue2.insns)) {
            HashSet hashSet2 = new HashSet();
            hashSet2.addAll(sourceValue.insns);
            hashSet2.addAll(sourceValue2.insns);
            return new SourceValue(Math.min(sourceValue.size, sourceValue2.size), hashSet2);
        }
        return sourceValue;
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue naryOperation(AbstractInsnNode abstractInsnNode, List<? extends SourceValue> list) {
        int size;
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 197) {
            size = 1;
        } else {
            size = opcode == 186 ? Type.getReturnType(((InvokeDynamicInsnNode) abstractInsnNode).desc).getSize() : Type.getReturnType(((MethodInsnNode) abstractInsnNode).desc).getSize();
        }
        return new SourceValue(size, abstractInsnNode);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001e  */
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue newOperation(AbstractInsnNode abstractInsnNode) {
        int opcode = abstractInsnNode.getOpcode();
        int size = 2;
        if (opcode != 9 && opcode != 10 && opcode != 14 && opcode != 15) {
            if (opcode == 18) {
                Object obj = ((LdcInsnNode) abstractInsnNode).cst;
                if (!(obj instanceof Long) && !(obj instanceof Double)) {
                    size = 1;
                }
            } else if (opcode != 178) {
                size = 1;
            } else {
                size = Type.getType(((FieldInsnNode) abstractInsnNode).desc).getSize();
            }
        }
        return new SourceValue(size, abstractInsnNode);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue newValue(Type type) {
        if (type == Type.VOID_TYPE) {
            return null;
        }
        return new SourceValue(type == null ? 1 : type.getSize());
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue ternaryOperation(AbstractInsnNode abstractInsnNode, SourceValue sourceValue, SourceValue sourceValue2, SourceValue sourceValue3) {
        return new SourceValue(1, abstractInsnNode);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public SourceValue unaryOperation(AbstractInsnNode abstractInsnNode, SourceValue sourceValue) {
        int size;
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 117 || opcode == 119 || opcode == 133 || opcode == 135 || opcode == 138 || opcode == 143) {
            size = 2;
        } else if (opcode == 180) {
            size = Type.getType(((FieldInsnNode) abstractInsnNode).desc).getSize();
        } else if (opcode == 140 || opcode == 141) {
            size = 2;
        } else {
            size = 1;
        }
        return new SourceValue(size, abstractInsnNode);
    }

    public SourceInterpreter(int i) {
        super(i);
    }
}
