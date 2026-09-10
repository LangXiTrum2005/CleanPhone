package ac;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.util.Base64;
import android.util.Log;
import com.applovin.impl.l2;
import com.applovin.impl.n;
import com.applovin.impl.n8;
import com.applovin.impl.p;
import com.applovin.impl.q;
import com.applovin.impl.sdk.l;
import com.applovin.impl.t2;
import com.applovin.impl.u2;
import com.applovin.impl.u4;
import com.applovin.sdk.AppLovinPostbackListener;
import com.google.android.gms.internal.ads.z40;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import com.google.firebase.messaging.FirebaseMessaging;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import ea.f2;
import f2.c0;
import f2.i0;
import f2.j0;
import i1.q0;
import i2.m;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import m5.k;
import oa.e0;
import oa.n1;
import r8.i;
import wi.j;
import y8.h;
import zc.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Continuation, OnCompleteListener, u4.b, u2.a, ConsentInformation.OnConsentInfoUpdateSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener, l1.g, m, OnSuccessListener, z8.b, y8.f, SuccessContinuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3454d;

    public /* synthetic */ a(gj.f fVar, HashMap map, TaskCompletionSource taskCompletionSource) {
        this.f3451a = 8;
        this.f3453c = fVar;
        this.f3454d = map;
        this.f3452b = taskCompletionSource;
    }

    @Override // com.applovin.impl.u2.a
    public void a(l2 l2Var, t2 t2Var) {
        switch (this.f3451a) {
            case 3:
                ((p) this.f3452b).a((l) this.f3453c, (n) this.f3454d, l2Var, t2Var);
                break;
            default:
                ((q) this.f3452b).a((List) this.f3453c, (l) this.f3454d, l2Var, t2Var);
                break;
        }
    }

    @Override // l1.g
    public void accept(Object obj) {
        i0 i0Var = (i0) this.f3452b;
        ((j0) obj).B(i0Var.f40369a, (c0) this.f3453c, (c2.g) this.f3454d);
    }

    @Override // y8.f
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        h hVar;
        u8.c cVar;
        int i10 = this.f3451a;
        int i11 = 6;
        int i12 = 5;
        int i13 = 4;
        int i14 = 3;
        u8.c cVar2 = u8.c.CACHE_FULL;
        int i15 = 2;
        int i16 = 0;
        int i17 = 1;
        Object obj2 = this.f3454d;
        Object obj3 = this.f3453c;
        Object obj4 = this.f3452b;
        switch (i10) {
            case 14:
                h hVar2 = (h) obj4;
                r8.h hVar3 = (r8.h) obj3;
                r8.l lVar = hVar3.f49481c;
                String str = hVar3.f49479a;
                i iVar = (i) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = hVar2.d().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar2.d().compileStatement("PRAGMA page_count").simpleQueryForLong();
                y8.a aVar = hVar2.f54342d;
                if (jSimpleQueryForLong >= aVar.f54326a) {
                    hVar2.n(1L, cVar2, str);
                    return -1L;
                }
                Long lH = h.h(sQLiteDatabase, iVar);
                if (lH != null) {
                    jInsert = lH.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.f49489a);
                    contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(b9.a.a(iVar.f49491c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = iVar.f49490b;
                    if (bArr != null) {
                        contentValues.put(HandleInvocationsFromAdViewer.KEY_EXTRAS, Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i18 = aVar.f54330e;
                byte[] bArr2 = lVar.f49499b;
                boolean z10 = bArr2.length <= i18;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar3.f49482d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar3.f49483e));
                contentValues2.put("payload_encoding", lVar.f49498a.f47210a);
                contentValues2.put("code", hVar3.f49480b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z10));
                contentValues2.put("payload", z10 ? bArr2 : new byte[0]);
                contentValues2.put("product_id", hVar3.f49485g);
                contentValues2.put("pseudonymous_id", hVar3.f49486h);
                contentValues2.put("experiment_ids_clear_blob", hVar3.f49487i);
                contentValues2.put("experiment_ids_encrypted_blob", hVar3.f49488j);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z10) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i18));
                    for (int i19 = 1; i19 <= iCeil; i19++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i19 - 1) * i18, Math.min(i19 * i18, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i19));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(hVar3.f49484f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put(X3.i.X, (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 15:
                h hVar4 = (h) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                i iVar2 = (i) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j10 = cursor2.getLong(0);
                    int i20 = cursor2.getInt(7) != 0 ? i17 : 0;
                    z40 z40Var = new z40();
                    z40Var.f22496f = new HashMap();
                    String string = cursor2.getString(i17);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    z40Var.f22491a = string;
                    z40Var.f22494d = Long.valueOf(cursor2.getLong(i15));
                    z40Var.f22495e = Long.valueOf(cursor2.getLong(3));
                    if (i20 != 0) {
                        String string2 = cursor2.getString(4);
                        z40Var.f22493c = new r8.l(string2 == null ? h.f54338f : new o8.c(string2), cursor2.getBlob(5));
                        hVar = hVar4;
                    } else {
                        String string3 = cursor2.getString(4);
                        o8.c cVar3 = string3 == null ? h.f54338f : new o8.c(string3);
                        Cursor cursorQuery = hVar4.d().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num");
                        try {
                            Cursor cursor3 = cursorQuery;
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursor3.moveToNext()) {
                                byte[] blob = cursor3.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr3 = new byte[length];
                            int i21 = 0;
                            int length2 = 0;
                            while (i21 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i21);
                                h hVar5 = hVar4;
                                cursor = cursorQuery;
                                try {
                                    System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                                    length2 += bArr4.length;
                                    i21++;
                                    cursorQuery = cursor;
                                    hVar4 = hVar5;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            hVar = hVar4;
                            cursorQuery.close();
                            z40Var.f22493c = new r8.l(cVar3, bArr3);
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        z40Var.f22492b = Integer.valueOf(cursor2.getInt(6));
                    }
                    if (!cursor2.isNull(8)) {
                        z40Var.f22497g = Integer.valueOf(cursor2.getInt(8));
                    }
                    if (!cursor2.isNull(9)) {
                        z40Var.f22498h = cursor2.getString(9);
                    }
                    if (!cursor2.isNull(10)) {
                        z40Var.f22499i = cursor2.getBlob(10);
                    }
                    if (!cursor2.isNull(11)) {
                        z40Var.f22500j = cursor2.getBlob(11);
                    }
                    arrayList.add(new y8.b(j10, iVar2, z40Var.b()));
                    hVar4 = hVar;
                    i15 = 2;
                    i17 = 1;
                }
                return null;
            default:
                h hVar6 = (h) obj4;
                HashMap map = (HashMap) obj3;
                k5.g gVar = (k5.g) obj2;
                ArrayList arrayList3 = (ArrayList) gVar.f44326b;
                Cursor cursor4 = (Cursor) obj;
                hVar6.getClass();
                while (cursor4.moveToNext()) {
                    String string4 = cursor4.getString(i16);
                    int i22 = cursor4.getInt(1);
                    u8.c cVar4 = u8.c.REASON_UNKNOWN;
                    if (i22 != 0) {
                        if (i22 == 1) {
                            cVar4 = u8.c.MESSAGE_TOO_OLD;
                        } else if (i22 == 2) {
                            cVar = cVar2;
                        } else if (i22 == i14) {
                            cVar4 = u8.c.PAYLOAD_TOO_BIG;
                        } else if (i22 == i13) {
                            cVar4 = u8.c.MAX_RETRIES_REACHED;
                        } else if (i22 == i12) {
                            cVar4 = u8.c.INVALID_PAYLOD;
                        } else if (i22 == i11) {
                            cVar4 = u8.c.SERVER_ERROR;
                        } else {
                            no.b.l("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i22));
                        }
                        cVar = cVar4;
                    } else {
                        cVar = cVar4;
                    }
                    long j11 = cursor4.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new u8.d(j11, cVar));
                    i11 = 6;
                    i12 = 5;
                    i13 = 4;
                    i14 = 3;
                    i16 = 0;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i23 = u8.e.f51929c;
                    new ArrayList();
                    arrayList3.add(new u8.e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                gVar.f44325a = (u8.g) hVar6.j(new ni.h(hVar6.f54340b.f()));
                gVar.f44327c = new u8.b(new u8.f(hVar6.d().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar6.d().compileStatement("PRAGMA page_count").simpleQueryForLong(), y8.a.f54325f.f54326a));
                gVar.f44328d = (String) hVar6.f54343e.get();
                return new u8.a((u8.g) gVar.f44325a, Collections.unmodifiableList(arrayList3), (u8.b) gVar.f44327c, (String) gVar.f44328d);
        }
    }

    @Override // i2.m
    public n1 b(int i10, q0 q0Var, int[] iArr) {
        i2.i iVar = (i2.i) this.f3452b;
        String str = (String) this.f3453c;
        String str2 = (String) this.f3454d;
        e0 e0VarU = oa.j0.u();
        for (int i11 = 0; i11 < q0Var.f42659a; i11++) {
            e0VarU.b(new i2.l(i10, q0Var, i11, iVar, iArr[i11], str, str2));
        }
        return e0VarU.g();
    }

    @Override // z8.b
    public Object execute() {
        w8.a aVar = (w8.a) this.f3452b;
        i iVar = (i) this.f3453c;
        r8.h hVar = (r8.h) this.f3454d;
        h hVar2 = (h) aVar.f52998d;
        hVar2.getClass();
        o8.d dVar = iVar.f49491c;
        String str = hVar.f49479a;
        String str2 = iVar.f49489a;
        String strConcat = "TRuntime.".concat("SQLiteEventStore");
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) hVar2.j(new a(hVar2, hVar, iVar, 14))).getClass();
        aVar.f52995a.m(iVar, 1, false);
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Task task2;
        bi.a aVar = (bi.a) this.f3452b;
        j jVar = (j) this.f3453c;
        f2 f2Var = (f2) this.f3454d;
        kotlin.jvm.internal.n.f(task, "task");
        if (aVar.a(jVar)) {
            return;
        }
        if (!task.isSuccessful()) {
            Log.w("InAppReviewPlugin", "onComplete: Unsuccessfully requested review flow");
            jVar.b("error", "In-App Review API unavailable", null);
            return;
        }
        Log.i("InAppReviewPlugin", "onComplete: Successfully requested review flow");
        ka.a aVar2 = (ka.a) task.getResult();
        Activity activity = aVar.f5704c;
        kotlin.jvm.internal.n.c(activity);
        ka.b bVar = (ka.b) aVar2;
        if (bVar.f44534b) {
            task2 = Tasks.forResult(null);
        } else {
            Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
            intent.putExtra("confirmation_intent", bVar.f44533a);
            intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            intent.putExtra("result_receiver", new ka.c((Handler) f2Var.f39410c, taskCompletionSource));
            activity.startActivity(intent);
            task2 = taskCompletionSource.getTask();
        }
        kotlin.jvm.internal.n.e(task2, "launchReviewFlow(...)");
        task2.addOnCompleteListener(new b6.a(jVar, 4));
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public void onConsentFormLoadFailure(FormError formError) {
        ((com.applovin.impl.privacy.cmp.a) this.f3452b).a((com.applovin.impl.privacy.cmp.a.InterfaceC0014a) this.f3453c, (FormError) this.f3454d, formError);
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
    public void onConsentInfoUpdateSuccess() {
        ((com.applovin.impl.privacy.cmp.a) this.f3452b).a((Activity) this.f3453c, (com.applovin.impl.privacy.cmp.a.InterfaceC0014a) this.f3454d);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        k5.g gVar = (k5.g) this.f3452b;
        Task task = (Task) this.f3453c;
        wb.b bVar = (wb.b) this.f3454d;
        try {
            qd.c cVar = (qd.c) task.getResult();
            if (cVar != null) {
                ((Executor) gVar.f44327c).execute(new rd.a(bVar, ((k) gVar.f44326b).p(cVar), 1));
            }
        } catch (pd.d e10) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e10);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        qd.c cVar;
        URL url;
        switch (this.f3451a) {
            case 0:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f3452b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f3453c;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.f3454d;
                if (task.isSuccessful()) {
                    taskCompletionSource.trySetResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource.trySetException(task.getException());
                } else if (atomicBoolean.getAndSet(true)) {
                    cancellationTokenSource.cancel();
                }
                return Tasks.forResult(null);
            case 10:
                pd.b bVar = (pd.b) this.f3452b;
                Task task2 = (Task) this.f3453c;
                Task task3 = (Task) this.f3454d;
                bVar.getClass();
                if (!task2.isSuccessful() || task2.getResult() == null) {
                    return Tasks.forResult(Boolean.FALSE);
                }
                qd.c cVar2 = (qd.c) task2.getResult();
                if (task3.isSuccessful() && (cVar = (qd.c) task3.getResult()) != null && cVar2.f48947c.equals(cVar.f48947c)) {
                    return Tasks.forResult(Boolean.FALSE);
                }
                qd.b bVar2 = bVar.f48329d;
                Executor executor = bVar2.f48941a;
                return Tasks.call(executor, new com.unity3d.ads.core.data.repository.a(2, bVar2, cVar2)).onSuccessTask(executor, new cj.h(25, bVar2, cVar2)).continueWith(bVar.f48327b, new pd.a(bVar));
            default:
                qd.k kVar = (qd.k) this.f3452b;
                Task task4 = (Task) this.f3453c;
                Task task5 = (Task) this.f3454d;
                if (!task4.isSuccessful()) {
                    return Tasks.forException(new pd.c("Firebase Installations failed to get installation auth token for config update listener connection.", task4.getException()));
                }
                if (!task5.isSuccessful()) {
                    return Tasks.forException(new pd.c("Firebase Installations failed to get installation ID for config update listener connection.", task5.getException()));
                }
                try {
                    try {
                        url = new URL(kVar.c(kVar.f48998n));
                        break;
                    } catch (MalformedURLException unused) {
                        Log.e("FirebaseRemoteConfig", "URL is malformed");
                        url = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    kVar.i(httpURLConnection, (String) task5.getResult(), ((uc.a) task4.getResult()).f51979a);
                    return Tasks.forResult(httpURLConnection);
                } catch (IOException e10) {
                    return Tasks.forException(new pd.c("Failed to open HTTP stream connection", e10));
                }
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.f3451a = i10;
        this.f3452b = obj;
        this.f3453c = obj2;
        this.f3454d = obj3;
    }

    @Override // com.applovin.impl.u4.b
    public void a(boolean z10, Object obj, Object obj2) {
        ((n8) this.f3452b).a((AppLovinPostbackListener) this.f3453c, (String) this.f3454d, z10, (String) obj, (String) obj2);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f3452b;
        String str = (String) this.f3453c;
        v vVar = (v) this.f3454d;
        String str2 = (String) obj;
        l7.i0 i0VarE = FirebaseMessaging.e(firebaseMessaging.f24676b);
        String strF = firebaseMessaging.f();
        String strA = firebaseMessaging.f24684j.a();
        synchronized (i0VarE) {
            String strA2 = v.a(System.currentTimeMillis(), str2, strA);
            if (strA2 != null) {
                SharedPreferences.Editor editorEdit = i0VarE.f45154a.edit();
                editorEdit.putString(l7.i0.a(strF, str), strA2);
                editorEdit.commit();
            }
        }
        if (firebaseMessaging.f24678d.q() || vVar == null || !str2.equals(vVar.f54884a)) {
            mb.g gVar = firebaseMessaging.f24675a;
            gVar.a();
            String str3 = gVar.f45929b;
            if ("[DEFAULT]".equals(str3)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb2 = new StringBuilder("Invoking onNewToken for app: ");
                    gVar.a();
                    sb2.append(str3);
                    Log.d("FirebaseMessaging", sb2.toString());
                }
                boolean zQ = firebaseMessaging.f24678d.q();
                Intent intent = new Intent();
                intent.putExtra("token", str2);
                if (zQ) {
                    intent.setAction("com.google.firebase.messaging.FCM_REGISTERED");
                } else {
                    intent.setAction("com.google.firebase.messaging.NEW_TOKEN");
                }
                new zc.i(firebaseMessaging.f24676b).b(intent);
            }
        }
        return Tasks.forResult(str2);
    }
}
