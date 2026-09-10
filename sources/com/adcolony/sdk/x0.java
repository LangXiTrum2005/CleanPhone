package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.commons.core.configs.TelemetryConfig;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Date;
import java.util.Locale;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
class x0 {

    public class a implements j0 {
        public a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.f(h0Var);
        }
    }

    public class b implements j0 {
        public b() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.a(h0Var);
        }
    }

    public class c implements j0 {
        public c() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.c(h0Var);
        }
    }

    public class d implements j0 {
        public d() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.n(h0Var);
        }
    }

    public class e implements j0 {
        public e() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.j(h0Var);
        }
    }

    public class f implements j0 {
        public f() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.i(h0Var);
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9464a;

        public g(x0 x0Var, String str) {
            this.f9464a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            f1 f1VarB = c0.b();
            c0.a(f1VarB, "type", "open_hook");
            c0.a(f1VarB, PglCryptUtils.KEY_MESSAGE, this.f9464a);
            new h0("CustomMessage.controller_send", 0, f1VarB).c();
        }
    }

    public class h implements j0 {
        public h() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.h(h0Var);
        }
    }

    public class i implements j0 {
        public i() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.m(h0Var);
        }
    }

    public class j implements j0 {
        public j() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.k(h0Var);
        }
    }

    public class k implements j0 {
        public k() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.o(h0Var);
        }
    }

    public class l implements j0 {
        public l() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.g(h0Var);
        }
    }

    public class m implements j0 {
        public m() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.e(h0Var);
        }
    }

    public class n implements j0 {
        public n() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.d(h0Var);
        }
    }

    public class o implements j0 {
        public o() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.b(h0Var);
        }
    }

    public class p implements j0 {
        public p() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            x0.this.l(h0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        com.adcolony.sdk.d dVarC = com.adcolony.sdk.a.b().c();
        String strH = c0.h(f1VarA, "ad_session_id");
        AdColonyInterstitial adColonyInterstitial = dVarC.f().get(strH);
        AdColonyAdView adColonyAdView = dVarC.d().get(strH);
        if ((adColonyInterstitial == null || adColonyInterstitial.getListener() == null || adColonyInterstitial.d() == null) && (adColonyAdView == null || adColonyAdView.getListener() == null)) {
            return false;
        }
        if (adColonyAdView == null) {
            new h0("AdUnit.make_in_app_purchase", adColonyInterstitial.d().k()).c();
        }
        a(strH);
        b(strH);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        String strH = c0.h(c0.f(f1VarA, "clickOverride"), "url");
        String strH2 = c0.h(f1VarA, "ad_session_id");
        com.adcolony.sdk.d dVarC = com.adcolony.sdk.a.b().c();
        AdColonyInterstitial adColonyInterstitial = dVarC.f().get(strH2);
        AdColonyAdView adColonyAdView = dVarC.d().get(strH2);
        if (adColonyInterstitial != null) {
            adColonyInterstitial.b(strH);
            return true;
        }
        if (adColonyAdView == null) {
            return false;
        }
        adColonyAdView.setClickOverride(strH);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        String strH = c0.h(f1VarA, "ad_session_id");
        int iD = c0.d(f1VarA, "orientation");
        com.adcolony.sdk.d dVarC = com.adcolony.sdk.a.b().c();
        AdColonyAdView adColonyAdView = dVarC.d().get(strH);
        AdColonyInterstitial adColonyInterstitial = dVarC.f().get(strH);
        Context contextA = com.adcolony.sdk.a.a();
        if (adColonyAdView != null) {
            adColonyAdView.setOrientation(iD);
        } else if (adColonyInterstitial != null) {
            adColonyInterstitial.a(iD);
        }
        if (adColonyInterstitial == null && adColonyAdView == null) {
            new e0.a().a("Invalid ad session id sent with set orientation properties message: ").a(strH).a(e0.f9132i);
            return false;
        }
        if (!(contextA instanceof com.adcolony.sdk.b)) {
            return true;
        }
        ((com.adcolony.sdk.b) contextA).a(adColonyAdView == null ? adColonyInterstitial.f() : adColonyAdView.getOrientation());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n(h0 h0Var) {
        AdColonyAdView adColonyAdView = com.adcolony.sdk.a.b().c().d().get(c0.h(h0Var.a(), "ad_session_id"));
        if (adColonyAdView == null) {
            return false;
        }
        adColonyAdView.setNoCloseButton(c0.b(h0Var.a(), "use_custom_close"));
        return true;
    }

    public boolean g(h0 h0Var) {
        f1 f1VarB = c0.b();
        f1 f1VarA = h0Var.a();
        String strH = c0.h(f1VarA, "url");
        String strH2 = c0.h(f1VarA, "ad_session_id");
        AdColonyAdView adColonyAdView = com.adcolony.sdk.a.b().c().d().get(strH2);
        if (adColonyAdView != null && !adColonyAdView.getTrustedDemandSource() && !adColonyAdView.c()) {
            return false;
        }
        if (strH.startsWith("browser")) {
            strH = strH.replaceFirst("browser", "http");
        }
        if (strH.startsWith("safari")) {
            strH = strH.replaceFirst("safari", "http");
        }
        d(strH);
        if (!z0.a(new Intent("android.intent.action.VIEW", Uri.parse(strH)))) {
            z0.a("Failed to launch browser.", 0);
            c0.b(f1VarB, "success", false);
            h0Var.a(f1VarB).c();
            return false;
        }
        c0.b(f1VarB, "success", true);
        h0Var.a(f1VarB).c();
        c(strH2);
        a(strH2);
        b(strH2);
        return true;
    }

    public boolean h(h0 h0Var) {
        f1 f1VarB = c0.b();
        f1 f1VarA = h0Var.a();
        String strH = c0.h(f1VarA, "product_id");
        String strH2 = c0.h(f1VarA, "ad_session_id");
        if (strH.equals("")) {
            strH = c0.h(f1VarA, "handle");
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(strH));
        d(strH);
        if (!z0.a(intent)) {
            z0.a("Unable to open.", 0);
            c0.b(f1VarB, "success", false);
            h0Var.a(f1VarB).c();
            return false;
        }
        c0.b(f1VarB, "success", true);
        h0Var.a(f1VarB).c();
        c(strH2);
        a(strH2);
        b(strH2);
        return true;
    }

    public boolean k(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        f1 f1VarB = c0.b();
        String strH = c0.h(f1VarA, "ad_session_id");
        e1 e1VarA = c0.a(f1VarA, "recipients");
        String string = "";
        for (int i2 = 0; i2 < e1VarA.b(); i2++) {
            if (i2 != 0) {
                string = android.support.v4.media.a.m(string, ";");
            }
            StringBuilder sbW = android.support.v4.media.a.w(string);
            sbW.append(c0.b(e1VarA, i2));
            string = sbW.toString();
        }
        if (!z0.a(new Intent("android.intent.action.VIEW", Uri.parse("smsto:" + string)).putExtra("sms_body", c0.h(f1VarA, "body")))) {
            z0.a("Failed to create sms.", 0);
            c0.b(f1VarB, "success", false);
            h0Var.a(f1VarB).c();
            return false;
        }
        c0.b(f1VarB, "success", true);
        h0Var.a(f1VarB).c();
        c(strH);
        a(strH);
        b(strH);
        return true;
    }

    public boolean l(h0 h0Var) {
        f1 f1VarB = c0.b();
        f1 f1VarA = h0Var.a();
        Intent intentPutExtra = new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", c0.h(f1VarA, "text") + " " + c0.h(f1VarA, "url"));
        String strH = c0.h(f1VarA, "ad_session_id");
        if (!z0.a(intentPutExtra, true)) {
            z0.a("Unable to create social post.", 0);
            c0.b(f1VarB, "success", false);
            h0Var.a(f1VarB).c();
            return false;
        }
        c0.b(f1VarB, "success", true);
        h0Var.a(f1VarB).c();
        c(strH);
        a(strH);
        b(strH);
        return true;
    }

    public boolean m(h0 h0Var) {
        f1 f1VarB = c0.b();
        f1 f1VarA = h0Var.a();
        Intent data = new Intent("android.intent.action.DIAL").setData(Uri.parse("tel:" + c0.h(f1VarA, "phone_number")));
        String strH = c0.h(f1VarA, "ad_session_id");
        if (!z0.a(data)) {
            z0.a("Failed to dial number.", 0);
            c0.b(f1VarB, "success", false);
            h0Var.a(f1VarB).c();
            return false;
        }
        c0.b(f1VarB, "success", true);
        h0Var.a(f1VarB).c();
        c(strH);
        a(strH);
        b(strH);
        return true;
    }

    public boolean o(h0 h0Var) {
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null) {
            return false;
        }
        int iA = c0.a(h0Var.a(), "length_ms", 500);
        f1 f1VarB = c0.b();
        e1 e1VarE = z0.e(contextA);
        boolean z2 = false;
        for (int i2 = 0; i2 < e1VarE.b(); i2++) {
            if (c0.b(e1VarE, i2).equals("android.permission.VIBRATE")) {
                z2 = true;
            }
        }
        if (!z2) {
            new e0.a().a("No vibrate permission detected.").a(e0.f);
            c0.b(f1VarB, "success", false);
            h0Var.a(f1VarB).c();
            return false;
        }
        if (z0.a(contextA, iA)) {
            c0.b(f1VarB, "success", true);
            h0Var.a(f1VarB).c();
            return true;
        }
        c0.b(f1VarB, "success", false);
        h0Var.a(f1VarB).c();
        return false;
    }

    public void a() {
        com.adcolony.sdk.a.a("System.open_store", new h());
        com.adcolony.sdk.a.a("System.telephone", new i());
        com.adcolony.sdk.a.a("System.sms", new j());
        com.adcolony.sdk.a.a("System.vibrate", new k());
        com.adcolony.sdk.a.a("System.open_browser", new l());
        com.adcolony.sdk.a.a("System.mail", new m());
        com.adcolony.sdk.a.a("System.launch_app", new n());
        com.adcolony.sdk.a.a("System.create_calendar_event", new o());
        com.adcolony.sdk.a.a("System.social_post", new p());
        com.adcolony.sdk.a.a("System.make_in_app_purchase", new a());
        com.adcolony.sdk.a.a("System.close", new b());
        com.adcolony.sdk.a.a("System.expand", new c());
        com.adcolony.sdk.a.a("System.use_custom_close", new d());
        com.adcolony.sdk.a.a("System.set_orientation_properties", new e());
        com.adcolony.sdk.a.a("System.click_override", new f());
    }

    /* JADX WARN: Code duplicated, block: B:49:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:52:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:54:0x01f1  */
    public boolean b(h0 h0Var) {
        e1 e1VarA;
        e1 e1VarA2;
        String upperCase;
        e1 e1VarA3;
        String strH;
        long j2;
        Intent intentPutExtra;
        f1 f1VarB = c0.b();
        f1 f1VarA = h0Var.a();
        String strH2 = c0.h(f1VarA, "ad_session_id");
        f1 f1VarF = c0.f(f1VarA, "params");
        f1 f1VarF2 = c0.f(f1VarF, "recurrence");
        e1 e1VarA4 = c0.a();
        e1 e1VarA5 = c0.a();
        e1 e1VarA6 = c0.a();
        String strH3 = c0.h(f1VarF, "description");
        c0.h(f1VarF, "location");
        String strH4 = c0.h(f1VarF, "start");
        String strH5 = c0.h(f1VarF, TtmlNode.END);
        String strH6 = c0.h(f1VarF, "summary");
        if (f1VarF2 == null || f1VarF2.b()) {
            e1VarA = e1VarA5;
            e1VarA2 = e1VarA6;
            upperCase = "";
            e1VarA3 = e1VarA4;
            strH = upperCase;
        } else {
            strH = c0.h(f1VarF2, "expires");
            upperCase = c0.h(f1VarF2, "frequency").toUpperCase(Locale.getDefault());
            e1VarA3 = c0.a(f1VarF2, "daysInWeek");
            e1VarA = c0.a(f1VarF2, "daysInMonth");
            e1VarA2 = c0.a(f1VarF2, "daysInYear");
        }
        if (strH6.equals("")) {
            strH6 = strH3;
        }
        Date dateG = z0.g(strH4);
        Date dateG2 = z0.g(strH5);
        Date dateG3 = z0.g(strH);
        if (dateG == null || dateG2 == null) {
            z0.a("Unable to create Calendar Event", 0);
            c0.b(f1VarB, "success", false);
            h0Var.a(f1VarB).c();
            return false;
        }
        long time = dateG.getTime();
        long time2 = dateG2.getTime();
        long j3 = 0;
        long time3 = dateG3 != null ? (dateG3.getTime() - dateG.getTime()) / 1000 : 0L;
        e1 e1Var = e1VarA3;
        if (upperCase.equals("DAILY")) {
            j2 = time3 / 86400;
        } else if (upperCase.equals("WEEKLY")) {
            j2 = time3 / TelemetryConfig.DEFAULT_EVENT_TTL_SEC;
        } else {
            if (!upperCase.equals("MONTHLY")) {
                if (upperCase.equals("YEARLY")) {
                    j2 = time3 / 31557600;
                }
                e1 e1Var2 = e1VarA2;
                long j4 = j3;
                e1 e1Var3 = e1VarA;
                if (f1VarF2 != null || f1VarF2.b()) {
                    intentPutExtra = new Intent("android.intent.action.EDIT").setType("vnd.android.cursor.item/event").putExtra("title", strH6).putExtra("description", strH3).putExtra("beginTime", time).putExtra("endTime", time2);
                } else {
                    String str = "FREQ=" + upperCase + ";COUNT=" + j4;
                    try {
                        if (e1Var.b() != 0) {
                            str = str + ";BYDAY=" + z0.a(e1Var);
                        }
                        if (e1Var3.b() != 0) {
                            str = str + ";BYMONTHDAY=" + z0.b(e1Var3);
                        }
                        if (e1Var2.b() != 0) {
                            str = str + ";BYYEARDAY=" + z0.b(e1Var2);
                        }
                    } catch (JSONException unused) {
                    }
                    intentPutExtra = new Intent("android.intent.action.EDIT").setType("vnd.android.cursor.item/event").putExtra("title", strH6).putExtra("description", strH3).putExtra("beginTime", time).putExtra("endTime", time2).putExtra("rrule", str);
                }
                if (z0.a(intentPutExtra)) {
                    z0.a("Unable to create Calendar Event.", 0);
                    c0.b(f1VarB, "success", false);
                    h0Var.a(f1VarB).c();
                    return false;
                }
                c0.b(f1VarB, "success", true);
                h0Var.a(f1VarB).c();
                c(strH2);
                a(strH2);
                b(strH2);
                return true;
            }
            j2 = time3 / 2629800;
        }
        j3 = j2 + 1;
        e1 e1Var4 = e1VarA2;
        long j5 = j3;
        e1 e1Var5 = e1VarA;
        if (f1VarF2 != null) {
            intentPutExtra = new Intent("android.intent.action.EDIT").setType("vnd.android.cursor.item/event").putExtra("title", strH6).putExtra("description", strH3).putExtra("beginTime", time).putExtra("endTime", time2);
        } else {
            intentPutExtra = new Intent("android.intent.action.EDIT").setType("vnd.android.cursor.item/event").putExtra("title", strH6).putExtra("description", strH3).putExtra("beginTime", time).putExtra("endTime", time2);
        }
        if (z0.a(intentPutExtra)) {
            z0.a("Unable to create Calendar Event.", 0);
            c0.b(f1VarB, "success", false);
            h0Var.a(f1VarB).c();
            return false;
        }
        c0.b(f1VarB, "success", true);
        h0Var.a(f1VarB).c();
        c(strH2);
        a(strH2);
        b(strH2);
        return true;
    }

    public boolean c(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA != null && com.adcolony.sdk.a.d()) {
            String strH = c0.h(f1VarA, "ad_session_id");
            com.adcolony.sdk.k kVarB = com.adcolony.sdk.a.b();
            AdColonyAdView adColonyAdView = kVarB.c().d().get(strH);
            if (adColonyAdView != null && ((adColonyAdView.getTrustedDemandSource() || adColonyAdView.c()) && kVarB.k() != adColonyAdView)) {
                adColonyAdView.setExpandMessage(h0Var);
                adColonyAdView.setExpandedWidth(c0.d(f1VarA, "width"));
                adColonyAdView.setExpandedHeight(c0.d(f1VarA, "height"));
                adColonyAdView.setOrientation(c0.a(f1VarA, "orientation", -1));
                adColonyAdView.setNoCloseButton(c0.b(f1VarA, "use_custom_close"));
                kVarB.a(adColonyAdView);
                kVarB.a(adColonyAdView.getContainer());
                Intent intent = new Intent(contextA, (Class<?>) AdColonyAdViewActivity.class);
                b(strH);
                a(strH);
                z0.a(intent);
                return true;
            }
        }
        return false;
    }

    public boolean d(h0 h0Var) {
        f1 f1VarB = c0.b();
        f1 f1VarA = h0Var.a();
        String strH = c0.h(f1VarA, "ad_session_id");
        if (c0.b(f1VarA, "deep_link")) {
            return h(h0Var);
        }
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null) {
            return false;
        }
        if (!z0.a(contextA.getPackageManager().getLaunchIntentForPackage(c0.h(f1VarA, "handle")))) {
            z0.a("Failed to launch external application.", 0);
            c0.b(f1VarB, "success", false);
            h0Var.a(f1VarB).c();
            return false;
        }
        c0.b(f1VarB, "success", true);
        h0Var.a(f1VarB).c();
        c(strH);
        a(strH);
        b(strH);
        return true;
    }

    public boolean e(h0 h0Var) {
        f1 f1VarB = c0.b();
        f1 f1VarA = h0Var.a();
        e1 e1VarA = c0.a(f1VarA, "recipients");
        boolean zB = c0.b(f1VarA, "html");
        String strH = c0.h(f1VarA, "subject");
        String strH2 = c0.h(f1VarA, "body");
        String strH3 = c0.h(f1VarA, "ad_session_id");
        String[] strArr = new String[e1VarA.b()];
        for (int i2 = 0; i2 < e1VarA.b(); i2++) {
            strArr[i2] = c0.b(e1VarA, i2);
        }
        Intent intent = new Intent("android.intent.action.SEND");
        if (!zB) {
            intent.setType("plain/text");
        }
        intent.putExtra("android.intent.extra.SUBJECT", strH).putExtra("android.intent.extra.TEXT", strH2).putExtra("android.intent.extra.EMAIL", strArr);
        if (!z0.a(intent)) {
            z0.a("Failed to send email.", 0);
            c0.b(f1VarB, "success", false);
            h0Var.a(f1VarB).c();
            return false;
        }
        c0.b(f1VarB, "success", true);
        h0Var.a(f1VarB).c();
        c(strH3);
        a(strH3);
        b(strH3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(h0 h0Var) {
        String strH = c0.h(h0Var.a(), "ad_session_id");
        Activity activity = com.adcolony.sdk.a.a() instanceof Activity ? (Activity) com.adcolony.sdk.a.a() : null;
        boolean z2 = activity instanceof AdColonyAdViewActivity;
        if (!(activity instanceof com.adcolony.sdk.b)) {
            return false;
        }
        if (z2) {
            ((AdColonyAdViewActivity) activity).b();
            return true;
        }
        f1 f1VarB = c0.b();
        c0.a(f1VarB, "id", strH);
        new h0("AdSession.on_request_close", ((com.adcolony.sdk.b) activity).f8999c, f1VarB).c();
        return true;
    }

    private void d(String str) {
        if (z0.a(new g(this, str))) {
            return;
        }
        new e0.a().a("Executing ADCSystem.sendOpenCustomMessage failed").a(e0.f9132i);
    }

    public void c(String str) {
        com.adcolony.sdk.d dVarC = com.adcolony.sdk.a.b().c();
        AdColonyInterstitial adColonyInterstitial = dVarC.f().get(str);
        if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null) {
            adColonyInterstitial.getListener().onLeftApplication(adColonyInterstitial);
            return;
        }
        AdColonyAdView adColonyAdView = dVarC.d().get(str);
        AdColonyAdViewListener listener = adColonyAdView != null ? adColonyAdView.getListener() : null;
        if (adColonyAdView == null || listener == null) {
            return;
        }
        listener.onLeftApplication(adColonyAdView);
    }

    public void a(String str) {
        com.adcolony.sdk.d dVarC = com.adcolony.sdk.a.b().c();
        AdColonyInterstitial adColonyInterstitial = dVarC.f().get(str);
        if (adColonyInterstitial != null && adColonyInterstitial.getListener() != null && adColonyInterstitial.h()) {
            adColonyInterstitial.getListener().onClicked(adColonyInterstitial);
            return;
        }
        AdColonyAdView adColonyAdView = dVarC.d().get(str);
        AdColonyAdViewListener listener = adColonyAdView != null ? adColonyAdView.getListener() : null;
        if (adColonyAdView == null || listener == null || !adColonyAdView.c()) {
            return;
        }
        listener.onClicked(adColonyAdView);
    }

    private boolean b(String str) {
        if (com.adcolony.sdk.a.b().c().d().get(str) == null) {
            return false;
        }
        f1 f1VarB = c0.b();
        c0.a(f1VarB, "ad_session_id", str);
        new h0("MRAID.on_event", 1, f1VarB).c();
        return true;
    }
}
