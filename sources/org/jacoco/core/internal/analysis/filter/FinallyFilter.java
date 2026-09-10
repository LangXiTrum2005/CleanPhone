package org.jacoco.core.internal.analysis.filter;

import java.util.HashSet;
import java.util.List;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TryCatchBlockNode;
import org.objectweb.asm.tree.VarInsnNode;

/* JADX INFO: loaded from: classes5.dex */
public final class FinallyFilter implements IFilter {
    private static boolean isSame(int i, AbstractInsnNode abstractInsnNode, AbstractInsnNode abstractInsnNode2) {
        AbstractInsnNode next = next(abstractInsnNode);
        for (int i2 = 0; i2 < i; i2++) {
            if (abstractInsnNode2 == null || next.getOpcode() != abstractInsnNode2.getOpcode()) {
                return false;
            }
            next = next(next);
            abstractInsnNode2 = next(abstractInsnNode2);
        }
        return true;
    }

    private static void merge(IFilterOutput iFilterOutput, int i, AbstractInsnNode abstractInsnNode, AbstractInsnNode abstractInsnNode2) {
        if (isSame(i, abstractInsnNode, abstractInsnNode2)) {
            iFilterOutput.ignore(abstractInsnNode, abstractInsnNode);
            AbstractInsnNode next = next(abstractInsnNode);
            for (int i2 = 0; i2 < i; i2++) {
                iFilterOutput.merge(next, abstractInsnNode2);
                next = next(next);
                abstractInsnNode2 = next(abstractInsnNode2);
            }
            iFilterOutput.ignore(next, next(next));
            if (abstractInsnNode2 == null || abstractInsnNode2.getOpcode() != 167) {
                return;
            }
            iFilterOutput.ignore(abstractInsnNode2, abstractInsnNode2);
        }
    }

    private static AbstractInsnNode next(AbstractInsnNode abstractInsnNode) {
        while (true) {
            abstractInsnNode = abstractInsnNode.getNext();
            if (abstractInsnNode == null || (14 != abstractInsnNode.getType() && 8 != abstractInsnNode.getType() && 15 != abstractInsnNode.getType())) {
                break;
            }
        }
        return abstractInsnNode;
    }

    private static int size(AbstractInsnNode abstractInsnNode) {
        if (58 != abstractInsnNode.getOpcode()) {
            return 0;
        }
        int i = ((VarInsnNode) abstractInsnNode).var;
        int i2 = -1;
        while (true) {
            i2++;
            abstractInsnNode = next(abstractInsnNode);
            if (abstractInsnNode == null) {
                return 0;
            }
            if (25 == abstractInsnNode.getOpcode() && i == ((VarInsnNode) abstractInsnNode).var) {
                if (191 != next(abstractInsnNode).getOpcode()) {
                    return 0;
                }
                return i2;
            }
        }
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        for (TryCatchBlockNode tryCatchBlockNode : methodNode.tryCatchBlocks) {
            if (tryCatchBlockNode.type == null) {
                filter(iFilterOutput, methodNode.tryCatchBlocks, tryCatchBlockNode);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    private static void filter(IFilterOutput iFilterOutput, List<TryCatchBlockNode> list, TryCatchBlockNode tryCatchBlockNode) {
        AbstractInsnNode next = next(tryCatchBlockNode.handler);
        int size = size(next);
        if (size <= 0) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (TryCatchBlockNode tryCatchBlockNode2 : list) {
            if (tryCatchBlockNode2.handler == tryCatchBlockNode.handler) {
                for (AbstractInsnNode next2 = tryCatchBlockNode2.start; next2 != tryCatchBlockNode2.end; next2 = next2.getNext()) {
                    hashSet.add(next2);
                }
            }
        }
        for (TryCatchBlockNode tryCatchBlockNode3 : list) {
            if (tryCatchBlockNode3.handler == tryCatchBlockNode.handler) {
                AbstractInsnNode next3 = tryCatchBlockNode3.start;
                boolean z = false;
                z = false;
                while (next3 != tryCatchBlockNode3.end) {
                    int type = next3.getType();
                    if (type == 7) {
                        AbstractInsnNode next4 = next(((JumpInsnNode) next3).label);
                        if (!hashSet.contains(next4)) {
                            merge(iFilterOutput, size, next, next4);
                        }
                        if (next3.getOpcode() != 167) {
                            z = true;
                        }
                    } else if (type != 8 && type != 14 && type != 15) {
                        int opcode = next3.getOpcode();
                        if (opcode != 191) {
                            switch (opcode) {
                                case Opcodes.IRETURN /* 172 */:
                                case 173:
                                case Opcodes.FRETURN /* 174 */:
                                case Opcodes.DRETURN /* 175 */:
                                case Opcodes.ARETURN /* 176 */:
                                case Opcodes.RETURN /* 177 */:
                                    break;
                                default:
                                    z = true;
                                    break;
                            }
                        }
                    }
                    next3 = next3.getNext();
                }
                AbstractInsnNode next5 = next(next3);
                if (z && !hashSet.contains(next5)) {
                    merge(iFilterOutput, size, next, next5);
                }
            }
            if (tryCatchBlockNode3 != tryCatchBlockNode && tryCatchBlockNode3.start == tryCatchBlockNode.start && tryCatchBlockNode3.end == tryCatchBlockNode.end) {
                AbstractInsnNode next6 = next(next(tryCatchBlockNode3.handler));
                if (!hashSet.contains(next6)) {
                    merge(iFilterOutput, size, next, next6);
                }
            }
        }
    }
}
