package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Xe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3295x f23351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3304x8 f23352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f23353c;
    public final AdConfig d;

    public Xe(InterfaceC3295x container) {
        Intrinsics.f(container, "container");
        this.f23351a = container;
        this.d = container.getAdConfig();
    }

    public abstract View a(View view, ViewGroup viewGroup, boolean z2);

    public void a() {
        WeakReference weakReference = this.f23353c;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    public abstract void a(byte b2);

    public abstract void a(Context context, byte b2);

    public abstract void a(View view);

    public abstract void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose);

    public abstract void a(Map map);

    public View b() {
        WeakReference weakReference = this.f23353c;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public C3304x8 c() {
        return this.f23352b;
    }

    public View d() {
        return null;
    }

    public abstract void e();
}
