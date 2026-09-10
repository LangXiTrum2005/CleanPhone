package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2974cf extends Xe {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2934a9 f23499e;
    public final InterfaceC3333z5 f;
    public boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2974cf(C2934a9 mNativeVideoAdContainer, InterfaceC3333z5 interfaceC3333z5) {
        super(mNativeVideoAdContainer);
        Intrinsics.f(mNativeVideoAdContainer, "mNativeVideoAdContainer");
        this.f23499e = mNativeVideoAdContainer;
        this.f = interfaceC3333z5;
    }

    @Override // com.inmobi.media.Xe
    public final void a(byte b2) {
    }

    @Override // com.inmobi.media.Xe
    public final void e() {
    }

    @Override // com.inmobi.media.Xe
    public final void a(Map map) {
    }

    @Override // com.inmobi.media.Xe
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        Intrinsics.f(childView, "childView");
        Intrinsics.f(obstructionCode, "obstructionCode");
    }

    @Override // com.inmobi.media.Xe
    public final void a(Context context, byte b2) {
        Intrinsics.f(context, "context");
    }

    @Override // com.inmobi.media.Xe
    public final void a(View childView) {
        Intrinsics.f(childView, "childView");
    }

    @Override // com.inmobi.media.Xe
    public final View a(View view, ViewGroup parent, boolean z2) {
        Context contextJ;
        Intrinsics.f(parent, "parent");
        if (this.g || (contextJ = this.f23499e.j()) == null) {
            return null;
        }
        AdConfig adConfig = this.d;
        C2934a9 c2934a9 = this.f23499e;
        C3177p8 c3177p8 = c2934a9.f23212b;
        Intrinsics.d(c3177p8, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeDataModel");
        C3304x8 c3304x8 = new C3304x8(contextJ, adConfig, c2934a9, c3177p8, this.f);
        this.f23352b = c3304x8;
        this.f23353c = new WeakReference(c3304x8.a(view, parent, false, null));
        C2934a9 c2934a10 = this.f23499e;
        c2934a10.getClass();
        D4.a(new J7(c2934a10, c2934a10), "EndCardBuilderTask");
        return b();
    }

    @Override // com.inmobi.media.Xe
    public final void a() {
        if (this.g) {
            return;
        }
        this.g = true;
        C3304x8 c3304x8 = this.f23352b;
        if (c3304x8 != null) {
            D8 d8 = c3304x8.f24102e;
            d8.f22773n = true;
            d8.f22771i.clear();
            d8.f22774p = null;
            L8 l8 = d8.j;
            if (l8 != null) {
                l8.destroy();
            }
            d8.j = null;
            if (!c3304x8.f24099a) {
                c3304x8.f24099a = true;
            }
        }
        this.f23352b = null;
        super.a();
    }
}
