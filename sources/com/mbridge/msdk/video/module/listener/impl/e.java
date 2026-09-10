package com.mbridge.msdk.video.module.listener.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class e implements com.mbridge.msdk.foundation.same.image.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ImageView f37782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f37783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37784c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37785a;

        public a(String str) {
            this.f37785a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.n nVarA = com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                if (e.this.f37783b == null) {
                    q0.a("ImageLoaderListener", "campaign is null");
                    return;
                }
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                nVar.j("2000044");
                nVar.c(m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
                nVar.b(e.this.f37783b.getId());
                nVar.i(e.this.f37783b.getImageUrl());
                nVar.n(e.this.f37783b.getRequestId());
                nVar.o(e.this.f37783b.getRequestIdNotice());
                nVar.u(e.this.f37784c);
                nVar.m(this.f37785a);
                nVarA.a(nVar);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public e(ImageView imageView) {
        this.f37782a = imageView;
    }

    @Override // com.mbridge.msdk.foundation.same.image.c
    public void onFailedLoad(String str, String str2) {
        a aVar = new a(str);
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
        } else {
            aVar.run();
        }
        f2.s("desc:", str, "ImageLoaderListener");
    }

    @Override // com.mbridge.msdk.foundation.same.image.c
    public void onSuccessLoad(Bitmap bitmap, String str) {
        try {
            if (bitmap == null) {
                q0.b("ImageLoaderListener", "bitmap=null");
            } else {
                if (this.f37782a == null || bitmap.isRecycled()) {
                    return;
                }
                this.f37782a.setImageBitmap(bitmap);
                this.f37782a.setVisibility(0);
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
    }

    public e(ImageView imageView, CampaignEx campaignEx, String str) {
        this.f37782a = imageView;
        this.f37783b = campaignEx;
        this.f37784c = str;
    }
}
