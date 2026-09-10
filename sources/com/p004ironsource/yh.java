package com.p004ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.sdk.utils.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/ironsource/yh;", "Landroid/widget/FrameLayout;", "Lcom/ironsource/zw;", "a", "Landroid/view/View;", "changedView", "", "visibility", "", "onVisibilityChanged", "onWindowVisibilityChanged", "", "Ljava/lang/String;", "logTag", "Lcom/ironsource/yh$a;", "b", "Lcom/ironsource/yh$a;", "getListener$mediationsdk_release", "()Lcom/ironsource/yh$a;", "setListener$mediationsdk_release", "(Lcom/ironsource/yh$a;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class yh extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private a listener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/ironsource/yh$a;", "", "Lcom/ironsource/zw;", "viewVisibilityParams", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(zw viewVisibilityParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh(Context context) {
        super(context);
        Intrinsics.f(context, "context");
        this.logTag = "ISNNativeAdContainer";
    }

    private final zw a() {
        return new zw(getVisibility() == 0, getWindowVisibility() == 0, isShown());
    }

    /* JADX INFO: renamed from: getListener$mediationsdk_release, reason: from getter */
    public final a getListener() {
        return this.listener;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int visibility) {
        Intrinsics.f(changedView, "changedView");
        Logger.i(this.logTag, "onVisibilityChanged: " + visibility);
        a aVar = this.listener;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        Logger.i(this.logTag, "onWindowVisibilityChanged: " + visibility);
        a aVar = this.listener;
        if (aVar != null) {
            aVar.a(a());
        }
    }

    public final void setListener$mediationsdk_release(a aVar) {
        this.listener = aVar;
    }
}
