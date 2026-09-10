package k5;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.internal.ads.b8;
import com.google.android.gms.internal.ads.q12;
import com.google.android.gms.internal.consent_sdk.a0;
import com.google.android.gms.internal.consent_sdk.h;
import com.google.android.gms.internal.consent_sdk.i0;
import com.google.android.gms.internal.consent_sdk.j7;
import com.google.android.gms.internal.consent_sdk.k7;
import com.google.android.gms.internal.consent_sdk.p1;
import com.google.android.gms.internal.consent_sdk.r;
import com.google.android.gms.internal.consent_sdk.t0;
import com.google.android.gms.internal.measurement.v4;
import com.google.android.ump.ConsentInformation;
import com.ironsource.B5;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import ea.a1;
import ea.d0;
import ea.m1;
import ea.s0;
import eb.p;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.j;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.Inflater;
import javax.crypto.Cipher;
import k3.l;
import k3.m;
import k9.c0;
import l1.q;
import l1.y;
import m0.s1;
import oa.f0;
import oa.j0;
import oa.n1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rl.k;
import s0.z0;
import v0.i;
import wa.o;
import xj.n;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements k7, m, k, ye.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static g f44324e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f44325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f44326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f44327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f44328d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f44325a = obj;
        this.f44326b = obj2;
        this.f44327c = obj3;
        this.f44328d = obj4;
    }

    public static synchronized g q(Context context, p5.a aVar) {
        try {
            if (f44324e == null) {
                g gVar = new g();
                Context applicationContext = context.getApplicationContext();
                gVar.f44325a = new a(applicationContext, aVar);
                gVar.f44326b = new b(applicationContext, aVar);
                gVar.f44327c = new e(applicationContext, aVar);
                gVar.f44328d = new f(applicationContext, aVar);
                f44324e = gVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44324e;
    }

    public static void t(long j10, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    public void A() {
        this.f44326b = 12;
    }

    public void B(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.f44325a = Integer.valueOf(i10);
    }

    public void C(xi.b bVar) {
        String str = (String) this.f44326b;
        xi.f fVar = (xi.f) this.f44325a;
        ne.c cVar = (ne.c) this.f44328d;
        if (cVar != null) {
            fVar.e(str, bVar != null ? new v6.c(false, this, bVar) : null, cVar);
        } else {
            fVar.a(str, bVar != null ? new v6.c(false, this, bVar) : null);
        }
    }

    public void D() {
        this.f44327c = 16;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00fe A[Catch: NumberFormatException | JSONException -> 0x010b, NumberFormatException | JSONException -> 0x010b, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x010b, blocks: (B:10:0x0031, B:24:0x0065, B:24:0x0065, B:26:0x0072, B:26:0x0072, B:28:0x0084, B:28:0x0084, B:29:0x008d, B:29:0x008d, B:51:0x00fe, B:51:0x00fe, B:33:0x009a, B:33:0x009a, B:35:0x00a7, B:35:0x00a7, B:37:0x00b9, B:37:0x00b9, B:38:0x00c2, B:38:0x00c2, B:42:0x00ce, B:42:0x00ce, B:46:0x00de, B:46:0x00de, B:50:0x00f2, B:50:0x00f2), top: B:63:0x0031, outer: #1 }] */
    public Bundle E() {
        a1 a1Var = (a1) this.f44328d;
        if (((Bundle) this.f44327c) == null) {
            String str = (String) this.f44325a;
            SharedPreferences sharedPreferencesK0 = a1Var.K0();
            m1 m1Var = (m1) a1Var.f3623a;
            String string = sharedPreferencesK0.getString(str, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            String string2 = jSONObject.getString(B5.f25703q);
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                v4.a();
                                                if (m1Var.f39585d.R0(null, d0.P0)) {
                                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                    int length = jSONArray2.length();
                                                    long[] jArr = new long[length];
                                                    for (int i11 = 0; i11 < length; i11++) {
                                                        jArr[i11] = jSONArray2.optLong(i11);
                                                    }
                                                    bundle.putLongArray(string2, jArr);
                                                }
                                            } else {
                                                s0 s0Var = m1Var.f39587f;
                                                m1.h(s0Var);
                                                s0Var.f39753f.c(string3, "Unrecognized persisted bundle type. Type");
                                            }
                                        } else if (string3.equals("ia")) {
                                            v4.a();
                                            if (m1Var.f39585d.R0(null, d0.P0)) {
                                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                                int length2 = jSONArray3.length();
                                                int[] iArr = new int[length2];
                                                for (int i12 = 0; i12 < length2; i12++) {
                                                    iArr[i12] = jSONArray3.optInt(i12);
                                                }
                                                bundle.putIntArray(string2, iArr);
                                            }
                                        } else {
                                            s0 s0Var2 = m1Var.f39587f;
                                            m1.h(s0Var2);
                                            s0Var2.f39753f.c(string3, "Unrecognized persisted bundle type. Type");
                                        }
                                    } else if (string3.equals("s")) {
                                        bundle.putString(string2, jSONObject.getString("v"));
                                    } else {
                                        s0 s0Var3 = m1Var.f39587f;
                                        m1.h(s0Var3);
                                        s0Var3.f39753f.c(string3, "Unrecognized persisted bundle type. Type");
                                    }
                                } else if (string3.equals("l")) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                } else {
                                    s0 s0Var4 = m1Var.f39587f;
                                    m1.h(s0Var4);
                                    s0Var4.f39753f.c(string3, "Unrecognized persisted bundle type. Type");
                                }
                            } else if (string3.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D)) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else {
                                s0 s0Var5 = m1Var.f39587f;
                                m1.h(s0Var5);
                                s0Var5.f39753f.c(string3, "Unrecognized persisted bundle type. Type");
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            s0 s0Var6 = m1Var.f39587f;
                            m1.h(s0Var6);
                            s0Var6.f39753f.b("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f44327c = bundle;
                } catch (JSONException unused2) {
                    s0 s0Var7 = m1Var.f39587f;
                    m1.h(s0Var7);
                    s0Var7.f39753f.b("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.f44327c) == null) {
                this.f44327c = (Bundle) this.f44326b;
            }
        }
        Bundle bundle2 = (Bundle) this.f44327c;
        c0.h(bundle2);
        return new Bundle(bundle2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.l7
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public g zzb() {
        return new g((t0) ((j7) this.f44325a).zzb(), ((com.google.android.gms.internal.consent_sdk.g) this.f44326b).zzb(), (h) ((j7) this.f44327c).zzb(), (com.google.android.gms.internal.consent_sdk.c0) ((j7) this.f44328d).zzb());
    }

    public com.google.android.gms.internal.consent_sdk.a G(q12 q12Var) throws p1 {
        ConsentInformation.PrivacyOptionsRequirementStatus privacyOptionsRequirementStatus;
        String str;
        h hVar = (h) this.f44327c;
        com.google.android.gms.internal.consent_sdk.c0 c0Var = (com.google.android.gms.internal.consent_sdk.c0) this.f44328d;
        int i10 = q12Var.f18880a;
        hVar.f23032b.edit().putBoolean("is_pub_misconfigured", i10 == 8).commit();
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        int i12 = 3;
        switch (i11) {
            case 1:
            case 2:
            case 3:
                break;
            case 4:
                i12 = 2;
                break;
            case 5:
                i12 = 1;
                break;
            case 6:
                throw new p1(1, "Invalid response from server: ".concat(String.valueOf((String) q12Var.f18884e)));
            case 7:
                throw new p1(3, "Publisher misconfiguration: ".concat(String.valueOf((String) q12Var.f18884e)));
            default:
                throw new p1(1, "Invalid response from server.");
        }
        int i13 = q12Var.f18881b;
        int i14 = i13 - 1;
        if (i13 == 0) {
            throw null;
        }
        if (i14 == 1) {
            privacyOptionsRequirementStatus = ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED;
        } else {
            if (i14 != 2) {
                throw new p1(1, "Invalid response from server.");
            }
            privacyOptionsRequirementStatus = ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED;
        }
        String str2 = (String) q12Var.f18882c;
        r rVar = str2 == null ? null : new r((String) q12Var.f18883d, str2);
        c0Var.f22965a.set((String) q12Var.f18887h);
        hVar.f23032b.edit().putStringSet("stored_info", new HashSet((List) q12Var.f18885f)).commit();
        for (a0 a0Var : (List) q12Var.f18886g) {
            int i15 = a0Var.f22936b;
            int i16 = i15 - 1;
            if (i15 == 0) {
                throw null;
            }
            if (i16 == 0) {
                str = null;
            } else if (i16 == 1) {
                str = "write";
            } else {
                if (i16 != 2) {
                    throw new RuntimeException(null, null);
                }
                str = "clear";
            }
            if (str != null) {
                t0 t0Var = (t0) this.f44325a;
                String str3 = a0Var.f22935a;
                i0[] i0VarArr = {(u) this.f44326b};
                t0Var.getClass();
                t0Var.f23201a.execute(new m0(str, str3, i0VarArr));
            }
        }
        return new com.google.android.gms.internal.consent_sdk.a(i12, privacyOptionsRequirementStatus, rVar);
    }

    public void H(Bundle bundle) {
        String str = (String) this.f44325a;
        a1 a1Var = (a1) this.f44328d;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences sharedPreferencesK0 = a1Var.K0();
        m1 m1Var = (m1) a1Var.f3623a;
        SharedPreferences.Editor editorEdit = sharedPreferencesK0.edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(B5.f25703q, str2);
                        v4.a();
                        if (m1Var.f39585d.R0(null, d0.P0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D);
                            } else {
                                s0 s0Var = m1Var.f39587f;
                                m1.h(s0Var);
                                s0Var.f39753f.c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D);
                            } else {
                                s0 s0Var2 = m1Var.f39587f;
                                m1.h(s0Var2);
                                s0Var2.f39753f.c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e10) {
                        s0 s0Var3 = m1Var.f39587f;
                        m1.h(s0Var3);
                        s0Var3.f39753f.c(e10, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.f44327c = bundle2;
    }

    public synchronized void a(e6.f fVar, g6.u uVar) {
        g6.c cVar = (g6.c) ((HashMap) this.f44326b).put(fVar, new g6.c(fVar, uVar, (ReferenceQueue) this.f44327c));
        if (cVar != null) {
            cVar.f41569c = null;
            cVar.clear();
        }
    }

    public ArrayList b(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = (HashMap) this.f44325a;
        t(jElapsedRealtime, map);
        HashMap map2 = (HashMap) this.f44326b;
        t(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            t1.b bVar = (t1.b) list.get(i10);
            if (!map.containsKey(bVar.f50336b) && !map2.containsKey(Integer.valueOf(bVar.f50337c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public SpannableString c() {
        if (((String) this.f44325a) == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString((String) this.f44325a);
        List<j> list = (List) this.f44326b;
        if (list != null) {
            for (j jVar : list) {
                int iC = i.c(jVar.f43505c);
                if (iC == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), jVar.f43503a, jVar.f43504b, 0);
                } else if (iC == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((io.flutter.view.h) jVar).f43502d)), jVar.f43503a, jVar.f43504b, 0);
                }
            }
        }
        String str = (String) this.f44328d;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan((String) this.f44328d), 0, ((String) this.f44325a).length(), 0);
        }
        String str2 = (String) this.f44327c;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag((String) this.f44327c)), 0, ((String) this.f44325a).length(), 0);
        }
        return spannableString;
    }

    public fb.j d() throws GeneralSecurityException {
        Integer num = (Integer) this.f44325a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.f44326b) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((fb.h) this.f44327c) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (((fb.i) this.f44328d) == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f44325a));
        }
        Integer num2 = (Integer) this.f44326b;
        int iIntValue = num2.intValue();
        fb.h hVar = (fb.h) this.f44327c;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (hVar == fb.h.f40748b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (hVar == fb.h.f40749c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (hVar == fb.h.f40750d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (hVar == fb.h.f40751e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (hVar != fb.h.f40752f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new fb.j(((Integer) this.f44325a).intValue(), ((Integer) this.f44326b).intValue(), (fb.i) this.f44328d, (fb.h) this.f44327c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x007c  */
    @Override // k3.m
    public void e(byte[] bArr, int i10, int i11, l lVar, l1.g gVar) {
        int[] iArr;
        ArrayList arrayList;
        k1.b bVar;
        int i12;
        int i13;
        int iZ;
        int i14;
        int i15;
        int iC;
        b8 b8Var = (b8) this.f44327c;
        q qVar = (q) this.f44326b;
        q qVar2 = (q) this.f44325a;
        qVar2.K(bArr, i10 + i11);
        qVar2.M(i10);
        if (((Inflater) this.f44328d) == null) {
            this.f44328d = new Inflater();
        }
        if (y.L(qVar2, qVar, (Inflater) this.f44328d)) {
            qVar2.K(qVar.f44813a, qVar.f44815c);
        }
        int i16 = 0;
        b8Var.f12677c = 0;
        int[] iArr2 = b8Var.f12675a;
        q qVar3 = (q) b8Var.f12683i;
        b8Var.f12678d = 0;
        b8Var.f12679e = 0;
        b8Var.f12680f = 0;
        b8Var.f12681g = 0;
        b8Var.f12682h = 0;
        qVar3.J(0);
        b8Var.f12676b = false;
        ArrayList arrayList2 = new ArrayList();
        while (qVar2.a() >= 3) {
            int i17 = qVar2.f44815c;
            int iZ2 = qVar2.z();
            int iG = qVar2.G();
            int i18 = qVar2.f44814b + iG;
            if (i18 > i17) {
                qVar2.M(i17);
                iArr = iArr2;
                arrayList = arrayList2;
                bVar = null;
                i12 = i16;
            } else {
                char c4 = 128;
                if (iZ2 != 128) {
                    switch (iZ2) {
                        case 20:
                            if (iG % 5 == 2) {
                                qVar2.N(2);
                                Arrays.fill(iArr2, i16);
                                int i19 = iG / 5;
                                int i20 = i16;
                                while (i20 < i19) {
                                    int iZ3 = qVar2.z();
                                    char c5 = c4;
                                    double dZ = qVar2.z();
                                    double dZ2 = qVar2.z() - 128;
                                    int[] iArr3 = iArr2;
                                    double dZ3 = qVar2.z() - 128;
                                    iArr3[iZ3] = y.j((int) ((dZ3 * 1.772d) + dZ), 0, 255) | (qVar2.z() << 24) | (y.j((int) ((1.402d * dZ2) + dZ), 0, 255) << 16) | (y.j((int) ((dZ - (0.34414d * dZ3)) - (dZ2 * 0.71414d)), 0, 255) << 8);
                                    i20++;
                                    arrayList2 = arrayList2;
                                    c4 = c5;
                                    iArr2 = iArr3;
                                }
                                iArr = iArr2;
                                arrayList = arrayList2;
                                b8Var.f12676b = true;
                            } else {
                                iArr = iArr2;
                                arrayList = arrayList2;
                            }
                            break;
                        case 21:
                            if (iG >= 4) {
                                qVar2.N(3);
                                int i21 = iG - 4;
                                if (((128 & qVar2.z()) != 0 ? 1 : i16) == 0) {
                                    i14 = qVar3.f44814b;
                                    i15 = qVar3.f44815c;
                                    if (i14 < i15 && i21 > 0) {
                                        int iMin = Math.min(i21, i15 - i14);
                                        qVar2.k(qVar3.f44813a, i14, iMin);
                                        qVar3.M(i14 + iMin);
                                    }
                                } else if (i21 >= 7 && (iC = qVar2.C()) >= 4) {
                                    b8Var.f12681g = qVar2.G();
                                    b8Var.f12682h = qVar2.G();
                                    qVar3.J(iC - 4);
                                    i21 = iG - 11;
                                    i14 = qVar3.f44814b;
                                    i15 = qVar3.f44815c;
                                    if (i14 < i15) {
                                        int iMin2 = Math.min(i21, i15 - i14);
                                        qVar2.k(qVar3.f44813a, i14, iMin2);
                                        qVar3.M(i14 + iMin2);
                                    }
                                }
                            }
                            iArr = iArr2;
                            arrayList = arrayList2;
                            break;
                        case 22:
                            if (iG >= 19) {
                                b8Var.f12677c = qVar2.G();
                                b8Var.f12678d = qVar2.G();
                                qVar2.N(11);
                                b8Var.f12679e = qVar2.G();
                                b8Var.f12680f = qVar2.G();
                            }
                            iArr = iArr2;
                            arrayList = arrayList2;
                            break;
                        default:
                            iArr = iArr2;
                            arrayList = arrayList2;
                            break;
                    }
                    i12 = 0;
                    bVar = null;
                } else {
                    iArr = iArr2;
                    arrayList = arrayList2;
                    if (b8Var.f12677c == 0 || b8Var.f12678d == 0 || b8Var.f12681g == 0 || b8Var.f12682h == 0 || (i13 = qVar3.f44815c) == 0 || qVar3.f44814b != i13 || !b8Var.f12676b) {
                        bVar = null;
                    } else {
                        qVar3.M(0);
                        int i22 = b8Var.f12681g * b8Var.f12682h;
                        int[] iArr4 = new int[i22];
                        int i23 = 0;
                        while (i23 < i22) {
                            int iZ4 = qVar3.z();
                            if (iZ4 != 0) {
                                iZ = i23 + 1;
                                iArr4[i23] = iArr[iZ4];
                            } else {
                                int iZ5 = qVar3.z();
                                if (iZ5 != 0) {
                                    iZ = ((iZ5 & 64) == 0 ? iZ5 & 63 : ((iZ5 & 63) << 8) | qVar3.z()) + i23;
                                    Arrays.fill(iArr4, i23, iZ, (iZ5 & 128) == 0 ? iArr[0] : iArr[qVar3.z()]);
                                }
                            }
                            i23 = iZ;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr4, b8Var.f12681g, b8Var.f12682h, Bitmap.Config.ARGB_8888);
                        float f10 = b8Var.f12679e;
                        float f11 = b8Var.f12677c;
                        float f12 = f10 / f11;
                        float f13 = b8Var.f12680f;
                        float f14 = b8Var.f12678d;
                        bVar = new k1.b(null, null, null, bitmapCreateBitmap, f13 / f14, 0, 0, f12, 0, Integer.MIN_VALUE, -3.4028235E38f, b8Var.f12681g / f11, b8Var.f12682h / f14, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                    }
                    i12 = 0;
                    b8Var.f12677c = 0;
                    b8Var.f12678d = 0;
                    b8Var.f12679e = 0;
                    b8Var.f12680f = 0;
                    b8Var.f12681g = 0;
                    b8Var.f12682h = 0;
                    qVar3.J(0);
                    b8Var.f12676b = false;
                }
                qVar2.M(i18);
            }
            ArrayList arrayList3 = arrayList;
            if (bVar != null) {
                arrayList3.add(bVar);
            }
            int i24 = i12;
            arrayList2 = arrayList3;
            i16 = i24;
            iArr2 = iArr;
        }
        gVar.accept(new k3.a(arrayList2, C.TIME_UNSET, C.TIME_UNSET));
    }

    @Override // ye.g
    public void f(BiometricPrompt.AuthenticationResult authenticationResult) {
        HashMap map = (HashMap) this.f44326b;
        ye.a aVar = (ye.a) this.f44328d;
        u uVar = aVar.f54362f;
        ye.d dVar = aVar.f54363g;
        try {
            Log.d("FlutterSecureStorage", "Step 4/8: Initializing current biometric cipher...");
            v6.c cVar = aVar.f54361e;
            SharedPreferences sharedPreferences = aVar.f54359c;
            Context context = dVar.f54373b;
            ze.e eVarI = dVar.f54376e.i(dVar.f54373b, (Cipher) this.f44325a);
            if (map.isEmpty()) {
                Log.i("FlutterSecureStorage", "Step 5/8: No data to encrypt, skipping...");
            } else {
                Log.d("FlutterSecureStorage", "Step 5/8: Encrypting all data with current biometric cipher...");
                ye.d.e(map, sharedPreferences, eVarI);
            }
            Log.d("FlutterSecureStorage", "Step 6/8: Deleting backup after successful re-encryption...");
            no.b.p(sharedPreferences, aVar.f54360d, cVar, dVar.f54372a.f54379c);
            Log.d("FlutterSecureStorage", "Step 7/8: Updating algorithm markers to current...");
            dVar.z(cVar);
            Log.d("FlutterSecureStorage", "Step 8/8: Deleting old biometric AES key from Android KeyStore...");
            if (dVar.f54376e.b()) {
                try {
                    dVar.f54376e.m(context).c();
                    ((ze.e) this.f44327c).d(context);
                    Log.d("FlutterSecureStorage", "Old key deleted from KeyStore");
                } catch (Exception e10) {
                    Log.w("FlutterSecureStorage", "Failed to delete old key from KeyStore (may not exist)", e10);
                }
            }
            dVar.f54375d = eVarI;
            Log.i("FlutterSecureStorage", "Biometric→Biometric migration WITH BACKUP completed! Data now uses new biometric cipher.");
            Log.i("FlutterSecureStorage", "Migrated " + map.size() + " data items with new biometric algorithm.");
            uVar.f(null);
        } catch (Exception e11) {
            Log.e("FlutterSecureStorage", "Failed to complete migration after second authentication", e11);
            uVar.h(e11);
        }
    }

    @Override // ye.g
    public void h(Exception exc) {
        Log.e("FlutterSecureStorage", "Second biometric authentication failed for migration", exc);
        ((ye.a) this.f44328d).f54362f.h(new Exception("Migration cancelled: Second biometric authentication failed", exc));
    }

    @Override // k3.m
    public int i() {
        return 2;
    }

    public wa.e j() throws GeneralSecurityException {
        s4.i iVar;
        lb.a aVarB;
        wa.i iVar2 = (wa.i) this.f44325a;
        if (iVar2 == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        s4.i iVar3 = (s4.i) this.f44326b;
        if (iVar3 == null || (iVar = (s4.i) this.f44327c) == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (iVar2.f53072a != ((lb.a) iVar3.f50111a).f45273a.length) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (iVar2.f53073b != ((lb.a) iVar.f50111a).f45273a.length) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (iVar2.a() && ((Integer) this.f44328d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((wa.i) this.f44325a).a() && ((Integer) this.f44328d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        wa.h hVar = ((wa.i) this.f44325a).f53076e;
        if (hVar == wa.h.f53052j) {
            aVarB = p.f40006a;
        } else if (hVar == wa.h.f53051i) {
            aVarB = p.a(((Integer) this.f44328d).intValue());
        } else {
            if (hVar != wa.h.f53050h) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + ((wa.i) this.f44325a).f53076e);
            }
            aVarB = p.b(((Integer) this.f44328d).intValue());
        }
        return new wa.e((wa.i) this.f44325a, (s4.i) this.f44326b, (s4.i) this.f44327c, aVarB, (Integer) this.f44328d);
    }

    @Override // rl.k
    public void k() {
        ((fc.f) this.f44326b).k();
        ((ArrayList) ((u) this.f44327c).f54879b).add(new dm.a((al.c) n.F0((ArrayList) this.f44328d)));
    }

    @Override // rl.k
    public rl.l l(yl.f fVar) {
        return ((fc.f) this.f44325a).l(fVar);
    }

    public o m() throws GeneralSecurityException {
        Integer num = (Integer) this.f44325a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((wa.h) this.f44328d) == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (((Integer) this.f44326b) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.f44327c) != null) {
            return new o(num.intValue(), ((Integer) this.f44326b).intValue(), ((Integer) this.f44327c).intValue(), (wa.h) this.f44328d);
        }
        throw new GeneralSecurityException("Tag size is not set");
    }

    public void n(g6.c cVar) {
        g6.a0 a0Var;
        synchronized (this) {
            ((HashMap) this.f44326b).remove(cVar.f41567a);
            if (cVar.f41568b && (a0Var = cVar.f41569c) != null) {
                ((g6.m) this.f44328d).e(cVar.f41567a, new g6.u(a0Var, true, false, cVar.f41567a, (g6.m) this.f44328d));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r7 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r7 == r2) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object o(ck.c r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f44328d
            s0.e0 r0 = (s0.e0) r0
            boolean r1 = r7 instanceof s0.k
            if (r1 == 0) goto L17
            r1 = r7
            s0.k r1 = (s0.k) r1
            int r2 = r1.f49838i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f49838i = r2
            goto L1c
        L17:
            s0.k r1 = new s0.k
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.f49836g
            int r2 = r1.f49838i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            k5.g r6 = r1.f49835f
            t9.e.z(r7)
            goto L63
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            k5.g r6 = r1.f49835f
            t9.e.z(r7)
            goto L72
        L3c:
            t9.e.z(r7)
            java.lang.Object r7 = r6.f44327c
            java.util.List r7 = (java.util.List) r7
            bk.a r2 = bk.a.f5708a
            if (r7 == 0) goto L66
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4e
            goto L66
        L4e:
            s0.p0 r7 = r0.g()
            s0.n r4 = new s0.n
            r5 = 0
            r4.<init>(r0, r6, r5)
            r1.f49835f = r6
            r1.f49838i = r3
            java.lang.Object r7 = r7.c(r4, r1)
            if (r7 != r2) goto L63
            goto L71
        L63:
            s0.d r7 = (s0.d) r7
            goto L74
        L66:
            r1.f49835f = r6
            r1.f49838i = r4
            r7 = 0
            java.lang.Object r7 = s0.e0.f(r0, r7, r1)
            if (r7 != r2) goto L72
        L71:
            return r2
        L72:
            s0.d r7 = (s0.d) r7
        L74:
            java.lang.Object r6 = r6.f44328d
            s0.e0 r6 = (s0.e0) r6
            qj.x r6 = r6.f49789h
            r6.y(r7)
            wj.r r6 = wj.r.f53297a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.g.o(ck.c):java.lang.Object");
    }

    @Override // rl.k
    public void p(yl.f fVar, Object obj) {
        ((fc.f) this.f44325a).p(fVar, obj);
    }

    public File r(Context context) {
        ((j2.n) this.f44326b).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    public void s(String str, Object... objArr) {
        String str2 = String.format(Locale.US, str, objArr);
        if (((ni.g) this.f44328d) != null) {
            FlutterJNI.lambda$loadLibrary$0(str2);
        }
    }

    @Override // rl.k
    public void u(yl.f fVar, dm.f fVar2) {
        ((fc.f) this.f44325a).u(fVar, fVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object v(ck.c cVar) throws Throwable {
        z0 z0Var;
        ln.c cVar2;
        ln.a aVar;
        Throwable th2;
        ln.a aVar2;
        g gVar;
        if (cVar instanceof z0) {
            z0Var = (z0) cVar;
            int i10 = z0Var.f49966j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                z0Var.f49966j = i10 - Integer.MIN_VALUE;
            } else {
                z0Var = new z0(this, cVar);
            }
        } else {
            z0Var = new z0(this, cVar);
        }
        Object obj = z0Var.f49964h;
        int i11 = z0Var.f49966j;
        wj.r rVar = wj.r.f53297a;
        bk.a aVar3 = bk.a.f5708a;
        try {
            if (i11 == 0) {
                t9.e.z(obj);
                if (((cn.r) this.f44326b).L()) {
                    return rVar;
                }
                cVar2 = (ln.c) this.f44325a;
                z0Var.f49962f = this;
                z0Var.f49963g = cVar2;
                z0Var.f49966j = 1;
                if (cVar2.e(z0Var) != aVar3) {
                }
                aVar = cVar2;
                return aVar3;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = z0Var.f49963g;
                gVar = z0Var.f49962f;
                try {
                    t9.e.z(obj);
                    aVar2 = aVar2;
                    ((cn.r) gVar.f44326b).O(rVar);
                    ((ln.c) aVar2).g(null);
                    return rVar;
                } catch (Throwable th3) {
                    th2 = th3;
                    ((ln.c) aVar2).g(null);
                    throw th2;
                }
            }
            ln.a aVar4 = z0Var.f49963g;
            g gVar2 = z0Var.f49962f;
            t9.e.z(obj);
            aVar = aVar4;
            this = gVar2;
            aVar = cVar2;
            if (((cn.r) this.f44326b).L()) {
                ((ln.c) aVar).g(null);
                return rVar;
            }
            z0Var.f49962f = this;
            z0Var.f49963g = aVar;
            z0Var.f49966j = 2;
            if (this.o(z0Var) != aVar3) {
                gVar = this;
                aVar2 = aVar;
                ((cn.r) gVar.f44326b).O(rVar);
                ((ln.c) aVar2).g(null);
                return rVar;
            }
            aVar = cVar2;
            return aVar3;
        } catch (Throwable th4) {
            ln.a aVar5 = aVar;
            th2 = th4;
            aVar2 = aVar5;
            ((ln.c) aVar2).g(null);
            throw th2;
        }
    }

    @Override // rl.k
    public void w(yl.f fVar, yl.b bVar, yl.f fVar2) {
        ((fc.f) this.f44325a).w(fVar, bVar, fVar2);
    }

    public t1.b x(List list) {
        t1.b bVar;
        HashMap map = (HashMap) this.f44327c;
        ArrayList arrayListB = b(list);
        if (arrayListB.size() < 2) {
            return (t1.b) oa.q.j(arrayListB, null);
        }
        Collections.sort(arrayListB, new b2.j(16));
        ArrayList arrayList = new ArrayList();
        int i10 = ((t1.b) arrayListB.get(0)).f50337c;
        for (int i11 = 0; i11 < arrayListB.size(); i11++) {
            t1.b bVar2 = (t1.b) arrayListB.get(i11);
            if (i10 != bVar2.f50337c) {
                if (arrayList.size() != 1) {
                    break;
                }
                return (t1.b) arrayListB.get(0);
            }
            arrayList.add(new Pair(bVar2.f50336b, Integer.valueOf(bVar2.f50338d)));
        }
        t1.b bVar3 = (t1.b) map.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List listSubList = arrayListB.subList(0, arrayList.size());
        int i12 = 0;
        for (int i13 = 0; i13 < listSubList.size(); i13++) {
            i12 += ((t1.b) listSubList.get(i13)).f50338d;
        }
        int iNextInt = ((Random) this.f44328d).nextInt(i12);
        int i14 = 0;
        for (int i15 = 0; i15 < listSubList.size(); i15++) {
            bVar = (t1.b) listSubList.get(i15);
            i14 += bVar.f50338d;
            if (iNextInt < i14) {
                map.put(arrayList, bVar);
                return bVar;
            }
        }
        bVar = (t1.b) oa.q.k(listSubList);
        map.put(arrayList, bVar);
        return bVar;
    }

    public void y(Object obj, xi.c cVar) {
        ((xi.f) this.f44325a).m((String) this.f44326b, ((xi.l) this.f44327c).a(obj), cVar == null ? null : new xi.a(0, this, cVar));
    }

    @Override // rl.k
    public k z(yl.b bVar, yl.f fVar) {
        return ((fc.f) this.f44325a).z(bVar, fVar);
    }

    public g(a1 a1Var, String str) {
        this.f44328d = a1Var;
        c0.e(str);
        this.f44325a = str;
        this.f44326b = new Bundle();
    }

    public g(int i10) {
        switch (i10) {
            case 10:
                j2.n nVar = new j2.n(23);
                jj.d dVar = new jj.d(22);
                this.f44325a = new HashSet();
                this.f44326b = nVar;
                this.f44327c = dVar;
                break;
            case 11:
                this.f44325a = new q();
                this.f44326b = new q();
                this.f44327c = new b8(1);
                break;
            case 12:
                this.f44325a = new x.e(0);
                this.f44326b = new SparseArray();
                this.f44327c = new x.g();
                this.f44328d = new x.e(0);
                break;
            case 17:
                Random random = new Random();
                this.f44327c = new HashMap();
                this.f44328d = random;
                this.f44325a = new HashMap();
                this.f44326b = new HashMap();
                break;
            default:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new g6.b(0));
                this.f44326b = new HashMap();
                this.f44327c = new ReferenceQueue();
                this.f44325a = executorServiceNewSingleThreadExecutor;
                executorServiceNewSingleThreadExecutor.execute(new androidx.lifecycle.a0(this, 18));
                break;
        }
    }

    public g(n1 n1Var, m1.i iVar, s1 s1Var, m1.i iVar2) {
        Object objX;
        if (n1Var != null) {
            objX = j0.x(n1Var);
        } else {
            f0 f0Var = j0.f47265b;
            objX = n1.f47281e;
        }
        this.f44325a = objX;
        this.f44326b = iVar;
        this.f44327c = s1Var;
        this.f44328d = iVar2;
    }
}
