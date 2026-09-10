package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ModuleVisitor;

/* JADX INFO: loaded from: classes5.dex */
public class ModuleNode extends ModuleVisitor {
    public int access;
    public List<ModuleExportNode> exports;
    public String mainClass;
    public String name;
    public List<ModuleOpenNode> opens;
    public List<String> packages;
    public List<ModuleProvideNode> provides;
    public List<ModuleRequireNode> requires;
    public List<String> uses;
    public String version;

    public ModuleNode(String str, int i, String str2) {
        super(589824);
        if (getClass() != ModuleNode.class) {
            throw new IllegalStateException();
        }
        this.name = str;
        this.access = i;
        this.version = str2;
    }

    public void accept(ClassVisitor classVisitor) {
        ModuleVisitor moduleVisitorVisitModule = classVisitor.visitModule(this.name, this.access, this.version);
        if (moduleVisitorVisitModule == null) {
            return;
        }
        String str = this.mainClass;
        if (str != null) {
            moduleVisitorVisitModule.visitMainClass(str);
        }
        List<String> list = this.packages;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                moduleVisitorVisitModule.visitPackage(this.packages.get(i));
            }
        }
        List<ModuleRequireNode> list2 = this.requires;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.requires.get(i2).accept(moduleVisitorVisitModule);
            }
        }
        List<ModuleExportNode> list3 = this.exports;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                this.exports.get(i3).accept(moduleVisitorVisitModule);
            }
        }
        List<ModuleOpenNode> list4 = this.opens;
        if (list4 != null) {
            int size4 = list4.size();
            for (int i4 = 0; i4 < size4; i4++) {
                this.opens.get(i4).accept(moduleVisitorVisitModule);
            }
        }
        List<String> list5 = this.uses;
        if (list5 != null) {
            int size5 = list5.size();
            for (int i5 = 0; i5 < size5; i5++) {
                moduleVisitorVisitModule.visitUse(this.uses.get(i5));
            }
        }
        List<ModuleProvideNode> list6 = this.provides;
        if (list6 != null) {
            int size6 = list6.size();
            for (int i6 = 0; i6 < size6; i6++) {
                this.provides.get(i6).accept(moduleVisitorVisitModule);
            }
        }
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitExport(String str, int i, String... strArr) {
        if (this.exports == null) {
            this.exports = new ArrayList(5);
        }
        this.exports.add(new ModuleExportNode(str, i, Util.asArrayList(strArr)));
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitMainClass(String str) {
        this.mainClass = str;
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitOpen(String str, int i, String... strArr) {
        if (this.opens == null) {
            this.opens = new ArrayList(5);
        }
        this.opens.add(new ModuleOpenNode(str, i, Util.asArrayList(strArr)));
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitPackage(String str) {
        if (this.packages == null) {
            this.packages = new ArrayList(5);
        }
        this.packages.add(str);
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitProvide(String str, String... strArr) {
        if (this.provides == null) {
            this.provides = new ArrayList(5);
        }
        this.provides.add(new ModuleProvideNode(str, Util.asArrayList(strArr)));
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitRequire(String str, int i, String str2) {
        if (this.requires == null) {
            this.requires = new ArrayList(5);
        }
        this.requires.add(new ModuleRequireNode(str, i, str2));
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitUse(String str) {
        if (this.uses == null) {
            this.uses = new ArrayList(5);
        }
        this.uses.add(str);
    }

    public ModuleNode(int i, String str, int i2, String str2, List<ModuleRequireNode> list, List<ModuleExportNode> list2, List<ModuleOpenNode> list3, List<String> list4, List<ModuleProvideNode> list5) {
        super(i);
        this.name = str;
        this.access = i2;
        this.version = str2;
        this.requires = list;
        this.exports = list2;
        this.opens = list3;
        this.uses = list4;
        this.provides = list5;
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitEnd() {
    }
}
