package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC0401j3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class Qg<Smash extends AbstractC0401j3<?>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    AbstractC0401j3<?> f27112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<String> f27113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f27114f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Rg f27116h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> f27109a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f27110b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27111c = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Timer f27115g = new Timer();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f27117i = 5;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends TimerTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27118a;

        public a(String str) {
            this.f27118a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f27118a + " from memory");
                Qg.this.f27109a.remove(this.f27118a);
                ironLog.verbose("waterfall size is currently " + Qg.this.f27109a.size());
            } finally {
                cancel();
            }
        }
    }

    public Qg(List<String> list, int i10, Rg rg2) {
        this.f27113e = list;
        this.f27114f = i10;
        this.f27116h = rg2;
    }

    private synchronized boolean e() {
        AbstractC0401j3<?> abstractC0401j3;
        abstractC0401j3 = this.f27112d;
        return abstractC0401j3 != null && abstractC0401j3.C() && this.f27112d.h().equals(this.f27111c);
    }

    public synchronized void a(AbstractC0401j3<?> abstractC0401j3) {
        IronLog.INTERNAL.verbose();
        AbstractC0401j3<?> abstractC0401j4 = this.f27112d;
        if (abstractC0401j4 != null && !abstractC0401j4.equals(abstractC0401j3)) {
            this.f27112d.M();
        }
    }

    public synchronized void b(AbstractC0401j3<?> abstractC0401j3) {
        IronLog.INTERNAL.verbose();
        this.f27112d = abstractC0401j3;
    }

    public String c() {
        return this.f27110b;
    }

    public AbstractC0401j3<?> d() {
        return this.f27112d;
    }

    public List<Smash> b() {
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.f27109a.get(this.f27110b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList() : copyOnWriteArrayList;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004b A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {all -> 0x0012, blocks: (B:3:0x0001, B:31:0x004b, B:6:0x0008, B:8:0x000d, B:13:0x0014, B:15:0x0018, B:18:0x001f, B:20:0x0023, B:23:0x0030, B:25:0x0034, B:27:0x003c), top: B:36:0x0001 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x004b, please report this as an issue */
    public synchronized boolean a(O0.a aVar, String str, String str2, LoadWhileShowSupportState loadWhileShowSupportState, AdapterBaseInterface adapterBaseInterface, IronSource.a aVar2) {
        boolean z10;
        AbstractC0401j3<?> abstractC0401j3;
        try {
            if (!a(adapterBaseInterface, aVar2, str)) {
                z10 = true;
                if ((aVar == O0.a.AUTOMATIC_LOAD_WHILE_SHOW || aVar == O0.a.MANUAL_WITH_LOAD_ON_SHOW) && (abstractC0401j3 = this.f27112d) != null && abstractC0401j3.C() && ((loadWhileShowSupportState == LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK && this.f27112d.c().equals(str)) || ((loadWhileShowSupportState == LoadWhileShowSupportState.NONE || this.f27113e.contains(str2)) && this.f27112d.n().equals(str2)))) {
                }
                if (!z10) {
                    IronLog.INTERNAL.verbose(str + " will not be added to the auction request");
                }
            }
            z10 = false;
            if (!z10) {
                IronLog.INTERNAL.verbose(str + " will not be added to the auction request");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return z10;
    }

    public boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.a aVar, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(If.a(aVar))) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    public void a(O0.a aVar, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        a();
        if (aVar != O0.a.AUTOMATIC_LOAD_WHILE_SHOW && aVar != O0.a.MANUAL_WITH_LOAD_ON_SHOW) {
            this.f27109a.clear();
            this.f27109a.put(str, copyOnWriteArrayList);
        } else {
            this.f27109a.put(str, copyOnWriteArrayList);
            if (!TextUtils.isEmpty(this.f27111c)) {
                if (e()) {
                    StringBuilder sb2 = new StringBuilder("ad from previous waterfall ");
                    sb2.append(this.f27111c);
                    sb2.append(" is still showing - the current waterfall ");
                    com.google.android.gms.internal.measurement.f2.w(sb2, this.f27110b, " will be deleted instead", ironLog);
                    String str2 = this.f27110b;
                    this.f27110b = this.f27111c;
                    this.f27111c = str2;
                }
                this.f27115g.schedule(new a(this.f27111c), this.f27114f);
            }
        }
        this.f27111c = this.f27110b;
        this.f27110b = str;
        if (this.f27109a.size() > 5) {
            this.f27116h.a(this.f27109a.size());
        }
    }

    private void a() {
        for (Smash smash : b()) {
            if (!smash.equals(this.f27112d)) {
                smash.M();
            }
        }
    }
}
