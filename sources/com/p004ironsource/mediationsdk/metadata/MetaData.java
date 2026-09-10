package com.p004ironsource.mediationsdk.metadata;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class MetaData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f25954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f25955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<MetaDataValueTypes> f25956c;

    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(String str, List<String> list) {
        this.f25954a = str;
        this.f25955b = list;
        this.f25956c = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f25956c.add(MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }

    public String getMetaDataKey() {
        return this.f25954a;
    }

    public List<String> getMetaDataValue() {
        return this.f25955b;
    }

    public List<MetaDataValueTypes> getMetaDataValueType() {
        return this.f25956c;
    }

    public MetaData(String str, List<String> list, List<MetaDataValueTypes> list2) {
        this.f25954a = str;
        this.f25955b = list;
        this.f25956c = list2;
    }
}
