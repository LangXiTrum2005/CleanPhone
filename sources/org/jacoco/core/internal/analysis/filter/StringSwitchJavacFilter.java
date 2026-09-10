package org.jacoco.core.internal.analysis.filter;

import java.util.Iterator;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LookupSwitchInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TableSwitchInsnNode;

/* JADX INFO: loaded from: classes5.dex */
public final class StringSwitchJavacFilter implements IFilter {

    public static class Matcher extends AbstractMatcher {
        private Matcher() {
        }

        public boolean match(AbstractInsnNode abstractInsnNode, AbstractInsnNode abstractInsnNode2) {
            AbstractInsnNode abstractInsnNode3;
            AbstractInsnNode abstractInsnNode4;
            this.cursor = abstractInsnNode;
            int i = 0;
            while (true) {
                abstractInsnNode3 = this.cursor;
                if (abstractInsnNode3 == null || i >= 4) {
                    break;
                }
                this.cursor = abstractInsnNode3.getPrevious();
                i++;
            }
            if (abstractInsnNode3 != null && abstractInsnNode3.getOpcode() == 2) {
                nextIsVar(54, "c");
                nextIsVar(25, "s");
                nextIsInvoke(Opcodes.INVOKEVIRTUAL, "java/lang/String", "hashCode", "()I");
                next();
                do {
                    nextIsVar(25, "s");
                    nextIs(18);
                    nextIsInvoke(Opcodes.INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z");
                    nextIs(153);
                    next();
                    nextIsVar(54, "c");
                    AbstractInsnNode abstractInsnNode5 = this.cursor;
                    if (abstractInsnNode5 == null) {
                        return false;
                    }
                    if (abstractInsnNode5.getNext() == abstractInsnNode2) {
                        nextIsVar(21, "c");
                        nextIsSwitch();
                        return this.cursor != null;
                    }
                    nextIs(Opcodes.GOTO);
                    abstractInsnNode4 = this.cursor;
                    if (abstractInsnNode4 == null) {
                        return false;
                    }
                } while (((JumpInsnNode) abstractInsnNode4).label == abstractInsnNode2);
            }
            return false;
        }
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        Iterator<AbstractInsnNode> it = methodNode.instructions.iterator();
        while (it.hasNext()) {
            filter(it.next(), iFilterOutput);
        }
    }

    private void filter(AbstractInsnNode abstractInsnNode, IFilterOutput iFilterOutput) {
        LabelNode labelNode;
        if (abstractInsnNode.getOpcode() == 171) {
            labelNode = ((LookupSwitchInsnNode) abstractInsnNode).dflt;
        } else if (abstractInsnNode.getOpcode() != 170) {
            return;
        } else {
            labelNode = ((TableSwitchInsnNode) abstractInsnNode).dflt;
        }
        if (new Matcher().match(abstractInsnNode, labelNode)) {
            iFilterOutput.ignore(abstractInsnNode, labelNode);
        }
    }
}
