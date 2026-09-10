package com.charging.screenshow.battery.animations.themes.network.base.model;

import androidx.media3.extractor.text.ttml.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/base/model/TestResult;", "", "", "data", "Ljava/lang/String;", "getData", "()Ljava/lang/String;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TestResult {
    private final String data;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TestResult) && Intrinsics.a(this.data, ((TestResult) obj).data);
    }

    public final int hashCode() {
        return this.data.hashCode();
    }

    public final String toString() {
        return a.p(new StringBuilder("TestResult(data="), this.data, ')');
    }
}
