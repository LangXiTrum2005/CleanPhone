package org.jacoco.core.internal.analysis.filter;

import java.util.Iterator;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.MethodNode;

/* JADX INFO: loaded from: classes5.dex */
public final class KotlinNotNullOperatorFilter implements IFilter {

    public static class Matcher extends AbstractMatcher {
        private Matcher() {
        }

        public void match(AbstractInsnNode abstractInsnNode, IFilterOutput iFilterOutput) {
            if (199 != abstractInsnNode.getOpcode()) {
                return;
            }
            this.cursor = abstractInsnNode;
            nextIsInvoke(Opcodes.INVOKESTATIC, "kotlin/jvm/internal/Intrinsics", "throwNpe", "()V");
            AbstractInsnNode abstractInsnNode2 = this.cursor;
            if (abstractInsnNode2 == null) {
                return;
            }
            iFilterOutput.ignore(abstractInsnNode, abstractInsnNode2);
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
