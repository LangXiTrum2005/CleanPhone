package com.smartdigimkt.o6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.p004ironsource.d9;
import com.smartdigimkt.i7.d;
import com.smartdigimkt.n8.b;
import com.smartdigimkt.w6.f;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final String g = "code";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f37458h = "packageName";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile String f37459i = null;
    public static final String j = "Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9PUEVORUQ=";
    public static final String k = "Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9DTE9TRUQ=";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f37460l = "Y29tLnhpYW9taS5tYXJrZXQuRElSRUNUX01BSUxfU1RBVFVT";
    public static final String m = "Y29udGVudDovL2NvbS54aWFvbWkubWFya2V0LnByb3ZpZGVyLkRpcmVjdE1haWxQcm92aWRlcg==";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile a f37461n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    BroadcastReceiver f37463b;
    private volatile Boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f37465e;
    private Context f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<f> f37462a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f37464c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.smartdigimkt.o6.a$a, reason: collision with other inner class name */
    public class C0561a extends BroadcastReceiver {
        public C0561a() {
        }

        private f a(String str) {
            if (a.this.f37465e != null && TextUtils.equals(a.this.f37465e.X(), str)) {
                return a.this.f37465e;
            }
            if (a.this.f37462a == null || a.this.f37462a.size() <= 0) {
                return null;
            }
            for (f fVar : a.this.f37462a) {
                if (fVar != null && TextUtils.equals(fVar.X(), str)) {
                    return fVar;
                }
            }
            return null;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras;
            f fVarA;
            String action = intent.getAction();
            if (TextUtils.isEmpty(action) || action.equals(b.a("Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9PUEVORUQ=")) || action.equals(b.a("Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9DTE9TRUQ=")) || !action.equals(b.a("Y29tLnhpYW9taS5tYXJrZXQuRElSRUNUX01BSUxfU1RBVFVT")) || (extras = intent.getExtras()) == null) {
                return;
            }
            int i2 = extras.getInt("code", -1);
            String string = extras.getString("packageName", "");
            if (i2 == -1 || TextUtils.isEmpty(string) || (fVarA = a(string)) == null) {
                return;
            }
            if (i2 == 4) {
                a.this.b(fVarA);
            }
            d.a(fVarA.d0(), fVarA.L(), "", i2, "", 0L, 0L, fVarA);
        }
    }

    private a() {
    }

    private void f() {
        if (this.d == null || !this.d.booleanValue() || this.f == null) {
            return;
        }
        try {
            this.f37463b = new C0561a();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(b.a("Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9PUEVORUQ="));
            intentFilter.addAction(b.a("Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9DTE9TRUQ="));
            intentFilter.addAction(b.a("Y29tLnhpYW9taS5tYXJrZXQuRElSRUNUX01BSUxfU1RBVFVT"));
            this.f.registerReceiver(this.f37463b, intentFilter);
        } catch (Throwable unused) {
        }
    }

    public f c() {
        return this.f37465e;
    }

    public int d() {
        if (this.d != null) {
            return this.d.booleanValue() ? 1 : 0;
        }
        return -1;
    }

    public String e() {
        try {
            if (f37459i == null) {
                return "";
            }
            return d9.i.d + f37459i + d9.i.f24752e;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static a b() {
        if (f37461n == null) {
            synchronized (a.class) {
                try {
                    if (f37461n == null) {
                        f37461n = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f37461n;
    }

    public void a(f fVar) {
        if (this.d == null || fVar == null || !this.d.booleanValue()) {
            return;
        }
        this.f37465e = fVar;
        this.f37462a.add(fVar);
    }

    public void a(Context context) {
        BroadcastReceiver broadcastReceiver = this.f37463b;
        if (broadcastReceiver == null || context == null) {
            return;
        }
        try {
            context.unregisterReceiver(broadcastReceiver);
            this.f37465e = null;
            this.f37462a.clear();
            this.f37462a = null;
            this.f37463b = null;
            this.f = null;
        } catch (Throwable unused) {
            this.f37465e = null;
            this.f37462a.clear();
            this.f37462a = null;
            this.f37463b = null;
            this.f = null;
        }
    }

    public void b(f fVar) {
        if (this.d == null || fVar == null || !this.d.booleanValue()) {
            return;
        }
        this.f37465e = null;
        try {
            this.f37462a.remove(fVar);
        } catch (Exception unused) {
        }
    }

    public void b(Context context) {
        this.f = context;
        if (this.f37464c.compareAndSet(false, true)) {
            try {
                this.d = a();
                f();
            } catch (Throwable unused) {
            }
        }
    }

    private Boolean a() {
        Cursor cursorQuery;
        Context contextK = com.smartdigimkt.m6.b.p().k();
        Boolean boolValueOf = null;
        if (contextK != null && contextK.getContentResolver() != null) {
            try {
                cursorQuery = contextK.getContentResolver().query(Uri.parse(b.a("Y29udGVudDovL2NvbS54aWFvbWkubWFya2V0LnByb3ZpZGVyLkRpcmVjdE1haWxQcm92aWRlcg==")), null, null, null, null);
            } catch (Throwable unused) {
                cursorQuery = null;
            }
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    try {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("support"));
                        if (!TextUtils.isEmpty(string) && !string.equalsIgnoreCase(AbstractJsonLexerKt.NULL) && (string.equalsIgnoreCase("false") || string.equalsIgnoreCase(com.p004ironsource.mediationsdk.metadata.a.g))) {
                            boolValueOf = Boolean.valueOf(Boolean.parseBoolean(string));
                        }
                    } catch (Throwable unused2) {
                    }
                    try {
                        f37459i = cursorQuery.getString(cursorQuery.getColumnIndex("detailStyle"));
                    } catch (Exception unused3) {
                    }
                }
                try {
                    cursorQuery.close();
                } catch (Throwable unused4) {
                }
            }
        }
        return boolValueOf;
    }
}
