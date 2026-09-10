package com.inmobi.media;

import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import kotlinx.coroutines.flow.apical;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.bn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2808bn {
    public final saran a;
    public final RelativeLayout b;
    public final Fg c;
    public final apical d;
    public ProgressBar e;
    public monroe f;

    public C2808bn(saran coroutineScope, RelativeLayout experienceLayout, Fg progressConfig, apical mediaPlayerFlow) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(experienceLayout, "experienceLayout");
        Intrinsics.checkNotNullParameter(progressConfig, "progressConfig");
        Intrinsics.checkNotNullParameter(mediaPlayerFlow, "mediaPlayerFlow");
        this.a = coroutineScope;
        this.b = experienceLayout;
        this.c = progressConfig;
        this.d = mediaPlayerFlow;
    }
}
