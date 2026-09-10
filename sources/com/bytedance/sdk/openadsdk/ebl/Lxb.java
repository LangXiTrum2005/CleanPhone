package com.bytedance.sdk.openadsdk.ebl;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bytedance.sdk.component.LD.Lxb.IeN;
import com.bytedance.sdk.component.LD.Lxb.JVA;
import com.bytedance.sdk.component.LD.Lxb.JXs;
import com.bytedance.sdk.component.LD.Lxb.NXR;
import com.bytedance.sdk.component.LD.Lxb.QAg;
import com.bytedance.sdk.component.LD.Lxb.STP;
import com.bytedance.sdk.component.LD.Lxb.lc;
import com.bytedance.sdk.component.LD.Lxb.lk;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements INetWork {
    protected JVA LD;
    protected JVA Lxb;

    public Lxb() {
        JVA.Lxb lxb = new JVA.Lxb();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.Lxb = lxb.Lxb(10L, timeUnit).LD(10L, timeUnit).lk(10L, timeUnit).Lxb();
        this.LD = new JVA.Lxb().Lxb(10L, timeUnit).LD(30L, timeUnit).lk(30L, timeUnit).Lxb();
    }

    private Map<String, String> Lxb(lc lcVar) {
        if (lcVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < lcVar.Lxb(); i++) {
            map.put(lcVar.Lxb(i), lcVar.LD(i));
        }
        return map;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doGet(String str) throws Exception {
        IeN ieNLD = this.Lxb.Lxb(new NXR.Lxb().Lxb().LD(str).LD()).LD();
        return new Response(Lxb(ieNLD.ebl()), ieNLD.lk() == 200 ? ieNLD.lc().LD() : null, ieNLD.lk(), ieNLD.JXs());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, List<Pair<String, String>> list) throws Exception {
        JXs.Lxb lxb = new JXs.Lxb();
        if (list != null) {
            for (Pair<String, String> pair : list) {
                lxb.Lxb((String) pair.first, (String) pair.second);
            }
        }
        IeN ieNLD = this.Lxb.Lxb(new NXR.Lxb().LD(str).Lxb((STP) lxb.Lxb()).LD()).LD();
        return new Response(Lxb(ieNLD.ebl()), ieNLD.lk() == 200 ? ieNLD.lc().LD() : null, ieNLD.lk(), ieNLD.JXs());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void downloadFile(String str, long j, BufferOutputStream bufferOutputStream) throws Exception {
        BufferedInputStream bufferedInputStream;
        Exception e;
        BufferedInputStream bufferedInputStream2 = null;
        int i = 0;
        try {
            try {
                IeN ieNLD = this.LD.Lxb(new NXR.Lxb().Lxb().LD(str).LD()).LD();
                int iLk = ieNLD.lk();
                try {
                    bufferedInputStream = new BufferedInputStream(ieNLD.lc().lk());
                    try {
                        try {
                            byte[] bArr = new byte[2048];
                            while (true) {
                                int i2 = bufferedInputStream.read(bArr, 0, 2048);
                                if (i2 == -1) {
                                    CloseableUtils.close(bufferedInputStream);
                                    return;
                                }
                                bufferOutputStream.write(bArr, 0, i2);
                                th = th;
                                bufferedInputStream2 = bufferedInputStream;
                                CloseableUtils.close(bufferedInputStream2);
                                throw th;
                            }
                        } catch (Throwable th) {
                            th = th;
                            bufferedInputStream2 = bufferedInputStream;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        i = iLk;
                        throw new RuntimeException("downloadFile failed, code: " + i + ", url:" + str + ", caused by:" + e.getMessage(), e);
                    }
                } catch (Exception e3) {
                    bufferedInputStream = null;
                    e = e3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e4) {
            bufferedInputStream = null;
            e = e4;
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void syncDoGet(final String str) {
        this.Lxb.Lxb(new NXR.Lxb().Lxb().LD(str).LD()).Lxb(new lk() { // from class: com.bytedance.sdk.openadsdk.ebl.Lxb.1
            @Override // com.bytedance.sdk.component.LD.Lxb.lk
            public void Lxb(com.bytedance.sdk.component.LD.Lxb.LD ld, IeN ieN) throws IOException {
            }

            @Override // com.bytedance.sdk.component.LD.Lxb.lk
            public void Lxb(com.bytedance.sdk.component.LD.Lxb.LD ld, IOException iOException) {
            }
        });
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, String str2) throws Exception {
        IeN ieNLD = this.Lxb.Lxb(new NXR.Lxb().LD(str).Lxb(STP.Lxb(QAg.Lxb("application/json; charset=utf-8"), str2)).LD()).LD();
        return new Response(Lxb(ieNLD.ebl()), ieNLD.lk() == 200 ? ieNLD.lc().LD() : null, ieNLD.lk(), ieNLD.JXs());
    }
}
