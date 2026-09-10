package mb;

import android.content.Context;
import android.text.TextUtils;
import ea.f2;
import eb.d0;
import java.util.Arrays;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f45948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f45949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f45950h;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        c0.j("ApplicationId must be set.", !p9.d.a(str));
        this.f45944b = str;
        this.f45943a = str2;
        this.f45945c = str3;
        this.f45946d = str4;
        this.f45947e = str5;
        this.f45948f = str6;
        this.f45949g = str7;
        this.f45950h = str8;
    }

    public static i a(Context context) {
        f2 f2Var = new f2(context, 24);
        String strP = f2Var.p("google_app_id");
        if (TextUtils.isEmpty(strP)) {
            return null;
        }
        return new i(strP, f2Var.p("google_api_key"), f2Var.p("firebase_database_url"), f2Var.p("ga_trackingId"), f2Var.p("gcm_defaultSenderId"), f2Var.p("google_storage_bucket"), f2Var.p("recaptcha_site_key"), f2Var.p("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return c0.l(this.f45944b, iVar.f45944b) && c0.l(this.f45943a, iVar.f45943a) && c0.l(this.f45945c, iVar.f45945c) && c0.l(this.f45946d, iVar.f45946d) && c0.l(this.f45947e, iVar.f45947e) && c0.l(this.f45948f, iVar.f45948f) && c0.l(this.f45949g, iVar.f45949g) && c0.l(this.f45950h, iVar.f45950h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45944b, this.f45943a, this.f45945c, this.f45946d, this.f45947e, this.f45948f, this.f45949g, this.f45950h});
    }

    public final String toString() {
        d0 d0Var = new d0(this);
        d0Var.P0(this.f45944b, "applicationId");
        d0Var.P0(this.f45943a, "apiKey");
        d0Var.P0(this.f45945c, "databaseUrl");
        d0Var.P0(this.f45947e, "gcmSenderId");
        d0Var.P0(this.f45948f, "storageBucket");
        d0Var.P0(this.f45949g, "recaptchaSiteKey");
        d0Var.P0(this.f45950h, "projectId");
        return d0Var.toString();
    }
}
