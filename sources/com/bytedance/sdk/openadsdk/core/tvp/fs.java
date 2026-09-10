package com.bytedance.sdk.openadsdk.core.tvp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.smartdigimkt.b0.a;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class fs {
    private static String qdl;
    private static String ud;

    public static String lnr() {
        Map<String, com.bytedance.sdk.component.adexpress.qdl.lnr.qdl> mapQdl;
        com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVar;
        String strLnr;
        if (ud == null) {
            ud = com.bytedance.sdk.openadsdk.multipro.mml.mml.ud("tt_sp", "js_render_v3_ver", "");
        }
        com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVarUd = com.bytedance.sdk.component.adexpress.qdl.ud.jpc.ud();
        if (qdlVarUd != null && (mapQdl = qdlVarUd.qdl()) != null && (qdlVar = mapQdl.get(a.k)) != null && (strLnr = qdlVar.lnr()) != null && !strLnr.equals(ud)) {
            ud = strLnr;
            com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("tt_sp", "js_render_v3_ver", strLnr);
        }
        return ud;
    }

    public static void qdl() {
        com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().qdl(new com.bytedance.sdk.component.adexpress.qdl.qdl.ud() { // from class: com.bytedance.sdk.openadsdk.core.tvp.fs.1
            @Override // com.bytedance.sdk.component.adexpress.qdl.qdl.ud
            public int qdl(String str, ContentValues contentValues, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.qdl.qdl.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl(), str, contentValues, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.qdl.qdl.ud
            public Cursor qdl(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
                return new com.bytedance.sdk.openadsdk.multipro.aidl.lnr(com.bytedance.sdk.openadsdk.multipro.qdl.qdl.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl(), str, strArr, str2, strArr2, str3, str4, str5));
            }

            @Override // com.bytedance.sdk.component.adexpress.qdl.qdl.ud
            public int qdl(String str, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.qdl.qdl.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl(), str, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.qdl.qdl.ud
            public void qdl(String str, ContentValues contentValues) {
                com.bytedance.sdk.openadsdk.multipro.qdl.qdl.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl(), str, contentValues);
            }
        });
        com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().qdl(new com.bytedance.sdk.component.adexpress.qdl.qdl.lnr() { // from class: com.bytedance.sdk.openadsdk.core.tvp.fs.2

            /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.tvp.fs$2$1, reason: invalid class name */
            public class AnonymousClass1 implements Runnable {
                final /* synthetic */ int lnr;
                final /* synthetic */ MessageQueue[] qdl;
                final /* synthetic */ int ud;

                public AnonymousClass1(MessageQueue[] messageQueueArr, int i2, int i3) {
                    this.qdl = messageQueueArr;
                    this.ud = i2;
                    this.lnr = i3;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.qdl[0] = Looper.myQueue();
                    qdl(this.qdl[0], this.ud, this.lnr);
                }
            }

            @Override // com.bytedance.sdk.component.adexpress.qdl.qdl.lnr
            public int bjy() {
                return ax.lnr(com.bytedance.sdk.openadsdk.core.yt.qdl());
            }

            @Override // com.bytedance.sdk.component.adexpress.qdl.qdl.lnr
            public ExecutorService exu() {
                if (fco.fs()) {
                    return fco.mzz();
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.adexpress.qdl.qdl.lnr
            public int fs() {
                return 0;
            }

            @Override // com.bytedance.sdk.component.adexpress.qdl.qdl.lnr
            public int jl() {
                return com.bytedance.sdk.openadsdk.jyq.qdl.qdl("gaussian_blur_type", 0);
            }

            @Override // com.bytedance.sdk.component.adexpress.qdl.qdl.lnr
            public String jpc() {
                return com.bytedance.sdk.openadsdk.core.tvp.ud().mml();
            }

            @Override // com.bytedance.sdk.component.adexpress.qdl.qdl.lnr
            public int jtx() {
                return ax.mzz(com.bytedance.sdk.openadsdk.core.yt.qdl());
            }

            @Override // com.bytedance.sdk.component.adexpress.qdl.qdl.lnr
            public Handler lnr() {
                return com.bytedance.sdk.openadsdk.core.rdp.lnr();
            }

            @Override // com.bytedance.sdk.component.adexpress.qdl.qdl.lnr
            public void mml() {
                int iZy = com.bytedance.sdk.openadsdk.core.yt.mml().zy();
                int iEn = com.bytedance.sdk.openadsdk.core.yt.mml().en();
                if (iZy == 0 && iEn == 0) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.mzz.mzz.qdl().qdl(iZy);
                com.bytedance.sdk.component.adexpress.mzz.mzz.qdl().ud(iEn);
                int iMo = com.bytedance.sdk.openadsdk.jyq.qdl.mo();
                int iMzz = com.bytedance.sdk.openadsdk.jyq.qdl.mzz();
                if (iMo == 0 && iMzz == 0) {
                    return;
                }
                qdl(com.bytedance.sdk.openadsdk.core.rdp.lnr().getLooper().getQueue(), iMzz, iMo);
            }

            @Override // com.bytedance.sdk.component.adexpress.qdl.qdl.lnr
            public com.bytedance.sdk.component.wd.ud.qdl mo() {
                com.bytedance.sdk.component.wd.ud.qdl qdlVarMml = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().mml();
                qdlVarMml.qdl(8);
                qdlVarMml.qdl("express_down");
                return qdlVarMml;
            }

            @Override // com.bytedance.sdk.component.adexpress.qdl.qdl.lnr
            public com.bytedance.sdk.component.adexpress.qdl.lnr.qdl mzz() {
                return com.bytedance.sdk.openadsdk.core.yt.lnr().qdl();
            }

            @Override // com.bytedance.sdk.component.adexpress.qdl.qdl.lnr
            public ExecutorService rdp() {
                if (fco.fs()) {
                    return fco.to();
                }
                return null;
            }

            @Override // com.bytedance.sdk.component.adexpress.qdl.qdl.lnr
            public int rq() {
                return com.bytedance.sdk.openadsdk.core.yt.mml().en();
            }

            @Override // com.bytedance.sdk.component.adexpress.qdl.qdl.lnr
            public int to() {
                return com.bytedance.sdk.openadsdk.core.yt.mml().zy();
            }

            @Override // com.bytedance.sdk.component.adexpress.qdl.qdl.lnr
            public int tvp() {
                return 1;
            }

            @Override // com.bytedance.sdk.component.adexpress.qdl.qdl.lnr
            public com.bytedance.sdk.component.wd.ud.ud wd() {
                com.bytedance.sdk.component.wd.ud.ud udVarLnr = com.bytedance.sdk.openadsdk.jl.ud.ud().lnr().lnr();
                udVarLnr.qdl(8);
                udVarLnr.qdl("express_get");
                return udVarLnr;
            }

            @Override // com.bytedance.sdk.component.adexpress.qdl.qdl.lnr
            public boolean yt() {
                return com.bytedance.sdk.openadsdk.jyq.qdl.qdl("destroy_render_script", true);
            }

            @Override // com.bytedance.sdk.component.adexpress.qdl.qdl.lnr
            public Context ud() {
                return com.bytedance.sdk.openadsdk.core.yt.qdl();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void ud(final MessageQueue messageQueue, final int i2) {
                if (messageQueue == null || i2 <= 0) {
                    return;
                }
                messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.tvp.fs.2.4
                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        new com.bytedance.sdk.openadsdk.core.widget.qdl.ud(i2, false, messageQueue).ud();
                        return false;
                    }
                });
            }

            @Override // com.bytedance.sdk.component.adexpress.qdl.qdl.lnr
            public int qdl() {
                if (com.bytedance.sdk.openadsdk.core.yt.mml() == null) {
                    return 0;
                }
                return com.bytedance.sdk.openadsdk.core.yt.mml().mo();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void qdl(final MessageQueue messageQueue, final int i2, final int i3) {
                if (messageQueue != null) {
                    final int iQdl = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("ad_load_and_render_opt", "w_p_delay", 500);
                    Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tvp.fs.2.2
                        @Override // java.lang.Runnable
                        public void run() {
                            ud(messageQueue, i2);
                            qdl(messageQueue, i3);
                        }
                    };
                    if (iQdl > 0) {
                        com.bytedance.sdk.openadsdk.core.rdp.lnr().postDelayed(runnable, iQdl);
                    } else {
                        runnable.run();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void qdl(final MessageQueue messageQueue, final int i2) {
                if (messageQueue == null || i2 <= 0) {
                    return;
                }
                messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.tvp.fs.2.3
                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        new com.bytedance.sdk.openadsdk.core.widget.qdl.ud(i2, true, messageQueue).ud();
                        return false;
                    }
                });
            }
        });
        com.bytedance.sdk.component.adexpress.qdl.qdl.qdl.qdl().qdl(new com.bytedance.sdk.component.adexpress.qdl.qdl.mml() { // from class: com.bytedance.sdk.openadsdk.core.tvp.fs.3
            @Override // com.bytedance.sdk.component.adexpress.qdl.qdl.mml
            public void qdl(int i2) {
                com.bytedance.sdk.openadsdk.bjy.lnr.qdl().qdl(com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().ud(i2).mo(com.bytedance.sdk.openadsdk.core.jpc.qdl(i2)));
            }
        });
        com.bytedance.sdk.component.tvp.qdl.qdl.qdl().qdl(new com.bytedance.sdk.component.tvp.qdl.ud() { // from class: com.bytedance.sdk.openadsdk.core.tvp.fs.4
            @Override // com.bytedance.sdk.component.tvp.qdl.ud
            public void qdl(String str, String str2, JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.mml.lnr.lnr(com.bytedance.sdk.openadsdk.utils.ud.ud(), str, str2, jSONObject);
            }

            @Override // com.bytedance.sdk.component.tvp.qdl.ud
            public void qdl(com.bytedance.sdk.component.tvp.ud.qdl qdlVar, String str, String str2, JSONObject jSONObject, long j) {
                com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = new com.bytedance.sdk.openadsdk.core.model.ljh();
                ljhVar.bch(qdlVar.qdl());
                ljhVar.xmv(qdlVar.ud());
                ljhVar.ljh(qdlVar.lnr());
                com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar, str, str2, jSONObject, j);
            }

            @Override // com.bytedance.sdk.component.tvp.qdl.ud
            public void qdl(com.bytedance.sdk.component.tvp.ud.qdl qdlVar, String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
                if (qdlVar != null) {
                    com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = new com.bytedance.sdk.openadsdk.core.model.ljh();
                    ljhVar.bch(qdlVar.qdl());
                    ljhVar.xmv(qdlVar.ud());
                    ljhVar.ljh(qdlVar.lnr());
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), ljhVar, str, str2, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.core.tvp.fs.4.1
                        @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                        public JSONObject lnr() {
                            return jSONObject2;
                        }

                        @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                        public JSONObject qdl() {
                            return jSONObject;
                        }
                    });
                }
            }
        });
    }

    public static String ud() {
        String strLnr;
        if (qdl == null) {
            qdl = com.bytedance.sdk.openadsdk.multipro.mml.mml.ud("tt_sp", "js_render_ver", "");
        }
        com.bytedance.sdk.component.adexpress.qdl.lnr.qdl qdlVarUd = com.bytedance.sdk.component.adexpress.qdl.ud.jpc.ud();
        if (qdlVarUd != null && (strLnr = qdlVarUd.lnr()) != null && !strLnr.equals(qdl)) {
            qdl = strLnr;
            com.bytedance.sdk.openadsdk.multipro.mml.mml.qdl("tt_sp", "js_render_ver", strLnr);
        }
        return qdl;
    }
}
