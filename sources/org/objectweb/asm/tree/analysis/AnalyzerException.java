package org.objectweb.asm.tree.analysis;

import org.objectweb.asm.tree.AbstractInsnNode;

/* JADX INFO: loaded from: classes5.dex */
public class AnalyzerException extends Exception {
    private static final long serialVersionUID = 3154190448018943333L;
    public final transient AbstractInsnNode node;

    public AnalyzerException(AbstractInsnNode abstractInsnNode, String str) {
        super(str);
        this.node = abstractInsnNode;
    }

    public AnalyzerException(AbstractInsnNode abstractInsnNode, String str, Throwable th) {
        super(str, th);
        this.node = abstractInsnNode;
    }

    public AnalyzerException(AbstractInsnNode abstractInsnNode, String str, Object obj, Value value) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str2 = "Expected ";
        } else {
            str2 = str + ": expected ";
        }
        sb.append(str2);
        sb.append(obj);
        sb.append(", but found ");
        sb.append(value);
        super(sb.toString());
        this.node = abstractInsnNode;
    }
}
