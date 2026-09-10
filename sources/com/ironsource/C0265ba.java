package com.ironsource;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ba, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0265ba {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f28278m = "age";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f28279n = "gen";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f28280o = "lvl";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f28281p = "pay";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f28282q = "iapt";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f28283r = "ucd";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f28284s = "segName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28285a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f28291g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28286b = 999999;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f28287c = 999999.99d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f28288d = "custom";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f28289e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28290f = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28292h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AtomicBoolean f28293i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f28294j = -1.0d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f28295k = 0;
    private ArrayList<Pair<String, String>> l = new ArrayList<>();

    @Deprecated
    public int a() {
        return this.f28290f;
    }

    @Deprecated
    public String b() {
        return this.f28291g;
    }

    public double c() {
        return this.f28294j;
    }

    public AtomicBoolean d() {
        return this.f28293i;
    }

    public int e() {
        return this.f28292h;
    }

    public ArrayList<Pair<String, String>> f() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        if (this.f28290f != -1) {
            arrayList.add(new Pair<>(f28278m, l1.d.i(new StringBuilder(), this.f28290f, "")));
        }
        if (!TextUtils.isEmpty(this.f28291g)) {
            arrayList.add(new Pair<>(f28279n, this.f28291g));
        }
        if (this.f28292h != -1) {
            arrayList.add(new Pair<>("lvl", l1.d.i(new StringBuilder(), this.f28292h, "")));
        }
        if (this.f28293i != null) {
            arrayList.add(new Pair<>("pay", this.f28293i + ""));
        }
        if (this.f28294j != -1.0d) {
            arrayList.add(new Pair<>("iapt", this.f28294j + ""));
        }
        if (this.f28295k != 0) {
            arrayList.add(new Pair<>("ucd", defpackage.e.r(new StringBuilder(), this.f28295k, "")));
        }
        if (!TextUtils.isEmpty(this.f28285a)) {
            arrayList.add(new Pair<>("segName", this.f28285a));
        }
        arrayList.addAll(this.l);
        return arrayList;
    }

    public String g() {
        return this.f28285a;
    }

    public long h() {
        return this.f28295k;
    }

    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        for (Pair<String, String> pair : f()) {
            try {
                jSONObject.put((String) pair.first, pair.second);
            } catch (JSONException e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error("exception " + e10.getMessage());
            }
        }
        return jSONObject;
    }

    private boolean b(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    public void a(int i10) {
        if (i10 > 0 && i10 < this.f28286b) {
            this.f28292h = i10;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        StringBuilder sbU = defpackage.e.u(i10, "setLevel( ", " ) level must be between 1-");
        sbU.append(this.f28286b);
        logger.log(ironSourceTag, sbU.toString(), 2);
    }

    public void a(boolean z10) {
        if (this.f28293i == null) {
            this.f28293i = new AtomicBoolean();
        }
        this.f28293i.set(z10);
    }

    public void a(double d10) {
        if (d10 > 0.0d && d10 < this.f28287c) {
            this.f28294j = Math.floor(d10 * 100.0d) / 100.0d;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setIAPTotal( " + d10 + " ) iapt must be between 0-" + this.f28287c, 2);
    }

    public void a(long j10) {
        if (j10 > 0) {
            this.f28295k = j10;
        } else {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, defpackage.e.j(j10, "setUserCreationDate( ", " ) is an invalid timestamp"), 2);
        }
    }

    public void a(String str) {
        if (b(str) && a(str, 1, 32)) {
            this.f28285a = str;
        } else {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, defpackage.e.o("setSegmentName( ", str, " ) segment name must be alphanumeric and 1-32 in length"), 2);
        }
    }

    public void a(String str, String str2) {
        try {
            if (b(str) && b(str2) && a(str, 1, 32) && a(str2, 1, 32)) {
                String str3 = "custom_" + str;
                if (this.l.size() >= 5) {
                    this.l.remove(0);
                }
                this.l.add(new Pair<>(str3, str2));
                return;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private boolean a(String str, int i10, int i11) {
        return str != null && str.length() >= i10 && str.length() <= i11;
    }
}
