package androidx.work.impl.model;

import androidx.work.Data;
import androidx.work.WorkInfo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface WorkSpecDao {
    void a(String str);

    int b(WorkInfo.State state, String... strArr);

    int c(long j, String str);

    ArrayList d(long j);

    void e(WorkSpec workSpec);

    void f(long j, String str);

    ArrayList g();

    WorkInfo.State h(String str);

    WorkSpec i(String str);

    ArrayList j(String str);

    int k();

    ArrayList l();

    ArrayList m();

    ArrayList n();

    ArrayList o(int i2);

    ArrayList p();

    void q(String str, Data data);

    ArrayList r();

    boolean s();

    int t(String str);

    int u(String str);
}
