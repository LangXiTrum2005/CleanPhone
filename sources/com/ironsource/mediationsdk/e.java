package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import com.ironsource.C0239a2;
import com.ironsource.C0257b2;
import com.ironsource.C0265ba;
import com.ironsource.C0375hc;
import com.ironsource.C0421k5;
import com.ironsource.C0474n4;
import com.ironsource.C0526q2;
import com.ironsource.C0561s2;
import com.ironsource.J9;
import com.ironsource.U1;
import com.ironsource.Ve;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29506a = "1";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29507b = "102";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29508c = "102";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f29509d = "GenericNotifications";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f29510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IronSource.a f29511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C0561s2 f29512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private U1 f29513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ISBannerSize f29514i;

    public e(f fVar) {
        this.f29510e = fVar;
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, C0257b2 c0257b2, int i10, C0265ba c0265ba, ISBannerSize iSBannerSize) {
        this.f29514i = iSBannerSize;
        a(context, map, list, c0257b2, i10, c0265ba);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected U1 f29515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected d.a f29516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected int f29517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected String f29518d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected long f29519e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected int f29520f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f29522h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final URL f29525k;
        private final JSONObject l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f29526m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f29527n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final long f29528o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final boolean f29529p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final boolean f29530q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final boolean f29531r;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        protected String f29523i = "";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        protected int f29524j = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected String f29521g = a((Integer) null);

        public a(U1 u6, URL url, JSONObject jSONObject, boolean z10, C0561s2 c0561s2) {
            this.f29515a = u6;
            this.f29525k = url;
            this.l = jSONObject;
            this.f29526m = z10;
            this.f29527n = c0561s2.g();
            this.f29528o = c0561s2.m();
            this.f29529p = c0561s2.o();
            this.f29530q = c0561s2.p();
            this.f29522h = c0561s2.d();
            this.f29531r = c0561s2.n();
        }

        private void a(long j10, long j11) {
            long time = j10 - (new Date().getTime() - j11);
            if (time > 0) {
                SystemClock.sleep(time);
            }
        }

        public boolean b() {
            this.f29519e = new Date().getTime();
            try {
                this.f29522h = this.f29524j == 1015 ? 1 : this.f29522h;
                this.f29520f = 0;
                HttpURLConnection httpURLConnectionA = null;
                while (true) {
                    int i10 = this.f29520f;
                    int i11 = this.f29527n;
                    if (i10 >= i11) {
                        this.f29520f = i11 - 1;
                        this.f29521g = a(Integer.valueOf(this.f29517c));
                        return false;
                    }
                    try {
                        long time = new Date().getTime();
                        String str = "Auction Handler: auction trial " + (this.f29520f + 1) + " out of " + this.f29527n + " max trials";
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, str, 0);
                        IronSourceUtils.i(str);
                        httpURLConnectionA = a(this.f29525k, this.f29528o);
                        IronLog ironLog = IronLog.INTERNAL;
                        ironLog.verbose("parameters for auction url: " + this.f29525k.getQuery());
                        ironLog.verbose("parameters for auction POST data: " + this.l);
                        a(httpURLConnectionA, this.l, this.f29529p);
                        int responseCode = httpURLConnectionA.getResponseCode();
                        if (responseCode == 200 || responseCode == 204) {
                            try {
                                a(a(httpURLConnectionA), this.f29526m, this.f29530q);
                                httpURLConnectionA.disconnect();
                                return true;
                            } catch (JSONException e10) {
                                C0474n4.d().a(e10);
                                if (e10.getMessage() != null && e10.getMessage().equalsIgnoreCase("decryption error")) {
                                    this.f29517c = 1003;
                                    this.f29518d = "Auction decryption error";
                                } else if (e10.getMessage() == null || !e10.getMessage().equalsIgnoreCase("decompression error")) {
                                    this.f29517c = 1002;
                                    this.f29518d = "Auction parsing error";
                                } else {
                                    this.f29517c = 1008;
                                    this.f29518d = "Auction decompression error";
                                }
                                this.f29521g = a(Integer.valueOf(this.f29517c));
                                IronLog.INTERNAL.error("Auction handle response exception " + e10.getMessage());
                                httpURLConnectionA.disconnect();
                                return false;
                            }
                        }
                        this.f29517c = 1001;
                        String str2 = "Auction response code not valid, error code response from server - " + responseCode;
                        this.f29518d = str2;
                        ironLog.error(str2);
                        httpURLConnectionA.disconnect();
                        if (this.f29520f < this.f29527n - 1) {
                            a(this.f29528o, time);
                        }
                        this.f29520f++;
                    } catch (SocketTimeoutException e11) {
                        C0474n4.d().a(e11);
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        this.f29517c = 1006;
                        this.f29518d = "Connection timed out";
                        IronLog.INTERNAL.error("Auction socket timeout exception " + e11.getMessage());
                    } catch (Throwable th2) {
                        C0474n4.d().a(th2);
                        IronLog.INTERNAL.error("getting exception " + th2);
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        this.f29517c = 1000;
                        this.f29518d = th2.getMessage();
                        this.f29521g = a(Integer.valueOf(this.f29517c));
                        return false;
                    }
                }
            } catch (Exception e12) {
                C0474n4.d().a(e12);
                this.f29517c = 1007;
                this.f29518d = e12.getMessage();
                this.f29520f = 0;
                this.f29521g = a(Integer.valueOf(this.f29517c));
                IronLog.INTERNAL.error("Auction request exception " + e12.getMessage());
                return false;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zB = b();
            U1 u6 = this.f29515a;
            if (u6 == null) {
                return;
            }
            a(zB, u6, new Date().getTime() - this.f29519e);
        }

        private String a() {
            if (this.f29522h == 2) {
                return C0421k5.b().d();
            }
            return C0421k5.b().c();
        }

        private void a(HttpURLConnection httpURLConnection, JSONObject jSONObject, boolean z10) throws Exception {
            String strA;
            String strE;
            String str;
            OutputStream outputStream = httpURLConnection.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            if (this.f29522h == 2) {
                try {
                    strA = C0421k5.b().a();
                } catch (JSONException e10) {
                    C0474n4.d().a(e10);
                    this.f29523i = e10.getLocalizedMessage();
                    this.f29524j = 1015;
                    this.f29522h = 1;
                    IronLog.INTERNAL.error("get encrypted session key exception " + e10.getMessage());
                    strA = "";
                }
            } else {
                strA = "";
            }
            String string = jSONObject.toString();
            String strA2 = a();
            if (z10) {
                IronLog.INTERNAL.verbose("compressing and encrypting auction request");
                strE = J9.a(strA2, string);
            } else {
                strE = J9.e(strA2, string);
            }
            if (this.f29522h == 2) {
                str = String.format("{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}", strA, strE);
            } else {
                str = String.format("{\"request\" : \"%1$s\"}", strE);
            }
            bufferedWriter.write(str);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
            outputStream.close();
        }

        private HttpURLConnection a(URL url, long j10) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod(C0375hc.f28789b);
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setReadTimeout((int) j10);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            return httpURLConnection;
        }

        public JSONObject a(JSONObject jSONObject, boolean z10) throws JSONException {
            String str;
            String strA = a();
            if (this.f29522h == 2) {
                str = UserDataStore.CITY;
            } else {
                str = Ve.f27442n;
            }
            String string = jSONObject.getString(str);
            if (z10) {
                return b(strA, string);
            }
            return a(strA, string);
        }

        public void a(String str, boolean z10, boolean z11) throws JSONException {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (z10) {
                    jSONObject = a(jSONObject, z11);
                }
                d.a aVarA = d.b().a(jSONObject);
                this.f29516b = aVarA;
                this.f29517c = aVarA.c();
                this.f29518d = this.f29516b.d();
                return;
            }
            throw new JSONException("empty response");
        }

        private JSONObject a(String str, String str2) throws JSONException {
            String strB = J9.b(str, str2);
            if (!TextUtils.isEmpty(strB)) {
                return new JSONObject(strB);
            }
            throw new JSONException("decryption error");
        }

        private String a(HttpURLConnection httpURLConnection) throws IOException {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb2.toString();
                }
            }
        }

        private JSONObject b(String str, String str2) throws JSONException {
            IronLog.INTERNAL.verbose("decrypting and decompressing auction response");
            String strD = J9.d(str, str2);
            if (strD != null) {
                return new JSONObject(strD);
            }
            throw new JSONException("decompression error");
        }

        public void a(boolean z10, U1 u6, long j10) {
            if (z10) {
                u6.a(this.f29516b.h(), this.f29516b.a(), this.f29516b.e(), this.f29516b.f(), this.f29516b.b(), this.f29520f + 1, j10, this.f29524j, this.f29523i);
            } else {
                u6.a(this.f29517c, this.f29518d, this.f29520f + 1, this.f29521g, j10);
            }
        }

        private String a(Integer num) {
            return C0239a2.f28151a.a(this.f29531r, num);
        }
    }

    public void a(Context context, h hVar, U1 u6) {
        try {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f29510e.a(context, hVar, u6));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error("execute auction exception " + e10.getMessage());
            if (u6 != null) {
                u6.a(1000, e10.getMessage(), 0, C0239a2.f28151a.a(this.f29510e.a(), 1000), 0L);
            }
        }
    }

    @Deprecated
    public e(IronSource.a aVar, C0561s2 c0561s2, U1 u6) {
        this.f29511f = aVar;
        this.f29512g = c0561s2;
        this.f29513h = u6;
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, C0257b2 c0257b2, int i10, C0265ba c0265ba) {
        e eVar;
        try {
            boolean zG = IronSourceUtils.g();
            JSONObject jSONObjectA = a(map, list, c0257b2, i10, zG, c0265ba);
            eVar = this;
            try {
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(eVar.f29513h, new URL(eVar.f29512g.a(false)), jSONObjectA, zG, eVar.f29512g));
            } catch (Exception e10) {
                e = e10;
                Exception exc = e;
                C0474n4.d().a(exc);
                IronLog.INTERNAL.error("execute auction exception " + exc.getMessage());
                eVar.f29513h.a(1000, exc.getMessage(), 0, C0239a2.f28151a.a(eVar.f29512g.n(), 1000), 0L);
            }
        } catch (Exception e11) {
            e = e11;
            eVar = this;
        }
    }

    public void a(C0526q2 c0526q2, int i10, C0526q2 c0526q3, String str) {
        Iterator<String> it = c0526q2.b().iterator();
        while (it.hasNext()) {
            C0526q2 c0526q4 = c0526q2;
            int i11 = i10;
            String str2 = str;
            d.b().a("reportImpression", c0526q4.c(), d.b().a(it.next(), i11, c0526q4, "", "", str2));
            i10 = i11;
            c0526q2 = c0526q4;
            str = str2;
        }
        C0526q2 c0526q5 = c0526q2;
        int i12 = i10;
        String str3 = str;
        if (c0526q3 != null) {
            Iterator<String> it2 = c0526q3.b().iterator();
            while (it2.hasNext()) {
                d.b().a("reportImpression", "GenericNotifications", d.b().a(it2.next(), i12, c0526q5, "", "102", str3));
            }
        }
    }

    public void a(C0526q2 c0526q2, int i10, C0526q2 c0526q3) {
        Iterator<String> it = c0526q2.h().iterator();
        while (it.hasNext()) {
            C0526q2 c0526q4 = c0526q2;
            int i11 = i10;
            d.b().a("reportLoadSuccess", c0526q4.c(), d.b().a(it.next(), i11, c0526q4, "", "", ""));
            i10 = i11;
            c0526q2 = c0526q4;
        }
        C0526q2 c0526q5 = c0526q2;
        int i12 = i10;
        if (c0526q3 != null) {
            Iterator<String> it2 = c0526q3.h().iterator();
            while (it2.hasNext()) {
                d.b().a("reportLoadSuccess", "GenericNotifications", d.b().a(it2.next(), i12, c0526q5, "", "102", ""));
            }
        }
    }

    public void a(CopyOnWriteArrayList<u> copyOnWriteArrayList, ConcurrentHashMap<String, C0526q2> concurrentHashMap, int i10, C0526q2 c0526q2, C0526q2 c0526q3) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<u> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        a(arrayList, concurrentHashMap, i10, c0526q2, c0526q3);
    }

    public void a(ArrayList<String> arrayList, ConcurrentHashMap<String, C0526q2> concurrentHashMap, int i10, C0526q2 c0526q2, C0526q2 c0526q3) {
        int iJ = c0526q3.j();
        for (String str : arrayList) {
            if (!str.equals(c0526q3.c())) {
                C0526q2 c0526q4 = concurrentHashMap.get(str);
                int iJ2 = c0526q4.j();
                String strI = c0526q4.i();
                String str2 = iJ2 < iJ ? "1" : "102";
                IronLog.INTERNAL.verbose("instance=" + c0526q4.c() + ", instancePriceOrder= " + iJ2 + ", loseReasonCode=" + str2 + ", winnerInstance=" + c0526q3.c() + ", winnerInstancePriceOrder=" + iJ);
                Iterator<String> it = c0526q4.g().iterator();
                while (it.hasNext()) {
                    d.b().a("reportAuctionLose", c0526q4.c(), d.b().a(it.next(), i10, c0526q3, strI, str2, ""));
                }
            }
        }
        if (c0526q2 != null) {
            Iterator<String> it2 = c0526q2.g().iterator();
            while (it2.hasNext()) {
                d.b().a("reportAuctionLose", "GenericNotifications", d.b().a(it2.next(), i10, c0526q3, "", "102", ""));
            }
        }
    }

    private JSONObject a(Map<String, Object> map, List<String> list, C0257b2 c0257b2, int i10, boolean z10, C0265ba c0265ba) throws JSONException {
        h hVar = new h(this.f29511f);
        hVar.a(map);
        hVar.a(list);
        hVar.a(c0257b2);
        hVar.a(i10);
        hVar.a(this.f29514i);
        hVar.a(c0265ba);
        hVar.b(z10);
        return d.b().a(hVar);
    }

    public boolean a() {
        return this.f29510e.b();
    }
}
