package com.iab.omid.library.unity3d.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.unity3d.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.unity3d.weakreference.a f25513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f25515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25516d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f25513a = new com.iab.omid.library.unity3d.weakreference.a(view);
        this.f25514b = view.getClass().getCanonicalName();
        this.f25515c = friendlyObstructionPurpose;
        this.f25516d = str;
    }

    public String a() {
        return this.f25516d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f25515c;
    }

    public com.iab.omid.library.unity3d.weakreference.a c() {
        return this.f25513a;
    }

    public String d() {
        return this.f25514b;
    }
}
