package com.mbridge.msdk.mbbid.common.middle;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.mbbid.out.BidListennning;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34581c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BidListennning f34583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BidResponsedEx f34584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f34585g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f34587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f34588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f34589k;
    private int l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f34586h = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f34582d = com.mbridge.msdk.foundation.controller.c.n().d();

    public b(String str, String str2, String str3) {
        this.f34579a = str;
        this.f34580b = str2;
        this.f34581c = str3;
    }

    public void b(boolean z10) {
        this.f34589k = z10;
    }

    public void b(int i10) {
        this.l = i10;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends com.mbridge.msdk.mbbid.common.middle.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34590b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3) {
            super(str, str2);
            this.f34590b = str3;
        }

        @Override // com.mbridge.msdk.mbbid.common.net.c
        public void a(BidResponsedEx bidResponsedEx) {
            b.this.f34586h = false;
            b.this.f34584f = bidResponsedEx;
            com.mbridge.msdk.mbbid.common.report.a.a(b.this.f34582d, b.this.f34580b, bidResponsedEx.getBidId(), this.f34590b, bidResponsedEx.getBidToken());
            b.this.a(bidResponsedEx);
        }

        @Override // com.mbridge.msdk.mbbid.common.net.c
        public void a(int i10, String str) {
            b.this.f34586h = false;
            com.mbridge.msdk.mbbid.common.report.a.a(b.this.f34582d, b.this.f34580b, str, this.f34590b);
            b.this.a(str);
        }
    }

    public void b(long j10) {
        this.f34588j = j10;
    }

    public void a(int i10) {
        this.f34585g = i10;
    }

    public void a(long j10) {
        this.f34587i = j10;
    }

    public void a(boolean z10) {
        try {
            if (!this.f34586h) {
                this.f34586h = true;
                if (this.f34582d == null) {
                    a("context is null");
                }
                com.mbridge.msdk.mbbid.common.net.a aVar = new com.mbridge.msdk.mbbid.common.net.a(this.f34582d);
                e eVar = new e();
                String strB = com.mbridge.msdk.foundation.controller.c.n().b();
                eVar.a(MBridgeConstans.APP_ID, strB);
                eVar.a("sign", SameMD5.getMD5(strB + com.mbridge.msdk.foundation.controller.c.n().c()));
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f34580b);
                if (TextUtils.isEmpty(this.f34579a)) {
                    this.f34579a = "";
                }
                eVar.a("placement_id", this.f34579a);
                if (com.mbridge.msdk.util.b.a()) {
                    eVar.a("install_ids", c.a());
                }
                eVar.a("bid_floor", this.f34581c);
                eVar.a(e.f33883h, v0.a(this.f34582d, this.f34580b));
                eVar.a(e.f33882g, com.mbridge.msdk.foundation.same.buffer.b.a(this.f34580b, ""));
                String str = "1";
                eVar.a("req_type", this.f34589k ? "1" : "2");
                eVar.a("orientation", m0.G(this.f34582d) + "");
                int i10 = this.f34585g;
                if (i10 == 296) {
                    if (this.f34587i > 0 && this.f34588j > 0) {
                        eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f34588j + "x" + this.f34587i);
                        try {
                            Method method = BannerUtils.class.getMethod("getCloseIds", String.class);
                            if (method.invoke(null, this.f34580b) instanceof String) {
                                eVar.a("close_id", method.invoke(null, this.f34580b).toString());
                            }
                        } catch (Exception unused) {
                            a("banner module is miss");
                            return;
                        }
                    } else {
                        a("bid required param is missing or error");
                        return;
                    }
                } else if (i10 == 297) {
                    if (this.f34587i > 0 && this.f34588j > 0) {
                        eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f34588j + "x" + this.f34587i);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.l);
                        sb2.append("");
                        eVar.a("orientation", sb2.toString());
                    } else {
                        a("ad display area is too small");
                        return;
                    }
                } else if (i10 != 298) {
                    if (!z10) {
                        str = "0";
                    }
                    eVar.a("rw_plus", str);
                } else if (this.f34587i > 0 && this.f34588j > 0) {
                    eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f34588j + "x" + this.f34587i);
                } else {
                    a("bid required param is missing or error");
                    return;
                }
                String md5 = SameMD5.getMD5(v0.d());
                eVar.a(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, md5);
                a aVar2 = new a(this.f34579a, this.f34580b, md5);
                aVar2.setUnitId(this.f34580b);
                aVar2.setPlacementId(this.f34579a);
                aVar.get(1, d.h().a(false, ""), eVar, aVar2, "bid_request", 30000L);
                return;
            }
            a("current unit is biding");
        } catch (Throwable th2) {
            a(th2.getMessage());
        }
    }

    public void a(BidListennning bidListennning) {
        this.f34583e = bidListennning;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        BidListennning bidListennning = this.f34583e;
        if (bidListennning != null) {
            bidListennning.onFailed(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BidResponsed bidResponsed) {
        BidListennning bidListennning = this.f34583e;
        if (bidListennning != null) {
            bidListennning.onSuccessed(bidResponsed);
        }
    }
}
