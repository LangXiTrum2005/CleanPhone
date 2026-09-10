package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.p004ironsource.d9;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
class ActivityChooserModel extends DataSetObservable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f3531h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap f3532i = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3533a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3534b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f3535c = new ArrayList();
    public final ActivitySorter d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3536e;
    public boolean f;
    public boolean g;

    public interface ActivityChooserModelClient {
    }

    public static final class ActivityResolveInfo implements Comparable<ActivityResolveInfo> {
        @Override // java.lang.Comparable
        public final int compareTo(ActivityResolveInfo activityResolveInfo) {
            activityResolveInfo.getClass();
            return Float.floatToIntBits(0.0f) - Float.floatToIntBits(0.0f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ActivityResolveInfo.class != obj.getClass()) {
                return false;
            }
            return Float.floatToIntBits(0.0f) == Float.floatToIntBits(0.0f);
        }

        public final int hashCode() {
            return Float.floatToIntBits(0.0f) + 31;
        }

        public final String toString() {
            throw null;
        }
    }

    public interface ActivitySorter {
    }

    public static final class DefaultSorter implements ActivitySorter {
    }

    public static final class HistoricalRecord {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComponentName f3537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f3538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f3539c;

        public HistoricalRecord(ComponentName componentName, long j, float f) {
            this.f3537a = componentName;
            this.f3538b = j;
            this.f3539c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || HistoricalRecord.class != obj.getClass()) {
                return false;
            }
            HistoricalRecord historicalRecord = (HistoricalRecord) obj;
            ComponentName componentName = historicalRecord.f3537a;
            ComponentName componentName2 = this.f3537a;
            if (componentName2 == null) {
                if (componentName != null) {
                    return false;
                }
            } else if (!componentName2.equals(componentName)) {
                return false;
            }
            return this.f3538b == historicalRecord.f3538b && Float.floatToIntBits(this.f3539c) == Float.floatToIntBits(historicalRecord.f3539c);
        }

        public final int hashCode() {
            ComponentName componentName = this.f3537a;
            int iHashCode = componentName == null ? 0 : componentName.hashCode();
            long j = this.f3538b;
            return Float.floatToIntBits(this.f3539c) + ((((iHashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31);
        }

        public final String toString() {
            return "[; activity:" + this.f3537a + "; time:" + this.f3538b + "; weight:" + new BigDecimal(this.f3539c) + d9.i.f24752e;
        }
    }

    public interface OnChooseActivityListener {
    }

    public final class PersistHistoryAsyncTask extends AsyncTask<Object, Void, Void> {
        @Override // android.os.AsyncTask
        public final Void doInBackground(Object[] objArr) {
            throw null;
        }
    }

    public ActivityChooserModel() {
        DefaultSorter defaultSorter = new DefaultSorter();
        new HashMap();
        this.d = defaultSorter;
        this.f3536e = 50;
        this.f = true;
        this.g = true;
        throw null;
    }

    public static ActivityChooserModel b() {
        ActivityChooserModel activityChooserModel;
        synchronized (f3531h) {
            try {
                activityChooserModel = (ActivityChooserModel) f3532i.get(null);
                if (activityChooserModel == null) {
                    new ActivityChooserModel();
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return activityChooserModel;
    }

    public final void a() {
        if (this.f && this.g && !TextUtils.isEmpty(null)) {
            this.f = false;
            throw null;
        }
        ArrayList arrayList = this.f3535c;
        int size = arrayList.size() - this.f3536e;
        if (size <= 0) {
            return;
        }
        this.g = true;
        for (int i2 = 0; i2 < size; i2++) {
        }
    }

    public final ResolveInfo c() {
        synchronized (this.f3533a) {
            try {
                a();
                if (!this.f3534b.isEmpty()) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }
}
