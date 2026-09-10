package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.pi;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class AnalyticsCategoryConfig implements Serializable {
    private static final long serialVersionUID = 5410570404581113345L;
    private Double enabled;

    @TypeInfo(parser = FiltersParser.class, type = ArrayList.class, value = AnalyticsCategoryFilterConfig.class)
    private List<AnalyticsCategoryFilterConfig> filters;
    private String firstDelay;
    private Integer flags;
    private Integer priority;
    private Boolean sendViaDb;
    private String ttl;

    public static class FiltersParser extends pi<AnalyticsCategoryFilterConfig> {
        public FiltersParser() {
            super(AnalyticsCategoryFilterConfig.class);
        }
    }

    public final Double a() {
        return this.enabled;
    }

    public final List b() {
        return this.filters;
    }

    public final String c() {
        return this.firstDelay;
    }

    public final Integer d() {
        return this.flags;
    }

    public final Integer e() {
        return this.priority;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnalyticsCategoryConfig analyticsCategoryConfig = (AnalyticsCategoryConfig) obj;
            if (vi.a((Object) this.enabled, (Object) analyticsCategoryConfig.enabled) && vi.a((Object) this.flags, (Object) analyticsCategoryConfig.flags) && vi.a((Object) this.priority, (Object) analyticsCategoryConfig.priority) && vi.a((Object) this.sendViaDb, (Object) analyticsCategoryConfig.sendViaDb) && vi.a((Object) this.ttl, (Object) analyticsCategoryConfig.ttl) && vi.a((Object) this.firstDelay, (Object) analyticsCategoryConfig.firstDelay) && vi.a(this.filters, analyticsCategoryConfig.filters)) {
                return true;
            }
        }
        return false;
    }

    public final Boolean f() {
        return this.sendViaDb;
    }

    public final String g() {
        return this.ttl;
    }

    public final int hashCode() {
        Object[] objArr = {this.enabled, this.flags, this.priority, this.sendViaDb, this.ttl, this.firstDelay, this.filters};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }
}
