package g9;

import android.accounts.Account;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StatFs;
import android.os.StrictMode;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.a1;
import androidx.lifecycle.c1;
import androidx.lifecycle.r0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.work.OverwritingInputMerger;
import androidx.work.impl.WorkDatabase_Impl;
import com.applovin.sdk.AppLovinEventTypes;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.internal.ads.dm0;
import com.google.android.gms.internal.ads.k3;
import com.google.android.gms.internal.ads.n3;
import com.google.android.gms.internal.ads.nv0;
import com.google.android.gms.internal.auth.h2;
import com.google.android.gms.internal.auth.i2;
import com.google.android.gms.internal.auth.k2;
import com.google.android.gms.internal.consent_sdk.b0;
import com.google.android.gms.internal.consent_sdk.c0;
import com.google.android.gms.internal.consent_sdk.g0;
import com.google.android.gms.internal.consent_sdk.g6;
import com.google.android.gms.internal.consent_sdk.h0;
import com.google.android.gms.internal.consent_sdk.j7;
import com.google.android.gms.internal.consent_sdk.k7;
import com.google.android.gms.internal.consent_sdk.x;
import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.ed;
import com.google.android.gms.internal.measurement.gb;
import com.google.android.gms.internal.measurement.h1;
import com.google.android.gms.internal.measurement.i1;
import com.google.android.gms.internal.measurement.ie;
import com.google.android.gms.internal.measurement.j0;
import com.google.android.gms.internal.measurement.j2;
import com.google.android.gms.internal.measurement.le;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.nb;
import com.google.android.gms.internal.measurement.pb;
import com.google.android.gms.internal.measurement.rc;
import com.google.android.gms.internal.measurement.s0;
import com.google.android.gms.internal.measurement.te;
import com.google.android.gms.internal.measurement.u1;
import com.google.android.gms.internal.measurement.uc;
import com.google.android.gms.internal.measurement.xe;
import com.google.android.gms.internal.measurement.z0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ironsource.O6;
import com.ironsource.X3;
import d5.u;
import ea.d0;
import ea.e2;
import ea.e4;
import ea.g4;
import ea.h3;
import ea.m1;
import ea.p2;
import ea.r2;
import ea.t0;
import ea.u2;
import ea.v0;
import ea.w3;
import eb.p;
import f2.l1;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import io.flutter.view.FlutterCallbackInformation;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.regex.Pattern;
import n6.t;
import n6.v;
import na.r;
import oa.e0;
import oa.q;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParserException;
import xi.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements com.google.android.gms.common.api.internal.k, k7, r2, t0, ig.a, xi.n, OnCompleteListener, t, p5.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static k f41767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f41768f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f41770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f41771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f41772d;

    public /* synthetic */ k(int i10) {
        this.f41769a = i10;
    }

    public static void D(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public static synchronized k J(Context context) {
        k kVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (k.class) {
            kVar = f41767e;
            if (kVar == null) {
                kVar = new k(applicationContext);
                f41767e = kVar;
            }
        }
        return kVar;
        return kVar;
    }

    public static k z(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new k(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public void A(Activity activity, x4.i iVar) {
        WeakHashMap weakHashMap = (WeakHashMap) this.f41772d;
        kotlin.jvm.internal.n.f(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f41771c;
        reentrantLock.lock();
        try {
            if (iVar.equals((x4.i) weakHashMap.get(activity))) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            for (a5.l lVar : ((a5.m) ((n5.f) this.f41770b).f46523b).f3408b) {
                if (lVar.f3402a.equals(activity)) {
                    lVar.f3404c = iVar;
                    lVar.f3403b.accept(iVar);
                }
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void B() {
        ((TypedArray) this.f41771c).recycle();
    }

    public void C(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f41770b;
        workDatabase_Impl.b();
        m5.e eVar = (m5.e) this.f41772d;
        l4.f fVarA = eVar.a();
        if (str == null) {
            fVarA.k(1);
        } else {
            fVarA.n(1, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.t();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public void E(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
        }
        this.f41770b = Integer.valueOf(i10);
    }

    public void F(int i10) throws GeneralSecurityException {
        if (i10 < 10 || 16 < i10) {
            throw new GeneralSecurityException(l1.d.e(i10, "Invalid tag size for AesCmacParameters: "));
        }
        this.f41771c = Integer.valueOf(i10);
    }

    public FileOutputStream G() throws IOException {
        File file = (File) this.f41771c;
        File file2 = (File) this.f41772d;
        if (file2.exists()) {
            D(file2, (File) this.f41770b);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + file);
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e10) {
                throw new IOException("Failed to create new file " + file, e10);
            }
        }
    }

    public synchronized void K() {
        b bVar = (b) this.f41770b;
        ReentrantLock reentrantLock = bVar.f41746a;
        reentrantLock.lock();
        try {
            bVar.f41747b.edit().clear().apply();
            reentrantLock.unlock();
            this.f41771c = null;
            this.f41772d = null;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public bo.e L() {
        String staticPackageName;
        int i10;
        ed edVar;
        ed edVar2;
        String str = (String) this.f41772d;
        pb pbVar = (pb) this.f41770b;
        r rVar = pbVar.f23850f;
        boolean z10 = false;
        int i11 = 3;
        if (!gb.i(pbVar.f23846b)) {
            return new bo.e(le.B(), new n3(i11, 17, z10));
        }
        if (f41768f == null) {
            f41768f = Boolean.valueOf(Process.isIsolated());
        }
        if (f41768f.booleanValue()) {
            return new bo.e(le.B(), new n3(i11, 18, z10));
        }
        ie ieVarB = pbVar.f23851g.b();
        s0 s0Var = ieVarB.f23587c;
        j0 j0Var = j0.FILE;
        x.e eVar = nb.f23773a;
        int iIndexOf = str.indexOf("#");
        if (iIndexOf >= 0) {
            staticPackageName = str.substring(0, iIndexOf);
        } else {
            if (str.contains("@")) {
                throw new IllegalArgumentException("Invalid package name: ".concat(str));
            }
            staticPackageName = str;
        }
        kotlin.jvm.internal.n.f(staticPackageName, "staticPackageName");
        int i12 = 5;
        if (!ieVarB.f23592h) {
            i10 = 14;
        } else if (!ieVarB.f23585a || !ieVarB.f23586b.contains(j0Var)) {
            i10 = 3;
        } else if (s0Var.h() != 0) {
            List list = ieVarB.f23590f;
            if (list.isEmpty() || list.contains(staticPackageName)) {
                i10 = ieVarB.f23591g.contains(staticPackageName) ? 6 : 0;
            } else {
                i10 = 5;
            }
        } else {
            i10 = 4;
        }
        int i13 = 7;
        if (i10 != 0) {
            edVar2 = new ed(null, new n3(i10));
        } else {
            try {
                String str2 = ieVarB.f23589e;
                if (str2.isEmpty()) {
                    na.h hVar = (na.h) pbVar.f23852h.get();
                    if (hVar.g()) {
                        str2 = ((ApplicationInfo) hVar.d()).dataDir;
                    } else {
                        gb.g(Level.WARNING, pbVar.a(), null, "Unable to get GMS application info, using defaults.", new Object[0]);
                        edVar = new ed(rc.f23931c, new n3(i11, i13, z10));
                        edVar2 = edVar;
                    }
                }
                String str3 = File.separator;
                String str4 = ieVarB.f23588d;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
                sb2.append(str2);
                sb2.append(str3);
                sb2.append(str4);
                String string = sb2.toString();
                k kVar = new k(s0Var, str);
                Uri.Builder builderScheme = new Uri.Builder().scheme(X3.i.f27782b);
                String string2 = kVar.M().toString();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + string.length() + String.valueOf(str3).length() + string2.length());
                sb3.append(str3);
                sb3.append(string);
                sb3.append(str3);
                sb3.append(string2);
                Uri uriBuild = builderScheme.appendEncodedPath(sb3.toString()).build();
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                try {
                    try {
                        try {
                            ed edVar3 = new ed((rc) ((te) rVar.get()).a(uriBuild, new mb.b(ieVarB.f23595k.u())), new n3(i12, 2, z10));
                            StrictMode.setThreadPolicy(threadPolicy);
                            edVar2 = edVar3;
                        } catch (FileNotFoundException unused) {
                            gb.g(Level.INFO, pbVar.a(), null, "Shared storage file not found for %s", str);
                            edVar2 = new ed(null, new n3(8));
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                    } catch (u1 e10) {
                        gb.g(Level.SEVERE, pbVar.a(), e10, "Failed to parse snapshot from shared storage for %s", str);
                        edVar2 = new ed(null, new n3(9));
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                } catch (Throwable th2) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th2;
                }
            } catch (Exception e11) {
                gb.g(Level.WARNING, pbVar.a(), e11, "Failed to read shared file for %s", str);
                edVar = new ed(rc.f23931c, new n3(i11, 10, z10));
            }
        }
        n3 n3Var = edVar2.f23424b;
        rc rcVar = edVar2.f23423a;
        if (rcVar != null) {
            return new bo.e(rcVar, n3Var);
        }
        int i14 = n3Var.f17625b;
        try {
            te teVar = (te) rVar.get();
            Uri uri = (Uri) this.f41771c;
            j2 j2Var = (j2) le.B().t(7);
            z0 z0Var = z0.f24189a;
            int i15 = n0.f23760a;
            z0 z0Var2 = z0.f24190b;
            InputStream inputStreamD = e1.d(teVar.b(uri));
            try {
                i1 i1VarA = ((h1) j2Var).a(inputStreamD, z0Var2);
                if (inputStreamD != null) {
                    inputStreamD.close();
                }
                return new bo.e((le) i1VarA, new n3(4, i14, z10));
            } catch (Throwable th3) {
                if (inputStreamD == null) {
                    throw th3;
                }
                try {
                    inputStreamD.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException | RuntimeException unused2) {
            gb.g(Level.INFO, pbVar.a(), null, "Unable to retrieve flag snapshot for %s, using defaults.", str);
            return N() ? new bo.e(rc.f23931c, new n3(i11, 16, z10)) : new bo.e(le.B(), new n3(i11, 11, z10));
        }
    }

    public File M() {
        String str = (String) ((r) this.f41771c).get();
        String str2 = (String) ((r) this.f41772d).get();
        return new File(u.h(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length() + 3), str, "/", str2, ".pb"));
    }

    public boolean N() {
        uc ucVarC = ((pb) this.f41770b).f23851g.c();
        return ucVarC.w() && ((AbstractCollection) ucVarC.B()).contains(j0.FILE);
    }

    @Override // ig.a
    public void a(vf.c type, MediaFormat format) {
        kotlin.jvm.internal.n.f(type, "type");
        kotlin.jvm.internal.n.f(format, "format");
        ((ig.a) this.f41770b).a(type, format);
    }

    @Override // com.google.android.gms.common.api.internal.k
    public void accept(Object obj, Object obj2) {
        Account account = (Account) this.f41770b;
        String str = (String) this.f41771c;
        Bundle bundle = (Bundle) this.f41772d;
        i2 i2Var = (i2) ((h2) obj).getService();
        k2 k2Var = new k2((TaskCompletionSource) obj2);
        i2Var.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(i2Var.f22790c);
        int i10 = com.google.android.gms.internal.auth.f.f22820a;
        parcelObtain.writeStrongBinder(k2Var);
        com.google.android.gms.internal.auth.f.b(parcelObtain, account);
        parcelObtain.writeString(str);
        com.google.android.gms.internal.auth.f.b(parcelObtain, bundle);
        i2Var.w1(parcelObtain, 1);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:51:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:51:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0063 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:51:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0067 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:51:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x006b A[Catch: all -> 0x0023, PHI: r10
  0x006b: PHI (r10v20 int) = (r10v14 int), (r10v0 int) binds: [B:14:0x0030, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0020, B:21:0x006b, B:24:0x008f, B:15:0x0032, B:17:0x0058, B:19:0x0063, B:20:0x0067), top: B:51:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e0 A[PHI: r10
  0x00e0: PHI (r10v8 int) = (r10v1 int), (r10v0 int) binds: [B:36:0x00c5, B:34:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0117  */
    /* JADX WARN: Code duplicated, block: B:41:0x011a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ea.r2
    public void b(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        u2 u2Var;
        v0 v0Var;
        ea.m mVar;
        String strSubstring;
        Object obj;
        switch (this.f41769a) {
            case 11:
                p2 p2Var = (p2) this.f41770b;
                p2Var.G0();
                w3 w3Var = (w3) this.f41772d;
                if (i10 == 200 || i10 == 204) {
                    if (th2 == null) {
                        ea.s0 s0Var = ((m1) p2Var.f3623a).f39587f;
                        m1.h(s0Var);
                        s0Var.f39760n.c(Long.valueOf(w3Var.f39869a), "[sgtm] Upload succeeded for row_id");
                        u2Var = u2.SUCCESS;
                    } else {
                        ea.s0 s0Var2 = ((m1) p2Var.f3623a).f39587f;
                        m1.h(s0Var2);
                        s0Var2.f39756i.e("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(w3Var.f39869a), Integer.valueOf(i10), th2);
                        if (Arrays.asList(((String) d0.f39332u.a(null)).split(",")).contains(String.valueOf(i10))) {
                            u2Var = u2.BACKOFF;
                        } else {
                            u2Var = u2.FAILURE;
                        }
                    }
                } else if (i10 == 304) {
                    i10 = 304;
                    if (th2 == null) {
                        ea.s0 s0Var3 = ((m1) p2Var.f3623a).f39587f;
                        m1.h(s0Var3);
                        s0Var3.f39760n.c(Long.valueOf(w3Var.f39869a), "[sgtm] Upload succeeded for row_id");
                        u2Var = u2.SUCCESS;
                    } else {
                        ea.s0 s0Var4 = ((m1) p2Var.f3623a).f39587f;
                        m1.h(s0Var4);
                        s0Var4.f39756i.e("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(w3Var.f39869a), Integer.valueOf(i10), th2);
                        if (Arrays.asList(((String) d0.f39332u.a(null)).split(",")).contains(String.valueOf(i10))) {
                            u2Var = u2.BACKOFF;
                        } else {
                            u2Var = u2.FAILURE;
                        }
                    }
                } else {
                    ea.s0 s0Var5 = ((m1) p2Var.f3623a).f39587f;
                    m1.h(s0Var5);
                    s0Var5.f39756i.e("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(w3Var.f39869a), Integer.valueOf(i10), th2);
                    if (Arrays.asList(((String) d0.f39332u.a(null)).split(",")).contains(String.valueOf(i10))) {
                        u2Var = u2.BACKOFF;
                    } else {
                        u2Var = u2.FAILURE;
                    }
                }
                AtomicReference atomicReference = (AtomicReference) this.f41771c;
                h3 h3VarK = ((m1) p2Var.f3623a).k();
                long j10 = w3Var.f39869a;
                ea.d dVar = new ea.d(j10, u2Var.f39788a, w3Var.f39874f);
                h3VarK.G0();
                h3VarK.H0();
                h3VarK.U0(new m0(h3VarK, h3VarK.W0(true), dVar, false, 15));
                ea.s0 s0Var6 = ((m1) p2Var.f3623a).f39587f;
                m1.h(s0Var6);
                s0Var6.f39760n.d("[sgtm] Updated status for row_id", Long.valueOf(j10), u2Var);
                synchronized (atomicReference) {
                    atomicReference.set(u2Var);
                    atomicReference.notifyAll();
                    break;
                }
                return;
            default:
                long j11 = ((g4) this.f41771c).f39430a;
                e4 e4Var = (e4) this.f41772d;
                String str2 = (String) this.f41770b;
                e4Var.P().G0();
                e4Var.m0();
                if (bArr == null) {
                    try {
                        bArr = new byte[0];
                    } finally {
                        e4Var.f39390u = false;
                        e4Var.L();
                    }
                }
                if (i10 == 200) {
                    if (th2 == null) {
                        ea.m mVar2 = e4Var.f39373c;
                        e4.T(mVar2);
                        mVar2.N0(Long.valueOf(j11));
                        e4Var.t().f39760n.d("Successfully uploaded batch from upload queue. appId, status", str2, Integer.valueOf(i10));
                        v0Var = e4Var.f39372b;
                        e4.T(v0Var);
                        if (v0Var.K0()) {
                            mVar = e4Var.f39373c;
                            e4.T(mVar);
                            if (mVar.M0(str2)) {
                                e4Var.p(str2);
                            } else {
                                e4Var.K();
                            }
                        } else {
                            e4Var.K();
                        }
                    } else {
                        String str3 = new String(bArr, StandardCharsets.UTF_8);
                        strSubstring = str3.substring(0, Math.min(32, str3.length()));
                        bo.b bVar = e4Var.t().f39758k;
                        Integer numValueOf = Integer.valueOf(i10);
                        obj = th2;
                        if (th2 == null) {
                            obj = strSubstring;
                        }
                        bVar.e("Network upload failed. Will retry later. appId, status, error", str2, numValueOf, obj);
                        ea.m mVar3 = e4Var.f39373c;
                        e4.T(mVar3);
                        mVar3.S0(Long.valueOf(j11));
                        e4Var.K();
                    }
                } else if (i10 == 204) {
                    i10 = 204;
                    if (th2 == null) {
                        ea.m mVar4 = e4Var.f39373c;
                        e4.T(mVar4);
                        mVar4.N0(Long.valueOf(j11));
                        e4Var.t().f39760n.d("Successfully uploaded batch from upload queue. appId, status", str2, Integer.valueOf(i10));
                        v0Var = e4Var.f39372b;
                        e4.T(v0Var);
                        if (v0Var.K0()) {
                            mVar = e4Var.f39373c;
                            e4.T(mVar);
                            if (mVar.M0(str2)) {
                                e4Var.p(str2);
                            } else {
                                e4Var.K();
                            }
                        } else {
                            e4Var.K();
                        }
                    } else {
                        String str4 = new String(bArr, StandardCharsets.UTF_8);
                        strSubstring = str4.substring(0, Math.min(32, str4.length()));
                        bo.b bVar2 = e4Var.t().f39758k;
                        Integer numValueOf2 = Integer.valueOf(i10);
                        obj = th2;
                        if (th2 == null) {
                            obj = strSubstring;
                        }
                        bVar2.e("Network upload failed. Will retry later. appId, status, error", str2, numValueOf2, obj);
                        ea.m mVar5 = e4Var.f39373c;
                        e4.T(mVar5);
                        mVar5.S0(Long.valueOf(j11));
                        e4Var.K();
                    }
                } else {
                    String str5 = new String(bArr, StandardCharsets.UTF_8);
                    strSubstring = str5.substring(0, Math.min(32, str5.length()));
                    bo.b bVar3 = e4Var.t().f39758k;
                    Integer numValueOf3 = Integer.valueOf(i10);
                    obj = th2;
                    if (th2 == null) {
                        obj = strSubstring;
                    }
                    bVar3.e("Network upload failed. Will retry later. appId, status, error", str2, numValueOf3, obj);
                    ea.m mVar6 = e4Var.f39373c;
                    e4.T(mVar6);
                    mVar6.S0(Long.valueOf(j11));
                    e4Var.K();
                }
                return;
        }
    }

    @Override // ig.a
    public void c(vf.c type, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ig.a aVar = (ig.a) this.f41770b;
        kotlin.jvm.internal.n.f(type, "type");
        kotlin.jvm.internal.n.f(byteBuffer, "byteBuffer");
        kotlin.jvm.internal.n.f(bufferInfo, "bufferInfo");
        if (!((Boolean) ((dg.b) this.f41771c).invoke()).booleanValue()) {
            aVar.c(type, byteBuffer, bufferInfo);
            return;
        }
        int i10 = bufferInfo.flags & (-5);
        int i11 = bufferInfo.size;
        if (i11 > 0 || i10 != 0) {
            ((MediaCodec.BufferInfo) this.f41772d).set(bufferInfo.offset, i11, bufferInfo.presentationTimeUs, i10);
            aVar.c(type, byteBuffer, (MediaCodec.BufferInfo) this.f41772d);
        }
    }

    public bb.a d() throws GeneralSecurityException {
        s4.i iVar;
        lb.a aVarB;
        bb.e eVar = (bb.e) this.f41770b;
        if (eVar == null || (iVar = (s4.i) this.f41771c) == null) {
            throw new IllegalArgumentException("Cannot build without parameters and/or key material");
        }
        if (eVar.f5524a != ((lb.a) iVar.f50111a).f45273a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (eVar.a() && ((Integer) this.f41772d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((bb.e) this.f41770b).a() && ((Integer) this.f41772d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        bb.d dVar = ((bb.e) this.f41770b).f5525b;
        if (dVar == bb.d.f5522d) {
            aVarB = p.f40006a;
        } else if (dVar == bb.d.f5521c) {
            aVarB = p.a(((Integer) this.f41772d).intValue());
        } else {
            if (dVar != bb.d.f5520b) {
                throw new IllegalStateException("Unknown AesSivParameters.Variant: " + ((bb.e) this.f41770b).f5525b);
            }
            aVarB = p.b(((Integer) this.f41772d).intValue());
        }
        return new bb.a((bb.e) this.f41770b, (s4.i) this.f41771c, aVarB, (Integer) this.f41772d);
    }

    public d5.p e() {
        UUID uuid = (UUID) this.f41770b;
        m5.i iVar = (m5.i) this.f41771c;
        HashSet hashSet = (HashSet) this.f41772d;
        d5.p pVar = new d5.p();
        pVar.f38704a = uuid;
        pVar.f38705b = iVar;
        pVar.f38706c = hashSet;
        d5.b bVar = iVar.f45891j;
        boolean z10 = bVar.f38683h.f38686a.size() > 0 || bVar.f38679d || bVar.f38677b || bVar.f38678c;
        if (((m5.i) this.f41771c).f45897q && z10) {
            throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
        }
        this.f41770b = UUID.randomUUID();
        m5.i iVar2 = (m5.i) this.f41771c;
        m5.i iVar3 = new m5.i();
        iVar3.f45883b = 1;
        d5.f fVar = d5.f.f38690c;
        iVar3.f45886e = fVar;
        iVar3.f45887f = fVar;
        iVar3.f45891j = d5.b.f38675i;
        iVar3.l = 1;
        iVar3.f45893m = 30000L;
        iVar3.f45896p = -1L;
        iVar3.f45898r = 1;
        iVar3.f45882a = iVar2.f45882a;
        iVar3.f45884c = iVar2.f45884c;
        iVar3.f45883b = iVar2.f45883b;
        iVar3.f45885d = iVar2.f45885d;
        iVar3.f45886e = new d5.f(iVar2.f45886e);
        iVar3.f45887f = new d5.f(iVar2.f45887f);
        iVar3.f45888g = iVar2.f45888g;
        iVar3.f45889h = iVar2.f45889h;
        iVar3.f45890i = iVar2.f45890i;
        d5.b bVar2 = iVar2.f45891j;
        d5.b bVar3 = new d5.b();
        bVar3.f38676a = 1;
        bVar3.f38681f = -1L;
        bVar3.f38682g = -1L;
        bVar3.f38683h = new d5.d();
        bVar3.f38677b = bVar2.f38677b;
        bVar3.f38678c = bVar2.f38678c;
        bVar3.f38676a = bVar2.f38676a;
        bVar3.f38679d = bVar2.f38679d;
        bVar3.f38680e = bVar2.f38680e;
        bVar3.f38683h = bVar2.f38683h;
        iVar3.f45891j = bVar3;
        iVar3.f45892k = iVar2.f45892k;
        iVar3.l = iVar2.l;
        iVar3.f45893m = iVar2.f45893m;
        iVar3.f45894n = iVar2.f45894n;
        iVar3.f45895o = iVar2.f45895o;
        iVar3.f45896p = iVar2.f45896p;
        iVar3.f45897q = iVar2.f45897q;
        iVar3.f45898r = iVar2.f45898r;
        this.f41771c = iVar3;
        iVar3.f45882a = ((UUID) this.f41770b).toString();
        return pVar;
    }

    public fb.d f() throws GeneralSecurityException {
        Integer num = (Integer) this.f41770b;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f41771c) == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (((fb.c) this.f41772d) != null) {
            return new fb.d(num.intValue(), ((Integer) this.f41771c).intValue(), (fb.c) this.f41772d);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public void finalize() throws Throwable {
        switch (this.f41769a) {
            case 25:
                release();
                break;
            default:
                super.finalize();
                break;
        }
    }

    public void g(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        HashMap map = (HashMap) this.f41770b;
        pc.f fVar = new pc.f(byteArrayOutputStream, map, (HashMap) this.f41771c, (mc.d) this.f41772d);
        mc.d dVar = (mc.d) map.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
        } else {
            throw new mc.b("No encoder for " + obj.getClass());
        }
    }

    @Override // n6.t
    public Bitmap h(BitmapFactory.Options options) {
        switch (this.f41769a) {
            case 23:
                return BitmapFactory.decodeStream(new a7.a(a7.c.c((ByteBuffer) this.f41770b)), null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((com.bumptech.glide.load.data.i) this.f41772d).e().getFileDescriptor(), null, options);
        }
    }

    public void i(Intent intent, CountDownLatch countDownLatch) {
        if (((ni.c) this.f41772d) == null) {
            Log.i("FLTFireBGExecutor", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        gj.b bVar = countDownLatch != null ? new gj.b(countDownLatch) : null;
        byte[] byteArrayExtra = intent.getByteArrayExtra("notification");
        if (byteArrayExtra == null) {
            Log.e("FLTFireBGExecutor", "RemoteMessage byte array not found in Intent.");
            return;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            parcelObtain.setDataPosition(0);
            HashMap mapG = android.support.v4.media.session.a.G(zc.t.CREATOR.createFromParcel(parcelObtain));
            xi.p pVar = (xi.p) this.f41771c;
            dd.f fVar = new dd.f();
            fVar.put("userCallbackHandle", Long.valueOf(a.a.f3311a.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("user_callback_handle", 0L)));
            fVar.put("message", mapG);
            pVar.a("MessagingBackground#onMessage", fVar, bVar);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // n6.t
    public void j() {
        int i10 = this.f41769a;
    }

    public void k(Runnable runnable) {
        ((n5.j) this.f41770b).execute(runnable);
    }

    public void l(FileOutputStream fileOutputStream) {
        File file = (File) this.f41771c;
        if (fileOutputStream == null) {
            return;
        }
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e10) {
            Log.e("AtomicFile", "Failed to close file output stream", e10);
        }
        if (file.delete()) {
            return;
        }
        Log.e("AtomicFile", "Failed to delete new file " + file);
    }

    public void m(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e10) {
            Log.e("AtomicFile", "Failed to close file output stream", e10);
        }
        D((File) this.f41771c, (File) this.f41770b);
    }

    public x0 n(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return p(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // n6.t
    public int o() throws Throwable {
        switch (this.f41769a) {
            case 23:
                List list = (List) this.f41771c;
                ByteBuffer byteBufferC = a7.c.c((ByteBuffer) this.f41770b);
                dm0 dm0Var = (dm0) this.f41772d;
                if (byteBufferC == null) {
                    return -1;
                }
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    try {
                        int iD = ((e6.e) list.get(i10)).d(byteBufferC, dm0Var);
                        if (iD != -1) {
                            return iD;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return -1;
            default:
                List list2 = (List) this.f41771c;
                com.bumptech.glide.load.data.i iVar = (com.bumptech.glide.load.data.i) this.f41772d;
                dm0 dm0Var2 = (dm0) this.f41770b;
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    e6.e eVar = (e6.e) list2.get(i11);
                    v vVar = null;
                    try {
                        v vVar2 = new v(new FileInputStream(iVar.e().getFileDescriptor()), dm0Var2);
                        try {
                            int iB = eVar.b(vVar2, dm0Var2);
                            vVar2.d();
                            iVar.e();
                            if (iB != -1) {
                                return iB;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            vVar = vVar2;
                            if (vVar != null) {
                                vVar.d();
                            }
                            iVar.e();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                return -1;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        h9.c cVar = (h9.c) this.f41770b;
        String str = (String) this.f41771c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f41772d;
        x.i iVar = cVar.f42258a;
        synchronized (iVar) {
            iVar.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0138  */
    /* JADX WARN: Code duplicated, block: B:56:0x01aa  */
    @Override // xi.n
    public void onMethodCall(xi.m call, o oVar) {
        boolean z10;
        switch (this.f41769a) {
            case 16:
                kotlin.jvm.internal.n.f(call, "call");
                if (!call.f53822a.equals("getDeviceInfo")) {
                    ((wi.j) oVar).c();
                    return;
                }
                HashMap map = new HashMap();
                map.put("board", Build.BOARD);
                map.put("bootloader", Build.BOOTLOADER);
                String BRAND = Build.BRAND;
                map.put("brand", BRAND);
                String DEVICE = Build.DEVICE;
                map.put(X3.i.G, DEVICE);
                map.put(X3.i.f27786d, Build.DISPLAY);
                String FINGERPRINT = Build.FINGERPRINT;
                map.put("fingerprint", FINGERPRINT);
                String HARDWARE = Build.HARDWARE;
                map.put("hardware", HARDWARE);
                map.put("host", Build.HOST);
                map.put("id", Build.ID);
                String MANUFACTURER = Build.MANUFACTURER;
                map.put("manufacturer", MANUFACTURER);
                String MODEL = Build.MODEL;
                map.put(O6.B, MODEL);
                String PRODUCT = Build.PRODUCT;
                map.put(AppLovinEventTypes.USER_VIEWED_PRODUCT, PRODUCT);
                String string = Settings.Global.getString((ContentResolver) this.f41772d, "device_name");
                if (string == null) {
                    string = "";
                }
                map.put("name", string);
                String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
                map.put("supported32BitAbis", xj.o.Q(Arrays.copyOf(strArr, strArr.length)));
                String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
                map.put("supported64BitAbis", xj.o.Q(Arrays.copyOf(strArr2, strArr2.length)));
                String[] strArr3 = Build.SUPPORTED_ABIS;
                map.put("supportedAbis", xj.o.Q(Arrays.copyOf(strArr3, strArr3.length)));
                map.put("tags", Build.TAGS);
                map.put("type", Build.TYPE);
                kotlin.jvm.internal.n.e(BRAND, "BRAND");
                if (an.p.p0(BRAND, "generic", false)) {
                    kotlin.jvm.internal.n.e(DEVICE, "DEVICE");
                    if (an.p.p0(DEVICE, "generic", false)) {
                        z10 = true;
                    } else {
                        kotlin.jvm.internal.n.e(FINGERPRINT, "FINGERPRINT");
                        if (!an.p.p0(FINGERPRINT, "generic", false) || an.p.p0(FINGERPRINT, "unknown", false)) {
                            z10 = true;
                        } else {
                            kotlin.jvm.internal.n.e(HARDWARE, "HARDWARE");
                            if (an.h.q0(HARDWARE, "goldfish", false) || an.h.q0(HARDWARE, "ranchu", false)) {
                                z10 = true;
                            } else {
                                kotlin.jvm.internal.n.e(MODEL, "MODEL");
                                if (an.h.q0(MODEL, "google_sdk", false) || an.h.q0(MODEL, "Emulator", false) || an.h.q0(MODEL, "Android SDK built for x86", false)) {
                                    z10 = true;
                                } else {
                                    kotlin.jvm.internal.n.e(MANUFACTURER, "MANUFACTURER");
                                    if (an.h.q0(MANUFACTURER, "Genymotion", false)) {
                                        z10 = true;
                                    } else {
                                        kotlin.jvm.internal.n.e(PRODUCT, "PRODUCT");
                                        if (an.h.q0(PRODUCT, "sdk", false) || an.h.q0(PRODUCT, "vbox86p", false) || an.h.q0(PRODUCT, "emulator", false) || an.h.q0(PRODUCT, "simulator", false)) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    kotlin.jvm.internal.n.e(FINGERPRINT, "FINGERPRINT");
                    if (an.p.p0(FINGERPRINT, "generic", false)) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                }
                map.put("isPhysicalDevice", Boolean.valueOf(!z10));
                FeatureInfo[] systemAvailableFeatures = ((PackageManager) this.f41770b).getSystemAvailableFeatures();
                kotlin.jvm.internal.n.e(systemAvailableFeatures, "getSystemAvailableFeatures(...)");
                ArrayList arrayList = new ArrayList();
                for (FeatureInfo featureInfo : systemAvailableFeatures) {
                    if (featureInfo.name != null) {
                        arrayList.add(featureInfo);
                    }
                }
                ArrayList arrayList2 = new ArrayList(xj.p.W(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((FeatureInfo) it.next()).name);
                }
                map.put("systemFeatures", arrayList2);
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                map.put("freeDiskSize", Long.valueOf(statFs.getFreeBytes()));
                map.put("totalDiskSize", Long.valueOf(statFs.getTotalBytes()));
                HashMap map2 = new HashMap();
                int i10 = Build.VERSION.SDK_INT;
                map2.put("baseOS", Build.VERSION.BASE_OS);
                map2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
                map2.put("securityPatch", Build.VERSION.SECURITY_PATCH);
                map2.put("codename", Build.VERSION.CODENAME);
                map2.put("incremental", Build.VERSION.INCREMENTAL);
                map2.put("release", Build.VERSION.RELEASE);
                map2.put("sdkInt", Integer.valueOf(i10));
                map.put("version", map2);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) this.f41771c).getMemoryInfo(memoryInfo);
                map.put("isLowRamDevice", Boolean.valueOf(memoryInfo.lowMemory));
                map.put("physicalRamSize", Long.valueOf(memoryInfo.totalMem / 1048576));
                map.put("availableRamSize", Long.valueOf(memoryInfo.availMem / 1048576));
                ((wi.j) oVar).a(map);
                return;
            default:
                if (!call.f53822a.equals("MessagingBackground#initialized")) {
                    ((wi.j) oVar).c();
                    return;
                }
                ((AtomicBoolean) this.f41770b).set(true);
                List list = FlutterFirebaseMessagingBackgroundService.f43400h;
                Log.i("FLTFireMsgService", "FlutterFirebaseMessagingBackgroundService started!");
                List list2 = FlutterFirebaseMessagingBackgroundService.f43400h;
                synchronized (list2) {
                    try {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            FlutterFirebaseMessagingBackgroundService.f43401i.i((Intent) it2.next(), null);
                        }
                        FlutterFirebaseMessagingBackgroundService.f43400h.clear();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                ((wi.j) oVar).a(Boolean.TRUE);
                return;
        }
    }

    public x0 p(Class cls, String key) {
        x0 viewModel;
        a1 a1Var = (a1) this.f41771c;
        kotlin.jvm.internal.n.f(key, "key");
        c1 c1Var = (c1) this.f41770b;
        c1Var.getClass();
        LinkedHashMap linkedHashMap = c1Var.f4532a;
        x0 x0Var = (x0) linkedHashMap.get(key);
        if (!cls.isInstance(x0Var)) {
            e1.c cVar = new e1.c((e1.b) this.f41772d);
            cVar.f39019a.put(y0.f4621b, key);
            try {
                viewModel = a1Var.b(cls, cVar);
            } catch (AbstractMethodError unused) {
                viewModel = a1Var.a(cls);
            }
            kotlin.jvm.internal.n.f(viewModel, "viewModel");
            x0 x0Var2 = (x0) linkedHashMap.put(key, viewModel);
            if (x0Var2 != null) {
                x0Var2.b();
            }
            return viewModel;
        }
        u0 u0Var = a1Var instanceof u0 ? (u0) a1Var : null;
        if (u0Var != null) {
            kotlin.jvm.internal.n.c(x0Var);
            androidx.lifecycle.o oVar = u0Var.f4598d;
            if (oVar != null) {
                j4.e eVar = u0Var.f4599e;
                kotlin.jvm.internal.n.c(eVar);
                r0.a(x0Var, eVar, oVar);
            }
        }
        kotlin.jvm.internal.n.d(x0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return x0Var;
    }

    public ColorStateList q(int i10) {
        int resourceId;
        ColorStateList colorStateListH;
        TypedArray typedArray = (TypedArray) this.f41771c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListH = com.google.android.gms.internal.auth.o.h((Context) this.f41770b, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateListH;
    }

    public long r() {
        n2.h hVar = (n2.h) this.f41772d;
        if (hVar != null) {
            return hVar.f46466d;
        }
        return -1L;
    }

    @Override // ig.a
    public void release() {
        switch (this.f41769a) {
            case 13:
                ((ig.a) this.f41770b).release();
                break;
            default:
                pf.c cVar = (pf.c) this.f41770b;
                pf.c cVar2 = pf.d.f48353b;
                if (cVar != cVar2) {
                    pf.e eVar = pf.d.f48354c;
                    pf.b bVar = pf.d.f48352a;
                    EGLDisplay eGLDisplay = cVar.f48351a;
                    EGLSurface eGLSurface = eVar.f48368a;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, bVar.f48350a);
                    EGL14.eglDestroyContext(((pf.c) this.f41770b).f48351a, ((pf.b) this.f41771c).f48350a);
                    EGL14.eglReleaseThread();
                    EGL14.eglTerminate(((pf.c) this.f41770b).f48351a);
                }
                this.f41770b = cVar2;
                this.f41771c = pf.d.f48352a;
                this.f41772d = null;
                break;
        }
    }

    public Drawable s(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f41771c;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : com.google.android.gms.internal.auth.o.i((Context) this.f41770b, resourceId);
    }

    @Override // ig.a
    public void stop() {
        ((ig.a) this.f41770b).stop();
    }

    public Drawable t(int i10) {
        int resourceId;
        Drawable drawableD;
        if (!((TypedArray) this.f41771c).hasValue(i10) || (resourceId = ((TypedArray) this.f41771c).getResourceId(i10, 0)) == 0) {
            return null;
        }
        p.t tVarA = p.t.a();
        Context context = (Context) this.f41770b;
        synchronized (tVarA) {
            drawableD = tVarA.f47813a.d(context, resourceId, true);
        }
        return drawableD;
    }

    public String toString() {
        switch (this.f41769a) {
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                StringBuilder sb2 = new StringBuilder("DartCallback( bundle path: ");
                sb2.append((String) this.f41771c);
                sb2.append(", library path: ");
                FlutterCallbackInformation flutterCallbackInformation = (FlutterCallbackInformation) this.f41772d;
                sb2.append(flutterCallbackInformation.callbackLibraryPath);
                sb2.append(", function: ");
                return defpackage.e.q(flutterCallbackInformation.callbackName, " )", sb2);
            default:
                return super.toString();
        }
    }

    public Typeface u(int i10, int i11, k3 k3Var) throws Exception {
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f41771c).getResourceId(i10, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.f41772d) == null) {
                this.f41772d = new TypedValue();
            }
            Context context = (Context) this.f41770b;
            TypedValue typedValue = (TypedValue) this.f41772d;
            ThreadLocal threadLocal = e0.j.f39004a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String string = charSequence.toString();
                if (!string.startsWith("res/")) {
                    k3Var.a();
                    return null;
                }
                Typeface typeface = (Typeface) f0.d.f40263b.g(f0.d.d(resources, resourceId, string, typedValue.assetCookie, i11));
                int i12 = 7;
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new com.unity3d.services.ads.operation.show.b(i12, k3Var, typeface));
                    return typeface;
                }
                try {
                    try {
                        if (!string.toLowerCase().endsWith(".xml")) {
                            Typeface typefaceC = f0.d.c(resources, resourceId, string, typedValue.assetCookie, i11);
                            if (typefaceC != null) {
                                new Handler(Looper.getMainLooper()).post(new com.unity3d.services.ads.operation.show.b(i12, k3Var, typefaceC));
                            } else {
                                k3Var.a();
                            }
                            return typefaceC;
                        }
                        e0.d dVarD = e0.b.d(resources.getXml(resourceId), resources);
                        if (dVarD != null) {
                            return f0.d.b(context, dVarD, resources, resourceId, string, typedValue.assetCookie, i11, k3Var);
                        }
                        try {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            k3Var.a();
                            return null;
                        } catch (IOException e10) {
                            iOException = e10;
                        } catch (XmlPullParserException e11) {
                            xmlPullParserException = e11;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                            k3Var.a();
                            return null;
                        }
                    } catch (IOException e12) {
                        e = e12;
                        iOException = e;
                    } catch (XmlPullParserException e13) {
                        e = e13;
                        xmlPullParserException = e;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                        k3Var.a();
                        return null;
                    }
                } catch (IOException e14) {
                    e = e14;
                } catch (XmlPullParserException e15) {
                    e = e15;
                }
                iOException = e;
                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), iOException);
                k3Var.a();
                return null;
            }
        }
        return null;
    }

    @Override // n6.t
    public ImageHeaderParser$ImageType v() throws Throwable {
        switch (this.f41769a) {
            case 23:
                return com.google.android.gms.internal.auth.o.p((List) this.f41771c, a7.c.c((ByteBuffer) this.f41770b));
            default:
                List list = (List) this.f41771c;
                com.bumptech.glide.load.data.i iVar = (com.bumptech.glide.load.data.i) this.f41772d;
                dm0 dm0Var = (dm0) this.f41770b;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    e6.e eVar = (e6.e) list.get(i10);
                    v vVar = null;
                    try {
                        v vVar2 = new v(new FileInputStream(iVar.e().getFileDescriptor()), dm0Var);
                        try {
                            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeC = eVar.c(vVar2);
                            vVar2.d();
                            iVar.e();
                            if (imageHeaderParser$ImageTypeC != ImageHeaderParser$ImageType.UNKNOWN) {
                                return imageHeaderParser$ImageTypeC;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            vVar = vVar2;
                            if (vVar != null) {
                                vVar.d();
                            }
                            iVar.e();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public m5.d w(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f41770b;
        g4.h hVarB = g4.h.b(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            hVarB.h(1);
        } else {
            hVarB.j(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(hVarB);
        try {
            return cursorG.moveToFirst() ? new m5.d(cursorG.getString(com.bumptech.glide.d.w(cursorG, "work_spec_id")), cursorG.getInt(com.bumptech.glide.d.w(cursorG, "system_id"))) : null;
        } finally {
            cursorG.close();
            hVarB.k();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    public void x(n1.h hVar, Uri uri, Map map, long j10, long j11, f2.v0 v0Var) throws l1 {
        n2.h hVar2 = new n2.h(hVar, j10, j11);
        this.f41772d = hVar2;
        if (((n2.k) this.f41771c) != null) {
            return;
        }
        n2.k[] kVarArrD = ((n2.n) this.f41770b).d(uri, map);
        e0 e0VarV = oa.j0.v(kVarArrD.length);
        boolean z10 = true;
        if (kVarArrD.length == 1) {
            this.f41771c = kVarArrD[0];
        } else {
            for (n2.k kVar : kVarArrD) {
                try {
                    if (kVar.a(hVar2)) {
                        this.f41771c = kVar;
                        hVar2.f46468f = 0;
                        break;
                    }
                    e0VarV.d(kVar.d());
                    boolean z11 = ((n2.k) this.f41771c) != null || hVar2.f46466d == j10;
                    go.k.t(z11);
                    hVar2.f46468f = 0;
                } catch (EOFException unused) {
                    if (((n2.k) this.f41771c) != null || hVar2.f46466d == j10) {
                    }
                } catch (Throwable th2) {
                    if (((n2.k) this.f41771c) == null && hVar2.f46466d != j10) {
                        z10 = false;
                    }
                    go.k.t(z10);
                    hVar2.f46468f = 0;
                    throw th2;
                }
                go.k.t(z11);
                hVar2.f46468f = 0;
            }
            if (((n2.k) this.f41771c) == null) {
                String str = "None of the available extractors (" + new na.g(", ").C(q.z(oa.j0.y(kVarArrD), new d2.c(1))) + ") could read the stream.";
                uri.getClass();
                throw new l1(str, e0VarV.g());
            }
        }
        ((n2.k) this.f41771c).c(v0Var);
    }

    public void y(m5.d dVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f41770b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((m5.b) this.f41771c).e(dVar);
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.l7
    public Object zzb() {
        Application application = (Application) ((g6) this.f41771c).f23023b;
        g0 g0Var = h0.f23035b;
        com.google.android.gms.internal.consent_sdk.j0.c(g0Var);
        return new c0(application, g0Var, (b0) ((j7) this.f41772d).zzb(), false);
    }

    public /* synthetic */ k(com.google.android.gms.internal.auth.b bVar, Account account, String str, Bundle bundle) {
        this.f41769a = 4;
        this.f41770b = account;
        this.f41771c = str;
        this.f41772d = bundle;
    }

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i10) {
        this.f41769a = i10;
        this.f41770b = obj;
        this.f41771c = obj2;
        this.f41772d = obj3;
    }

    public k(Context context) {
        String strE;
        this.f41769a = 0;
        b bVarA = b.a(context);
        this.f41770b = bVarA;
        this.f41771c = bVarA.b();
        String strE2 = bVarA.e("defaultGoogleSignInAccount");
        GoogleSignInOptions googleSignInOptionsB = null;
        if (!TextUtils.isEmpty(strE2) && (strE = bVarA.e(b.f("googleSignInOptions", strE2))) != null) {
            try {
                googleSignInOptionsB = GoogleSignInOptions.b(strE);
            } catch (JSONException unused) {
            }
        }
        this.f41772d = googleSignInOptionsB;
    }

    public k(final s0 s0Var, final String str) {
        this.f41769a = 7;
        this.f41770b = qa.e.f48909e;
        final int i10 = 1;
        this.f41771c = no.b.z(new r(this) { // from class: com.google.android.gms.internal.measurement.pc

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g9.k f23855b;

            {
                this.f23855b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // na.r
            public final Object get() {
                long j10;
                long j11;
                long j12;
                long j13;
                long j14;
                long j15;
                long j16;
                int i11 = i10;
                Serializable serializable = s0Var;
                g9.k kVar = this.f23855b;
                switch (i11) {
                    case 0:
                        int i12 = pa.c.f48294a;
                        int i13 = pa.d.f48295b;
                        nv0 nv0VarC = new nv0(1).c(((String) serializable).getBytes());
                        ByteBuffer byteBuffer = (ByteBuffer) nv0VarC.f18004f;
                        byteBuffer.put((byte) 0);
                        char c4 = '\b';
                        if (byteBuffer.remaining() < 8) {
                            nv0VarC.a();
                        }
                        nv0 nv0VarC2 = nv0VarC.c("".getBytes());
                        nv0VarC2.a();
                        ByteBuffer byteBuffer2 = (ByteBuffer) nv0VarC2.f18004f;
                        byteBuffer2.flip();
                        if (byteBuffer2.remaining() > 0) {
                            nv0VarC2.f18003e = byteBuffer2.remaining() + nv0VarC2.f18003e;
                            char c5 = 24;
                            long j17 = 0;
                            switch (byteBuffer2.remaining()) {
                                case 1:
                                    j10 = 0;
                                    j16 = ((long) (byteBuffer2.get(0) & 255)) ^ j10;
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 2:
                                    c4 = '\b';
                                    j11 = 0;
                                    j10 = j11 ^ (((long) (byteBuffer2.get(1) & 255)) << c4);
                                    j16 = ((long) (byteBuffer2.get(0) & 255)) ^ j10;
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 3:
                                    c4 = '\b';
                                    j12 = 0;
                                    j11 = j12 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j10 = j11 ^ (((long) (byteBuffer2.get(1) & 255)) << c4);
                                    j16 = ((long) (byteBuffer2.get(0) & 255)) ^ j10;
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 4:
                                    c4 = '\b';
                                    c5 = 24;
                                    j13 = 0;
                                    j12 = j13 ^ (((long) (byteBuffer2.get(3) & 255)) << c5);
                                    j11 = j12 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j10 = j11 ^ (((long) (byteBuffer2.get(1) & 255)) << c4);
                                    j16 = ((long) (byteBuffer2.get(0) & 255)) ^ j10;
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 5:
                                    c4 = '\b';
                                    j14 = 0;
                                    j13 = j14 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                    j12 = j13 ^ (((long) (byteBuffer2.get(3) & 255)) << c5);
                                    j11 = j12 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j10 = j11 ^ (((long) (byteBuffer2.get(1) & 255)) << c4);
                                    j16 = ((long) (byteBuffer2.get(0) & 255)) ^ j10;
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 6:
                                    j15 = 0;
                                    j14 = j15 ^ (((long) (byteBuffer2.get(5) & 255)) << 40);
                                    j13 = j14 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                    j12 = j13 ^ (((long) (byteBuffer2.get(3) & 255)) << c5);
                                    j11 = j12 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j10 = j11 ^ (((long) (byteBuffer2.get(1) & 255)) << c4);
                                    j16 = ((long) (byteBuffer2.get(0) & 255)) ^ j10;
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 7:
                                    j15 = ((long) (byteBuffer2.get(6) & 255)) << 48;
                                    j14 = j15 ^ (((long) (byteBuffer2.get(5) & 255)) << 40);
                                    j13 = j14 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                    j12 = j13 ^ (((long) (byteBuffer2.get(3) & 255)) << c5);
                                    j11 = j12 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j10 = j11 ^ (((long) (byteBuffer2.get(1) & 255)) << c4);
                                    j16 = ((long) (byteBuffer2.get(0) & 255)) ^ j10;
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 8:
                                    j16 = byteBuffer2.getLong();
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 9:
                                    j17 ^= (long) (byteBuffer2.get(8) & 255);
                                    j16 = byteBuffer2.getLong();
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 10:
                                    j17 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j17 ^= (long) (byteBuffer2.get(8) & 255);
                                    j16 = byteBuffer2.getLong();
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 11:
                                    j17 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j17 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j17 ^= (long) (byteBuffer2.get(8) & 255);
                                    j16 = byteBuffer2.getLong();
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 12:
                                    j17 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j17 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j17 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j17 ^= (long) (byteBuffer2.get(8) & 255);
                                    j16 = byteBuffer2.getLong();
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 13:
                                    j17 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                    j17 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j17 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j17 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j17 ^= (long) (byteBuffer2.get(8) & 255);
                                    j16 = byteBuffer2.getLong();
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 14:
                                    j17 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                                    j17 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                    j17 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j17 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j17 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j17 ^= (long) (byteBuffer2.get(8) & 255);
                                    j16 = byteBuffer2.getLong();
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 15:
                                    j17 = ((long) (byteBuffer2.get(14) & 255)) << 48;
                                    j17 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                                    j17 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                    j17 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j17 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j17 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j17 ^= (long) (byteBuffer2.get(8) & 255);
                                    j16 = byteBuffer2.getLong();
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                default:
                                    throw new AssertionError("Should never get here.");
                            }
                        }
                        long j18 = nv0VarC2.f18001c;
                        long j19 = nv0VarC2.f18003e;
                        long j20 = j18 ^ j19;
                        long j21 = j19 ^ nv0VarC2.f18002d;
                        long j22 = j20 + j21;
                        long j23 = j21 + j22;
                        long j24 = (j22 ^ (j22 >>> 33)) * (-49064778989728563L);
                        long j25 = (j24 ^ (j24 >>> 33)) * (-4265267296055464877L);
                        long j26 = (j23 ^ (j23 >>> 33)) * (-49064778989728563L);
                        long j27 = (j26 ^ (j26 >>> 33)) * (-4265267296055464877L);
                        long j28 = j27 ^ (j27 >>> 33);
                        long j29 = (j25 ^ (j25 >>> 33)) + j28;
                        nv0VarC2.f18001c = j29;
                        nv0VarC2.f18002d = j28 + j29;
                        byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(nv0VarC2.f18001c).putLong(nv0VarC2.f18002d).array();
                        char[] cArr = pa.b.f48293a;
                        new pa.a(bArrArray);
                        return ((qa.c) kVar.f41770b).b((byte[]) bArrArray.clone());
                    default:
                        return ((qa.c) kVar.f41770b).b(((s0) serializable).u());
                }
            }
        });
        final int i11 = 0;
        this.f41772d = no.b.z(new r(this) { // from class: com.google.android.gms.internal.measurement.pc

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g9.k f23855b;

            {
                this.f23855b = this;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // na.r
            public final Object get() {
                long j10;
                long j11;
                long j12;
                long j13;
                long j14;
                long j15;
                long j16;
                int i12 = i11;
                Serializable serializable = str;
                g9.k kVar = this.f23855b;
                switch (i12) {
                    case 0:
                        int i13 = pa.c.f48294a;
                        int i14 = pa.d.f48295b;
                        nv0 nv0VarC = new nv0(1).c(((String) serializable).getBytes());
                        ByteBuffer byteBuffer = (ByteBuffer) nv0VarC.f18004f;
                        byteBuffer.put((byte) 0);
                        char c4 = '\b';
                        if (byteBuffer.remaining() < 8) {
                            nv0VarC.a();
                        }
                        nv0 nv0VarC2 = nv0VarC.c("".getBytes());
                        nv0VarC2.a();
                        ByteBuffer byteBuffer2 = (ByteBuffer) nv0VarC2.f18004f;
                        byteBuffer2.flip();
                        if (byteBuffer2.remaining() > 0) {
                            nv0VarC2.f18003e = byteBuffer2.remaining() + nv0VarC2.f18003e;
                            char c5 = 24;
                            long j17 = 0;
                            switch (byteBuffer2.remaining()) {
                                case 1:
                                    j10 = 0;
                                    j16 = ((long) (byteBuffer2.get(0) & 255)) ^ j10;
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 2:
                                    c4 = '\b';
                                    j11 = 0;
                                    j10 = j11 ^ (((long) (byteBuffer2.get(1) & 255)) << c4);
                                    j16 = ((long) (byteBuffer2.get(0) & 255)) ^ j10;
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 3:
                                    c4 = '\b';
                                    j12 = 0;
                                    j11 = j12 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j10 = j11 ^ (((long) (byteBuffer2.get(1) & 255)) << c4);
                                    j16 = ((long) (byteBuffer2.get(0) & 255)) ^ j10;
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 4:
                                    c4 = '\b';
                                    c5 = 24;
                                    j13 = 0;
                                    j12 = j13 ^ (((long) (byteBuffer2.get(3) & 255)) << c5);
                                    j11 = j12 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j10 = j11 ^ (((long) (byteBuffer2.get(1) & 255)) << c4);
                                    j16 = ((long) (byteBuffer2.get(0) & 255)) ^ j10;
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 5:
                                    c4 = '\b';
                                    j14 = 0;
                                    j13 = j14 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                    j12 = j13 ^ (((long) (byteBuffer2.get(3) & 255)) << c5);
                                    j11 = j12 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j10 = j11 ^ (((long) (byteBuffer2.get(1) & 255)) << c4);
                                    j16 = ((long) (byteBuffer2.get(0) & 255)) ^ j10;
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 6:
                                    j15 = 0;
                                    j14 = j15 ^ (((long) (byteBuffer2.get(5) & 255)) << 40);
                                    j13 = j14 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                    j12 = j13 ^ (((long) (byteBuffer2.get(3) & 255)) << c5);
                                    j11 = j12 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j10 = j11 ^ (((long) (byteBuffer2.get(1) & 255)) << c4);
                                    j16 = ((long) (byteBuffer2.get(0) & 255)) ^ j10;
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 7:
                                    j15 = ((long) (byteBuffer2.get(6) & 255)) << 48;
                                    j14 = j15 ^ (((long) (byteBuffer2.get(5) & 255)) << 40);
                                    j13 = j14 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                                    j12 = j13 ^ (((long) (byteBuffer2.get(3) & 255)) << c5);
                                    j11 = j12 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                                    j10 = j11 ^ (((long) (byteBuffer2.get(1) & 255)) << c4);
                                    j16 = ((long) (byteBuffer2.get(0) & 255)) ^ j10;
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 8:
                                    j16 = byteBuffer2.getLong();
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 9:
                                    j17 ^= (long) (byteBuffer2.get(8) & 255);
                                    j16 = byteBuffer2.getLong();
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 10:
                                    j17 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j17 ^= (long) (byteBuffer2.get(8) & 255);
                                    j16 = byteBuffer2.getLong();
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 11:
                                    j17 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j17 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j17 ^= (long) (byteBuffer2.get(8) & 255);
                                    j16 = byteBuffer2.getLong();
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 12:
                                    j17 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j17 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j17 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j17 ^= (long) (byteBuffer2.get(8) & 255);
                                    j16 = byteBuffer2.getLong();
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 13:
                                    j17 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                    j17 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j17 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j17 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j17 ^= (long) (byteBuffer2.get(8) & 255);
                                    j16 = byteBuffer2.getLong();
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 14:
                                    j17 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                                    j17 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                    j17 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j17 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j17 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j17 ^= (long) (byteBuffer2.get(8) & 255);
                                    j16 = byteBuffer2.getLong();
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                case 15:
                                    j17 = ((long) (byteBuffer2.get(14) & 255)) << 48;
                                    j17 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                                    j17 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                                    j17 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                                    j17 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                                    j17 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                                    j17 ^= (long) (byteBuffer2.get(8) & 255);
                                    j16 = byteBuffer2.getLong();
                                    nv0VarC2.f18001c = (Long.rotateLeft(j16 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ nv0VarC2.f18001c;
                                    nv0VarC2.f18002d ^= Long.rotateLeft(j17 * 5545529020109919103L, 33) * (-8663945395140668459L);
                                    byteBuffer2.position(byteBuffer2.limit());
                                    break;
                                default:
                                    throw new AssertionError("Should never get here.");
                            }
                        }
                        long j18 = nv0VarC2.f18001c;
                        long j19 = nv0VarC2.f18003e;
                        long j20 = j18 ^ j19;
                        long j21 = j19 ^ nv0VarC2.f18002d;
                        long j22 = j20 + j21;
                        long j23 = j21 + j22;
                        long j24 = (j22 ^ (j22 >>> 33)) * (-49064778989728563L);
                        long j25 = (j24 ^ (j24 >>> 33)) * (-4265267296055464877L);
                        long j26 = (j23 ^ (j23 >>> 33)) * (-49064778989728563L);
                        long j27 = (j26 ^ (j26 >>> 33)) * (-4265267296055464877L);
                        long j28 = j27 ^ (j27 >>> 33);
                        long j29 = (j25 ^ (j25 >>> 33)) + j28;
                        nv0VarC2.f18001c = j29;
                        nv0VarC2.f18002d = j28 + j29;
                        byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(nv0VarC2.f18001c).putLong(nv0VarC2.f18002d).array();
                        char[] cArr = pa.b.f48293a;
                        new pa.a(bArrArray);
                        return ((qa.c) kVar.f41770b).b((byte[]) bArrArray.clone());
                    default:
                        return ((qa.c) kVar.f41770b).b(((s0) serializable).u());
                }
            }
        });
    }

    public k(pb pbVar, String str) {
        this.f41769a = 8;
        this.f41770b = pbVar;
        this.f41772d = str;
        Context context = pbVar.f23846b;
        Pattern pattern = xe.f24149a;
        x xVar = new x(context);
        xVar.G("phenotype");
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 4);
        sb2.append("/");
        sb2.append(str);
        sb2.append(".pb");
        xVar.H(sb2.toString());
        this.f41771c = xVar.I();
    }

    private final void H() {
    }

    private final void I() {
    }

    public k(e4 e4Var, String str, g4 g4Var) {
        this.f41769a = 12;
        this.f41770b = str;
        this.f41771c = g4Var;
        this.f41772d = e4Var;
    }

    public k(ig.a sink, dg.b bVar) {
        this.f41769a = 13;
        kotlin.jvm.internal.n.f(sink, "sink");
        this.f41770b = sink;
        this.f41771c = bVar;
        this.f41772d = new MediaCodec.BufferInfo();
    }

    public k(WorkDatabase_Impl workDatabase_Impl) {
        this.f41769a = 22;
        this.f41770b = workDatabase_Impl;
        this.f41771c = new m5.b(workDatabase_Impl, 2);
        this.f41772d = new m5.e(workDatabase_Impl, 0);
    }

    public k() {
        this.f41769a = 18;
        this.f41770b = new AtomicBoolean(false);
    }

    public k(ExecutorService executorService) {
        this.f41769a = 28;
        this.f41771c = new Handler(Looper.getMainLooper());
        this.f41772d = new e2(this, 1);
        this.f41770b = new n5.j(executorService);
    }

    public k(c1 store, a1 factory, e1.b defaultCreationExtras) {
        this.f41769a = 2;
        kotlin.jvm.internal.n.f(store, "store");
        kotlin.jvm.internal.n.f(factory, "factory");
        kotlin.jvm.internal.n.f(defaultCreationExtras, "defaultCreationExtras");
        this.f41770b = store;
        this.f41771c = factory;
        this.f41772d = defaultCreationExtras;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(c1 store, a1 a1Var) {
        this(store, a1Var, e1.a.f39018b);
        this.f41769a = 2;
        kotlin.jvm.internal.n.f(store, "store");
    }

    public k(File file) {
        this.f41769a = 21;
        this.f41770b = file;
        this.f41771c = new File(file.getPath() + ".new");
        this.f41772d = new File(file.getPath() + ".bak");
    }

    public k(n2.n nVar) {
        this.f41769a = 14;
        this.f41770b = nVar;
    }

    public k(Context context, TypedArray typedArray) {
        this.f41769a = 27;
        this.f41770b = context;
        this.f41771c = typedArray;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(FragmentActivity owner) {
        this(owner.getViewModelStore(), owner.getDefaultViewModelProviderFactory(), owner.getDefaultViewModelCreationExtras());
        this.f41769a = 2;
        kotlin.jvm.internal.n.f(owner, "owner");
    }

    public k(Class cls) {
        this.f41769a = 9;
        HashSet hashSet = new HashSet();
        this.f41772d = hashSet;
        this.f41770b = UUID.randomUUID();
        this.f41771c = new m5.i(((UUID) this.f41770b).toString(), cls.getName());
        hashSet.add(cls.getName());
        ((m5.i) this.f41771c).f45885d = OverwritingInputMerger.class.getName();
    }

    public k(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, dm0 dm0Var) {
        this.f41769a = 24;
        a7.h.c(dm0Var, "Argument must not be null");
        this.f41770b = dm0Var;
        a7.h.c(arrayList, "Argument must not be null");
        this.f41771c = arrayList;
        this.f41772d = new com.bumptech.glide.load.data.i(parcelFileDescriptor);
    }

    public k(n5.f fVar) {
        this.f41769a = 1;
        this.f41770b = fVar;
        this.f41771c = new ReentrantLock();
        this.f41772d = new WeakHashMap();
    }
}
