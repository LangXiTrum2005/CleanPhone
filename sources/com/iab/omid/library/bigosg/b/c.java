package com.iab.omid.library.bigosg.b;

import android.view.View;
import com.iab.omid.library.bigosg.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.bigosg.e.a f21658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f21660c;
    private final String d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f21658a = new com.iab.omid.library.bigosg.e.a(view);
        this.f21659b = view.getClass().getCanonicalName();
        this.f21660c = friendlyObstructionPurpose;
        this.d = str;
    }

    public com.iab.omid.library.bigosg.e.a a() {
        return this.f21658a;
    }

    public String b() {
        return this.f21659b;
    }

    public FriendlyObstructionPurpose c() {
        return this.f21660c;
    }

    public String d() {
        return this.d;
    }
}
