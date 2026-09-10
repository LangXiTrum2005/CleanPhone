package com.p004ironsource;

import android.text.TextUtils;
import com.p004ironsource.mediationsdk.LoadWhileShowSupportState;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.p004ironsource.mediationsdk.impressionData.ImpressionData;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.r;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class hl {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f25246i = "WaterfallLifeCycleHolder";
    private r d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f25250e;
    private final int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, CopyOnWriteArrayList<r>> f25247a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25248b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f25249c = "";
    private final Timer g = new Timer();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ConcurrentHashMap<String, AdInfo> f25251h = new ConcurrentHashMap<>();

    public class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f25252a;

        public a(String str) {
            this.f25252a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f25252a + " from memory");
                hl.this.f25247a.remove(this.f25252a);
                ironLog.verbose("waterfall size is currently " + hl.this.f25247a.size());
                ironLog.verbose("removing adInfo with id " + this.f25252a + " from memory");
                hl.this.f25251h.remove(this.f25252a);
                ironLog.verbose("adInfo size is currently " + hl.this.f25251h.size());
            } finally {
                cancel();
            }
        }
    }

    public hl(List<String> list, int i2) {
        this.f25250e = list;
        this.f = i2;
    }

    private void b() {
        for (r rVar : c()) {
            if (!rVar.equals(this.d)) {
                rVar.q();
            }
        }
    }

    public AdInfo a(String str) {
        if (this.f25251h.containsKey(str)) {
            return this.f25251h.get(str);
        }
        return null;
    }

    public CopyOnWriteArrayList<r> c() {
        CopyOnWriteArrayList<r> copyOnWriteArrayList = this.f25247a.get(this.f25248b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    public String d() {
        return this.f25248b;
    }

    public int e() {
        return this.f25247a.size();
    }

    public r f() {
        return this.d;
    }

    public synchronized boolean g() {
        r rVar;
        rVar = this.d;
        return rVar != null && rVar.u().equals(this.f25249c);
    }

    public synchronized void a(r rVar) {
        try {
            IronLog.INTERNAL.verbose();
            r rVar2 = this.d;
            if (rVar2 != null && !rVar2.equals(rVar)) {
                this.d.q();
            }
            this.d = rVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    public synchronized boolean b(r rVar) {
        boolean z2;
        try {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose();
            if (rVar == null || rVar.o()) {
                z2 = true;
            } else {
                z2 = false;
                if (this.d != null && ((rVar.w() == LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK && this.d.c().equals(rVar.c())) || ((rVar.w() == LoadWhileShowSupportState.NONE || this.f25250e.contains(rVar.j())) && this.d.j().equals(rVar.j())))) {
                    z2 = true;
                }
            }
            if (z2 && rVar != null) {
                ironLog.verbose(rVar.c() + " will not be added to the auction request");
            }
        } catch (Throwable th) {
            throw th;
        }
        return !z2;
    }

    public void a(String str, ImpressionData impressionData, cn cnVar) {
        if (TextUtils.isEmpty(str) || impressionData == null) {
            return;
        }
        this.f25251h.put(str, new AdInfo(impressionData, cnVar));
    }

    public void a(CopyOnWriteArrayList<r> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        b();
        this.f25247a.put(str, copyOnWriteArrayList);
        if (!TextUtils.isEmpty(this.f25249c)) {
            if (g()) {
                StringBuilder sb = new StringBuilder("ad from previous waterfall ");
                sb.append(this.f25249c);
                sb.append(" is still showing - the current waterfall ");
                com.google.firebase.crashlytics.internal.model.a.y(sb, this.f25248b, " will be deleted instead", ironLog);
                String str2 = this.f25248b;
                this.f25248b = this.f25249c;
                this.f25249c = str2;
            }
            this.g.schedule(new a(this.f25249c), this.f);
        }
        this.f25249c = this.f25248b;
        this.f25248b = str;
    }

    public boolean a() {
        return this.f25247a.size() > 5;
    }
}
