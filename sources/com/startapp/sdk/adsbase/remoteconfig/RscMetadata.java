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
public class RscMetadata implements Serializable {
    private static final long serialVersionUID = -5424519918396264553L;
    private boolean enabled;
    private int ief;

    @TypeInfo(parser = ItemsParser.class, type = ArrayList.class, value = RscMetadataItem.class)
    private List<RscMetadataItem> items;
    private String triggers;

    public static class ItemsParser extends pi<RscMetadataItem> {
        public ItemsParser() {
            super(RscMetadataItem.class);
        }
    }

    public final int a() {
        return this.ief;
    }

    public final List b() {
        return this.items;
    }

    public final String c() {
        return this.triggers;
    }

    public final boolean d() {
        return this.enabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RscMetadata rscMetadata = (RscMetadata) obj;
            if (this.enabled == rscMetadata.enabled && this.ief == rscMetadata.ief && vi.a((Object) this.triggers, (Object) rscMetadata.triggers) && vi.a(this.items, rscMetadata.items)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), this.triggers, this.items, Integer.valueOf(this.ief)};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public final int a(RscMetadataItem rscMetadataItem) {
        return rscMetadataItem.b() != null ? rscMetadataItem.b().intValue() : this.ief;
    }
}
