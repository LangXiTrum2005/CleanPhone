package com.smartdigimkt.u2;

import com.smartdigimkt.expressad.video.module.AnythinkVideoView;
import com.smartdigimkt.expressad.video.signal.factory.IJSFactory;

/* JADX INFO: loaded from: classes6.dex */
public class n extends o {
    private IJSFactory u0;
    private int v0;
    private boolean w0;
    private int x0;
    private boolean y0;

    public n(IJSFactory iJSFactory, com.smartdigimkt.x.d dVar, com.smartdigimkt.d3.c cVar, com.smartdigimkt.c3.c cVar2, String str, String str2, int i2, int i3, com.smartdigimkt.t2.a aVar, int i4, boolean z2, int i5) {
        super(dVar, cVar, cVar2, str, str2, aVar, i4, z2);
        this.w0 = false;
        this.y0 = false;
        this.u0 = iJSFactory;
        this.v0 = i2;
        this.w0 = i3 == 0;
        this.x0 = i5;
        if (iJSFactory == null) {
            this.W = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0294  */
    /* JADX WARN: Code duplicated, block: B:84:0x0227  */
    /* JADX WARN: Code duplicated, block: B:86:0x0232  */
    /* JADX WARN: Code duplicated, block: B:90:0x0251  */
    /* JADX WARN: Code duplicated, block: B:92:0x0259  */
    /* JADX WARN: Code duplicated, block: B:93:0x0263  */
    @Override // com.smartdigimkt.u2.o, com.smartdigimkt.u2.k, com.smartdigimkt.u2.f, com.smartdigimkt.t2.a
    public void a(int i2, Object obj) {
        int i3;
        if (this.W) {
            if (i2 != 1) {
                if (i2 == 2) {
                    this.u0.getJSVideoModule().dismissAllAlert();
                    if (i2 == 2) {
                        this.u0.getJSNotifyProxy().a(2, "");
                    }
                    this.u0.getJSVideoModule().videoOperate(3);
                    if (this.u0.getJSCommon().k() != 2) {
                        if (this.X.v2() != 3) {
                            this.u0.getJSVideoModule().setVisible(8);
                        } else {
                            this.u0.getJSVideoModule().setVisible(0);
                        }
                        if (this.v0 == 2 || this.u0.getJSContainerModule().endCardShowing() || this.X.R() == 2) {
                            i2 = 16;
                        } else {
                            this.u0.getJSContainerModule().showEndcard(this.X.v2());
                        }
                    } else {
                        i2 = 16;
                    }
                    this.u0.getJSNotifyProxy().a(1);
                } else if (i2 != 5) {
                    if (i2 == 6) {
                        this.u0.getJSVideoModule().dismissAllAlert();
                        if (i2 == 2) {
                            this.u0.getJSNotifyProxy().a(2, "");
                        }
                        this.u0.getJSVideoModule().videoOperate(3);
                        if (this.u0.getJSCommon().k() != 2) {
                            if (this.X.v2() != 3) {
                                this.u0.getJSVideoModule().setVisible(8);
                            } else {
                                this.u0.getJSVideoModule().setVisible(0);
                            }
                            if (this.v0 == 2) {
                                i2 = 16;
                            } else {
                                i2 = 16;
                            }
                        } else {
                            i2 = 16;
                        }
                        this.u0.getJSNotifyProxy().a(1);
                    } else if (i2 != 8) {
                        if (i2 != 114) {
                            if (i2 != 116) {
                                switch (i2) {
                                    case 10:
                                        this.y0 = true;
                                        this.u0.getJSNotifyProxy().a(0);
                                        break;
                                    case 11:
                                    case 12:
                                        this.u0.getJSVideoModule().videoOperate(3);
                                        if (this.X.v2() == 3) {
                                            this.u0.getJSVideoModule().setVisible(0);
                                        } else if (this.X.R() != 2) {
                                            this.u0.getJSVideoModule().setVisible(8);
                                        }
                                        if (i2 == 12) {
                                            k();
                                            i3 = 2;
                                        } else {
                                            i3 = 1;
                                        }
                                        this.u0.getJSNotifyProxy().a(i3);
                                        if (this.u0.getJSCommon().k() == 2) {
                                            this.u0.getJSVideoModule().setVisible(0);
                                            com.smartdigimkt.x2.j jSVideoModule = this.u0.getJSVideoModule();
                                            this.u0.getJSContainerModule().showMiniCard(jSVideoModule.getBorderViewTop(), jSVideoModule.getBorderViewLeft(), jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                                        } else if (i2 == 12) {
                                            if (this.x0 == 1) {
                                                if (this.X.R() != 2) {
                                                    this.u0.getJSContainerModule().showEndcard(this.X.v2());
                                                } else {
                                                    this.u0.getJSContainerModule().showVideoEndCover();
                                                }
                                            }
                                        } else if (this.X.R() != 2) {
                                            this.u0.getJSContainerModule().showEndcard(this.X.v2());
                                        } else {
                                            this.u0.getJSContainerModule().showVideoEndCover();
                                        }
                                        this.u0.getJSVideoModule().dismissAllAlert();
                                        if (i2 == 12 && !this.y0 && this.x0 == 1) {
                                            k();
                                            j();
                                            h();
                                            i();
                                        }
                                        break;
                                    case 13:
                                        if (!this.u0.getJSVideoModule().isH5Canvas()) {
                                            this.u0.getJSVideoModule().closeVideoOperate(0, 2);
                                        }
                                        this.u0.getJSNotifyProxy().a(-1);
                                        break;
                                    case 14:
                                        if (!this.w0) {
                                            this.u0.getJSVideoModule().closeVideoOperate(0, 1);
                                        }
                                        break;
                                    case 15:
                                        if (obj != null && (obj instanceof AnythinkVideoView.t)) {
                                            this.w0 = true;
                                            this.u0.getJSNotifyProxy().a((AnythinkVideoView.t) obj);
                                        }
                                        break;
                                    default:
                                        switch (i2) {
                                            case 123:
                                            case 124:
                                                this.u0.getJSNotifyProxy().a(i2 == 123 ? 7 : 6, "");
                                                break;
                                            case 125:
                                                this.u0.getJSContainerModule().hideAlertWebview();
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                com.smartdigimkt.x2.j jSVideoModule2 = this.u0.getJSVideoModule();
                                this.u0.getJSContainerModule().configurationChanged(jSVideoModule2.getBorderViewWidth(), jSVideoModule2.getBorderViewHeight(), jSVideoModule2.getBorderViewRadius());
                            }
                        } else if (this.u0.getJSCommon().k() == 2) {
                            com.smartdigimkt.x2.j jSVideoModule3 = this.u0.getJSVideoModule();
                            this.u0.getJSContainerModule().showMiniCard(jSVideoModule3.getBorderViewTop(), jSVideoModule3.getBorderViewLeft(), jSVideoModule3.getBorderViewWidth(), jSVideoModule3.getBorderViewHeight(), jSVideoModule3.getBorderViewRadius());
                        }
                    } else if (this.u0.getJSContainerModule().showAlertWebView()) {
                        this.u0.getJSVideoModule().alertWebViewShowed();
                    } else {
                        this.u0.getJSVideoModule().showAlertView();
                    }
                } else if (obj != null && (obj instanceof Integer)) {
                    Integer num = ((Integer) obj).intValue() == 1 ? 2 : 1;
                    this.u0.getJSVideoModule().soundOperate(num.intValue(), -1);
                    this.u0.getJSNotifyProxy().a(5, num + "");
                }
            } else if (!this.u0.getJSContainerModule().endCardShowing()) {
                this.u0.getJSNotifyProxy().a(1, obj != null ? obj.toString() : "");
            }
        }
        super.a(i2, obj);
    }
}
