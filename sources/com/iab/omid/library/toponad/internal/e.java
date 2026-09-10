package com.iab.omid.library.toponad.internal;

import android.view.View;
import com.iab.omid.library.toponad.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.toponad.weakreference.a f22348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f22350c;
    private final String d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f22348a = new com.iab.omid.library.toponad.weakreference.a(view);
        this.f22349b = view.getClass().getCanonicalName();
        this.f22350c = friendlyObstructionPurpose;
        this.d = str;
    }

    public String a() {
        return this.d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f22350c;
    }

    public com.iab.omid.library.toponad.weakreference.a c() {
        return this.f22348a;
    }

    public String d() {
        return this.f22349b;
    }
}
