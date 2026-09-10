package org.jacoco.core.internal.analysis.filter;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TryCatchBlockNode;

/* JADX INFO: loaded from: classes5.dex */
public final class SynchronizedFilter implements IFilter {

    public static class Matcher extends AbstractMatcher {
        private final AbstractInsnNode start;

        /* JADX INFO: Access modifiers changed from: private */
        public AbstractInsnNode match() {
            if (nextIsEcj() || nextIsJavac()) {
                return this.cursor;
            }
            return null;
        }

        private boolean nextIsEcj() {
            this.cursor = this.start;
            nextIs(25);
            nextIs(Opcodes.MONITOREXIT);
            nextIs(Opcodes.ATHROW);
            return this.cursor != null;
        }

        private boolean nextIsJavac() {
            this.cursor = this.start;
            nextIsVar(58, "t");
            nextIs(25);
            nextIs(Opcodes.MONITOREXIT);
            nextIsVar(25, "t");
            nextIs(Opcodes.ATHROW);
            return this.cursor != null;
        }

        private Matcher(AbstractInsnNode abstractInsnNode) {
            this.start = abstractInsnNode;
        }
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        AbstractInsnNode abstractInsnNodeMatch;
        for (TryCatchBlockNode tryCatchBlockNode : methodNode.tryCatchBlocks) {
            if (tryCatchBlockNode.type == null) {
                LabelNode labelNode = tryCatchBlockNode.start;
                LabelNode labelNode2 = tryCatchBlockNode.handler;
                if (labelNode != labelNode2 && (abstractInsnNodeMatch = new Matcher(labelNode2).match()) != null) {
                    iFilterOutput.ignore(tryCatchBlockNode.handler, abstractInsnNodeMatch);
                }
            }
        }
    }
}
