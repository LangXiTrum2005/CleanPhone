package androidx.work.impl;

import androidx.work.Logger;
import androidx.work.WorkContinuation;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class WorkContinuationImpl extends WorkContinuation {
    public static final String g = Logger.e("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkManagerImpl f8665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f8667c;
    public final ArrayList d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8668e;
    public OperationImpl f;

    public WorkContinuationImpl(WorkManagerImpl workManagerImpl, List list) {
        this.f8665a = workManagerImpl;
        this.f8666b = list;
        this.f8667c = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            String string = ((WorkRequest) list.get(i2)).f8644a.toString();
            this.f8667c.add(string);
            this.d.add(string);
        }
    }

    public static HashSet a(WorkContinuationImpl workContinuationImpl) {
        HashSet hashSet = new HashSet();
        workContinuationImpl.getClass();
        return hashSet;
    }
}
