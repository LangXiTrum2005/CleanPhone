package org.jacoco.core.internal.analysis.filter;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.MethodNode;

/* JADX INFO: loaded from: classes5.dex */
public final class PrivateEmptyNoArgConstructorFilter implements IFilter {
    private static final String CONSTRUCTOR_DESC = "()V";
    private static final String CONSTRUCTOR_NAME = "<init>";

    public static class Matcher extends AbstractMatcher {
        private Matcher() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean match(MethodNode methodNode, String str) {
            firstIsALoad0(methodNode);
            nextIsInvoke(Opcodes.INVOKESPECIAL, str, PrivateEmptyNoArgConstructorFilter.CONSTRUCTOR_NAME, PrivateEmptyNoArgConstructorFilter.CONSTRUCTOR_DESC);
            nextIs(Opcodes.RETURN);
            return this.cursor != null;
        }
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        if ((methodNode.access & 2) != 0 && CONSTRUCTOR_NAME.equals(methodNode.name) && CONSTRUCTOR_DESC.equals(methodNode.desc) && new Matcher().match(methodNode, iFilterContext.getSuperClassName())) {
            iFilterOutput.ignore(methodNode.instructions.getFirst(), methodNode.instructions.getLast());
        }
    }
}
