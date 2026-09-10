package com.mbridge.msdk.preload.listenter;

import com.mbridge.msdk.out.PreloadListener;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements PreloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    WeakReference<PreloadListener> f35146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35147b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35148c = false;

    public a(PreloadListener preloadListener) {
        if (preloadListener != null) {
            this.f35146a = new WeakReference<>(preloadListener);
        }
    }

    public boolean a() {
        return this.f35148c;
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadFaild(String str) {
        WeakReference<PreloadListener> weakReference = this.f35146a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f35146a.get().onPreloadFaild(str);
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadSucceed() {
        WeakReference<PreloadListener> weakReference = this.f35146a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f35146a.get().onPreloadSucceed();
    }

    public void a(boolean z10) {
        this.f35148c = z10;
    }
}
