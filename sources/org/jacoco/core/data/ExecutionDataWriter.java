package org.jacoco.core.data;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.jacoco.core.internal.data.CompactDataOutput;

/* JADX INFO: loaded from: classes5.dex */
public class ExecutionDataWriter implements ISessionInfoVisitor, IExecutionDataVisitor {
    public static final byte BLOCK_EXECUTIONDATA = 17;
    public static final byte BLOCK_HEADER = 1;
    public static final byte BLOCK_SESSIONINFO = 16;
    public static final char FORMAT_VERSION = 4103;
    public static final char MAGIC_NUMBER = 49344;
    protected final CompactDataOutput out;

    public ExecutionDataWriter(OutputStream outputStream) throws IOException {
        this.out = new CompactDataOutput(outputStream);
        writeHeader();
    }

    public static final byte[] getFileHeader() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ExecutionDataWriter(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    private void writeHeader() throws IOException {
        this.out.writeByte(1);
        this.out.writeChar(49344);
        this.out.writeChar(FORMAT_VERSION);
    }

    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // org.jacoco.core.data.IExecutionDataVisitor
    public void visitClassExecution(ExecutionData executionData) {
        if (executionData.hasHits()) {
            try {
                this.out.writeByte(17);
                this.out.writeLong(executionData.getId());
                this.out.writeUTF(executionData.getName());
                this.out.writeBooleanArray(executionData.getProbes());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // org.jacoco.core.data.ISessionInfoVisitor
    public void visitSessionInfo(SessionInfo sessionInfo) {
        try {
            this.out.writeByte(16);
            this.out.writeUTF(sessionInfo.getId());
            this.out.writeLong(sessionInfo.getStartTimeStamp());
            this.out.writeLong(sessionInfo.getDumpTimeStamp());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
