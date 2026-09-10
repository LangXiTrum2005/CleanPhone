package org.jacoco.core.internal.analysis.filter;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LookupSwitchInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TableSwitchInsnNode;

/* JADX INFO: loaded from: classes5.dex */
public final class KotlinWhenFilter implements IFilter {
    private static final String EXCEPTION = "kotlin/NoWhenBranchMatchedException";

    public static class Matcher extends AbstractMatcher {
        private Matcher() {
        }

        public void match(AbstractInsnNode abstractInsnNode, IFilterOutput iFilterOutput) {
            if (abstractInsnNode.getType() != 8) {
                return;
            }
            this.cursor = abstractInsnNode;
            nextIsType(Opcodes.NEW, KotlinWhenFilter.EXCEPTION);
            nextIs(89);
            nextIsInvoke(Opcodes.INVOKESPECIAL, KotlinWhenFilter.EXCEPTION, "<init>", "()V");
            nextIs(Opcodes.ATHROW);
            for (AbstractInsnNode previous = this.cursor; previous != null; previous = previous.getPrevious()) {
                if (previous.getOpcode() == 153 && ((JumpInsnNode) previous).label == abstractInsnNode) {
                    iFilterOutput.ignore(previous, previous);
                    iFilterOutput.ignore(abstractInsnNode, this.cursor);
                    return;
                } else {
                    if (KotlinWhenFilter.getDefaultLabel(previous) == abstractInsnNode) {
                        KotlinWhenFilter.ignoreDefaultBranch(previous, iFilterOutput);
                        iFilterOutput.ignore(abstractInsnNode, this.cursor);
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LabelNode getDefaultLabel(AbstractInsnNode abstractInsnNode) {
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 170) {
            return ((TableSwitchInsnNode) abstractInsnNode).dflt;
        }
        if (opcode != 171) {
            return null;
        }
        return ((LookupSwitchInsnNode) abstractInsnNode).dflt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ignoreDefaultBranch(AbstractInsnNode abstractInsnNode, IFilterOutput iFilterOutput) {
        List<LabelNode> list = abstractInsnNode.getOpcode() == 171 ? ((LookupSwitchInsnNode) abstractInsnNode).labels : ((TableSwitchInsnNode) abstractInsnNode).labels;
        HashSet hashSet = new HashSet();
        Iterator<LabelNode> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(AbstractMatcher.skipNonOpcodes(it.next()));
        }
        iFilterOutput.replaceBranches(abstractInsnNode, hashSet);
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        Matcher matcher = new Matcher();
        Iterator<AbstractInsnNode> it = methodNode.instructions.iterator();
        while (it.hasNext()) {
            matcher.match(it.next(), iFilterOutput);
        }
    }
}
