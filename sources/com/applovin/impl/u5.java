package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C0375hc;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class u5 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f9841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f9842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f9843i;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b {
        void a(b0.b bVar, String str);

        void a(String str, String str2);
    }

    public u5(com.applovin.impl.sdk.l lVar, String str, b bVar) {
        super("TaskFetchAppAdsContent", lVar);
        this.f9842h = str;
        this.f9841g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = new ArrayList(Arrays.asList(Uri.parse(this.f9842h).getAuthority().split("\\.")));
        if (arrayList.size() > 0) {
            String str = (String) arrayList.get(0);
            if ("www".equals(str) || "m".equals(str)) {
                arrayList.remove(0);
            }
        }
        String strJoin = TextUtils.join(".", arrayList);
        Uri uriBuild = new Uri.Builder().scheme("https").authority(strJoin).appendPath("app-ads.txt").build();
        com.applovin.impl.sdk.network.a aVarA = com.applovin.impl.sdk.network.a.a(this.f8297a).c(C0375hc.f28788a).b(uriBuild.toString()).a(new Uri.Builder().scheme("http").authority(strJoin).appendPath("app-ads.txt").build().toString()).a((Object) "").a(false).a();
        this.f9843i = uriBuild.toString();
        if (com.applovin.impl.sdk.p.a()) {
            defpackage.e.C(new StringBuilder("Looking up app-ads.txt at "), this.f9843i, this.f8299c, this.f8298b);
        }
        this.f8297a.s0().a(new a(aVarA, this.f8297a));
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends o6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, String str2, int i10) {
            if (TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8299c.b(this.f8298b, "No app-ads.txt found");
                }
                u5.this.f9841g.a(b0.b.APPADSTXT_NOT_FOUND, u5.this.f9843i);
            } else {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8299c.a(this.f8298b, "Found app-ads.txt");
                }
                u5.this.f9841g.a(str2, u5.this.f9843i);
            }
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, String str3) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.b(this.f8298b, "Unable to fetch app-ads.txt due to: " + str2 + ", and received error code: " + i10);
            }
            u5.this.f9841g.a(b0.b.APPADSTXT_NOT_FOUND, u5.this.f9843i);
        }
    }
}
