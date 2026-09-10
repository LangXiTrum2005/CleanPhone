package com.iab.omid.library.vungle.internal;

import android.view.View;
import com.iab.omid.library.vungle.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.vungle.weakreference.a f22547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f22549c;
    private final String d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f22547a = new com.iab.omid.library.vungle.weakreference.a(view);
        this.f22548b = view.getClass().getCanonicalName();
        this.f22549c = friendlyObstructionPurpose;
        this.d = str;
    }

    public String a() {
        return this.d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f22549c;
    }

    public com.iab.omid.library.vungle.weakreference.a c() {
        return this.f22547a;
    }

    public String d() {
        return this.f22548b;
    }
}
