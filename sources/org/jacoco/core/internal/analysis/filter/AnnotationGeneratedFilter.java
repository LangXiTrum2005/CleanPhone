package org.jacoco.core.internal.analysis.filter;

import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;

/* JADX INFO: loaded from: classes5.dex */
public final class AnnotationGeneratedFilter implements IFilter {
    private static boolean matches(String str) {
        return str.substring(Math.max(str.lastIndexOf(47), str.lastIndexOf(36)) + 1).contains("Generated");
    }

    private static boolean presentIn(List<AnnotationNode> list) {
        if (list == null) {
            return false;
        }
        Iterator<AnnotationNode> it = list.iterator();
        while (it.hasNext()) {
            if (matches(it.next().desc)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        Iterator<String> it = iFilterContext.getClassAnnotations().iterator();
        while (it.hasNext()) {
            if (matches(it.next())) {
                iFilterOutput.ignore(methodNode.instructions.getFirst(), methodNode.instructions.getLast());
                return;
            }
        }
        if (presentIn(methodNode.invisibleAnnotations) || presentIn(methodNode.visibleAnnotations)) {
            iFilterOutput.ignore(methodNode.instructions.getFirst(), methodNode.instructions.getLast());
        }
    }
}
