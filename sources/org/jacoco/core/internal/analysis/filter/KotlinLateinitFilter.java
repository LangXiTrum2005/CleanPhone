package org.jacoco.core.internal.analysis.filter;

import java.util.Iterator;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.MethodNode;

/* JADX INFO: loaded from: classes5.dex */
public class KotlinLateinitFilter implements IFilter {

    public static class Matcher extends AbstractMatcher {
        private Matcher() {
        }

        public void match(AbstractInsnNode abstractInsnNode, IFilterOutput iFilterOutput) {
            if (199 != abstractInsnNode.getOpcode()) {
                return;
            }
            this.cursor = abstractInsnNode;
            nextIs(18);
            nextIsInvoke(Opcodes.INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "throwUninitializedPropertyAccessException", "(Ljava/lang/String;)V");
            AbstractInsnNode abstractInsnNode2 = this.cursor;
            if (abstractInsnNode2 != null && AbstractMatcher.skipNonOpcodes(abstractInsnNode2.getNext()) != AbstractMatcher.skipNonOpcodes(((JumpInsnNode) abstractInsnNode).label)) {
                nextIs(1);
                nextIs(Opcodes.ATHROW);
            }
            AbstractInsnNode abstractInsnNode3 = this.cursor;
            if (abstractInsnNode3 != null) {
                iFilterOutput.ignore(abstractInsnNode, abstractInsnNode3);
            }
        }
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
