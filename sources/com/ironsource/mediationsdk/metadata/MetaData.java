package com.ironsource.mediationsdk.metadata;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MetaData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f29601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<MetaDataValueTypes> f29602c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(String str, List<String> list, List<MetaDataValueTypes> list2) {
        this.f29600a = str;
        this.f29601b = list;
        this.f29602c = list2;
    }

    public String getMetaDataKey() {
        return this.f29600a;
    }

    public List<String> getMetaDataValue() {
        return this.f29601b;
    }

    public List<MetaDataValueTypes> getMetaDataValueType() {
        return this.f29602c;
    }

    public MetaData(String str, List<String> list) {
        this.f29600a = str;
        this.f29601b = list;
        this.f29602c = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f29602c.add(MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }
}
