package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.weakreference.a f21751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f21753c;
    private final String d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f21751a = new com.iab.omid.library.bytedance2.weakreference.a(view);
        this.f21752b = view.getClass().getCanonicalName();
        this.f21753c = friendlyObstructionPurpose;
        this.d = str;
    }

    public String a() {
        return this.d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f21753c;
    }

    public com.iab.omid.library.bytedance2.weakreference.a c() {
        return this.f21751a;
    }

    public String d() {
        return this.f21752b;
    }
}
