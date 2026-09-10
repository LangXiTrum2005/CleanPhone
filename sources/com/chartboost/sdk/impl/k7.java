package com.chartboost.sdk.impl;

import android.content.Context;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f14332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f14333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f14334c;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h7 f14335b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h7 h7Var) {
            super(0);
            this.f14335b = h7Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediaSource.Factory invoke() {
            return w5.a(this.f14335b.c());
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f14336b = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadControl invoke() {
            return w5.a(0, 0, 3, (Object) null);
        }
    }

    public k7(Context context, h7 downloadManager, Function0 mediaSourceFactory, Function0 loadControlFactory) {
        Intrinsics.f(context, "context");
        Intrinsics.f(downloadManager, "downloadManager");
        Intrinsics.f(mediaSourceFactory, "mediaSourceFactory");
        Intrinsics.f(loadControlFactory, "loadControlFactory");
        this.f14332a = mediaSourceFactory;
        this.f14333b = loadControlFactory;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.e(applicationContext, "getApplicationContext(...)");
        this.f14334c = applicationContext;
    }

    public final ExoPlayer a() {
        ExoPlayer.Builder builder = new ExoPlayer.Builder(this.f14334c);
        MediaSource.Factory factory = (MediaSource.Factory) this.f14332a.invoke();
        Assertions.d(!builder.q);
        factory.getClass();
        builder.d = new com.google.android.exoplayer2.o(factory, 2);
        LoadControl loadControl = (LoadControl) this.f14333b.invoke();
        Assertions.d(!builder.q);
        loadControl.getClass();
        builder.f = new com.google.android.exoplayer2.o(loadControl, 1);
        return builder.a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ k7(Context context, h7 h7Var, Function0 function0, Function0 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        h7Var = (i2 & 2) != 0 ? w3.f15454b.a().d() : h7Var;
        this(context, h7Var, (i2 & 4) != 0 ? new a(h7Var) : function0, (i2 & 8) != 0 ? b.f14336b : function1);
    }
}
