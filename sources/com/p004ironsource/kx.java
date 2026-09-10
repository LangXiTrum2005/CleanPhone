package com.p004ironsource;

import android.text.TextUtils;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.LoadWhileShowSupportState;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.s7;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class kx<Smash extends s7<?>> {
    s7<?> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f25547e;
    private final int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    lx f25548h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> f25544a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25545b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f25546c = "";
    private final Timer g = new Timer();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f25549i = 5;

    public class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f25550a;

        public a(String str) {
            this.f25550a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f25550a + " from memory");
                kx.this.f25544a.remove(this.f25550a);
                ironLog.verbose("waterfall size is currently " + kx.this.f25544a.size());
            } finally {
                cancel();
            }
        }
    }

    public kx(List<String> list, int i2, lx lxVar) {
        this.f25547e = list;
        this.f = i2;
        this.f25548h = lxVar;
    }

    private void a() {
        for (Smash smash : b()) {
            if (!smash.equals(this.d)) {
                smash.M();
            }
        }
    }

    private synchronized boolean e() {
        s7<?> s7Var;
        s7Var = this.d;
        return s7Var != null && s7Var.C() && this.d.h().equals(this.f25546c);
    }

    public List<Smash> b() {
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.f25544a.get(this.f25545b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList() : copyOnWriteArrayList;
    }

    public String c() {
        return this.f25545b;
    }

    public s7<?> d() {
        return this.d;
    }

    public void a(m2.a aVar, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        a();
        if (aVar == m2.a.AUTOMATIC_LOAD_WHILE_SHOW || aVar == m2.a.MANUAL_WITH_LOAD_ON_SHOW) {
            this.f25544a.put(str, copyOnWriteArrayList);
            if (!TextUtils.isEmpty(this.f25546c)) {
                if (e()) {
                    StringBuilder sb = new StringBuilder("ad from previous waterfall ");
                    sb.append(this.f25546c);
                    sb.append(" is still showing - the current waterfall ");
                    com.google.firebase.crashlytics.internal.model.a.y(sb, this.f25545b, " will be deleted instead", ironLog);
                    String str2 = this.f25545b;
                    this.f25545b = this.f25546c;
                    this.f25546c = str2;
                }
                this.g.schedule(new a(this.f25546c), this.f);
            }
        } else {
            this.f25544a.clear();
            this.f25544a.put(str, copyOnWriteArrayList);
        }
        this.f25546c = this.f25545b;
        this.f25545b = str;
        if (this.f25544a.size() > 5) {
            this.f25548h.a(this.f25544a.size());
        }
    }

    public synchronized void b(s7<?> s7Var) {
        IronLog.INTERNAL.verbose();
        this.d = s7Var;
    }

    public synchronized void a(s7<?> s7Var) {
        IronLog.INTERNAL.verbose();
        s7<?> s7Var2 = this.d;
        if (s7Var2 != null && !s7Var2.equals(s7Var)) {
            this.d.M();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004b A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {all -> 0x0012, blocks: (B:3:0x0001, B:31:0x004b, B:6:0x0008, B:8:0x000d, B:13:0x0014, B:15:0x0018, B:18:0x001f, B:20:0x0023, B:23:0x0030, B:25:0x0034, B:27:0x003c), top: B:36:0x0001 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x004b, please report this as an issue */
    public synchronized boolean a(m2.a aVar, String str, String str2, LoadWhileShowSupportState loadWhileShowSupportState, AdapterBaseInterface adapterBaseInterface, IronSource.AD_UNIT ad_unit) {
        boolean z2;
        s7<?> s7Var;
        try {
            if (!a(adapterBaseInterface, ad_unit, str)) {
                z2 = true;
                if ((aVar == m2.a.AUTOMATIC_LOAD_WHILE_SHOW || aVar == m2.a.MANUAL_WITH_LOAD_ON_SHOW) && (s7Var = this.d) != null && s7Var.C() && ((loadWhileShowSupportState == LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK && this.d.c().equals(str)) || ((loadWhileShowSupportState == LoadWhileShowSupportState.NONE || this.f25547e.contains(str2)) && this.d.n().equals(str2)))) {
                }
                if (!z2) {
                    IronLog.INTERNAL.verbose(str + " will not be added to the auction request");
                }
            }
            z2 = false;
            if (!z2) {
                IronLog.INTERNAL.verbose(str + " will not be added to the auction request");
            }
        } catch (Throwable th) {
            throw th;
        }
        return z2;
    }

    public boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.AD_UNIT ad_unit, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(ad_unit)) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }
}
