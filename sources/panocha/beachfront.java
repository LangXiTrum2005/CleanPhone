package panocha;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.yolo.networklibrary.common.util.impromptu;
import com.yolo.networklibrary.common.util.triweekly;
import okhttp3.cuirassed;
import okhttp3.stratoscope;

/* JADX INFO: compiled from: ServerCallbackHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class beachfront {

    /* JADX INFO: compiled from: ServerCallbackHelper.java */
    public class attabal implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ Context f35047arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ marial f35048kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ pancuronium.attabal f35049monoploid;

        public attabal(marial marialVar, Context context, pancuronium.attabal attabalVar) {
            this.f35048kowloon = marialVar;
            this.f35047arytenoidectomy = context;
            this.f35049monoploid = attabalVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            int iAttabal = this.f35048kowloon.attabal();
            if (iAttabal == -17) {
                impromptu.competently(this.f35047arytenoidectomy);
            } else if (iAttabal == 1 || iAttabal == 9 || iAttabal == 72 || iAttabal == 5 || iAttabal == 6) {
                beachfront.attabal();
            }
            if (!bunt.attabal.attabal(this.f35048kowloon.attabal())) {
                TextUtils.isEmpty(this.f35048kowloon.saneness());
            }
            pancuronium.attabal attabalVar = this.f35049monoploid;
            if (attabalVar != null) {
                attabalVar.attabal(this.f35048kowloon);
            }
        }
    }

    /* JADX INFO: compiled from: ServerCallbackHelper.java */
    public interface saneness {
    }

    public static /* synthetic */ saneness attabal() {
        return null;
    }

    public static <TResult> void beachfront(Context context, String str, cuirassed cuirassedVar, Class cls, pancuronium.attabal<TResult> attabalVar) {
        marial marialVar;
        if (attabalVar == null) {
            return;
        }
        marial marialVar2 = new marial();
        if (cuirassedVar == null || cuirassedVar.getBody() == null) {
            marialVar2.marial(-13);
            wireman(context, str, marialVar2, attabalVar);
            return;
        }
        if (!cuirassedVar.isSuccessful()) {
            marialVar2.marial(cuirassedVar.getCode());
            marialVar2.beachfront(cuirassedVar.getMessage());
            wireman(context, str, marialVar2, attabalVar);
            return;
        }
        String strDern = dern(context, cuirassedVar, "http_business");
        if (TextUtils.isEmpty(strDern)) {
            marialVar2.marial(-14);
            wireman(context, str, marialVar2, attabalVar);
            return;
        }
        try {
            marialVar = (marial) new Gson().fromJson(strDern, TypeToken.getParameterized(marial.class, cls).getType());
        } catch (Exception e) {
            e.printStackTrace();
            marialVar = null;
        }
        if (marialVar != null) {
            wireman(context, str, marialVar, attabalVar);
        } else {
            marialVar2.marial(-15);
            wireman(context, str, marialVar2, attabalVar);
        }
    }

    public static String dern(Context context, cuirassed cuirassedVar, String str) {
        if (cuirassedVar == null) {
            return null;
        }
        try {
            String strMonoploid = cuirassedVar.monoploid(hued.attabal.f28025saneness);
            if (TextUtils.isEmpty(strMonoploid)) {
                return cuirassedVar.getBody().string();
            }
            stratoscope body = cuirassedVar.getBody();
            if (body != null) {
                return str.equals("http_common") ? petrol.attabal.f35179attabal.taiyuan(context, strMonoploid, Base64.decode(body.bytes(), 0)) : petrol.attabal.f35179attabal.impromptu(context, strMonoploid, Base64.decode(body.bytes(), 0));
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <TResult> void marial(Context context, marial<TResult> marialVar, pancuronium.attabal<TResult> attabalVar) {
        triweekly.saneness(new attabal(marialVar, context, attabalVar));
    }

    public static <TResult> void saneness(Context context, String str, cuirassed cuirassedVar, Class cls, pancuronium.attabal<TResult> attabalVar) {
        marial marialVar;
        if (attabalVar == null) {
            return;
        }
        marial marialVar2 = new marial();
        if (cuirassedVar == null || cuirassedVar.getBody() == null) {
            marialVar2.marial(-13);
            wireman(context, str, marialVar2, attabalVar);
            return;
        }
        if (!cuirassedVar.isSuccessful()) {
            marialVar2.marial(cuirassedVar.getCode());
            marialVar2.beachfront(dern(context, cuirassedVar, "http_common"));
            wireman(context, str, marialVar2, attabalVar);
            return;
        }
        String strDern = dern(context, cuirassedVar, "http_common");
        if (TextUtils.isEmpty(strDern)) {
            marialVar2.marial(-14);
            wireman(context, str, marialVar2, attabalVar);
            return;
        }
        try {
            marialVar = (marial) new Gson().fromJson(strDern, TypeToken.getParameterized(marial.class, cls).getType());
        } catch (Exception e) {
            e.printStackTrace();
            marialVar = null;
        }
        if (marialVar != null) {
            wireman(context, str, marialVar, attabalVar);
        } else {
            marialVar2.marial(-15);
            wireman(context, str, marialVar2, attabalVar);
        }
    }

    public static <TResult> void wireman(Context context, String str, marial<TResult> marialVar, pancuronium.attabal<TResult> attabalVar) {
        marial(context, marialVar, attabalVar);
    }
}
