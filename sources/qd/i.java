package qd;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.hardware.biometrics.BiometricPrompt;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.security.keystore.KeyGenParameterSpec;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.internal.ads.ga;
import com.google.android.gms.internal.ads.kj1;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.internal.measurement.qg;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.ironsource.C0247aa;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.UnityAdsConstants;
import i1.p;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;
import k9.c0;
import l1.q;
import l1.x;
import l1.y;
import n2.a0;
import oa.k0;
import org.json.JSONException;
import org.json.JSONObject;
import q7.d0;
import r1.e0;
import r1.s;
import tj.i0;
import u3.r;
import xi.v;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class i implements t8.b, k3.d, r, xb.b, xb.a, d0, ye.g, ze.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f48980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f48981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f48982d;

    public /* synthetic */ i() {
        this.f48979a = 9;
    }

    public static boolean p(Editable editable, KeyEvent keyEvent, boolean z10) {
        x0.r[] rVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (rVarArr = (x0.r[]) editable.getSpans(selectionStart, selectionEnd, x0.r.class)) != null && rVarArr.length > 0) {
                for (x0.r rVar : rVarArr) {
                    int spanStart = editable.getSpanStart(rVar);
                    int spanEnd = editable.getSpanEnd(rVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void A(xi.h hVar) {
        ((xi.f) this.f48980b).a((String) this.f48981c, hVar == null ? null : new s(this, hVar));
    }

    @Override // u3.r
    public void a(x xVar, n2.m mVar, ga gaVar) {
        this.f48981c = xVar;
        gaVar.a();
        gaVar.b();
        a0 a0VarTrack = mVar.track(gaVar.f14805d, 5);
        this.f48982d = a0VarTrack;
        a0VarTrack.b((p) this.f48980b);
    }

    @Override // u3.r
    public void b(q qVar) {
        long jD;
        long j10;
        ((x) this.f48981c).getClass();
        String str = y.f44830a;
        x xVar = (x) this.f48981c;
        synchronized (xVar) {
            try {
                long j11 = xVar.f44828c;
                jD = j11 != C.TIME_UNSET ? j11 + xVar.f44827b : xVar.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        x xVar2 = (x) this.f48981c;
        synchronized (xVar2) {
            j10 = xVar2.f44827b;
        }
        if (jD == C.TIME_UNSET || j10 == C.TIME_UNSET) {
            return;
        }
        p pVar = (p) this.f48980b;
        if (j10 != pVar.f42648s) {
            i1.o oVarA = pVar.a();
            oVarA.f42605r = j10;
            p pVar2 = new p(oVarA);
            this.f48980b = pVar2;
            ((a0) this.f48982d).b(pVar2);
        }
        int iA = qVar.a();
        ((a0) this.f48982d).g(iA, qVar);
        ((a0) this.f48982d).a(jD, 1, iA, 0, null);
    }

    @Override // ze.a
    public void c() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        keyStore.deleteEntry((String) this.f48980b);
    }

    @Override // ze.a
    public Cipher d(Context context) {
        return null;
    }

    @Override // ze.a
    public Key e(byte[] bArr) throws Exception {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        String str = (String) this.f48980b;
        Key key = keyStore.getKey(str, null);
        if (key == null) {
            throw new Exception(defpackage.e.n("No key found under alias: ", str));
        }
        if (!(key instanceof PrivateKey)) {
            throw new Exception("Not an instance of a PrivateKey");
        }
        Cipher cipherT = t();
        cipherT.init(4, (PrivateKey) key, s());
        return cipherT.unwrap(bArr, "AES", 3);
    }

    @Override // ye.g
    public void f(BiometricPrompt.AuthenticationResult authenticationResult) {
        ye.b bVar = (ye.b) this.f48982d;
        u uVar = bVar.f54368e;
        try {
            Log.d("FlutterSecureStorage", "Step 6/7: Initializing current biometric cipher...");
            ye.d dVar = bVar.f54369f;
            ze.e eVarI = dVar.f54376e.i(dVar.f54373b, (Cipher) this.f48980b);
            Log.d("FlutterSecureStorage", "Step 7/7: Encrypting all data with current biometric cipher...");
            ye.d.e((HashMap) this.f48981c, bVar.f54366c, eVarI);
            dVar.f54375d = eVarI;
            Log.i("FlutterSecureStorage", "Biometric→Biometric migration completed! Data now uses new biometric cipher.");
            uVar.f(null);
        } catch (Exception e10) {
            Log.e("FlutterSecureStorage", "Failed to complete migration after second authentication", e10);
            uVar.h(e10);
        }
    }

    @Override // ze.a
    public byte[] g(SecretKeySpec secretKeySpec) throws Exception {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        String str = (String) this.f48980b;
        Certificate certificate = keyStore.getCertificate(str);
        if (certificate == null) {
            throw new Exception(defpackage.e.n("No certificate found under alias: ", str));
        }
        PublicKey publicKey = certificate.getPublicKey();
        if (publicKey == null) {
            throw new Exception(defpackage.e.n("No key found under alias: ", str));
        }
        Cipher cipherT = t();
        cipherT.init(3, publicKey, s());
        return cipherT.wrap(secretKeySpec);
    }

    @Override // vj.a
    public Object get() {
        switch (this.f48979a) {
            case 2:
                int i10 = 1;
                return new r8.p(new rc.d(i10), new fd.b(i10), (w8.b) ((nf) this.f48980b).get(), (com.google.android.gms.internal.consent_sdk.d) ((fc.f) this.f48981c).get(), (k5.g) ((u) this.f48982d).get());
            default:
                return new s((Context) ((vj.a) this.f48980b).get(), (y8.d) ((vj.a) this.f48981c).get(), (x8.a) ((un.a) this.f48982d).get(), 10);
        }
    }

    @Override // k3.d
    public List getCues(long j10) {
        List list = (List) this.f48980b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            long[] jArr = (long[]) this.f48981c;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                t3.c cVar = (t3.c) list.get(i10);
                k1.b bVar = cVar.f50462a;
                if (bVar.f44229e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new b2.j(18));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            k1.b bVar2 = ((t3.c) arrayList2.get(i12)).f50462a;
            arrayList.add(new k1.b(bVar2.f44225a, bVar2.f44226b, bVar2.f44227c, bVar2.f44228d, (-1) - i12, 1, bVar2.f44231g, bVar2.f44232h, bVar2.f44233i, bVar2.f44237n, bVar2.f44238o, bVar2.f44234j, bVar2.f44235k, bVar2.l, bVar2.f44236m, bVar2.f44239p, bVar2.f44240q, bVar2.f44241r));
        }
        return arrayList;
    }

    @Override // k3.d
    public long getEventTime(int i10) {
        long[] jArr = (long[]) this.f48982d;
        go.k.i(i10 >= 0);
        go.k.i(i10 < jArr.length);
        return jArr[i10];
    }

    @Override // k3.d
    public int getEventTimeCount() {
        return ((long[]) this.f48982d).length;
    }

    @Override // k3.d
    public int getNextEventTimeIndex(long j10) {
        long[] jArr = (long[]) this.f48982d;
        int iB = y.b(jArr, j10, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override // ye.g
    public void h(Exception exc) {
        Log.e("FlutterSecureStorage", "Second biometric authentication failed for migration", exc);
        ((ye.b) this.f48982d).f54368e.h(new Exception("Migration cancelled: Second biometric authentication failed", exc));
    }

    @Override // q7.d0
    public void i(JSONObject jSONObject) {
        String string;
        Bundle bundle = (Bundle) this.f48980b;
        y7.k kVar = (y7.k) this.f48981c;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("id");
            } catch (JSONException e10) {
                y7.p pVarD = kVar.d();
                y7.n nVar = kVar.d().f54300g;
                String message = e10.getMessage();
                ArrayList arrayList = new ArrayList();
                arrayList.add("Caught exception");
                if (message != null) {
                    arrayList.add(message);
                }
                pVarD.c(new y7.o(nVar, 3, null, TextUtils.join(": ", arrayList), null));
                return;
            }
        } else {
            string = null;
        }
        bundle.putString("com.facebook.platform.extra.USER_ID", string);
        kVar.l(bundle, (y7.n) this.f48982d);
    }

    @Override // q7.d0
    public void j(l7.n nVar) {
        y7.k kVar = (y7.k) this.f48981c;
        y7.p pVarD = kVar.d();
        y7.n nVar2 = kVar.d().f54300g;
        String message = nVar != null ? nVar.getMessage() : null;
        ArrayList arrayList = new ArrayList();
        arrayList.add("Caught exception");
        if (message != null) {
            arrayList.add(message);
        }
        pVarD.c(new y7.o(nVar2, 3, null, TextUtils.join(": ", arrayList), null));
    }

    public wa.m k() throws GeneralSecurityException {
        s4.i iVar;
        lb.a aVarB;
        wa.o oVar = (wa.o) this.f48980b;
        if (oVar == null || (iVar = (s4.i) this.f48981c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (oVar.f53107a != ((lb.a) iVar.f50111a).f45273a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (oVar.a() && ((Integer) this.f48982d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((wa.o) this.f48980b).a() && ((Integer) this.f48982d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        wa.h hVar = ((wa.o) this.f48980b).f53110d;
        if (hVar == wa.h.f53057p) {
            aVarB = eb.p.f40006a;
        } else if (hVar == wa.h.f53056o) {
            aVarB = eb.p.a(((Integer) this.f48982d).intValue());
        } else {
            if (hVar != wa.h.f53055n) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + ((wa.o) this.f48980b).f53110d);
            }
            aVarB = eb.p.b(((Integer) this.f48982d).intValue());
        }
        return new wa.m((wa.o) this.f48980b, (s4.i) this.f48981c, aVarB, (Integer) this.f48982d);
    }

    public void l(long j10, q qVar) {
        if (qVar.a() < 9) {
            return;
        }
        int iM = qVar.m();
        int iM2 = qVar.m();
        int iZ = qVar.z();
        if (iM == 434 && iM2 == 1195456820 && iZ == 3) {
            ((kj1) this.f48982d).a(j10, qVar);
        }
    }

    public String m() {
        return ((Context) this.f48981c).getPackageName() + ".FlutterSecureStoragePluginKey" + ((ye.e) this.f48982d).c();
    }

    public void n(n2.m mVar, ga gaVar) {
        a0[] a0VarArr = (a0[]) this.f48981c;
        for (int i10 = 0; i10 < a0VarArr.length; i10++) {
            gaVar.a();
            gaVar.b();
            a0 a0VarTrack = mVar.track(gaVar.f14805d, 3);
            p pVar = (p) ((List) this.f48980b).get(i10);
            String str = pVar.f42643n;
            go.k.k(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption MIME type provided: %s", str);
            i1.o oVar = new i1.o();
            gaVar.b();
            oVar.f42589a = gaVar.f14806e;
            oVar.l = i1.d0.n("video/mp2t");
            oVar.f42600m = i1.d0.n(str);
            oVar.f42593e = pVar.f42635e;
            oVar.f42592d = pVar.f42634d;
            oVar.J = pVar.K;
            oVar.f42603p = pVar.f42646q;
            q4.a.o(oVar, a0VarTrack);
            a0VarArr[i10] = a0VarTrack;
        }
    }

    @Override // xb.a
    public void o(Bundle bundle) {
        synchronized (this.f48981c) {
            try {
                wb.c cVar = wb.c.f53149a;
                cVar.c("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f48982d = new CountDownLatch(1);
                ((na.g) this.f48980b).o(bundle);
                cVar.c("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.f48982d).await(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, TimeUnit.MILLISECONDS)) {
                        cVar.c("App exception callback received from Analytics listener.");
                    } else {
                        cVar.d("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f48982d = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void q(int i10, io.flutter.view.d dVar) {
        ((FlutterJNI) this.f48981c).dispatchSemanticsAction(i10, dVar);
    }

    public void r(int i10, io.flutter.view.d dVar, Serializable serializable) {
        ((FlutterJNI) this.f48981c).dispatchSemanticsAction(i10, dVar, serializable);
    }

    public AlgorithmParameterSpec s() {
        return null;
    }

    public Cipher t() {
        return Cipher.getInstance(C0247aa.f28208b, "AndroidKeyStoreBCWorkaround");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0271  */
    /* JADX WARN: Code duplicated, block: B:103:0x027f  */
    /* JADX WARN: Code duplicated, block: B:105:0x028b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0297  */
    /* JADX WARN: Code duplicated, block: B:109:0x029c  */
    /* JADX WARN: Code duplicated, block: B:111:0x029f  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:114:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:117:0x02be  */
    /* JADX WARN: Code duplicated, block: B:118:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:121:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:127:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:131:0x0308  */
    /* JADX WARN: Code duplicated, block: B:135:0x0321  */
    /* JADX WARN: Code duplicated, block: B:136:0x0323  */
    /* JADX WARN: Code duplicated, block: B:138:0x0351  */
    /* JADX WARN: Code duplicated, block: B:144:0x0380  */
    /* JADX WARN: Code duplicated, block: B:149:0x0396  */
    /* JADX WARN: Code duplicated, block: B:151:0x0399  */
    /* JADX WARN: Code duplicated, block: B:154:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:157:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:158:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:164:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:167:0x0403  */
    /* JADX WARN: Code duplicated, block: B:168:0x0405  */
    /* JADX WARN: Code duplicated, block: B:174:0x042f  */
    /* JADX WARN: Code duplicated, block: B:177:0x043d  */
    /* JADX WARN: Code duplicated, block: B:178:0x043f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0445  */
    /* JADX WARN: Code duplicated, block: B:182:0x045e  */
    /* JADX WARN: Code duplicated, block: B:185:0x046a  */
    /* JADX WARN: Code duplicated, block: B:188:0x047b  */
    /* JADX WARN: Code duplicated, block: B:191:0x0485  */
    /* JADX WARN: Code duplicated, block: B:195:0x049d  */
    /* JADX WARN: Code duplicated, block: B:199:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:202:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:205:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:209:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:214:0x0503  */
    /* JADX WARN: Code duplicated, block: B:215:0x0505 A[Catch: ExecutionException -> 0x0529, TimeoutException -> 0x052b, InterruptedException -> 0x0534, TryCatch #8 {InterruptedException -> 0x0534, ExecutionException -> 0x0529, TimeoutException -> 0x052b, blocks: (B:212:0x04f2, B:216:0x050f, B:220:0x051e, B:219:0x051a, B:215:0x0505), top: B:245:0x04f2 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x0518  */
    /* JADX WARN: Code duplicated, block: B:219:0x051a A[Catch: ExecutionException -> 0x0529, TimeoutException -> 0x052b, InterruptedException -> 0x0534, TryCatch #8 {InterruptedException -> 0x0534, ExecutionException -> 0x0529, TimeoutException -> 0x052b, blocks: (B:212:0x04f2, B:216:0x050f, B:220:0x051e, B:219:0x051a, B:215:0x0505), top: B:245:0x04f2 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x0560  */
    /* JADX WARN: Code duplicated, block: B:239:0x0361 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x0388 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x04f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:52:0x0137  */
    /* JADX WARN: Code duplicated, block: B:55:0x0144  */
    /* JADX WARN: Code duplicated, block: B:57:0x0156  */
    /* JADX WARN: Code duplicated, block: B:58:0x015e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0222  */
    /* JADX WARN: Code duplicated, block: B:91:0x022f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0231  */
    /* JADX WARN: Code duplicated, block: B:97:0x025c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0262  */
    /* JADX WARN: Instruction removed from duplicated block: B:180:0x0445, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:209:0x04dc, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v167 */
    /* JADX WARN: Type inference failed for: r0v168 */
    /* JADX WARN: Type inference failed for: r0v169 */
    /* JADX WARN: Type inference failed for: r0v170 */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88, types: [int] */
    public boolean u() {
        zc.p pVar;
        Bundle bundle;
        int identifier;
        String strJ;
        Uri defaultUri;
        String strJ2;
        String strJ3;
        Uri uri;
        Intent launchIntentForPackage;
        Bundle bundle2;
        PendingIntent activity;
        PendingIntent broadcast;
        String strJ4;
        Integer numValueOf;
        String strJ5;
        Integer numC;
        Integer numC2;
        Integer numC3;
        Long lH;
        long[] jArrK;
        int[] iArrE;
        boolean zB;
        ?? r0;
        ?? r2;
        Notification notification;
        String strJ6;
        Bitmap bitmap;
        IconCompat iconCompatB;
        IconCompat iconCompatB2;
        int i10;
        int i11;
        int i12;
        int identifier2;
        String string;
        int i13 = 1;
        if (((xh.e) this.f48982d).b("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.f48981c;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strJ7 = ((xh.e) this.f48982d).j("gcm.n.image");
        if (TextUtils.isEmpty(strJ7)) {
            pVar = null;
        } else {
            try {
                pVar = new zc.p(new URL(strJ7));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strJ7);
                pVar = null;
            }
        }
        if (pVar != null) {
            ExecutorService executorService = (ExecutorService) this.f48980b;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            pVar.f54852b = executorService.submit(new w1.b(8, pVar, taskCompletionSource));
            pVar.f54853c = taskCompletionSource.getTask();
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.f48981c;
        xh.e eVar = (xh.e) this.f48982d;
        AtomicInteger atomicInteger = zc.d.f54817a;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        Bundle bundle3 = bundle;
        String strJ8 = eVar.j("gcm.n.android_channel_id");
        try {
            if (firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 0).targetSdkVersion < 26) {
                strJ8 = null;
            } else {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService2.getSystemService(NotificationManager.class);
                if (TextUtils.isEmpty(strJ8)) {
                    strJ8 = bundle3.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(strJ8)) {
                        Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    } else if (notificationManager.getNotificationChannel(strJ8) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    strJ8 = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                        identifier2 = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                        if (identifier2 == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService2.getString(identifier2);
                        }
                        notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                    }
                } else if (notificationManager.getNotificationChannel(strJ8) == null) {
                    Log.w("FirebaseMessaging", "Notification Channel requested (" + strJ8 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    strJ8 = bundle3.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (!TextUtils.isEmpty(strJ8)) {
                        Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                    } else if (notificationManager.getNotificationChannel(strJ8) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    strJ8 = "fcm_fallback_notification_channel";
                    if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                        identifier2 = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                        if (identifier2 == 0) {
                            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                            string = "Misc";
                        } else {
                            string = firebaseMessagingService2.getString(identifier2);
                        }
                        notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        AtomicInteger atomicInteger2 = zc.d.f54817a;
        String packageName = firebaseMessagingService2.getPackageName();
        Resources resources = firebaseMessagingService2.getResources();
        PackageManager packageManager = firebaseMessagingService2.getPackageManager();
        b0.p pVar2 = new b0.p(firebaseMessagingService2, strJ8);
        String strI = eVar.i(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strI)) {
            pVar2.f5170e = b0.p.b(strI);
        }
        String strI2 = eVar.i(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strI2)) {
            pVar2.f5171f = b0.p.b(strI2);
            b0.l lVar = new b0.l(0);
            lVar.f5145f = b0.p.b(strI2);
            pVar2.e(lVar);
        }
        String strJ9 = eVar.j("gcm.n.icon");
        if (!TextUtils.isEmpty(strJ9)) {
            identifier = resources.getIdentifier(strJ9, "drawable", packageName);
            if (identifier == 0 && (identifier = resources.getIdentifier(strJ9, "mipmap", packageName)) == 0) {
                Log.w("FirebaseMessaging", "Icon resource " + strJ9 + " not found. Notification will use default icon.");
            } else {
                i13 = 1;
            }
            pVar2.G.icon = identifier;
            strJ = eVar.j("gcm.n.sound2");
            if (TextUtils.isEmpty(strJ)) {
                strJ = eVar.j("gcm.n.sound");
            }
            if (TextUtils.isEmpty(strJ)) {
                defaultUri = null;
            } else if (!BuildConfig.FLAVOR.equals(strJ) || resources.getIdentifier(strJ, "raw", packageName) == 0) {
                defaultUri = RingtoneManager.getDefaultUri(2);
            } else {
                defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strJ);
            }
            if (defaultUri != null) {
                pVar2.d(defaultUri);
            }
            strJ2 = eVar.j("gcm.n.click_action");
            if (TextUtils.isEmpty(strJ2)) {
                strJ3 = eVar.j("gcm.n.link_android");
                if (TextUtils.isEmpty(strJ3)) {
                    strJ3 = eVar.j("gcm.n.link");
                }
                if (TextUtils.isEmpty(strJ3)) {
                    uri = null;
                } else {
                    uri = Uri.parse(strJ3);
                }
                if (uri != null) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                    launchIntentForPackage.setPackage(packageName);
                    launchIntentForPackage.setData(uri);
                } else {
                    launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                    if (launchIntentForPackage == null) {
                        Log.w("FirebaseMessaging", "No activity found to launch app");
                    }
                }
            } else {
                launchIntentForPackage = new Intent(strJ2);
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setFlags(268435456);
            }
            if (launchIntentForPackage == null) {
                activity = null;
            } else {
                launchIntentForPackage.addFlags(67108864);
                Bundle bundle4 = (Bundle) eVar.f53807a;
                bundle2 = new Bundle(bundle4);
                for (String str : bundle4.keySet()) {
                    if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                        bundle2.remove(str);
                    }
                }
                launchIntentForPackage.putExtras(bundle2);
                if (eVar.b("google.c.a.e")) {
                    launchIntentForPackage.putExtra("gcm.n.analytics_data", eVar.m());
                }
                activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
            }
            pVar2.f5172g = activity;
            if (eVar.b("google.c.a.e")) {
                broadcast = PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(eVar.m())), 1140850688);
            } else {
                broadcast = null;
            }
            if (broadcast != null) {
                pVar2.G.deleteIntent = broadcast;
            }
            strJ4 = eVar.j("gcm.n.color");
            if (TextUtils.isEmpty(strJ4)) {
                i12 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i12 != 0) {
                    numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i12));
                } else {
                    numValueOf = null;
                }
            } else {
                try {
                    numValueOf = Integer.valueOf(Color.parseColor(strJ4));
                } catch (IllegalArgumentException unused3) {
                    Log.w("FirebaseMessaging", "Color is invalid: " + strJ4 + ". Notification will use default color.");
                    i12 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i12 != 0) {
                        try {
                            numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i12));
                        } catch (Resources.NotFoundException unused4) {
                            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                            numValueOf = null;
                        }
                    } else {
                        numValueOf = null;
                    }
                }
            }
            if (numValueOf != null) {
                pVar2.f5190z = numValueOf.intValue();
            }
            pVar2.c(16, !eVar.b("gcm.n.sticky"));
            pVar2.f5185u = eVar.b("gcm.n.local_only");
            strJ5 = eVar.j("gcm.n.ticker");
            if (strJ5 != null) {
                pVar2.G.tickerText = b0.p.b(strJ5);
            }
            numC = eVar.c("gcm.n.notification_priority");
            if (numC == null) {
                numC = null;
            } else if (numC.intValue() >= -2 || numC.intValue() > 2) {
                Log.w("FirebaseMessaging", "notificationPriority is invalid " + numC + ". Skipping setting notificationPriority.");
                numC = null;
            }
            if (numC != null) {
                pVar2.f5176k = numC.intValue();
            }
            numC2 = eVar.c("gcm.n.visibility");
            if (numC2 == null) {
                numC2 = null;
            } else if (numC2.intValue() >= -1 || numC2.intValue() > i13) {
                Log.w("NotificationParams", "visibility is invalid: " + numC2 + ". Skipping setting visibility.");
                numC2 = null;
            }
            if (numC2 != null) {
                pVar2.A = numC2.intValue();
            }
            numC3 = eVar.c("gcm.n.notification_count");
            if (numC3 != null) {
                numC3 = null;
            } else if (numC3.intValue() < 0) {
                Log.w("FirebaseMessaging", "notificationCount is invalid: " + numC3 + ". Skipping setting notificationCount.");
                numC3 = null;
            }
            if (numC3 != null) {
                pVar2.f5175j = numC3.intValue();
            }
            lH = eVar.h();
            if (lH != null) {
                pVar2.l = true;
                pVar2.G.when = lH.longValue();
            }
            jArrK = eVar.k();
            if (jArrK != null) {
                pVar2.G.vibrate = jArrK;
            }
            iArrE = eVar.e();
            if (iArrE != null) {
                int i14 = iArrE[0];
                i10 = iArrE[1];
                int i15 = iArrE[2];
                Notification notification2 = pVar2.G;
                notification2.ledARGB = i14;
                notification2.ledOnMS = i10;
                notification2.ledOffMS = i15;
                if (i10 != 0 || i15 == 0) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                notification2.flags = i11 | ((-2) & notification2.flags);
            }
            zB = eVar.b("gcm.n.default_sound");
            r0 = zB;
            if (eVar.b("gcm.n.default_vibrate_timings")) {
                r0 = (zB ? 1 : 0) | 2;
            }
            r2 = r0;
            if (eVar.b("gcm.n.default_light_settings")) {
                r2 = (r0 == true ? 1 : 0) | 4;
            }
            notification = pVar2.G;
            notification.defaults = r2;
            if ((r2 & 4) != 0) {
                notification.flags |= 1;
            }
            strJ6 = eVar.j("gcm.n.tag");
            if (TextUtils.isEmpty(strJ6)) {
                strJ6 = "FCM-Notification:" + SystemClock.uptimeMillis();
            }
            String str2 = strJ6;
            if (pVar != null) {
                try {
                    Task task = pVar.f54853c;
                    c0.h(task);
                    bitmap = (Bitmap) Tasks.await(task, 5L, TimeUnit.SECONDS);
                    if (bitmap == null) {
                        iconCompatB = null;
                    } else {
                        iconCompatB = IconCompat.b(NotificationCompat.reduceLargeIconSize(pVar2.f5166a, bitmap));
                    }
                    pVar2.f5174i = iconCompatB;
                    b0.k kVar = new b0.k();
                    if (bitmap == null) {
                        iconCompatB2 = null;
                    } else {
                        iconCompatB2 = IconCompat.b(bitmap);
                    }
                    kVar.f5136e = iconCompatB2;
                    kVar.g(null);
                    pVar2.e(kVar);
                } catch (InterruptedException unused5) {
                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                    pVar.close();
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e11) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e11.getCause());
                } catch (TimeoutException unused6) {
                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                    pVar.close();
                }
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Showing notification");
            }
            ((NotificationManager) ((FirebaseMessagingService) this.f48981c).getSystemService("notification")).notify(str2, 0, pVar2.a());
            return true;
        }
        int i16 = bundle3.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i16 == 0) {
            try {
                i16 = packageManager.getApplicationInfo(packageName, 0).icon;
            } catch (PackageManager.NameNotFoundException e12) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e12);
            }
        }
        identifier = i16 != 0 ? i16 : 17301651;
        pVar2.G.icon = identifier;
        strJ = eVar.j("gcm.n.sound2");
        if (TextUtils.isEmpty(strJ)) {
            strJ = eVar.j("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strJ)) {
            defaultUri = null;
        } else if (BuildConfig.FLAVOR.equals(strJ)) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = RingtoneManager.getDefaultUri(2);
        }
        if (defaultUri != null) {
            pVar2.d(defaultUri);
        }
        strJ2 = eVar.j("gcm.n.click_action");
        if (TextUtils.isEmpty(strJ2)) {
            launchIntentForPackage = new Intent(strJ2);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        } else {
            strJ3 = eVar.j("gcm.n.link_android");
            if (TextUtils.isEmpty(strJ3)) {
                strJ3 = eVar.j("gcm.n.link");
            }
            if (TextUtils.isEmpty(strJ3)) {
                uri = Uri.parse(strJ3);
            } else {
                uri = null;
            }
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        }
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle5 = (Bundle) eVar.f53807a;
            bundle2 = new Bundle(bundle5);
            while (r13.hasNext()) {
                if (str.startsWith("google.c.")) {
                    bundle2.remove(str);
                } else {
                    bundle2.remove(str);
                }
            }
            launchIntentForPackage.putExtras(bundle2);
            if (eVar.b("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", eVar.m());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        pVar2.f5172g = activity;
        if (eVar.b("google.c.a.e")) {
            broadcast = null;
        } else {
            broadcast = PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(eVar.m())), 1140850688);
        }
        if (broadcast != null) {
            pVar2.G.deleteIntent = broadcast;
        }
        strJ4 = eVar.j("gcm.n.color");
        if (TextUtils.isEmpty(strJ4)) {
            numValueOf = Integer.valueOf(Color.parseColor(strJ4));
        } else {
            i12 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i12 != 0) {
                numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i12));
            } else {
                numValueOf = null;
            }
        }
        if (numValueOf != null) {
            pVar2.f5190z = numValueOf.intValue();
        }
        pVar2.c(16, !eVar.b("gcm.n.sticky"));
        pVar2.f5185u = eVar.b("gcm.n.local_only");
        strJ5 = eVar.j("gcm.n.ticker");
        if (strJ5 != null) {
            pVar2.G.tickerText = b0.p.b(strJ5);
        }
        numC = eVar.c("gcm.n.notification_priority");
        if (numC == null) {
            if (numC.intValue() >= -2) {
            }
            Log.w("FirebaseMessaging", "notificationPriority is invalid " + numC + ". Skipping setting notificationPriority.");
            numC = null;
        } else {
            numC = null;
        }
        if (numC != null) {
            pVar2.f5176k = numC.intValue();
        }
        numC2 = eVar.c("gcm.n.visibility");
        if (numC2 == null) {
            if (numC2.intValue() >= -1) {
            }
            Log.w("NotificationParams", "visibility is invalid: " + numC2 + ". Skipping setting visibility.");
            numC2 = null;
        } else {
            numC2 = null;
        }
        if (numC2 != null) {
            pVar2.A = numC2.intValue();
        }
        numC3 = eVar.c("gcm.n.notification_count");
        if (numC3 != null) {
            numC3 = null;
        } else if (numC3.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + numC3 + ". Skipping setting notificationCount.");
            numC3 = null;
        }
        if (numC3 != null) {
            pVar2.f5175j = numC3.intValue();
        }
        lH = eVar.h();
        if (lH != null) {
            pVar2.l = true;
            pVar2.G.when = lH.longValue();
        }
        jArrK = eVar.k();
        if (jArrK != null) {
            pVar2.G.vibrate = jArrK;
        }
        iArrE = eVar.e();
        if (iArrE != null) {
            int i17 = iArrE[0];
            i10 = iArrE[1];
            int i18 = iArrE[2];
            Notification notification3 = pVar2.G;
            notification3.ledARGB = i17;
            notification3.ledOnMS = i10;
            notification3.ledOffMS = i18;
            if (i10 != 0) {
                i11 = 0;
            } else {
                i11 = 0;
            }
            notification3.flags = i11 | ((-2) & notification3.flags);
        }
        zB = eVar.b("gcm.n.default_sound");
        r0 = zB;
        if (eVar.b("gcm.n.default_vibrate_timings")) {
            r0 = (zB ? 1 : 0) | 2;
        }
        r2 = r0;
        if (eVar.b("gcm.n.default_light_settings")) {
            r2 = (r0 == true ? 1 : 0) | 4;
        }
        notification = pVar2.G;
        notification.defaults = r2;
        if ((r2 & 4) != 0) {
            notification.flags |= 1;
        }
        strJ6 = eVar.j("gcm.n.tag");
        if (TextUtils.isEmpty(strJ6)) {
            strJ6 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        String str3 = strJ6;
        if (pVar != null) {
            Task task2 = pVar.f54853c;
            c0.h(task2);
            bitmap = (Bitmap) Tasks.await(task2, 5L, TimeUnit.SECONDS);
            if (bitmap == null) {
                iconCompatB = null;
            } else {
                iconCompatB = IconCompat.b(NotificationCompat.reduceLargeIconSize(pVar2.f5166a, bitmap));
            }
            pVar2.f5174i = iconCompatB;
            b0.k kVar2 = new b0.k();
            if (bitmap == null) {
                iconCompatB2 = null;
            } else {
                iconCompatB2 = IconCompat.b(bitmap);
            }
            kVar2.f5136e = iconCompatB2;
            kVar2.g(null);
            pVar2.e(kVar2);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) ((FirebaseMessagingService) this.f48981c).getSystemService("notification")).notify(str3, 0, pVar2.a());
        return true;
    }

    public boolean v(CharSequence charSequence, int i10, int i11, x0.q qVar) {
        if ((qVar.f53545c & 3) == 0) {
            x0.d dVar = (x0.d) this.f48982d;
            y0.a aVarB = qVar.b();
            int iA = aVarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) aVarB.f45720d).getShort(iA + aVarB.f45717a);
            }
            x0.b bVar = (x0.b) dVar;
            bVar.getClass();
            ThreadLocal threadLocal = x0.b.f53510b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i10 < i11) {
                sb2.append(charSequence.charAt(i10));
                i10++;
            }
            boolean zHasGlyph = bVar.f53511a.hasGlyph(sb2.toString());
            int i12 = qVar.f53545c & 4;
            qVar.f53545c = zHasGlyph ? i12 | 2 : i12 | 1;
        }
        return (qVar.f53545c & 3) == 2;
    }

    public KeyGenParameterSpec w(Calendar calendar, Calendar calendar2) {
        String str = (String) this.f48980b;
        return new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal(defpackage.e.n("CN=", str))).setDigests("SHA-256").setBlockModes("ECB").setEncryptionPaddings("PKCS1Padding").setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
    }

    @Override // xb.b
    public void x(Bundle bundle, String str) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f48982d;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    public Object y(CharSequence charSequence, int i10, int i11, int i12, boolean z10, x0.k kVar) {
        int i13;
        char c4;
        qg qgVar = new qg((x0.n) ((u) this.f48981c).f54881d);
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        int i14 = 0;
        boolean zF = true;
        int iCharCount = i10;
        loop0: while (true) {
            i13 = iCharCount;
            while (true) {
                if (iCharCount < i11 && i14 < i12 && zF) {
                    SparseArray sparseArray = ((x0.n) qgVar.f23908f).f53536a;
                    x0.n nVar = sparseArray == null ? null : (x0.n) sparseArray.get(iCodePointAt);
                    if (qgVar.f23904b == 2) {
                        if (nVar != null) {
                            qgVar.f23908f = nVar;
                            qgVar.f23906d++;
                        } else {
                            if (iCodePointAt == 65038) {
                                qgVar.a();
                            } else if (iCodePointAt != 65039) {
                                x0.n nVar2 = (x0.n) qgVar.f23908f;
                                if (nVar2.f53537b != null) {
                                    if (qgVar.f23906d != 1) {
                                        qgVar.f23909g = nVar2;
                                        qgVar.a();
                                    } else if (qgVar.b()) {
                                        qgVar.f23909g = (x0.n) qgVar.f23908f;
                                        qgVar.a();
                                    } else {
                                        qgVar.a();
                                    }
                                    c4 = 3;
                                } else {
                                    qgVar.a();
                                }
                            }
                            c4 = 1;
                        }
                        c4 = 2;
                    } else if (nVar == null) {
                        qgVar.a();
                        c4 = 1;
                    } else {
                        qgVar.f23904b = 2;
                        qgVar.f23908f = nVar;
                        qgVar.f23906d = 1;
                        c4 = 2;
                    }
                    qgVar.f23905c = iCodePointAt;
                    if (c4 == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i13)) + i13;
                        if (iCharCount >= i11) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c4 == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i11) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c4 == 3) {
                        if (!z10 && v(charSequence, i13, iCharCount, ((x0.n) qgVar.f23909g).f53537b)) {
                            break;
                        }
                        zF = kVar.f(charSequence, i13, iCharCount, ((x0.n) qgVar.f23909g).f53537b);
                        i14++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (qgVar.f23904b == 2 && ((x0.n) qgVar.f23908f).f53537b != null && ((qgVar.f23906d > 1 || qgVar.b()) && i14 < i12 && zF && (z10 || !v(charSequence, i13, iCharCount, ((x0.n) qgVar.f23908f).f53537b)))) {
            kVar.f(charSequence, i13, iCharCount, ((x0.n) qgVar.f23908f).f53537b);
        }
        return kVar.i();
    }

    public void z(Locale locale) {
        Locale.setDefault(locale);
        Context context = (Context) this.f48981c;
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        context.createConfigurationContext(configuration);
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i10) {
        this.f48979a = i10;
        this.f48980b = obj;
        this.f48981c = obj2;
        this.f48982d = obj3;
    }

    public i(ec.a aVar) {
        this.f48979a = 13;
        this.f48980b = aVar;
        this.f48981c = new xj.j();
        this.f48982d = new h2.d(3, false);
    }

    public i(Context context, ye.e eVar) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException {
        this.f48979a = 18;
        this.f48981c = context;
        this.f48982d = eVar;
        String strM = m();
        this.f48980b = strM;
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Key key = keyStore.getKey(strM, null);
        Certificate certificate = keyStore.getCertificate(strM);
        if (key == null || certificate == null) {
            Locale locale = Locale.getDefault();
            try {
                z(Locale.ENGLISH);
                Calendar calendar = Calendar.getInstance();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.add(1, 25);
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                keyPairGenerator.initialize(w(calendar, calendar2));
                keyPairGenerator.generateKeyPair();
            } finally {
                z(locale);
            }
        }
    }

    public i(ArrayList arrayList) {
        this.f48979a = 4;
        this.f48980b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f48981c = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            t3.c cVar = (t3.c) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = (long[]) this.f48981c;
            jArr[i11] = cVar.f50463b;
            jArr[i11 + 1] = cVar.f50464c;
        }
        long[] jArr2 = (long[]) this.f48981c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f48982d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public i(pk.c argumentRange, Method[] methodArr, Method method) {
        this.f48979a = 7;
        kotlin.jvm.internal.n.f(argumentRange, "argumentRange");
        this.f48980b = argumentRange;
        this.f48981c = methodArr;
        this.f48982d = method;
    }

    public i(List list) {
        this.f48979a = 6;
        this.f48980b = list;
        this.f48981c = new a0[list.size()];
        kj1 kj1Var = new kj1(new i0(this, 2));
        this.f48982d = kj1Var;
        kj1Var.r(3);
    }

    public i(na.g gVar) {
        this.f48979a = 12;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f48981c = new Object();
        this.f48980b = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(xi.f fVar, String str) {
        this(fVar, str, v.f53830b, 14);
        this.f48979a = 14;
    }

    public i(String str) {
        this.f48979a = 5;
        i1.o oVar = new i1.o();
        oVar.l = i1.d0.n("video/mp2t");
        oVar.f42600m = i1.d0.n(str);
        this.f48980b = new p(oVar);
    }

    public i(mb.g gVar, uc.d dVar, g gVar2, b bVar, Context context, String str, m mVar, ScheduledExecutorService scheduledExecutorService) {
        this.f48979a = 0;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f48980b = linkedHashSet;
        this.f48981c = new k(gVar, dVar, gVar2, bVar, context, str, linkedHashSet, mVar, scheduledExecutorService);
        this.f48982d = scheduledExecutorService;
    }

    public i(FirebaseMessagingService firebaseMessagingService, xh.e eVar, ExecutorService executorService) {
        this.f48979a = 17;
        this.f48980b = executorService;
        this.f48981c = firebaseMessagingService;
        this.f48982d = eVar;
    }

    public i(n.j jVar, FlutterJNI flutterJNI) {
        this.f48979a = 10;
        k0 k0Var = new k0(this, 20);
        k5.g gVar = new k5.g(jVar, "flutter/accessibility", xi.u.f53827a, (Object) null);
        this.f48980b = gVar;
        gVar.C(k0Var);
        this.f48981c = flutterJNI;
    }

    public i(u uVar, v1.j jVar, x0.b bVar, Set set) {
        this.f48979a = 11;
        this.f48980b = jVar;
        this.f48981c = uVar;
        this.f48982d = bVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            y(str, 0, str.length(), 1, true, new hc.a(str));
        }
    }

    public i(j1.k[] kVarArr) {
        this.f48979a = 1;
        e0 e0Var = new e0();
        j1.n nVar = new j1.n();
        nVar.f43612c = 1.0f;
        nVar.f43613d = 1.0f;
        j1.h hVar = j1.h.f43596e;
        nVar.f43614e = hVar;
        nVar.f43615f = hVar;
        nVar.f43616g = hVar;
        nVar.f43617h = hVar;
        ByteBuffer byteBuffer = j1.k.f43603a;
        nVar.f43620k = byteBuffer;
        nVar.l = byteBuffer;
        nVar.f43611b = -1;
        j1.k[] kVarArr2 = new j1.k[kVarArr.length + 2];
        this.f48980b = kVarArr2;
        System.arraycopy(kVarArr, 0, kVarArr2, 0, kVarArr.length);
        this.f48981c = e0Var;
        this.f48982d = nVar;
        kVarArr2[kVarArr.length] = e0Var;
        kVarArr2[kVarArr.length + 1] = nVar;
    }

    public i(ye.b bVar, Cipher cipher, HashMap map) {
        this.f48979a = 16;
        this.f48982d = bVar;
        this.f48980b = cipher;
        this.f48981c = map;
    }
}
