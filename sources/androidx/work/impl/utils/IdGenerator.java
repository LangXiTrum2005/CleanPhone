package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;

/* JADX INFO: loaded from: classes.dex */
public class IdGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase f8806a;

    public IdGenerator(WorkDatabase workDatabase) {
        this.f8806a = workDatabase;
    }

    public final int a(String str) {
        WorkDatabase workDatabase = this.f8806a;
        workDatabase.c();
        try {
            Long lB = workDatabase.o().b(str);
            int i2 = 0;
            int iIntValue = lB != null ? lB.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i2 = iIntValue + 1;
            }
            workDatabase.o().a(new Preference(str, i2));
            workDatabase.l();
            return iIntValue;
        } finally {
            workDatabase.f();
        }
    }
}
