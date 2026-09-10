package com.bytedance.sdk.openadsdk.xha;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bytedance.sdk.component.lr.ri.aw;
import com.bytedance.sdk.component.lr.ri.bgr;
import com.bytedance.sdk.component.lr.ri.co;
import com.bytedance.sdk.component.lr.ri.di;
import com.bytedance.sdk.component.lr.ri.fi;
import com.bytedance.sdk.component.lr.ri.ik;
import com.bytedance.sdk.component.lr.ri.jbs;
import com.bytedance.sdk.component.lr.ri.sf;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements INetWork {
    protected sf lr;
    protected sf ri;

    public ri() {
        sf.ri riVar = new sf.ri();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.ri = riVar.ri(10L, timeUnit).lr(10L, timeUnit).ik(10L, timeUnit).ri();
        this.lr = new sf.ri().ri(10L, timeUnit).lr(30L, timeUnit).ik(30L, timeUnit).ri();
    }

    private Map<String, String> ri(di diVar) {
        if (diVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < diVar.ri(); i++) {
            map.put(diVar.ri(i), diVar.lr(i));
        }
        return map;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doGet(String str) throws Exception {
        bgr bgrVarLr = this.ri.ri(new co.ri().ri().lr(str).ri("gecko").lr()).lr();
        return new Response(ri(bgrVarLr.xha()), bgrVarLr.ik() == 200 ? bgrVarLr.di().lr() : null, bgrVarLr.ik(), bgrVarLr.fi());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, List<Pair<String, String>> list) throws Exception {
        fi.ri riVar = new fi.ri();
        if (list != null) {
            for (Pair<String, String> pair : list) {
                riVar.ri((String) pair.first, (String) pair.second);
            }
        }
        bgr bgrVarLr = this.ri.ri(new co.ri().lr(str).ri((aw) riVar.ri()).ri("gecko").lr()).lr();
        return new Response(ri(bgrVarLr.xha()), bgrVarLr.ik() == 200 ? bgrVarLr.di().lr() : null, bgrVarLr.ik(), bgrVarLr.fi());
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0044: MOVE (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:69), block:B:12:0x0044 */
    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void downloadFile(String str, long j, BufferOutputStream bufferOutputStream) throws Exception {
        Exception e;
        Closeable closeable;
        Closeable closeable2 = null;
        int i = 0;
        try {
            try {
                try {
                    bgr bgrVarLr = this.lr.ri(new co.ri().ri().ri("gecko").lr(str).lr()).lr();
                    int iIk = bgrVarLr.ik();
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(bgrVarLr.di().ik());
                        try {
                            byte[] bArr = new byte[2048];
                            while (true) {
                                int i2 = bufferedInputStream.read(bArr, 0, 2048);
                                if (i2 == -1) {
                                    CloseableUtils.close(bufferedInputStream);
                                    return;
                                }
                                bufferOutputStream.write(bArr, 0, i2);
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i = iIk;
                            throw new RuntimeException("downloadFile failed, code: " + i + ", url:" + str + ", caused by:" + e.getMessage(), e);
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Throwable th) {
                    th = th;
                    CloseableUtils.close(closeable2);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
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
        this.ri.ri(new co.ri().ri().lr(str).ri("gecko").lr()).ri(new ik() { // from class: com.bytedance.sdk.openadsdk.xha.ri.1
            @Override // com.bytedance.sdk.component.lr.ri.ik
            public void ri(com.bytedance.sdk.component.lr.ri.lr lrVar, bgr bgrVar) throws IOException {
            }

            @Override // com.bytedance.sdk.component.lr.ri.ik
            public void ri(com.bytedance.sdk.component.lr.ri.lr lrVar, IOException iOException) {
            }
        });
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, String str2) throws Exception {
        bgr bgrVarLr = this.ri.ri(new co.ri().lr(str).ri(aw.ri(jbs.ri("application/json; charset=utf-8"), str2)).ri("gecko").lr()).lr();
        return new Response(ri(bgrVarLr.xha()), bgrVarLr.ik() == 200 ? bgrVarLr.di().lr() : null, bgrVarLr.ik(), bgrVarLr.fi());
    }
}
