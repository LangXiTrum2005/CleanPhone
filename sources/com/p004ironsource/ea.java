package com.p004ironsource;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u001e\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\tH&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/ea;", "", "", "key", "value", "", "a", "defValue", "getString", "", "allData", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface ea {
    static /* synthetic */ String a(ea eaVar, String str, String str2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return eaVar.getString(str, str2);
    }

    void a(String key);

    void a(String key, String value);

    Map<String, ?> allData();

    String getString(String key, String defValue);
}
