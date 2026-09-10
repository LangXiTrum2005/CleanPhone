package com.mbridge.msdk.newreward.function.core.campaign;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.newreward.function.core.resource.d;
import com.mbridge.msdk.newreward.function.core.resource.f;
import com.mbridge.msdk.newreward.function.core.resource.g;
import com.mbridge.msdk.newreward.function.core.resource.h;
import com.mbridge.msdk.newreward.function.core.resource.j;
import com.mbridge.msdk.newreward.function.core.resource.k;
import com.mbridge.msdk.newreward.function.core.resource.l;
import com.mbridge.msdk.newreward.function.core.resource.m;
import com.mbridge.msdk.newreward.function.core.resource.n;
import com.mbridge.msdk.newreward.function.utils.c;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f1676a;
    private CampaignEx b;
    private String c;
    private String d;
    private String e;
    private d<?> f;
    private n g;
    private d<?> h;
    private l i;
    private h j;
    private m k;
    private boolean l = false;
    private boolean m = false;

    public a(b bVar) {
        this.f1676a = bVar;
    }

    public void a(String str) {
        this.c = str;
    }

    public d<?> b() {
        d<?> dVar = this.h;
        if (dVar != null) {
            return dVar;
        }
        CampaignEx campaignExA = a();
        if (campaignExA == null) {
            return null;
        }
        String str = campaignExA.getendcard_url();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.h == null) {
            if (!c.c(str) || t0.l(str)) {
                this.h = new j(h(), this);
            } else {
                this.h = new f(h(), this);
            }
        }
        return this.h;
    }

    public h c() {
        h hVar = this.j;
        if (hVar != null) {
            return hVar;
        }
        CampaignEx campaignExA = a();
        if (campaignExA == null || TextUtils.isEmpty(campaignExA.getEndScreenUrl())) {
            return null;
        }
        if (this.j == null) {
            this.j = new h(h(), this);
        }
        return this.j;
    }

    public l d() {
        l lVar = this.i;
        if (lVar != null) {
            return lVar;
        }
        CampaignEx campaignExA = a();
        if (campaignExA == null || TextUtils.isEmpty(campaignExA.getMraid())) {
            return null;
        }
        if (this.i == null) {
            this.i = new l(h(), this);
        }
        return this.i;
    }

    public m e() {
        CampaignEx.c rewardTemplateMode;
        m mVar = this.k;
        if (mVar != null) {
            return mVar;
        }
        CampaignEx campaignExA = a();
        if (campaignExA == null || (rewardTemplateMode = campaignExA.getRewardTemplateMode()) == null) {
            return null;
        }
        String strC = rewardTemplateMode.c();
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        if (this.k == null) {
            this.k = new m(h(), this, strC);
        }
        return this.k;
    }

    public n f() {
        n nVar = this.g;
        if (nVar != null) {
            return nVar;
        }
        CampaignEx campaignExA = a();
        if (campaignExA == null || TextUtils.isEmpty(campaignExA.getVideoUrlEncode())) {
            return null;
        }
        if (this.g == null) {
            this.g = new n(h(), this);
        }
        return this.g;
    }

    public d<?> g() {
        d<?> dVar = this.f;
        if (dVar != null) {
            return dVar;
        }
        CampaignEx campaignExA = a();
        if (campaignExA == null || campaignExA.getRewardTemplateMode() == null) {
            return null;
        }
        String strE = campaignExA.getRewardTemplateMode().e();
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        if (this.f == null) {
            if (c.c(strE)) {
                this.f = new g(h(), this);
            } else {
                this.f = new k(h(), this);
            }
        }
        return this.f;
    }

    public b h() {
        return this.f1676a;
    }

    public String i() {
        return this.e;
    }

    public boolean j() {
        return this.m;
    }

    public boolean k() {
        CampaignEx campaignEx = this.b;
        if (campaignEx != null) {
            return campaignEx.isMraid();
        }
        return false;
    }

    public boolean l() {
        return this.l;
    }

    public void a(CampaignEx campaignEx) {
        this.b = campaignEx;
    }

    public CampaignEx a() {
        return this.b;
    }

    public void a(boolean z) {
        this.m = z;
    }

    public void c(String str) {
        this.e = str;
    }

    public void b(String str) {
        this.d = str;
    }

    public void b(boolean z) {
        this.l = z;
    }
}
