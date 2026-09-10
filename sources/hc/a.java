package hc;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.B5;
import com.ironsource.C0526q2;
import ea.a0;
import java.util.HashMap;
import org.json.JSONObject;
import x0.k;
import x0.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42296a;

    public a(String str, a0 a0Var) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f42296a = str;
    }

    public static void a(v9.e eVar, e eVar2) {
        String str = eVar2.f42305a;
        if (str != null) {
            eVar.E("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        eVar.E("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        eVar.E("X-CRASHLYTICS-API-CLIENT-VERSION", "20.1.0");
        eVar.E("Accept", B5.M);
        String str2 = eVar2.f42306b;
        if (str2 != null) {
            eVar.E("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = eVar2.f42307c;
        if (str3 != null) {
            eVar.E("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = eVar2.f42308d;
        if (str4 != null) {
            eVar.E("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = eVar2.f42309e.c().f54672a;
        if (str5 != null) {
            eVar.E("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(e eVar) {
        HashMap map = new HashMap();
        map.put("build_version", eVar.f42312h);
        map.put("display_version", eVar.f42311g);
        map.put("source", Integer.toString(eVar.f42313i));
        String str = eVar.f42310f;
        if (!TextUtils.isEmpty(str)) {
            map.put(C0526q2.f30050p, str);
        }
        return map;
    }

    public JSONObject c(ec.a aVar) {
        int i10 = aVar.f40025b;
        wb.c cVar = wb.c.f53149a;
        cVar.c("Settings response code was: " + i10);
        String str = this.f42296a;
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            String str2 = "Settings request failed; (status: " + i10 + ") from " + str;
            if (cVar.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = aVar.f40024a;
        try {
            return new JSONObject(str3);
        } catch (Exception e10) {
            cVar.d("Failed to parse settings JSON from " + str, e10);
            cVar.d("Settings response " + str3, null);
            return null;
        }
    }

    @Override // x0.k
    public boolean f(CharSequence charSequence, int i10, int i11, q qVar) {
        if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f42296a)) {
            return true;
        }
        qVar.f53545c = (qVar.f53545c & 3) | 4;
        return false;
    }

    public a(String str) {
        this.f42296a = str;
    }

    @Override // x0.k
    public Object i() {
        return this;
    }
}
