package com.iab.omid.library.startio.internal;

import android.view.View;
import com.iab.omid.library.startio.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.startio.weakreference.a f22252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f22254c;
    private final String d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f22252a = new com.iab.omid.library.startio.weakreference.a(view);
        this.f22253b = view.getClass().getCanonicalName();
        this.f22254c = friendlyObstructionPurpose;
        this.d = str;
    }

    public String a() {
        return this.d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f22254c;
    }

    public com.iab.omid.library.startio.weakreference.a c() {
        return this.f22252a;
    }

    public String d() {
        return this.f22253b;
    }
}
