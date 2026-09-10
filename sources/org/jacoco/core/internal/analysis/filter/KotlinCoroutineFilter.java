package org.jacoco.core.internal.analysis.filter;

import java.util.ArrayList;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TableSwitchInsnNode;

/* JADX INFO: loaded from: classes5.dex */
public final class KotlinCoroutineFilter implements IFilter {

    public static class Matcher extends AbstractMatcher {
        private Matcher() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void match(MethodNode methodNode, IFilterOutput iFilterOutput) {
            AbstractInsnNode abstractInsnNodeSkipNonOpcodes = AbstractMatcher.skipNonOpcodes(methodNode.instructions.getFirst());
            this.cursor = abstractInsnNodeSkipNonOpcodes;
            if (abstractInsnNodeSkipNonOpcodes == null || abstractInsnNodeSkipNonOpcodes.getOpcode() != 184) {
                this.cursor = null;
            } else {
                MethodInsnNode methodInsnNode = (MethodInsnNode) this.cursor;
                if (!"kotlin/coroutines/intrinsics/IntrinsicsKt".equals(methodInsnNode.owner) || !"getCOROUTINE_SUSPENDED".equals(methodInsnNode.name) || !"()Ljava/lang/Object;".equals(methodInsnNode.desc)) {
                    this.cursor = null;
                }
            }
            if (this.cursor == null) {
                this.cursor = AbstractMatcher.skipNonOpcodes(methodNode.instructions.getFirst());
                nextIsCreateStateInstance();
                nextIsInvoke(Opcodes.INVOKESTATIC, "kotlin/coroutines/intrinsics/IntrinsicsKt", "getCOROUTINE_SUSPENDED", "()Ljava/lang/Object;");
            }
            nextIsVar(58, "COROUTINE_SUSPENDED");
            nextIsVar(25, "this");
            nextIs(Opcodes.GETFIELD);
            nextIs(Opcodes.TABLESWITCH);
            AbstractInsnNode abstractInsnNode = this.cursor;
            if (abstractInsnNode == null) {
                return;
            }
            TableSwitchInsnNode tableSwitchInsnNode = (TableSwitchInsnNode) abstractInsnNode;
            ArrayList arrayList = new ArrayList(tableSwitchInsnNode.labels.size() * 2);
            nextIs(25);
            nextIsThrowOnFailure();
            if (this.cursor == null) {
                return;
            }
            arrayList.add(methodNode.instructions.getFirst());
            arrayList.add(this.cursor);
            int i = 1;
            for (AbstractInsnNode next = this.cursor; next != null && i < tableSwitchInsnNode.labels.size(); next = next.getNext()) {
                this.cursor = next;
                nextIsVar(25, "COROUTINE_SUSPENDED");
                nextIs(Opcodes.IF_ACMPNE);
                AbstractInsnNode abstractInsnNode2 = this.cursor;
                if (abstractInsnNode2 != null) {
                    AbstractInsnNode abstractInsnNodeSkipNonOpcodes2 = AbstractMatcher.skipNonOpcodes(((JumpInsnNode) abstractInsnNode2).label);
                    nextIsVar(25, "COROUTINE_SUSPENDED");
                    nextIs(Opcodes.ARETURN);
                    AbstractInsnNode abstractInsnNode3 = this.cursor;
                    if (abstractInsnNode3 != null && AbstractMatcher.skipNonOpcodes(abstractInsnNode3.getNext()) == AbstractMatcher.skipNonOpcodes(tableSwitchInsnNode.labels.get(i))) {
                        for (AbstractInsnNode next2 = next; next2 != null; next2 = next2.getNext()) {
                            this.cursor = next2;
                            nextIs(25);
                            nextIsThrowOnFailure();
                            nextIs(25);
                            AbstractInsnNode abstractInsnNode4 = this.cursor;
                            if (abstractInsnNode4 != null && AbstractMatcher.skipNonOpcodes(abstractInsnNode4.getNext()) == abstractInsnNodeSkipNonOpcodes2) {
                                arrayList.add(next);
                                arrayList.add(this.cursor);
                                i++;
                                break;
                            }
                        }
                    }
                }
            }
            this.cursor = tableSwitchInsnNode.dflt;
            nextIsType(Opcodes.NEW, "java/lang/IllegalStateException");
            nextIs(89);
            nextIs(18);
            AbstractInsnNode abstractInsnNode5 = this.cursor;
            if (abstractInsnNode5 != null && ((LdcInsnNode) abstractInsnNode5).cst.equals("call to 'resume' before 'invoke' with coroutine")) {
                nextIsInvoke(Opcodes.INVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V");
                nextIs(Opcodes.ATHROW);
                AbstractInsnNode abstractInsnNode6 = this.cursor;
                if (abstractInsnNode6 == null) {
                    return;
                }
                iFilterOutput.ignore(tableSwitchInsnNode.dflt, abstractInsnNode6);
                for (int i2 = 0; i2 < arrayList.size(); i2 += 2) {
                    iFilterOutput.ignore((AbstractInsnNode) arrayList.get(i2), (AbstractInsnNode) arrayList.get(i2 + 1));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void matchOptimizedTailCall(MethodNode methodNode, IFilterOutput iFilterOutput) {
            for (AbstractInsnNode abstractInsnNode : methodNode.instructions) {
                this.cursor = abstractInsnNode;
                nextIs(89);
                nextIsInvoke(Opcodes.INVOKESTATIC, "kotlin/coroutines/intrinsics/IntrinsicsKt", "getCOROUTINE_SUSPENDED", "()Ljava/lang/Object;");
                nextIs(Opcodes.IF_ACMPNE);
                nextIs(Opcodes.ARETURN);
                nextIs(87);
                if (this.cursor != null) {
                    iFilterOutput.ignore(abstractInsnNode.getNext(), this.cursor);
                }
            }
        }

        private void nextIsCreateStateInstance() {
            nextIs(Opcodes.INSTANCEOF);
            nextIs(153);
            AbstractInsnNode abstractInsnNode = this.cursor;
            if (abstractInsnNode == null) {
                return;
            }
            AbstractInsnNode abstractInsnNodeSkipNonOpcodes = AbstractMatcher.skipNonOpcodes(((JumpInsnNode) abstractInsnNode).label);
            nextIs(25);
            nextIs(192);
            nextIs(58);
            nextIs(25);
            nextIs(Opcodes.GETFIELD);
            nextIs(18);
            nextIs(126);
            nextIs(153);
            AbstractInsnNode abstractInsnNode2 = this.cursor;
            if (abstractInsnNode2 == null || AbstractMatcher.skipNonOpcodes(((JumpInsnNode) abstractInsnNode2).label) != abstractInsnNodeSkipNonOpcodes) {
                return;
            }
            nextIs(25);
            nextIs(89);
            nextIs(Opcodes.GETFIELD);
            nextIs(18);
            nextIs(100);
            nextIs(Opcodes.PUTFIELD);
            nextIs(Opcodes.GOTO);
            AbstractInsnNode abstractInsnNode3 = this.cursor;
            if (abstractInsnNode3 == null) {
                return;
            }
            AbstractInsnNode abstractInsnNodeSkipNonOpcodes2 = AbstractMatcher.skipNonOpcodes(((JumpInsnNode) abstractInsnNode3).label);
            if (AbstractMatcher.skipNonOpcodes(this.cursor.getNext()) != abstractInsnNodeSkipNonOpcodes) {
                return;
            }
            this.cursor = abstractInsnNodeSkipNonOpcodes2;
            nextIs(Opcodes.GETFIELD);
            nextIs(58);
        }

        private void nextIsThrowOnFailure() {
            AbstractInsnNode abstractInsnNode = this.cursor;
            nextIsInvoke(Opcodes.INVOKESTATIC, "kotlin/ResultKt", "throwOnFailure", "(Ljava/lang/Object;)V");
            if (this.cursor == null) {
                this.cursor = abstractInsnNode;
                nextIs(89);
                nextIsType(Opcodes.INSTANCEOF, "kotlin/Result$Failure");
                nextIs(153);
                nextIsType(192, "kotlin/Result$Failure");
                nextIs(Opcodes.GETFIELD);
                nextIs(Opcodes.ATHROW);
                nextIs(87);
            }
        }
    }

    public static boolean isImplementationOfSuspendFunction(MethodNode methodNode) {
        if (methodNode.name.startsWith("access$")) {
            return false;
        }
        Type methodType = Type.getMethodType(methodNode.desc);
        int length = methodType.getArgumentTypes().length - 1;
        return length >= 0 && "kotlin.coroutines.Continuation".equals(methodType.getArgumentTypes()[length].getClassName());
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        if (KotlinGeneratedFilter.isKotlinClass(iFilterContext)) {
            new Matcher().match(methodNode, iFilterOutput);
            new Matcher().matchOptimizedTailCall(methodNode, iFilterOutput);
        }
    }
}
