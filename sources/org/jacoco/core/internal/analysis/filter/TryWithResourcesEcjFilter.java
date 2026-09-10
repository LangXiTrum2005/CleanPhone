package org.jacoco.core.internal.analysis.filter;

import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TryCatchBlockNode;

/* JADX INFO: loaded from: classes5.dex */
public final class TryWithResourcesEcjFilter implements IFilter {

    public static class Matcher extends AbstractMatcher {
        private final IFilterOutput output;
        private AbstractInsnNode start;
        private final Map<String, String> owners = new HashMap();
        private final Map<String, LabelNode> labels = new HashMap();

        public Matcher(IFilterOutput iFilterOutput) {
            this.output = iFilterOutput;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean matchEcj() {
            nextIsVar(58, "primaryExc");
            nextIsEcjCloseAndThrow("r0");
            String str = "r1";
            AbstractInsnNode abstractInsnNode = this.cursor;
            int i = 1;
            while (nextIsEcjClose(str)) {
                nextIsJump(Opcodes.GOTO, str + ".end");
                nextIsEcjSuppress(str);
                nextIsEcjCloseAndThrow(str);
                i++;
                str = "r" + i;
                abstractInsnNode = this.cursor;
            }
            this.cursor = abstractInsnNode;
            nextIsEcjSuppress("last");
            nextIsVar(25, "primaryExc");
            nextIs(Opcodes.ATHROW);
            AbstractInsnNode abstractInsnNode2 = this.cursor;
            if (abstractInsnNode2 == null) {
                return false;
            }
            AbstractInsnNode previous = this.start.getPrevious();
            this.cursor = previous;
            while (!nextIsEcjClose("r0")) {
                previous = previous.getPrevious();
                this.cursor = previous;
                if (previous == null) {
                    return false;
                }
            }
            AbstractInsnNode next = previous.getNext();
            next();
            AbstractInsnNode abstractInsnNode3 = this.cursor;
            if (abstractInsnNode3 == null || abstractInsnNode3.getOpcode() != 167) {
                return false;
            }
            this.output.ignore(next, this.cursor);
            this.output.ignore(this.start, abstractInsnNode2);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean matchEcjNoFlowOut() {
            nextIsVar(58, "primaryExc");
            String str = "r0";
            AbstractInsnNode abstractInsnNode = this.cursor;
            int i = 0;
            while (nextIsEcjCloseAndThrow(str) && nextIsEcjSuppress(str)) {
                i++;
                str = "r" + i;
                abstractInsnNode = this.cursor;
            }
            this.cursor = abstractInsnNode;
            nextIsVar(25, "primaryExc");
            nextIs(Opcodes.ATHROW);
            AbstractInsnNode abstractInsnNode2 = this.cursor;
            if (abstractInsnNode2 == null) {
                return false;
            }
            AbstractInsnNode previous = this.start.getPrevious();
            this.cursor = previous;
            while (!nextIsEcjClose("r0")) {
                previous = previous.getPrevious();
                this.cursor = previous;
                if (previous == null) {
                    return false;
                }
            }
            AbstractInsnNode next = previous.getNext();
            for (int i2 = 1; i2 < i; i2++) {
                if (!nextIsEcjClose("r" + i2)) {
                    return false;
                }
            }
            this.output.ignore(next, this.cursor);
            this.output.ignore(this.start, abstractInsnNode2);
            return true;
        }

        private void nextIsClose(String str) {
            nextIsVar(25, str);
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
            String str2 = methodInsnNode.owner;
            String str3 = this.owners.get(str);
            if (str3 == null) {
                this.owners.put(str, str2);
            } else {
                if (str3.equals(str2)) {
                    return;
                }
                this.cursor = null;
            }
        }

        private boolean nextIsEcjClose(String str) {
            nextIsVar(25, str);
            nextIsJump(Opcodes.IFNULL, str + ".end");
            nextIsClose(str);
            return this.cursor != null;
        }

        private boolean nextIsEcjCloseAndThrow(String str) {
            nextIsVar(25, str);
            nextIsJump(Opcodes.IFNULL, str);
            nextIsClose(str);
            nextIsLabel(str);
            nextIsVar(25, "primaryExc");
            nextIs(Opcodes.ATHROW);
            return this.cursor != null;
        }

        private boolean nextIsEcjSuppress(String str) {
            String str2 = str + ".t";
            String str3 = str + ".suppressStart";
            String str4 = str + ".suppressEnd";
            nextIsVar(58, str2);
            nextIsVar(25, "primaryExc");
            nextIsJump(Opcodes.IFNONNULL, str3);
            nextIsVar(25, str2);
            nextIsVar(58, "primaryExc");
            nextIsJump(Opcodes.GOTO, str4);
            nextIsLabel(str3);
            nextIsVar(25, "primaryExc");
            nextIsVar(25, str2);
            nextIsJump(Opcodes.IF_ACMPEQ, str4);
            nextIsVar(25, "primaryExc");
            nextIsVar(25, str2);
            nextIsInvoke(Opcodes.INVOKEVIRTUAL, "java/lang/Throwable", "addSuppressed", "(Ljava/lang/Throwable;)V");
            nextIsLabel(str4);
            return this.cursor != null;
        }

        private void nextIsJump(int i, String str) {
            nextIs(i);
            AbstractInsnNode abstractInsnNode = this.cursor;
            if (abstractInsnNode == null) {
                return;
            }
            LabelNode labelNode = ((JumpInsnNode) abstractInsnNode).label;
            LabelNode labelNode2 = this.labels.get(str);
            if (labelNode2 == null) {
                this.labels.put(str, labelNode);
            } else if (labelNode2 != labelNode) {
                this.cursor = null;
            }
        }

        private void nextIsLabel(String str) {
            AbstractInsnNode abstractInsnNode = this.cursor;
            if (abstractInsnNode == null) {
                return;
            }
            AbstractInsnNode next = abstractInsnNode.getNext();
            this.cursor = next;
            if (next.getType() != 8) {
                this.cursor = null;
                return;
            }
            if (this.labels.get(str) != ((LabelNode) this.cursor)) {
                this.cursor = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void start(AbstractInsnNode abstractInsnNode) {
            this.start = abstractInsnNode;
            this.cursor = abstractInsnNode.getPrevious();
            this.vars.clear();
            this.labels.clear();
            this.owners.clear();
        }
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        if (methodNode.tryCatchBlocks.isEmpty()) {
            return;
        }
        Matcher matcher = new Matcher(iFilterOutput);
        for (TryCatchBlockNode tryCatchBlockNode : methodNode.tryCatchBlocks) {
            if (tryCatchBlockNode.type == null) {
                matcher.start(tryCatchBlockNode.handler);
                if (!matcher.matchEcj()) {
                    matcher.start(tryCatchBlockNode.handler);
                    matcher.matchEcjNoFlowOut();
                }
            }
        }
    }
}
