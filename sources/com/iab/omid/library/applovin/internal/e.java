package com.iab.omid.library.applovin.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.applovin.weakreference.a f25111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f25113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25114d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f25111a = new com.iab.omid.library.applovin.weakreference.a(view);
        this.f25112b = view.getClass().getCanonicalName();
        this.f25113c = friendlyObstructionPurpose;
        this.f25114d = str;
    }

    public String a() {
        return this.f25114d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f25113c;
    }

    public com.iab.omid.library.applovin.weakreference.a c() {
        return this.f25111a;
    }

    public String d() {
        return this.f25112b;
    }
}
