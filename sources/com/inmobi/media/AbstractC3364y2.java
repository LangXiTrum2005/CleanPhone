package com.inmobi.media;

import android.content.Context;
import android.webkit.WebView;
import com.inmobi.media.AbstractC3364y2;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3364y2 extends WebView {
    public final taiyuan a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3364y2(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = saneness.saneness(new Function0() { // from class: adsuki.digress
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC3364y2.a(this.f3411kowloon);
            }
        });
    }

    public static final Ua a(AbstractC3364y2 abstractC3364y2) {
        return abstractC3364y2.d();
    }

    public abstract Ua d();

    public final Ua getLandingPageHandler() {
        return (Ua) this.a.getValue();
    }
}
