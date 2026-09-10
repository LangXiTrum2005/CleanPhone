package com.mbridge.msdk.playercommon.exoplayer2.offline;

import com.mbridge.msdk.playercommon.exoplayer2.util.AtomicFile;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ActionFile {
    static final int VERSION = 0;
    private final File actionFile;
    private final AtomicFile atomicFile;

    public ActionFile(File file) {
        this.actionFile = file;
        this.atomicFile = new AtomicFile(file);
    }

    public DownloadAction[] load(DownloadAction.Deserializer... deserializerArr) throws IOException {
        if (!this.actionFile.exists()) {
            return new DownloadAction[0];
        }
        try {
            InputStream inputStreamOpenRead = this.atomicFile.openRead();
            DataInputStream dataInputStream = new DataInputStream(inputStreamOpenRead);
            int i10 = dataInputStream.readInt();
            if (i10 > 0) {
                throw new IOException("Unsupported action file version: " + i10);
            }
            int i11 = dataInputStream.readInt();
            DownloadAction[] downloadActionArr = new DownloadAction[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                downloadActionArr[i12] = DownloadAction.deserializeFromStream(deserializerArr, dataInputStream);
            }
            Util.closeQuietly(inputStreamOpenRead);
            return downloadActionArr;
        } catch (Throwable th2) {
            Util.closeQuietly((Closeable) null);
            throw th2;
        }
    }

    public void store(DownloadAction... downloadActionArr) throws Throwable {
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(this.atomicFile.startWrite());
            try {
                dataOutputStream2.writeInt(0);
                dataOutputStream2.writeInt(downloadActionArr.length);
                for (DownloadAction downloadAction : downloadActionArr) {
                    DownloadAction.serializeToStream(downloadAction, dataOutputStream2);
                }
                this.atomicFile.endWrite(dataOutputStream2);
                Util.closeQuietly((Closeable) null);
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = dataOutputStream2;
                Util.closeQuietly(dataOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
