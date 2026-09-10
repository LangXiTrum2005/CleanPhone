package org.jacoco.core.internal.analysis.filter;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodNode;

/* JADX INFO: loaded from: classes5.dex */
public final class KotlinUnsafeCastOperatorFilter implements IFilter {

    public static class Matcher extends AbstractMatcher {
        private Matcher() {
        }

        public void match(String str, AbstractInsnNode abstractInsnNode, IFilterOutput iFilterOutput) {
            if (199 != abstractInsnNode.getOpcode()) {
                return;
            }
            this.cursor = abstractInsnNode;
            JumpInsnNode jumpInsnNode = (JumpInsnNode) abstractInsnNode;
            AbstractInsnNode next = abstractInsnNode.getNext();
            if (next != null && next.getOpcode() == 87) {
                next();
            }
            nextIsType(Opcodes.NEW, str);
            nextIs(89);
            nextIs(18);
            AbstractInsnNode abstractInsnNode2 = this.cursor;
            if (abstractInsnNode2 == null) {
                return;
            }
            Object obj = ((LdcInsnNode) abstractInsnNode2).cst;
            if ((obj instanceof String) && ((String) obj).startsWith("null cannot be cast to non-null type")) {
                nextIsInvoke(Opcodes.INVOKESPECIAL, str, "<init>", "(Ljava/lang/String;)V");
                nextIs(Opcodes.ATHROW);
                AbstractInsnNode abstractInsnNode3 = this.cursor;
                if (abstractInsnNode3 != null && abstractInsnNode3.getNext() == jumpInsnNode.label) {
                    iFilterOutput.ignore(abstractInsnNode, this.cursor);
                }
            }
        }
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        if (KotlinGeneratedFilter.isKotlinClass(iFilterContext)) {
            Matcher matcher = new Matcher();
            for (AbstractInsnNode abstractInsnNode : methodNode.instructions) {
                matcher.match("kotlin/TypeCastException", abstractInsnNode, iFilterOutput);
                matcher.match("java/lang/NullPointerException", abstractInsnNode, iFilterOutput);
            }
        }
    }
}
