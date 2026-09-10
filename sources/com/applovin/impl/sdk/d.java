package com.applovin.impl.sdk;

import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.f2;
import com.applovin.impl.f6;
import com.applovin.impl.h2;
import com.applovin.impl.k5;
import com.applovin.impl.r7;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u6;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAdType;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final File f9407b = new File(l.p().getFilesDir(), "al/persisted-ads");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f9408a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a implements s4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AppLovinAdType f9410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f9411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f9412d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f9413e;

        public a(String str, AppLovinAdType appLovinAdType, boolean z10, long j10, long j11) {
            this.f9409a = str;
            this.f9410b = appLovinAdType;
            this.f9411c = z10;
            this.f9412d = j10;
            this.f9413e = j11;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public long b() {
            return this.f9413e;
        }

        public long c() {
            return this.f9412d;
        }

        public String d() {
            return this.f9409a + "_" + this.f9410b;
        }

        public String e() {
            return this.f9409a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            String strE = e();
            String strE2 = aVar.e();
            if (strE != null ? !strE.equals(strE2) : strE2 != null) {
                return false;
            }
            AppLovinAdType appLovinAdTypeF = f();
            AppLovinAdType appLovinAdTypeF2 = aVar.f();
            return appLovinAdTypeF != null ? appLovinAdTypeF.equals(appLovinAdTypeF2) : appLovinAdTypeF2 == null;
        }

        public AppLovinAdType f() {
            return this.f9410b;
        }

        public boolean g() {
            return this.f9411c;
        }

        public int hashCode() {
            String strE = e();
            int iHashCode = strE == null ? 43 : strE.hashCode();
            AppLovinAdType appLovinAdTypeF = f();
            return ((iHashCode + 59) * 59) + (appLovinAdTypeF != null ? appLovinAdTypeF.hashCode() : 43);
        }

        public String toString() {
            return "AdPersistenceFileService.PersistedAdFilePath(id=" + e() + ", type=" + f() + ", isAdServerAd=" + g() + ", expiryTimeMillis=" + c() + ", appLaunchTimestamp=" + b() + ")";
        }

        public static a a(com.applovin.impl.sdk.ad.b bVar) {
            return a(bVar, 0L, 0L);
        }

        public static a a(com.applovin.impl.sdk.ad.b bVar, long j10, long j11) {
            if (bVar == null) {
                return null;
            }
            return new a(StringUtils.isValidString(bVar.getMediationServeId()) ? bVar.getMediationServeId() : UUID.randomUUID().toString(), bVar.getType(), bVar instanceof com.applovin.impl.sdk.ad.a, SystemClock.elapsedRealtime() + j10, j11);
        }

        public static a a(JSONObject jSONObject, l lVar) {
            String string = JsonUtils.getString(jSONObject, "id", "");
            String string2 = JsonUtils.getString(jSONObject, "type", "");
            Boolean bool = JsonUtils.getBoolean(jSONObject, "is_ad_server_ad", null);
            long j10 = JsonUtils.getLong(jSONObject, "expiry_time_millis", 0L);
            long j11 = JsonUtils.getLong(jSONObject, "app_launch_timestamp", 0L);
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || bool == null) {
                return null;
            }
            return new a(string, AppLovinAdType.fromString(string2), bool.booleanValue(), j10, j11);
        }

        @Override // com.applovin.impl.s4
        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "id", this.f9409a);
            JsonUtils.putString(jSONObject, "type", this.f9410b.toString());
            JsonUtils.putBoolean(jSONObject, "is_ad_server_ad", this.f9411c);
            JsonUtils.putLong(jSONObject, "expiry_time_millis", this.f9412d);
            JsonUtils.putLong(jSONObject, "app_launch_timestamp", this.f9413e);
            return jSONObject;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b {
        void a(a aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface c {
        void a(com.applovin.impl.sdk.ad.b bVar, String str);
    }

    public d(l lVar) {
        this.f9408a = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        a aVarA = a.a(bVar, ((Long) this.f9408a.a(z4.f10123d1)).longValue(), l.o());
        File fileA = a(aVarA);
        if (fileA == null) {
            a("Could not persist incompatible ad", bVar, bVar2);
            return;
        }
        try {
            JSONObject jSONObjectA = bVar.a();
            if (jSONObjectA == null) {
                a("Could not serialize ad for persistence", bVar, bVar2);
                return;
            }
            if (this.f9408a.I().a((InputStream) new ByteArrayInputStream(jSONObjectA.toString().getBytes("UTF-8")), fileA, true)) {
                a(aVarA, bVar, bVar2);
            } else {
                a("Failed to write persisted ad to disk", bVar, bVar2);
            }
        } catch (Throwable th2) {
            a("Ad could not be persisted", bVar, bVar2);
            this.f9408a.E().a("AdPersistenceFileService", th2, CollectionUtils.map("error_message", "Ad could not be persisted"));
        }
    }

    public void b(com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        if (b()) {
            this.f9408a.s0().a((k5) new u6(this.f9408a, "persistAd", new androidx.fragment.app.d(this, bVar, bVar2, 21)), f6.b.CACHING);
        } else {
            a("Ad Persistence directory could not be created", bVar, bVar2);
        }
    }

    private boolean b() {
        File file = f9407b;
        if (file.exists()) {
            return true;
        }
        return file.mkdir();
    }

    public void b(a aVar) {
        File fileA = a(aVar);
        if (fileA != null) {
            fileA.delete();
        }
    }

    public void a(a aVar, c cVar) {
        File fileA = a(aVar);
        if (fileA != null && fileA.exists()) {
            this.f9408a.s0().a((k5) new u6(this.f9408a, "retrievePersistedAd", new bc.r(this, fileA, cVar, aVar, 12)), f6.b.OTHER);
        } else {
            cVar.a(null, "Persisted ad could not be retrieved: Retrieval failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(File file, c cVar, a aVar) {
        com.applovin.impl.sdk.ad.b bVarA;
        String strF = this.f9408a.I().f(file);
        if (strF == null) {
            cVar.a(null, "Persisted ad could not be retrieved: Read failed");
            return;
        }
        try {
            JSONObject jSONObjectJsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(strF, new JSONObject());
            JsonUtils.putBoolean(JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "full_response", new JSONObject()), "is_persisted_ad", true);
            if (aVar.g()) {
                bVarA = com.applovin.impl.sdk.ad.a.a(jSONObjectJsonObjectFromJsonString, this.f9408a);
            } else {
                bVarA = r7.a(jSONObjectJsonObjectFromJsonString, this.f9408a);
            }
            if (bVarA == null) {
                cVar.a(null, "Persisted ad could not be retrieved: Deserialization failed");
            } else {
                cVar.a(bVarA, null);
            }
        } catch (Throwable th2) {
            cVar.a(null, "Persisted ad could not be retrieved: Deserialization failed");
            this.f9408a.E().a("AdPersistenceFileService", th2, CollectionUtils.map("error_message", "Persisted ad could not be retrieved: Deserialization failed"));
        }
    }

    private File a(a aVar) {
        if (aVar == null) {
            return null;
        }
        return new File(f9407b.getAbsolutePath() + "/" + aVar.d());
    }

    private void a(a aVar, com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        if (bVar2 == null) {
            return;
        }
        this.f9408a.Q();
        if (p.a()) {
            this.f9408a.Q().a("AdPersistenceFileService", "Ad was persisted successfully");
        }
        bVar2.a(aVar);
        this.f9408a.g().a(f2.V, bVar);
    }

    private void a(String str, com.applovin.impl.sdk.ad.b bVar, b bVar2) {
        if (bVar2 == null) {
            return;
        }
        this.f9408a.Q();
        if (p.a()) {
            this.f9408a.Q().a("AdPersistenceFileService", str);
        }
        bVar2.a(null);
        Map mapA = h2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid("error_message", str, mapA);
        this.f9408a.g().d(f2.W, mapA);
    }

    public void a(List list) {
        File[] fileArrListFiles = f9407b.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        boolean z10 = false;
        for (File file : fileArrListFiles) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((a) it.next()).d().equals(file.getName())) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                file.delete();
            }
        }
    }

    public void a() {
        File[] fileArrListFiles;
        File file = f9407b;
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
    }
}
