package com.thinkup.core.o.m;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.a;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.thinkup.core.common.n.no;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.ooo.mm;
import com.thinkup.core.common.ooo.nm;
import com.thinkup.core.oo.o0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class m {
    private static volatile m m;
    private final String o = "m";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42423n = "";
    private final int o0 = 1;
    private final int oo = 60000;
    private final AtomicLong om = new AtomicLong(0);
    private final AtomicLong on = new AtomicLong(0);
    private final AtomicBoolean m0 = new AtomicBoolean(false);
    private final AtomicBoolean mo = new AtomicBoolean(false);
    private final AtomicBoolean mm = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.thinkup.core.o.m.m$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ Context o;

        public AnonymousClass1(Context context) {
            this.o = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                String unused = m.this.o;
                m.this.m0.get();
                m.this.mo.get();
                m.this.mm.get();
                if (m.this.m0.get() && m.this.mm.get() && m.this.mo.get()) {
                    Intent intentO = m.o(m.this, this.o);
                    intentO.putExtra("a", 1);
                    no.o(this.o).o(intentO);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.o.m.m$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {
        final /* synthetic */ Context m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Bundle f42426n;
        final /* synthetic */ int o;

        public AnonymousClass4(int i2, Context context, Bundle bundle) {
            this.o = i2;
            this.m = context;
            this.f42426n = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (m.this.m0.get() && m.this.mm.get()) {
                    int i2 = this.o;
                    if (i2 == 5 || i2 == 6 || i2 == 7) {
                        Intent intentO = m.o(m.this, this.m);
                        intentO.putExtra("a", this.o);
                        intentO.putExtra("b", this.f42426n);
                        no.o(this.m).o(intentO);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private m() {
    }

    private void m(Context context) {
        com.thinkup.core.common.ooo.m.m.o().m((Runnable) new AnonymousClass1(context), 2);
    }

    private Intent n(Context context) {
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(this.f42423n)) {
            String strM = "";
            for (int i2 = 0; i2 < 2; i2++) {
                strM = a.m(strM, packageName);
            }
            this.f42423n = nm.n(mm.n(strM));
        }
        Intent intent = new Intent(this.f42423n);
        intent.setPackage(packageName);
        intent.putExtra("s", 1);
        return intent;
    }

    public static m o() {
        if (m == null) {
            synchronized (m.class) {
                try {
                    if (m == null) {
                        m = new m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    public final void m(final Context context, JSONObject jSONObject) {
        if (context != null && this.m0.get()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.on.get();
            if (jCurrentTimeMillis - j <= ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS || !this.on.compareAndSet(j, jCurrentTimeMillis)) {
                return;
            }
            final String string = jSONObject.toString();
            com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.o.m.m.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Intent intentO = m.o(m.this, context);
                        intentO.putExtra("a", 3);
                        intentO.putExtra("d", string);
                        no.o(context).o(intentO);
                    } catch (Throwable unused) {
                    }
                }
            }, 2);
        }
    }

    public final void o(Context context) {
        if (context == null) {
            return;
        }
        AtomicBoolean atomicBoolean = this.m0;
        o0n.m();
        atomicBoolean.set(false);
        com.thinkup.core.oo.m mVarH = com.google.firebase.crashlytics.internal.model.a.h(o0.o(context));
        if (mVarH == null || mVarH.mom()) {
            return;
        }
        this.mm.set(mVarH.ooon() != 2);
        this.mo.set(true);
        com.thinkup.core.common.ooo.m.m.o().m((Runnable) new AnonymousClass1(context), 2);
    }

    public final void o(final Context context, JSONObject jSONObject) {
        if (context != null && this.m0.get()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.om.get();
            if (jCurrentTimeMillis - j <= ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS || !this.om.compareAndSet(j, jCurrentTimeMillis)) {
                return;
            }
            final String string = jSONObject.toString();
            com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.o.m.m.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Intent intentO = m.o(m.this, context);
                        intentO.putExtra("a", 2);
                        intentO.putExtra("d", string);
                        no.o(context).o(intentO);
                    } catch (Throwable unused) {
                    }
                }
            }, 2);
        }
    }

    private void o(Context context, int i2, Bundle bundle) {
        com.thinkup.core.common.ooo.m.m.o().m((Runnable) new AnonymousClass4(i2, context, bundle), 2);
    }

    public static /* synthetic */ Intent o(m mVar, Context context) {
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(mVar.f42423n)) {
            String strM = "";
            for (int i2 = 0; i2 < 2; i2++) {
                strM = a.m(strM, packageName);
            }
            mVar.f42423n = nm.n(mm.n(strM));
        }
        Intent intent = new Intent(mVar.f42423n);
        intent.setPackage(packageName);
        intent.putExtra("s", 1);
        return intent;
    }
}
