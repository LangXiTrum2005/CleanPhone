package zc;

import android.accounts.Account;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.hardware.biometrics.BiometricPrompt;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Surface;
import androidx.work.impl.WorkDatabase_Impl;
import cc.a2;
import cl.x0;
import cn.e1;
import cn.f1;
import com.google.android.gms.internal.ads.j30;
import com.google.android.gms.internal.ads.xd1;
import com.google.android.gms.internal.auth.o0;
import com.google.android.gms.internal.consent_sdk.b3;
import com.google.android.gms.internal.consent_sdk.i0;
import com.google.android.gms.internal.consent_sdk.j0;
import com.google.android.gms.internal.consent_sdk.j7;
import com.google.android.gms.internal.consent_sdk.k7;
import com.google.android.gms.internal.consent_sdk.v3;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.fid.Constants;
import eb.g0;
import eb.h0;
import f2.k1;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.Inflater;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import m0.s1;
import oa.n1;
import org.json.JSONArray;
import org.json.JSONObject;
import ud.w0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements i0, k7, d9.d, lm.e, rl.m, rl.l, k3.m, wd.b, t8.b, ye.g, ze.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static u f54877f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f54879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f54880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f54881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f54882e;

    public /* synthetic */ u(Account account, String str, Bundle bundle, Context context) {
        this.f54878a = 3;
        this.f54880c = account;
        this.f54879b = str;
        this.f54881d = bundle;
        this.f54882e = context;
    }

    public static synchronized u t() {
        try {
            if (f54877f == null) {
                f54877f = new u(0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f54877f;
    }

    public void A(eb.b bVar) throws GeneralSecurityException {
        bVar.getClass();
        g0 g0Var = new g0(eb.c0.class, bVar.f39965a);
        HashMap map = (HashMap) this.f54880c;
        if (!map.containsKey(g0Var)) {
            map.put(g0Var, bVar);
            return;
        }
        eb.b bVar2 = (eb.b) map.get(g0Var);
        if (bVar2.equals(bVar) && bVar.equals(bVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + g0Var);
    }

    public void B(eb.d dVar) throws GeneralSecurityException {
        h0 h0Var = new h0(dVar.f39973a, eb.c0.class);
        HashMap map = (HashMap) this.f54879b;
        if (!map.containsKey(h0Var)) {
            map.put(h0Var, dVar);
            return;
        }
        eb.d dVar2 = (eb.d) map.get(h0Var);
        if (dVar2.equals(dVar) && dVar.equals(dVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + h0Var);
    }

    public void C(eb.q qVar) throws GeneralSecurityException {
        qVar.getClass();
        g0 g0Var = new g0(eb.d0.class, qVar.f40007a);
        HashMap map = (HashMap) this.f54882e;
        if (!map.containsKey(g0Var)) {
            map.put(g0Var, qVar);
            return;
        }
        eb.q qVar2 = (eb.q) map.get(g0Var);
        if (qVar2.equals(qVar) && qVar.equals(qVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + g0Var);
    }

    public void D(eb.s sVar) throws GeneralSecurityException {
        h0 h0Var = new h0(sVar.f40009a, eb.d0.class);
        HashMap map = (HashMap) this.f54881d;
        if (!map.containsKey(h0Var)) {
            map.put(h0Var, sVar);
            return;
        }
        eb.s sVar2 = (eb.s) map.get(h0Var);
        if (sVar2.equals(sVar) && sVar.equals(sVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + h0Var);
    }

    public wj.f E(vf.c cVar, kg.e eVar, List list) {
        ec.a aVar = (ec.a) this.f54879b;
        Integer numValueOf = list != null ? Integer.valueOf(list.size()) : null;
        aVar.a("resolveTrack(" + cVar + "), sources=" + numValueOf + ", strategy=" + kotlin.jvm.internal.d0.f44761a.b(eVar.getClass()).g());
        vf.b bVar = vf.b.f52572a;
        if (list == null) {
            return new wj.f(new MediaFormat(), bVar);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jg.b bVar2 = (jg.b) it.next();
            MediaFormat mediaFormatD = bVar2.d(cVar);
            if (mediaFormatD == null) {
                mediaFormatD = null;
            } else if (!a2.w(cVar, mediaFormatD)) {
                bVar2.b(cVar);
                try {
                    MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(mediaFormatD.getString("mime"));
                    mediaCodecCreateDecoderByType.configure(mediaFormatD, (Surface) null, (MediaCrypto) null, 0);
                    mediaCodecCreateDecoderByType.start();
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    f2.e eVar2 = new f2.e();
                    while (true) {
                        MediaFormat mediaFormatN = null;
                        do {
                            if (mediaFormatN != null) {
                                bVar2.g();
                                bVar2.initialize();
                                if (a2.w(cVar, mediaFormatN)) {
                                    mediaFormatD = mediaFormatN;
                                    break;
                                }
                                String string = "Could not get a complete format! hasMimeType:" + mediaFormatN.containsKey("mime");
                                if (cVar == vf.c.VIDEO) {
                                    StringBuilder sbJ = d5.u.j(string, " hasWidth:");
                                    sbJ.append(mediaFormatN.containsKey("width"));
                                    StringBuilder sbJ2 = d5.u.j(sbJ.toString(), " hasHeight:");
                                    sbJ2.append(mediaFormatN.containsKey("height"));
                                    StringBuilder sbJ3 = d5.u.j(sbJ2.toString(), " hasFrameRate:");
                                    sbJ3.append(mediaFormatN.containsKey("frame-rate"));
                                    string = sbJ3.toString();
                                } else if (cVar == vf.c.AUDIO) {
                                    StringBuilder sbJ4 = d5.u.j(string, " hasChannels:");
                                    sbJ4.append(mediaFormatN.containsKey("channel-count"));
                                    StringBuilder sbJ5 = d5.u.j(sbJ4.toString(), " hasSampleRate:");
                                    sbJ5.append(mediaFormatN.containsKey("sample-rate"));
                                    string = sbJ5.toString();
                                }
                                throw new RuntimeException(string);
                            }
                            mediaFormatN = a2.n(mediaCodecCreateDecoderByType, bufferInfo);
                        } while (mediaFormatN != null);
                        if (!bVar2.a(cVar)) {
                            throw new RuntimeException("This should never happen!");
                        }
                        int iDequeueInputBuffer = mediaCodecCreateDecoderByType.dequeueInputBuffer(0L);
                        if (iDequeueInputBuffer >= 0) {
                            eVar2.f40323d = mediaCodecCreateDecoderByType.getInputBuffer(iDequeueInputBuffer);
                            bVar2.e(eVar2);
                            mediaCodecCreateDecoderByType.queueInputBuffer(iDequeueInputBuffer, ((ByteBuffer) eVar2.f40323d).position(), ((ByteBuffer) eVar2.f40323d).remaining(), eVar2.f40321b, eVar2.f40320a ? 1 : 0);
                        }
                    }
                } catch (IOException e10) {
                    throw new RuntimeException("Can't decode this track", e10);
                }
            }
            if (mediaFormatD != null) {
                arrayList.add(mediaFormatD);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return new wj.f(new MediaFormat(), bVar);
        }
        if (size == list.size()) {
            MediaFormat mediaFormat = new MediaFormat();
            return new wj.f(mediaFormat, eVar.a(arrayList, mediaFormat));
        }
        throw new IllegalStateException(("Of all " + cVar + " sources, some have a " + cVar + " track, some don't.").toString());
    }

    public void F(int i10) throws GeneralSecurityException {
        if (i10 != 12 && i10 != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
        }
        this.f54880c = Integer.valueOf(i10);
    }

    public void G(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.f54879b = Integer.valueOf(i10);
    }

    public void H() {
        this.f54881d = 16;
    }

    public fc.f I(int i10, yl.b bVar, el.a aVar) {
        rl.o oVar = new rl.o(((rl.o) this.f54879b).f49644a + '@' + i10);
        s1 s1Var = (s1) this.f54882e;
        HashMap map = (HashMap) s1Var.f45752c;
        List arrayList = (List) map.get(oVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(oVar, arrayList);
        }
        return ((com.google.android.gms.internal.consent_sdk.x) s1Var.f45751b).q(bVar, aVar, arrayList);
    }

    @Override // rl.l
    public void U(dm.f fVar) {
        ((ArrayList) this.f54879b).add(new dm.s(new dm.q(fVar)));
    }

    @Override // ze.e
    public byte[] a(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr2 = new byte[12];
        ((SecureRandom) this.f54881d).nextBytes(bArr2);
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr2);
        Cipher cipher = (Cipher) this.f54880c;
        cipher.init(1, (SecretKeySpec) this.f54882e, gCMParameterSpec);
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        byte[] bArr3 = new byte[bArrDoFinal.length + 12];
        System.arraycopy(bArr2, 0, bArr3, 0, 12);
        System.arraycopy(bArrDoFinal, 0, bArr3, 12, bArrDoFinal.length);
        return bArr3;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x026f  */
    /* JADX WARN: Code duplicated, block: B:103:0x027d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0284  */
    /* JADX WARN: Code duplicated, block: B:110:0x0294  */
    /* JADX WARN: Code duplicated, block: B:111:0x0297  */
    /* JADX WARN: Code duplicated, block: B:113:0x029b  */
    /* JADX WARN: Code duplicated, block: B:114:0x029e  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:123:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:125:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:136:0x02df  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:138:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:92:0x025b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0262  */
    /* JADX WARN: Code duplicated, block: B:96:0x0269  */
    /* JADX WARN: Code duplicated, block: B:98:0x026c  */
    /* JADX WARN: Failed to find 'out' block for switch in B:75:0x0212. Please report as an issue. */
    /* JADX WARN: Instruction removed from duplicated block: B:92:0x025b, please report this as an issue */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.consent_sdk.i0
    public boolean b(String str, JSONObject jSONObject) {
        HashMap map;
        HashMap map2;
        String str2;
        String str3;
        String str4;
        int iIntValue;
        String str5;
        Integer num;
        Iterator it;
        Object obj;
        Object obj2;
        com.google.android.gms.internal.consent_sdk.h hVar = (com.google.android.gms.internal.consent_sdk.h) this.f54880c;
        Application application = (Application) this.f54879b;
        int iHashCode = str.hashCode();
        boolean zBooleanValue = false;
        if (iHashCode == 94746189) {
            if (!str.equals("clear")) {
                return false;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("keys");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                Log.d("UserMessagingPlatform", "Action[clear]: wrong args.".concat(String.valueOf(jSONObject.toString())));
                return true;
            }
            HashSet hashSet = new HashSet();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String strOptString = jSONArrayOptJSONArray.optString(i10);
                if (TextUtils.isEmpty(strOptString)) {
                    Log.d("UserMessagingPlatform", "Action[clear]: empty key at index: " + i10);
                } else {
                    hashSet.add(strOptString);
                }
            }
            j0.e(application, hashSet);
            return true;
        }
        if (iHashCode != 113399775 || !str.equals("write")) {
            return false;
        }
        com.google.android.gms.internal.consent_sdk.e0 e0Var = new com.google.android.gms.internal.consent_sdk.e0(application);
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            boolean zHasNext = itKeys.hasNext();
            map = e0Var.f23009c;
            map2 = e0Var.f23007a;
            if (!zHasNext) {
                break;
            }
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            Log.d("UserMessagingPlatform", "Writing to storage: [" + next + "] " + String.valueOf(objOpt));
            Context context = e0Var.f23008b;
            com.google.android.gms.internal.consent_sdk.p pVarA = j0.a(context, next);
            if (pVarA != null) {
                String str6 = (String) pVarA.f23159b;
                String str7 = (String) pVarA.f23158a;
                if (!map.containsKey(str7)) {
                    map.put(str7, context.getSharedPreferences(str7, 0).edit());
                }
                SharedPreferences.Editor editor = (SharedPreferences.Editor) map.get(str7);
                if (objOpt instanceof Integer) {
                    Integer num2 = (Integer) objOpt;
                    editor.putInt(str6, num2.intValue());
                    if (com.google.android.gms.internal.consent_sdk.e0.f23006d.contains(str6)) {
                        map2.put(str6, num2);
                    }
                } else if (objOpt instanceof Long) {
                    editor.putLong(str6, ((Long) objOpt).longValue());
                } else if (objOpt instanceof Double) {
                    editor.putFloat(str6, ((Double) objOpt).floatValue());
                } else if (objOpt instanceof Float) {
                    editor.putFloat(str6, ((Float) objOpt).floatValue());
                } else if (objOpt instanceof Boolean) {
                    editor.putBoolean(str6, ((Boolean) objOpt).booleanValue());
                } else if (objOpt instanceof String) {
                    editor.putString(str6, (String) objOpt);
                }
                hVar.f23033c.add(next);
            }
            Log.d("UserMessagingPlatform", "Failed writing key: ".concat(String.valueOf(next)));
        }
        hVar.f23032b.edit().putStringSet("written_values", hVar.f23033c).commit();
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            ((SharedPreferences.Editor) it2.next()).commit();
        }
        if (map2.size() <= 1) {
            return true;
        }
        v3 v3Var = (v3) this.f54881d;
        com.google.android.gms.internal.consent_sdk.e eVar = v3Var.f23220a;
        AtomicReference atomicReference = eVar.f23005g;
        AtomicReference atomicReference2 = eVar.f23004f;
        AtomicReference atomicReference3 = eVar.f23003e;
        AtomicReference atomicReference4 = eVar.f23002d;
        AtomicReference atomicReference5 = eVar.f23001c;
        AtomicReference atomicReference6 = eVar.f23000b;
        if (atomicReference.get() != null) {
            zBooleanValue = ((Boolean) atomicReference.get()).booleanValue();
        } else {
            Context context2 = eVar.f22999a;
            if (context2 == null) {
                atomicReference.set(Boolean.FALSE);
            } else {
                try {
                    atomicReference6.set(FirebaseAnalytics.class.getDeclaredMethod(Constants.GET_INSTANCE, Context.class).invoke(null, context2));
                    atomicReference5.set(FirebaseAnalytics.class.getDeclaredMethod("setConsent", Map.class));
                    Method declaredMethod = pb.a.class.getDeclaredMethod("valueOf", String.class);
                    Method declaredMethod2 = pb.b.class.getDeclaredMethod("valueOf", String.class);
                    atomicReference4.set(declaredMethod);
                    atomicReference3.set(declaredMethod2);
                    atomicReference.set(Boolean.TRUE);
                    zBooleanValue = true;
                } catch (Exception e10) {
                    Log.w("UserMessagingPlatform", "No Firebase class found. ", e10);
                    atomicReference.set(Boolean.FALSE);
                    zBooleanValue = false;
                }
            }
        }
        if (zBooleanValue) {
            Context context3 = v3Var.f23221b;
            if (atomicReference2.get() == null) {
                try {
                    atomicReference2.set(r9.c.a(context3).d(128, context3.getPackageName()).metaData);
                } catch (PackageManager.NameNotFoundException | NullPointerException e11) {
                    Log.w("UserMessagingPlatform", "Failed to get metadata. ", e11);
                }
            }
            String str8 = "IABTCF_gdprApplies";
            Integer num3 = (Integer) map2.get("IABTCF_gdprApplies");
            HashMap map3 = new HashMap();
            Iterator it3 = map2.keySet().iterator();
            while (it3.hasNext()) {
                String str9 = (String) it3.next();
                if (!str9.equals(str8)) {
                    switch (str9) {
                        case "UMP_CoMoAdPersonalizationPurposeConsentStatus":
                            str2 = "google_analytics_default_allow_ad_personalization_signals";
                            str3 = "AD_PERSONALIZATION";
                            iIntValue = ((Integer) map2.get(str9)).intValue();
                            str5 = str8;
                            if (iIntValue != -1) {
                                num = num3;
                                if (iIntValue != 1) {
                                    map3.put(str3, "GRANTED");
                                    str8 = str5;
                                    num3 = num;
                                    break;
                                } else {
                                    it = it3;
                                    if (iIntValue != 2) {
                                        map3.put(str3, "DENIED");
                                    } else if (iIntValue != 4) {
                                        if (iIntValue != 5) {
                                            d5.u.o(iIntValue, "Invalid CoMo consent status: ", "UserMessagingPlatform");
                                        } else {
                                            if (atomicReference2.get() != null || (obj2 = ((Bundle) atomicReference2.get()).get(str2)) == null) {
                                                obj = null;
                                            } else if (obj2 instanceof Boolean) {
                                                obj = (Boolean) obj2;
                                            } else if (obj2 instanceof String) {
                                                obj = (String) obj2;
                                            } else {
                                                obj = null;
                                            }
                                            if (obj == null) {
                                                Log.w("UserMessagingPlatform", "No default metadata");
                                            } else if (obj instanceof Boolean) {
                                                map3.put(str3, true != ((Boolean) obj).booleanValue() ? "DENIED" : "GRANTED");
                                            } else if ((obj instanceof String) || !obj.equals("eu_consent_policy") || (!(str3.equals("AD_PERSONALIZATION") || str3.equals("AD_USER_DATA")) || num == null)) {
                                                Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                            } else {
                                                map3.put(str3, num.intValue() == 1 ? "DENIED" : "GRANTED");
                                            }
                                        }
                                    }
                                }
                            }
                            str8 = str5;
                            num3 = num;
                            it3 = it;
                            break;
                        case "UMP_CoMoAnalyticsStoragePurposeConsentStatus":
                            str2 = "google_analytics_default_allow_analytics_storage";
                            str4 = "ANALYTICS_STORAGE";
                            str3 = str4;
                            iIntValue = ((Integer) map2.get(str9)).intValue();
                            str5 = str8;
                            if (iIntValue != -1) {
                                num = num3;
                                if (iIntValue != 1) {
                                    map3.put(str3, "GRANTED");
                                    str8 = str5;
                                    num3 = num;
                                    break;
                                } else {
                                    it = it3;
                                    if (iIntValue != 2) {
                                        map3.put(str3, "DENIED");
                                    } else if (iIntValue != 4) {
                                        if (iIntValue != 5) {
                                            d5.u.o(iIntValue, "Invalid CoMo consent status: ", "UserMessagingPlatform");
                                        } else {
                                            if (atomicReference2.get() != null) {
                                                obj = null;
                                            } else if (obj2 instanceof Boolean) {
                                                obj = (Boolean) obj2;
                                            } else if (obj2 instanceof String) {
                                                obj = (String) obj2;
                                            } else {
                                                obj = null;
                                            }
                                            if (obj == null) {
                                                Log.w("UserMessagingPlatform", "No default metadata");
                                            } else if (obj instanceof Boolean) {
                                                map3.put(str3, true != ((Boolean) obj).booleanValue() ? "DENIED" : "GRANTED");
                                            } else if (obj instanceof String) {
                                                Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                            } else {
                                                Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                            }
                                        }
                                    }
                                }
                            }
                            str8 = str5;
                            num3 = num;
                            it3 = it;
                            break;
                        case "UMP_CoMoAdStoragePurposeConsentStatus":
                            str2 = "google_analytics_default_allow_ad_storage";
                            str4 = "AD_STORAGE";
                            str3 = str4;
                            iIntValue = ((Integer) map2.get(str9)).intValue();
                            str5 = str8;
                            if (iIntValue != -1) {
                                num = num3;
                                if (iIntValue != 1) {
                                    map3.put(str3, "GRANTED");
                                    str8 = str5;
                                    num3 = num;
                                    break;
                                } else {
                                    it = it3;
                                    if (iIntValue != 2) {
                                        map3.put(str3, "DENIED");
                                    } else if (iIntValue != 4) {
                                        if (iIntValue != 5) {
                                            d5.u.o(iIntValue, "Invalid CoMo consent status: ", "UserMessagingPlatform");
                                        } else {
                                            if (atomicReference2.get() != null) {
                                                obj = null;
                                            } else if (obj2 instanceof Boolean) {
                                                obj = (Boolean) obj2;
                                            } else if (obj2 instanceof String) {
                                                obj = (String) obj2;
                                            } else {
                                                obj = null;
                                            }
                                            if (obj == null) {
                                                Log.w("UserMessagingPlatform", "No default metadata");
                                            } else if (obj instanceof Boolean) {
                                                map3.put(str3, true != ((Boolean) obj).booleanValue() ? "DENIED" : "GRANTED");
                                            } else if (obj instanceof String) {
                                                Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                            } else {
                                                Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                            }
                                        }
                                    }
                                }
                            }
                            str8 = str5;
                            num3 = num;
                            it3 = it;
                            break;
                        case "UMP_CoMoAdUserDataPurposeConsentStatus":
                            str2 = "google_analytics_default_allow_ad_user_data";
                            str3 = "AD_USER_DATA";
                            iIntValue = ((Integer) map2.get(str9)).intValue();
                            str5 = str8;
                            if (iIntValue != -1) {
                                num = num3;
                                if (iIntValue != 1) {
                                    map3.put(str3, "GRANTED");
                                    str8 = str5;
                                    num3 = num;
                                    break;
                                } else {
                                    it = it3;
                                    if (iIntValue != 2) {
                                        map3.put(str3, "DENIED");
                                    } else if (iIntValue != 4) {
                                        if (iIntValue != 5) {
                                            d5.u.o(iIntValue, "Invalid CoMo consent status: ", "UserMessagingPlatform");
                                        } else {
                                            if (atomicReference2.get() != null) {
                                                obj = null;
                                            } else if (obj2 instanceof Boolean) {
                                                obj = (Boolean) obj2;
                                            } else if (obj2 instanceof String) {
                                                obj = (String) obj2;
                                            } else {
                                                obj = null;
                                            }
                                            if (obj == null) {
                                                Log.w("UserMessagingPlatform", "No default metadata");
                                            } else if (obj instanceof Boolean) {
                                                map3.put(str3, true != ((Boolean) obj).booleanValue() ? "DENIED" : "GRANTED");
                                            } else if (obj instanceof String) {
                                                Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                            } else {
                                                Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                            }
                                        }
                                    }
                                }
                            }
                            str8 = str5;
                            num3 = num;
                            it3 = it;
                            break;
                        default:
                            str5 = str8;
                            num = num3;
                            it = it3;
                            str8 = str5;
                            num3 = num;
                            it3 = it;
                            break;
                    }
                }
            }
            Log.d("UserMessagingPlatform", "Update Firebase: ".concat(map3.toString()));
            HashMap map4 = new HashMap();
            for (String str10 : map3.keySet()) {
                try {
                    try {
                        map4.put((Enum) ((Method) atomicReference3.get()).invoke(null, str10), (Enum) ((Method) atomicReference4.get()).invoke(null, map3.get(str10)));
                    } catch (Exception e12) {
                        e = e12;
                        Log.w("UserMessagingPlatform", "Failed to invoke the Firebase static method.", e);
                    }
                } catch (Exception e13) {
                    e = e13;
                }
            }
            if (atomicReference5.get() != null && !map4.isEmpty()) {
                try {
                    ((Method) atomicReference5.get()).invoke(atomicReference6.get(), map4);
                } catch (Exception e14) {
                    Log.w("UserMessagingPlatform", "Failed to invoke Firebase method. ", e14);
                }
            }
        }
        map2.clear();
        return true;
    }

    @Override // rl.l
    public void b0(yl.b bVar, yl.f fVar) {
        ((ArrayList) this.f54879b).add(new dm.i(bVar, fVar));
    }

    @Override // ze.e
    public byte[] c(byte[] bArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr2 = new byte[12];
        System.arraycopy(bArr, 0, bArr2, 0, 12);
        int length = bArr.length - 12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 12, bArr3, 0, length);
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr2);
        Cipher cipher = (Cipher) this.f54880c;
        cipher.init(2, (SecretKeySpec) this.f54882e, gCMParameterSpec);
        return cipher.doFinal(bArr3);
    }

    @Override // ze.e
    public void d(Context context) {
        context.getSharedPreferences((String) this.f54879b, 0).edit().remove("BVGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK").apply();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:84:0x024c  */
    @Override // k3.m
    public void e(byte[] bArr, int i10, int i11, k3.l lVar, l1.g gVar) {
        k1.b bVar;
        n1 n1VarB;
        boolean z10;
        Rect rect;
        l1.q qVar = (l1.q) this.f54879b;
        qVar.K(bArr, i10 + i11);
        qVar.M(i10);
        l1.q qVar2 = (l1.q) this.f54880c;
        s3.a aVar = (s3.a) this.f54881d;
        if (((Inflater) this.f54882e) == null) {
            this.f54882e = new Inflater();
        }
        if (l1.y.L(qVar, qVar2, (Inflater) this.f54882e)) {
            qVar.K(qVar2.f44813a, qVar2.f44815c);
        }
        aVar.f50092c = false;
        aVar.f50096g = null;
        aVar.f50097h = -1;
        aVar.f50098i = -1;
        int iA = qVar.a();
        if (iA < 2 || qVar.G() != iA) {
            bVar = null;
        } else {
            if (aVar.f50093d == null) {
                l1.a.s("VobsubParser", "Skipping SPU (no palette)");
            } else if (aVar.f50091b) {
                int i12 = qVar.f44814b - 2;
                qVar.M(qVar.G() + i12);
                do {
                    int i13 = 4;
                    if (qVar.a() < 4) {
                        z10 = false;
                    } else {
                        int i14 = qVar.f44814b;
                        qVar.N(2);
                        int iG = qVar.G() + i12;
                        z10 = iG != i14 && iG < qVar.f44815c;
                        int i15 = z10 ? iG : qVar.f44815c;
                        boolean z11 = true;
                        while (qVar.f44814b < i15 && z11) {
                            int[] iArr = aVar.f50090a;
                            int iZ = qVar.z();
                            if (iZ != 255) {
                                switch (iZ) {
                                    case 0:
                                    case 1:
                                    case 2:
                                        z11 = true;
                                        break;
                                    case 3:
                                        if (qVar.a() >= 2) {
                                            int iZ2 = qVar.z();
                                            int iZ3 = qVar.z();
                                            iArr[3] = s3.a.a(iZ2 >> 4, aVar.f50093d);
                                            iArr[2] = s3.a.a(iZ2 & 15, aVar.f50093d);
                                            iArr[1] = s3.a.a(iZ3 >> 4, aVar.f50093d);
                                            iArr[0] = s3.a.a(iZ3 & 15, aVar.f50093d);
                                            aVar.f50092c = true;
                                            z11 = true;
                                        } else {
                                            l1.a.s("VobsubParser", "Incomplete color command");
                                            z11 = false;
                                        }
                                        break;
                                    case 4:
                                        if (qVar.a() < 2) {
                                            l1.a.s("VobsubParser", "Incomplete alpha command");
                                        } else if (aVar.f50092c) {
                                            int iZ4 = qVar.z();
                                            int iZ5 = qVar.z();
                                            iArr[3] = s3.a.c(iArr[3], iZ4 >> 4);
                                            iArr[2] = s3.a.c(iArr[2], iZ4 & 15);
                                            iArr[1] = s3.a.c(iArr[1], iZ5 >> 4);
                                            iArr[0] = s3.a.c(iArr[0], iZ5 & 15);
                                            z11 = true;
                                        } else {
                                            l1.a.s("VobsubParser", "Ignoring alpha command before color command");
                                        }
                                        z11 = false;
                                        break;
                                    case 5:
                                        if (qVar.a() >= 6) {
                                            int iZ6 = qVar.z();
                                            int iZ7 = qVar.z();
                                            int i16 = (iZ6 << i13) | (iZ7 >> 4);
                                            int iZ8 = ((iZ7 & 15) << 8) | qVar.z();
                                            int iZ9 = qVar.z();
                                            int iZ10 = qVar.z();
                                            aVar.f50096g = new Rect(i16, (iZ9 << i13) | (iZ10 >> 4), iZ8 + 1, (((iZ10 & 15) << 8) | qVar.z()) + 1);
                                            z11 = true;
                                        } else {
                                            l1.a.s("VobsubParser", "Incomplete area command");
                                            z11 = false;
                                        }
                                        break;
                                    case 6:
                                        if (qVar.a() >= i13) {
                                            aVar.f50097h = qVar.G();
                                            aVar.f50098i = qVar.G();
                                            z11 = true;
                                        } else {
                                            l1.a.s("VobsubParser", "Incomplete offsets command");
                                            z11 = false;
                                        }
                                        break;
                                    default:
                                        d5.u.v(iZ, "Unrecognized command: ", "VobsubParser");
                                        z11 = false;
                                        break;
                                }
                            } else {
                                z11 = false;
                            }
                            i13 = 4;
                        }
                        if (z10) {
                            qVar.M(iG);
                        }
                    }
                } while (z10);
            } else {
                l1.a.s("VobsubParser", "Skipping SPU (no plane)");
            }
            if (aVar.f50093d == null || !aVar.f50091b || !aVar.f50092c || (rect = aVar.f50096g) == null || aVar.f50097h == -1 || aVar.f50098i == -1 || rect.width() < 2 || aVar.f50096g.height() < 2) {
                bVar = null;
            } else {
                Rect rect2 = aVar.f50096g;
                int[] iArr2 = new int[rect2.height() * rect2.width()];
                xd1 xd1Var = new xd1();
                qVar.M(aVar.f50097h);
                xd1Var.o(qVar);
                aVar.b(xd1Var, true, rect2, iArr2);
                qVar.M(aVar.f50098i);
                xd1Var.o(qVar);
                aVar.b(xd1Var, false, rect2, iArr2);
                bVar = new k1.b(null, null, null, Bitmap.createBitmap(iArr2, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / aVar.f50095f, 0, 0, rect2.left / aVar.f50094e, 0, Integer.MIN_VALUE, -3.4028235E38f, rect2.width() / aVar.f50094e, rect2.height() / aVar.f50095f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
            }
        }
        if (bVar != null) {
            n1VarB = oa.j0.B(bVar);
        } else {
            oa.f0 f0Var = oa.j0.f47265b;
            n1VarB = n1.f47281e;
        }
        gVar.accept(new k3.a(n1VarB, C.TIME_UNSET, 5000000L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ye.g
    public void f(BiometricPrompt.AuthenticationResult authenticationResult) {
        Log.i("FlutterSecureStorage", "Data migration completed successfully!");
        ye.d.y((v6.c) this.f54880c);
        ((ye.g) this.f54881d).f(null);
    }

    @Override // vj.a
    public Object get() {
        switch (this.f54878a) {
            case 18:
                return new ud.o((mb.g) ((rb.c) this.f54879b).f49529b, (xd.j) ((wd.c) this.f54880c).get(), (ak.k) ((wd.c) this.f54881d).get(), (w0) ((wd.c) this.f54882e).get());
            default:
                return new k5.g((Executor) ((vj.a) this.f54879b).get(), (y8.d) ((vj.a) this.f54880c).get(), (r1.s) ((qd.i) this.f54881d).get(), (z8.c) ((vj.a) this.f54882e).get());
        }
    }

    @Override // ye.g
    public void h(Exception exc) {
        ye.g gVar = (ye.g) this.f54881d;
        v6.c cVar = (v6.c) this.f54880c;
        Log.e("FlutterSecureStorage", "Data migration failed: " + exc.getMessage(), exc);
        ye.d dVar = (ye.d) this.f54882e;
        if (!dVar.f54372a.f54380d) {
            Log.e("FlutterSecureStorage", "Set resetOnError=true to automatically delete data after migration failure.");
            gVar.h(new Exception(defpackage.e.o("Migration failed after algorithm change (", (String) this.f54879b, "). Enable resetOnError=true or call deleteAll()."), exc));
        } else {
            Log.w("FlutterSecureStorage", "resetOnError is enabled. Deleting all data as fallback...");
            dVar.d(cVar, gVar);
            ye.d.y(cVar);
        }
    }

    @Override // k3.m
    public int i() {
        return 2;
    }

    @Override // lm.e
    public lm.d j(yl.b classId) {
        kotlin.jvm.internal.n.f(classId, "classId");
        tl.j jVar = (tl.j) ((LinkedHashMap) this.f54882e).get(classId);
        if (jVar == null) {
            return null;
        }
        v6.c cVar = (v6.c) this.f54879b;
        ul.a aVar = (ul.a) this.f54880c;
        ((lm.a0) this.f54881d).invoke(classId);
        return new lm.d(cVar, jVar, aVar, zk.j0.C9);
    }

    @Override // rl.l
    public void j0(Object obj) {
        ((ArrayList) this.f54879b).add(com.google.android.gms.internal.consent_sdk.x.a((com.google.android.gms.internal.consent_sdk.x) this.f54880c, (yl.f) this.f54881d, obj));
    }

    @Override // rl.l
    public void k() {
        switch (this.f54878a) {
            case 14:
                ArrayList arrayList = (ArrayList) this.f54880c;
                if (!arrayList.isEmpty()) {
                    ((HashMap) ((s1) this.f54881d).f45752c).put((rl.o) this.f54879b, arrayList);
                }
                break;
            default:
                fc.f fVar = (fc.f) this.f54882e;
                yl.f fVar2 = (yl.f) this.f54881d;
                ArrayList elements = (ArrayList) this.f54879b;
                fVar.getClass();
                kotlin.jvm.internal.n.f(elements, "elements");
                if (fVar2 != null) {
                    x0 x0VarR = go.c.r(fVar2, (zk.e) fVar.f40783e);
                    if (x0VarR != null) {
                        HashMap map = (HashMap) fVar.f40781c;
                        List listD = ym.l.d(elements);
                        pm.y type = x0VarR.getType();
                        kotlin.jvm.internal.n.e(type, "parameter.type");
                        map.put(fVar2, new dm.x(listD, type));
                        break;
                    } else if (((com.google.android.gms.internal.consent_sdk.x) fVar.f40782d).n((yl.b) fVar.f40784f) && kotlin.jvm.internal.n.a(fVar2.b(), X3.i.X)) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : elements) {
                            if (obj instanceof dm.a) {
                                arrayList2.add(obj);
                            }
                        }
                        List list = (List) fVar.f40785g;
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            list.add((al.c) ((dm.a) it.next()).f38953a);
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // rl.m
    public rl.k l(yl.b bVar, el.a aVar) {
        return ((com.google.android.gms.internal.consent_sdk.x) ((s1) this.f54881d).f45751b).q(bVar, aVar, (ArrayList) this.f54880c);
    }

    public wa.l m() throws GeneralSecurityException {
        Integer num = (Integer) this.f54879b;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.f54880c) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((wa.h) this.f54882e) == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (((Integer) this.f54881d) != null) {
            return new wa.l(num.intValue(), ((Integer) this.f54880c).intValue(), ((Integer) this.f54881d).intValue(), (wa.h) this.f54882e);
        }
        throw new GeneralSecurityException("Tag size is not set");
    }

    @Override // d9.d
    public Object n(IBinder iBinder) throws IOException {
        o0 sVar;
        Account account = (Account) this.f54880c;
        String str = (String) this.f54879b;
        Bundle bundle = (Bundle) this.f54881d;
        Context context = (Context) this.f54882e;
        int i10 = com.google.android.gms.internal.auth.g0.f22823b;
        if (iBinder == null) {
            sVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            sVar = iInterfaceQueryLocalInterface instanceof o0 ? (o0) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.auth.s(iBinder, "com.google.android.auth.IAuthManagerService", 0);
        }
        com.google.android.gms.internal.auth.s sVar2 = (com.google.android.gms.internal.auth.s) sVar;
        sVar2.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(sVar2.f22790c);
        com.google.android.gms.internal.auth.f.b(parcelObtain, account);
        parcelObtain.writeString(str);
        com.google.android.gms.internal.auth.f.b(parcelObtain, bundle);
        Parcel parcelV1 = sVar2.v1(parcelObtain, 5);
        Bundle bundle2 = (Bundle) com.google.android.gms.internal.auth.f.a(parcelV1, Bundle.CREATOR);
        parcelV1.recycle();
        if (bundle2 != null) {
            return d9.a.c(context, bundle2);
        }
        throw new IOException("Service call returned null");
    }

    public void o(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        z();
    }

    public void p(bo.f fVar) {
        fVar.f5782b.decrementAndGet();
        o((ArrayDeque) this.f54880c, fVar);
    }

    public n.e q(n.a aVar) {
        ArrayList arrayList = (ArrayList) this.f54881d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            n.e eVar = (n.e) arrayList.get(i10);
            if (eVar != null && eVar.f46280b == aVar) {
                return eVar;
            }
        }
        n.e eVar2 = new n.e((Context) this.f54880c, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public zk.e r(yl.b classId, List list) {
        kotlin.jvm.internal.n.f(classId, "classId");
        return (zk.e) ((om.e) this.f54882e).invoke(new zk.y(classId, list));
    }

    @Override // rl.l
    public rl.k s(yl.b bVar) {
        ArrayList arrayList = new ArrayList();
        fc.f fVarP = ((com.google.android.gms.internal.consent_sdk.x) this.f54880c).p(bVar, zk.j0.C9, arrayList);
        k5.g gVar = new k5.g();
        gVar.f44326b = fVarP;
        gVar.f44327c = this;
        gVar.f44328d = arrayList;
        gVar.f44325a = fVarP;
        return gVar;
    }

    public boolean u(Context context) {
        if (((Boolean) this.f54881d) == null) {
            this.f54881d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f54880c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f54881d).booleanValue();
    }

    public boolean v(Context context) {
        if (((Boolean) this.f54880c) == null) {
            this.f54880c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f54880c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f54880c).booleanValue();
    }

    public boolean w(nm.s sVar) {
        if (((nm.s) this.f54880c).equals(sVar)) {
            return true;
        }
        u uVar = (u) this.f54879b;
        return uVar != null ? uVar.w(sVar) : false;
    }

    public boolean x(n.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f54879b).onActionItemClicked(q(aVar), new o.t((Context) this.f54880c, (h0.a) menuItem));
    }

    public boolean y(n.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f54879b;
        n.e eVarQ = q(aVar);
        x.i iVar = (x.i) this.f54882e;
        Menu b0Var = (Menu) iVar.get(menu);
        if (b0Var == null) {
            b0Var = new o.b0((Context) this.f54880c, (o.m) menu);
            iVar.put(menu, b0Var);
        }
        return callback.onCreateActionMode(eVarQ, b0Var);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:24:0x0073 A[Catch: all -> 0x00a6, TryCatch #1 {all -> 0x00a6, blocks: (B:22:0x006d, B:24:0x0073, B:27:0x00a8), top: B:50:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:50:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0073, please report this as an issue */
    public void z() {
        int size;
        int i10;
        bo.f fVar;
        byte[] bArr = yn.a.f54560a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f54882e).iterator();
                kotlin.jvm.internal.n.e(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    bo.f fVar2 = (bo.f) it.next();
                    if (((ArrayDeque) this.f54880c).size() >= 64) {
                        break;
                    }
                    if (fVar2.f5782b.get() < 5) {
                        it.remove();
                        fVar2.f5782b.incrementAndGet();
                        arrayList.add(fVar2);
                        ((ArrayDeque) this.f54880c).add(fVar2);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f54880c).size();
                    ((ArrayDeque) this.f54881d).size();
                }
                size = arrayList.size();
                for (i10 = 0; i10 < size; i10++) {
                    fVar = (bo.f) arrayList.get(i10);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f54879b) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String name = yn.a.f54565f + " Dispatcher";
                                kotlin.jvm.internal.n.f(name, "name");
                                this.f54879b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new a6.a(1, name, false));
                            }
                            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f54879b;
                            kotlin.jvm.internal.n.c(threadPoolExecutor);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    fVar.getClass();
                    bo.i iVar = fVar.f5783c;
                    byte[] bArr2 = yn.a.f54560a;
                    try {
                        try {
                            threadPoolExecutor.execute(fVar);
                        } catch (Throwable th3) {
                            iVar.f5786a.f54027a.p(fVar);
                            throw th3;
                        }
                    } catch (RejectedExecutionException e10) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e10);
                        iVar.k(interruptedIOException);
                        fVar.f5781a.onFailure(iVar, interruptedIOException);
                        iVar.f5786a.f54027a.p(fVar);
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        size = arrayList.size();
        while (i10 < size) {
            fVar = (bo.f) arrayList.get(i10);
            synchronized (this) {
                if (((ThreadPoolExecutor) this.f54879b) == null) {
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    SynchronousQueue synchronousQueue2 = new SynchronousQueue();
                    String name2 = yn.a.f54565f + " Dispatcher";
                    kotlin.jvm.internal.n.f(name2, "name");
                    this.f54879b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit2, synchronousQueue2, new a6.a(1, name2, false));
                }
                ThreadPoolExecutor threadPoolExecutor2 = (ThreadPoolExecutor) this.f54879b;
                kotlin.jvm.internal.n.c(threadPoolExecutor2);
                fVar.getClass();
                bo.i iVar2 = fVar.f5783c;
                byte[] bArr3 = yn.a.f54560a;
                threadPoolExecutor2.execute(fVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.i0
    public Executor zza() {
        return (Executor) this.f54882e;
    }

    @Override // com.google.android.gms.internal.consent_sdk.l7
    public /* bridge */ /* synthetic */ Object zzb() {
        return new b3((com.google.android.gms.internal.consent_sdk.h) ((j7) this.f54879b).zzb(), ((j30) this.f54880c).zzb(), (com.google.android.gms.internal.consent_sdk.q) ((j7) this.f54881d).zzb(), (com.google.android.gms.internal.consent_sdk.c0) ((j7) this.f54882e).zzb());
    }

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f54878a = i10;
        this.f54879b = obj;
        this.f54880c = obj2;
        this.f54882e = obj4;
        this.f54881d = obj3;
    }

    public u(wf.e eVar, wf.f fVar) {
        this.f54878a = 20;
        ec.a aVar = new ec.a("Tracks");
        this.f54879b = aVar;
        vf.c cVar = vf.c.AUDIO;
        wj.f fVarE = E(cVar, (kg.e) eVar.l(cVar), (List) fVar.o());
        MediaFormat mediaFormat = (MediaFormat) fVarE.f53283a;
        vf.b bVar = (vf.b) fVarE.f53284b;
        vf.c cVar2 = vf.c.VIDEO;
        wj.f fVarE2 = E(cVar2, (kg.e) eVar.l(cVar2), (List) fVar.j());
        MediaFormat mediaFormat2 = (MediaFormat) fVarE2.f53283a;
        vf.b bVar2 = (vf.b) fVarE2.f53284b;
        wf.e eVar2 = new wf.e(bVar2, bVar);
        this.f54880c = eVar2;
        this.f54881d = new wf.e(mediaFormat2, mediaFormat);
        aVar.a("init: videoStatus=" + bVar2 + ", resolvedVideoStatus=" + eVar2.l(cVar2) + ", videoFormat=" + mediaFormat2);
        aVar.a("init: audioStatus=" + bVar + ", resolvedAudioStatus=" + eVar2.l(cVar) + ", audioFormat=" + mediaFormat);
        Object objL = eVar2.l(cVar2);
        objL = ((vf.b) objL).d() ? objL : null;
        Object objL2 = eVar2.l(cVar);
        this.f54882e = new wf.e(objL, ((vf.b) objL2).d() ? objL2 : null);
    }

    public u(om.l lVar, zk.w module) {
        this.f54878a = 26;
        kotlin.jvm.internal.n.f(module, "module");
        this.f54879b = lVar;
        this.f54880c = module;
        this.f54881d = lVar.b(new zk.a0(this, 1));
        this.f54882e = lVar.b(new zk.a0(this, 0));
    }

    public u(tl.e0 e0Var, v6.c cVar, ul.a aVar, lm.a0 a0Var) {
        this.f54878a = 8;
        this.f54879b = cVar;
        this.f54880c = aVar;
        this.f54881d = a0Var;
        List list = e0Var.f51205g;
        kotlin.jvm.internal.n.e(list, "proto.class_List");
        List list2 = list;
        int iO = xj.b0.O(xj.p.W(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO < 16 ? 16 : iO);
        for (Object obj : list2) {
            linkedHashMap.put(com.bumptech.glide.c.r((v6.c) this.f54879b, ((tl.j) obj).f51297e), obj);
        }
        this.f54882e = linkedHashMap;
    }

    public u(Context context, Cipher cipher, ye.e eVar) throws BadPaddingException, IllegalBlockSizeException {
        SecretKeySpec secretKeySpec;
        this.f54878a = 25;
        String strB = eVar.b();
        this.f54879b = strB;
        SecureRandom secureRandom = new SecureRandom();
        this.f54881d = secureRandom;
        cipher = cipher == null ? Cipher.getInstance("AES/GCM/NoPadding") : cipher;
        SharedPreferences sharedPreferences = context.getSharedPreferences(strB, 0);
        String string = sharedPreferences.getString("BVGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK", null);
        if (string != null) {
            secretKeySpec = new SecretKeySpec(cipher.doFinal(Base64.decode(string, 0)), "AES");
        } else {
            byte[] bArr = new byte[32];
            secureRandom.nextBytes(bArr);
            SecretKeySpec secretKeySpec2 = new SecretKeySpec(bArr, "AES");
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("BVGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK", Base64.encodeToString(bArrDoFinal, 0));
            editorEdit.apply();
            secretKeySpec = secretKeySpec2;
        }
        this.f54882e = secretKeySpec;
        this.f54880c = Cipher.getInstance("AES/GCM/NoPadding");
    }

    public u(cn.a0 a0Var, al.f fVar, b4.c cVar) {
        this.f54878a = 16;
        this.f54879b = a0Var;
        this.f54880c = cVar;
        this.f54881d = r9.b.a(Integer.MAX_VALUE, 6, null);
        this.f54882e = new na.g(10);
        f1 f1Var = (f1) a0Var.getCoroutineContext().get(e1.f6705a);
        if (f1Var != null) {
            f1Var.n(new a4.b(8, fVar, this));
        }
    }

    public u(WorkDatabase_Impl workDatabase_Impl) {
        this.f54878a = 9;
        this.f54879b = workDatabase_Impl;
        this.f54880c = new m5.b(workDatabase_Impl, 4);
        this.f54881d = new m5.e(workDatabase_Impl, 1);
        this.f54882e = new m5.e(workDatabase_Impl, 2);
    }

    public u(eb.i0 i0Var) {
        this.f54878a = 4;
        this.f54879b = new HashMap(i0Var.f39990a);
        this.f54880c = new HashMap(i0Var.f39991b);
        this.f54881d = new HashMap(i0Var.f39992c);
        this.f54882e = new HashMap(i0Var.f39993d);
    }

    public u(List list) {
        int i10;
        this.f54878a = 17;
        this.f54879b = new l1.q();
        this.f54880c = new l1.q();
        s3.a aVar = new s3.a();
        this.f54881d = aVar;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = l1.y.f44830a;
        for (String str2 : strTrim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] strArrSplit = str2.substring(9).split(",", -1);
                aVar.f50093d = new int[strArrSplit.length];
                for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                    int[] iArr = aVar.f50093d;
                    try {
                        i10 = Integer.parseInt(strArrSplit[i11].trim(), 16);
                    } catch (RuntimeException e10) {
                        l1.a.t("VobsubParser", "Parsing color failed", e10);
                        i10 = 0;
                    }
                    iArr[i11] = i10;
                }
            } else if (str2.startsWith("size: ")) {
                String[] strArrSplit2 = str2.substring(6).trim().split("x", -1);
                if (strArrSplit2.length != 2) {
                    l1.a.s("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        aVar.f50094e = Integer.parseInt(strArrSplit2[0]);
                        aVar.f50095f = Integer.parseInt(strArrSplit2[1]);
                        aVar.f50091b = true;
                    } catch (RuntimeException e11) {
                        l1.a.t("VobsubParser", "Parsing IDX failed", e11);
                    }
                }
            }
        }
    }

    public u(Typeface typeface, y0.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.f54878a = 21;
        this.f54882e = typeface;
        this.f54879b = bVar;
        this.f54881d = new x0.n(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i14 = iA + bVar.f45717a;
            i10 = ((ByteBuffer) bVar.f45720d).getInt(((ByteBuffer) bVar.f45720d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        this.f54880c = new char[i10 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i15 = iA2 + bVar.f45717a;
            i11 = ((ByteBuffer) bVar.f45720d).getInt(((ByteBuffer) bVar.f45720d).getInt(i15) + i15);
        } else {
            i11 = 0;
        }
        for (int i16 = 0; i16 < i11; i16++) {
            x0.q qVar = new x0.q(this, i16);
            y0.a aVarB = qVar.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarB.f45720d).getInt(iA3 + aVarB.f45717a) : 0, (char[]) this.f54880c, i16 * 2);
            y0.a aVarB2 = qVar.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i17 = iA4 + aVarB2.f45717a;
                i12 = ((ByteBuffer) aVarB2.f45720d).getInt(((ByteBuffer) aVarB2.f45720d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            if (i12 > 0) {
                x0.n nVar = (x0.n) this.f54881d;
                y0.a aVarB3 = qVar.b();
                int iA5 = aVarB3.a(16);
                if (iA5 != 0) {
                    int i18 = iA5 + aVarB3.f45717a;
                    i13 = ((ByteBuffer) aVarB3.f45720d).getInt(((ByteBuffer) aVarB3.f45720d).getInt(i18) + i18);
                } else {
                    i13 = 0;
                }
                nVar.a(qVar, 0, i13 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public u(Context context) {
        this.f54878a = 13;
        this.f54879b = context != null ? context.getApplicationContext() : null;
        this.f54881d = r1.b0.f49255a;
        if (context == null) {
            this.f54882e = r1.b.f49250c;
        }
    }

    public u(s1 s1Var, rl.o oVar) {
        this.f54878a = 14;
        this.f54882e = s1Var;
        this.f54878a = 14;
        this.f54881d = s1Var;
        this.f54879b = oVar;
        this.f54880c = new ArrayList();
    }

    public u(int i10) {
        this.f54878a = i10;
        switch (i10) {
            case 4:
                this.f54879b = new HashMap();
                this.f54880c = new HashMap();
                this.f54881d = new HashMap();
                this.f54882e = new HashMap();
                break;
            case 19:
                break;
            case 23:
                this.f54882e = new ArrayDeque();
                this.f54880c = new ArrayDeque();
                this.f54881d = new ArrayDeque();
                break;
            default:
                this.f54879b = null;
                this.f54880c = null;
                this.f54881d = null;
                this.f54882e = new ArrayDeque();
                break;
        }
    }

    public u(Context context, ActionMode.Callback callback) {
        this.f54878a = 10;
        this.f54880c = context;
        this.f54879b = callback;
        this.f54881d = new ArrayList();
        this.f54882e = new x.i(0);
    }

    public u(com.google.android.gms.internal.consent_sdk.x xVar, yl.f fVar, fc.f fVar2) {
        this.f54878a = 15;
        this.f54880c = xVar;
        this.f54881d = fVar;
        this.f54882e = fVar2;
        this.f54879b = new ArrayList();
    }

    public u(nm.h hVar) {
        this.f54878a = 11;
        this.f54882e = hVar;
        List list = hVar.f46815e.f51311t;
        kotlin.jvm.internal.n.e(list, "classProto.enumEntryList");
        List list2 = list;
        int iO = xj.b0.O(xj.p.W(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO < 16 ? 16 : iO);
        for (Object obj : list2) {
            linkedHashMap.put(com.bumptech.glide.c.s((vl.f) hVar.l.f22982b, ((tl.t) obj).f51467d), obj);
        }
        this.f54879b = linkedHashMap;
        nm.h hVar2 = (nm.h) this.f54882e;
        this.f54880c = ((lm.i) hVar2.l.f22981a).f45537a.c(new a4.b(4, this, hVar2));
        om.l lVar = ((lm.i) ((nm.h) this.f54882e).l.f22981a).f45537a;
        al.l lVar2 = new al.l(this, 15);
        lVar.getClass();
        this.f54881d = new om.i(lVar, lVar2);
    }

    public u(ye.d dVar, v6.c cVar, ye.g gVar, String str) {
        this.f54878a = 24;
        this.f54882e = dVar;
        this.f54880c = cVar;
        this.f54881d = gVar;
        this.f54879b = str;
    }

    public u(k1 k1Var, boolean[] zArr) {
        this.f54878a = 5;
        this.f54879b = k1Var;
        this.f54880c = zArr;
        int i10 = k1Var.f40386a;
        this.f54881d = new boolean[i10];
        this.f54882e = new boolean[i10];
    }
}
