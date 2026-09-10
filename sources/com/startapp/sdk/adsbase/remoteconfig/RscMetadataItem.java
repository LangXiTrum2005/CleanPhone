package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class RscMetadataItem implements Serializable {
    private static final long serialVersionUID = 1691586261519008915L;
    private String config;
    private Integer ief;
    private Integer limit;
    private int noCache;
    private Integer output;
    private Integer ppid;
    private int[] sortBy;
    private int triggers;
    private Integer ttl;

    public final String a() {
        return this.config;
    }

    public final Integer b() {
        return this.ief;
    }

    public final Integer c() {
        return this.limit;
    }

    public final int d() {
        return this.noCache;
    }

    public final Integer e() {
        return this.output;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RscMetadataItem rscMetadataItem = (RscMetadataItem) obj;
            if (this.triggers == rscMetadataItem.triggers && this.noCache == rscMetadataItem.noCache && vi.a((Object) this.config, (Object) rscMetadataItem.config) && vi.a((Object) this.ttl, (Object) rscMetadataItem.ttl) && Arrays.equals(this.sortBy, rscMetadataItem.sortBy) && vi.a((Object) this.limit, (Object) rscMetadataItem.limit) && vi.a((Object) this.ppid, (Object) rscMetadataItem.ppid) && vi.a((Object) this.output, (Object) rscMetadataItem.output) && vi.a((Object) this.ief, (Object) rscMetadataItem.ief)) {
                return true;
            }
        }
        return false;
    }

    public final Integer f() {
        return this.ppid;
    }

    public final int[] g() {
        return this.sortBy;
    }

    public final int h() {
        return this.triggers;
    }

    public final int hashCode() {
        Object[] objArr = {this.config, Integer.valueOf(this.triggers), Integer.valueOf(this.noCache), this.ttl, this.sortBy, this.limit, this.ppid, this.output, this.ief};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public final Integer i() {
        return this.ttl;
    }
}
