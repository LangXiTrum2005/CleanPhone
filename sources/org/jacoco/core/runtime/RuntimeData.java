package org.jacoco.core.runtime;

import org.jacoco.core.data.ExecutionData;
import org.jacoco.core.data.ExecutionDataStore;
import org.jacoco.core.data.IExecutionDataVisitor;
import org.jacoco.core.data.ISessionInfoVisitor;
import org.jacoco.core.data.SessionInfo;
import org.jacoco.core.internal.instr.InstrSupport;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
public class RuntimeData {
    protected final ExecutionDataStore store = new ExecutionDataStore();
    private String sessionId = "<none>";
    private long startTimeStamp = System.currentTimeMillis();

    public static void generateAccessCall(long j, String str, int i, MethodVisitor methodVisitor) {
        generateArgumentArray(j, str, i, methodVisitor);
        methodVisitor.visitInsn(90);
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
        methodVisitor.visitInsn(87);
        methodVisitor.visitInsn(3);
        methodVisitor.visitInsn(50);
        methodVisitor.visitTypeInsn(192, InstrSupport.DATAFIELD_DESC);
    }

    public static void generateArgumentArray(long j, String str, int i, MethodVisitor methodVisitor) {
        methodVisitor.visitInsn(6);
        methodVisitor.visitTypeInsn(189, "java/lang/Object");
        methodVisitor.visitInsn(89);
        methodVisitor.visitInsn(3);
        methodVisitor.visitLdcInsn(Long.valueOf(j));
        methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
        methodVisitor.visitInsn(83);
        methodVisitor.visitInsn(89);
        methodVisitor.visitInsn(4);
        methodVisitor.visitLdcInsn(str);
        methodVisitor.visitInsn(83);
        methodVisitor.visitInsn(89);
        methodVisitor.visitInsn(5);
        InstrSupport.push(methodVisitor, i);
        methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
        methodVisitor.visitInsn(83);
    }

    public final void collect(IExecutionDataVisitor iExecutionDataVisitor, ISessionInfoVisitor iSessionInfoVisitor, boolean z) {
        synchronized (this.store) {
            try {
                iSessionInfoVisitor.visitSessionInfo(new SessionInfo(this.sessionId, this.startTimeStamp, System.currentTimeMillis()));
                this.store.accept(iExecutionDataVisitor);
                if (z) {
                    reset();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Object[]) {
            getProbes((Object[]) obj);
        }
        return super.equals(obj);
    }

    public ExecutionData getExecutionData(Long l, String str, int i) {
        ExecutionData executionData;
        synchronized (this.store) {
            executionData = this.store.get(l, str, i);
        }
        return executionData;
    }

    public void getProbes(Object[] objArr) {
        objArr[0] = getExecutionData((Long) objArr[0], (String) objArr[1], ((Integer) objArr[2]).intValue()).getProbes();
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public final void reset() {
        synchronized (this.store) {
            this.store.reset();
            this.startTimeStamp = System.currentTimeMillis();
        }
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }
}
