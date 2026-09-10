package com.smartdigimkt.b5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.smartdigimkt.sdk.api.format.SDMNativeAdMediaViewListener;
import com.smartdigimkt.sdk.basead.ui.BaseMediaATView;
import com.smartdigimkt.sdk.basead.ui.MediaATView;
import com.smartdigimkt.sdk.basead.ui.MraidMediaView;
import com.smartdigimkt.sdk.basead.ui.OwnNativeATView;
import com.smartdigimkt.w6.l;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public class c extends com.smartdigimkt.b5.a {
    BaseMediaATView H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    List<View> f33950I;

    public class a extends AbstractC0445c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SDMNativeAdMediaViewListener f33951a;

        public a(SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener) {
            this.f33951a = sDMNativeAdMediaViewListener;
        }

        @Override // com.smartdigimkt.b5.c.AbstractC0445c
        public void a() {
            com.smartdigimkt.f5.a aVar = c.this.f;
            if (aVar != null) {
                aVar.onAdClosed();
            }
        }

        @Override // com.smartdigimkt.sdk.api.format.SDMNativeAdMediaViewListener
        public void onProgressUpdate(long j, long j2) {
            SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener = this.f33951a;
            if (sDMNativeAdMediaViewListener != null) {
                sDMNativeAdMediaViewListener.onProgressUpdate(j, j2);
            }
        }

        @Override // com.smartdigimkt.sdk.api.format.SDMNativeAdMediaViewListener
        public void onVideoAdComplete() {
            SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener = this.f33951a;
            if (sDMNativeAdMediaViewListener != null) {
                sDMNativeAdMediaViewListener.onVideoAdComplete();
            }
        }

        @Override // com.smartdigimkt.sdk.api.format.SDMNativeAdMediaViewListener
        public void onVideoAdStartPlay(long j) {
            SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener = this.f33951a;
            if (sDMNativeAdMediaViewListener != null) {
                sDMNativeAdMediaViewListener.onVideoAdStartPlay(j);
            }
        }

        @Override // com.smartdigimkt.sdk.api.format.SDMNativeAdMediaViewListener
        public void onVideoError(String str, String str2) {
            SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener = this.f33951a;
            if (sDMNativeAdMediaViewListener != null) {
                sDMNativeAdMediaViewListener.onVideoError(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.b5.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0445c implements SDMNativeAdMediaViewListener {
        public abstract void a();
    }

    public c(Context context, l lVar, com.smartdigimkt.v6.a aVar, boolean z2) {
        super(context, lVar, aVar, z2);
    }

    private int i() {
        int iZ0 = this.d.t.z0();
        if (iZ0 > 0) {
            return iZ0;
        }
        JSONArray jSONArray = this.f33960l;
        if (jSONArray == null) {
            return 6;
        }
        try {
            int iOptInt = this.f33960l.optInt(new Random().nextInt(jSONArray.length()));
            if (iOptInt <= 0) {
                return 6;
            }
            this.f33960l.toString();
            return iOptInt;
        } catch (Throwable unused) {
            return 6;
        }
    }

    @Override // com.smartdigimkt.b5.a, com.smartdigimkt.b5.d
    public View b() {
        return this.f33956c.v0() ? this.H : super.b();
    }

    @Override // com.smartdigimkt.b5.a
    public void c() {
        BaseMediaATView baseMediaATView = this.H;
        if (baseMediaATView != null) {
            baseMediaATView.changeCloseViewSizeAfterClick();
        }
    }

    @Override // com.smartdigimkt.b5.a
    public View d() {
        OwnNativeATView ownNativeATView = this.s;
        BaseMediaATView baseMediaATView = this.H;
        if (baseMediaATView == null || baseMediaATView.getMonitorClickView() == null) {
            return ownNativeATView;
        }
        View monitorClickView = this.H.getMonitorClickView();
        this.t = new WeakReference<>(monitorClickView);
        return monitorClickView;
    }

    @Override // com.smartdigimkt.b5.a, com.smartdigimkt.b5.d, com.smartdigimkt.y4.a
    public void destroy() {
        super.destroy();
        BaseMediaATView baseMediaATView = this.H;
        if (baseMediaATView != null) {
            baseMediaATView.destroy();
        }
    }

    @Override // com.smartdigimkt.b5.a
    public List<View> f() {
        return this.f33950I;
    }

    @Override // com.smartdigimkt.y4.a
    public ViewGroup getCustomAdContainer() {
        return null;
    }

    @Override // com.smartdigimkt.y4.a
    public View getMediaView(Context context, SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener) {
        if (!isTemplateAd()) {
            return null;
        }
        if (this.s == null) {
            this.s = e();
        }
        a aVar = new a(sDMNativeAdMediaViewListener);
        l lVar = this.f33956c;
        if (lVar == null || !lVar.v0()) {
            this.H = new MediaATView(context, this.f33956c, this.d, aVar);
        } else {
            MraidMediaView mraidMediaView = new MraidMediaView(context, this.f33956c, this.d, aVar, this.f33933E);
            this.H = mraidMediaView;
            mraidMediaView.setMraidWebViewListener(new b());
        }
        int i2 = i();
        this.d.t.f0(i2);
        this.H.init(this.j, this.k, i2);
        ViewParent viewParent = this.H;
        if (viewParent instanceof com.smartdigimkt.l5.a) {
            a((com.smartdigimkt.l5.a) viewParent, sDMNativeAdMediaViewListener);
        }
        this.s.addView(this.H, new FrameLayout.LayoutParams(this.H.getMediaViewWidth(), this.H.getMediaViewHeight()));
        this.f33950I = this.H.getContainerClickViews();
        registerAdView(this.s, this.H.getClickViews(), null, null, null);
        return this.s;
    }

    @Override // com.smartdigimkt.b5.a
    public void h() {
        super.h();
        if (this.g && this.f33956c.v0()) {
            BaseMediaATView baseMediaATView = this.H;
            if (baseMediaATView instanceof MraidMediaView) {
                ((MraidMediaView) baseMediaATView).fireAudioVolumeChange(this.g);
            }
        }
    }

    public class b implements MraidMediaView.b {
        public b() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.MraidMediaView.b
        public void a(String str) {
            l lVar = c.this.f33956c;
            if (lVar != null) {
                lVar.h(str);
            }
            c cVar = c.this;
            cVar.a(cVar.H, 1, 13);
        }

        @Override // com.smartdigimkt.sdk.basead.ui.MraidMediaView.b
        public void a() {
            c cVar = c.this;
            OwnNativeATView ownNativeATView = cVar.s;
            if (ownNativeATView != null) {
                cVar.a(ownNativeATView);
            }
        }
    }
}
