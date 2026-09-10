package com.bytedance.sdk.openadsdk.wd;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bytedance.sdk.component.ud.qdl.exu;
import com.bytedance.sdk.component.ud.qdl.fs;
import com.bytedance.sdk.component.ud.qdl.lnr;
import com.bytedance.sdk.component.ud.qdl.mo;
import com.bytedance.sdk.component.ud.qdl.mzz;
import com.bytedance.sdk.component.ud.qdl.rdp;
import com.bytedance.sdk.component.ud.qdl.rq;
import com.bytedance.sdk.component.ud.qdl.tvp;
import com.p004ironsource.mediationsdk.metadata.a;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class qdl implements INetWork {
    protected rq qdl;
    protected rq ud;

    public qdl() {
        rq.qdl qdlVar = new rq.qdl();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.qdl = qdlVar.qdl(10L, timeUnit).ud(10L, timeUnit).lnr(10L, timeUnit).qdl();
        this.ud = new rq.qdl().qdl(10L, timeUnit).ud(30L, timeUnit).lnr(30L, timeUnit).qdl();
    }

    private Map<String, String> qdl(mo moVar) {
        if (moVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < moVar.qdl(); i2++) {
            map.put(moVar.qdl(i2), moVar.ud(i2));
        }
        return map;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doGet(String str) throws Exception {
        rdp rdpVarUd = this.qdl.qdl(new fs.qdl().qdl().ud(str).qdl("gecko").ud()).ud();
        return new Response(qdl(rdpVarUd.wd()), rdpVarUd.lnr() == 200 ? rdpVarUd.mo().ud() : null, rdpVarUd.lnr(), rdpVarUd.mzz());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, List<Pair<String, String>> list) throws Exception {
        mzz.qdl qdlVar = new mzz.qdl();
        if (list != null) {
            for (Pair<String, String> pair : list) {
                qdlVar.qdl((String) pair.first, (String) pair.second);
            }
        }
        rdp rdpVarUd = this.qdl.qdl(new fs.qdl().ud(str).qdl((exu) qdlVar.qdl()).qdl("gecko").ud()).ud();
        return new Response(qdl(rdpVarUd.wd()), rdpVarUd.lnr() == 200 ? rdpVarUd.mo().ud() : null, rdpVarUd.lnr(), rdpVarUd.mzz());
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0044: MOVE (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:69), block:B:12:0x0044 */
    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void downloadFile(String str, long j, BufferOutputStream bufferOutputStream) throws Exception {
        Exception e2;
        Closeable closeable;
        Closeable closeable2 = null;
        int i2 = 0;
        try {
            try {
                try {
                    rdp rdpVarUd = this.ud.qdl(new fs.qdl().qdl().qdl("gecko").ud(str).ud()).ud();
                    int iLnr = rdpVarUd.lnr();
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(rdpVarUd.mo().lnr());
                        try {
                            byte[] bArr = new byte[a.f25965n];
                            while (true) {
                                int i3 = bufferedInputStream.read(bArr, 0, a.f25965n);
                                if (i3 == -1) {
                                    CloseableUtils.close(bufferedInputStream);
                                    return;
                                }
                                bufferOutputStream.write(bArr, 0, i3);
                            }
                        } catch (Exception e3) {
                            e2 = e3;
                            i2 = iLnr;
                            throw new RuntimeException("downloadFile failed, code: " + i2 + ", url:" + str + ", caused by:" + e2.getMessage(), e2);
                        }
                    } catch (Exception e4) {
                        e2 = e4;
                    }
                } catch (Throwable th) {
                    th = th;
                    CloseableUtils.close(closeable2);
                    throw th;
                }
            } catch (Exception e5) {
                e2 = e5;
            }
        } catch (Throwable th2) {
            th = th2;
            closeable2 = closeable;
            CloseableUtils.close(closeable2);
            throw th;
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void syncDoGet(final String str) {
        this.qdl.qdl(new fs.qdl().qdl().ud(str).qdl("gecko").ud()).qdl(new lnr() { // from class: com.bytedance.sdk.openadsdk.wd.qdl.1
            @Override // com.bytedance.sdk.component.ud.qdl.lnr
            public void qdl(com.bytedance.sdk.component.ud.qdl.ud udVar, rdp rdpVar) throws IOException {
            }

            @Override // com.bytedance.sdk.component.ud.qdl.lnr
            public void qdl(com.bytedance.sdk.component.ud.qdl.ud udVar, IOException iOException) {
            }
        });
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, String str2) throws Exception {
        rdp rdpVarUd = this.qdl.qdl(new fs.qdl().ud(str).qdl(exu.qdl(tvp.qdl("application/json; charset=utf-8"), str2)).qdl("gecko").ud()).ud();
        return new Response(qdl(rdpVarUd.wd()), rdpVarUd.lnr() == 200 ? rdpVarUd.mo().ud() : null, rdpVarUd.lnr(), rdpVarUd.mzz());
    }
}
