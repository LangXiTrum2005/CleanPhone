package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Clock;

/* JADX INFO: loaded from: classes3.dex */
class CreationContextFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clock f16861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clock f16862c;

    public CreationContextFactory(Context context, Clock clock, Clock clock2) {
        this.f16860a = context;
        this.f16861b = clock;
        this.f16862c = clock2;
    }
}
