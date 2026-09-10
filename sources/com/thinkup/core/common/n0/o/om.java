package com.thinkup.core.common.n0.o;

import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class om {
    private static final long mn = 30000;
    private static final long n0 = 30000;
    private static final TimeUnit nm = TimeUnit.MILLISECONDS;
    private static final long no = 30000;
    public TimeUnit m;
    public final List<oo> m0;
    public int mm;
    public o0 mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f41963n;
    public long o;
    public TimeUnit o0;
    public TimeUnit om;
    public ExecutorService on;
    public long oo;

    public static class o {
        private ExecutorService m0;
        private int mm;
        private o0 mo;
        private long m = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private TimeUnit f41964n = om.nm;
        private long o0 = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        private TimeUnit oo = om.nm;
        private long om = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        private TimeUnit on = om.nm;
        final List<oo> o = new ArrayList();

        public final o m(TimeUnit timeUnit) {
            this.o0 = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
            this.oo = timeUnit;
            return this;
        }

        public final o n(TimeUnit timeUnit) {
            this.om = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
            this.on = timeUnit;
            return this;
        }

        public final o o(ExecutorService executorService) {
            this.m0 = executorService;
            return this;
        }

        public final o o(TimeUnit timeUnit) {
            this.m = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
            this.f41964n = timeUnit;
            return this;
        }

        public final o o(o0 o0Var) {
            this.mo = o0Var;
            return this;
        }

        public final o o(int i2) {
            this.mm = i2;
            return this;
        }

        public final om o() {
            om omVar = new om((byte) 0);
            omVar.oo = this.om;
            omVar.om = this.on;
            omVar.f41963n = this.o0;
            omVar.o0 = this.oo;
            omVar.o = this.m;
            omVar.m = this.f41964n;
            omVar.on = this.m0;
            omVar.mo = this.mo;
            omVar.mm = this.mm;
            if (!this.o.isEmpty()) {
                omVar.m0.addAll(new ArrayList(this.o));
            }
            return omVar;
        }
    }

    public /* synthetic */ om(byte b2) {
        this();
    }

    private om() {
        this.m0 = new ArrayList();
    }
}
