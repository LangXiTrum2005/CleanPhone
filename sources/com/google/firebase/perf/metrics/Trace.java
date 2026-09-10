package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cd.c;
import cd.d;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import d5.u;
import defpackage.e;
import fd.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import jd.b;
import ld.g;
import md.h;
import v0.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class Trace extends d implements Parcelable, b {

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f24713m = a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f24714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Trace f24715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GaugeManager f24716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f24718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f24719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f24720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f24721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f24722i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jj.d f24723j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h f24724k;
    public h l;

    static {
        new ConcurrentHashMap();
        CREATOR = new f9.d(6);
    }

    public Trace(String str, g gVar, jj.d dVar, c cVar) {
        this(str, gVar, dVar, cVar, GaugeManager.getInstance());
    }

    @Override // jd.b
    public final void a(jd.a aVar) {
        if (aVar == null) {
            f24713m.f("Unable to add new SessionId to the Trace. Continuing without it.");
        } else {
            if (this.f24724k == null || c()) {
                return;
            }
            this.f24720g.add(aVar);
        }
    }

    public final void b(String str, String str2) {
        if (c()) {
            Locale locale = Locale.ENGLISH;
            throw new IllegalArgumentException(e.o("Trace '", this.f24717d, "' has been stopped"));
        }
        ConcurrentHashMap concurrentHashMap = this.f24719f;
        if (concurrentHashMap.containsKey(str) || concurrentHashMap.size() < 5) {
            hd.e.b(str, str2);
        } else {
            Locale locale2 = Locale.ENGLISH;
            throw new IllegalArgumentException("Exceeds max limit of number of attributes - 5");
        }
    }

    public final boolean c() {
        return this.l != null;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    public final void finalize() throws Throwable {
        try {
            if ((this.f24724k != null) && !c()) {
                f24713m.g("Trace '%s' is started but not stopped when it is destructed!", this.f24717d);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    @Nullable
    @Keep
    public String getAttribute(@NonNull String str) {
        return (String) this.f24719f.get(str);
    }

    @NonNull
    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f24719f);
    }

    @Keep
    public long getLongMetric(@NonNull String str) {
        gd.c cVar = str != null ? (gd.c) this.f24718e.get(str.trim()) : null;
        if (cVar == null) {
            return 0L;
        }
        return cVar.f41844b.get();
    }

    @Keep
    public void incrementMetric(@NonNull String str, long j10) {
        String strC = hd.e.c(str);
        a aVar = f24713m;
        if (strC != null) {
            aVar.c("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strC);
            return;
        }
        h hVar = this.f24724k;
        String str2 = this.f24717d;
        if (hVar == null) {
            aVar.g("Cannot increment metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (c()) {
            aVar.g("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.f24718e;
        gd.c cVar = (gd.c) concurrentHashMap.get(strTrim);
        if (cVar == null) {
            cVar = new gd.c(strTrim);
            concurrentHashMap.put(strTrim, cVar);
        }
        AtomicLong atomicLong = cVar.f41844b;
        atomicLong.addAndGet(j10);
        if (aVar.f40789b) {
            StringBuilder sbK = u.k("Incrementing metric '", str, "' to ");
            sbK.append(atomicLong.get());
            sbK.append(" on trace '");
            sbK.append(str2);
            sbK.append("'");
            aVar.a(sbK.toString());
        }
    }

    @Keep
    public void putAttribute(@NonNull String str, @NonNull String str2) {
        boolean z10;
        a aVar = f24713m;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            aVar.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f24717d);
            z10 = true;
        } catch (Exception e10) {
            aVar.c("Can not set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
            z10 = false;
        }
        if (z10) {
            this.f24719f.put(str, str2);
        }
    }

    @Keep
    public void putMetric(@NonNull String str, long j10) {
        String strC = hd.e.c(str);
        a aVar = f24713m;
        if (strC != null) {
            aVar.c("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strC);
            return;
        }
        h hVar = this.f24724k;
        String str2 = this.f24717d;
        if (hVar == null) {
            aVar.g("Cannot set value for metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (c()) {
            aVar.g("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.f24718e;
        gd.c cVar = (gd.c) concurrentHashMap.get(strTrim);
        if (cVar == null) {
            cVar = new gd.c(strTrim);
            concurrentHashMap.put(strTrim, cVar);
        }
        cVar.f41844b.set(j10);
        aVar.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j10), str2);
    }

    @Keep
    public void removeAttribute(@NonNull String str) {
        if (!c()) {
            this.f24719f.remove(str);
            return;
        }
        a aVar = f24713m;
        if (aVar.f40789b) {
            aVar.f40788a.getClass();
            Log.e("FirebasePerformance", "Can't remove a attribute from a Trace that's stopped.");
        }
    }

    @Keep
    public void start() {
        String str;
        String str2;
        boolean zO = dd.a.e().o();
        a aVar = f24713m;
        if (!zO) {
            aVar.a("Trace feature is disabled.");
            return;
        }
        Pattern pattern = hd.e.f42322a;
        String str3 = this.f24717d;
        if (str3 == null) {
            str = "Trace name must not be null";
        } else if (str3.length() > 100) {
            Locale locale = Locale.US;
            str = "Trace name must not exceed 100 characters";
        } else if (str3.startsWith("_")) {
            int[] iArrD = i.d(6);
            int length = iArrD.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    switch (iArrD[i10]) {
                        case 1:
                            str2 = "_as";
                            break;
                        case 2:
                            str2 = "_astui";
                            break;
                        case 3:
                            str2 = "_astfd";
                            break;
                        case 4:
                            str2 = "_asti";
                            break;
                        case 5:
                            str2 = "_fs";
                            break;
                        case 6:
                            str2 = "_bs";
                            break;
                        default:
                            throw null;
                    }
                    if (!str2.equals(str3)) {
                        i10++;
                    }
                } else if (!str3.startsWith("_st_")) {
                    str = "Trace name must not start with '_'";
                }
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            aVar.c("Cannot start trace '%s'. Trace name is invalid.(%s)", str3, str);
            return;
        }
        if (this.f24724k != null) {
            aVar.c("Trace '%s' has already started, should not start again!", str3);
            return;
        }
        this.f24723j.getClass();
        this.f24724k = new h();
        registerForAppState();
        jd.a aVarPerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f24714a);
        a(aVarPerfSession);
        if (aVarPerfSession.f43818c) {
            this.f24716c.collectGaugeMetricOnce(aVarPerfSession.f43817b);
        }
    }

    @Keep
    public void stop() {
        h hVar = this.f24724k;
        String str = this.f24717d;
        a aVar = f24713m;
        if (hVar == null) {
            aVar.c("Trace '%s' has not been started so unable to stop!", str);
            return;
        }
        if (c()) {
            aVar.c("Trace '%s' has already stopped, should not stop again!", str);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.f24714a);
        unregisterForAppState();
        this.f24723j.getClass();
        h hVar2 = new h();
        this.l = hVar2;
        if (this.f24715b == null) {
            ArrayList arrayList = this.f24721h;
            if (!arrayList.isEmpty()) {
                Trace trace = (Trace) l1.d.d(arrayList, 1);
                if (trace.l == null) {
                    trace.l = hVar2;
                }
            }
            if (str.isEmpty()) {
                if (aVar.f40789b) {
                    aVar.f40788a.getClass();
                    Log.e("FirebasePerformance", "Trace name is empty, no log is sent to server");
                    return;
                }
                return;
            }
            this.f24722i.c(new s4.i(this).j(), getAppState());
            if (SessionManager.getInstance().perfSession().f43818c) {
                this.f24716c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f43817b);
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeParcelable(this.f24715b, 0);
        parcel.writeString(this.f24717d);
        parcel.writeList(this.f24721h);
        parcel.writeMap(this.f24718e);
        parcel.writeParcelable(this.f24724k, 0);
        parcel.writeParcelable(this.l, 0);
        synchronized (this.f24720g) {
            parcel.writeList(this.f24720g);
        }
    }

    public Trace(String str, g gVar, jj.d dVar, c cVar, GaugeManager gaugeManager) {
        super(cVar);
        this.f24714a = new WeakReference(this);
        this.f24715b = null;
        this.f24717d = str.trim();
        this.f24721h = new ArrayList();
        this.f24718e = new ConcurrentHashMap();
        this.f24719f = new ConcurrentHashMap();
        this.f24723j = dVar;
        this.f24722i = gVar;
        this.f24720g = Collections.synchronizedList(new ArrayList());
        this.f24716c = gaugeManager;
    }

    public Trace(Parcel parcel, boolean z10) {
        super(z10 ? null : c.a());
        this.f24714a = new WeakReference(this);
        this.f24715b = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f24717d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f24721h = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f24718e = concurrentHashMap;
        this.f24719f = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, gd.c.class.getClassLoader());
        this.f24724k = (h) parcel.readParcelable(h.class.getClassLoader());
        this.l = (h) parcel.readParcelable(h.class.getClassLoader());
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.f24720g = listSynchronizedList;
        parcel.readList(listSynchronizedList, jd.a.class.getClassLoader());
        if (z10) {
            this.f24722i = null;
            this.f24723j = null;
            this.f24716c = null;
        } else {
            this.f24722i = g.f45301s;
            this.f24723j = new jj.d(23);
            this.f24716c = GaugeManager.getInstance();
        }
    }
}
