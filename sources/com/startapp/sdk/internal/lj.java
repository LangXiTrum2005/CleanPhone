package com.startapp.sdk.internal;

import android.text.TextUtils;
import com.startapp.sdk.ads.video.tracking.VideoTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class lj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VideoTrackingLink[] f41226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VideoTrackingParams f41227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41228c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public VASTErrorCodes f41229e;

    public lj(int i2, VideoTrackingParams videoTrackingParams, String str, VideoTrackingLink[] videoTrackingLinkArr) {
        this.f41226a = videoTrackingLinkArr;
        this.f41227b = videoTrackingParams;
        this.f41228c = str;
        this.d = i2;
    }

    public final kj a() {
        if (this.f41226a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (VideoTrackingLink videoTrackingLink : this.f41226a) {
            if (videoTrackingLink.c() != null && (this.f41227b.b() <= 0 || videoTrackingLink.f())) {
                String strC = videoTrackingLink.c();
                String str = this.f41228c;
                String strReplace = strC.replace("[ASSETURI]", str != null ? TextUtils.htmlEncode(str) : "");
                int i2 = this.d;
                long jConvert = TimeUnit.SECONDS.convert(i2, TimeUnit.MILLISECONDS);
                long j = jConvert % 60;
                long j2 = jConvert / com.smartdigimkt.o1.b.f37307P;
                long j3 = (jConvert % com.smartdigimkt.o1.b.f37307P) / 60;
                long j4 = i2 % 1000;
                Locale locale = Locale.US;
                String strReplace2 = strReplace.replace("[CONTENTPLAYHEAD]", TextUtils.htmlEncode(String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j), Long.valueOf(j4)))).replace("[CACHEBUSTING]", TextUtils.htmlEncode(String.valueOf(new SecureRandom().nextInt(90000000) + 10000000)));
                String str2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", locale).format(new Date());
                int length = str2.length() - 2;
                String strReplace3 = strReplace2.replace("[TIMESTAMP]", TextUtils.htmlEncode(str2.substring(0, length) + ":" + str2.substring(length)));
                VASTErrorCodes vASTErrorCodes = this.f41229e;
                if (vASTErrorCodes != null) {
                    strReplace3 = strReplace3.replace("[ERRORCODE]", String.valueOf(vASTErrorCodes.a()));
                }
                StringBuilder sb = new StringBuilder(strReplace3);
                VideoTrackingLink.TrackingSource trackingSourceB = videoTrackingLink.b();
                if (trackingSourceB == null) {
                    trackingSourceB = vi.d(videoTrackingLink.c()) ? VideoTrackingLink.TrackingSource.STARTAPP : VideoTrackingLink.TrackingSource.EXTERNAL;
                }
                VideoTrackingParams videoTrackingParamsC = this.f41227b.b(trackingSourceB == VideoTrackingLink.TrackingSource.STARTAPP).c(videoTrackingLink.f()).c(videoTrackingLink.a());
                sb.append(videoTrackingParamsC.e());
                if (videoTrackingParamsC.g()) {
                    sb.append(AbstractC3396g.a(AbstractC3396g.c(h0.a(videoTrackingLink.c(), (String) null))));
                }
                arrayList.add(sb.toString());
            }
        }
        return new kj(arrayList);
    }
}
