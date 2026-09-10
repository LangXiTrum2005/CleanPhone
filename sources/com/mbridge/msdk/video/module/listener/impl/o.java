package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class o extends k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f37814n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f37815o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f37816p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f37817q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f37818r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f37819s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected int f37820t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Map<Integer, String> f37821u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private MBridgeVideoView.u f37822v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f37823w;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f37824a;

        public a(Object obj) {
            this.f37824a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f37824a;
            if (obj instanceof String) {
                o.this.b((String) obj);
            }
        }
    }

    public o(CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
        this.f37819s = false;
        this.f37820t = 0;
        this.f37823w = -1;
        if (this.f37790a) {
            this.f37821u = campaignEx.getAdvImpList();
        }
        this.f37820t = campaignEx.getVideoCompleteTime();
    }

    /* JADX WARN: Code duplicated, block: B:77:0x014a A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:18:0x0026, B:21:0x0031, B:23:0x0040, B:25:0x004b, B:24:0x0048, B:26:0x005c, B:82:0x0164, B:27:0x0064, B:29:0x0077, B:31:0x007b, B:33:0x0081, B:35:0x0086, B:37:0x008a, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00bf, B:46:0x00c8, B:48:0x00cc, B:53:0x00d4, B:54:0x00d8, B:55:0x00eb, B:58:0x00f1, B:60:0x00f5, B:62:0x00fe, B:64:0x0102, B:66:0x0114, B:68:0x0118, B:69:0x0128, B:71:0x012c, B:72:0x0136, B:74:0x0140, B:76:0x0144, B:77:0x014a, B:79:0x014e, B:81:0x0152), top: B:86:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x014e A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:18:0x0026, B:21:0x0031, B:23:0x0040, B:25:0x004b, B:24:0x0048, B:26:0x005c, B:82:0x0164, B:27:0x0064, B:29:0x0077, B:31:0x007b, B:33:0x0081, B:35:0x0086, B:37:0x008a, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00bf, B:46:0x00c8, B:48:0x00cc, B:53:0x00d4, B:54:0x00d8, B:55:0x00eb, B:58:0x00f1, B:60:0x00f5, B:62:0x00fe, B:64:0x0102, B:66:0x0114, B:68:0x0118, B:69:0x0128, B:71:0x012c, B:72:0x0136, B:74:0x0140, B:76:0x0144, B:77:0x014a, B:79:0x014e, B:81:0x0152), top: B:86:0x0006 }] */
    @Override // com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        int i11;
        CampaignEx campaignEx;
        try {
            if (i10 != 2) {
                int videoLength = 0;
                if (i10 != 20) {
                    if (i10 != 130) {
                        if (i10 == 6) {
                            if (this.f37790a && !this.f37816p) {
                                this.f37816p = true;
                                l();
                                com.mbridge.msdk.video.module.report.b.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37791b);
                            }
                        } else if (i10 != 7) {
                            if (i10 == 15) {
                                j();
                                h();
                                i();
                                if (s0.a().a("i_l_s_t_r_i", false) && !this.f37817q) {
                                    this.f37817q = true;
                                    MBridgeVideoView.u uVar = this.f37822v;
                                    if (uVar != null) {
                                        uVar.a();
                                    }
                                }
                                if (obj == null || !(obj instanceof MBridgeVideoView.v)) {
                                    i11 = 0;
                                } else {
                                    int i12 = ((MBridgeVideoView.v) obj).f37759a;
                                    videoLength = ((MBridgeVideoView.v) obj).f37760b;
                                    i11 = i12;
                                }
                                if (videoLength == 0 && (campaignEx = this.f37791b) != null) {
                                    videoLength = campaignEx.getVideoLength();
                                }
                                com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37791b, i11, videoLength, this.f37799j);
                                com.mbridge.msdk.video.module.report.b.a(this.f37791b, this.f37821u, this.f37796g, i11);
                                if (!this.f37818r) {
                                    this.f37818r = true;
                                    com.mbridge.msdk.video.module.report.b.a(this.f37791b, this.f37796g);
                                }
                                if (!this.f37819s) {
                                    int i13 = this.f37820t;
                                    if (i13 != 0) {
                                        videoLength = i13;
                                    }
                                    if (i11 >= videoLength) {
                                        this.f37819s = true;
                                        i10 = 17;
                                    }
                                }
                                q0.b("NotifyListener", "onPlayProgress:" + i11);
                                this.f37823w = i11;
                            } else if (i10 != 16) {
                                switch (i10) {
                                    case 11:
                                        a();
                                        l();
                                        break;
                                    case 12:
                                        a aVar = new a(obj);
                                        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                                            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
                                        } else {
                                            aVar.run();
                                        }
                                        l();
                                        c();
                                        b();
                                        e();
                                        a();
                                        break;
                                    case 13:
                                        c();
                                        b();
                                        break;
                                }
                            } else if (this.f37790a) {
                                this.f37816p = true;
                                l();
                                com.mbridge.msdk.video.module.report.b.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37791b);
                            }
                        } else if (this.f37790a && obj != null && (obj instanceof Integer)) {
                            int iIntValue = ((Integer) obj).intValue();
                            if (iIntValue == 2) {
                                if (!this.f37815o) {
                                    this.f37815o = true;
                                    com.mbridge.msdk.video.module.report.b.e(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37791b);
                                }
                            } else if (iIntValue == 1 && !this.f37814n) {
                                this.f37814n = true;
                                com.mbridge.msdk.video.module.report.b.f(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37791b);
                            }
                        }
                    } else if (obj instanceof Integer) {
                        this.f37820t = ((Integer) obj).intValue();
                    }
                } else if (s0.a().a("i_l_s_t_r_i", false) && (obj instanceof MBridgeVideoView.u)) {
                    this.f37822v = (MBridgeVideoView.u) obj;
                }
            } else if (this.f37790a) {
                this.f37816p = true;
                l();
                com.mbridge.msdk.video.module.report.b.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37791b);
            }
            this.f37798i.a(i10, obj);
        } catch (Throwable th2) {
            q0.b("NotifyListener", th2.getMessage(), th2);
        }
    }
}
