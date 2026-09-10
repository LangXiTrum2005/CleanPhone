package org.jacoco.core.internal.analysis.filter;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TryCatchBlockNode;

/* JADX INFO: loaded from: classes5.dex */
public final class TryWithResourcesJavac11Filter implements IFilter {

    public class Matcher extends AbstractMatcher {
        private String expectedOwner;
        private boolean withNullCheck;

        private Matcher() {
        }

        private void nextIsClose() {
            nextIsVar(25, "r");
            next();
            AbstractInsnNode abstractInsnNode = this.cursor;
            if (abstractInsnNode == null) {
                return;
            }
            if (abstractInsnNode.getOpcode() != 185 && this.cursor.getOpcode() != 182) {
                this.cursor = null;
                return;
            }
            MethodInsnNode methodInsnNode = (MethodInsnNode) this.cursor;
            if (!"close".equals(methodInsnNode.name) || !"()V".equals(methodInsnNode.desc)) {
                this.cursor = null;
                return;
            }
            String str = methodInsnNode.owner;
            String str2 = this.expectedOwner;
            if (str2 == null) {
                this.expectedOwner = str;
            } else {
                if (str2.equals(str)) {
                    return;
                }
                this.cursor = null;
            }
        }

        private boolean nextIsJavacClose() {
            if (this.withNullCheck) {
                nextIsVar(25, "r");
                nextIs(Opcodes.IFNULL);
            }
            nextIsClose();
            return this.cursor != null;
        }

        public void match(AbstractInsnNode abstractInsnNode, IFilterOutput iFilterOutput, boolean z) {
            this.withNullCheck = z;
            this.vars.clear();
            this.expectedOwner = null;
            this.cursor = abstractInsnNode.getPrevious();
            nextIsVar(58, "primaryExc");
            nextIsJavacClose();
            nextIs(Opcodes.GOTO);
            nextIsVar(58, "t");
            nextIsVar(25, "primaryExc");
            nextIsVar(25, "t");
            nextIsInvoke(Opcodes.INVOKEVIRTUAL, "java/lang/Throwable", "addSuppressed", "(Ljava/lang/Throwable;)V");
            nextIsVar(25, "primaryExc");
            nextIs(Opcodes.ATHROW);
            AbstractInsnNode abstractInsnNode2 = this.cursor;
            if (abstractInsnNode2 == null) {
                return;
            }
            AbstractInsnNode previous = abstractInsnNode.getPrevious();
            this.cursor = abstractInsnNode.getPrevious();
            while (!nextIsJavacClose()) {
                previous = previous.getPrevious();
                this.cursor = previous;
                if (previous == null) {
                    return;
                }
            }
            AbstractInsnNode next = previous.getNext();
            AbstractInsnNode abstractInsnNode3 = this.cursor;
            next();
            if (this.cursor.getOpcode() != 167) {
                this.cursor = abstractInsnNode3;
            }
            iFilterOutput.ignore(next, this.cursor);
            iFilterOutput.ignore(abstractInsnNode, abstractInsnNode2);
        }
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        if (methodNode.tryCatchBlocks.isEmpty()) {
            return;
        }
        Matcher matcher = new Matcher();
        for (TryCatchBlockNode tryCatchBlockNode : methodNode.tryCatchBlocks) {
            if ("java/lang/Throwable".equals(tryCatchBlockNode.type)) {
                matcher.match(tryCatchBlockNode.handler, iFilterOutput, true);
                matcher.match(tryCatchBlockNode.handler, iFilterOutput, false);
            }
        }
    }
}
