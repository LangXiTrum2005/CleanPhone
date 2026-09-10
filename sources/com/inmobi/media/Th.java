package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Th implements Ma {
    public final /* synthetic */ GestureDetectorOnGestureListenerC2829ci a;
    public final /* synthetic */ Context b;

    public Th(GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci, Context context) {
        this.a = gestureDetectorOnGestureListenerC2829ci;
        this.b = context;
    }

    @Override // com.inmobi.media.Ma
    public final void a() {
        this.a.getListener().a();
    }

    @Override // com.inmobi.media.Ma
    public final void b(String str, String str2, String str3) {
        this.a.b(str, str2, str3);
    }

    @Override // com.inmobi.media.Ma
    public final void a(String str, String message, String str2) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a.a(str, message, str2);
    }

    @Override // com.inmobi.media.Ma
    public final void a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        intent.putExtra("creativeId", this.a.getCreativeId());
        intent.putExtra("impressionId", this.a.getImpressionId());
        intent.putExtra("placementId", this.a.getPlacementId());
        SparseArray sparseArray = InMobiAdActivity.k;
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        InMobiAdActivity.l = gestureDetectorOnGestureListenerC2829ci;
        if (gestureDetectorOnGestureListenerC2829ci.getPlacementType() == 0) {
            Context context = Ji.a;
            Activity context2 = this.a.getBannerHolderActivity().get();
            if (context2 == null) {
                context2 = this.b;
            }
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (!(context2 instanceof Activity)) {
                intent.setFlags(268435456);
            }
            context2.startActivity(intent);
            return;
        }
        Context context3 = Ji.a;
        Context context4 = this.a.getContainerContext();
        Intrinsics.checkNotNullParameter(context4, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!(context4 instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context4.startActivity(intent);
    }

    @Override // com.inmobi.media.Ma
    public final void a(String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ci = this.a;
        if (gestureDetectorOnGestureListenerC2829ci.e) {
            return;
        }
        gestureDetectorOnGestureListenerC2829ci.b(trackerName, macros);
    }
}
