package com.thinkup.core.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.p004ironsource.d9;
import com.p004ironsource.mediationsdk.metadata.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class nn {
    public static final String m = "Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9PUEVORUQ=";
    private static volatile String mm = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f41985n = "Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9DTE9TRUQ=";
    private static volatile nn nm = null;
    public static final String o0 = "Y29tLnhpYW9taS5tYXJrZXQuRElSRUNUX01BSUxfU1RBVFVT";
    private static final String om = "code";
    private static final String on = "packageName";
    public static final String oo = "Y29udGVudDovL2NvbS54aWFvbWkubWFya2V0LnByb3ZpZGVyLkRpcmVjdE1haWxQcm92aWRlcg==";
    private volatile Boolean mn;
    private com.thinkup.core.common.on.ooo n0;
    private Context no;
    BroadcastReceiver o;
    private CopyOnWriteArrayList<com.thinkup.core.common.on.ooo> m0 = new CopyOnWriteArrayList<>();
    private final AtomicBoolean mo = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.thinkup.core.common.nn$1, reason: invalid class name */
    public class AnonymousClass1 extends BroadcastReceiver {
        public AnonymousClass1() {
        }

        private com.thinkup.core.common.on.ooo o(String str) {
            if (nn.this.n0 != null && TextUtils.equals(nn.this.n0.oo0(), str)) {
                return nn.this.n0;
            }
            if (nn.this.m0 == null || nn.this.m0.size() <= 0) {
                return null;
            }
            for (com.thinkup.core.common.on.ooo oooVar : nn.this.m0) {
                if (oooVar != null && TextUtils.equals(oooVar.oo0(), str)) {
                    return oooVar;
                }
            }
            return null;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Bundle extras;
            com.thinkup.core.common.on.ooo oooVar;
            String action = intent.getAction();
            if (TextUtils.isEmpty(action) || action.equals(com.thinkup.core.common.ooo.mm.m("Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9PUEVORUQ=")) || action.equals(com.thinkup.core.common.ooo.mm.m("Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9DTE9TRUQ=")) || !action.equals(com.thinkup.core.common.ooo.mm.m("Y29tLnhpYW9taS5tYXJrZXQuRElSRUNUX01BSUxfU1RBVFVT")) || (extras = intent.getExtras()) == null) {
                return;
            }
            int i2 = extras.getInt("code", -1);
            String string = extras.getString("packageName", "");
            if (i2 == -1 || TextUtils.isEmpty(string)) {
                return;
            }
            if (nn.this.n0 != null && TextUtils.equals(nn.this.n0.oo0(), string)) {
                oooVar = nn.this.n0;
            } else if (nn.this.m0 != null && nn.this.m0.size() > 0) {
                Iterator it = nn.this.m0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        oooVar = null;
                        break;
                    }
                    com.thinkup.core.common.on.ooo oooVar2 = (com.thinkup.core.common.on.ooo) it.next();
                    if (oooVar2 != null && TextUtils.equals(oooVar2.oo0(), string)) {
                        oooVar = oooVar2;
                        break;
                    }
                }
            } else {
                oooVar = null;
                break;
            }
            if (oooVar == null) {
                return;
            }
            if (i2 == 4) {
                nn.this.o(oooVar);
            }
            com.thinkup.core.common.oo0.oo.o(oooVar.om(), oooVar.mo(), "", i2, "", oooVar.mon(), oooVar.mm0());
        }
    }

    private nn() {
    }

    private com.thinkup.core.common.on.ooo o0() {
        return this.n0;
    }

    private static Boolean om() {
        Cursor cursorQuery;
        Context contextOn = com.thinkup.core.common.n.o0n.m().on();
        Boolean boolValueOf = null;
        if (contextOn != null && contextOn.getContentResolver() != null) {
            try {
                cursorQuery = contextOn.getContentResolver().query(Uri.parse(com.thinkup.core.common.ooo.mm.m("Y29udGVudDovL2NvbS54aWFvbWkubWFya2V0LnByb3ZpZGVyLkRpcmVjdE1haWxQcm92aWRlcg==")), null, null, null, null);
            } catch (Throwable unused) {
                cursorQuery = null;
            }
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    try {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("support"));
                        if (!TextUtils.isEmpty(string) && !string.equalsIgnoreCase(AbstractJsonLexerKt.NULL) && (string.equalsIgnoreCase("false") || string.equalsIgnoreCase(a.g))) {
                            boolValueOf = Boolean.valueOf(Boolean.parseBoolean(string));
                        }
                    } catch (Throwable unused2) {
                    }
                    try {
                        mm = cursorQuery.getString(cursorQuery.getColumnIndex("detailStyle"));
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

    private void oo() {
        if (this.mn == null || !this.mn.booleanValue() || this.no == null) {
            return;
        }
        try {
            this.o = new AnonymousClass1();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(com.thinkup.core.common.ooo.mm.m("Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9PUEVORUQ="));
            intentFilter.addAction(com.thinkup.core.common.ooo.mm.m("Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9DTE9TRUQ="));
            intentFilter.addAction(com.thinkup.core.common.ooo.mm.m("Y29tLnhpYW9taS5tYXJrZXQuRElSRUNUX01BSUxfU1RBVFVT"));
            this.no.registerReceiver(this.o, intentFilter);
        } catch (Throwable unused) {
        }
    }

    public final int n() {
        if (this.mn != null) {
            return this.mn.booleanValue() ? 1 : 0;
        }
        return -1;
    }

    private void m(com.thinkup.core.common.on.ooo oooVar) {
        if (this.mn == null || oooVar == null || !this.mn.booleanValue()) {
            return;
        }
        this.n0 = oooVar;
        this.m0.add(oooVar);
    }

    public static nn o() {
        if (nm == null) {
            synchronized (nn.class) {
                try {
                    if (nm == null) {
                        nm = new nn();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return nm;
    }

    private void m(Context context) {
        BroadcastReceiver broadcastReceiver = this.o;
        if (broadcastReceiver == null || context == null) {
            return;
        }
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (Throwable unused) {
        }
        this.n0 = null;
        this.m0.clear();
        this.m0 = null;
        this.o = null;
        this.no = null;
    }

    public final void o(com.thinkup.core.common.on.ooo oooVar) {
        if (this.mn == null || oooVar == null || !this.mn.booleanValue()) {
            return;
        }
        this.n0 = null;
        try {
            this.m0.remove(oooVar);
        } catch (Exception unused) {
        }
    }

    public final void o(Context context) {
        this.no = context;
        if (this.mo.compareAndSet(false, true)) {
            try {
                this.mn = om();
                if (this.mn == null || !this.mn.booleanValue() || this.no == null) {
                    return;
                }
                this.o = new AnonymousClass1();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(com.thinkup.core.common.ooo.mm.m("Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9PUEVORUQ="));
                intentFilter.addAction(com.thinkup.core.common.ooo.mm.m("Y29tLnhpYW9taS5tYXJrZXQuRE1fUEFHRV9DTE9TRUQ="));
                intentFilter.addAction(com.thinkup.core.common.ooo.mm.m("Y29tLnhpYW9taS5tYXJrZXQuRElSRUNUX01BSUxfU1RBVFVT"));
                this.no.registerReceiver(this.o, intentFilter);
            } catch (Throwable unused) {
            }
        }
    }

    public static String m() {
        try {
            if (mm == null) {
                return "";
            }
            return d9.i.d + mm + d9.i.f24752e;
        } catch (Throwable unused) {
            return "";
        }
    }
}
