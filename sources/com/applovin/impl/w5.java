package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.ironsource.C0375hc;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class w5 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f9953g;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b {
        void a(b0.b bVar);

        void a(String str);
    }

    public w5(com.applovin.impl.sdk.l lVar, b bVar) {
        super("TaskFetchDeveloperUri", lVar);
        this.f9953g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strValueOf = String.valueOf(this.f8297a.B().G().get("package_name"));
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Looking up developer URI for package name: ".concat(strValueOf));
        }
        this.f8297a.s0().a(new a(com.applovin.impl.sdk.network.a.a(this.f8297a).c(C0375hc.f28788a).b("https://play.google.com/store/apps/details?id=".concat(strValueOf)).a((Object) "").a(false).a(), this.f8297a));
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
                    this.f8299c.b(this.f8298b, "No developer URI found - response from the Play Store is empty");
                }
                w5.this.f9953g.a(b0.b.APP_DETAILS_NOT_FOUND);
                return;
            }
            Matcher matcher = Pattern.compile("(?<=\"appstore:developer_url\" content=\").*?(?=\">)").matcher(str2);
            if (!matcher.find()) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8299c.b(this.f8298b, "No developer URI found - unable to find the developer_url meta tag from the Play Store listing");
                }
                w5.this.f9953g.a(b0.b.INVALID_DEVELOPER_URI);
                return;
            }
            String strGroup = matcher.group();
            if (!URLUtil.isValidUrl(strGroup)) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8299c.b(this.f8298b, "Developer URI (" + strGroup + ") is not valid");
                }
                w5.this.f9953g.a(b0.b.INVALID_DEVELOPER_URI);
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                defpackage.e.A("Found developer URI: ", strGroup, this.f8299c, this.f8298b);
            }
            w5.this.f9953g.a(strGroup);
        }

        @Override // com.applovin.impl.o6, com.applovin.impl.r0.e
        public void a(String str, int i10, String str2, String str3) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.b(this.f8298b, "Unable to fetch app details due to: " + str2 + ", and received error code: " + i10);
            }
            w5.this.f9953g.a(b0.b.APP_DETAILS_NOT_FOUND);
        }
    }
}
