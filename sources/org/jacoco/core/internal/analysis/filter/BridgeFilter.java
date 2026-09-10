package org.jacoco.core.internal.analysis.filter;

import org.objectweb.asm.tree.MethodNode;

/* JADX INFO: loaded from: classes5.dex */
final class BridgeFilter implements IFilter {
    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        if ((methodNode.access & 64) == 0) {
            return;
        }
        iFilterOutput.ignore(methodNode.instructions.getFirst(), methodNode.instructions.getLast());
    }
}
