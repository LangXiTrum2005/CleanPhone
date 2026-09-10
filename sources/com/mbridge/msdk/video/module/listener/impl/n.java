package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.factory.IJSFactory;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class n extends o {
    private boolean A;
    private int B;
    private boolean C;
    private MBridgeVideoView.u D;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private IJSFactory f37811x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f37812y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f37813z;

    public n(IJSFactory iJSFactory, CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, int i10, int i11, com.mbridge.msdk.video.module.listener.a aVar2, int i12, boolean z10, int i13) {
        super(campaignEx, cVar, aVar, str, str2, aVar2, i12, z10);
        this.f37813z = false;
        this.A = false;
        this.C = false;
        this.f37811x = iJSFactory;
        this.f37812y = i10;
        this.f37813z = i11 == 0;
        this.B = i13;
        if (iJSFactory == null) {
            this.f37790a = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0289  */
    /* JADX WARN: Code duplicated, block: B:105:0x0291  */
    /* JADX WARN: Code duplicated, block: B:106:0x029b  */
    /* JADX WARN: Code duplicated, block: B:114:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:97:0x025f  */
    /* JADX WARN: Code duplicated, block: B:99:0x026a  */
    @Override // com.mbridge.msdk.video.module.listener.impl.o, com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        int i11;
        int i12 = i10;
        if (this.f37790a) {
            if (i12 != 1) {
                if (i12 == 2) {
                    this.f37811x.getJSVideoModule().dismissAllAlert();
                    if (i12 == 2) {
                        this.f37811x.getJSNotifyProxy().a(2, "");
                    }
                    this.f37811x.getJSVideoModule().videoOperate(3);
                    if (this.f37811x.getJSCommon().i() != 2) {
                        if (this.f37791b.getVideo_end_type() != 3) {
                            this.f37811x.getJSVideoModule().setVisible(8);
                        } else {
                            this.f37811x.getJSVideoModule().setVisible(0);
                        }
                        if (this.f37812y == 2 || this.f37811x.getJSContainerModule().endCardShowing() || this.f37791b.getAdSpaceT() == 2) {
                            i12 = 16;
                        } else {
                            this.f37811x.getJSContainerModule().showEndcard(this.f37791b.getVideo_end_type());
                        }
                    } else {
                        i12 = 16;
                    }
                    this.f37811x.getJSNotifyProxy().a(1);
                } else if (i12 != 5) {
                    if (i12 == 6) {
                        this.f37811x.getJSVideoModule().dismissAllAlert();
                        if (i12 == 2) {
                            this.f37811x.getJSNotifyProxy().a(2, "");
                        }
                        this.f37811x.getJSVideoModule().videoOperate(3);
                        if (this.f37811x.getJSCommon().i() != 2) {
                            if (this.f37791b.getVideo_end_type() != 3) {
                                this.f37811x.getJSVideoModule().setVisible(8);
                            } else {
                                this.f37811x.getJSVideoModule().setVisible(0);
                            }
                            if (this.f37812y == 2) {
                                i12 = 16;
                            } else {
                                i12 = 16;
                            }
                        } else {
                            i12 = 16;
                        }
                        this.f37811x.getJSNotifyProxy().a(1);
                    } else if (i12 != 8) {
                        if (i12 != 20) {
                            if (i12 != 114) {
                                if (i12 != 116) {
                                    switch (i12) {
                                        case 10:
                                            this.C = true;
                                            this.f37811x.getJSNotifyProxy().a(0);
                                            break;
                                        case 11:
                                        case 12:
                                            this.f37811x.getJSVideoModule().videoOperate(3);
                                            if (this.f37791b.getVideo_end_type() == 3) {
                                                this.f37811x.getJSVideoModule().setVisible(0);
                                            } else if (this.f37791b.getAdSpaceT() != 2) {
                                                this.f37811x.getJSVideoModule().setVisible(8);
                                            }
                                            if (i12 == 12) {
                                                k();
                                                i11 = 2;
                                            } else {
                                                i11 = 1;
                                            }
                                            this.f37811x.getJSNotifyProxy().a(i11);
                                            if (this.f37811x.getJSCommon().i() == 2) {
                                                this.f37811x.getJSVideoModule().setVisible(0);
                                                com.mbridge.msdk.video.signal.j jSVideoModule = this.f37811x.getJSVideoModule();
                                                this.f37811x.getJSContainerModule().showMiniCard(jSVideoModule.getBorderViewTop(), jSVideoModule.getBorderViewLeft(), jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                                            } else if (i12 == 12) {
                                                if (this.B == 1) {
                                                    if (this.f37791b.getAdSpaceT() != 2) {
                                                        this.f37811x.getJSContainerModule().showEndcard(this.f37791b.getVideo_end_type());
                                                    } else {
                                                        this.f37811x.getJSContainerModule().showVideoEndCover();
                                                    }
                                                }
                                            } else if (this.f37791b.getAdSpaceT() != 2) {
                                                this.f37811x.getJSContainerModule().showEndcard(this.f37791b.getVideo_end_type());
                                            } else {
                                                this.f37811x.getJSContainerModule().showVideoEndCover();
                                            }
                                            this.f37811x.getJSVideoModule().dismissAllAlert();
                                            if (i12 == 12 && !this.C && this.B == 1) {
                                                k();
                                                j();
                                                h();
                                                i();
                                                if (s0.a().a("i_l_s_t_r_i", false) && !this.A) {
                                                    this.A = true;
                                                    MBridgeVideoView.u uVar = this.D;
                                                    if (uVar != null) {
                                                        uVar.a();
                                                    }
                                                }
                                            }
                                            break;
                                        case 13:
                                            if (!this.f37811x.getJSVideoModule().isH5Canvas()) {
                                                this.f37811x.getJSVideoModule().closeVideoOperate(0, 2);
                                            }
                                            this.f37811x.getJSNotifyProxy().a(-1);
                                            break;
                                        case 14:
                                            if (!this.f37813z) {
                                                this.f37811x.getJSVideoModule().closeVideoOperate(0, 1);
                                            }
                                            break;
                                        case 15:
                                            if (obj != null && (obj instanceof MBridgeVideoView.v)) {
                                                this.f37813z = true;
                                                this.f37811x.getJSNotifyProxy().a((MBridgeVideoView.v) obj);
                                            }
                                            break;
                                        default:
                                            switch (i12) {
                                                case 123:
                                                case 124:
                                                    this.f37811x.getJSNotifyProxy().a(i12 == 123 ? 7 : 6, "");
                                                    break;
                                                case 125:
                                                    this.f37811x.getJSContainerModule().hideAlertWebview();
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    com.mbridge.msdk.video.signal.j jSVideoModule2 = this.f37811x.getJSVideoModule();
                                    this.f37811x.getJSContainerModule().configurationChanged(jSVideoModule2.getBorderViewWidth(), jSVideoModule2.getBorderViewHeight(), jSVideoModule2.getBorderViewRadius());
                                }
                            } else if (this.f37811x.getJSCommon().i() == 2) {
                                com.mbridge.msdk.video.signal.j jSVideoModule3 = this.f37811x.getJSVideoModule();
                                this.f37811x.getJSContainerModule().showMiniCard(jSVideoModule3.getBorderViewTop(), jSVideoModule3.getBorderViewLeft(), jSVideoModule3.getBorderViewWidth(), jSVideoModule3.getBorderViewHeight(), jSVideoModule3.getBorderViewRadius());
                            }
                        } else if (s0.a().a("i_l_s_t_r_i", false) && (obj instanceof MBridgeVideoView.u)) {
                            this.D = (MBridgeVideoView.u) obj;
                        }
                    } else if (this.f37811x.getJSContainerModule().showAlertWebView()) {
                        this.f37811x.getJSVideoModule().alertWebViewShowed();
                    } else {
                        this.f37811x.getJSVideoModule().showAlertView();
                    }
                } else if (obj != null && (obj instanceof Integer)) {
                    Integer num = ((Integer) obj).intValue() == 1 ? 2 : 1;
                    this.f37811x.getJSVideoModule().soundOperate(num.intValue(), -1);
                    this.f37811x.getJSNotifyProxy().a(5, num + "");
                }
            } else if (!this.f37811x.getJSContainerModule().endCardShowing()) {
                this.f37811x.getJSNotifyProxy().a(1, obj != null ? obj.toString() : "");
            }
        }
        super.a(i12, obj);
    }
}
