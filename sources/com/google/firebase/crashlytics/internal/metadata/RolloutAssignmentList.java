package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RolloutAssignmentList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20412a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20413b = 128;

    public final synchronized List a() {
        return Collections.unmodifiableList(new ArrayList(this.f20412a));
    }

    public final synchronized boolean b(List list) {
        this.f20412a.clear();
        if (list.size() <= this.f20413b) {
            return this.f20412a.addAll(list);
        }
        Logger.f20289a.f(null, "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f20413b);
        return this.f20412a.addAll(list.subList(0, this.f20413b));
    }
}
