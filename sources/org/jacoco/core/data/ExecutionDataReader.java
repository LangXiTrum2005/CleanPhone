package org.jacoco.core.data;

import java.io.IOException;
import java.io.InputStream;
import org.jacoco.core.internal.data.CompactDataInput;

/* JADX INFO: loaded from: classes5.dex */
public class ExecutionDataReader {
    protected final CompactDataInput in;
    private ISessionInfoVisitor sessionInfoVisitor = null;
    private IExecutionDataVisitor executionDataVisitor = null;
    private boolean firstBlock = true;

    public ExecutionDataReader(InputStream inputStream) {
        this.in = new CompactDataInput(inputStream);
    }

    private void readExecutionData() throws IOException {
        if (this.executionDataVisitor == null) {
            throw new IOException("No execution data visitor.");
        }
        this.executionDataVisitor.visitClassExecution(new ExecutionData(this.in.readLong(), this.in.readUTF(), this.in.readBooleanArray()));
    }

    private void readHeader() throws IOException {
        if (this.in.readChar() != 49344) {
            throw new IOException("Invalid execution data file.");
        }
        char c = this.in.readChar();
        if (c != ExecutionDataWriter.FORMAT_VERSION) {
            throw new IncompatibleExecDataVersionException(c);
        }
    }

    private void readSessionInfo() throws IOException {
        if (this.sessionInfoVisitor == null) {
            throw new IOException("No session info visitor.");
        }
        this.sessionInfoVisitor.visitSessionInfo(new SessionInfo(this.in.readUTF(), this.in.readLong(), this.in.readLong()));
    }

    public boolean read() throws IOException {
        byte b;
        do {
            int i = this.in.read();
            if (i == -1) {
                return false;
            }
            b = (byte) i;
            if (this.firstBlock && b != 1) {
                throw new IOException("Invalid execution data file.");
            }
            this.firstBlock = false;
        } while (readBlock(b));
        return true;
    }

    public boolean readBlock(byte b) throws IOException {
        if (b == 1) {
            readHeader();
            return true;
        }
        if (b == 16) {
            readSessionInfo();
            return true;
        }
        if (b != 17) {
            throw new IOException(String.format("Unknown block type %x.", Byte.valueOf(b)));
        }
        readExecutionData();
        return true;
    }

    public void setExecutionDataVisitor(IExecutionDataVisitor iExecutionDataVisitor) {
        this.executionDataVisitor = iExecutionDataVisitor;
    }

    public void setSessionInfoVisitor(ISessionInfoVisitor iSessionInfoVisitor) {
        this.sessionInfoVisitor = iSessionInfoVisitor;
    }
}
