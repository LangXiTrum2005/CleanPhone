package org.jacoco.core.internal.analysis.filter;

import org.objectweb.asm.tree.MethodNode;

/* JADX INFO: loaded from: classes5.dex */
public final class EnumFilter implements IFilter {
    private boolean isMethodFiltered(String str, String str2, String str3, String str4) {
        if (!"java/lang/Enum".equals(str2)) {
            return false;
        }
        if ("values".equals(str3)) {
            if (("()[L" + str + ";").equals(str4)) {
                return true;
            }
        }
        if (!"valueOf".equals(str3)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("(Ljava/lang/String;)L");
        sb.append(str);
        sb.append(";");
        return sb.toString().equals(str4);
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        if (isMethodFiltered(iFilterContext.getClassName(), iFilterContext.getSuperClassName(), methodNode.name, methodNode.desc)) {
            iFilterOutput.ignore(methodNode.instructions.getFirst(), methodNode.instructions.getLast());
        }
    }
}
