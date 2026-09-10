package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class AnalyticsCategoryFilterConfig implements Serializable {
    private static final long serialVersionUID = -706642555040875333L;

    @TypeInfo(type = ArrayList.class)
    private List<String> excludeAppActivity;

    @TypeInfo(type = ArrayList.class)
    private List<String> excludeValues;

    @TypeInfo(type = ArrayList.class)
    private List<String> fields;

    @TypeInfo(type = ArrayList.class)
    private List<String> includeAppActivity;

    @TypeInfo(type = ArrayList.class)
    private List<String> includeValues;
    private String interval;

    public final List a() {
        return this.excludeAppActivity;
    }

    public final List b() {
        return this.excludeValues;
    }

    public final List c() {
        return this.fields;
    }

    public final List d() {
        return this.includeAppActivity;
    }

    public final List e() {
        return this.includeValues;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnalyticsCategoryFilterConfig analyticsCategoryFilterConfig = (AnalyticsCategoryFilterConfig) obj;
            if (vi.a(this.includeValues, analyticsCategoryFilterConfig.includeValues) && vi.a(this.excludeValues, analyticsCategoryFilterConfig.excludeValues) && vi.a(this.includeAppActivity, analyticsCategoryFilterConfig.includeAppActivity) && vi.a(this.excludeAppActivity, analyticsCategoryFilterConfig.excludeAppActivity) && vi.a(this.fields, analyticsCategoryFilterConfig.fields) && vi.a((Object) this.interval, (Object) analyticsCategoryFilterConfig.interval)) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        return this.interval;
    }

    public final int hashCode() {
        Object[] objArr = {this.includeValues, this.excludeValues, this.includeAppActivity, this.excludeAppActivity, this.fields, this.interval};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }
}
