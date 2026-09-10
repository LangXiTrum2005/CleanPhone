package ambitiousness;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.arytenoidectomy;
import okhttp3.cord;
import okhttp3.dovishness;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.marial;
import okhttp3.preprohormone;
import okhttp3.rotuma;

/* JADX INFO: compiled from: HttpClient.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final dovishness f3963saneness = dovishness.competently("application/json; charset=utf-8");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public rotuma f3964attabal;

    public attabal(saneness sanenessVar) {
        HttpLoggingInterceptor httpLoggingInterceptor;
        rotuma.attabal attabalVar = new rotuma.attabal();
        if (sanenessVar != null) {
            if (revolt.attabal.f36720attabal.impromptu()) {
                httpLoggingInterceptor = new HttpLoggingInterceptor(new C0004attabal());
                httpLoggingInterceptor.wireman(HttpLoggingInterceptor.Level.BODY);
            } else {
                httpLoggingInterceptor = null;
            }
            if (httpLoggingInterceptor != null) {
                attabalVar.attabal(httpLoggingInterceptor);
            }
            long j = sanenessVar.f3966attabal;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            attabalVar.beachfront(j, timeUnit).hydrovane(sanenessVar.f3968saneness, timeUnit).lerp(sanenessVar.f3967dern, timeUnit);
            arytenoidectomy arytenoidectomyVar = sanenessVar.f3969wireman;
            if (arytenoidectomyVar != null) {
                attabalVar.taiyuan(arytenoidectomyVar);
            }
        }
        this.f3964attabal = attabalVar.dern();
    }

    public marial attabal(String str, Map<String, String> map, String str2) {
        preprohormone.attabal attabalVarGraveside = new preprohormone.attabal().graveside(str);
        dovishness dovishnessVar = f3963saneness;
        if (str2 == null) {
            str2 = "";
        }
        preprohormone.attabal attabalVarApical = attabalVarGraveside.apical(cord.create(dovishnessVar, str2));
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                attabalVarApical.attabal(entry.getKey(), entry.getValue());
            }
        }
        return this.f3964attabal.attabal(attabalVarApical.saneness());
    }

    /* JADX INFO: renamed from: ambitiousness.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HttpClient.java */
    public class C0004attabal implements HttpLoggingInterceptor.attabal {
        public C0004attabal() {
        }

        @Override // okhttp3.logging.HttpLoggingInterceptor.attabal
        public void attabal(String str) {
        }
    }
}
