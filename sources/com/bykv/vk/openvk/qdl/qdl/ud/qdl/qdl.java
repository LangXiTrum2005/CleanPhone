package com.bykv.vk.openvk.qdl.qdl.ud.qdl;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr;
import com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl.ud;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class qdl extends MediaDataSource {
    public static final ConcurrentHashMap<String, qdl> qdl = new ConcurrentHashMap<>();
    private long lnr = -2147483648L;
    private final Context mml;
    private final lnr mzz;
    private final com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl.lnr ud;

    public qdl(Context context, lnr lnrVar) {
        this.mml = context;
        this.mzz = lnrVar;
        this.ud = new ud(context, lnrVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.mzz.jtx();
        com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl.lnr lnrVar = this.ud;
        if (lnrVar != null) {
            lnrVar.ud();
        }
        qdl.remove(this.mzz.yt());
    }

    @Override // android.media.MediaDataSource
    public long getSize() throws IOException {
        if (this.lnr == -2147483648L) {
            if (this.mml == null || TextUtils.isEmpty(this.mzz.jtx())) {
                return -1L;
            }
            this.lnr = this.ud.lnr();
        }
        return this.lnr;
    }

    public lnr qdl() {
        return this.mzz;
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j, byte[] bArr, int i2, int i3) throws IOException {
        int iQdl = this.ud.qdl(j, bArr, i2, i3);
        int length = bArr.length;
        Objects.toString(Thread.currentThread());
        return iQdl;
    }

    public static qdl qdl(Context context, lnr lnrVar) {
        qdl qdlVar = new qdl(context, lnrVar);
        qdl.put(lnrVar.yt(), qdlVar);
        return qdlVar;
    }
}
