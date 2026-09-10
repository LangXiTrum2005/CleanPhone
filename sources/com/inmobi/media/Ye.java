package com.inmobi.media;

import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class Ye extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f23383a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ye(View view) {
        super(1);
        this.f23383a = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C3117lc it = (C3117lc) obj;
        Intrinsics.f(it, "it");
        it.getViewableAd().a(this.f23383a, FriendlyObstructionPurpose.OTHER);
        return Unit.f43263a;
    }
}
