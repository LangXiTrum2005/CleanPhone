package com.iab.omid.library.chartboost.internal;

import android.view.View;
import com.iab.omid.library.chartboost.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.chartboost.weakreference.a f21851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f21853c;
    private final String d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f21851a = new com.iab.omid.library.chartboost.weakreference.a(view);
        this.f21852b = view.getClass().getCanonicalName();
        this.f21853c = friendlyObstructionPurpose;
        this.d = str;
    }

    public String a() {
        return this.d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f21853c;
    }

    public com.iab.omid.library.chartboost.weakreference.a c() {
        return this.f21851a;
    }

    public String d() {
        return this.f21852b;
    }
}
