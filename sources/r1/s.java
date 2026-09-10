package r1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Handler;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.internal.ads.ga;
import com.google.android.gms.internal.ads.h12;
import com.google.android.gms.internal.ads.kj1;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.Adler32;
import tj.i0;
import ud.g1;
import ud.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements s6.a, wd.b, xi.d, ye.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f49338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f49339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f49340d;

    public /* synthetic */ s(int i10) {
        this.f49337a = i10;
    }

    public static Object b(Task task) throws IOException {
        try {
            return Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e10) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new IOException(e11);
        }
    }

    @Override // s6.a
    public g6.a0 a(g6.a0 a0Var, e6.i iVar) {
        Drawable drawable = (Drawable) a0Var.get();
        if (drawable instanceof BitmapDrawable) {
            b2.w wVar = (b2.w) this.f49339c;
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            return wVar.a(bitmap != null ? new n6.d(bitmap, (h6.a) this.f49338b) : null, iVar);
        }
        if (drawable instanceof r6.c) {
            return ((s6.c) this.f49340d).a(a0Var, iVar);
        }
        return null;
    }

    public r8.i c() {
        String strConcat = ((String) this.f49338b) == null ? " backendName" : "";
        if (((o8.d) this.f49340d) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new r8.i((String) this.f49338b, (byte[]) this.f49339c, (o8.d) this.f49340d);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public wa.j d() throws GeneralSecurityException {
        s4.i iVar;
        lb.a aVarB;
        wa.l lVar = (wa.l) this.f49338b;
        if (lVar == null || (iVar = (s4.i) this.f49339c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (lVar.f53094a != ((lb.a) iVar.f50111a).f45273a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (lVar.a() && ((Integer) this.f49340d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((wa.l) this.f49338b).a() && ((Integer) this.f49340d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        wa.h hVar = ((wa.l) this.f49338b).f53097d;
        if (hVar == wa.h.f53054m) {
            aVarB = eb.p.f40006a;
        } else if (hVar == wa.h.l) {
            aVarB = eb.p.a(((Integer) this.f49340d).intValue());
        } else {
            if (hVar != wa.h.f53053k) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + ((wa.l) this.f49338b).f53097d);
            }
            aVarB = eb.p.b(((Integer) this.f49340d).intValue());
        }
        return new wa.j((wa.l) this.f49338b, (s4.i) this.f49339c, aVarB, (Integer) this.f49340d);
    }

    public wa.p e() throws GeneralSecurityException {
        s4.i iVar;
        lb.a aVarB;
        wa.r rVar = (wa.r) this.f49338b;
        if (rVar == null || (iVar = (s4.i) this.f49339c) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (rVar.f53119a != ((lb.a) iVar.f50111a).f45273a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (rVar.a() && ((Integer) this.f49340d) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((wa.r) this.f49338b).a() && ((Integer) this.f49340d) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        wa.h hVar = ((wa.r) this.f49338b).f53120b;
        if (hVar == wa.h.f53060s) {
            aVarB = eb.p.f40006a;
        } else if (hVar == wa.h.f53059r) {
            aVarB = eb.p.a(((Integer) this.f49340d).intValue());
        } else {
            if (hVar != wa.h.f53058q) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + ((wa.r) this.f49338b).f53120b);
            }
            aVarB = eb.p.b(((Integer) this.f49340d).intValue());
        }
        return new wa.p((wa.r) this.f49338b, (s4.i) this.f49339c, aVarB, (Integer) this.f49340d);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ye.g
    public void f(BiometricPrompt.AuthenticationResult authenticationResult) {
        HashMap mapX;
        switch (this.f49337a) {
            case 13:
                ((ye.d) this.f49340d).f54374c = (SharedPreferences) this.f49338b;
                ((s) this.f49339c).f(null);
                return;
            default:
                ye.d dVar = (ye.d) this.f49338b;
                m0 m0Var = (m0) this.f49340d;
                wi.j jVar = (wi.j) m0Var.f11734b;
                try {
                    xi.m mVar = (xi.m) m0Var.f11735c;
                    String str = mVar.f53822a;
                    boolean z10 = false;
                    String str2 = null;
                    switch (str.hashCode()) {
                        case -1703690313:
                            if (str.equals("isDeviceSecure")) {
                                jVar.a(Boolean.valueOf(dVar.m()));
                                return;
                            }
                            jVar.c();
                            return;
                        case -1413382213:
                            if (str.equals("isBiometricAvailable")) {
                                BiometricManager biometricManager = (BiometricManager) dVar.f54373b.getSystemService(BiometricManager.class);
                                if (biometricManager != null) {
                                    if (biometricManager.canAuthenticate(dVar.f54372a.f54385i ? 15 : 32783) == 0 && dVar.m()) {
                                        z10 = true;
                                    }
                                }
                                jVar.a(Boolean.valueOf(z10));
                                return;
                            }
                            jVar.c();
                            return;
                        case -1335458389:
                            if (str.equals("delete")) {
                                String strB = ye.f.b(dVar, mVar);
                                SharedPreferences.Editor editorEdit = dVar.f54374c.edit();
                                editorEdit.remove(strB);
                                editorEdit.apply();
                                jVar.a(null);
                                return;
                            }
                            jVar.c();
                            return;
                        case -358737930:
                            if (str.equals("deleteAll")) {
                                SharedPreferences.Editor editorEdit2 = dVar.f54374c.edit();
                                editorEdit2.clear();
                                editorEdit2.apply();
                                jVar.a(null);
                                return;
                            }
                            jVar.c();
                            return;
                        case 3496342:
                            if (str.equals("read")) {
                                String strB2 = ye.f.b(dVar, mVar);
                                if (!dVar.f54374c.contains(strB2)) {
                                    jVar.a(null);
                                    return;
                                }
                                try {
                                    String string = dVar.f54374c.getString(strB2, null);
                                    ye.e eVar = dVar.f54372a;
                                    if (eVar.f54383g && !eVar.f54381e) {
                                        str2 = string;
                                    } else if (string != null) {
                                        str2 = new String(dVar.f54375d.c(Base64.decode(string, 0)), ye.d.f54371f);
                                    }
                                } catch (Exception e10) {
                                    if (!dVar.h("read", strB2, e10)) {
                                        throw e10;
                                    }
                                    String string2 = dVar.f54374c.getString(strB2, null);
                                    ye.e eVar2 = dVar.f54372a;
                                    if (eVar2.f54383g && !eVar2.f54381e) {
                                        str2 = string2;
                                    } else if (string2 != null) {
                                        str2 = new String(dVar.f54375d.c(Base64.decode(string2, 0)), ye.d.f54371f);
                                    }
                                }
                                jVar.a(str2);
                                return;
                            }
                            jVar.c();
                            return;
                        case 113399775:
                            if (str.equals("write")) {
                                String strB3 = ye.f.b(dVar, mVar);
                                String str3 = (String) ((Map) mVar.f53823b).get(X3.i.X);
                                if (str3 == null) {
                                    jVar.b("null", null, null);
                                    return;
                                }
                                try {
                                    dVar.A(strB3, str3);
                                    break;
                                } catch (Exception e11) {
                                    if (!dVar.h("write", strB3, e11)) {
                                        throw e11;
                                    }
                                    dVar.A(strB3, str3);
                                }
                                jVar.a(null);
                                return;
                            }
                            jVar.c();
                            return;
                        case 208013248:
                            if (str.equals("containsKey")) {
                                jVar.a(Boolean.valueOf(dVar.f54374c.contains(ye.f.b(dVar, mVar))));
                                return;
                            }
                            jVar.c();
                            return;
                        case 1080375339:
                            if (str.equals("readAll")) {
                                try {
                                    mapX = dVar.x();
                                    break;
                                } catch (Exception e12) {
                                    if (!dVar.h("readAll", null, e12)) {
                                        throw e12;
                                    }
                                    mapX = dVar.x();
                                }
                                jVar.a(mapX);
                                return;
                            }
                            jVar.c();
                            return;
                        default:
                            jVar.c();
                            return;
                    }
                } catch (Exception e13) {
                    if (!((ye.e) this.f49339c).f54380d) {
                        m0Var.a(e13);
                        return;
                    }
                    try {
                        SharedPreferences.Editor editorEdit3 = dVar.f54374c.edit();
                        editorEdit3.clear();
                        editorEdit3.apply();
                        jVar.a("Data has been reset");
                        return;
                    } catch (Exception e14) {
                        m0Var.a(e14);
                        return;
                    }
                }
        }
    }

    @Override // xi.d
    public void g(ByteBuffer byteBuffer, oi.f fVar) throws Throwable {
        AtomicReference atomicReference = (AtomicReference) this.f49339c;
        xi.h hVar = (xi.h) this.f49338b;
        qd.i iVar = (qd.i) this.f49340d;
        String str = (String) iVar.f48981c;
        xi.q qVar = (xi.q) iVar.f48982d;
        String str2 = qVar.a(byteBuffer).f53822a;
        if (!str2.equals("listen")) {
            if (!str2.equals("cancel")) {
                fVar.a(null);
                return;
            }
            if (((xi.g) atomicReference.getAndSet(null)) == null) {
                fVar.a(qVar.f("error", "No active stream to cancel", null));
                return;
            }
            try {
                hVar.onCancel();
                fVar.a(qVar.b(null));
                return;
            } catch (RuntimeException e10) {
                Log.e("EventChannel#" + str, "Failed to close event stream", e10);
                fVar.a(qVar.f("error", e10.getMessage(), null));
                return;
            }
        }
        xi.g gVar = new xi.g(this);
        if (((xi.g) atomicReference.getAndSet(gVar)) != null) {
            try {
                hVar.onCancel();
            } catch (RuntimeException e11) {
                Log.e("EventChannel#" + str, "Failed to close existing event stream", e11);
            }
        }
        try {
            hVar.g(gVar);
            fVar.a(qVar.b(null));
        } catch (RuntimeException e12) {
            atomicReference.set(null);
            Log.e("EventChannel#" + str, "Failed to open event stream", e12);
            fVar.a(qVar.f("error", e12.getMessage(), null));
        }
    }

    @Override // vj.a
    public Object get() {
        switch (this.f49337a) {
            case 5:
                Context appContext = (Context) ((rb.c) this.f49338b).f49529b;
                ak.k blockingDispatcher = (ak.k) ((wd.c) this.f49339c).get();
                j0 sessionDataSerializer = (j0) ((wd.c) this.f49340d).get();
                kotlin.jvm.internal.n.f(appContext, "appContext");
                kotlin.jvm.internal.n.f(blockingDispatcher, "blockingDispatcher");
                kotlin.jvm.internal.n.f(sessionDataSerializer, "sessionDataSerializer");
                return ud.q.b(sessionDataSerializer, new na.g(new com.ironsource.sdk.controller.y(sessionDataSerializer, 8)), cn.d0.b(blockingDispatcher), new ud.p(appContext, 1));
            default:
                return new xd.n((ak.k) ((wd.c) this.f49338b).get(), (g1) ((wd.c) this.f49339c).get(), (s0.i) ((wd.c) this.f49340d).get());
        }
    }

    @Override // ye.g
    public void h(Exception exc) {
        switch (this.f49337a) {
            case 13:
                ((s) this.f49339c).h(exc);
                break;
            default:
                ((m0) this.f49340d).a(exc);
                break;
        }
    }

    public void i(n2.m mVar, ga gaVar) {
        n2.a0[] a0VarArr = (n2.a0[]) this.f49339c;
        for (int i10 = 0; i10 < a0VarArr.length; i10++) {
            gaVar.a();
            gaVar.b();
            n2.a0 a0VarTrack = mVar.track(gaVar.f14805d, 3);
            i1.p pVar = (i1.p) ((List) this.f49338b).get(i10);
            String str = pVar.f42643n;
            go.k.k(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption MIME type provided: %s", str);
            String str2 = pVar.f42631a;
            if (str2 == null) {
                gaVar.b();
                str2 = gaVar.f14806e;
            }
            i1.o oVar = new i1.o();
            oVar.f42589a = str2;
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

    public boolean j() throws IOException {
        String strTrim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f49339c;
        if (((String) this.f49340d) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.f49340d = str;
                return true;
            }
            do {
                String line = ((BufferedReader) this.f49338b).readLine();
                this.f49340d = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f49340d = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    public String k() {
        if (!j()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.f49340d;
        this.f49340d = null;
        return str;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00de */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.s.l(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void m(r8.i iVar, int i10, boolean z10) {
        x8.a aVar = (x8.a) this.f49340d;
        Context context = (Context) this.f49338b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f49489a;
        String str2 = iVar.f49489a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        o8.d dVar = iVar.f49491c;
        adler32.update(byteBufferAllocate.putInt(b9.a.a(dVar)).array());
        byte[] bArr = iVar.f49490b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i11 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i11 < i10) {
                        break;
                    }
                    no.b.l("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((y8.h) ((y8.d) this.f49339c)).d().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(b9.a.a(dVar))});
        try {
            Cursor cursor = cursorRawQuery;
            Long lValueOf = cursor.moveToNext() ? Long.valueOf(cursor.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, jLongValue, i10));
            Set set = ((x8.b) aVar.f53662b.get(dVar)).f53665c;
            if (set.contains(x8.c.f53666a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(x8.c.f53668c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(x8.c.f53667b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, b9.a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString(HandleInvocationsFromAdViewer.KEY_EXTRAS, Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(aVar.a(dVar, jLongValue, i10)), lValueOf, Integer.valueOf(i10)};
            String strConcat = "TRuntime.".concat("JobInfoScheduler");
            if (Log.isLoggable(strConcat, 3)) {
                Log.d(strConcat, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }

    public void n(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f49338b = str;
    }

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, int i10) {
        this.f49337a = i10;
        this.f49338b = obj;
        this.f49339c = obj2;
        this.f49340d = obj3;
    }

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f49337a = i10;
        this.f49340d = obj;
        this.f49338b = obj2;
        this.f49339c = obj3;
    }

    public s(List list) {
        this.f49337a = 4;
        this.f49338b = list;
        this.f49339c = new n2.a0[list.size()];
        this.f49340d = new kj1(new i0(this, 1));
    }

    public s(mb.g gVar, FirebaseMessaging firebaseMessaging, uc.d dVar) {
        this.f49337a = 15;
        this.f49338b = dVar;
        this.f49339c = gVar;
        this.f49340d = firebaseMessaging;
    }

    public s(zk.h classifierDescriptor, List arguments, s sVar) {
        this.f49337a = 16;
        kotlin.jvm.internal.n.f(classifierDescriptor, "classifierDescriptor");
        kotlin.jvm.internal.n.f(arguments, "arguments");
        this.f49338b = classifierDescriptor;
        this.f49339c = arguments;
        this.f49340d = sVar;
    }

    public s() {
        this.f49337a = 9;
        this.f49338b = new ConcurrentLinkedQueue();
    }

    public s(qd.i iVar, xi.h hVar) {
        this.f49337a = 12;
        this.f49340d = iVar;
        this.f49339c = new AtomicReference(null);
        this.f49338b = hVar;
    }

    public s(t tVar) {
        this.f49337a = 0;
        this.f49340d = tVar;
        Handler handlerQ = l1.y.q(null);
        this.f49338b = handlerQ;
        h12 h12Var = new h12(this, 1);
        this.f49339c = h12Var;
        tVar.f49344a.registerStreamEventCallback(new p1.z(handlerQ, 1), h12Var);
    }

    public s(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f49337a = 6;
        this.f49339c = arrayDeque;
        this.f49338b = bufferedReader;
    }
}
