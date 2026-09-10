package org.jacoco.core.internal.analysis.filter;

import org.objectweb.asm.tree.MethodNode;

/* JADX INFO: loaded from: classes5.dex */
public final class SyntheticFilter implements IFilter {
    private static boolean isScalaClass(IFilterContext iFilterContext) {
        return iFilterContext.getClassAttributes().contains("ScalaSig") || iFilterContext.getClassAttributes().contains("Scala");
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        if ((methodNode.access & 4096) == 0 || methodNode.name.startsWith("lambda$")) {
            return;
        }
        if (isScalaClass(iFilterContext) && methodNode.name.startsWith("$anonfun$")) {
            return;
        }
        if (KotlinGeneratedFilter.isKotlinClass(iFilterContext) && (KotlinDefaultArgumentsFilter.isDefaultArgumentsMethod(methodNode) || KotlinDefaultArgumentsFilter.isDefaultArgumentsConstructor(methodNode) || KotlinCoroutineFilter.isImplementationOfSuspendFunction(methodNode))) {
            return;
        }
        iFilterOutput.ignore(methodNode.instructions.getFirst(), methodNode.instructions.getLast());
    }
}
