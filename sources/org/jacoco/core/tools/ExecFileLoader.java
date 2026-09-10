package org.jacoco.core.tools;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.jacoco.core.data.ExecutionDataReader;
import org.jacoco.core.data.ExecutionDataStore;
import org.jacoco.core.data.ExecutionDataWriter;
import org.jacoco.core.data.SessionInfoStore;

/* JADX INFO: loaded from: classes5.dex */
public class ExecFileLoader {
    private final SessionInfoStore sessionInfos = new SessionInfoStore();
    private final ExecutionDataStore executionData = new ExecutionDataStore();

    public ExecutionDataStore getExecutionDataStore() {
        return this.executionData;
    }

    public SessionInfoStore getSessionInfoStore() {
        return this.sessionInfos;
    }

    public void load(InputStream inputStream) throws IOException {
        ExecutionDataReader executionDataReader = new ExecutionDataReader(new BufferedInputStream(inputStream));
        executionDataReader.setExecutionDataVisitor(this.executionData);
        executionDataReader.setSessionInfoVisitor(this.sessionInfos);
        executionDataReader.read();
    }

    public void save(OutputStream outputStream) throws IOException {
        ExecutionDataWriter executionDataWriter = new ExecutionDataWriter(outputStream);
        this.sessionInfos.accept(executionDataWriter);
        this.executionData.accept(executionDataWriter);
    }

    public void save(File file, boolean z) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file, z);
        fileOutputStream.getChannel().lock();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        try {
            save(bufferedOutputStream);
        } finally {
            bufferedOutputStream.close();
        }
    }

    public void load(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            load(fileInputStream);
        } finally {
            fileInputStream.close();
        }
    }
}
