package n5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.view.autofill.AutofillValue;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.work.impl.WorkDatabase;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.google.android.gms.internal.ads.n3;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.mbridge.msdk.foundation.download.Command;
import d5.u;
import ea.f1;
import ea.m1;
import ea.s0;
import ea.x1;
import i1.e0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k.v;
import k6.c0;
import k6.d0;
import l1.y;
import lj.l0;
import lj.n0;
import o.x;
import oa.b0;
import oa.j0;
import oa.k0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import zc.t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements j2.p, vj.a, f4.c, b7.a, x, k6.s, k6.a, c0, kb.h, PurchasesUpdatedListener, com.google.android.gms.common.api.internal.k, n6.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static f f46521c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f46523b;

    public f(bo.e eVar, com.google.android.gms.common.api.internal.i iVar) {
        this.f46522a = 4;
        this.f46523b = eVar;
    }

    public static f p() {
        if (f46521c == null) {
            f46521c = new f(13);
        }
        return f46521c;
    }

    public static ArrayList r(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object objS = jSONArray.get(i10);
            if (objS instanceof JSONArray) {
                objS = r((JSONArray) objS);
            } else if (objS instanceof JSONObject) {
                objS = s((JSONObject) objS);
            }
            arrayList.add(objS);
        }
        return arrayList;
    }

    public static HashMap s(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objS = jSONObject.get(next);
            if (objS instanceof JSONArray) {
                objS = r((JSONArray) objS);
            } else if (objS instanceof JSONObject) {
                objS = s((JSONObject) objS);
            }
            map.put(next, objS);
        }
        return map;
    }

    public void A(t tVar) {
        q().edit().putString(tVar.h(), new JSONObject(android.support.v4.media.session.a.G(tVar)).toString()).apply();
        StringBuilder sbI = u.i(q().getString("notification_ids", ""));
        sbI.append(tVar.h());
        sbI.append(",");
        String string = sbI.toString();
        ArrayList arrayList = new ArrayList(Arrays.asList(string.split(",")));
        if (arrayList.size() > 100) {
            String str = (String) arrayList.get(0);
            q().edit().remove(str).apply();
            string = string.replace(str + ",", "");
        }
        q().edit().putString("notification_ids", string).apply();
    }

    public void B(int i10, String str, List list, boolean z10, boolean z11) {
        bo.b bVar;
        f1 f1Var = (f1) this.f46523b;
        int i11 = i10 - 1;
        if (i11 == 0) {
            s0 s0Var = ((m1) f1Var.f3623a).f39587f;
            m1.h(s0Var);
            bVar = s0Var.f39759m;
        } else if (i11 != 1) {
            if (i11 == 3) {
                s0 s0Var2 = ((m1) f1Var.f3623a).f39587f;
                m1.h(s0Var2);
                bVar = s0Var2.f39760n;
            } else if (i11 != 4) {
                s0 s0Var3 = ((m1) f1Var.f3623a).f39587f;
                m1.h(s0Var3);
                bVar = s0Var3.l;
            } else if (z10) {
                s0 s0Var4 = ((m1) f1Var.f3623a).f39587f;
                m1.h(s0Var4);
                bVar = s0Var4.f39757j;
            } else if (z11) {
                s0 s0Var5 = ((m1) f1Var.f3623a).f39587f;
                m1.h(s0Var5);
                bVar = s0Var5.f39756i;
            } else {
                s0 s0Var6 = ((m1) f1Var.f3623a).f39587f;
                m1.h(s0Var6);
                bVar = s0Var6.f39758k;
            }
        } else if (z10) {
            s0 s0Var7 = ((m1) f1Var.f3623a).f39587f;
            m1.h(s0Var7);
            bVar = s0Var7.f39754g;
        } else if (z11) {
            s0 s0Var8 = ((m1) f1Var.f3623a).f39587f;
            m1.h(s0Var8);
            bVar = s0Var8.f39753f;
        } else {
            s0 s0Var9 = ((m1) f1Var.f3623a).f39587f;
            m1.h(s0Var9);
            bVar = s0Var9.f39755h;
        }
        int size = list.size();
        if (size == 1) {
            bVar.c(list.get(0), str);
            return;
        }
        if (size == 2) {
            bVar.d(str, list.get(0), list.get(1));
        } else if (size != 3) {
            bVar.b(str);
        } else {
            bVar.e(str, list.get(0), list.get(1), list.get(2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public void C(x1 x1Var, int i10) {
        ea.h hVar;
        if (i10 == -30) {
            hVar = ea.h.TCF;
        } else if (i10 == -20) {
            hVar = ea.h.API;
        } else if (i10 == -10) {
            hVar = ea.h.MANIFEST;
        } else if (i10 != 0) {
            hVar = i10 != 30 ? ea.h.UNSET : ea.h.INITIALIZATION;
        } else {
            hVar = ea.h.API;
        }
        ((EnumMap) this.f46523b).put(x1Var, hVar);
    }

    public void D(x1 x1Var, ea.h hVar) {
        ((EnumMap) this.f46523b).put(x1Var, hVar);
    }

    @Override // k6.s
    public k6.r M(k6.x xVar) {
        switch (this.f46522a) {
            case 20:
                return new k6.b(0, (AssetManager) this.f46523b, this);
            case 21:
            default:
                return new l6.a((s4.i) this.f46523b);
            case 22:
                return new d0(this);
        }
    }

    public void a(String str, String str2) {
        k0 k0Var = (k0) this.f46523b;
        String strA = b2.r.a(str.trim());
        String strTrim = str2.trim();
        k0Var.getClass();
        oa.q.c(strA, strTrim);
        oa.u uVarD = (oa.u) k0Var.f47269b;
        if (uVarD == null) {
            uVarD = oa.u.d();
            k0Var.f47269b = uVarD;
        }
        b0 b0VarV = (b0) uVarD.get(strA);
        if (b0VarV == null) {
            b0VarV = j0.v(4);
            oa.u uVarD2 = (oa.u) k0Var.f47269b;
            if (uVarD2 == null) {
                uVarD2 = oa.u.d();
                k0Var.f47269b = uVarD2;
            }
            uVarD2.put(strA, b0VarV);
        }
        b0VarV.a(strTrim);
    }

    @Override // com.google.android.gms.common.api.internal.k
    public void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        m9.b bVar = (m9.b) ((m9.a) obj).getService();
        k9.r rVar = (k9.r) this.f46523b;
        bVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(bVar.f22790c);
        int i10 = x9.a.f53673a;
        parcelObtain.writeInt(1);
        rVar.writeToParcel(parcelObtain, 0);
        try {
            bVar.f22789b.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // o.x
    public void b(o.m mVar, boolean z10) {
        ((v) this.f46523b).p(mVar);
    }

    @Override // n6.h
    public int c() {
        return i() | (i() << 8);
    }

    @Override // k6.c0
    public com.bumptech.glide.load.data.e d(Uri uri) {
        return new com.bumptech.glide.load.data.a((ContentResolver) this.f46523b, uri, 1);
    }

    @Override // b7.a
    public Object e() {
        fc.f fVar = (fc.f) this.f46523b;
        return new g6.q((j6.e) fVar.f40780b, (j6.e) fVar.f40781c, (j6.e) fVar.f40782d, (j6.e) fVar.f40783e, (g6.m) fVar.f40784f, (g6.m) fVar.f40785g, (v9.e) fVar.f40786h);
    }

    @Override // f4.c
    public void f() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // f4.c
    public void g(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f46523b).setResultCode(i10);
    }

    @Override // vj.a
    public Object get() {
        tc.b bVar = (tc.b) ((k5.g) this.f46523b).f44327c;
        com.bumptech.glide.d.j(bVar);
        return bVar;
    }

    @Override // n6.h
    public int h(int i10, byte[] bArr) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f46523b;
        int iMin = Math.min(i10, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // n6.h
    public short i() throws n6.g {
        ByteBuffer byteBuffer = (ByteBuffer) this.f46523b;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new n6.g();
    }

    @Override // j2.p
    public Object j(Uri uri, n1.j jVar) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = ((XmlPullParserFactory) this.f46523b).newPullParser();
            xmlPullParserNewPullParser.setInput(jVar, null);
            return (e2.c) new e2.g(uri.toString()).h(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e10) {
            if (e10.getDetail() instanceof IOException) {
                throw ((IOException) e10.getDetail());
            }
            throw e0.b(null, e10);
        }
    }

    @Override // k6.a
    public com.bumptech.glide.load.data.e k(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.k(assetManager, str, 0);
    }

    @Override // kb.h
    public Object l(String str) throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 3; i10++) {
            Provider provider = Security.getProvider(strArr[i10]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return ((kb.j) this.f46523b).c(str, (Provider) it.next());
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    public void m(n2.g gVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f46523b;
        long[] jArr = gVar.f46461e;
        if (jArr.length <= 0 || linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        linkedHashMap.put(Long.valueOf(gVar.f46461e[0]), gVar);
    }

    public void n(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String str2 = y.f44830a;
            String[] strArrSplit = str.split(":\\s?", 2);
            if (strArrSplit.length == 2) {
                a(strArrSplit[0], strArrSplit[1]);
            }
        }
    }

    public HashMap o(String str) {
        String string = q().getString(str, null);
        if (string != null) {
            try {
                HashMap map = new HashMap(1);
                HashMap mapS = s(new JSONObject(string));
                mapS.put("to", str);
                map.put("message", mapS);
                return map;
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(BillingResult billingResult, List list) {
        lj.d0 d0Var = new lj.d0(n0.a(billingResult), n0.b(list));
        lj.g gVar = (lj.g) this.f46523b;
        l0 l0Var = new l0(new bh.a(15), 0);
        gVar.getClass();
        String strN = defpackage.e.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseCallbackApi.onPurchasesUpdated", "");
        new k5.g(gVar.f45374a, strN, (xi.l) lj.g.f45373b.getValue(), (Object) null).y(j1.f.C(d0Var), new lj.f(l0Var, strN, 0));
    }

    public SharedPreferences q() {
        if (((SharedPreferences) this.f46523b) == null) {
            this.f46523b = a.a.f3311a.getSharedPreferences("io.flutter.plugins.firebase.messaging", 0);
        }
        return (SharedPreferences) this.f46523b;
    }

    @Override // n6.h
    public long skip(long j10) {
        ByteBuffer byteBuffer = (ByteBuffer) this.f46523b;
        int iMin = (int) Math.min(byteBuffer.remaining(), j10);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    public int t(int i10) {
        int i11;
        synchronized (f.class) {
            try {
                WorkDatabase workDatabase = (WorkDatabase) this.f46523b;
                workDatabase.c();
                try {
                    Long lN = workDatabase.j().n("next_job_scheduler_id");
                    i11 = 0;
                    int iIntValue = lN != null ? lN.intValue() : 0;
                    workDatabase.j().r(new m5.c("next_job_scheduler_id", iIntValue == Integer.MAX_VALUE ? 0 : iIntValue + 1));
                    workDatabase.h();
                    workDatabase.f();
                    if (iIntValue < 0 || iIntValue > i10) {
                        ((WorkDatabase) this.f46523b).j().r(new m5.c("next_job_scheduler_id", 1));
                    } else {
                        i11 = iIntValue;
                    }
                } catch (Throwable th2) {
                    workDatabase.f();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return i11;
    }

    public String toString() {
        switch (this.f46522a) {
            case 6:
                StringBuilder sb2 = new StringBuilder("1");
                for (x1 x1Var : x1.values()) {
                    ea.h hVar = (ea.h) ((EnumMap) this.f46523b).get(x1Var);
                    if (hVar == null) {
                        hVar = ea.h.UNSET;
                    }
                    sb2.append(hVar.f39449a);
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // o.x
    public boolean u(o.m mVar) {
        Window.Callback callback = ((v) this.f46523b).l.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, mVar);
        return true;
    }

    public JSONObject v() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f46523b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(zb.f.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        zb.f.b(fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                    zb.f.b(fileInputStream, "Error while closing settings cache file.");
                    return null;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            zb.f.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            zb.f.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void w(String str) {
        q().edit().remove(str).apply();
        String string = q().getString("notification_ids", "");
        if (string.isEmpty()) {
            return;
        }
        q().edit().putString("notification_ids", string.replace(str.concat(","), "")).apply();
    }

    public void x(int i10, wi.m mVar) {
        io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) this.f46523b;
        View view = jVar.f43295a;
        jVar.d();
        jVar.f43300f = mVar;
        jVar.f43299e = new n3(2, i10, false);
        jVar.f43302h.e(jVar);
        k5.g gVar = mVar.f53263j;
        jVar.f43302h = new io.flutter.plugin.editing.f(gVar != null ? (wi.o) gVar.f44327c : null, view);
        if (gVar == null) {
            jVar.f43301g = null;
        } else {
            wi.m[] mVarArr = mVar.l;
            SparseArray sparseArray = new SparseArray();
            jVar.f43301g = sparseArray;
            if (mVarArr == null) {
                sparseArray.put(((String) gVar.f44325a).hashCode(), mVar);
            } else {
                for (wi.m mVar2 : mVarArr) {
                    k5.g gVar2 = mVar2.f53263j;
                    if (gVar2 != null) {
                        String str = (String) gVar2.f44325a;
                        jVar.f43301g.put(str.hashCode(), mVar2);
                        jVar.f43297c.notifyValueChanged(view, str.hashCode(), AutofillValue.forText(((wi.o) gVar2.f44327c).f53269a));
                    }
                }
            }
        }
        jVar.f43303i = true;
        if (jVar.f43299e.f17624a == 3) {
            jVar.f43309p = false;
        }
        jVar.f43306m = null;
        jVar.f43302h.a(jVar);
    }

    public void y(double d10, double d11, double[] dArr) {
        io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) this.f46523b;
        double[] dArr2 = new double[4];
        boolean z10 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d12 = dArr[12];
        double d13 = dArr[15];
        double d14 = d12 / d13;
        dArr2[1] = d14;
        dArr2[0] = d14;
        double d15 = dArr[13] / d13;
        dArr2[3] = d15;
        dArr2[2] = d15;
        t6.l lVar = new t6.l(z10, dArr, dArr2, 11);
        lVar.f(d10, 0.0d);
        lVar.f(d10, d11);
        lVar.f(0.0d, d11);
        double d16 = jVar.f43295a.getContext().getResources().getDisplayMetrics().density;
        jVar.f43306m = new Rect((int) (dArr2[0] * d16), (int) (dArr2[2] * d16), (int) Math.ceil(dArr2[1] * d16), (int) Math.ceil(dArr2[3] * d16));
    }

    public void z(wi.o oVar) {
        wi.o oVar2;
        int i10;
        int i11;
        io.flutter.plugin.editing.j jVar = (io.flutter.plugin.editing.j) this.f46523b;
        View view = jVar.f43295a;
        if (!jVar.f43303i && (oVar2 = jVar.f43308o) != null && (i10 = oVar2.f53272d) >= 0 && (i11 = oVar2.f53273e) > i10) {
            int i12 = i11 - i10;
            int i13 = oVar.f53273e;
            int i14 = oVar.f53272d;
            boolean z10 = true;
            if (i12 == i13 - i14) {
                int i15 = 0;
                while (true) {
                    if (i15 >= i12) {
                        z10 = false;
                        break;
                    } else if (oVar2.f53269a.charAt(i15 + i10) != oVar.f53269a.charAt(i15 + i14)) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            jVar.f43303i = z10;
        }
        jVar.f43308o = oVar;
        jVar.f43302h.f(oVar);
        if (jVar.f43303i) {
            jVar.f43296b.restartInput(view);
            jVar.f43303i = false;
        }
    }

    public /* synthetic */ f(Object obj, int i10) {
        this.f46522a = i10;
        this.f46523b = obj;
    }

    public f(EnumMap enumMap) {
        this.f46522a = 6;
        EnumMap enumMap2 = new EnumMap(x1.class);
        this.f46523b = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public f(Context context) {
        this.f46522a = 17;
        this.f46523b = new i6.d(context, false);
    }

    public f(fc.f fVar) {
        this.f46522a = 15;
        this.f46523b = new File((File) fVar.f40782d, "com.crashlytics.settings.json");
    }

    public f(int i10) {
        this.f46522a = i10;
        switch (i10) {
            case 5:
                try {
                    this.f46523b = XmlPullParserFactory.newInstance();
                    return;
                } catch (XmlPullParserException e10) {
                    throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
                }
            case 6:
                this.f46523b = new EnumMap(x1.class);
                return;
            case 13:
                return;
            case 21:
                this.f46523b = new HashMap();
                return;
            case 24:
                this.f46523b = new s4.i(18);
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                this.f46523b = new LinkedHashMap();
                return;
            default:
                this.f46523b = new k0(0, false);
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(String str, String str2, int i10) {
        this(2);
        this.f46522a = 2;
        a(Command.HTTP_HEADER_USER_AGENT, str);
        a("CSeq", String.valueOf(i10));
        if (str2 != null) {
            a("Session", str2);
        }
    }

    public f(ByteBuffer byteBuffer) {
        this.f46522a = 29;
        this.f46523b = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}
