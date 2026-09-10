package org.objectweb.asm.tree;

import org.objectweb.asm.ModuleVisitor;

/* JADX INFO: loaded from: classes5.dex */
public class ModuleRequireNode {
    public int access;
    public String module;
    public String version;

    public ModuleRequireNode(String str, int i, String str2) {
        this.module = str;
        this.access = i;
        this.version = str2;
    }

    public void accept(ModuleVisitor moduleVisitor) {
        moduleVisitor.visitRequire(this.module, this.access, this.version);
    }
}
