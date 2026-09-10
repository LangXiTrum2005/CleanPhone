package org.jacoco.core.internal.analysis.filter;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.MethodNode;

/* JADX INFO: loaded from: classes5.dex */
public final class EnumEmptyConstructorFilter implements IFilter {
    private static final String CONSTRUCTOR_DESC = "(Ljava/lang/String;I)V";
    private static final String CONSTRUCTOR_NAME = "<init>";
    private static final String ENUM_TYPE = "java/lang/Enum";

    public static class Matcher extends AbstractMatcher {
        private Matcher() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean match(MethodNode methodNode) {
            firstIsALoad0(methodNode);
            nextIs(25);
            nextIs(21);
            nextIsInvoke(Opcodes.INVOKESPECIAL, EnumEmptyConstructorFilter.ENUM_TYPE, EnumEmptyConstructorFilter.CONSTRUCTOR_NAME, EnumEmptyConstructorFilter.CONSTRUCTOR_DESC);
            nextIs(Opcodes.RETURN);
            return this.cursor != null;
        }
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        if (ENUM_TYPE.equals(iFilterContext.getSuperClassName()) && CONSTRUCTOR_NAME.equals(methodNode.name) && CONSTRUCTOR_DESC.equals(methodNode.desc) && new Matcher().match(methodNode)) {
            iFilterOutput.ignore(methodNode.instructions.getFirst(), methodNode.instructions.getLast());
        }
    }
}
