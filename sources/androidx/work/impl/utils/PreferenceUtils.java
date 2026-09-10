package androidx.work.impl.utils;

import androidx.arch.core.util.Function;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase f8808a;

    /* JADX INFO: renamed from: androidx.work.impl.utils.PreferenceUtils$1, reason: invalid class name */
    class AnonymousClass1 implements Function<Long, Long> {
        @Override // androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            Long l2 = (Long) obj;
            return Long.valueOf(l2 != null ? l2.longValue() : 0L);
        }
    }

    public PreferenceUtils(WorkDatabase workDatabase) {
        this.f8808a = workDatabase;
    }
}
