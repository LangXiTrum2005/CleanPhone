package org.objectweb.asm.commons;

import java.util.Collections;
import java.util.Comparator;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TryCatchBlockNode;

/* JADX INFO: loaded from: classes5.dex */
public class TryCatchBlockSorter extends MethodNode {
    public TryCatchBlockSorter(MethodVisitor methodVisitor, int i, String str, String str2, String str3, String[] strArr) {
        this(589824, methodVisitor, i, str, str2, str3, strArr);
        if (getClass() != TryCatchBlockSorter.class) {
            throw new IllegalStateException();
        }
    }

    @Override // org.objectweb.asm.tree.MethodNode, org.objectweb.asm.MethodVisitor
    public void visitEnd() {
        Collections.sort(this.tryCatchBlocks, new Comparator<TryCatchBlockNode>() { // from class: org.objectweb.asm.commons.TryCatchBlockSorter.1
            private int blockLength(TryCatchBlockNode tryCatchBlockNode) {
                return TryCatchBlockSorter.this.instructions.indexOf(tryCatchBlockNode.end) - TryCatchBlockSorter.this.instructions.indexOf(tryCatchBlockNode.start);
            }

            @Override // java.util.Comparator
            public int compare(TryCatchBlockNode tryCatchBlockNode, TryCatchBlockNode tryCatchBlockNode2) {
                return blockLength(tryCatchBlockNode) - blockLength(tryCatchBlockNode2);
            }
        });
        for (int i = 0; i < this.tryCatchBlocks.size(); i++) {
            this.tryCatchBlocks.get(i).updateIndex(i);
        }
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            accept(methodVisitor);
        }
    }

    public TryCatchBlockSorter(int i, MethodVisitor methodVisitor, int i2, String str, String str2, String str3, String[] strArr) {
        super(i, i2, str, str2, str3, strArr);
        this.mv = methodVisitor;
    }
}
