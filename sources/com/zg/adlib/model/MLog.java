package com.zg.adlib.model;

import android.support.v4.media.a;
import com.p004ironsource.x4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/zg/adlib/model/MLog;", "", "kv", "", "Lcom/zg/adlib/model/MKv;", "timestamp", "", "<init>", "(Ljava/util/List;I)V", "getKv", "()Ljava/util/List;", "getTimestamp", "()I", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MLog {
    private final List<MKv> kv;
    private final int timestamp;

    public MLog(List<MKv> kv, int i2) {
        Intrinsics.f(kv, "kv");
        this.kv = kv;
        this.timestamp = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MLog copy$default(MLog mLog, List list, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = mLog.kv;
        }
        if ((i3 & 2) != 0) {
            i2 = mLog.timestamp;
        }
        return mLog.copy(list, i2);
    }

    public final List<MKv> component1() {
        return this.kv;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTimestamp() {
        return this.timestamp;
    }

    public final MLog copy(List<MKv> kv, int timestamp) {
        Intrinsics.f(kv, "kv");
        return new MLog(kv, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MLog)) {
            return false;
        }
        MLog mLog = (MLog) other;
        return Intrinsics.a(this.kv, mLog.kv) && this.timestamp == mLog.timestamp;
    }

    public final List<MKv> getKv() {
        return this.kv;
    }

    public final int getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Integer.hashCode(this.timestamp) + (this.kv.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MLog(kv=");
        sb.append(this.kv);
        sb.append(", timestamp=");
        return a.p(sb, this.timestamp, ')');
    }
}
