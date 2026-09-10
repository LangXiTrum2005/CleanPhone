package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProgressiveDownloadAction extends DownloadAction {
    private static final int VERSION = 0;

    @Nullable
    public final String customCacheKey;
    private static final String TYPE = "progressive";
    public static final DownloadAction.Deserializer DESERIALIZER = new DownloadAction.Deserializer(TYPE, 0) { // from class: com.mbridge.msdk.playercommon.exoplayer2.offline.ProgressiveDownloadAction.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction.Deserializer
        public ProgressiveDownloadAction readFromStream(int i10, DataInputStream dataInputStream) throws IOException {
            Uri uri = Uri.parse(dataInputStream.readUTF());
            boolean z10 = dataInputStream.readBoolean();
            byte[] bArr = new byte[dataInputStream.readInt()];
            dataInputStream.readFully(bArr);
            return new ProgressiveDownloadAction(uri, z10, bArr, dataInputStream.readBoolean() ? dataInputStream.readUTF() : null);
        }
    };

    public ProgressiveDownloadAction(Uri uri, boolean z10, @Nullable byte[] bArr, @Nullable String str) {
        super(TYPE, 0, uri, z10, bArr);
        this.customCacheKey = str;
    }

    private String getCacheKey() {
        String str = this.customCacheKey;
        return str != null ? str : CacheUtil.generateKey(this.uri);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj)) {
            return Util.areEqual(this.customCacheKey, ((ProgressiveDownloadAction) obj).customCacheKey);
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.customCacheKey;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    public boolean isSameMedia(DownloadAction downloadAction) {
        return (downloadAction instanceof ProgressiveDownloadAction) && getCacheKey().equals(((ProgressiveDownloadAction) downloadAction).getCacheKey());
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    public void writeToStream(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeUTF(this.uri.toString());
        dataOutputStream.writeBoolean(this.isRemoveAction);
        dataOutputStream.writeInt(this.data.length);
        dataOutputStream.write(this.data);
        boolean z10 = this.customCacheKey != null;
        dataOutputStream.writeBoolean(z10);
        if (z10) {
            dataOutputStream.writeUTF(this.customCacheKey);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadAction
    public ProgressiveDownloader createDownloader(DownloaderConstructorHelper downloaderConstructorHelper) {
        return new ProgressiveDownloader(this.uri, this.customCacheKey, downloaderConstructorHelper);
    }
}
