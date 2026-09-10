package org.jacoco.core.tools;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.Socket;
import org.jacoco.core.runtime.RemoteControlReader;
import org.jacoco.core.runtime.RemoteControlWriter;

/* JADX INFO: loaded from: classes5.dex */
public class ExecDumpClient {
    private boolean dump = true;
    private boolean reset = false;
    private int retryCount = 0;
    private long retryDelay;

    public ExecDumpClient() {
        setRetryDelay(1000L);
    }

    private void sleep() throws InterruptedIOException {
        try {
            Thread.sleep(this.retryDelay);
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    private Socket tryConnect(InetAddress inetAddress, int i) throws IOException {
        int i2 = 0;
        while (true) {
            try {
                onConnecting(inetAddress, i);
                return new Socket(inetAddress, i);
            } catch (IOException e) {
                i2++;
                if (i2 > this.retryCount) {
                    throw e;
                }
                onConnectionFailure(e);
                sleep();
            }
        }
    }

    public ExecFileLoader dump(String str, int i) throws IOException {
        return dump(InetAddress.getByName(str), i);
    }

    public void setDump(boolean z) {
        this.dump = z;
    }

    public void setReset(boolean z) {
        this.reset = z;
    }

    public void setRetryCount(int i) {
        this.retryCount = i;
    }

    public void setRetryDelay(long j) {
        this.retryDelay = j;
    }

    public ExecFileLoader dump(InetAddress inetAddress, int i) throws IOException {
        ExecFileLoader execFileLoader = new ExecFileLoader();
        Socket socketTryConnect = tryConnect(inetAddress, i);
        try {
            RemoteControlWriter remoteControlWriter = new RemoteControlWriter(socketTryConnect.getOutputStream());
            RemoteControlReader remoteControlReader = new RemoteControlReader(socketTryConnect.getInputStream());
            remoteControlReader.setSessionInfoVisitor(execFileLoader.getSessionInfoStore());
            remoteControlReader.setExecutionDataVisitor(execFileLoader.getExecutionDataStore());
            remoteControlWriter.visitDumpCommand(this.dump, this.reset);
            if (!remoteControlReader.read()) {
                throw new IOException("Socket closed unexpectedly.");
            }
            socketTryConnect.close();
            return execFileLoader;
        } catch (Throwable th) {
            socketTryConnect.close();
            throw th;
        }
    }

    public void onConnectionFailure(IOException iOException) {
    }

    public void onConnecting(InetAddress inetAddress, int i) {
    }
}
