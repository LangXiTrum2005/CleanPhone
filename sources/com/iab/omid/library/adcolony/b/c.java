package com.iab.omid.library.adcolony.b;

import android.view.View;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.adcolony.e.a f21465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f21467c;
    private final String d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f21465a = new com.iab.omid.library.adcolony.e.a(view);
        this.f21466b = view.getClass().getCanonicalName();
        this.f21467c = friendlyObstructionPurpose;
        this.d = str;
    }

    public com.iab.omid.library.adcolony.e.a a() {
        return this.f21465a;
    }

    public String b() {
        return this.f21466b;
    }

    public FriendlyObstructionPurpose c() {
        return this.f21467c;
    }

    public String d() {
        return this.d;
    }
}
