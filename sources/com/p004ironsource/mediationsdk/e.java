package com.p004ironsource.mediationsdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.Z;
import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.ko;
import com.p004ironsource.m5;
import com.p004ironsource.mb;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p004ironsource.mediationsdk.utils.IronSourceAES;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.o5;
import com.p004ironsource.q9;
import com.p004ironsource.qt;
import com.p004ironsource.r4;
import com.p004ironsource.x4;
import com.smartdigimkt.o1.b;
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

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25875a = "1";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25876b = "102";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f25877c = "102";
    private final String d = "GenericNotifications";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f25878e;
    private IronSource.AD_UNIT f;
    private o5 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r4 f25879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ISBannerSize f25880i;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected r4 f25881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected d.a f25882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected int f25883c;
        protected String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected long f25884e;
        protected int f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f25885h;
        private final URL k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final JSONObject f25887l;
        private final boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f25888n;
        private final long o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final boolean f25889p;
        private final boolean q;
        private final boolean r;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        protected String f25886i = "";
        protected int j = 0;
        protected String g = a((Integer) null);

        public a(r4 r4Var, URL url, JSONObject jSONObject, boolean z2, o5 o5Var) {
            this.f25881a = r4Var;
            this.k = url;
            this.f25887l = jSONObject;
            this.m = z2;
            this.f25888n = o5Var.g();
            this.o = o5Var.m();
            this.f25889p = o5Var.o();
            this.q = o5Var.p();
            this.f25885h = o5Var.d();
            this.r = o5Var.n();
        }

        private String a() {
            return this.f25885h == 2 ? mb.b().d() : mb.b().c();
        }

        private JSONObject b(String str, String str2) throws JSONException {
            IronLog.INTERNAL.verbose("decrypting and decompressing auction response");
            String strDecryptAndDecompress = IronSourceAES.decryptAndDecompress(str, str2);
            if (strDecryptAndDecompress != null) {
                return new JSONObject(strDecryptAndDecompress);
            }
            throw new JSONException("decompression error");
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zB = b();
            r4 r4Var = this.f25881a;
            if (r4Var == null) {
                return;
            }
            a(zB, r4Var, Z.f() - this.f25884e);
        }

        private String a(Integer num) {
            return x4.f27661a.a(this.r, num);
        }

        public boolean b() {
            String str;
            this.f25884e = Z.f();
            try {
                this.f25885h = this.j == 1015 ? 1 : this.f25885h;
                this.f = 0;
                HttpURLConnection httpURLConnectionA = null;
                while (true) {
                    int i2 = this.f;
                    int i3 = this.f25888n;
                    if (i2 >= i3) {
                        this.f = i3 - 1;
                        this.g = a(Integer.valueOf(this.f25883c));
                        return false;
                    }
                    try {
                        long time = new Date().getTime();
                        String str2 = "Auction Handler: auction trial " + (this.f + 1) + " out of " + this.f25888n + " max trials";
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, str2, 0);
                        IronSourceUtils.sendAutomationLog(str2);
                        httpURLConnectionA = a(this.k, this.o);
                        a(httpURLConnectionA, this.f25887l, this.f25889p);
                        int responseCode = httpURLConnectionA.getResponseCode();
                        if (responseCode == 200 || responseCode == 204) {
                            try {
                                a(a(httpURLConnectionA), this.m, this.q);
                                httpURLConnectionA.disconnect();
                                return true;
                            } catch (JSONException e2) {
                                q9.d().a(e2);
                                if (e2.getMessage() != null && e2.getMessage().equalsIgnoreCase("decryption error")) {
                                    this.f25883c = 1003;
                                    str = "Auction decryption error";
                                } else if (e2.getMessage() == null || !e2.getMessage().equalsIgnoreCase("decompression error")) {
                                    this.f25883c = 1002;
                                    str = "Auction parsing error";
                                } else {
                                    this.f25883c = 1008;
                                    str = "Auction decompression error";
                                }
                                this.d = str;
                                this.g = a(Integer.valueOf(this.f25883c));
                                IronLog.INTERNAL.error("Auction handle response exception " + e2.getMessage());
                                httpURLConnectionA.disconnect();
                                return false;
                            }
                        }
                        this.f25883c = 1001;
                        String str3 = "Auction response code not valid, error code response from server - " + responseCode;
                        this.d = str3;
                        IronLog.INTERNAL.error(str3);
                        httpURLConnectionA.disconnect();
                        if (this.f < this.f25888n - 1) {
                            a(this.o, time);
                        }
                        this.f++;
                    } catch (SocketTimeoutException e3) {
                        q9.d().a(e3);
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        this.f25883c = 1006;
                        this.d = "Connection timed out";
                        IronLog.INTERNAL.error("Auction socket timeout exception " + e3.getMessage());
                    } catch (Throwable th) {
                        q9.d().a(th);
                        IronLog.INTERNAL.error("getting exception " + th);
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        this.f25883c = 1000;
                        this.d = th.getMessage();
                        this.g = a(Integer.valueOf(this.f25883c));
                        return false;
                    }
                }
            } catch (Exception e4) {
                q9.d().a(e4);
                this.f25883c = 1007;
                this.d = e4.getMessage();
                this.f = 0;
                this.g = a(Integer.valueOf(this.f25883c));
                IronLog.INTERNAL.error("Auction request exception " + e4.getMessage());
                return false;
            }
        }

        private String a(HttpURLConnection httpURLConnection) throws IOException {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
                sb.append(line);
            }
        }

        private HttpURLConnection a(URL url, long j) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod(ko.f25535b);
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setReadTimeout((int) j);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            return httpURLConnection;
        }

        private JSONObject a(String str, String str2) throws JSONException {
            String strDecode = IronSourceAES.decode(str, str2);
            if (TextUtils.isEmpty(strDecode)) {
                throw new JSONException("decryption error");
            }
            return new JSONObject(strDecode);
        }

        public JSONObject a(JSONObject jSONObject, boolean z2) throws JSONException {
            String strA = a();
            String string = jSONObject.getString(this.f25885h == 2 ? b.y3 : qt.f26623n);
            return z2 ? b(strA, string) : a(strA, string);
        }

        private void a(long j, long j2) {
            long time = j - (new Date().getTime() - j2);
            if (time > 0) {
                SystemClock.sleep(time);
            }
        }

        public void a(String str, boolean z2, boolean z3) throws JSONException {
            if (TextUtils.isEmpty(str)) {
                throw new JSONException("empty response");
            }
            JSONObject jSONObject = new JSONObject(str);
            if (z2) {
                jSONObject = a(jSONObject, z3);
            }
            d.a aVarA = d.b().a(jSONObject);
            this.f25882b = aVarA;
            this.f25883c = aVarA.c();
            this.d = this.f25882b.d();
        }

        private void a(HttpURLConnection httpURLConnection, JSONObject jSONObject, boolean z2) throws Exception {
            String strA;
            String strEncode;
            OutputStream outputStream = httpURLConnection.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            if (this.f25885h == 2) {
                try {
                    strA = mb.b().a();
                } catch (JSONException e2) {
                    q9.d().a(e2);
                    this.f25886i = e2.getLocalizedMessage();
                    this.j = 1015;
                    this.f25885h = 1;
                    IronLog.INTERNAL.error("get encrypted session key exception " + e2.getMessage());
                    strA = "";
                }
            } else {
                strA = "";
            }
            String string = jSONObject.toString();
            String strA2 = a();
            if (z2) {
                IronLog.INTERNAL.verbose("compressing and encrypting auction request");
                strEncode = IronSourceAES.compressAndEncrypt(strA2, string);
            } else {
                strEncode = IronSourceAES.encode(strA2, string);
            }
            bufferedWriter.write(this.f25885h == 2 ? String.format("{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}", strA, strEncode) : String.format("{\"request\" : \"%1$s\"}", strEncode));
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
            outputStream.close();
        }

        public void a(boolean z2, r4 r4Var, long j) {
            if (z2) {
                r4Var.a(this.f25882b.h(), this.f25882b.a(), this.f25882b.e(), this.f25882b.f(), this.f25882b.b(), this.f + 1, j, this.j, this.f25886i);
            } else {
                r4Var.a(this.f25883c, this.d, this.f + 1, this.g, j);
            }
        }
    }

    @Deprecated
    public e(IronSource.AD_UNIT ad_unit, o5 o5Var, r4 r4Var) {
        this.f = ad_unit;
        this.g = o5Var;
        this.f25879h = r4Var;
    }

    private JSONObject a(Map<String, Object> map, List<String> list, h hVar, int i2, boolean z2, IronSourceSegment ironSourceSegment) throws JSONException {
        i iVar = new i(this.f);
        iVar.a(map);
        iVar.a(list);
        iVar.a(hVar);
        iVar.a(i2);
        iVar.a(this.f25880i);
        iVar.a(ironSourceSegment);
        iVar.b(z2);
        return d.b().a(iVar);
    }

    public e(f fVar) {
        this.f25878e = fVar;
    }

    public void a(Context context, i iVar, r4 r4Var) {
        try {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f25878e.a(context, iVar, r4Var));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error("execute auction exception " + e2.getMessage());
            if (r4Var != null) {
                r4Var.a(1000, e2.getMessage(), 0, x4.f27661a.a(this.f25878e.b(), 1000), 0L);
            }
        }
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, h hVar, int i2, IronSourceSegment ironSourceSegment) {
        e eVar;
        try {
            boolean zIsEncryptedResponse = IronSourceUtils.isEncryptedResponse();
            eVar = this;
            try {
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(eVar.f25879h, new URL(eVar.g.a(false)), eVar.a(map, list, hVar, i2, zIsEncryptedResponse, ironSourceSegment), zIsEncryptedResponse, eVar.g));
            } catch (Exception e2) {
                e = e2;
                Exception exc = e;
                q9.d().a(exc);
                IronLog.INTERNAL.error("execute auction exception " + exc.getMessage());
                eVar.f25879h.a(1000, exc.getMessage(), 0, x4.f27661a.a(eVar.g.n(), 1000), 0L);
            }
        } catch (Exception e3) {
            e = e3;
            eVar = this;
        }
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, h hVar, int i2, IronSourceSegment ironSourceSegment, ISBannerSize iSBannerSize) {
        this.f25880i = iSBannerSize;
        a(context, map, list, hVar, i2, ironSourceSegment);
    }

    public void a(m5 m5Var, int i2, m5 m5Var2) {
        Iterator<String> it = m5Var.h().iterator();
        while (it.hasNext()) {
            m5 m5Var3 = m5Var;
            int i3 = i2;
            d.b().a("reportLoadSuccess", m5Var3.c(), d.b().a(it.next(), i3, m5Var3, "", "", ""));
            i2 = i3;
            m5Var = m5Var3;
        }
        m5 m5Var4 = m5Var;
        int i4 = i2;
        if (m5Var2 != null) {
            Iterator<String> it2 = m5Var2.h().iterator();
            while (it2.hasNext()) {
                d.b().a("reportLoadSuccess", "GenericNotifications", d.b().a(it2.next(), i4, m5Var4, "", "102", ""));
            }
        }
    }

    public void a(m5 m5Var, int i2, m5 m5Var2, String str) {
        Iterator<String> it = m5Var.b().iterator();
        while (it.hasNext()) {
            m5 m5Var3 = m5Var;
            int i3 = i2;
            String str2 = str;
            d.b().a("reportImpression", m5Var3.c(), d.b().a(it.next(), i3, m5Var3, "", "", str2));
            i2 = i3;
            m5Var = m5Var3;
            str = str2;
        }
        m5 m5Var4 = m5Var;
        int i4 = i2;
        String str3 = str;
        if (m5Var2 != null) {
            Iterator<String> it2 = m5Var2.b().iterator();
            while (it2.hasNext()) {
                d.b().a("reportImpression", "GenericNotifications", d.b().a(it2.next(), i4, m5Var4, "", "102", str3));
            }
        }
    }

    public void a(ArrayList<String> arrayList, ConcurrentHashMap<String, m5> concurrentHashMap, int i2, m5 m5Var, m5 m5Var2) {
        int iJ = m5Var2.j();
        for (String str : arrayList) {
            if (!str.equals(m5Var2.c())) {
                m5 m5Var3 = concurrentHashMap.get(str);
                int iJ2 = m5Var3.j();
                String strI = m5Var3.i();
                String str2 = iJ2 < iJ ? "1" : "102";
                IronLog.INTERNAL.verbose("instance=" + m5Var3.c() + ", instancePriceOrder= " + iJ2 + ", loseReasonCode=" + str2 + ", winnerInstance=" + m5Var2.c() + ", winnerInstancePriceOrder=" + iJ);
                Iterator<String> it = m5Var3.g().iterator();
                while (it.hasNext()) {
                    d.b().a("reportAuctionLose", m5Var3.c(), d.b().a(it.next(), i2, m5Var2, strI, str2, ""));
                }
            }
        }
        if (m5Var != null) {
            Iterator<String> it2 = m5Var.g().iterator();
            while (it2.hasNext()) {
                d.b().a("reportAuctionLose", "GenericNotifications", d.b().a(it2.next(), i2, m5Var2, "", "102", ""));
            }
        }
    }

    public void a(CopyOnWriteArrayList<y> copyOnWriteArrayList, ConcurrentHashMap<String, m5> concurrentHashMap, int i2, m5 m5Var, m5 m5Var2) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<y> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        a(arrayList, concurrentHashMap, i2, m5Var, m5Var2);
    }

    public boolean a() {
        return this.f25878e.a();
    }
}
