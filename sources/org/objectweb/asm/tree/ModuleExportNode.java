package org.objectweb.asm.tree;

import java.util.List;
import org.objectweb.asm.ModuleVisitor;

/* JADX INFO: loaded from: classes5.dex */
public class ModuleExportNode {
    public int access;
    public List<String> modules;
    public String packaze;

    public ModuleExportNode(String str, int i, List<String> list) {
        this.packaze = str;
        this.access = i;
        this.modules = list;
    }

    public void accept(ModuleVisitor moduleVisitor) {
        String str = this.packaze;
        int i = this.access;
        List<String> list = this.modules;
        moduleVisitor.visitExport(str, i, list == null ? null : (String[]) list.toArray(new String[0]));
    }
}
