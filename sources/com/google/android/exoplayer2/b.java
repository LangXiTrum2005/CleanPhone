package com.google.android.exoplayer2;

import android.content.Context;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSource;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Supplier {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Context f17416Y;

    public /* synthetic */ b(Context context, int i2) {
        this.X = i2;
        this.f17416Y = context;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        DefaultBandwidthMeter defaultBandwidthMeter;
        switch (this.X) {
            case 0:
                return new DefaultRenderersFactory(this.f17416Y);
            case 1:
                return new DefaultMediaSourceFactory(new DefaultDataSource.Factory(this.f17416Y), new DefaultExtractorsFactory());
            case 2:
                return new DefaultTrackSelector(this.f17416Y);
            default:
                Context context = this.f17416Y;
                ImmutableList immutableList = DefaultBandwidthMeter.f18758n;
                synchronized (DefaultBandwidthMeter.class) {
                    try {
                        if (DefaultBandwidthMeter.t == null) {
                            DefaultBandwidthMeter.Builder builder = new DefaultBandwidthMeter.Builder(context);
                            DefaultBandwidthMeter.t = new DefaultBandwidthMeter(builder.f18767a, builder.f18768b, builder.f18769c, builder.d, builder.f18770e);
                        }
                        defaultBandwidthMeter = DefaultBandwidthMeter.t;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return defaultBandwidthMeter;
        }
    }
}
