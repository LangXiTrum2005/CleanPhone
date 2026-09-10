package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.kn;
import com.ironsource.adqualitysdk.sdk.i.m;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ISAdQualitySegment {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private final Map<String, String> f41;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private final long f42;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private double f43;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final int f44;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final AtomicBoolean f45;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final String f46;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final int f47;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final String f48;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Deprecated
    public static class Builder {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f53;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f57;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private double f54 = 999999.99d;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private int f56 = -1;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private int f55 = -1;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private AtomicBoolean f49 = null;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private long f51 = 0;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private double f52 = -1.0d;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private Map<String, String> f50 = new HashMap();

        @Deprecated
        public Builder() {
        }

        @Deprecated
        public ISAdQualitySegment build() {
            return new ISAdQualitySegment(this.f57, this.f56, this.f53, this.f55, this.f49, this.f52, this.f51, new HashMap(this.f50), (byte) 0);
        }

        @Deprecated
        public Builder setAge(int i10) {
            if (i10 == 0) {
                return this;
            }
            if (i10 > 0 && i10 <= 199) {
                this.f56 = i10;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setAge( ");
            sb2.append(i10);
            sb2.append(" ) age must be between 1-199");
            m.m2968("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        @Deprecated
        public Builder setCustomData(String str, String str2) {
            if (TextUtils.isEmpty(str2)) {
                return this;
            }
            try {
                if (this.f50.size() >= 5) {
                    StringBuilder sb2 = new StringBuilder("setCustomData( ");
                    sb2.append(str);
                    sb2.append(" , ");
                    sb2.append(str2);
                    sb2.append(" ) limited to 5 custom values. Ignoring custom value.");
                    m.m2968("ISAdQualitySegment Builder", sb2.toString());
                    return this;
                }
                if (kn.m2924(str) && kn.m2924(str2) && kn.m2919(str, 32) && kn.m2919(str2, 32)) {
                    this.f50.put("sgct_".concat(String.valueOf(str)), str2);
                    return this;
                }
                StringBuilder sb3 = new StringBuilder("setCustomData( ");
                sb3.append(str);
                sb3.append(" , ");
                sb3.append(str2);
                sb3.append(" ) key and value must be alphanumeric and 1-32 in length");
                m.m2968("ISAdQualitySegment Builder", sb3.toString());
                return this;
            } catch (Exception e10) {
                e10.printStackTrace();
                return this;
            }
        }

        @Deprecated
        public Builder setGender(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            Locale locale = Locale.ENGLISH;
            if (str.toLowerCase(locale).equals(IronSourceConstants.a.f29729b) || str.toLowerCase(locale).equals(IronSourceConstants.a.f29730c)) {
                this.f53 = str.toLowerCase(locale);
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setGender( ");
            sb2.append(str);
            sb2.append(" ) is invalid");
            m.m2968("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        @Deprecated
        public Builder setInAppPurchasesTotal(double d10) {
            if (d10 >= 0.0d && d10 < this.f54) {
                this.f52 = Math.floor(d10 * 100.0d) / 100.0d;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setIAPTotal( ");
            sb2.append(d10);
            sb2.append(" ) iapt must be between 0-");
            sb2.append(this.f54);
            m.m2968("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        @Deprecated
        public Builder setIsPaying(boolean z10) {
            if (this.f49 == null) {
                this.f49 = new AtomicBoolean();
            }
            this.f49.set(z10);
            return this;
        }

        @Deprecated
        public Builder setLevel(int i10) {
            if (i10 == 0) {
                return this;
            }
            if (i10 > 0 && i10 < 999999) {
                this.f55 = i10;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setLevel( ");
            sb2.append(i10);
            sb2.append(" ) level must be between 1-999999");
            m.m2968("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        @Deprecated
        public Builder setSegmentName(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (kn.m2924(str) && kn.m2919(str, 32)) {
                this.f57 = str;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setSegmentName( ");
            sb2.append(str);
            sb2.append(" ) segment name must be alphanumeric and 1-32 in length");
            m.m2968("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        @Deprecated
        public Builder setUserCreationDate(long j10) {
            if (j10 == 0) {
                return this;
            }
            if (j10 > 0) {
                this.f51 = j10;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setUserCreationDate( ");
            sb2.append(j10);
            sb2.append(" ) is an invalid timestamp");
            m.m2968("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }
    }

    public /* synthetic */ ISAdQualitySegment(String str, int i10, String str2, int i11, AtomicBoolean atomicBoolean, double d10, long j10, Map map, byte b10) {
        this(str, i10, str2, i11, atomicBoolean, d10, j10, map);
    }

    @Deprecated
    public int getAge() {
        return this.f47;
    }

    @Deprecated
    public Map<String, String> getCustomData() {
        return this.f41;
    }

    @Deprecated
    public String getGender() {
        return this.f46;
    }

    @Deprecated
    public double getInAppPurchasesTotal() {
        return this.f43;
    }

    @Deprecated
    public AtomicBoolean getIsPaying() {
        return this.f45;
    }

    @Deprecated
    public int getLevel() {
        return this.f44;
    }

    @Deprecated
    public String getName() {
        return this.f48;
    }

    @Deprecated
    public long getUserCreationDate() {
        return this.f42;
    }

    private ISAdQualitySegment(String str, int i10, String str2, int i11, AtomicBoolean atomicBoolean, double d10, long j10, Map<String, String> map) {
        this.f48 = str;
        this.f47 = i10;
        this.f46 = str2;
        this.f44 = i11;
        this.f45 = atomicBoolean;
        this.f43 = d10;
        this.f42 = j10;
        this.f41 = map;
    }
}
