package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Y60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4006a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;
    public final Object f;

    public Y60(EnumC5130yk enumC5130yk, SC sc, EnumC3434fT enumC3434fT, EnumC3434fT enumC3434fT2) {
        this.f4006a = 3;
        this.e = enumC5130yk;
        this.f = sc;
        this.c = enumC3434fT;
        this.d = enumC3434fT2;
        this.b = false;
    }

    public static Y60 a(EnumC5130yk enumC5130yk, SC sc, EnumC3434fT enumC3434fT, EnumC3434fT enumC3434fT2) {
        if (enumC3434fT == EnumC3434fT.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        EnumC5130yk enumC5130yk2 = EnumC5130yk.DEFINED_BY_JAVASCRIPT;
        EnumC3434fT enumC3434fT3 = EnumC3434fT.NATIVE;
        if (enumC5130yk == enumC5130yk2 && enumC3434fT == enumC3434fT3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (sc == SC.DEFINED_BY_JAVASCRIPT && enumC3434fT == enumC3434fT3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new Y60(enumC5130yk, sc, enumC3434fT, enumC3434fT2);
    }

    public static Y60 b(EnumC5218zk enumC5218zk, EnumC3522gT enumC3522gT) {
        if (enumC5218zk != EnumC5218zk.DEFINED_BY_JAVASCRIPT) {
            return new Y60(enumC5218zk, enumC3522gT);
        }
        throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
    }

    public final synchronized void c() {
        try {
            if (this.b) {
                return;
            }
            Boolean boolE = e();
            this.e = boolE;
            if (boolE == null) {
                C2297Au c2297Au = new C2297Au(this);
                this.d = c2297Au;
                C2709Qr c2709Qr = (C2709Qr) ((InterfaceC4320pa0) this.c);
                c2709Qr.a(c2709Qr.c, c2297Au);
            }
            this.b = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d() {
        Object obj;
        try {
            c();
            obj = this.e;
        } catch (Throwable th) {
            throw th;
        }
        return ((Boolean) obj) != null ? ((Boolean) obj).booleanValue() : ((FirebaseMessaging) this.f).f844a.g();
    }

    public final Boolean e() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        C4266ou c4266ou = ((FirebaseMessaging) this.f).f844a;
        c4266ou.a();
        Context context = c4266ou.f4812a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final JSONObject f() {
        int i = this.f4006a;
        Object obj = this.c;
        switch (i) {
            case 2:
                JSONObject jSONObject = new JSONObject();
                En0.b(jSONObject, "impressionOwner", (EnumC3522gT) obj);
                En0.b(jSONObject, "mediaEventsOwner", (EnumC3522gT) this.d);
                En0.b(jSONObject, "creativeType", (EnumC5218zk) this.e);
                En0.b(jSONObject, "impressionType", (TC) this.f);
                En0.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.b));
                return jSONObject;
            default:
                JSONObject jSONObject2 = new JSONObject();
                In0.b(jSONObject2, "impressionOwner", (EnumC3434fT) obj);
                In0.b(jSONObject2, "mediaEventsOwner", (EnumC3434fT) this.d);
                In0.b(jSONObject2, "creativeType", (EnumC5130yk) this.e);
                In0.b(jSONObject2, "impressionType", (SC) this.f);
                In0.b(jSONObject2, "isolateVerificationScripts", Boolean.valueOf(this.b));
                return jSONObject2;
        }
    }

    public Y60(EnumC5218zk enumC5218zk, EnumC3522gT enumC3522gT) {
        TC tc = TC.BEGIN_TO_RENDER;
        EnumC3522gT enumC3522gT2 = EnumC3522gT.NATIVE;
        this.f4006a = 2;
        this.e = enumC5218zk;
        this.f = tc;
        this.c = enumC3522gT2;
        this.d = enumC3522gT;
        this.b = false;
    }

    public Y60(FirebaseMessaging firebaseMessaging, InterfaceC4320pa0 interfaceC4320pa0) {
        this.f4006a = 1;
        this.f = firebaseMessaging;
        this.c = interfaceC4320pa0;
    }
}
