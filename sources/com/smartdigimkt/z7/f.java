package com.smartdigimkt.z7;

import com.inmobi.commons.core.configs.CrashConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class f {
    private static final long k = 30000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f40387l = 30000;
    private static final long m = 30000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final TimeUnit f40388n = TimeUnit.MILLISECONDS;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f40389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TimeUnit f40390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f40391c;
    public TimeUnit d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f40392e;
    public TimeUnit f;
    public ExecutorService g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<e> f40393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f40394i;
    public int j;

    public static class b {
        private ExecutorService g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private d f40400i;
        private int j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f40395a = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private TimeUnit f40396b = f.f40388n;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f40397c = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        private TimeUnit d = f.f40388n;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f40398e = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        private TimeUnit f = f.f40388n;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final List<e> f40399h = new ArrayList();

        public b a(ExecutorService executorService) {
            this.g = executorService;
            return this;
        }

        public b b(long j, TimeUnit timeUnit) {
            this.f40395a = j;
            this.f40396b = timeUnit;
            return this;
        }

        public b c(long j, TimeUnit timeUnit) {
            this.f40397c = j;
            this.d = timeUnit;
            return this;
        }

        public b a(long j, TimeUnit timeUnit) {
            this.f40398e = j;
            this.f = timeUnit;
            return this;
        }

        public b a(d dVar) {
            this.f40400i = dVar;
            return this;
        }

        public b a(int i2) {
            this.j = i2;
            return this;
        }

        public f a() {
            f fVar = new f();
            fVar.f40392e = this.f40398e;
            fVar.f = this.f;
            fVar.f40391c = this.f40397c;
            fVar.d = this.d;
            fVar.f40389a = this.f40395a;
            fVar.f40390b = this.f40396b;
            fVar.g = this.g;
            fVar.f40394i = this.f40400i;
            fVar.j = this.j;
            if (!this.f40399h.isEmpty()) {
                fVar.f40393h.addAll(new ArrayList(this.f40399h));
            }
            return fVar;
        }
    }

    private f() {
        this.f40393h = new ArrayList();
    }
}
