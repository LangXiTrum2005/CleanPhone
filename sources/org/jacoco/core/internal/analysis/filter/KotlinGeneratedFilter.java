package org.jacoco.core.internal.analysis.filter;

import java.util.Iterator;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.MethodNode;

/* JADX INFO: loaded from: classes5.dex */
public class KotlinGeneratedFilter implements IFilter {
    static final String KOTLIN_METADATA_DESC = "Lkotlin/Metadata;";

    private boolean hasLineNumber(MethodNode methodNode) {
        Iterator<AbstractInsnNode> it = methodNode.instructions.iterator();
        while (it.hasNext()) {
            if (15 == it.next().getType()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isKotlinClass(IFilterContext iFilterContext) {
        return iFilterContext.getClassAnnotations().contains(KOTLIN_METADATA_DESC);
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        if (iFilterContext.getSourceFileName() == null || !isKotlinClass(iFilterContext) || hasLineNumber(methodNode)) {
            return;
        }
        iFilterOutput.ignore(methodNode.instructions.getFirst(), methodNode.instructions.getLast());
    }
}
