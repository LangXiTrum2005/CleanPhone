package org.jacoco.core.internal.analysis.filter;

import org.objectweb.asm.tree.MethodNode;

/* JADX INFO: loaded from: classes5.dex */
public interface IFilter {
    void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput);
}
