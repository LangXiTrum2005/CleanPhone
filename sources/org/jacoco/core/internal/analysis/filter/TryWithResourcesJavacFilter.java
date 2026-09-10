package org.jacoco.core.internal.analysis.filter;

import com.ironsource.A5;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TryCatchBlockNode;

/* JADX INFO: loaded from: classes5.dex */
public final class TryWithResourcesJavacFilter implements IFilter {

    /* JADX INFO: renamed from: org.jacoco.core.internal.analysis.filter.TryWithResourcesJavacFilter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$jacoco$core$internal$analysis$filter$TryWithResourcesJavacFilter$Matcher$JavacPattern;

        static {
            int[] iArr = new int[Matcher.JavacPattern.values().length];
            $SwitchMap$org$jacoco$core$internal$analysis$filter$TryWithResourcesJavacFilter$Matcher$JavacPattern = iArr;
            try {
                iArr[Matcher.JavacPattern.METHOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jacoco$core$internal$analysis$filter$TryWithResourcesJavacFilter$Matcher$JavacPattern[Matcher.JavacPattern.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jacoco$core$internal$analysis$filter$TryWithResourcesJavacFilter$Matcher$JavacPattern[Matcher.JavacPattern.OPTIMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$jacoco$core$internal$analysis$filter$TryWithResourcesJavacFilter$Matcher$JavacPattern[Matcher.JavacPattern.OMITTED_NULL_CHECK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class Matcher extends AbstractMatcher {
        private String expectedOwner;
        private final IFilterOutput output;
        private AbstractInsnNode start;

        public enum JavacPattern {
            OPTIMAL,
            FULL,
            OMITTED_NULL_CHECK,
            METHOD
        }

        public Matcher(IFilterOutput iFilterOutput) {
            this.output = iFilterOutput;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean matchJavac(JavacPattern javacPattern) {
            nextIsVar(58, "t1");
            nextIsVar(25, "t1");
            nextIsVar(58, "primaryExc");
            nextIsVar(25, "t1");
            nextIs(Opcodes.ATHROW);
            nextIsVar(58, "t2");
            nextIsJavacClose(javacPattern, "e");
            nextIsVar(25, "t2");
            nextIs(Opcodes.ATHROW);
            AbstractInsnNode abstractInsnNode = this.cursor;
            if (abstractInsnNode == null) {
                return false;
            }
            AbstractInsnNode previous = this.start.getPrevious();
            this.cursor = previous;
            while (!nextIsJavacClose(javacPattern, A5.q)) {
                previous = previous.getPrevious();
                this.cursor = previous;
                if (previous == null) {
                    return false;
                }
            }
            AbstractInsnNode next = previous.getNext();
            AbstractInsnNode abstractInsnNode2 = this.cursor;
            next();
            if (this.cursor.getOpcode() != 167) {
                this.cursor = abstractInsnNode2;
            }
            this.output.ignore(next, this.cursor);
            this.output.ignore(this.start, abstractInsnNode);
            return true;
        }

        private void nextIsClose() {
            nextIsVar(25, "r");
            next();
            AbstractInsnNode abstractInsnNode = this.cursor;
            if (abstractInsnNode == null) {
                return;
            }
            if (abstractInsnNode.getOpcode() != 185 && this.cursor.getOpcode() != 182) {
                this.cursor = null;
                return;
            }
            MethodInsnNode methodInsnNode = (MethodInsnNode) this.cursor;
            if (!"close".equals(methodInsnNode.name) || !"()V".equals(methodInsnNode.desc)) {
                this.cursor = null;
                return;
            }
            String str = methodInsnNode.owner;
            String str2 = this.expectedOwner;
            if (str2 == null) {
                this.expectedOwner = str;
            } else {
                if (str2.equals(str)) {
                    return;
                }
                this.cursor = null;
            }
        }

        private boolean nextIsJavacClose(JavacPattern javacPattern, String str) {
            int[] iArr = AnonymousClass1.$SwitchMap$org$jacoco$core$internal$analysis$filter$TryWithResourcesJavacFilter$Matcher$JavacPattern;
            int i = iArr[javacPattern.ordinal()];
            if (i == 1 || i == 2) {
                nextIsVar(25, "r");
                nextIs(Opcodes.IFNULL);
            }
            int i2 = iArr[javacPattern.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new AssertionError();
                        }
                    }
                }
                nextIsVar(25, "primaryExc");
                nextIs(Opcodes.IFNULL);
                nextIsClose();
                nextIs(Opcodes.GOTO);
                nextIsVar(58, str + "t");
                nextIsVar(25, "primaryExc");
                nextIsVar(25, str + "t");
                nextIsInvoke(Opcodes.INVOKEVIRTUAL, "java/lang/Throwable", "addSuppressed", "(Ljava/lang/Throwable;)V");
                nextIs(Opcodes.GOTO);
                nextIsClose();
                return this.cursor != null;
            }
            nextIsVar(25, "primaryExc");
            nextIsVar(25, "r");
            nextIs(Opcodes.INVOKESTATIC);
            AbstractInsnNode abstractInsnNode = this.cursor;
            if (abstractInsnNode != null) {
                MethodInsnNode methodInsnNode = (MethodInsnNode) abstractInsnNode;
                if ("$closeResource".equals(methodInsnNode.name) && "(Ljava/lang/Throwable;Ljava/lang/AutoCloseable;)V".equals(methodInsnNode.desc)) {
                    return true;
                }
                this.cursor = null;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void start(AbstractInsnNode abstractInsnNode) {
            this.start = abstractInsnNode;
            this.cursor = abstractInsnNode.getPrevious();
            this.vars.clear();
            this.expectedOwner = null;
        }
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        if (methodNode.tryCatchBlocks.isEmpty()) {
            return;
        }
        Matcher matcher = new Matcher(iFilterOutput);
        for (TryCatchBlockNode tryCatchBlockNode : methodNode.tryCatchBlocks) {
            if ("java/lang/Throwable".equals(tryCatchBlockNode.type)) {
                for (Matcher.JavacPattern javacPattern : Matcher.JavacPattern.values()) {
                    matcher.start(tryCatchBlockNode.handler);
                    if (matcher.matchJavac(javacPattern)) {
                        break;
                    }
                }
            }
        }
    }
}
