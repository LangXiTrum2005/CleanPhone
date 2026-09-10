package com.unity3d.mediation.segment;

import android.text.TextUtils;
import com.ironsource.C0474n4;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import org.json.JSONObject;
import wj.f;
import xj.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class LevelPlaySegment {
    public static final a Companion = new a(null);
    public static final String IAPT = "iapt";
    public static final String LEVEL = "lvl";
    public static final String PAYING = "pay";
    public static final String SEGMENT_NAME = "segName";
    public static final String USER_CREATION_DATE = "ucd";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f38546h = 999999;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final double f38547i = 999999.99d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f38548j = 5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f38549k = "custom";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f38553d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f38556g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<f> f38550a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f38551b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f38554e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f38555f = -1.0d;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        private a() {
        }
    }

    private final boolean a(String str) {
        if (str == null) {
            return false;
        }
        Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9]*$");
        n.e(patternCompile, "compile(...)");
        return patternCompile.matcher(str).matches();
    }

    public final ArrayList<f> getCustoms$mediationsdk_release() {
        return this.f38550a;
    }

    public final double getIapTotal() {
        return this.f38555f;
    }

    public final int getLevel() {
        return this.f38554e;
    }

    public final ArrayList<f> getSegmentData() {
        IronLog.API.info("");
        ArrayList<f> arrayList = new ArrayList<>();
        int i10 = this.f38554e;
        if (i10 != -1) {
            arrayList.add(new f("lvl", String.valueOf(i10)));
        }
        if (this.f38552c) {
            arrayList.add(new f("pay", String.valueOf(isPaying())));
        }
        double d10 = this.f38555f;
        if (d10 != -1.0d) {
            arrayList.add(new f("iapt", String.valueOf(d10)));
        }
        long j10 = this.f38556g;
        if (j10 != 0) {
            arrayList.add(new f("ucd", String.valueOf(j10)));
        }
        String str = this.f38553d;
        if (str != null && !TextUtils.isEmpty(str)) {
            arrayList.add(new f(SEGMENT_NAME, str));
        }
        ArrayList<f> arrayList2 = this.f38550a;
        ArrayList arrayList3 = new ArrayList(p.W(arrayList2, 10));
        for (f fVar : arrayList2) {
            arrayList3.add(new f("custom_" + fVar.f53283a, fVar.f53284b));
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    public final String getSegmentName() {
        return this.f38553d;
    }

    public final long getUserCreationDate() {
        return this.f38556g;
    }

    public final boolean isPaying() {
        return this.f38551b.get();
    }

    public final void setCustom(String key, String value) {
        n.f(key, "key");
        n.f(value, "value");
        IronLog.API.info("");
        try {
            if (a(key) && a(key, 1, 32) && a(value) && a(value, 1, 32)) {
                if (this.f38550a.size() >= 5) {
                    this.f38550a.remove(0);
                }
                this.f38550a.add(new f(key, value));
                return;
            }
            IronLog.INTERNAL.warning(key + ", " + value + " must be alphanumeric and 1-32 in length");
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public final void setIapTotal(double d10) {
        IronLog.API.info("");
        if (0.0d <= d10 && d10 <= f38547i) {
            double d11 = 100;
            this.f38555f = Math.floor(d10 * d11) / d11;
            return;
        }
        IronLog.INTERNAL.warning(d10 + " must be between 0-999999.99");
    }

    public final void setLevel(int i10) {
        IronLog.API.info("");
        if (1 <= i10 && i10 < 1000000) {
            this.f38554e = i10;
            return;
        }
        IronLog.INTERNAL.warning(i10 + " must be between 1-999999");
    }

    public final void setPaying(boolean z10) {
        IronLog.API.info("");
        this.f38552c = true;
        this.f38551b.set(z10);
    }

    public final void setSegmentName(String str) {
        IronLog.API.info("");
        if (a(str) && a(str, 1, 32)) {
            this.f38553d = str;
            return;
        }
        IronLog.INTERNAL.warning(str + " must be alphanumeric and 1-32 in length");
    }

    public final void setUserCreationDate(long j10) {
        IronLog.API.info("");
        if (j10 > 0) {
            this.f38556g = j10;
            return;
        }
        IronLog.INTERNAL.warning(j10 + " is an invalid timestamp");
    }

    public final JSONObject toJson() {
        IronLog.API.info("");
        JSONObject jSONObject = new JSONObject();
        for (f fVar : getSegmentData()) {
            try {
                jSONObject.put((String) fVar.f53283a, (String) fVar.f53284b);
            } catch (JSONException e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error("exception " + e10.getMessage());
            }
        }
        return jSONObject;
    }

    private final boolean a(String str, int i10, int i11) {
        return str != null && str.length() >= i10 && str.length() <= i11;
    }
}
