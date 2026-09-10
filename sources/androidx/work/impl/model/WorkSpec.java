package androidx.work.impl.model;

import androidx.arch.core.util.Function;
import androidx.datastore.preferences.protobuf.a;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class WorkSpec {
    public static final Function s = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f8776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WorkInfo.State f8777b = WorkInfo.State.X;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f8778c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Data f8779e;
    public Data f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f8781i;
    public Constraints j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public BackoffPolicy f8782l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f8783n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f8784p;
    public boolean q;
    public OutOfQuotaPolicy r;

    /* JADX INFO: renamed from: androidx.work.impl.model.WorkSpec$1, reason: invalid class name */
    public class AnonymousClass1 implements Function<List<WorkInfoPojo>, List<WorkInfo>> {
        @Override // androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            List list = (List) obj;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((WorkInfoPojo) it.next()).a());
            }
            return arrayList;
        }
    }

    public static class IdAndState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f8785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WorkInfo.State f8786b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdAndState)) {
                return false;
            }
            IdAndState idAndState = (IdAndState) obj;
            if (this.f8786b != idAndState.f8786b) {
                return false;
            }
            return this.f8785a.equals(idAndState.f8785a);
        }

        public final int hashCode() {
            return this.f8786b.hashCode() + (this.f8785a.hashCode() * 31);
        }
    }

    public static class WorkInfoPojo {
        public final WorkInfo a() {
            Data data = Data.f8619c;
            UUID uuidFromString = UUID.fromString(null);
            WorkInfo workInfo = new WorkInfo();
            workInfo.f8638a = uuidFromString;
            workInfo.f8639b = null;
            workInfo.f8640c = null;
            workInfo.d = new HashSet((Collection) null);
            workInfo.f8641e = data;
            workInfo.f = 0;
            return workInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkInfoPojo)) {
                return false;
            }
            ((WorkInfoPojo) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return (0 * 31) + 0;
        }
    }

    static {
        Logger.e("WorkSpec");
    }

    public WorkSpec(String str, String str2) {
        Data data = Data.f8619c;
        this.f8779e = data;
        this.f = data;
        this.j = Constraints.f8605i;
        this.f8782l = BackoffPolicy.X;
        this.m = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        this.f8784p = -1L;
        this.r = OutOfQuotaPolicy.X;
        this.f8776a = str;
        this.f8778c = str2;
    }

    public final long a() {
        int i2;
        if (this.f8777b == WorkInfo.State.X && (i2 = this.k) > 0) {
            return Math.min(18000000L, this.f8782l == BackoffPolicy.f8598Y ? this.m * ((long) i2) : (long) Math.scalb(this.m, i2 - 1)) + this.f8783n;
        }
        if (!c()) {
            long jCurrentTimeMillis = this.f8783n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j = this.f8783n;
        if (j == 0) {
            j = this.g + jCurrentTimeMillis2;
        }
        long j2 = this.f8781i;
        long j3 = this.f8780h;
        if (j2 != j3) {
            return j + j3 + (j == 0 ? j2 * (-1) : 0L);
        }
        return j + (j != 0 ? j3 : 0L);
    }

    public final boolean b() {
        return !Constraints.f8605i.equals(this.j);
    }

    public final boolean c() {
        return this.f8780h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && WorkSpec.class == obj.getClass()) {
            WorkSpec workSpec = (WorkSpec) obj;
            if (this.g != workSpec.g || this.f8780h != workSpec.f8780h || this.f8781i != workSpec.f8781i || this.k != workSpec.k || this.m != workSpec.m || this.f8783n != workSpec.f8783n || this.o != workSpec.o || this.f8784p != workSpec.f8784p || this.q != workSpec.q || !this.f8776a.equals(workSpec.f8776a) || this.f8777b != workSpec.f8777b || !this.f8778c.equals(workSpec.f8778c)) {
                return false;
            }
            String str = this.d;
            if (str == null ? workSpec.d != null : !str.equals(workSpec.d)) {
                return false;
            }
            if (this.f8779e.equals(workSpec.f8779e) && this.f.equals(workSpec.f) && this.j.equals(workSpec.j) && this.f8782l == workSpec.f8782l && this.r == workSpec.r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iB = a.b(this.f8778c, (this.f8777b.hashCode() + (this.f8776a.hashCode() * 31)) * 31, 31);
        String str = this.d;
        int iHashCode = (this.f.hashCode() + ((this.f8779e.hashCode() + ((iB + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j = this.g;
        int i2 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f8780h;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f8781i;
        int iHashCode2 = (this.f8782l.hashCode() + ((((this.j.hashCode() + ((i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.k) * 31)) * 31;
        long j4 = this.m;
        int i4 = (iHashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f8783n;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.o;
        int i6 = (i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f8784p;
        return this.r.hashCode() + ((((i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return android.support.v4.media.a.r(new StringBuilder("{WorkSpec: "), this.f8776a, "}");
    }
}
