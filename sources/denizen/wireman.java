package denizen;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.firebase.encoders.EncodingException;
import com.ironsource.A5;
import com.ironsource.C3460cc;
import com.ironsource.L6;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import escorial.arytenoidectomy;
import escorial.cutely;
import escorial.formularize;
import escorial.impassible;
import escorial.kowloon;
import escorial.triweekly;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import lehua.impromptu;
import lehua.taiyuan;
import vaporizer.apical;

/* JADX INFO: compiled from: CctTransportBackend.java */
/* JADX INFO: loaded from: classes2.dex */
public final class wireman implements apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final derbyshire.attabal f25193attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final bramley.attabal f25194beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final int f25195competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Context f25196dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final bramley.attabal f25197marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ConnectivityManager f25198saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final URL f25199wireman;

    /* JADX INFO: compiled from: CctTransportBackend.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final URL f25200attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final String f25201dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final cutely f25202saneness;

        public attabal(URL url, cutely cutelyVar, String str) {
            this.f25200attabal = url;
            this.f25202saneness = cutelyVar;
            this.f25201dern = str;
        }

        public attabal attabal(URL url) {
            return new attabal(url, this.f25202saneness, this.f25201dern);
        }
    }

    /* JADX INFO: compiled from: CctTransportBackend.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f25203attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final long f25204dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final URL f25205saneness;

        public saneness(int i, URL url, long j) {
            this.f25203attabal = i;
            this.f25205saneness = url;
            this.f25204dern = j;
        }
    }

    public wireman(Context context, bramley.attabal attabalVar, bramley.attabal attabalVar2, int i) {
        this.f25193attabal = cutely.saneness();
        this.f25196dern = context;
        this.f25198saneness = (ConnectivityManager) context.getSystemService("connectivity");
        this.f25199wireman = triweekly(denizen.attabal.f25186dern);
        this.f25197marial = attabalVar2;
        this.f25194beachfront = attabalVar;
        this.f25195competently = i;
    }

    public static TelephonyManager apical(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static String beachfront(Context context) {
        String simOperator = apical(context).getSimOperator();
        return simOperator != null ? simOperator : "";
    }

    public static int competently(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.getValue();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return NetworkConnectionInfo.MobileSubtype.COMBINED.getValue();
        }
        if (NetworkConnectionInfo.MobileSubtype.forNumber(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    public static long formularize() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static InputStream impassible(InputStream inputStream, String str) throws IOException {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static int impromptu(NetworkInfo networkInfo) {
        return networkInfo == null ? NetworkConnectionInfo.NetworkType.NONE.getValue() : networkInfo.getType();
    }

    public static int taiyuan(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            unliveable.attabal.wireman("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    public static URL triweekly(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    public static /* synthetic */ attabal wireman(attabal attabalVar, saneness sanenessVar) {
        URL url = sanenessVar.f25205saneness;
        if (url == null) {
            return null;
        }
        unliveable.attabal.saneness("CctTransportBackend", "Following redirect to: %s", url);
        return attabalVar.attabal(sanenessVar.f25205saneness);
    }

    @Override // vaporizer.apical
    public BackendResponse attabal(vaporizer.marial marialVar) {
        cutely cutelyVarCutely = cutely(marialVar);
        URL urlTriweekly = this.f25199wireman;
        String strWireman = null;
        if (marialVar.dern() != null) {
            try {
                denizen.attabal attabalVarDern = denizen.attabal.dern(marialVar.dern());
                strWireman = attabalVarDern.wireman() != null ? attabalVarDern.wireman() : null;
                if (attabalVarDern.marial() != null) {
                    urlTriweekly = triweekly(attabalVarDern.marial());
                }
            } catch (IllegalArgumentException unused) {
                return BackendResponse.attabal();
            }
        }
        try {
            saneness sanenessVar = (saneness) neurotropism.saneness.attabal(5, new attabal(urlTriweekly, cutelyVarCutely, strWireman), new neurotropism.attabal() { // from class: denizen.saneness
                @Override // neurotropism.attabal
                public final Object apply(Object obj) {
                    return this.f25192attabal.marial((wireman.attabal) obj);
                }
            }, new neurotropism.dern() { // from class: denizen.dern
                @Override // neurotropism.dern
                public final Object attabal(Object obj, Object obj2) {
                    return wireman.wireman((wireman.attabal) obj, (wireman.saneness) obj2);
                }
            });
            int i = sanenessVar.f25203attabal;
            if (i == 200) {
                return BackendResponse.marial(sanenessVar.f25204dern);
            }
            if (i < 500 && i != 404) {
                return i == 400 ? BackendResponse.wireman() : BackendResponse.attabal();
            }
            return BackendResponse.beachfront();
        } catch (IOException e) {
            unliveable.attabal.wireman("CctTransportBackend", "Could not make request to the backend", e);
            return BackendResponse.beachfront();
        }
    }

    public final cutely cutely(vaporizer.marial marialVar) {
        triweekly.attabal attabalVarFormularize;
        HashMap map = new HashMap();
        for (taiyuan taiyuanVar : marialVar.saneness()) {
            String strTriweekly = taiyuanVar.triweekly();
            if (map.containsKey(strTriweekly)) {
                ((List) map.get(strTriweekly)).add(taiyuanVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(taiyuanVar);
                map.put(strTriweekly, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            taiyuan taiyuanVar2 = (taiyuan) ((List) entry.getValue()).get(0);
            kowloon.attabal attabalVarSaneness = kowloon.attabal().beachfront(QosTier.DEFAULT).competently(this.f25194beachfront.attabal()).impromptu(this.f25197marial.attabal()).saneness(ClientInfo.attabal().dern(ClientInfo.ClientType.ANDROID_FIREBASE).saneness(escorial.attabal.attabal().impassible(Integer.valueOf(taiyuanVar2.taiyuan("sdk-version"))).cutely(taiyuanVar2.saneness(L6.B)).beachfront(taiyuanVar2.saneness("hardware")).wireman(taiyuanVar2.saneness(X3.i.G)).formularize(taiyuanVar2.saneness(AppLovinEventTypes.USER_VIEWED_PRODUCT)).apical(taiyuanVar2.saneness("os-uild")).impromptu(taiyuanVar2.saneness("manufacturer")).marial(taiyuanVar2.saneness("fingerprint")).dern(taiyuanVar2.saneness("country")).competently(taiyuanVar2.saneness("locale")).taiyuan(taiyuanVar2.saneness("mcc_mnc")).saneness(taiyuanVar2.saneness("application_build")).attabal()).attabal());
            try {
                attabalVarSaneness.taiyuan(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                attabalVarSaneness.cutely((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (taiyuan taiyuanVar3 : (List) entry.getValue()) {
                impromptu impromptuVarMarial = taiyuanVar3.marial();
                staphylococcal.dern dernVarSaneness = impromptuVarMarial.saneness();
                if (dernVarSaneness.equals(staphylococcal.dern.saneness("proto"))) {
                    attabalVarFormularize = triweekly.formularize(impromptuVarMarial.attabal());
                } else if (dernVarSaneness.equals(staphylococcal.dern.saneness("json"))) {
                    attabalVarFormularize = triweekly.apical(new String(impromptuVarMarial.attabal(), Charset.forName(C.UTF8_NAME)));
                } else {
                    unliveable.attabal.competently("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", dernVarSaneness);
                }
                attabalVarFormularize.wireman(taiyuanVar3.beachfront()).marial(taiyuanVar3.kowloon()).cutely(taiyuanVar3.cutely("tz-offset")).competently(NetworkConnectionInfo.attabal().dern(NetworkConnectionInfo.NetworkType.forNumber(taiyuanVar3.taiyuan("net-type"))).saneness(NetworkConnectionInfo.MobileSubtype.forNumber(taiyuanVar3.taiyuan("mobile-subtype"))).attabal());
                if (taiyuanVar3.wireman() != null) {
                    attabalVarFormularize.dern(taiyuanVar3.wireman());
                }
                if (taiyuanVar3.formularize() != null) {
                    attabalVarFormularize.saneness(ComplianceData.attabal().saneness(impassible.attabal().saneness(formularize.attabal().saneness(taiyuanVar3.formularize()).attabal()).attabal()).dern(ComplianceData.ProductIdOrigin.EVENT_OVERRIDE).attabal());
                }
                if (taiyuanVar3.competently() != null || taiyuanVar3.impromptu() != null) {
                    escorial.apical.attabal attabalVarAttabal = escorial.apical.attabal();
                    if (taiyuanVar3.competently() != null) {
                        attabalVarAttabal.saneness(taiyuanVar3.competently());
                    }
                    if (taiyuanVar3.impromptu() != null) {
                        attabalVarAttabal.dern(taiyuanVar3.impromptu());
                    }
                    attabalVarFormularize.beachfront(attabalVarAttabal.attabal());
                }
                arrayList3.add(attabalVarFormularize.attabal());
            }
            attabalVarSaneness.dern(arrayList3);
            arrayList2.add(attabalVarSaneness.attabal());
        }
        return cutely.attabal(arrayList2);
    }

    public final saneness marial(attabal attabalVar) throws IOException {
        unliveable.attabal.beachfront("CctTransportBackend", "Making request to: %s", attabalVar.f25200attabal);
        HttpURLConnection httpURLConnection = (HttpURLConnection) attabalVar.f25200attabal.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f25195competently);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(C3460cc.b);
        httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", A5.M);
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = attabalVar.f25201dern;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f25193attabal.attabal(attabalVar.f25202saneness, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    unliveable.attabal.beachfront("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    unliveable.attabal.saneness("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    unliveable.attabal.saneness("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new saneness(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new saneness(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamImpassible = impassible(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            saneness sanenessVar = new saneness(responseCode, null, arytenoidectomy.saneness(new BufferedReader(new InputStreamReader(inputStreamImpassible))).dern());
                            if (inputStreamImpassible != null) {
                                inputStreamImpassible.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return sanenessVar;
                        } catch (Throwable th) {
                            if (inputStreamImpassible != null) {
                                try {
                                    inputStreamImpassible.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                }
                throw th7;
            }
        } catch (EncodingException e) {
            e = e;
            unliveable.attabal.wireman("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new saneness(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            unliveable.attabal.wireman("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new saneness(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            unliveable.attabal.wireman("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new saneness(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            unliveable.attabal.wireman("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new saneness(400, null, 0L);
        }
    }

    @Override // vaporizer.apical
    public taiyuan saneness(taiyuan taiyuanVar) {
        NetworkInfo activeNetworkInfo = this.f25198saneness.getActiveNetworkInfo();
        return taiyuanVar.arytenoidectomy().attabal("sdk-version", Build.VERSION.SDK_INT).dern(L6.B, Build.MODEL).dern("hardware", Build.HARDWARE).dern(X3.i.G, Build.DEVICE).dern(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT).dern("os-uild", Build.ID).dern("manufacturer", Build.MANUFACTURER).dern("fingerprint", Build.FINGERPRINT).saneness("tz-offset", formularize()).attabal("net-type", impromptu(activeNetworkInfo)).attabal("mobile-subtype", competently(activeNetworkInfo)).dern("country", Locale.getDefault().getCountry()).dern("locale", Locale.getDefault().getLanguage()).dern("mcc_mnc", beachfront(this.f25196dern)).dern("application_build", Integer.toString(taiyuan(this.f25196dern))).wireman();
    }

    public wireman(Context context, bramley.attabal attabalVar, bramley.attabal attabalVar2) {
        this(context, attabalVar, attabalVar2, 130000);
    }
}
