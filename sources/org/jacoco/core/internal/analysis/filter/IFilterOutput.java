package org.jacoco.core.internal.analysis.filter;

import java.util.Set;
import org.objectweb.asm.tree.AbstractInsnNode;

/* JADX INFO: loaded from: classes5.dex */
public interface IFilterOutput {
    void ignore(AbstractInsnNode abstractInsnNode, AbstractInsnNode abstractInsnNode2);

    void merge(AbstractInsnNode abstractInsnNode, AbstractInsnNode abstractInsnNode2);

    void replaceBranches(AbstractInsnNode abstractInsnNode, Set<AbstractInsnNode> set);
}
