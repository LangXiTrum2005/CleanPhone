package com.startapp.sdk.adsbase.remoteconfig;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.p004ironsource.d9;
import com.startapp.json.TypeParser;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TimeoutConfig implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeoutConfig f40715a = new TimeoutConfig(10000, 10000, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    private static final long serialVersionUID = -900203708824534865L;
    private final long connect;
    private final long read;
    private final long total;

    public static class Parser implements TypeParser<TimeoutConfig> {
        private Long parseDuration(Object obj) {
            if (obj instanceof Number) {
                return Long.valueOf(((Number) obj).longValue());
            }
            if (!(obj instanceof String)) {
                return null;
            }
            long jE = vi.e((String) obj);
            if (jE > 0) {
                return Long.valueOf(jE);
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.startapp.json.TypeParser
        public TimeoutConfig parse(Class<TimeoutConfig> cls, Object obj) {
            Long duration = parseDuration(obj);
            if (duration != null) {
                return new TimeoutConfig(duration.longValue());
            }
            if (!(obj instanceof JSONObject)) {
                return null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            Long duration2 = parseDuration(jSONObject.opt("connect"));
            Long duration3 = parseDuration(jSONObject.opt("read"));
            Long duration4 = parseDuration(jSONObject.opt(d9.h.f24727l));
            long jLongValue = duration2 != null ? duration2.longValue() : 0L;
            long jLongValue2 = duration3 != null ? duration3.longValue() : 0L;
            long jLongValue3 = duration4 != null ? duration4.longValue() : 0L;
            long jMin = Math.min(Math.max(1000L, jLongValue), 300000L);
            long jMin2 = Math.min(Math.max(1000L, jLongValue2), 300000L);
            return new TimeoutConfig(jMin, jMin2, Math.max(Math.max(jMin, jMin2), Math.min(Math.max(1000L, jLongValue3), 300000L)));
        }
    }

    public TimeoutConfig(long j) {
        this.connect = j;
        this.read = j;
        this.total = j;
    }

    public final long a() {
        return this.connect;
    }

    public final long b() {
        return this.read;
    }

    public final long c() {
        return this.total;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TimeoutConfig timeoutConfig = (TimeoutConfig) obj;
            if (this.connect == timeoutConfig.connect && this.read == timeoutConfig.read && this.total == timeoutConfig.total) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Long.valueOf(this.connect), Long.valueOf(this.read), Long.valueOf(this.total)};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public TimeoutConfig(long j, long j2, long j3) {
        this.connect = j;
        this.read = j2;
        this.total = j3;
    }
}
