package com.iab.omid.library.inmobi.internal;

import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.weakreference.a f21952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f21954c;
    private final String d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f21952a = new com.iab.omid.library.inmobi.weakreference.a(view);
        this.f21953b = view.getClass().getCanonicalName();
        this.f21954c = friendlyObstructionPurpose;
        this.d = str;
    }

    public String a() {
        return this.d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f21954c;
    }

    public com.iab.omid.library.inmobi.weakreference.a c() {
        return this.f21952a;
    }

    public String d() {
        return this.f21953b;
    }
}
