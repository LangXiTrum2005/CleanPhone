package org.jacoco.core.runtime;

import java.io.IOException;
import java.io.OutputStream;
import org.jacoco.core.data.ExecutionDataWriter;

/* JADX INFO: loaded from: classes5.dex */
public class RemoteControlWriter extends ExecutionDataWriter implements IRemoteCommandVisitor {
    public static final byte BLOCK_CMDDUMP = 64;
    public static final byte BLOCK_CMDOK = 32;

    public RemoteControlWriter(OutputStream outputStream) throws IOException {
        super(outputStream);
    }

    public void sendCmdOk() throws IOException {
        this.out.writeByte(32);
    }

    @Override // org.jacoco.core.runtime.IRemoteCommandVisitor
    public void visitDumpCommand(boolean z, boolean z2) throws IOException {
        this.out.writeByte(64);
        this.out.writeBoolean(z);
        this.out.writeBoolean(z2);
    }
}
