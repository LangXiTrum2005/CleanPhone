package androidx.media3.extractor.text;

import android.content.ContentResolver;
import android.provider.Settings;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.ts.Ac3Extractor;
import androidx.media3.extractor.ts.Ac4Extractor;
import androidx.media3.extractor.ts.AdtsExtractor;
import androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.media3.extractor.wav.WavExtractor;
import com.applovin.impl.h5;
import com.applovin.impl.k3;
import com.applovin.impl.s3;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.u3;
import com.applovin.impl.y2;
import com.charging.screenshow.battery.animations.themes.activity.MainAct;
import com.charging.screenshow.battery.animations.themes.sp.AppPreferencesUtil;
import com.chartboost.heliumsdk.network.ChartboostMediationNetworking;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function, ExtractorsFactory, androidx.arch.core.util.Function, l.d, s3.b, OnCompleteListener, HttpLoggingInterceptor.Logger, TransportScheduleCallback, ListenerSet.Event {
    public final /* synthetic */ int X;

    public /* synthetic */ a(int i2) {
        this.X = i2;
    }

    @Override // com.applovin.impl.s3.b
    public Object a(Object obj) {
        return u3.a((Long) obj);
    }

    @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        switch (this.X) {
            case 0:
                Ordering ordering = CuesWithTimingSubtitle.Z;
                long j = ((CuesWithTiming) obj).f7205b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 14:
            case 15:
            case 16:
            case 18:
            default:
                return y2.e((h5) obj);
            case 7:
                return k3.a((h5) obj);
            case 8:
                return com.applovin.impl.sdk.ad.b.m((h5) obj);
            case 9:
                return com.applovin.impl.sdk.ad.b.n((h5) obj);
            case 10:
                return com.applovin.impl.sdk.ad.b.r((h5) obj);
            case 11:
                return com.applovin.impl.sdk.ad.b.l((h5) obj);
            case 12:
                return com.applovin.impl.sdk.ad.b.h((h5) obj);
            case 13:
                return com.applovin.impl.sdk.ad.b.q((h5) obj);
            case 17:
                return AppLovinNativeAdImpl.lambda$getCustomTabsSettings$1((h5) obj);
            case 19:
                return y2.f((h5) obj);
            case 20:
                return y2.b((h5) obj);
            case 21:
                return y2.d((h5) obj);
            case 22:
                return y2.g((h5) obj);
        }
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        switch (this.X) {
            case 1:
                return new Extractor[]{new Ac3Extractor()};
            case 2:
                return new Extractor[]{new Ac4Extractor()};
            case 3:
                return new Extractor[]{new AdtsExtractor()};
            case 4:
                return new Extractor[]{new PsExtractor()};
            case 5:
                return new Extractor[]{new TsExtractor(1, SubtitleParser.Factory.f7215a, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(ImmutableList.x()))};
            default:
                return new Extractor[]{new WavExtractor()};
        }
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.X) {
            case 27:
                analyticsListener.getClass();
                break;
            case 28:
                analyticsListener.getClass();
                break;
            default:
                analyticsListener.getClass();
                break;
        }
    }

    @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
    public void log(String str) {
        ChartboostMediationNetworking.defaultInterceptor$lambda$0(str);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        boolean z2 = MainAct.q0;
        Intrinsics.f(task, "<unused var>");
        AppPreferencesUtil.f13313a.b("show_rate_complete", true);
    }

    public /* synthetic */ a(int i2, long j, AnalyticsListener.EventTime eventTime) {
        this.X = 29;
    }

    @Override // com.applovin.impl.sdk.l.d
    public String a(ContentResolver contentResolver, String str) {
        switch (this.X) {
            case 14:
                return Settings.System.getString(contentResolver, str);
            case 15:
                return Settings.Secure.getString(contentResolver, str);
            default:
                return Settings.Global.getString(contentResolver, str);
        }
    }

    public /* synthetic */ a(AnalyticsListener.EventTime eventTime, long j) {
        this.X = 27;
    }

    @Override // com.google.android.datatransport.TransportScheduleCallback
    public void a(Exception exc) {
    }

    public /* synthetic */ a(AnalyticsListener.EventTime eventTime, Exception exc) {
        this.X = 28;
    }
}
