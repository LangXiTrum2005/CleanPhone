package com.iab.omid.library.mmadbridge.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.weakreference.a f25379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f25381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25382d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f25379a = new com.iab.omid.library.mmadbridge.weakreference.a(view);
        this.f25380b = view.getClass().getCanonicalName();
        this.f25381c = friendlyObstructionPurpose;
        this.f25382d = str;
    }

    public String a() {
        return this.f25382d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f25381c;
    }

    public com.iab.omid.library.mmadbridge.weakreference.a c() {
        return this.f25379a;
    }

    public String d() {
        return this.f25380b;
    }
}
