package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.exu.ud.mo;
import com.bytedance.sdk.openadsdk.core.lnr.qdl;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.mml;

/* JADX INFO: loaded from: classes3.dex */
public class PAGVideoMediaView extends PAGMediaView implements qdl.InterfaceC0118qdl {
    private final com.bytedance.sdk.openadsdk.qdl.ud.qdl lnr;
    private ljh mml;
    private mo ud;

    public PAGVideoMediaView(Context context, View view, com.bytedance.sdk.openadsdk.qdl.ud.qdl qdlVar) {
        super(context);
        qdl(view);
        this.lnr = qdlVar;
    }

    private void qdl(View view) {
        if (view instanceof mo) {
            mo moVar = (mo) view;
            this.ud = moVar;
            addView(moVar, -1, -1);
        }
    }

    private boolean ud() {
        mo moVar = this.ud;
        if (moVar != null) {
            return moVar.exu();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void close() {
        mo moVar = this.ud;
        if (moVar != null) {
            moVar.jtx();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.lnr.qdl.InterfaceC0118qdl
    public long getVideoProgress() {
        mo moVar = this.ud;
        if (moVar == null || moVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.ud.getNativeVideoController().mo();
    }

    public void handleInterruptVideo() {
        if (ud()) {
            return;
        }
        qdl();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mml.qdl(this, this.mml);
    }

    public void setMaterialMeta(ljh ljhVar) {
        this.mml = ljhVar;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (onClickListener instanceof qdl) {
            ((qdl) onClickListener).qdl((qdl.InterfaceC0118qdl) this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void setVideoAdListener(final PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.qdl.ud.qdl qdlVar = this.lnr;
        if (qdlVar == null) {
            return;
        }
        qdlVar.qdl(new PAGVideoAdListener() { // from class: com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView.1
            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdComplete() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPaused() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPlay() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoError() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }
        });
    }

    private void qdl() {
        mo moVar = this.ud;
        if (moVar != null) {
            moVar.bjy();
        }
    }
}
