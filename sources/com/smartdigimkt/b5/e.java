package com.smartdigimkt.b5;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.smartdigimkt.sdk.api.business.express.IExpressComponent;
import com.smartdigimkt.sdk.api.format.SDMNativeAdMediaViewListener;
import com.smartdigimkt.w6.l;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class e extends d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    IExpressComponent f33962p;

    public e(Context context, l lVar, com.smartdigimkt.v6.a aVar, IExpressComponent iExpressComponent, boolean z2) {
        super(context, lVar, aVar, z2);
        this.f33962p = iExpressComponent;
        if (iExpressComponent != null) {
            iExpressComponent.registerNativeTemplateListener();
        }
        this.f33959i = this.f33962p.getAdType();
    }

    @Override // com.smartdigimkt.b5.d, com.smartdigimkt.y4.a
    public void a(int i2, int i3) {
        int i4;
        super.a(i2, i3);
        if (this.k == -2 && (i4 = this.j) > 0) {
            this.k = (int) ((i4 * 3.0f) / 4.0f);
        }
        IExpressComponent iExpressComponent = this.f33962p;
        if (iExpressComponent != null) {
            iExpressComponent.setLogoSizeHAndW(i3, i2);
        }
    }

    @Override // com.smartdigimkt.b5.d
    public View b() {
        return this.f33962p.getMBOutNativeAdvancedViewGroup();
    }

    @Override // com.smartdigimkt.b5.d, com.smartdigimkt.y4.a
    public void destroy() {
        super.destroy();
        try {
            IExpressComponent iExpressComponent = this.f33962p;
            if (iExpressComponent != null) {
                iExpressComponent.destroy();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.y4.a
    public ViewGroup getCustomAdContainer() {
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.smartdigimkt.y4.a
    public View getMediaView(Context context, SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener) {
        IExpressComponent iExpressComponent = this.f33962p;
        if (iExpressComponent == null) {
            return null;
        }
        iExpressComponent.setCloseBtnSateFromOut(this.f33961n ? 1 : 0);
        return this.f33962p.getMBOutNativeAdvancedViewGroup();
    }

    @Override // com.smartdigimkt.b5.d, com.smartdigimkt.y4.a
    public boolean isTemplateAd() {
        return true;
    }

    @Override // com.smartdigimkt.b5.d, com.smartdigimkt.y4.a
    public void onPause() {
        super.onPause();
        IExpressComponent iExpressComponent = this.f33962p;
        if (iExpressComponent != null) {
            iExpressComponent.setPauseState(3);
        }
    }

    @Override // com.smartdigimkt.b5.d, com.smartdigimkt.y4.a
    public void onResume() {
        super.onResume();
        IExpressComponent iExpressComponent = this.f33962p;
        if (iExpressComponent != null) {
            iExpressComponent.setResumeState(3);
        }
    }

    @Override // com.smartdigimkt.y4.a
    public void registerAdView(View view, List<View> list, List<View> list2, FrameLayout.LayoutParams layoutParams, View view2) {
    }

    @Override // com.smartdigimkt.b5.d, com.smartdigimkt.y4.a
    public void setAutoPlay(String str) {
        super.setAutoPlay(str);
        if (this.f33962p != null) {
            if (TextUtils.isEmpty(this.f33958h)) {
                this.f33962p.setPlayModeFromOut(3);
                return;
            }
            String str2 = this.f33958h;
            str2.getClass();
            switch (str2) {
                case "1":
                    this.f33962p.setPlayModeFromOut(3);
                    break;
                case "2":
                    this.f33962p.setPlayModeFromOut(1);
                    break;
                case "3":
                    this.f33962p.setPlayModeFromOut(2);
                    break;
            }
        }
    }

    @Override // com.smartdigimkt.b5.d, com.smartdigimkt.y4.a
    public void setMute(boolean z2) {
        super.setMute(z2);
        IExpressComponent iExpressComponent = this.f33962p;
        if (iExpressComponent != null) {
            iExpressComponent.setMuteStateFromOut(z2 ? 1 : 2);
        }
    }

    @Override // com.smartdigimkt.b5.d, com.smartdigimkt.y4.a
    public void a(com.smartdigimkt.f5.a aVar) {
        super.a(aVar);
        IExpressComponent iExpressComponent = this.f33962p;
        if (iExpressComponent != null) {
            iExpressComponent.setListener(aVar);
        }
    }
}
