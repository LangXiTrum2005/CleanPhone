package com.iab.omid.library.ironsrc.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.weakreference.a f25245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f25247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25248d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f25245a = new com.iab.omid.library.ironsrc.weakreference.a(view);
        this.f25246b = view.getClass().getCanonicalName();
        this.f25247c = friendlyObstructionPurpose;
        this.f25248d = str;
    }

    public String a() {
        return this.f25248d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f25247c;
    }

    public com.iab.omid.library.ironsrc.weakreference.a c() {
        return this.f25245a;
    }

    public String d() {
        return this.f25246b;
    }
}
