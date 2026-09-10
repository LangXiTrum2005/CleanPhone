package org.jacoco.core.internal.analysis.filter;

import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;

/* JADX INFO: loaded from: classes5.dex */
abstract class AbstractMatcher {
    AbstractInsnNode cursor;
    final Map<String, VarInsnNode> vars = new HashMap();

    public final void firstIsALoad0(MethodNode methodNode) {
        this.cursor = methodNode.instructions.getFirst();
        skipNonOpcodes();
        AbstractInsnNode abstractInsnNode = this.cursor;
        if (abstractInsnNode != null && abstractInsnNode.getOpcode() == 25 && ((VarInsnNode) this.cursor).var == 0) {
            return;
        }
        this.cursor = null;
    }

    public final void next() {
        AbstractInsnNode abstractInsnNode = this.cursor;
        if (abstractInsnNode == null) {
            return;
        }
        this.cursor = abstractInsnNode.getNext();
        skipNonOpcodes();
    }

    public final void nextIs(int i) {
        next();
        AbstractInsnNode abstractInsnNode = this.cursor;
        if (abstractInsnNode == null || abstractInsnNode.getOpcode() == i) {
            return;
        }
        this.cursor = null;
    }

    public final void nextIsField(int i, String str, String str2, String str3) {
        nextIs(i);
        AbstractInsnNode abstractInsnNode = this.cursor;
        if (abstractInsnNode == null) {
            return;
        }
        FieldInsnNode fieldInsnNode = (FieldInsnNode) abstractInsnNode;
        if (str.equals(fieldInsnNode.owner) && str2.equals(fieldInsnNode.name) && str3.equals(fieldInsnNode.desc)) {
            return;
        }
        this.cursor = null;
    }

    public final void nextIsInvoke(int i, String str, String str2, String str3) {
        nextIs(i);
        AbstractInsnNode abstractInsnNode = this.cursor;
        if (abstractInsnNode == null) {
            return;
        }
        MethodInsnNode methodInsnNode = (MethodInsnNode) abstractInsnNode;
        if (str.equals(methodInsnNode.owner) && str2.equals(methodInsnNode.name) && str3.equals(methodInsnNode.desc)) {
            return;
        }
        this.cursor = null;
    }

    public final void nextIsSwitch() {
        int opcode;
        next();
        AbstractInsnNode abstractInsnNode = this.cursor;
        if (abstractInsnNode == null || (opcode = abstractInsnNode.getOpcode()) == 170 || opcode == 171) {
            return;
        }
        this.cursor = null;
    }

    public final void nextIsType(int i, String str) {
        nextIs(i);
        AbstractInsnNode abstractInsnNode = this.cursor;
        if (abstractInsnNode == null || ((TypeInsnNode) abstractInsnNode).desc.equals(str)) {
            return;
        }
        this.cursor = null;
    }

    public final void nextIsVar(int i, String str) {
        nextIs(i);
        AbstractInsnNode abstractInsnNode = this.cursor;
        if (abstractInsnNode == null) {
            return;
        }
        VarInsnNode varInsnNode = (VarInsnNode) abstractInsnNode;
        VarInsnNode varInsnNode2 = this.vars.get(str);
        if (varInsnNode2 == null) {
            this.vars.put(str, varInsnNode);
        } else if (varInsnNode2.var != varInsnNode.var) {
            this.cursor = null;
        }
    }

    public final void skipNonOpcodes() {
        this.cursor = skipNonOpcodes(this.cursor);
    }

    public static AbstractInsnNode skipNonOpcodes(AbstractInsnNode abstractInsnNode) {
        while (abstractInsnNode != null && (abstractInsnNode.getType() == 14 || abstractInsnNode.getType() == 8 || abstractInsnNode.getType() == 15)) {
            abstractInsnNode = abstractInsnNode.getNext();
        }
        return abstractInsnNode;
    }
}
