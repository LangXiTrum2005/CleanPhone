package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import androidx.core.os.CancellationSignal;
import androidx.transition.FragmentTransitionSupport;
import androidx.transition.Transition;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
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

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Cw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2351Cw implements CancellationSignal.OnCancelListener, Ka0, C20, Continuation, FS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2949a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C2351Cw(Object obj, Object obj2, Object obj3, int i) {
        this.f2949a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FS
    public final void a(C2404Ex c2404Ex) {
        X0 x0 = (X0) this.b;
        FS fs = (FS) this.c;
        AbstractApplicationC2673Ph abstractApplicationC2673Ph = (AbstractApplicationC2673Ph) this.d;
        x0.h();
        C3927l3.C.X(abstractApplicationC2673Ph, x0.r().d);
        if (fs != null) {
            fs.a(c2404Ex);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C20
    public final Object apply(Object obj) {
        long jInsert;
        EnumC4302pJ enumC4302pJ;
        EnumC4302pJ enumC4302pJ2 = EnumC4302pJ.CACHE_FULL;
        int i = 0;
        int i2 = this.f2949a;
        int i3 = 5;
        int i4 = 4;
        int i5 = 3;
        int i6 = 2;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i7 = 1;
        E20 e20 = (E20) this.b;
        switch (i2) {
            case 2:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                C3736ir c3736ir = E20.f;
                e20.getClass();
                sQLiteDatabase.compileStatement((String) obj3).execute();
                E20.p(sQLiteDatabase.rawQuery((String) obj2, null), new A20(e20, i6));
                sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                return null;
            case 3:
                List list = (List) obj3;
                Sd0 sd0 = (Sd0) obj2;
                Cursor cursor = (Cursor) obj;
                C3736ir c3736ir2 = E20.f;
                e20.getClass();
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(i);
                    boolean z = cursor.getInt(7) != 0;
                    C4092mw c4092mw = new C4092mw();
                    c4092mw.b = new HashMap();
                    String string = cursor.getString(i7);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    c4092mw.f4722a = string;
                    c4092mw.e = Long.valueOf(cursor.getLong(2));
                    c4092mw.f = Long.valueOf(cursor.getLong(3));
                    if (z) {
                        String string2 = cursor.getString(4);
                        c4092mw.e(new C3209cr(string2 == null ? E20.f : new C3736ir(string2), cursor.getBlob(5)));
                    } else {
                        String string3 = cursor.getString(4);
                        c4092mw.e(new C3209cr(string3 == null ? E20.f : new C3736ir(string3), (byte[]) E20.p(e20.h().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), new Nd0(17))));
                    }
                    if (!cursor.isNull(6)) {
                        c4092mw.c = Integer.valueOf(cursor.getInt(6));
                    }
                    list.add(new C3675i8(j, sd0, c4092mw.b()));
                    i = 0;
                    i7 = 1;
                }
                return null;
            case 4:
                Y7 y7 = (Y7) obj3;
                Sd0 sd1 = (Sd0) obj2;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                C3736ir c3736ir3 = E20.f;
                long jSimpleQueryForLong = e20.h().compileStatement("PRAGMA page_size").simpleQueryForLong() * e20.h().compileStatement("PRAGMA page_count").simpleQueryForLong();
                Z7 z7 = e20.d;
                if (jSimpleQueryForLong >= z7.f4056a) {
                    e20.k(new C5035xg0(y7.f4007a, enumC4302pJ2, 1L));
                    return -1L;
                }
                Long lI = E20.i(sQLiteDatabase2, sd1);
                if (lI != null) {
                    jInsert = lI.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    C4289p8 c4289p8 = (C4289p8) sd1;
                    contentValues.put("backend_name", c4289p8.f4824a);
                    contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(JV.a(c4289p8.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = c4289p8.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase2.insert("transport_contexts", null, contentValues);
                }
                byte[] bArr2 = y7.c.b;
                int length = bArr2.length;
                int i8 = z7.e;
                boolean z2 = length <= i8;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", y7.f4007a);
                contentValues2.put("timestamp_ms", Long.valueOf(y7.d));
                contentValues2.put("uptime_ms", Long.valueOf(y7.e));
                contentValues2.put("payload_encoding", y7.c.f4247a.f4524a);
                contentValues2.put("code", y7.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put(MRAIDCommunicatorUtil.PLACEMENT_INLINE, Boolean.valueOf(z2));
                contentValues2.put("payload", z2 ? bArr2 : new byte[0]);
                long jInsert2 = sQLiteDatabase2.insert(com.umeng.analytics.pro.f.ax, null, contentValues2);
                if (!z2) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i8));
                    while (i7 <= iCeil) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i7 - 1) * i8, Math.min(i7 * i8, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i7));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase2.insert("event_payloads", null, contentValues3);
                        i7++;
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(y7.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) entry.getValue());
                    sQLiteDatabase2.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            default:
                Map map = (Map) obj3;
                C3844k50 c3844k50 = (C3844k50) obj2;
                Cursor cursor2 = (Cursor) obj;
                C3736ir c3736ir4 = E20.f;
                e20.getClass();
                while (cursor2.moveToNext()) {
                    String string4 = cursor2.getString(0);
                    int i9 = cursor2.getInt(1);
                    EnumC4302pJ enumC4302pJ3 = EnumC4302pJ.REASON_UNKNOWN;
                    if (i9 != 0) {
                        if (i9 == 1) {
                            enumC4302pJ3 = EnumC4302pJ.MESSAGE_TOO_OLD;
                        } else if (i9 == 2) {
                            enumC4302pJ = enumC4302pJ2;
                        } else if (i9 == i5) {
                            enumC4302pJ3 = EnumC4302pJ.PAYLOAD_TOO_BIG;
                        } else if (i9 == i4) {
                            enumC4302pJ3 = EnumC4302pJ.MAX_RETRIES_REACHED;
                        } else if (i9 == i3) {
                            enumC4302pJ3 = EnumC4302pJ.INVALID_PAYLOD;
                        } else if (i9 == 6) {
                            enumC4302pJ3 = EnumC4302pJ.SERVER_ERROR;
                        } else {
                            AbstractC2871Wx.X("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i9));
                        }
                        enumC4302pJ = enumC4302pJ3;
                    } else {
                        enumC4302pJ = enumC4302pJ3;
                    }
                    long j2 = cursor2.getLong(2);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new C4390qJ(j2, enumC4302pJ));
                    i3 = 5;
                    i4 = 4;
                    i5 = 3;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i10 = C4565sJ.c;
                    new ArrayList();
                    ((List) c3844k50.d).add(new C4565sJ((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long jA = ((C5211zg0) e20.b).a();
                SQLiteDatabase sQLiteDatabaseH = e20.h();
                sQLiteDatabaseH.beginTransaction();
                try {
                    Cc0 cc0 = (Cc0) E20.p(sQLiteDatabaseH.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new B20(jA, i7));
                    sQLiteDatabaseH.setTransactionSuccessful();
                    sQLiteDatabaseH.endTransaction();
                    c3844k50.c = cc0;
                    c3844k50.e = new C3918ky(new E90(e20.h().compileStatement("PRAGMA page_size").simpleQueryForLong() * e20.h().compileStatement("PRAGMA page_count").simpleQueryForLong(), Z7.f.f4056a));
                    c3844k50.b = (String) e20.e.get();
                    return new C5120yf((Cc0) c3844k50.c, Collections.unmodifiableList((List) c3844k50.d), (C3918ky) c3844k50.e, (String) c3844k50.b);
                } catch (Throwable th) {
                    sQLiteDatabaseH.endTransaction();
                    throw th;
                }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ka0
    public final Object execute() {
        C2653On c2653On = (C2653On) this.b;
        Sd0 sd0 = (Sd0) this.c;
        Y7 y7 = (Y7) this.d;
        E20 e20 = (E20) c2653On.d;
        e20.getClass();
        HV hv = ((C4289p8) sd0).c;
        String str = y7.f4007a;
        if (Log.isLoggable(AbstractC2871Wx.f0("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(hv);
        }
        if (((Long) e20.k(new C2351Cw(e20, y7, sd0, 4))).longValue() >= 1 && sd0 == null) {
            throw new NullPointerException("Null transportContext");
        }
        ((FE) c2653On.f3523a).a(sd0, 1, false);
        return null;
    }

    @Override // androidx.core.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        FragmentTransitionSupport.lambda$setListenerForTransitionEnd$0((Runnable) this.b, (Transition) this.d, (Runnable) this.c);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        C2803Uh c2803Uh;
        URL url;
        int i = this.f2949a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 6:
                C2375Du c2375Du = (C2375Du) obj3;
                Task task2 = (Task) obj2;
                Task task3 = (Task) obj;
                c2375Du.getClass();
                if (!task2.isSuccessful() || task2.getResult() == null) {
                    return Tasks.forResult(Boolean.FALSE);
                }
                C2803Uh c2803Uh2 = (C2803Uh) task2.getResult();
                if (task3.isSuccessful() && (c2803Uh = (C2803Uh) task3.getResult()) != null && c2803Uh2.c.equals(c2803Uh.c)) {
                    return Tasks.forResult(Boolean.FALSE);
                }
                C2777Th c2777Th = c2375Du.e;
                c2777Th.getClass();
                GJ gj = new GJ(4, c2777Th, c2803Uh2);
                Executor executor = c2777Th.f3784a;
                return Tasks.call(executor, gj).onSuccessTask(executor, new C2809Un(c2777Th, c2803Uh2)).continueWith(c2375Du.c, new C2349Cu(c2375Du));
            default:
                C2700Qi c2700Qi = (C2700Qi) obj3;
                Task task4 = (Task) obj2;
                Task task5 = (Task) obj;
                int[] iArr = C2700Qi.p;
                c2700Qi.getClass();
                if (!task4.isSuccessful()) {
                    return Tasks.forException(new C2401Eu("Firebase Installations failed to get installation auth token for config update listener connection.", task4.getException(), 1));
                }
                if (!task5.isSuccessful()) {
                    return Tasks.forException(new C2401Eu("Firebase Installations failed to get installation ID for config update listener connection.", task5.getException(), 1));
                }
                try {
                    try {
                        url = new URL(c2700Qi.c(c2700Qi.l));
                        break;
                    } catch (MalformedURLException unused) {
                        url = null;
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    c2700Qi.j(httpURLConnection, (String) task5.getResult(), ((C3146c8) task4.getResult()).f4207a);
                    return Tasks.forResult(httpURLConnection);
                } catch (IOException e) {
                    return Tasks.forException(new C2401Eu("Failed to open HTTP stream connection", e, 1));
                }
        }
    }

    public /* synthetic */ C2351Cw(Runnable runnable, Transition transition, Runnable runnable2) {
        this.f2949a = 0;
        this.b = runnable;
        this.d = transition;
        this.c = runnable2;
    }
}
