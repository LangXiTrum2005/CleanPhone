package com.p004ironsource.mediationsdk;

import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.Pair;
import com.p004ironsource.environment.StringUtils;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceLogger;
import com.p004ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.p004ironsource.q9;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class IronSourceSegment {
    public static final String AGE = "age";
    public static final String GENDER = "gen";
    public static final String IAPT = "iapt";
    public static final String LEVEL = "lvl";
    public static final String PAYING = "pay";
    public static final String USER_CREATION_DATE = "ucd";
    private static final String m = "segName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f25720a;
    private String g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25721b = 999999;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f25722c = 999999.99d;
    private final String d = "custom";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f25723e = 5;
    private int f = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25724h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AtomicBoolean f25725i = null;
    private double j = -1.0d;
    private long k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ArrayList<Pair<String, String>> f25726l = new ArrayList<>();

    private boolean a(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    @Deprecated
    public int getAge() {
        return this.f;
    }

    @Deprecated
    public String getGender() {
        return this.g;
    }

    public double getIapt() {
        return this.j;
    }

    public AtomicBoolean getIsPaying() {
        return this.f25725i;
    }

    public int getLevel() {
        return this.f25724h;
    }

    public ArrayList<Pair<String, String>> getSegmentData() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        if (this.f != -1) {
            arrayList.add(new Pair<>("age", a.i(this.f, "", new StringBuilder())));
        }
        if (!TextUtils.isEmpty(this.g)) {
            arrayList.add(new Pair<>(GENDER, this.g));
        }
        if (this.f25724h != -1) {
            arrayList.add(new Pair<>("lvl", a.i(this.f25724h, "", new StringBuilder())));
        }
        if (this.f25725i != null) {
            arrayList.add(new Pair<>("pay", this.f25725i + ""));
        }
        if (this.j != -1.0d) {
            arrayList.add(new Pair<>("iapt", this.j + ""));
        }
        if (this.k != 0) {
            arrayList.add(new Pair<>("ucd", a.j(this.k, "", new StringBuilder())));
        }
        if (!TextUtils.isEmpty(this.f25720a)) {
            arrayList.add(new Pair<>("segName", this.f25720a));
        }
        arrayList.addAll(this.f25726l);
        return arrayList;
    }

    public String getSegmentName() {
        return this.f25720a;
    }

    public long getUcd() {
        return this.k;
    }

    @Deprecated
    public void setAge(int i2) {
        if (i2 <= 0 || i2 > 199) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, androidx.datastore.preferences.protobuf.a.k("setAge( ", i2, " ) age must be between 1-199"), 2);
        } else {
            this.f = i2;
        }
    }

    public void setCustom(String str, String str2) {
        try {
            if (a(str) && a(str2) && a(str, 1, 32) && a(str2, 1, 32)) {
                String str3 = "custom_" + str;
                if (this.f25726l.size() >= 5) {
                    this.f25726l.remove(0);
                }
                this.f25726l.add(new Pair<>(str3, str2));
                return;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Deprecated
    public void setGender(String str) {
        if (TextUtils.isEmpty(str) || !(StringUtils.toLowerCase(str).equals("male") || StringUtils.toLowerCase(str).equals("female"))) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, a.n("setGender( ", str, " ) is invalid"), 2);
        } else {
            this.g = str;
        }
    }

    public void setIAPTotal(double d) {
        if (d > 0.0d && d < this.f25722c) {
            this.j = Math.floor(d * 100.0d) / 100.0d;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setIAPTotal( " + d + " ) iapt must be between 0-" + this.f25722c, 2);
    }

    public void setIsPaying(boolean z2) {
        if (this.f25725i == null) {
            this.f25725i = new AtomicBoolean();
        }
        this.f25725i.set(z2);
    }

    public void setLevel(int i2) {
        if (i2 > 0 && i2 < this.f25721b) {
            this.f25724h = i2;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        StringBuilder sbU = a.u(i2, "setLevel( ", " ) level must be between 1-");
        sbU.append(this.f25721b);
        logger.log(ironSourceTag, sbU.toString(), 2);
    }

    public void setSegmentName(String str) {
        if (a(str) && a(str, 1, 32)) {
            this.f25720a = str;
        } else {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, a.n("setSegmentName( ", str, " ) segment name must be alphanumeric and 1-32 in length"), 2);
        }
    }

    public void setUserCreationDate(long j) {
        if (j > 0) {
            this.k = j;
        } else {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, androidx.media3.extractor.text.ttml.a.j(j, "setUserCreationDate( ", " ) is an invalid timestamp"), 2);
        }
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        for (Pair<String, String> pair : getSegmentData()) {
            try {
                jSONObject.put((String) pair.first, pair.second);
            } catch (JSONException e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error("exception " + e2.getMessage());
            }
        }
        return jSONObject;
    }

    private boolean a(String str, int i2, int i3) {
        return str != null && str.length() >= i2 && str.length() <= i3;
    }
}
