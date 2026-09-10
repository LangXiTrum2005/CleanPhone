package com.p004ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.p004ironsource.adqualitysdk.sdk.i.kd;
import com.p004ironsource.adqualitysdk.sdk.i.n;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class ISAdQualitySegment {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private final long f51;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private final Map<String, String> f52;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private double f53;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final AtomicBoolean f54;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final String f55;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final int f56;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final String f57;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final int f58;

    public static class Builder {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private String f64;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f67;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private double f65 = 999999.99d;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private int f66 = -1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private int f63 = -1;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private AtomicBoolean f61 = null;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private long f59 = 0;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private double f60 = -1.0d;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private Map<String, String> f62 = new HashMap();

        public ISAdQualitySegment build() {
            return new ISAdQualitySegment(this.f67, this.f66, this.f64, this.f63, this.f61, this.f60, this.f59, new HashMap(this.f62), (byte) 0);
        }

        public Builder setAge(int i2) {
            if (i2 == 0) {
                return this;
            }
            if (i2 > 0 && i2 <= 199) {
                this.f66 = i2;
                return this;
            }
            StringBuilder sb = new StringBuilder("setAge( ");
            sb.append(i2);
            sb.append(" ) age must be between 1-199");
            n.m2828("ISAdQualitySegment Builder", sb.toString());
            return this;
        }

        public Builder setCustomData(String str, String str2) {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    if (this.f62.size() >= 5) {
                        StringBuilder sb = new StringBuilder("setCustomData( ");
                        sb.append(str);
                        sb.append(" , ");
                        sb.append(str2);
                        sb.append(" ) limited to 5 custom values. Ignoring custom value.");
                        n.m2828("ISAdQualitySegment Builder", sb.toString());
                        return this;
                    }
                    if (kd.m2786(str) && kd.m2786(str2) && kd.m2777(str, 32) && kd.m2777(str2, 32)) {
                        this.f62.put("sgct_".concat(String.valueOf(str)), str2);
                        return this;
                    }
                    StringBuilder sb2 = new StringBuilder("setCustomData( ");
                    sb2.append(str);
                    sb2.append(" , ");
                    sb2.append(str2);
                    sb2.append(" ) key and value must be alphanumeric and 1-32 in length");
                    n.m2828("ISAdQualitySegment Builder", sb2.toString());
                    return this;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return this;
        }

        public Builder setGender(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            Locale locale = Locale.ENGLISH;
            if (str.toLowerCase(locale).equals("male") || str.toLowerCase(locale).equals("female")) {
                this.f64 = str.toLowerCase(locale);
                return this;
            }
            StringBuilder sb = new StringBuilder("setGender( ");
            sb.append(str);
            sb.append(" ) is invalid");
            n.m2828("ISAdQualitySegment Builder", sb.toString());
            return this;
        }

        public Builder setInAppPurchasesTotal(double d) {
            if (d >= 0.0d && d < this.f65) {
                this.f60 = Math.floor(d * 100.0d) / 100.0d;
                return this;
            }
            StringBuilder sb = new StringBuilder("setIAPTotal( ");
            sb.append(d);
            sb.append(" ) iapt must be between 0-");
            sb.append(this.f65);
            n.m2828("ISAdQualitySegment Builder", sb.toString());
            return this;
        }

        public Builder setIsPaying(boolean z2) {
            if (this.f61 == null) {
                this.f61 = new AtomicBoolean();
            }
            this.f61.set(z2);
            return this;
        }

        public Builder setLevel(int i2) {
            if (i2 == 0) {
                return this;
            }
            if (i2 > 0 && i2 < 999999) {
                this.f63 = i2;
                return this;
            }
            StringBuilder sb = new StringBuilder("setLevel( ");
            sb.append(i2);
            sb.append(" ) level must be between 1-999999");
            n.m2828("ISAdQualitySegment Builder", sb.toString());
            return this;
        }

        public Builder setSegmentName(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (kd.m2786(str) && kd.m2777(str, 32)) {
                this.f67 = str;
                return this;
            }
            StringBuilder sb = new StringBuilder("setSegmentName( ");
            sb.append(str);
            sb.append(" ) segment name must be alphanumeric and 1-32 in length");
            n.m2828("ISAdQualitySegment Builder", sb.toString());
            return this;
        }

        public Builder setUserCreationDate(long j) {
            if (j == 0) {
                return this;
            }
            if (j > 0) {
                this.f59 = j;
                return this;
            }
            StringBuilder sb = new StringBuilder("setUserCreationDate( ");
            sb.append(j);
            sb.append(" ) is an invalid timestamp");
            n.m2828("ISAdQualitySegment Builder", sb.toString());
            return this;
        }
    }

    public /* synthetic */ ISAdQualitySegment(String str, int i2, String str2, int i3, AtomicBoolean atomicBoolean, double d, long j, Map map, byte b2) {
        this(str, i2, str2, i3, atomicBoolean, d, j, map);
    }

    public int getAge() {
        return this.f56;
    }

    public Map<String, String> getCustomData() {
        return this.f52;
    }

    public String getGender() {
        return this.f55;
    }

    public double getInAppPurchasesTotal() {
        return this.f53;
    }

    public AtomicBoolean getIsPaying() {
        return this.f54;
    }

    public int getLevel() {
        return this.f58;
    }

    public String getName() {
        return this.f57;
    }

    public long getUserCreationDate() {
        return this.f51;
    }

    private ISAdQualitySegment(String str, int i2, String str2, int i3, AtomicBoolean atomicBoolean, double d, long j, Map<String, String> map) {
        this.f57 = str;
        this.f56 = i2;
        this.f55 = str2;
        this.f58 = i3;
        this.f54 = atomicBoolean;
        this.f53 = d;
        this.f51 = j;
        this.f52 = map;
    }
}
