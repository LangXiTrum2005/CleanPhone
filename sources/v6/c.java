package v6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import androidx.datastore.preferences.protobuf.i1;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.internal.ads.em0;
import com.google.android.gms.internal.ads.k3;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import ea.f2;
import j2.p;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import mi.y;
import oa.k0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q7.g0;
import r1.s;
import tl.i0;
import tl.j0;
import tl.l0;
import v0.i;
import v1.j;
import v9.g;
import vl.f;
import w1.m;
import w1.t;
import wa.h;
import x0.k;
import x0.q;
import x0.r;
import xi.l;
import xi.n;
import xi.o;
import xi.v;
import y7.x;
import zb.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class c implements AppSetIdClient, f, t, n, xi.c, k, xi.d, g0, com.google.android.gms.common.api.internal.k, SuccessContinuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f52487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f52488b;

    public c(Context context, int i10) {
        v9.e eVar;
        switch (i10) {
            case 6:
                this.f52487a = context;
                this.f52488b = null;
                return;
            default:
                this.f52487a = new g(context, i9.e.f42929b);
                synchronized (v9.e.class) {
                    try {
                        if (v9.e.f52498e == null) {
                            v9.e.f52498e = new v9.e(context.getApplicationContext(), 0);
                        }
                        eVar = v9.e.f52498e;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f52488b = eVar;
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0080 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0081 A[RETURN] */
    public static int j(c cVar, JSONArray jSONArray) throws JSONException, NoSuchFieldException {
        int i10;
        String str;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < jSONArray.length(); i13++) {
            String string = jSONArray.getString(i13);
            int[] iArrD = i.d(4);
            int length = iArrD.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    throw new NoSuchFieldException(defpackage.e.n("No such DeviceOrientation: ", string));
                }
                i10 = iArrD[i14];
                if (i10 == 1) {
                    str = "DeviceOrientation.portraitUp";
                } else if (i10 == 2) {
                    str = "DeviceOrientation.portraitDown";
                } else if (i10 == 3) {
                    str = "DeviceOrientation.landscapeLeft";
                } else {
                    if (i10 != 4) {
                        throw null;
                    }
                    str = "DeviceOrientation.landscapeRight";
                }
                if (str.equals(string)) {
                    break;
                }
                i14++;
            }
            int iC = i.c(i10);
            if (iC == 0) {
                i11 |= 1;
            } else if (iC == 1) {
                i11 |= 4;
            } else if (iC == 2) {
                i11 |= 2;
            } else if (iC == 3) {
                i11 |= 8;
            }
            if (i12 == 0) {
                i12 = i11;
            }
        }
        if (i11 == 0) {
            return -1;
        }
        switch (i11) {
            case 2:
                return 0;
            case 3:
            case 6:
            case 7:
            case 9:
            case 12:
            case 13:
            case 14:
                if (i12 == 2) {
                    return 0;
                }
                if (i12 != 4) {
                    if (i12 != 8) {
                        return 1;
                    }
                    return 8;
                }
                return 9;
            case 4:
                return 9;
            case 5:
                return 12;
            case 8:
                return 8;
            case 10:
                return 11;
            case 11:
                return 2;
            case 15:
                return 13;
            default:
                return 1;
        }
    }

    public static ArrayList k(c cVar, JSONArray jSONArray) throws JSONException, NoSuchFieldException {
        wi.e eVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            wi.e[] eVarArrValues = wi.e.values();
            int length = eVarArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    throw new NoSuchFieldException(defpackage.e.n("No such SystemUiOverlay: ", string));
                }
                eVar = eVarArrValues[i11];
                if (eVar.f53218a.equals(string)) {
                    break;
                }
                i11++;
            }
            int iOrdinal = eVar.ordinal();
            if (iOrdinal == 0) {
                arrayList.add(wi.e.TOP_OVERLAYS);
            } else if (iOrdinal == 1) {
                arrayList.add(wi.e.BOTTOM_OVERLAYS);
            }
        }
        return arrayList;
    }

    public static int l(String str, c cVar) throws NoSuchFieldException {
        String str2;
        for (int i10 : i.d(4)) {
            if (i10 == 1) {
                str2 = "SystemUiMode.leanBack";
            } else if (i10 == 2) {
                str2 = "SystemUiMode.immersive";
            } else if (i10 == 3) {
                str2 = "SystemUiMode.immersiveSticky";
            } else {
                if (i10 != 4) {
                    throw null;
                }
                str2 = "SystemUiMode.edgeToEdge";
            }
            if (str2.equals(str)) {
                int iC = i.c(i10);
                if (iC == 0) {
                    return 1;
                }
                if (iC != 1) {
                    return iC != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException(defpackage.e.n("No such SystemUiMode: ", str));
    }

    public static em0 m(c cVar, JSONObject jSONObject) {
        return new em0(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? q4.a.b(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, jSONObject.isNull("systemNavigationBarIconBrightness") ? 0 : q4.a.b(jSONObject.getString("systemNavigationBarIconBrightness")), !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    @Override // q7.g0
    public void a(Bundle bundle, l7.n nVar) {
        x xVar = (x) this.f52487a;
        y7.n request = (y7.n) this.f52488b;
        xVar.getClass();
        kotlin.jvm.internal.n.f(request, "request");
        xVar.s(request, bundle, nVar);
    }

    @Override // com.google.android.gms.common.api.internal.k
    public void accept(Object obj, Object obj2) {
        int i10;
        y9.d dVar = (y9.d) this.f52487a;
        y9.b bVar = (y9.b) obj;
        v9.f fVar = new v9.f(dVar, (TaskCompletionSource) obj2);
        Context context = dVar.f43740a;
        try {
            i10 = r9.c.a(context).f(0, context.getPackageName()).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i10 = 0;
        }
        h9.b bVar2 = (h9.b) this.f52488b;
        bVar2.f42253f = i10;
        y9.c cVar = (y9.c) bVar.getService();
        bVar.getContext();
        j9.g gVar = new j9.g(-1, -1, 0, true);
        Parcelable.Creator<j9.f> creator = j9.f.CREATOR;
        j9.f fVar2 = new j9.f(gVar, false);
        fVar2.f43732c = false;
        boolean z10 = fVar2.f43732c;
        j9.f fVar3 = new j9.f(fVar2.f43730a, true);
        fVar3.f43732c = z10;
        cVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        int i11 = y9.a.f54350a;
        parcelObtain.writeStrongBinder(fVar);
        parcelObtain.writeInt(1);
        bVar2.writeToParcel(parcelObtain, 0);
        parcelObtain.writeInt(1);
        fVar3.writeToParcel(parcelObtain, 0);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            cVar.f54351a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // vl.f
    public boolean b(int i10) {
        return ((Boolean) r(i10).f53295c).booleanValue();
    }

    @Override // w1.t
    public p c(w1.p pVar, m mVar) {
        return new f2(((t) this.f52487a).c(pVar, mVar), false, (List) this.f52488b, 1);
    }

    @Override // w1.t
    public p d() {
        return new f2(((t) this.f52487a).d(), false, (List) this.f52488b, 1);
    }

    @Override // xi.c
    public void e(Object obj) {
        s sVar = (s) this.f52488b;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) sVar.f49338b;
        wi.k kVar = (wi.k) this.f52487a;
        concurrentLinkedQueue.remove(kVar);
        if (((ConcurrentLinkedQueue) sVar.f49338b).isEmpty()) {
            return;
        }
        Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + kVar.f53250a);
    }

    @Override // x0.k
    public boolean f(CharSequence charSequence, int i10, int i11, q qVar) {
        if ((qVar.f53545c & 4) > 0) {
            return true;
        }
        if (((x0.s) this.f52487a) == null) {
            this.f52487a = new x0.s(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((j) this.f52488b).getClass();
        ((x0.s) this.f52487a).setSpan(new r(qVar), i10, i11, 33);
        return true;
    }

    @Override // xi.d
    public void g(ByteBuffer byteBuffer, oi.f fVar) throws Throwable {
        k5.g gVar = (k5.g) this.f52488b;
        try {
            ((xi.b) this.f52487a).t(((l) gVar.f44327c).b(byteBuffer), new wi.b(this, fVar));
        } catch (RuntimeException e10) {
            Log.e("BasicMessageChannel#" + ((String) gVar.f44326b), "Failed to handle message", e10);
            fVar.a(null);
        }
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public Task getAppSetIdInfo() {
        return ((g) this.f52487a).getAppSetIdInfo().continueWithTask(new na.g(this, 22));
    }

    @Override // vl.f
    public String getString(int i10) {
        String str = (String) ((l0) this.f52487a).f51349b.get(i10);
        kotlin.jvm.internal.n.e(str, "strings.getString(index)");
        return str;
    }

    @Override // vl.f
    public String h(int i10) throws IOException {
        wj.k kVarR = r(i10);
        List list = (List) kVarR.f53293a;
        String strU0 = xj.n.u0((List) kVarR.f53294b, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strU0;
        }
        return xj.n.u0(list, "/", null, null, null, 62) + '/' + strU0;
    }

    @Override // x0.k
    public Object i() {
        return (x0.s) this.f52487a;
    }

    public wa.r n() throws GeneralSecurityException {
        Integer num = (Integer) this.f52487a;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((h) this.f52488b) != null) {
            return new wa.r(num.intValue(), (h) this.f52488b);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    public byte[] o(y2.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f52488b;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f52487a;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f54188a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f54189b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f54190c);
            dataOutputStream.writeLong(aVar.f54191d);
            dataOutputStream.write(aVar.f54192e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // xi.n
    public void onMethodCall(xi.m mVar, o oVar) {
        rb.c cVar = (rb.c) this.f52488b;
        if (((v9.e) cVar.f49529b) == null) {
            ((wi.j) oVar).a((Map) this.f52487a);
            return;
        }
        String str = mVar.f53822a;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            ((wi.j) oVar).c();
            return;
        }
        try {
            this.f52487a = Collections.unmodifiableMap(((mi.x) ((y[]) ((v9.e) cVar.f49529b).f52503b)[0]).f46089b);
        } catch (IllegalStateException e10) {
            ((wi.j) oVar).b("error", e10.getMessage(), null);
        }
        ((wi.j) oVar).a((Map) this.f52487a);
    }

    public void p(int i10, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i10 + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            xb.b bVar = "clx".equals(bundle2.getString("_o")) ? (qd.i) this.f52487a : (k0) this.f52488b;
            if (bVar == null) {
                return;
            }
            bVar.x(bundle2, string);
        }
    }

    public void q(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.f52487a = Integer.valueOf(i10);
    }

    public wj.k r(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i10 != -1) {
            j0 j0Var = (j0) ((tl.k0) this.f52488b).f51334b.get(i10);
            String str = (String) ((l0) this.f52487a).f51349b.get(j0Var.f51323d);
            i0 i0Var = j0Var.f51324e;
            kotlin.jvm.internal.n.c(i0Var);
            int iOrdinal = i0Var.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(str);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(str);
            } else if (iOrdinal == 2) {
                linkedList2.addFirst(str);
                z10 = true;
            }
            i10 = j0Var.f51322c;
        }
        return new wj.k(linkedList, linkedList2, Boolean.valueOf(z10));
    }

    public void s(int i10, k3 k3Var) throws IOException {
        Iterator it = (Iterator) this.f52487a;
        while (true) {
            Map.Entry entry = (Map.Entry) this.f52488b;
            if (entry == null || ((zl.l) entry.getKey()).f55067a >= i10) {
                return;
            }
            zl.l lVar = (zl.l) ((Map.Entry) this.f52488b).getKey();
            Object value = ((Map.Entry) this.f52488b).getValue();
            zl.h hVar = zl.h.f55041c;
            zl.i0 i0Var = lVar.f55068b;
            int i11 = lVar.f55067a;
            if (lVar.f55069c) {
                for (Object obj : (List) value) {
                    if (i0Var == zl.i0.f55047e) {
                        k3Var.B(i11, 3);
                        ((zl.a) obj).i(k3Var);
                        k3Var.B(i11, 4);
                    } else {
                        k3Var.B(i11, i0Var.f55052b);
                        zl.h.k(k3Var, i0Var, obj);
                    }
                }
            } else if (i0Var == zl.i0.f55047e) {
                k3Var.B(i11, 3);
                ((zl.a) value).i(k3Var);
                k3Var.B(i11, 4);
            } else {
                k3Var.B(i11, i0Var.f55052b);
                zl.h.k(k3Var, i0Var, value);
            }
            if (it.hasNext()) {
                this.f52488b = (Map.Entry) it.next();
            } else {
                this.f52488b = null;
            }
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Boolean bool = (Boolean) obj;
        zb.l lVar = (zb.l) this.f52488b;
        if (bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean zBooleanValue = bool.booleanValue();
            u uVar = lVar.f54705b;
            if (zBooleanValue) {
                uVar.f54770h.trySetResult(null);
                return ((Task) this.f52487a).onSuccessTask(lVar.f54708e.f3462a, new qj.x(this, 27));
            }
            uVar.getClass();
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        fc.f fVar = lVar.f54710g;
        Iterator it = fc.f.I(((File) fVar.f40782d).listFiles(zb.l.f54702t)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        fc.f fVar2 = ((fc.d) lVar.f54715m.f40781c).f40775b;
        fc.d.b(fc.f.I(((File) fVar2.f40784f).listFiles()));
        fc.d.b(fc.f.I(((File) fVar2.f40785g).listFiles()));
        fc.d.b(fc.f.I(((File) fVar2.f40786h).listFiles()));
        lVar.f54720r.trySetResult(null);
        return Tasks.forResult(null);
    }

    public /* synthetic */ c(Object obj, Object obj2) {
        this.f52487a = obj;
        this.f52488b = obj2;
    }

    public /* synthetic */ c(boolean z10, Object obj, Object obj2) {
        this.f52488b = obj;
        this.f52487a = obj2;
    }

    public c(int i10) {
        switch (i10) {
            case 13:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f52487a = byteArrayOutputStream;
                this.f52488b = new DataOutputStream(byteArrayOutputStream);
                break;
            case 19:
                this.f52487a = new AtomicInteger();
                this.f52488b = new AtomicInteger();
                break;
            default:
                this.f52487a = new AtomicReference();
                this.f52488b = new x.e(0);
                break;
        }
    }

    public c(n.j jVar, int i10) {
        switch (i10) {
            case 9:
                na.g gVar = new na.g(this, 26);
                xi.p pVar = new xi.p(jVar, "flutter/platform_views", v.f53830b);
                this.f52487a = pVar;
                pVar.b(gVar);
                break;
            default:
                k0 k0Var = new k0(this, 22);
                xi.p pVar2 = new xi.p(jVar, "flutter/platform", xi.k.f53821a);
                this.f52487a = pVar2;
                pVar2.b(k0Var);
                break;
        }
    }

    public c(zl.k kVar) {
        Iterator it = ((i1) kVar.f55066a.f55042a.entrySet()).iterator();
        this.f52487a = it;
        if (it.hasNext()) {
            this.f52488b = (Map.Entry) it.next();
        }
    }
}
