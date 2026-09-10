package com.zg.adlib.model;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/zg/adlib/model/TestResult;", "", "data", "", "<init>", "(Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "component1", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TestResult {
    private final String data;

    public TestResult(String data) {
        Intrinsics.f(data, "data");
        this.data = data;
    }

    public static /* synthetic */ TestResult copy$default(TestResult testResult, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = testResult.data;
        }
        return testResult.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getData() {
        return this.data;
    }

    public final TestResult copy(String data) {
        Intrinsics.f(data, "data");
        return new TestResult(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TestResult) && Intrinsics.a(this.data, ((TestResult) other).data);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return a.p(new StringBuilder("TestResult(data="), this.data, ')');
    }
}
