package com.bykv.vk.openvk.qdl.qdl.ud.qdl.ud;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.extractor.text.ttml.a;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.component.ud.qdl.bjy;
import com.bytedance.sdk.component.ud.qdl.fs;
import com.bytedance.sdk.component.ud.qdl.rdp;
import com.bytedance.sdk.component.ud.qdl.rq;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ud {
    private File mml;
    private File mzz;
    private Context qdl;
    private com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr ud;
    private volatile boolean lnr = false;
    private final List<com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl> mo = new ArrayList();
    private volatile boolean wd = false;

    public ud(Context context, com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar) {
        this.mml = null;
        this.mzz = null;
        this.qdl = context;
        this.ud = lnrVar;
        this.mml = com.bykv.vk.openvk.qdl.qdl.ud.mml.ud.ud(lnrVar.mzz(), lnrVar.yt());
        this.mzz = com.bykv.vk.openvk.qdl.qdl.ud.mml.ud.lnr(lnrVar.mzz(), lnrVar.yt());
    }

    private void lnr() {
        rq.qdl qdlVarUd = com.bykv.vk.openvk.qdl.qdl.qdl.lnr.mml() != null ? com.bykv.vk.openvk.qdl.qdl.qdl.lnr.mml().ud() : new rq.qdl("v_preload");
        long jExc = this.ud.exc();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        qdlVarUd.qdl(jExc, timeUnit).ud(this.ud.aaj(), timeUnit).lnr(this.ud.jyq(), timeUnit);
        rq rqVarQdl = qdlVarUd.qdl();
        fs.qdl qdlVar = new fs.qdl();
        final long length = this.mml.length();
        int iMo = this.ud.mo();
        boolean zExu = this.ud.exu();
        int iMml = this.ud.mml();
        if (iMml > 0) {
            if (iMml >= this.ud.fs()) {
                zExu = true;
            } else {
                iMo = iMml;
            }
        }
        qdlVar.qdl("videoPreload").qdl(6);
        if (zExu) {
            qdlVar.qdl("RANGE", a.j(length, "bytes=", TokenBuilder.TOKEN_DELIMITER)).ud(this.ud.jtx()).qdl().ud();
        } else {
            qdlVar.qdl("RANGE", "bytes=" + length + TokenBuilder.TOKEN_DELIMITER + iMo).ud(this.ud.jtx()).qdl().ud();
        }
        rqVarQdl.qdl(qdlVar.ud()).qdl(new com.bytedance.sdk.component.ud.qdl.lnr() { // from class: com.bykv.vk.openvk.qdl.qdl.ud.qdl.ud.ud.1
            @Override // com.bytedance.sdk.component.ud.qdl.lnr
            public void qdl(com.bytedance.sdk.component.ud.qdl.ud udVar, IOException iOException) {
                ud udVar2 = ud.this;
                udVar2.qdl(udVar2.ud, IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION, iOException.getMessage());
                lnr.qdl(ud.this.ud);
            }

            @Override // com.bytedance.sdk.component.ud.qdl.lnr
            public void qdl(com.bytedance.sdk.component.ud.qdl.ud udVar, rdp rdpVar) throws IOException {
                InputStream inputStreamLnr;
                RandomAccessFile randomAccessFile;
                bjy bjyVarMo;
                long jQdl;
                long j = length;
                int iLnr = IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION;
                bjy bjyVar = null;
                bjyVar = null;
                randomAccessFile = null;
                randomAccessFile = null;
                RandomAccessFile randomAccessFile2 = null;
                try {
                    if (rdpVar != null) {
                        boolean zMml = rdpVar.mml();
                        if (!zMml) {
                            ud udVar2 = ud.this;
                            udVar2.qdl(udVar2.ud, rdpVar.lnr(), rdpVar.mzz());
                            ud.this.qdl((Closeable) null);
                            ud.this.qdl((Closeable) null);
                            ud.this.qdl(bjyVar);
                        }
                        bjyVarMo = rdpVar.mo();
                        try {
                            bjyVarMo = rdpVar.mo();
                            if (!zMml || bjyVarMo == null) {
                                inputStreamLnr = null;
                                jQdl = 0;
                            } else {
                                jQdl = length + bjyVarMo.qdl();
                                inputStreamLnr = bjyVarMo.lnr();
                            }
                            try {
                                if (inputStreamLnr == null) {
                                    ud udVar3 = ud.this;
                                    udVar3.qdl(udVar3.ud, rdpVar.lnr(), rdpVar.mzz());
                                } else {
                                    randomAccessFile = new RandomAccessFile(ud.this.mml, "rw");
                                    try {
                                        byte[] bArr = new byte[Segment.SIZE];
                                        int i2 = 0;
                                        long j2 = 0;
                                        while (true) {
                                            int i3 = inputStreamLnr.read(bArr, i2, 8192 - i2);
                                            if (i3 != -1) {
                                                if (ud.this.lnr) {
                                                    ud udVar4 = ud.this;
                                                    udVar4.ud(udVar4.ud, rdpVar.lnr());
                                                    ud.this.qdl(randomAccessFile);
                                                } else {
                                                    i2 += i3;
                                                    j2 += (long) i3;
                                                    if (j2 % PlaybackStateCompat.ACTION_PLAY_FROM_URI == 0 || j2 == jQdl - length) {
                                                        com.bykv.vk.openvk.qdl.qdl.ud.mml.ud.qdl(randomAccessFile, bArr, Long.valueOf(j).intValue(), i2, ud.this.ud.yt());
                                                        j += (long) i2;
                                                        i2 = 0;
                                                    }
                                                }
                                            } else {
                                                if (ud.this.ud.exu() && jQdl == ud.this.mml.length()) {
                                                    ud.this.mzz();
                                                }
                                                ud udVar5 = ud.this;
                                                udVar5.qdl(udVar5.ud, rdpVar.lnr());
                                                randomAccessFile2 = randomAccessFile;
                                            }
                                            ud.this.qdl(inputStreamLnr);
                                            ud.this.qdl(bjyVarMo);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        bjyVar = bjyVarMo;
                                        try {
                                            ud.this.mml();
                                            ud udVar6 = ud.this;
                                            com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar = udVar6.ud;
                                            if (rdpVar != null) {
                                                iLnr = rdpVar.lnr();
                                            }
                                            udVar6.qdl(lnrVar, iLnr, th.getMessage());
                                            ud.this.qdl(randomAccessFile);
                                            ud.this.qdl(inputStreamLnr);
                                            ud.this.qdl(bjyVar);
                                        } finally {
                                            ud.this.qdl(randomAccessFile);
                                            ud.this.qdl(inputStreamLnr);
                                            ud.this.qdl(bjyVar);
                                            ud.this.qdl(rdpVar);
                                            ud.this.ud.jtx();
                                            ud.this.ud.mo();
                                            lnr.qdl(ud.this.ud);
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                randomAccessFile = randomAccessFile2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            inputStreamLnr = null;
                            randomAccessFile = null;
                        }
                    } else {
                        ud udVar7 = ud.this;
                        udVar7.qdl(udVar7.ud, IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION, "Network link failed.");
                        bjyVarMo = null;
                        inputStreamLnr = null;
                    }
                    ud.this.qdl(randomAccessFile2);
                    ud.this.qdl(inputStreamLnr);
                    ud.this.qdl(bjyVarMo);
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamLnr = null;
                    randomAccessFile = null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mml() {
        try {
            this.mzz.delete();
            this.mml.delete();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mzz() {
        try {
            if (this.mml.renameTo(this.mzz)) {
                return;
            }
            throw new IOException("Error renaming file " + this.mml + " to " + this.mzz + " for completion!");
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private boolean ud() {
        if (this.mzz.exists()) {
            return true;
        }
        if (!this.ud.exu()) {
            if (this.mml.length() >= this.ud.mo()) {
                return true;
            }
            if (this.ud.mml() > 0 && this.mml.length() >= this.ud.mml()) {
                return true;
            }
        }
        return false;
    }

    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl interfaceC0056qdl) {
        if (this.wd) {
            synchronized (com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl.class) {
                this.mo.add(interfaceC0056qdl);
            }
            return;
        }
        this.mo.add(interfaceC0056qdl);
        if (ud()) {
            this.ud.jpc(1);
            qdl(this.ud, 200);
            lnr.qdl(this.ud);
        } else {
            this.wd = true;
            this.ud.jpc(0);
            lnr();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, int i2) {
        synchronized (com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl.class) {
            try {
                for (com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl interfaceC0056qdl : this.mo) {
                    if (interfaceC0056qdl != null) {
                        interfaceC0056qdl.ud(lnrVar, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr qdl() {
        return this.ud;
    }

    public void qdl(boolean z2) {
        this.lnr = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, int i2) {
        synchronized (com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl.class) {
            try {
                for (com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl interfaceC0056qdl : this.mo) {
                    if (interfaceC0056qdl != null) {
                        interfaceC0056qdl.qdl(lnrVar, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, int i2, String str) {
        synchronized (com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl.class) {
            try {
                for (com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl interfaceC0056qdl : this.mo) {
                    if (interfaceC0056qdl != null) {
                        interfaceC0056qdl.qdl(lnrVar, i2, str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
