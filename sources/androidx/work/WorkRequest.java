package androidx.work;

import androidx.work.impl.model.WorkSpec;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class WorkRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f8644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkSpec f8645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f8646c;

    public static abstract class Builder<B extends Builder<?, ?>, W extends WorkRequest> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public UUID f8647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WorkSpec f8648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public HashSet f8649c;

        public final WorkRequest a() {
            WorkRequest workRequestB = b();
            Constraints constraints = this.f8648b.j;
            boolean z2 = constraints.f8610h.f8613a.size() > 0 || constraints.d || constraints.f8607b || constraints.f8608c;
            if (this.f8648b.q && z2) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.f8647a = UUID.randomUUID();
            WorkSpec workSpec = this.f8648b;
            WorkSpec workSpec2 = new WorkSpec();
            workSpec2.f8777b = WorkInfo.State.X;
            Data data = Data.f8619c;
            workSpec2.f8779e = data;
            workSpec2.f = data;
            workSpec2.j = Constraints.f8605i;
            workSpec2.f8782l = BackoffPolicy.X;
            workSpec2.m = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
            workSpec2.f8784p = -1L;
            workSpec2.r = OutOfQuotaPolicy.X;
            workSpec2.f8776a = workSpec.f8776a;
            workSpec2.f8778c = workSpec.f8778c;
            workSpec2.f8777b = workSpec.f8777b;
            workSpec2.d = workSpec.d;
            workSpec2.f8779e = new Data(workSpec.f8779e);
            workSpec2.f = new Data(workSpec.f);
            workSpec2.g = workSpec.g;
            workSpec2.f8780h = workSpec.f8780h;
            workSpec2.f8781i = workSpec.f8781i;
            Constraints constraints2 = workSpec.j;
            Constraints constraints3 = new Constraints();
            constraints3.f8606a = NetworkType.X;
            constraints3.f = -1L;
            constraints3.g = -1L;
            constraints3.f8610h = new ContentUriTriggers();
            constraints3.f8607b = constraints2.f8607b;
            constraints3.f8608c = constraints2.f8608c;
            constraints3.f8606a = constraints2.f8606a;
            constraints3.d = constraints2.d;
            constraints3.f8609e = constraints2.f8609e;
            constraints3.f8610h = constraints2.f8610h;
            workSpec2.j = constraints3;
            workSpec2.k = workSpec.k;
            workSpec2.f8782l = workSpec.f8782l;
            workSpec2.m = workSpec.m;
            workSpec2.f8783n = workSpec.f8783n;
            workSpec2.o = workSpec.o;
            workSpec2.f8784p = workSpec.f8784p;
            workSpec2.q = workSpec.q;
            workSpec2.r = workSpec.r;
            this.f8648b = workSpec2;
            workSpec2.f8776a = this.f8647a.toString();
            return workRequestB;
        }

        public abstract WorkRequest b();
    }

    public WorkRequest(UUID uuid, WorkSpec workSpec, HashSet hashSet) {
        this.f8644a = uuid;
        this.f8645b = workSpec;
        this.f8646c = hashSet;
    }
}
