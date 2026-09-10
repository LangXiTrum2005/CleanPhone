package com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl;

import android.content.Context;
import android.support.v4.media.a;
import android.support.v4.media.session.PlaybackStateCompat;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.component.ud.qdl.bjy;
import com.bytedance.sdk.component.ud.qdl.fs;
import com.bytedance.sdk.component.ud.qdl.rdp;
import com.bytedance.sdk.component.ud.qdl.rq;
import com.bytedance.sdk.component.utils.aaj;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ud implements lnr {
    private File lnr;
    private File mml;
    private long mzz;
    private final com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr rq;
    private RandomAccessFile to;
    private volatile long qdl = -2147483648L;
    private final Object ud = new Object();
    private volatile long mo = -1;
    private volatile int wd = -100;
    private volatile boolean jpc = false;
    private volatile boolean tvp = false;

    public ud(Context context, com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar) {
        this.mzz = 0L;
        this.to = null;
        this.rq = lnrVar;
        try {
            this.lnr = com.bykv.vk.openvk.qdl.qdl.ud.mml.ud.ud(lnrVar.mzz(), lnrVar.yt());
            this.mml = com.bykv.vk.openvk.qdl.qdl.ud.mml.ud.lnr(lnrVar.mzz(), lnrVar.yt());
            if (mml()) {
                this.to = new RandomAccessFile(this.mml, "r");
            } else {
                this.to = new RandomAccessFile(this.lnr, "rw");
            }
            if (mml()) {
                return;
            }
            this.mzz = this.lnr.length();
            qdl();
        } catch (Throwable unused) {
            lnrVar.jtx();
        }
    }

    private boolean mml() {
        return this.mml.exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mo() throws IOException {
        synchronized (this.ud) {
            if (mml()) {
                this.rq.jtx();
                this.rq.yt();
                return;
            }
            try {
                if (!this.lnr.renameTo(this.mml)) {
                    throw new IOException("Error renaming file " + this.lnr + " to " + this.mml + " for completion!");
                }
                RandomAccessFile randomAccessFile = this.to;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.to = new RandomAccessFile(this.mml, "rw");
                this.rq.yt();
                this.rq.jtx();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    private long mzz() {
        return mml() ? this.mml.length() : this.lnr.length();
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl.lnr
    public long lnr() throws IOException {
        if (mml()) {
            this.qdl = this.mml.length();
        } else {
            synchronized (this.ud) {
                int i2 = 0;
                while (this.qdl == -2147483648L) {
                    try {
                        i2 += 15;
                        try {
                            this.ud.wait(5L);
                            if (i2 > 20000) {
                                return -1L;
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("total length InterruptException");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return this.qdl;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl.lnr
    public void ud() {
        try {
            if (!this.jpc) {
                this.to.close();
            }
            File file = this.lnr;
            if (file != null) {
                file.setLastModified(System.currentTimeMillis());
            }
            File file2 = this.mml;
            if (file2 != null) {
                file2.setLastModified(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        this.jpc = true;
    }

    public void qdl() {
        rq.qdl qdlVar;
        if (com.bykv.vk.openvk.qdl.qdl.qdl.lnr.mml() != null) {
            qdlVar = com.bykv.vk.openvk.qdl.qdl.qdl.lnr.mml().ud();
        } else {
            qdlVar = new rq.qdl("v_cache");
        }
        long jExc = this.rq.exc();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        qdlVar.qdl(jExc, timeUnit).ud(this.rq.aaj(), timeUnit).lnr(this.rq.jyq(), timeUnit);
        rq rqVarQdl = qdlVar.qdl();
        this.rq.yt();
        rqVarQdl.qdl(new fs.qdl().qdl("RANGE", a.j(this.mzz, TokenBuilder.TOKEN_DELIMITER, new StringBuilder("bytes="))).ud(this.rq.jtx()).qdl().qdl("videoLoadWhenPlaying").qdl(9).ud()).qdl(new com.bytedance.sdk.component.ud.qdl.lnr() { // from class: com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl.ud.1
            @Override // com.bytedance.sdk.component.ud.qdl.lnr
            public void qdl(com.bytedance.sdk.component.ud.qdl.ud udVar, IOException iOException) {
                ud.this.qdl(30000, iOException.getMessage());
            }

            /* JADX WARN: Code duplicated, block: B:79:0x0191 A[Catch: all -> 0x01b8, TryCatch #2 {all -> 0x01b8, blocks: (B:77:0x018c, B:79:0x0191, B:80:0x0194, B:82:0x019f, B:84:0x01b3), top: B:93:0x018c }] */
            @Override // com.bytedance.sdk.component.ud.qdl.lnr
            public void qdl(com.bytedance.sdk.component.ud.qdl.ud udVar, rdp rdpVar) throws IOException {
                bjy bjyVarMo;
                if (rdpVar == null) {
                    ud.this.qdl(Sdk.SDKError.Reason.AD_INTERNAL_INTEGRATION_ERROR_VALUE, "response is empty");
                    return;
                }
                InputStream inputStreamLnr = null;
                try {
                    try {
                        ud.this.tvp = rdpVar.mml();
                        if (ud.this.tvp) {
                            bjyVarMo = rdpVar.mo();
                            try {
                                if (ud.this.tvp && bjyVarMo != null) {
                                    ud.this.qdl = bjyVarMo.qdl() + ud.this.mzz;
                                    inputStreamLnr = bjyVarMo.lnr();
                                }
                                if (inputStreamLnr == null) {
                                    ud.this.qdl(Sdk.SDKError.Reason.CONFIG_NOT_FOUND_ERROR_VALUE, "input_stream is empty");
                                    if (inputStreamLnr != null) {
                                        inputStreamLnr.close();
                                    }
                                    if (bjyVarMo != null) {
                                        bjyVarMo.close();
                                    }
                                    rdpVar.close();
                                    if (!ud.this.tvp || ud.this.lnr.length() != ud.this.qdl) {
                                        return;
                                    }
                                } else {
                                    byte[] bArr = new byte[Segment.SIZE];
                                    long j = ud.this.mzz;
                                    long j2 = 0;
                                    loop0: while (true) {
                                        int i2 = 0;
                                        while (true) {
                                            int i3 = inputStreamLnr.read(bArr, i2, 8192 - i2);
                                            if (i3 == -1) {
                                                break loop0;
                                            }
                                            i2 += i3;
                                            j2 += (long) i3;
                                            boolean z2 = j2 % PlaybackStateCompat.ACTION_PLAY_FROM_URI == 0 || j2 == ud.this.qdl - ud.this.mzz;
                                            long unused = ud.this.qdl;
                                            long unused2 = ud.this.mzz;
                                            ud.this.rq.yt();
                                            ud.this.rq.jtx();
                                            if (z2) {
                                                synchronized (ud.this.ud) {
                                                    com.bykv.vk.openvk.qdl.qdl.ud.mml.ud.qdl(ud.this.to, bArr, Long.valueOf(j).intValue(), i2, ud.this.rq.yt());
                                                }
                                                j += (long) i2;
                                            }
                                        }
                                    }
                                    long unused3 = ud.this.mzz;
                                    long unused4 = ud.this.qdl;
                                    long unused5 = ud.this.qdl;
                                    long unused6 = ud.this.mzz;
                                    ud.this.rq.jtx();
                                }
                                ud.this.mo();
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    ud.this.qdl(Sdk.SDKError.Reason.AD_PUBLISHER_MISMATCH_VALUE, th.getMessage());
                                    if (inputStreamLnr != null) {
                                        inputStreamLnr.close();
                                    }
                                    if (bjyVarMo != null) {
                                        bjyVarMo.close();
                                    }
                                    rdpVar.close();
                                    if (ud.this.tvp && ud.this.lnr.length() == ud.this.qdl) {
                                        ud.this.mo();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th2) {
                                    if (inputStreamLnr != null) {
                                        try {
                                            inputStreamLnr.close();
                                            if (bjyVarMo != null) {
                                                bjyVarMo.close();
                                            }
                                            rdpVar.close();
                                            if (ud.this.tvp && ud.this.lnr.length() == ud.this.qdl) {
                                                ud.this.mo();
                                            }
                                        } catch (Throwable unused7) {
                                            throw th2;
                                        }
                                    } else {
                                        if (bjyVarMo != null) {
                                            bjyVarMo.close();
                                        }
                                        rdpVar.close();
                                        if (ud.this.tvp) {
                                            ud.this.mo();
                                        }
                                    }
                                    throw th2;
                                }
                            }
                        }
                        ud.this.qdl(rdpVar.lnr(), rdpVar.mzz());
                        bjyVarMo = null;
                        if (inputStreamLnr != null) {
                            inputStreamLnr.close();
                        }
                        if (bjyVarMo != null) {
                            bjyVarMo.close();
                        }
                        rdpVar.close();
                        if (!ud.this.tvp || ud.this.lnr.length() != ud.this.qdl) {
                            return;
                        }
                        ud.this.mo();
                    } catch (Throwable th3) {
                        th = th3;
                        bjyVarMo = null;
                    }
                } catch (Throwable unused8) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(int i2, String str) {
        JSONObject jSONObjectLnr;
        this.tvp = false;
        this.wd = i2;
        this.qdl = this.mo;
        aaj.ud("CSJ_MediaDLPlay", "handleFailResponse: ", Integer.valueOf(i2), " ", str);
        com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar = this.rq;
        if (lnrVar == null || !lnrVar.qdl() || (jSONObjectLnr = this.rq.lnr()) == null) {
            return;
        }
        try {
            jSONObjectLnr.put("error_real_code", i2);
            jSONObjectLnr.put("error_real_msg", str);
        } catch (Throwable th) {
            aaj.qdl("CSJ_MediaDLPlay", "handleFailResponse: ", th);
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.ud.qdl.qdl.lnr
    public int qdl(long j, byte[] bArr, int i2, int i3) throws IOException {
        try {
            if (j == this.qdl) {
                return -1;
            }
            int i4 = 0;
            int i5 = 0;
            while (!this.jpc) {
                synchronized (this.ud) {
                    try {
                        if (j < mzz()) {
                            this.to.seek(j);
                            i5 = this.to.read(bArr, i2, i3);
                        } else {
                            i4 += 33;
                            this.ud.wait(33L);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i5 > 0) {
                    return i5;
                }
                com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar = this.rq;
                if (lnrVar != null && lnrVar.qdl() && this.wd != -100 && (!this.tvp || this.qdl == this.mo)) {
                    throw new IOException();
                }
                if (i4 >= 20000) {
                    throw new SocketTimeoutException();
                }
            }
            return -1;
        } catch (Throwable th2) {
            if (th2 instanceof IOException) {
                throw th2;
            }
            throw new IOException();
        }
    }
}
