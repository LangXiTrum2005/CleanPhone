package com.bumptech.glide.manager;

import android.support.v4.media.a;
import com.bumptech.glide.request.Request;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class RequestTracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f12755a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f12756b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12757c;

    public final boolean a(Request request) {
        boolean z2 = true;
        if (request == null) {
            return true;
        }
        boolean zRemove = this.f12755a.remove(request);
        if (!this.f12756b.remove(request) && !zRemove) {
            z2 = false;
        }
        if (z2) {
            request.clear();
        }
        return z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.f12755a.size());
        sb.append(", isPaused=");
        return a.t(sb, this.f12757c, "}");
    }
}
