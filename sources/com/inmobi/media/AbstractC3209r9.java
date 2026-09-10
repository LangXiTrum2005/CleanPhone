package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.r9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3209r9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f23958a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23960c;
    public final /* synthetic */ D9 d;

    public AbstractC3209r9(D9 d9) {
        this.d = d9;
    }

    public abstract View a(Context context);

    public void a(View view) {
        Intrinsics.f(view, "view");
        HashMap map = D9.f22775c;
        C3146n9.a(view);
        view.setOnClickListener(null);
        this.f23958a.add(view);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        this.d.f22777a++;
    }

    public final String toString() {
        return "Size:" + this.f23958a.size() + " Miss Count:" + this.f23959b + " Hit Count:" + this.f23960c;
    }

    public void a(View view, C2984d8 asset, AdConfig adConfig) {
        Intrinsics.f(view, "view");
        Intrinsics.f(asset, "asset");
        Intrinsics.f(adConfig, "adConfig");
        view.setVisibility(asset.v);
        view.setOnClickListener(null);
    }
}
